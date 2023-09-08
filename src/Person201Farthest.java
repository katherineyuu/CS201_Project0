public class Person201Farthest {
    public static void main(String[] args) throws Exception {
        String file = "data/large.txt";
        Person201[] people = Person201Utilities.readFile(file);
        double max = 0;
        Person201 a = people[0];
        Person201 b = people[1];
        for (int i = 0; i < people.length; i++) {
            for (int j = i+1; j < people.length; j++) {
                double d = people[i].distanceFrom(people[j]);
                if (d > max) {
                    max = d;
                    a = people[i];
                    b = people[j]; 
                }
            }
        }
        System.out.printf("farthest distance is %3.2f between %s and %s\n",max,a.getName(),b.getName());
    }

}
