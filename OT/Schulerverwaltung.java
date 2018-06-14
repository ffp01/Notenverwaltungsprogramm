public class Schulerverwaltung
{
    List<Schuler> schulerlist;
    
    public Schulerverwaltung ()
    {
        schulerlist = new List <Schuler> ();
    }
    
    public void schulerAdd(String pName)
    {
        schulerlist.append(new Schuler(pName));
    }
    
    
}
