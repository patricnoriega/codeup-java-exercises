public class SuperHero extends Person {
    private String alterego;

    public SuperHero(String govermentname, String alterego){
        super(govermentname);
        this.alterego = alterego;
    }

    public String getName(){
        return alterego;
    }

    public String getsecretidentity(){
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");
        System.out.println("theManOfSteel.getName() = " + theManOfSteel.getName());

        System.out.println("theManOfSteel.getsecretidentity() = " + theManOfSteel.getsecretidentity());
    }
}
