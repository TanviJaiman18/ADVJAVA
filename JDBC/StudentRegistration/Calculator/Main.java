public class Main {
    public static void main(String[]args){
        Cviews cv = new Cviews();
        Cmodels cm = new Cmodels();
        new Ccontroller(cm,cv);
        System.out.println("Calculator");
    }
}
