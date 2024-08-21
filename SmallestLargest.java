//put your name here
public class SmallestLargest{
    public static void main(String[] args){
        int[] nums=new int[10];
        for(int i=0;i<10;i++){
            nums[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("Largest number is:"+largestValue(nums));
        System.out.println("Smallest number is:"+smallestValue(nums));
    }
    public static int smallestValue(int[] a){
        int min=a[0];
        for(int i=0;i<10;i++){
            if(min>a[i])
                min=a[i];
        }
        return min;
    }
    public static int largestValue(int[] a){
        int max=a[0];
        for(int i=0;i<10;i++){
            if(max<a[i])
                max=a[i];
        }
        return max;
    }
}