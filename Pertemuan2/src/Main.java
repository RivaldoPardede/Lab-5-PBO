public class Main {

    public static void main(String[] args){
        Bird pipit = new Bird("pipit", 10, "black");

        pipit.eat();
        pipit.eat();
        pipit.eat();
        pipit.eat();
        pipit.eat();

        System.out.println(pipit.getWeight());
    }
}