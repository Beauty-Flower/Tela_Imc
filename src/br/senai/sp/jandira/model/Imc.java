package br.senai.sp.jandira.model;

public class Imc {
	
	private double peso, altura;
	
	public double calcular() {
		double imc = peso / Math.pow(altura, 2);
		return imc;
	}
	
	public String mostrarImcComoString() {
		return String.valueOf(calcular());
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = Double.parseDouble(peso);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = Double.parseDouble(altura);
	}

	public String classificar() {
		if(calcular() < 18.5) {
			return "Abaixo do peso!";
		} else if(calcular() > 18.5 && calcular() < 25) {
			return "Peso ideal!";
		} else if(calcular() > 25 && calcular() < 30) {
			return "Levemente acima do peso!";
		} else if(calcular() > 30 && calcular() < 35) {
			return "Obesidade grau I!";
		} else if(calcular() > 35 && calcular() < 40) {
			return "Obesidade grau II (Severa)!";
		} else {
			return "Obesidade III (Mórbida)!";
		}
	}
		
}
