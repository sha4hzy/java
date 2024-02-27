package abstraction;

public class circle extends shape
{
    public circle()
    {
        x=2;
        y=5;
        radius=5;
    }

    @Override
    public void CalculateArea()
    {
        double area=3.14*(radius*radius);
        System.out.println("Area is :"+area);
    }
}
