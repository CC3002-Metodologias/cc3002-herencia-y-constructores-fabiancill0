public class Estudiante extends Persona{
    protected String nombre;
    protected String ocupacion;
    protected int edad;
    public Estudiante(String n, String oc, int age){
        super(n,oc,age);
    }
    public void comer() {
        System.out.println("Ñom Ñom completitos ricos");
    }

    public void dormir() {
        System.out.println("ZzzZzZ");
    }

    public void hacerLoSuyo() {
        super.hacerLoSuyo();
        System.out.println("Viendo Netflix y Anime");
    }
}
