public class ChainOfResponsibilityPattern
{
    public static void main(String[] args) {
        final int frontendHelp = 1;
        final int intermediateLayerHelp = 2;
        final int generalHelp = 3;

        ApplicationLayer app = new ApplicationLayer();

        IntermediateLayer inter = new IntermediateLayer(app);

        FrontEnd frontEnd = new FrontEnd(inter);

        frontEnd.getHelp(intermediateLayerHelp);
    }
}