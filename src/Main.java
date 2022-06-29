/**
 * @author Dm.Petrov
 * DATE: 29.06.2022
 */
public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listener,errorListener);
        worker.start();
    }
}
