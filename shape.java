package abstraction;
import java.util.*;
public abstract class shape
{
    int x,y;
    double radius;
    public abstract void CalculateArea();

    public void display()
    {
        System.out.println();
        CalculateArea();
    }
}
