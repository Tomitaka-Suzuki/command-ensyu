import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        double tall,weight,bmi;
        tall = stdin.nextDouble();
        weight = stdin.nextDouble();
        bmi = 0;
        tall = tall / 100;
        bmi = weight / (tall * tall);

        bmi = (Math.round(bmi / 10))*10;
		System.out.println(bmi);  
    }
}