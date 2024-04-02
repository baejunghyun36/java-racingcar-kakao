package dto;

import racingcar.model.Car;

public class CarResponse {

    private final String name;
    private final int position;

    public CarResponse(Car car) {
        this.name = car.getName();
        this.position = car.getPosition();
    }

    public String getName(){
        return this.name;
    }

    public int getPosition(){
        return this.position;
    }
}
