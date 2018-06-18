
/**
 * 
 */
public class Note
{
    private boolean schriftlich;
    private int punktwert;
    private int quartal;
    
    public Note (int pPunktwert, boolean pSchriftlich, int pQuartal)
    {
        schriftlich = pSchriftlich;
        punktwert = pPunktwert;
        quartal = pQuartal;
    }
    
    public int getPunktwert ()
    {
        return punktwert;
    }
    
    public boolean getSchriftlich ()
    {
        return schriftlich;
    }
    
    public int getQuartal ()
    {
        return quartal;
    }
}
