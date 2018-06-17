
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

    public void fachErzeugen(String fach, String lehrer, String kurs, boolean schriftlich)
    {
        facher.append(new Fach (fach, lehrer, kurs, schriftlich));
    }

    public String getName()
    {
        return name;
    }

    public String getLehrer(String fach)
    {
        facher.toFirst();
        while (facher.getContent() != null)
        {
            if (facher.getContent().getName() == fach)
            {
                return facher.getContent().getLehrer();
            }
            facher.next();
        }
        return "";
    }

    public String getKurs(String fach)
    {
        facher.toFirst();
        while (facher.getContent() != null)
        {
            if (facher.getContent().getName() == fach)
            {
                return facher.getContent().getKurs();
            }
            facher.next();
        }
        return "";
    }

    public boolean getSchriftlich(String fach)
    {
        facher.toFirst();
        while (1==1)
        {
            if (facher.getContent().getName() == fach)
            {
                return facher.getContent().getSchriftlich();
            }
            facher.next();
        }
    }
    
    public int getNote (String fach, boolean schriftlich, int quartal)
    {
        facher.toFirst();
        while (facher.getContent() != null)
        {
            if (facher.getContent().getName() == fach)
            {
                return facher.getContent().getNote(schriftlich, quartal);
            }
            facher.next();
        }
        return 0;
    }

    public void setNote (String fach, int punktwert, boolean schriftlich, int quartal)
    {
        boolean fertig = true;
        facher.toFirst();
        while (facher.getContent() != null && fertig)
        {
            if (facher.getContent().getName() == fach)
            {
                facher.getContent().setNote(punktwert, schriftlich, quartal);
                fertig = false;
            }
            facher.next();
        }
    }
}
