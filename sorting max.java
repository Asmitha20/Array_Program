import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n;
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    int a[] = new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        System.out.print(a[i]+" ");
	    }
	    int temp;
	    for(int i=0;i<n;i++){
	        for(int j=i;j<n;j++){
	            if(a[i]>a[j]){
	                temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	    }
	    System.out.println("\n");
	    for(int i=0;i<n;i++){
	        System.out.print(a[i]+" ");
	    }
	    int max = a[0];
	    for(int i=0;i<n;i++){
	        if(a[i] > max){
	            max =a[i];
	        }
	    }
	    System.out.println(max);
	    
	}
}
