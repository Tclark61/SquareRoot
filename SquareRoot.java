//Author: Tyler Clark
//Quick Refresher on how to find square roots without using the square root function

public class SquareRoot
{

    public static int squareRoot(int x)
    {
        //Handle specific cases
        if( x == 0 || x == 1)
            return x;
        
        int start = 0, end = x/2, answer = 0, mid = 0;
        while(start <= end)
        {
            
            mid = (start + end)/2;
            //System.out.println(mid);
            if(mid*mid == x)
                return mid;
                
            if (mid*mid < x)
            {
                start = mid + 1;
            }
            if (mid*mid > x)
            {
                end = mid - 1;
            }
        }
        mid = (start + end)/2;
        return mid;
    }
    
    public static double finalTouches(int mid, int x)
    {
        double midDouble = (double)mid;
        double start = midDouble, end = midDouble + 1, inc = 0.01;
        while(start <= end)
        {
            midDouble = (start + end)/2;
            //System.out.println(midDouble);
            if(midDouble*midDouble == x)
            {
                return midDouble;
            }
            if(midDouble*midDouble < x)
            {
                start = midDouble + inc;
            }
            if(midDouble*midDouble > x)
            {
                end = midDouble - inc;
            }
        }
        midDouble = (start + end)/2;
        return midDouble;
        
    }
    public static void main(String[] args)
    {
        int input = Integer.parseInt(args[0]);
        int answer = squareRoot(input);
        double preciseAnswer = 0;
        if(answer*answer != (double)input){
            preciseAnswer = finalTouches(answer, input);
            System.out.println(preciseAnswer);
        }
        else
        {
            System.out.println(answer);
        }
        
    }

}