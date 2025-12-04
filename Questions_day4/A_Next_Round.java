import java.util.Scanner;
public class A_Next_Round{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
int n= in.nextInt();
int k= in.nextInt();
int count=0;
int[] arr = new int[n];
for (int i = 0; i < arr.length; i++) {
arr[i]=in.nextInt();    
}
for(int i=0;i<arr.length;i++){
if(arr[i]>=arr[k-1] && arr[i]>0){
    count+=1;
}
    }
    System.out.println(count);
}
}
