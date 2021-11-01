package guru.qa;

public class DensityPopulation {

    String name;
    int population;
    double area;
    int density;

    public void printDensityInfo() {
        System.out.println("\nПлотность населения:\nСтрана " + name + ". Население " + population + " человек. Плотность населения составляет "
                + density + " чел./км² и площадь в км²: " + area + ".");
    }
}
