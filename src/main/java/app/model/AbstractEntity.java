package app.model;

public abstract class AbstractEntity {
    private String type;
    private String planet;

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getPlanet() {
        return planet;
    }

    public abstract void sayHi();

    @Override
    public String toString() {
        return "AbstractEntity{" +
                "type='" + type + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }
}
