public class App {
    
    public static void main(String[] args) {
        
        Person joao = new Person("João", (short)10);
        Person maria = new Person("Maria", (short)10);

        Person pedro = new Person("Pedro", (short)32);
        Person ana = new Person("Ana", (short)31);

        Person jose = new Person("José", (short)58);
        Person cecilia = new Person("Cecília", (short)55);

        Person carlos = new Person("Carlos", (short)67);
        Person isamara = new Person("Isamara", (short)64);

        Person josefo = new Person("Joséfo", (short)89);
        Person josefina = new Person("Josefina", (short)85);

        joao.setFather(pedro);
        maria.setFather(pedro);
        joao.setMother(ana);
        maria.setMother(ana);

        pedro.setFather(jose);
        pedro.setMother(cecilia);

        ana.setFather(carlos);
        ana.setMother(isamara);

        jose.setFather(josefo);
        jose.setMother(josefina);

        System.out.println(carlos.getFather().getFather().getName());

    }

}
