public class Rectangle {
    private Point corner;
    private int lon;
    private int larg;

    public  Rectangle(double x, double y, int lon, int larg)
        {
            corner = new Point(x,y);
            this.lon =lon;
            this.larg = larg;

        }
    public int perimetre()
    {
        return(lon + larg)*2;
    }

    public int surface()
    {
        return(lon*larg);
    }
}
