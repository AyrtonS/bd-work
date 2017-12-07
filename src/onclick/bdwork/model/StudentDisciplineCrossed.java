package onclick.bdwork.model;

public class StudentDisciplineCrossed {

	private int matriculaAluno;
	private int disciplinaCodigo;
	private String periodo;
	private double nota;
	private int frequencia;

	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public int getDisciplinaCodigo() {
		return disciplinaCodigo;
	}

	public void setDisciplinaCodigo(int disciplinaCodigo) {
		this.disciplinaCodigo = disciplinaCodigo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

}
