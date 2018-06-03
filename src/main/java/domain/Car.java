package domain;

public class Car {
    private int position;
    private String name;

    public Car(String name ){
        this.position = 0;
        this.name = name;
    }

    public void move(RandomStrategy raceStrategy) {
        if(raceStrategy.isMovable()){
            this.position++;
        }
    }
}
