# 命令模式

定义：

Encapsulate a request as an object,thereby letting you parameterize clients with different requests,
queue or log requests,and support undoable operations.

将一个请求封装为一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销与恢复功能

优点：

- 更松散的耦合：命令模式使得发起命令的对象-客户端和具体实现命令的对象-接收者对象完全解耦，也就是说发起命令的对象完全不知
道具体实现对象是谁，也不知道如何实现
- 更动态的控制：命令模式把调用请求封装起来，可以动态的对它进行参数话，队列话和日志化等操作，从而使得系统更灵活
- 很自然的复合命令：命令模式中的命令对象能够很容易地组合成符合命令，也就是宏命令，从而使系统操作更简单，功能更强大
- 更好的扩展性：扩展新的命令很简单，已有的实现完全不用改变