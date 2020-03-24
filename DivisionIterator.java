import java.util.Iterator;

public class DivisionIterator implements Iterator
{
    private Corporate[] corporate;
    private int location = 0;

    public DivisionIterator(Corporate[] c) {
        corporate = c;
    }

    @Override
    public boolean hasNext() {
        if (location < corporate.length && corporate[location] != null)
            return true;
        else
            return false;
    }

    @Override
    public Corporate next() {
        return corporate[location++];
    }
    
}