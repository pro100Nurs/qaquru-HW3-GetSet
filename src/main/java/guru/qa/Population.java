package guru.qa;

public class Population {

    static String popTitle = "Численность населения";

    private String name;
    private String region;
    private int population;
    private double percent;

    public static void sayClassName() {
        System.out.println("\n" + Population.class.getName() + " - " + popTitle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population >= 0) {
            this.population = population;
        }
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public void incrementPopulation() {
        population++;
        System.out.println("\nUPD. +1 житель добавилься к страну " + name + ". Теперь население составляет " + population + " человек.");
    }

    static class Source {
        static String sourceInfo = "Wikipedia";

        public static void printSource() {
            System.out.println("\nOfficial source: " + sourceInfo);
        }
    }

    public void printPopulationInfo(String name, String region, int population, double percent) {
        System.out.println("\nЧисленность населения:\nСтрана " + name + " относиться к региону " + region + ". Население составляет "
                + population + " человек и это " + percent + "% от населения Земли.");
    }
}
