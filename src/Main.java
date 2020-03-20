public class Main {

    public static void main(String[] args) {
        Academico a = new Academico("Tomas", "Profesor", 50, "Mi paper pulento");
        Persona p = new Persona("Persona", "Ser Persona", 0);
        Persona e = new Estudiante("Fabian", "Estudiante online", 22);

        p.hacerLoSuyo();
        a.hacerLoSuyo();
        e.hacerLoSuyo();

        p.dormir();
        a.dormir();
        e.dormir();

        p.comer();
        a.comer();
        e.comer();

        a.publicarPaper();
    }
}
