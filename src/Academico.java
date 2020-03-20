public class Academico extends Persona{
    protected String nombre;
    protected String ocupacion;
    protected int edad;
    protected String paper;
    public Academico(String n, String oc, int age, String p){
        super(n,oc,age);
        this.paper = p;
    }
    public void comer() {
        super.comer();
    }

    public void dormir() {
        System.out.println("ZzzZzZz");
    }

    public void hacerLoSuyo() {
        super.hacerLoSuyo();
        System.out.println("Aprendiendo a Ocupar Zoom");
    }

    public void publicarPaper() {
        System.out.println(this.paper);}

}
