
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
    public Fach(String pName, String pLehrer, String pKurs, boolean pSchriftlich)
    {
        noten = new List <Note> ();
        name = pName;
        schriftlich = pSchriftlich;
        lehrer = pLehrer;
        kurs
    }

    public void noteHinzufugen(int punktwert, boolean schriftlich, int quartal)
    {
        noten.append(new Note (punktwert, schriftlich, quartal));
    }
}
