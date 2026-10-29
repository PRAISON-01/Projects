package Reflection.GeoPoliticalZone;

import java.util.Scanner;

public class GeoPoliticalZoneApp {
    static void main() {
        Scanner prompt = new Scanner(System.in);

        try{
            System.out.println("Enter a state in Nigeria >> ");
            String stateInput = prompt.nextLine().toUpperCase();

            State state = State.valueOf(stateInput);
            Reflection.GeoPoliticalZone.GeoPoliticalZone zone = state.getGeoPoliticalZone();
            System.out.printf("State :%s\nZone : %s", state, zone);
        } catch (IllegalArgumentException error) {
            System.out.println("Please enter a valid state in Nigeria!!!");
        }
    }
}
