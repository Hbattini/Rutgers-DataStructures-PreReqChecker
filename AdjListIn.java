package prereqchecker;

public class AdjListIn 
{
    private String[] ListID;
    private String[] ListCourseL;
    private String[] ListCourseR;

    public AdjListIn(String infile)
    {
        StdIn.setFile(infile);
        int num = StdIn.readInt();

        for(int x =0; x<num; x++)
        {
            ListID[x] = StdIn.readString();
        }

        int num2 = StdIn.readInt();
        int z = 0;
        for(int y = 0; y<num2; y++)
        {
            ListCourseL[y] = StdIn.readString();
            ListCourseR[z] = StdIn.readString();
            z++;
        }
    }

    public String[] getListID()
    {
        return ListID;
    }

    public String[] getListCourseL()
    {
        return ListCourseL;
    }

    public String[] getListCourseR()
    {
        return ListCourseR;
    }
    
}
