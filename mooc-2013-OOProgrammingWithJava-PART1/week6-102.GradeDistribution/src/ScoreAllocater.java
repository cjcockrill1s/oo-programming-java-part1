public class ScoreAllocater {

    private int[] allocatedScores;
    private int acceptedScores;
    private int totalScores;

    public ScoreAllocater() {
        this.allocatedScores = new int[6];
        this.acceptedScores = 0;
        this.totalScores = 0;
    }

    public void allocateScore(int a) {

        isAcceptedScore(a);

        if (a <= 29 && a >= 0) {
            this.allocatedScores[0]++;
        } else if (a <= 34 && a > 29) {
            this.allocatedScores[1]++;
        } else if (a <= 39 && a > 34) {
            this.allocatedScores[2]++;
        } else if (a <= 44 && a > 39) {
            this.allocatedScores[3]++;
        } else if (a <= 49 && a > 34) {
            this.allocatedScores[4]++;
        } else {
            this.allocatedScores[5]++;
        }

        this.totalScores++;
    }

    public boolean isValidScore(int score) {
        return score >= 0 && score <= 60;
    }

    public void printScores() {
        System.out.println("Grade Distribution: ");
        for (int i = 0, j = this.allocatedScores.length; i < j; i++) {
            System.out.print(j - i - 1+ ": ");
            printScoreLine(this.allocatedScores[j - i - 1]);
        }
    }

    public static void printScoreLine(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void isAcceptedScore(int score) {
        if (score > 29) {
            this.acceptedScores++;
        }
    }

    public double acceptanceRate() {
        return (double) 100 * this.acceptedScores / this.totalScores;
    }
}


