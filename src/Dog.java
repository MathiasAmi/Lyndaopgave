public class Dog {
    String name;
    int age;
    String[] toys = {"Ball", "bone", "Toyanimal"};
    private int toyCounter = 0;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("Vovvov!");
    }

    public int getDogYears(){
        // vi vedtager at 1 hunde år svarer til 7 menneskeår
        return this.age * 7;
    }

    public void toy(){
        this.toyCounter = (this.toyCounter + 1) %3;
        String item = this.toys [this.toyCounter];
        System.out.println(name + " toy a " + item + ".");
    }
}

