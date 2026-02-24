package Homework_08_Task_03;

public class PriorityRunner {
    private static PriorityThread minThread;
    private static PriorityThread normThread ;
    private static PriorityThread maxThread;

    public PriorityRunner() {
        minThread = new PriorityThread("MIN");
        minThread.setPriority(Thread.MIN_PRIORITY);   // 1

        normThread = new PriorityThread("NORM");
        normThread.setPriority(Thread.NORM_PRIORITY); // 5

        maxThread = new PriorityThread("MAX");
        maxThread.setPriority(Thread.MAX_PRIORITY);   // 10
    }

    public void runAllThreads() {
        minThread.start();
        normThread.start();
        maxThread.start();
    }
}
