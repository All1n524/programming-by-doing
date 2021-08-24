//Variables Variables and Names 7 points Allen Hung
public class VariablesAndNames
{
    public static void main( String[] args )
    {
        //using 4.0 for space_in_a_car it's necessary because it's more accurate. If it's just 4, then the computer will just simply round to the nearest non-decial degit.
        //floating numbers are numbers with decimals.
        // the below variables are all integers
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        // the below variables are all numbers with or without decimals
        double space_in_a_car, carpool_capacity, average_passengers_per_car;
        //variable cars
        cars = 100;
        //the space in a car
        space_in_a_car = 4.0;
        //the drivers
        drivers = 30;
        //the passengers
        passengers = 90;
        // the cars not driven
        cars_not_driven = cars - drivers;
        // the cars driven
        cars_driven = drivers;
        // carpool capacity
        carpool_capacity = cars_driven * space_in_a_car;
        // the average passengers per car
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}
