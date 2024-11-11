package dev.andreina.my_first_java_class;


// 1. Clase Person
public class Person {
    private String firstName;
    private String lastName;
    private String documentId;
    private int yearOfBirth;
    private String countryOfBirth;
    private char gender;
    
    // 2. Constructor de la clase: el constructor hace referencia a mi clase
    public Person (String firstName, String lastName, String documentId, int yearOfBirth, String countryOfBirth, char gender) 
        {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentId = documentId;
        this.yearOfBirth = yearOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;

        }

         //3. Metodo mostrar: para ver en consola:
            public void mostrar() {
            System.out.println("Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Document ID: " + documentId);
            System.out.println("Year of birth: " + yearOfBirth);
            System.out.println("Country of birth: " + countryOfBirth);
            System.err.println("Gender: " + gender);
        }

        public String getFirstName() {
            return firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public String getDocumentId() {
            return documentId;
        }
    
        public int getYearOfBirth() {
            return yearOfBirth;
        }
    
        public String getCountryOfBirth() {
            return countryOfBirth;
        }
    
        public char getGender() {
            return gender;
        }
    }

