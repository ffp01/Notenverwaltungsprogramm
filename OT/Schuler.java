
/**
 * 
 */
public class Schuler
{
    private String name;
    private List<Fach> facher;
    
    public Schuler(String pName)
    {
        name = pName;
        facher = new List<Fach> ();
    }

    public void fachErzeugen(String name, String lehrer, int kurs, boolean schriftlich)
    {
        facher.append(new Fach (name, lehrer, kurs, schriftlich));
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNote (String name, boolean schriftlich, int quartal)
    {
        facher.toFirst();
        while (facher.getContent() != null)
        {
            if (facher.getContent().getName() == name)
            {
                return facher.getContent().getNote(schriftlich, quartal);
            }
            facher.next();
        }
        return 0;
    }
    
    public void setNote (String name, int punktwert, boolean schriftlich, int quartal)
    {
        boolean fertig = true;
        facher.toFirst();
        while (facher.getContent() != null && fertig)
        {
            if (facher.getContent().getName() == name)
            {
                facher.getContent().setNote(punktwert, schriftlich, quartal);
                fertig = false;
            }
            facher.next();
        }
    }
}
