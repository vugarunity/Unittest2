package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("Toyota", "Camry", 2022);
        motorcycle = new Motorcycle("Yamaha", "MT-07", 2021);
    }

    @Test
    public void carShouldBeInstanceOfVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    public void motorcycleShouldBeInstanceOfVehicle() {
        assertThat(motorcycle).isInstanceOf(Vehicle.class);
    }

    @Test
    public void numWheelsCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void numWheelsMotorcycle() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testDriveMotorcycle() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void carShouldStopAfterParking() {
        car.testDrive();
        assertThat(car.getSpeed()).isGreaterThan(0);

        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    void expectedIllegalArgumentExceptionOnInvalidSetParkingCar() {
        assertThatThrownBy(() -> car.setParking(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Car should be stopping");
    }

    @Test
    public void motorcycleShouldStopAfterParking() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isGreaterThan(0);

        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

    @Test
    void expectedIllegalArgumentExceptionOnInvalidSetParkingMotorcycle() {
        assertThatThrownBy(() -> motorcycle.setParking(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Motorcycle should be stopping");
    }


    @Test
    public void carShouldReturnCorrectToString() {
        assertThat(car.toString()).isEqualTo("This car is a 2022 Toyota Camry");
    }

    @Test
    public void motorcycleShouldReturnCorrectToString() {
        assertThat(motorcycle.toString()).isEqualTo("This motorcycle is a 2021 Yamaha MT-07");
    }
}

