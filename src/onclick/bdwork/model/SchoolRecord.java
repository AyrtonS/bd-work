package onclick.bdwork.model;

public class SchoolRecord {

	private String nome;
	private int codDisciplina;
	private String disciplina;
	private String periodo;
	private double nota;
	private int frenquencia;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
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

	public int getFrenquencia() {
		return frenquencia;
	}

	public void setFrenquencia(int frenquencia) {
		this.frenquencia = frenquencia;
	}

}
