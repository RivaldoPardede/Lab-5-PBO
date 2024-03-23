public class Bird {
    String birdName = "Parrot";
    double weight = 1.24;
    String featherColor = "red";
    double speed = 0.76;
    public Bird(String birdName, double weight, String featherColor){
        this.birdName = birdName;
        this.weight = weight;
        this.featherColor = featherColor;
    }

    public void walk(){
        weight--;
    }
    public void eat(){
        weight++;
    }

    public double getWeight(){
        return weight;
    }



}