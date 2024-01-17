import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int distance,age,flightnum;
        double rate = 0.1;
        double total,discount=0;

        Scanner input = new Scanner(System.in);
        System.out.print("enter your distance: ");
        distance = input.nextInt();

        System.out.print("enter your age : ");
        age = input.nextInt();

        System.out.print("enter your flight number 1 for One Way, 2 for Round Trip: ");
        flightnum = input.nextInt();

        total = distance * rate;

        if(distance > 0 && age > 0 && (flightnum==1 || flightnum==2) ){
            if (age<=12){
                discount= total*0.5;
                total -= discount;
            } else if (age<=24) {
                discount= total*0.1;
                total -= discount;
            }else if (age>=65) {
                discount= total*0.3;
                total -= discount;
            }

            if (flightnum==2){
                discount= total*0.2;
                total = 2*(total- discount);
            }
        }else{
            System.out.print("You Entered Incorrect Data!");
        }
        System.out.print(total);
    }
}
