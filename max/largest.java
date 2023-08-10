import java.util.*;
public class Main{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
