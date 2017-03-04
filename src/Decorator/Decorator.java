package Decorator;


/**
 * Created by sujinzhou on 17-2-26.
 */
public abstract class Decorator  extends Component{
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
