package racingcar.domain.entity;

public class CarEntity {
    private final String carName;
    private final int position;

    public CarEntity(String carName, int position) {
        this.carName = carName;
        this.position = position;
    }
}
