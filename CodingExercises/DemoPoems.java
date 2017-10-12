public class DemoPoems {
    public static void main(String[] args) {
        Poem poem1 = new Poem("boopie", 23);
        Couplet poem2 = new Couplet("shpoopie");
        Limerick poem3 = new Limerick("laboopies");
        Haiku poem4 = new Haiku("daaaaaaadadada");
        display(poem1);
        display(poem2);
        display(poem3);
        display(poem4);

    }

    public static void display(Poem p){
        System.out.println("Poem: " + p.getPoemName() + " Lines: " + p.getLines());
    }
}
