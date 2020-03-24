import java.util.Iterator;

public class DivisionIterator implements Iterator
{
    private VP[] vps;
    private int location = 0;

    public DivisionIterator(VP[] v) {
        vps = v;
    }

    @Override
    public boolean hasNext() {
        if (location < vps.length && vps[location] != null)
            return true;
        else
            return false;
    }

    @Override
    public VP next() {
        return vps[location++];
    }
    
}