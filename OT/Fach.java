
/**
 * 
 */
public class Fach
{
    private String name;
    private String lehrer;
    private boolean schriftlich;
    private int kurs;
    private List noten;
    public Fach(String pName, String pLehrer, int pKurs, boolean pSchriftlich)
    {
        noten = new List <Note> ();
        name = pName;
        lehrer = pLehrer;
        kurs = pKurs;
        schriftlich = pSchriftlich;
    }

    public void noteHinzufugen(int punktwert, boolean schriftlich, int quartal)
    {
        noten.append(new Note (punktwert, schriftlich, quartal));
    }
}
