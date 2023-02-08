package parkinglot.factory;

import parkinglot.model.Vehicle;
import parkinglot.strategy.FourWheelerMallFeeStrategy;
import parkinglot.strategy.ParkingFeeStrategy;
import parkinglot.strategy.SixWheelerMallFeeStrategy;
import parkinglot.strategy.TwoWheelerMallFeeStrategy;

import static parkinglot.model.Vehicle.*;

public class MallFeeStrategyFactory implements FeeModelStrategyFactory {
    public ParkingFeeStrategy getParkingFeeStrategy(Vehicle vehicle) {
        if(vehicle == MOTORCYCLE || vehicle == SCOOTER) {
            return new TwoWheelerMallFeeStrategy();
        } else if(vehicle == CAR || vehicle == SUV){
            return new FourWheelerMallFeeStrategy();
        } else if(vehicle == BUS || vehicle == TRUCK){
            return new SixWheelerMallFeeStrategy();
        } else {
            throw new IllegalArgumentException("Vehicle not allowed in Mall parking.");
        }
    }
}
