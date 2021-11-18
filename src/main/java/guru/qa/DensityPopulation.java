package guru.qa;

public class DensityPopulation {

    static String densityPopTitle = "Плотность населения";

    private String name;
    private int population;
    private double area;
    private int density;

    public static void sayClassName() {
        System.out.println("\n" + DensityPopulation.class.getName() + " - " + densityPopTitle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population >= 0) {
            this.population = population;
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    public void downDensity(int x) {
        int newPopulation = population - x;
        int newDensity = density - x;
        System.out.println("\nUPD. -" + x + " человек эмигрировано из страны " + name + " в другую. Население составляет "
                + newPopulation + " и плотность " + newDensity + " чел./км²");
    }
}
