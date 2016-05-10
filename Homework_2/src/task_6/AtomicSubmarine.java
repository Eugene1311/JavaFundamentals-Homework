package task_6;

/**
 * Created by Евгений on 02.04.2016.
 */
@TestAnnotation (madeIn="Russia")
public class AtomicSubmarine {
    private Engine engine;

    public AtomicSubmarine() {
        engine = new Engine();
    }

    public void run() {
        engine.run();
    }

    private class Engine {
        private void run() {
            System.out.println("Go!");
        }
    }

    public static void main(String[] args) {
        AtomicSubmarine submarine = new AtomicSubmarine();
        submarine.run();
    }
}
