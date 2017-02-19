# 抽象工厂模式
定义：

Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

优点：
- 封装性：，每个产品的实现类不是高层模块要关心的，它要关心的是什么？是接口，是抽象，它不关心对象是如何创建出来，这由谁负责呢？工厂类，只要知道工厂类是谁，我就能创建出一个需要的对象，省时省力，优秀设计就应该如此
- 产品族内的约束为非公开状态。如产品A和产品B之间存在数量上1:1的约束，这样的生产过程对调用工厂类的高层模块来说是透明的，它不需要知道这个约束，我就是要一个产品A就可以了，具体的产品族内的约束是在工厂内实现的。

缺点：
- 产品族扩展困难，如果要新增加一个产品C，那需要修改AbstractFactory,增加一个方法createProductC,同时需要修改所有的AbstractFactory的实现类。这违反了开闭原则。

使用场景：
一个对象族（或是一组没有任何关系的对象）都有相同的约束，则可以使用抽象工厂模式