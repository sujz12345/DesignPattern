package Proxy.DynamicProxy;

/**
 * Created by sujinzhou on 2017/2/22.
 */
public class GamePlayer implements IGamePlayer{
    private String name = "";
    @Override
    public void login(String user, String password) {

    }

    @Override
    public void killBoss() {
        System.out.println(name +"在打怪");
    }

    @Override
    public void upgrade() {

    }
}
