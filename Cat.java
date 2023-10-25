class Cat extends Animals{
    String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void sound() {
        System.out.println(name + " (a " + breed + " cat) meows");
    }

    public void eat() {
        System.out.println(name + " ate fish.");
    }
}
