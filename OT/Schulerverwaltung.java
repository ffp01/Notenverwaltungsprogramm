public class Schulerverwaltung
{
    List<Schuler> schulerlist;

    public Schulerverwaltung ()
    {
        schulerlist = new List <Schuler> ();
    }

    public void schulerAdd (String name)
    {
        schulerlist.append(new Schuler (name));
    }

    public void schulerDelete (String name)
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

    public void fachErzeugen (String name, String fach, String lehrer, String kurs, boolean schriftlich)
    {
        boolean fertig = true;
        schulerlist.toFirst();
        while (schulerlist.getContent() != null && fertig)
        {
            if(schulerlist.getContent().getName() == name)
            {
                schulerlist.getContent().fachErzeugen(fach, lehrer, kurs, schriftlich);
                fertig = false;
            }
            schulerlist.next();
        }
    }

    public void listeSchuler ()
    {
        schulerlist.toFirst();
        while (schulerlist.getContent() != null)
        {
            System.out.println(schulerlist.getContent().getName());
            schulerlist.next();
        }
    }

    public String getLehrer (String name, String fach)
    {
        schulerlist.toFirst();
        while (schulerlist.getContent() != null)
        {
            if (schulerlist.getContent().getName() == name)
            {
                return schulerlist.getContent().getLehrer(fach);
            }
            schulerlist.next();
        }
        return "";
    }

    public String getKurs (String name, String fach)
    {
        schulerlist.toFirst();
        while (schulerlist.getContent() != null)
        {
            if (schulerlist.getContent().getName() == name)
            {
                return schulerlist.getContent().getKurs(fach);
            }
            schulerlist.next();
        }
        return "";
    }

    public String getSchriftlich (String name, String fach)
    {
        schulerlist.toFirst();
        while (schulerlist.getContent() != null)
        {
            if (schulerlist.getContent().getName() == name)
            {
                if (schulerlist.getContent().fachVorhanden(fach) == true)
                {
                    return String.valueOf(schulerlist.getContent().getSchriftlich(fach));
                }
                else{
                    return "Fach nicht vorhanden";
                }
            }
            schulerlist.next();
        }
        return "Schüler nicht vorhanden";
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
        return -1;
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
