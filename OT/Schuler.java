
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

    public void fachErzeugen(String pFachname)
    {
        facher.append(new Fach ());
    }
}
