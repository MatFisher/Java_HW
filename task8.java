import java.util.ArrayList;
import java.util.HashMap;

public class task8 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>();

        planets.add("Mercury");
        planets.add("Venera");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uran");
        planets.add("Neptun");
        planets.add("Saturn");
        planets.add("Mercury");
        planets.add("Mars");
        planets.add("Mercury");
        planets.add("Earth");

        HashMap planCount = new HashMap();
        for(String planet: planets){
            if(planCount.containsKey(planet)){
                int count = planCount.get(planet);
                planCount.put(planet, count++);
            }
            else planCount.put(planet, 1);
        }

        for (String planet: planCount.keySet()){
            int count = planCount.get(planet);
            System.out.println((planet + ": " + count));
        }
    }
}
