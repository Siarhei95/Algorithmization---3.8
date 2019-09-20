package Question_8;
import java.util.*;

public class question_8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ener diapason of array n: "); //диапазон вводимых дробей
        int n = scanner.nextInt();
        double [] p = new double[n];
        double [] q = new double[n];
        double [] c = new double[n];
        System.out.println("List of fractions: ");
        for(int i=0; i<n; i++){
            p[i] = random.nextInt(10)+1;
            q[i] = random.nextInt(10)+1;
            c[i]= Math.rint((p[i]/q[i])*100)/100;
            System.out.println(p[i]+ "/" + q[i] + " = " + c[i]);
        }
        Arrays.sort(c);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(c));
        double pch = 0;
        double qzn = 1;
        for(int i=0; i<n; i++){
            qzn = qzn*q[i];
            pch = pch+p[i]*qzn/q[i];
        }
        System.out.println("Common denominator of fractions: ");
        System.out.print(pch+"/"+qzn);
    }
}
