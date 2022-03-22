import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
	int count;
        double tall,weight,bmi;
	count = 0;
	while( count < 2 ){
        	tall = stdin.nextDouble();
        	weight = stdin.nextDouble();
        	bmi = 0;
        	tall = tall / 100;
        	bmi = weight / (tall * tall);

        	bmi = (Math.round(bmi / 10))*10;
			System.out.println(bmi);
	}
    }
}
