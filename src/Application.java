
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.print("Introduce the 'n' value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //Test Fibonacci dynamic programming version
        long start=System.currentTimeMillis();
        //long start=System.nanoTime();
        long result=Fibonacci.fibDynProgTopDown(n);
        //long end=System.nanoTime();
        long end=System.currentTimeMillis();
        //Stopwatch.start();
        System.out.println("Fibonacci[dynamic Version]( "+ n + " ) = "+ result);
        System.out.println("Execution Time [dynamic version] = "+(end-start));
        //Test Fibonacci naive version
        long start1=System.currentTimeMillis();
        result=Fibonacci.fibRecNaive(n);
        long end1=System.currentTimeMillis();
        System.out.println("Fibonacci[Naive Version]( "+ n + " ) = "+ result);
        System.out.println("Execution Time [Naive version] = "+(end1-start1));
        long start2=System.currentTimeMillis();
        result=Fibonacci.fibDynProgBottomUp(n);
        long end2=System.currentTimeMillis();
        System.out.println("Fibonacci[dyn bottom-up Version]( "+ n + " ) = "+ result);
        System.out.println("Execution Time [dyn bottom-up version] = "+(end2-start2));
    }
}
