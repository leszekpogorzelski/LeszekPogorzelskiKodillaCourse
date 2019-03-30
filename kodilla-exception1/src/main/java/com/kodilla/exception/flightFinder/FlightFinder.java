package com.kodilla.exception.flightFinder;

import java.util.HashMap;
import java.util.Map;

public final class FlightFinder  {
    private final Map<String, Boolean> flightDestinations = new HashMap<>();


    public void addMap(){
        flightDestinations.put("Poznań", true);
        flightDestinations.put("Gdańsk", true);
        flightDestinations.put("Kraków", true);
        flightDestinations.put("Rzeszów", true);
    }
    public  Map<String, Boolean> flightMap() {
         return new HashMap<String, Boolean>(flightDestinations);
    }

    public static Boolean findFlight(Flight flight) throws RouteNotFoundException {
                FlightFinder flightFinder = new FlightFinder();
                flightFinder.addMap();
             Long tryCounter = flightFinder.flightMap().entrySet().stream()
                    .map(Map.Entry::getKey)
                    .filter(s -> s.equals(flight.getArrivalAirport()))
                    .count();
                     if(tryCounter > 0) {
                         return true;
                     }
                     else{
                         throw new RouteNotFoundException();
                     }
    }
}
