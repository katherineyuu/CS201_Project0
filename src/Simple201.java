/**
 * Demo of Person201 objects for Compsci 201 @ Duke
 * @author Owen Astrachan
 * This versions new in Fall 2023
 */
public class Simple201 {
    public static void main(String[] args) {
        Person201 a = new Person201("owen",35.9940,-78.8986,"woto");
        Person201 b = new Person201("ricardo",46.9994, -122.3921,"harambee");
        Person201 c = new Person201("julie",40.7081,-73.9571,"hello");
        Person201[] people = {a,b,c, new Person201()};

        for(Person201 p : people) {
            System.out.println(p);
        }
        System.out.printf("names: ");
        for(Person201 p : people) {
            System.out.print(p.getName()+" ");
        }
        System.out.println();
    }
}
