package com.example.juexingzhe.spidemo;

import com.example.Display;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by juexingzhe on 2017/6/3.
 */

class DisplayFactory {

    private static DisplayFactory mDisplayFactory;

    private Iterator<Display> mIterator;

    private DisplayFactory() {
        ServiceLoader<Display> loader = ServiceLoader.load(Display.class);
        mIterator = loader.iterator();
    }

    static DisplayFactory getSingleton() {
        if (null == mDisplayFactory) {
            synchronized (DisplayFactory.class) {
                if (null == mDisplayFactory) {
                    mDisplayFactory = new DisplayFactory();
                }
            }
        }
        return mDisplayFactory;
    }

    Display getDisplay() {
        return mIterator.next();
    }

    boolean hasNextDisplay() {
        return mIterator.hasNext();
    }

}
