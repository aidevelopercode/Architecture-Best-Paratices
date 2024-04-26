package ai.developer.code.getpositionat;

public class Algorithm {

    public static int getPositionAt(int n) {

        int n1 = 1;
        int n2 = -2;
        int position = -1;
        int stage = 3;

        return nextMove(n1, n2, stage, n, position);
    }

    private static int nextMove(int n1, int n2, int step, int stage, int position) {
        int currentStep;
        int currentPosition = position;

        while(true) {

            currentStep = n2 - n1;
            position = position + currentStep;
            if(stage == step) {
               return position;
            }
            ++step;
            n1 = n2;
            n2 = currentStep;
        }



    }
}
