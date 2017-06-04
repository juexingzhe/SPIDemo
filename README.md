# SPIDemo
Java提供的SPI全名就是Service Provider Interface,下面是一段官方的解释,，***其实就是为某个接口寻找服务的机制，有点类似IOC的思想，将装配的控制权移交给ServiceLoader***。SPI在平时我们用到的会比较少，但是在Android模块开发中就会比较有用，不同的模块可以基于接口编程，每个模块有不同的实现service provider,然后通过SPI机制自动注册到一个配置文件中，就可以实现在程序运行时扫描加载同一接口的不同service provider。这样模块之间不会基于实现类硬编码，可插拔。
```
* <p> A <i>service</i> is a well-known set of interfaces and (usually
* abstract) classes.  A <i>service provider</i> is a specific implementation
* of a service.  The classes in a provider typically implement the interfaces
* and subclass the classes defined in the service itself. 

* <p> For the purpose of loading, a service is represented by a single type,
* that is, a single interface or abstract class.  (A concrete class can be
* used, but this is not recommended.)  A provider of a given service contains
* one or more concrete classes that extend this <i>service type</i> with data
* and code specific to the provider. 
```
详情请参见：http://www.jianshu.com/p/deeb39ccdc53
