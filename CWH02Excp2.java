import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CWH02Excp2 {
    public static void main(String[] args) throws Exception {
        List<Integer> data = new ArrayList<>();
        data.add(500);

        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Value ");
            int val = sc.nextInt();
           if(val <5) {
               throw new Exception("This Number is not allowed");
           }


        }catch (Exception e1){
            try{
                System.out.println("Error from try level 1: " + e1.getMessage());

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter The UserName ");
                int val = sc.nextInt();
                if(val < 5 && val != 5 ){
                    throw  new Exception("This is an exception from level 2");
                }

            }catch (Exception e2){
                try{
                    System.out.println("error: " + e2.getMessage());
                  // System.out.println("From catch block of level 2");
                    throw e1;

                }catch (Exception e3){
                   // System.out.println("This is from level 3 catch block" );
                    int x = data.get(0);
                    System.out.println(x);
                }
            }
        }finally {
            System.out.println("Finally: This block is executed whether or not there is error");
        }

        System.out.println("out side of try block");
    }
}
