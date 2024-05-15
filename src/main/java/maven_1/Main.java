package maven_1;

public class Main implements Runnable {
    public static void main(String[] args) {
        Main m1 = new Main();

        print();
        m1.run();
    }

    public void run() {    
        print();
    }    

    public static void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}