public class Main {


    public static void main(String[] args) {
        Person person = new Person("Ryan",30,"male",new String[] { "being a hardarse","agile", "ssd hard drives"});
        String greeting = person.hello();
        System.out.println(greeting);
    }

}
