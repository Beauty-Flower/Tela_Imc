package br.senai.sp.jandira.model;

public class Imc {
	
	public double peso, altura, imc;
	
	public void calcular() {
		imc = peso / (altura * altura);
	}
	
	public void classificar() {
		if(imc < 18.5) {
			System.out.println("Abaixo do peso!");
		} else if(imc > 18.5 && imc < 25) {
			System.out.println("Peso ideal!");
		} else if(imc > 25 && imc < 30) {
			System.out.println("Levemente acima do peso!");
		} else if(imc > 30 && imc < 35) {
			System.out.println("Obesidade grau I!");
		} else if(imc > 35 && imc < 40) {
			System.out.println("Obesidade grau II (Severa)!");
		} else if(imc > 40 || imc == 40) {
			System.out.println("Obesidade grau III (Mórbida)!");
		}
	}
}
