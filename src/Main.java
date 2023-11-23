import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = s.nextInt();
        int[] n = new int[number];

        for(int i = 0; i < number; i++){
            Scanner x = new Scanner(System.in);
            System.out.print("Enter Input "+ (i+1) + " = ");
            int value = x.nextInt();
            n[i] = value;
        }
        Swap(n);
        System.out.print("result = ");
        for(int i = 0; i < number; i++){
            System.out.print(n[i] + " ");
        }
    }
    public static void Swap(int[] n){
        int x = n.length;
        for(int i = 0; i < x; i++){
            for(int j = i+1; j < x; j++){
                if(n[i] > n[j]){
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    }
}