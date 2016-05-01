package splett.preferencia;

public enum Preferencia {
	PROPRIA_CASA("Prefiro cuidar na minha pr�pria casa"), CASA_DONO(
			"Prefiro cuidar na casa do dono"), NENHUMA("N�o tenho prefer�ncias");

	private String label;

	private Preferencia(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return this.label;
	}
}
