
/**
 * 
 */
public class Fach
{
    private String name;
    private String lehrer;
    private boolean schriftlich;
    private int kurs;
    private List<Note> noten;
    
    public Fach(String pName, String pLehrer, int pKurs, boolean pSchriftlich)
    {
        noten = new List<Note> ();
        name = pName;
        lehrer = pLehrer;
        kurs = pKurs;
        schriftlich = pSchriftlich;
    }
    
    public String getName()
    {
        return name;
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
