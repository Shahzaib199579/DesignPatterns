public class IntermediateLayer implements HelpInterface
{
    final int Intermediate_Help = 2;
    private HelpInterface successor;

    public IntermediateLayer(HelpInterface s) {
        successor = s;
    }

    @Override
    public void getHelp(int helpConstant) {
        if (helpConstant != Intermediate_Help)
        {
            successor.getHelp(helpConstant);
        }
        else
        {
            System.out.println("This is intermediate layer for your help.");
        }

    }
}