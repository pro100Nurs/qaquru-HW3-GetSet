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

    public void downDensity(int x) {
        int newPopulation = population - x;
        int newDensity = density - x;
        System.out.println("\nUPD. -" + x + " человек в стране " + name + ". Население составляет "
                + newPopulation + " и плотность " + newDensity + " чел./км²");
    }
}
