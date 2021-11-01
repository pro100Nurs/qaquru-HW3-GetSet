package guru.qa;

public class Country {
    public static void main(String[] args) {

        Population china = new Population();
        china.name = "Китай";
        china.region = "Азия";
        china.population = 1411778724;
        china.percent = 17.9;
        china.printPopulationInfo();

        DensityPopulation monaco = new DensityPopulation();
        monaco.name = "Монако";
        monaco.population = 38682;
        monaco.area = 2.02;
        monaco.density = 19341;
        monaco.printDensityInfo();

    }
}
