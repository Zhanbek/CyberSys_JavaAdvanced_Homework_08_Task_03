package Homework_07_Task_04;

public class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i < 51; i++) {
            System.out.printf("Виконується %d-а ітерація потоку з ім'ям '%s'", i, this.getName());
            System.out.println();
        }
    }
}
