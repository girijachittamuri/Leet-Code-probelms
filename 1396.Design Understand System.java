import java.util.*;

class UndergroundSystem {

    HashMap<Integer, String> station = new HashMap<>();
    HashMap<Integer, Integer> time = new HashMap<>();
    HashMap<String, Integer> total = new HashMap<>();
    HashMap<String, Integer> count = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        station.put(id, stationName);
        time.put(id, t);
    }

    public void checkOut(int id, String stationName, int t) {
        String route = station.get(id) + "-" + stationName;

        total.put(route, total.getOrDefault(route, 0) + (t - time.get(id)));
        count.put(route, count.getOrDefault(route, 0) + 1);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "-" + endStation;
        return (double) total.get(route) / count.get(route);
    }
}
