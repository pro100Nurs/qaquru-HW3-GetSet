package guru.qa;

public class Population {

    String name;
    String region;
    int population;
    double percent;

    public void printPopulationInfo() {
        System.out.println("\nЧисленность населения:\nСтрана " + name + " относиться к региону " + region + ". Население составляет "
                + population + " человек и это " + percent + "% от населения Земли.");
    }

}
