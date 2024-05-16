package maven_1;

public class Main extends Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        print();
    }

    public static void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void run() {    
        
    }    

    
}