public class StrategyPattern
{
    public static void main(String[] args) {
        StreetRacer streetRacer = new StreetRacer();
        FormulaOne formulaOne = new FormulaOne();
        Helicopter helicopter = new Helicopter();
        Jet jet = new Jet();

        streetRacer.go();
        formulaOne.go();
        helicopter.go();
        jet.go();

        // Now changing the strategy of jet at run time
        jet.setGoAlgorithm(new GoByDrivingAlgorithm());
        jet.go();

        jet.setGoAlgorithm(new GoByFlyingAlgorithm());
        jet.go();

        jet.setGoAlgorithm(new GoByFlyingFast());
        jet.go();

        jet.setGoAlgorithm(new GoByDrivingAlgorithm());
        jet.go();
    }
}