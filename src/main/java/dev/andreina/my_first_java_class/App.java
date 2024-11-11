package dev.andreina.my_first_java_class;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
    Person person1=  new Person("Andreina", "Arias", "Z1519988P", 1986, "Venezuela", 'M');
    Person person2=  new Person("Oriana", "Gonzalez", "Z1856374H", 1993, "España", 'M');
    

    System.out.println("Information of Person 1:");
        person1.mostrar();

        System.out.println("Information of Person 2:");
        person2.mostrar();

}
}
