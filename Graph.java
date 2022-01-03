
package prereqchecker;

import java.util.*;

public class Graph<String> {
    private Map<String,ArrayList<String>> M = new HashMap<>();

    public void addClass(java.lang.String a)
    {
        M.put(a, new ArrayList<String>()) ;
    }

    public void addLink(String s, String d)
    {
        if (!M.containsValue(s))
            addClass(s);
 
        if (!M.containsValue(d))
            addClass(d);
 
    }

    public void hasClass(String x)
    {
        if(M.containsValue(x))
        {
            System.out.println("The graph contains the class " + x + ".");
        }
        else
        {
            System.out.println("The graph does not contian the class " + x +".");
        }
    }

    public void hasLink(String s, String d)
    {
        if(M.get(s).contains(d))
        {
            System.out.println("The graph contains a link between " + s +" "+ d +".");
        }
        else
        {
            System.out.println("The graph does not contain a link between " + s +" "+ d +".");
        }
    }

    public void makeAdjListGraph(AdjListIn c)
    {
        for(java.lang.String a : c.getListID())
        {
            addClass(a);
        }

        for(int x=0; x<c.getListCourseL().length; x++)
        {
            addLink(c.getListCourseL()[x],c.getListCourseR()[x]);
        }
    }

    
    public java.lang.String toString()
    {
        StringBuilder g = new StringBuilder();
        for(String a :M.keySet())
        {
            g.append(a + " ");
            for(String b:M.get(a))
            {
                g.append(b + " ");
            }
            g.append("\n");
        }
        
        return(g.toString());
    }
}
