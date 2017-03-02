# 责任链模式
定义：

Avoid coupling the sender of a request to its receiver by giving more than object a chance to handle
the request.Chain the receiving Objects and pass the request along the chain until an object handles it.

使每个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，
直到有对象处理它为止。

优点：

将请求和处理分开，两者解耦，可以提高系统的灵活性

缺点：

- 性能问题，需要从头遍历整条责任链
- 调试问题，调试很困难