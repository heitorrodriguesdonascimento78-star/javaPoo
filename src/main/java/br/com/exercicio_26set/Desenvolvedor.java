package br.com.exercicio_26set;

public class Desenvolvedor extends Funcionario{

    private int horasExtras;
    private Double valorHoraExtra;

    public Desenvolvedor(String nome, String matricula, int salarioBase, int horasExtras, Double valorHoraExtra){
        super(nome,matricula, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }


    @Override
    public double calcularSalario(){
        return salarioBase +(valorHoraExtra * horasExtras);
    }

    public void registraHorasExtra(int horasExtra){
        this.horasExtras += horasExtra;
    }
}
