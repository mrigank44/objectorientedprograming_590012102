import java.util.Scanner;
public class sumofarraydeclaringoutside {
    int sum=0,n=0,arr[] = new int[5];
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        sumofarraydeclaringoutside obj = new sumofarraydeclaringoutside();
        System.out.println("enter 5 numbers");
        for(int i=0;i<5;i++){
            obj.arr[i]=s.nextInt();
            obj.sum += obj.arr[i];
        }
        System.out.println("sum" +obj.sum);
    }




}
