
/**
 * 
 */
public class Fach
{
    private String fach;
    private String lehrer;
    private String kurs;
    private boolean schriftlich;
    private List<Note> noten;
    
    public Fach(String pFach, String pLehrer, String pKurs, boolean pSchriftlich)
    {
        noten = new List<Note> ();
        fach = pFach;
        lehrer = pLehrer;
        kurs = pKurs;
        schriftlich = pSchriftlich;
    }
    
    public String getName()
    {
        return fach;
    }
    
    public String getLehrer()
    {
        return lehrer;
    }
    
    public String getKurs()
    {
        return kurs;
    }
    
    public boolean getSchriftlich()
    {
        return schriftlich;
    }
    
    public int getNote (boolean schriftlich, int quartal)
    {
        noten.toFirst();
        while(noten.getContent() != null)
        {
            if (noten.getContent().getSchriftlich() == schriftlich)
            {
                if (noten.getContent().getQuartal() == quartal)
                {
                    return noten.getContent().getPunktwert();
                }
            }
            noten.next();
        }
        return 0; //Falscher Wert
    }
    
    public void setNote(int punktwert, boolean schriftlich, int quartal)
    {
        noten.append(new Note (punktwert, schriftlich, quartal));
    }
}
