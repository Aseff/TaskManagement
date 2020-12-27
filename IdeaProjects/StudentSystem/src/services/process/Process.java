package services.process;

public interface Process {
    public abstract void processLogic();

    public default void process(){
        processLogic();
    }
}
