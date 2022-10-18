package by.itstep.antonsvirid.model.entity.abstracts;

// abstract-entity
public class Transport {
    private int tank;

    public Transport(int tank) {
        this.tank = tank;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public Transport() {

    }

}
