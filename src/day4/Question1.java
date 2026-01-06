package day4;

class Stopwatch {

    private boolean running = false;
    private int ticks = 0;

    public void start() {
        running = true;
    }

    public void stop() {
        running = false;
    }

    public void reset() {
        ticks = 0;
    }

    public boolean isRunning() {
        return running;
    }

    public void incrementTick() {
        ticks++;
    }

    public int elapsed() {
        return ticks;
    }
}

public class Question1 {

    public static void main(String[] args) {

        Stopwatch sw = new Stopwatch();
        sw.start();

        for (int i = 0; i < 1000; i++) {
            if (sw.isRunning()) {
                sw.incrementTick();
            }
        }

        sw.stop();
        System.out.println(sw.elapsed()); // 1000
        sw.reset();
    }
}
