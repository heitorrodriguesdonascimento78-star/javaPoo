package br.com.exercicio_26set;

public class Estagiario extends Funcionario{

    private int horasTrabalhadas;

    private final Double valorHoraTrabalhada;

    public  Estagiario(String nome, String matricula, Double valorHoraTrabalhada){

        super(nome, matricula,salarioBase: 2.2);
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.horasTrabalhadas = 0;
    }

    public void registrarHoras(int horasTrabalhadas){
        this.horasTrabalhadas += horasTrabalhadas;
    }


    @Override
    public double calcularSalario(){
        return horasTrabalhadas * valorHoraTrabalhada;
    }
}
