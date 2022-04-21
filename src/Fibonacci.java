import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer,Long> cache=new HashMap<>();
    public static long fibRecNaive(int n)
    {
        if(n<=1)
            return n;
        return fibRecNaive(n-1)+fibRecNaive(n-2);
    }
    public static long fibDynProgTopDown(int n)
    {
        if(cache.containsKey(n))
            return cache.get(n);
        if(n<=1)
            return n;
        long f=fibDynProgTopDown(n-1)+fibDynProgTopDown(n-2);
        cache.put(n,f);//add the caculated fib(n) value to the hashMap
        //n is the key and f is the value
        return cache.get(n);
    }
    public static long fibDynProgBottomUp(int n)
    {
        cache.put(0,0L);//Fib(0)=0
        cache.put(1,1L);//Fib(1)=1
        for(int i=2;i<=n;i++)
        {
            long f=cache.get(i-1)+cache.get(i-2);
            cache.put(i,f);//add the caculated fib(i) to the hashMap
        }
        return cache.get(n);
    }
}
