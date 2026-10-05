package laap;

public class Car {
    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rented;


    public static final String companyName = "just rentals";
    public static int totalCars = 0;


    public Car() {
        this.plateNumber = "Unknown";
        this.carModel = "Unknown";
        this.dailyRate = 0.0;
        this.rented = false;
        totalCars++;
    }


    public Car(String plateNumber, String model, double dailyRate) {
        this.plateNumber = plateNumber;
        this.carModel = model;
        this.rented = false;

        if (dailyRate >= 0) {
            this.dailyRate = dailyRate;
        } else {
            System.out.println("Invalid daily rate. Rate set to 0.0");
            this.dailyRate = 0.0;
        }

        totalCars++;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return rented;
    }

    public void setDailyRate(double rate) {
        if (rate >= 0) {
            this.dailyRate = rate;
            System.out.println("Daily rate updated to $" + rate);
        } else {
            System.out.println("Invalid rate. Daily rate cannot be negative.");
        }
    }

    public void rent() {
        if (rented) {
            System.out.println("Car " + plateNumber + " is already rented.");
        } else {
            rented = true;
            System.out.println("Car " + plateNumber + " has been rented successfully.");
        }
    }

    public void returnCar() {
        if (rented) {
            rented = false;
            System.out.println("Car " + plateNumber + " has been returned successfully.");
        } else {
            System.out.println("Car " + plateNumber + " was not rented.");
        }
    }

    public void displayInfo() {
        System.out.println("==Info==");
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Model: " + carModel);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Status: " + rented);
    }

    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    public static void displayTotalCars() {
        System.out.println("Total Cars Created: " + totalCars);
    }
}


class testing {
    public static void main(String[] args) {

        Car c1 = new Car("ABC123", "Benz Mercedes", 40);
        c1.displayInfo();

        c1 = new Car("AG34", "BMW", 60);
        c1.displayInfo();

        c1.rent();

        c1.rent();

        c1.returnCar();

        c1.setDailyRate(50);

        c1.displayInfo();

        Car.displayCompanyName();
        Car.displayTotalCars();
    }
}











