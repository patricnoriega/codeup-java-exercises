public class Animal {
    private String name;
    private String species;

    public String getName() {
        return name;
    }

    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public String Roar (){
        return "my name is" + this.name + "Here me roar!!!!!! meow";
    }

//    public void Roar (){
//        System.out.println("my name is" + this.name + "Here me roar!!!!!! meow");
//    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal("Tony", "Tiger");

//        System.out.println(myAnimal.Roar());
//        myAnimal.Roar();
    }
}


