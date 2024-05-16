import java.lang.Math;
import java.util.Scanner;
public class Random {
    public static void main(String[] args) {
        int n=(int)(Math.random()*100);
        System.out.println(n);
        System.out.println("You Have Only 10 Attemts to Rech That Number!");
        int attempt=10;
        int temp=n;
        Scanner sc=new Scanner(System.in);
        while (attempt!=0){
            System.out.print("Enter your Gussing value:");
            int val=sc.nextInt();
            // calculate the diffrenece
            int diff=temp-val;
            attempt=attempt-1;
            if(diff==0)
            {
                System.out.println("Congratulation you succefully guesses the number!");
                return ;
                
            }
            else if(diff<=5){
                System.out.println("Almost there to reaching the number!");
                // attempt=attempt-1;
                System.out.println("You Have Only"+" "+ attempt+" " + "Attemts to Rech That Number!");
            }
            else if(diff<=10){
                System.out.println("Closer to reaching the number!");
                // attempt=attempt-1;
                System.out.println("You Have Only"+" "+ attempt +" "+"Attemts to Rech That Number!");
                
            }
            else if(diff<=20){
                System.out.println("Not To far to reaching the number!");
                // attempt=attempt-1;
                System.out.println("You Have Only"+" "+ attempt +" "+"Attemts to Rech That Number!");
                
            }
            else if(diff<=40){
                System.out.println("far to reaching the number!");
                // attempt=attempt-1;
                System.out.println("You Have Only"+" "+attempt+" "+ "Attemts to Rech That Number!");
                
            }
            else if(diff<=65){
                System.out.println("Very far to reaching the number!");
                // attempt=attempt-1;
                System.out.println("You Have Only"+" "+ attempt+" " + "Attemts to Rech That Number!");
                
            }
            else if(diff<=85){
                System.out.println("Very Much far to reaching the number!");
                // attempt=attempt-1;
                System.out.println("You Have Only"+" "+ attempt +" "+"Attemts to Rech That Number!");
                
            }
            
        }
        System.out.println("You dont have any attempt to left!");
        System.out.println("Sorry to say but you cant able guess the number");
    }
}
