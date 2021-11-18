package guru.qa;

public class PrintInfo {

    public void printPopulationInfo(String name, String region, int population, double percent) {
        System.out.println("\nЧисленность населения:\nСтрана " + name + " относиться к региону " + region + ". Население составляет "
                + population + " человек и это " + percent + "% от населения Земли.");
    }

    public void printDensityInfo(String name, int population, double area, int density) {
        System.out.println("\nПлотность населения:\nСтрана " + name + ". Население " + population + " человек. Плотность населения составляет "
                + density + " чел./км² и площадь в км²: " + area + ".");
    }
}
