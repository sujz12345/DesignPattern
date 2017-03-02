package Decorator;

/**
 * Created by sujinzhou on 17-2-26.
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("装饰基本类");
        this.component.operation();
    }
}
