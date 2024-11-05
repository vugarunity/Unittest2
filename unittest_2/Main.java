package seminars.second.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter car company:");
        String carCompany = scanner.nextLine();
        System.out.println("Enter car model:");
        String carModel = scanner.nextLine();
        System.out.println("Enter car year of release:");
        int carYear = scanner.nextInt();


        Car car = new Car(carCompany, carModel, carYear);

       
        scanner.nextLine(); 
        System.out.println("Enter motorcycle company:");
        String motorcycleCompany = scanner.nextLine();
        System.out.println("Enter motorcycle model:");
        String motorcycleModel = scanner.nextLine();
        System.out.println("Enter motorcycle year of release:");
        int motorcycleYear = scanner.nextInt();


        Motorcycle motorcycle = new Motorcycle(motorcycleCompany, motorcycleModel, motorcycleYear);

       
        System.out.println("\n--- Car Test Drive ---");
        System.out.println("Initial speed of car: " + car.getSpeed());
        car.testDrive();
        System.out.println("Speed after test drive: " + car.getSpeed());
        car.park();
        System.out.println("Speed after parking: " + car.getSpeed());

        System.out.println("\n--- Motorcycle Test Drive ---");
        System.out.println("Initial speed of motorcycle: " + motorcycle.getSpeed());
        motorcycle.testDrive();
        System.out.println("Speed after test drive: " + motorcycle.getSpeed());
        motorcycle.park();
        System.out.println("Speed after parking: " + motorcycle.getSpeed());

        scanner.close();
    }
}

