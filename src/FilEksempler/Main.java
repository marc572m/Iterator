package FilEksempler;

public class Main {

    public static void main(String[] args) {


        Person p = new Person("Joe", "Olsen", 1);
        Person p1 = new Person("Ole", "Jensen", 2);
        Person p2 = new Person("Olga", "Olsen", 3);
        Person p3 = new Person("Uffe", "Hansen", 4);
        Person person[] = {p, p1 ,p2 ,p3 };

        CollectionofNames cmpnyRepository = new CollectionofNames(person);

        for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
            Person per = (Person) iter.next();
            System.out.println("Name : " + per.toString());
        }
    }
}
