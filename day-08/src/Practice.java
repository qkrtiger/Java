public class Practice {
    public void variableFinal() {
        final int value = 2;
        final Person person = new Person("사바라다", 29);

        System.out.println("value = " + value);
        System.out.println("person_1 = " + person);

        person.setAge(10);

    }//void end
}//class end

class Person {
    private String name;
    private int age;

    public void setAge(int i) {
    }
}
