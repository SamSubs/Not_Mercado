/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ligic;

/**
 *
 * @author Sam
 */
public class Calculo {
    private float total = 0;
    private float coxinha = 0;
    private float empada = 0;

    // Métodos set para atribuir valores às variáveis
    public void setCoxinha(float valor) {
        this.coxinha = valor;
    }

    public void setEmpada(float valor) {
        this.empada = valor;
    }

    // Método para calcular o total
    public void calcularTotal() {
        total = coxinha + empada;
    }

    // Método get para acessar o total
    public float getTotal() {
        return total;
    }

    // Método get para acessar o valor da Coxinha
    public float getCoxinha() {
        return coxinha;
    }

    // Método get para acessar o valor da Empada
    public float getEmpada() {
        return empada;
    }

    public static void main(String[] args) {
        Calculo restaurante = new Calculo();

        // Definindo os preços dos itens
        restaurante.setCoxinha(5.50f); // Preço da Coxinha
        restaurante.setEmpada(6.00f); // Preço da Empada

        // Calculando o total
        restaurante.calcularTotal();

        // Exibindo os valores e o total
        System.out.println("Preço da Coxinha: R$ " + restaurante.getCoxinha());
        System.out.println("Preço da Empada: R$ " + restaurante.getEmpada());
        System.out.println("Total: R$ " + restaurante.getTotal());
    }
}
