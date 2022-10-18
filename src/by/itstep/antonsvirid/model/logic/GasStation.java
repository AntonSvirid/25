package by.itstep.antonsvirid.model.logic;

import by.itstep.antonsvirid.model.entity.abstracts.Transport;

public class GasStation {
    public static int calculatedTotalOil(Transport[] transports) {

        int total = 0;

        for (Transport transport : transports) {
            total += transport.getTank();
        }

        return total;
    }
}
