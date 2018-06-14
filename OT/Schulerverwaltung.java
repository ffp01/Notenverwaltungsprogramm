public class Schulerverwaltung
{
    List schulerlist;
    
    public Schulerverwaltung ()
    {
        schulerlist = new List <Schuler> ();
    }
    
    public void schulerAdd(String pName)
    {
        schulerlist.append(new Schuler(pName));
    }
    
    
}
