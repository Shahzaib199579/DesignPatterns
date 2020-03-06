public class FrontEnd implements HelpInterface
{
    final int Front_End_Help = 1;
    private HelpInterface successor;

    public FrontEnd(HelpInterface s) {
        successor = s;
    }

    @Override
    public void getHelp(int helpConstant) {
        if (helpConstant != Front_End_Help)
        {
            successor.getHelp(helpConstant);
        }
        else
        {
            System.out.println("This is front end for your help.");
        }

    }
    
}