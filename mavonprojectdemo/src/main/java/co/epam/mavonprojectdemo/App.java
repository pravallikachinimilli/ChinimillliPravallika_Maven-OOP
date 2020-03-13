package co.epam.mavonprojectdemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Chocolates c = new Chocolates(100, 50,"5Star");
        Chocolates co1 = new Chocolates(50, 25, "Perk");
        Chocolates co2 = new Chocolates(25, 10, "Kit-kat");
        Chocolates co3 = new Chocolates(120, 60, "DairyMilk");
        Sweets s0 = new Sweets(10,20);
        Sweets s1 = new Sweets(40,80);
        Sweets s2 = new Sweets(50,100);
        Gifts g = new Gifts();
        System.out.println("Total weight = "+g.getWt());
        System.out.println("Sorting based on the price");
        c.sorting();
        c.chocInRangeOf(10,60);
    }
}
