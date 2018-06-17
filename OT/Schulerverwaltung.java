public class Schulerverwaltung
{
    List<Schuler> schulerlist;
    
    public Schulerverwaltung ()
    {
        schulerlist = new List <Schuler> ();
    }
    
    public void schulerAdd(String name)
    {
        schulerlist.append(new Schuler (name));
    }
    
    public void schulerDelete(String name)
    {
        boolean fertig = true;
        schulerlist.toFirst();
        while (schulerlist.getContent() != null && fertig)
        {
            if(schulerlist.getContent().getName() == name)
            {
                schulerlist.remove();
                fertig = false;
            }
            schulerlist.next();
        }
    }
    
    public int getNote (String name, String fach, boolean schriftlich, int quartal)
    {
        schulerlist.toFirst();
        while (schulerlist.getContent() != null)
        {
            if (schulerlist.getContent().getName() == name)
            {
                return schulerlist.getContent().getNote(fach, schriftlich, quartal);
            }
            schulerlist.next();
        }
        return 0;
    }
    
    public void setNote (String name, String fach, int punktwert, boolean schriftlich, int quartal)
    {
        boolean fertig = true;
        schulerlist.toFirst();
        while (schulerlist.getContent() != null && fertig)
        {
            if(schulerlist.getContent().getName() == name)
            {
                schulerlist.getContent().setNote(fach, punktwert, schriftlich, quartal);
                fertig = false;
            }
            schulerlist.next();
        }
    }
}
