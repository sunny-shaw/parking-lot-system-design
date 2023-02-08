package parkinglot.factory;

import parkinglot.model.FeeModelStrategyFactory;
import parkinglot.model.Vehicle;

import static parkinglot.model.Vehicle.*;

public class StadiumFeeStrategyFactory implements FeeModelStrategyFactory {
    public ParkingFeeStrategy getParkingFeeStrategy(Vehicle vehicle) {
        if(vehicle == MOTORCYCLE) {
            return new TwoWheelerStadiumFeeStrategy();
        } else if(vehicle == CAR || vehicle == SUV){
            return new FourWheelerStadiumFeeStrategy();
        } else {
            throw new IllegalArgumentException("Vehicle not allowed in Stadium parking");
        }
    }
}
