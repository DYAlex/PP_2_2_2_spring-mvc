package web.model;

public class Car {
    private static Long nextId = 1L;
    private Long id;
    private String model;
    private int series;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
        this.id = Car.nextId;
        Car.nextId++;
    }

    public static void resetNextId() {
        nextId = 1L;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
