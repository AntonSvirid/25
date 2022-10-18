package by.itstep.antonsvirid.controller;

import by.itstep.antonsvirid.model.entity.Bus;
import by.itstep.antonsvirid.model.entity.Car;
import by.itstep.antonsvirid.model.entity.Truck;
import by.itstep.antonsvirid.model.entity.abstracts.Transport;
import by.itstep.antonsvirid.model.logic.GasStation;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = {new Car(50), new Car(40), new Bus(110),
                new Bus(200), new Bus(300), new Truck(400)};// объявляем массив и в нём же
                                                                            // создаём объекты этого массива

        int total = GasStation.calculatedTotalOil(transports);

        System.out.println("Total oil: " + total);
    }
}
