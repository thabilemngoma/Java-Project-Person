import java.util.Arrays;

public class Person {
    String name;
    int age;
    String gender;
    String[] interests ;

    Person (String name, int age,String gender, String[]interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }

    public String hello(){
        return "Hello, my name is " +name+ " and I am " +age+ " years old " +gender+ ". My interests are "+ interests();
    }
    public String interests(){
        String list = "";
        for(int i = 0;i < interests.length;i++) {
            if (i == 0) {
                list = list + interests[i];
            }
            else if (i >= 1 && i <= interests.length-2) {
                list = list+", "+ interests[i];
            }
            else {
                list = list + " and " + interests[i];
            }

        }
        return list;
    }
}
