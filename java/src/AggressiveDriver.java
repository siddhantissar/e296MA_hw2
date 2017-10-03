public class AggressiveDriver extends Driver {

    public AggressiveDriver(String name, double weight) {
        super(name, weight);
    }

    @Override
    public double throttle_action(Car car, Environment env) {

        if(car.current_speed<car.max_speed)
            return 0.5*car.max_acceleration;
        else
            return -0.5*car.max_acceleration;
    }

    @Override
    public boolean stop_for_refueling(Car car, Environment env) {
        return false;
    }

}
