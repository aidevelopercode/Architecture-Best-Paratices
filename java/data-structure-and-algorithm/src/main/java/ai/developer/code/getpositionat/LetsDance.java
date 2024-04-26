package ai.developer.code.getpositionat;

public class LetsDance {

    public static void main(String[] args) {
        System.out.println("the dancer's position on stage #3 : " +  Algorithm.getPositionAt(3));
        System.out.println("the dancer's position on stage #100000 : " +  Algorithm.getPositionAt(100000));
        System.out.println("the dancer's position on stage #2147483647 : " +  Algorithm.getPositionAt(2147483647));
    }
}
