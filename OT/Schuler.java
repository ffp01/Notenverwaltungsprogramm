
/**
 * 
 */
public class Schuler
{
    private String name;
    private List facher;
    
    public Schuler(String pName)
    {
        name = pName;
        facher = new List <Fach> ();
    }

    public void fachErzeugen(String name, String lehrer, int kurs, boolean schriftlich)
    {
        facher.append(new Fach (name, lehrer, kurs, schriftlich));
    }
    
}
