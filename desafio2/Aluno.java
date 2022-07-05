package br.com.gft.desafio2;

public class Aluno {
	private String matricula;
	private double nota1;
	private double nota2;
	private double nota3;
	private double frequencia;
	


	public Aluno(String matricula, double nota1, double nota2, double nota3, double frequencia) {
		super();
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.frequencia = frequencia;
	}

	
	
	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public double getNota1() {
		return nota1;
	}



	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}



	public double getNota2() {
		return nota2;
	}



	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}



	public double getNota3() {
		return nota3;
	}



	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}



	public double getFrequencia() {
		return frequencia;
	}



	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}



	public double MediaAluno(Aluno aluno) {
		double media = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3() / 3);
		return media;
	}
	
	public String Situacao(double media) {
		if(media >= 5 ) {
			String status = "Aprovado";
			return status;
		} else {
			String status = "Reprovado";
			return status;
		}
	}

}
