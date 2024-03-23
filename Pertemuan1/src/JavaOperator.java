public class JavaOperator {
    public static void main(String[] args){

        int firstNum = 3;
        Double secondNum = 4.2;

        int thirdNum = 4;
        thirdNum *= 3;
//        TODO : Declare the rest
        System.out.println(thirdNum);

        Double addRes = firstNum + secondNum;

        Double substractRes = firstNum - secondNum;

        Double bagi = firstNum/secondNum;

        Double kali = firstNum*secondNum;

        Double modulo = firstNum%secondNum;
//        TODO : Declare the rest
        System.out.println(addRes);
        System.out.println(substractRes);
        System.out.println(bagi);
        System.out.println(kali);
        System.out.println(modulo);

        int preIncrement = ++firstNum;
        int postIncrement = firstNum++;
        int preDecrement = --firstNum;
        int postDecrement = firstNum--;

//        TODO : Declare the rest

        System.out.println(preIncrement);
        System.out.println(postIncrement);
        System.out.println(firstNum);
        System.out.println(preDecrement);
        System.out.println(postDecrement);



        Boolean isEqual = firstNum == secondNum;
        Boolean isBigger = firstNum > secondNum;
        Boolean isSmaller = firstNum < secondNum;
        Boolean isSmallerOrEqual = firstNum <= secondNum;
        Boolean isSomething1 = firstNum >= secondNum;
        Boolean isSomething2 = firstNum != secondNum;
        //        TODO : Declare the rest
        System.out.println(isEqual);
        System.out.println(isBigger);
        System.out.println(isSmaller);
        System.out.println(isSmallerOrEqual);
        System.out.println(isSomething1);
        System.out.println(isSomething2);


        Boolean isFalse = isEqual && isBigger;
        Boolean isTrue = isEqual || isBigger;
        Boolean falsy = !isBigger;

        System.out.println(isFalse);
        System.out.println(isTrue);
        System.out.println(falsy);


    }
}