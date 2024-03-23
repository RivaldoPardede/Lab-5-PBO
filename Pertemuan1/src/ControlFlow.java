import java.util.Scanner;

public class ControlFlow {

    public static void main(String[] args){

//        CONDITIONAL FLOW CONTROL



//        IF Statement
        String pesan = "SUIIIIII";

//        Inline
        if(pesan.isBlank()) System.out.println("Pesan Kosong");


//        IF ELSE
        if(pesan.isBlank()) {
            System.out.println("Pesan Kosong");
        }else{
            System.out.println(pesan);
        }

//        IF ELSE-IF ELSE

        if(pesan.isBlank()){
            System.out.println("Pesan Kosong");
        } else if(pesan.length()<5){
            System.out.println("Pesan terlalu singkat");
        } else {
            System.out.println(pesan);
        }
        //CHALLENGE : REFACTOR

        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1 : System.out.println("Anda memilih 1");
            break;
            case 2 : System.out.println("Anda memilih 2");
            break;
            case 3 : System.out.println("Anda memilih 3");
            break;
        }


//        LOOPING CONTROL FLOW

//        For-Loop
        for(int i=0; i<3;i++){
            System.out.print(i + " ");
        }

//        Nested for loop
        System.out.println("\n\n");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <= i; j++ )
                System.out.println(i + " ,"+ j);
        }

//      While loop
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }
//        What is the output ??

//        Do While
        do{
            System.out.println(i);
            i++;
        } while(i<5);
    }
}