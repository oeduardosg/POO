public class Empresa {

    private String name;
    private java.util.LinkedList<Departamento> departments;

    public Empresa(String name) {
        this.name = name;
        this.departments = new java.util.LinkedList<Departamento>();

    }

    public void addDepartamento(Departamento d) {
        this.departments.add(d);
    }

    public java.util.LinkedList<Departamento> getDepartamentos() {
        return this.departments;
    }

    public String toString() {
        return this.name;
    }

    
}