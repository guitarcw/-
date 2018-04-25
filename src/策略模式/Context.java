package 策略模式;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        strategy=strategy;
    }
    protected int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
