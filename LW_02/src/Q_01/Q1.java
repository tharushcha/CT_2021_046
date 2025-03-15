package Q_01;

public class Q1 {
    public static void main(String[] args) {
        int A=10;
        int B=20;
        int C=30;
        int X=40;
        int Y=50;
        int r=7;
        double answer1=Math.sqrt(Math.pow(B,2)+4*A*C);
        double answer2=Math.sqrt(X+4*Math.pow(Y,3));
        double answer3=Math.cbrt(X*Y);
        double circle_area=Math.PI*Math.pow(r,2);
        System.out.println("Answer for part a =" + answer1);
        System.out.println("Answer for part b ="+ answer2);
        System.out.println("Answer for part c ="+ answer3);
        System.out.println("Answer for part d =" + circle_area);
    }
}
