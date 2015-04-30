package edu.auburn.eng.csse.comp3710.team17;

public class GameTimer {

    private boolean running = false;
    private long startTime = 0;
    private long elapsedTime = 0;

    public  GameTimer() {


    }

    public void start() {
        if (!running) {
            startTime = System.nanoTime();
            running = true;
        }
    }

    public void reset() {
        elapsedTime = 0;
        if (running) {
            startTime = System.nanoTime();

        }
    }

    public void stop() {
        if (running) {
            elapsedTime += System.nanoTime() - startTime;
            running = false;
        }
    }

    public long  getElapsed() {
        if (running) {
            return System.nanoTime() - startTime;
        }
        return elapsedTime;
    }

    public long getElapsedMilliSec() {
        return getElapsed() / 1000000L;
    }


}
