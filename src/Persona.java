public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;
    public Persona(String n, String oc, int age){
        this.nombre = n;
        this.ocupacion = oc;
        this.edad = age;
    }
    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public void hacerLoSuyo() { System.out.println("En cuarentena"); }
}
