package gen_number;

import java.util.Arrays;

public class TestGen {
    public static void main(String[] args) {
        /*int number = (int)(Math.random()*10);
        System.out.println("Generated number: "+number);*/

        //System.out.println("Generated number: "+ ((int)(Math.random()*10)));

//        for (int i = 0; i < 100; i++) {
//            System.out.println("Generated number: "+ ((int)(Math.random()*10)));
//        }


        /////////////////////////
//        for (int i = 0; i <10 ; i++) {
//            System.out.println("Generated number: "+ (1+(int)(Math.random()*10))); //исключая 0
//
////            if((1+(int)(Math.random()*10)) == 0){
////                System.err.println("OMG");
////                System.exit(1);
////            }
////            System.out.println("iter: "+i);
//
//
//        }

        boolean arrBool[] = {false,false,false,false,false,false};


        for (int i = 0; i < 100; i++) {
            int number = (1 + (int) (Math.random() * 6));
            // System.out.println(number);
            switch (number) {
                case 1:
                    //System.out.print(number);
                    arrBool[0] = true;
                    break;
                case 2:
                    //System.out.print(number);
                    arrBool[1] = true;
                    break;
                case 3:
                    //System.out.print(number);
                    arrBool[2] = true;
                    break;
                case 4:
                   // System.out.print(number);
                    arrBool[3] = true;
                    break;
                case 5:
                 //   System.out.print(number);
                    arrBool[4] = true;
                    break;
                case 6:
               //     System.out.print(number);
                    arrBool[5] = true;
                    break;
            }

           System.out.println(Arrays.toString(arrBool));
        }
    }
}
