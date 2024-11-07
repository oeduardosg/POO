public class Person {

    private String name;
    private Person father, mother;
    private short age;

    //Constructor

    public Person(String name, short age) {
        this.name = name;
        this.age = age;
    }

    //Setters

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    //Getters

    public String getName() {
        return this.name;
    }

    public Person getMother() {
        if(this.mother != null) return this.mother;
        System.out.println(this.name + " has no mother.");
        return null;
    }

    public Person getFather() {
        if(this.father != null) return this.father;
        System.out.println(this.name + " has no father.");
        return null;
    }

    public short getAge() {
        return this.age;
    }

    //Others

    public String toString() {
        return this.getName();
    }

}

