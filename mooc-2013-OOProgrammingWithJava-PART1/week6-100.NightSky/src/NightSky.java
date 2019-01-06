import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random randomStars = new Random();
        for (int i = 0, j = this.width; i < j; i++) {
            if (randomStars.nextDouble() > this.density) {
                System.out.print(" ");
            }
            else {
                System.out.print("*");
                this.starsInLastPrint++;
            }
        }
        System.out.println();
    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int i = 0, j = this.height; i < j; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}

