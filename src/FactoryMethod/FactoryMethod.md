# 工厂方法模式
定义：
Define an interface for creating an object,but let subclasses decide which class to instantiate.Factory Method lets a class defer instantiation to subclasses.

优点：
- 良好的封装性，代码结构清晰;不需要知道创建对象的艰辛过程
- 扩展优秀，在增加产品类时，不需要对原有代码做修改
- 屏蔽产品类，只要产品接口不做任何变化，那上层调用模块也不需要做任何变化

使用场景：
- 在任何new的地方都可以使用，但需要考虑清楚，是否需要使用工厂方法来增加代码复杂度
- 需要灵活可扩展的框架时，可以考虑采用工厂方法模式
- 用在异构项目中

扩展：
- 缩小为简单工厂
- 升级为多个工厂类
- 替代单例模式
- 延迟初始化：在工厂类中设置缓存容器