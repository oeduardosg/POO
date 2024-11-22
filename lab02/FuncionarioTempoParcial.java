public class FuncionarioTempoParcial extends Funcionario {

    private int workHours;

    public FuncionarioTempoParcial(String name, float salary) {
        super(name, salary);
    }

    public void setNumeroHorasSemanais(int workHours) {
        this.workHours = workHours;
    }

    public int getHoras() {
        return this.workHours;
    }

}