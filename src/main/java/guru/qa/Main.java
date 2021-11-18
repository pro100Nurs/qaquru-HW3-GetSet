package guru.qa;

public class Main {
    public static void main(String[] args) {

        Population.sayClassName();
        Population.Source.printSource();

        Population china = new Population();
        china.setName("Китай");
        china.setRegion("Азия");
        china.setPopulation(1411778724);
        china.setPercent(17.9);
        china.printPopulationInfo(china.getName(), china.getRegion(), china.getPopulation(), china.getPercent());

        china.incrementPopulation();

        DensityPopulation.sayClassName();

        DensityPopulation monaco = new DensityPopulation();
        monaco.setName("Монако");
        monaco.setPopulation(38682);
        monaco.setArea(2.02);
        monaco.setDensity(19341);
        monaco.printDensityInfo(monaco.getName(), monaco.getPopulation(), monaco.getArea(), monaco.getDensity());

        monaco.downDensity(10);

    }
}
