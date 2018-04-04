package datatypes;

public interface Operand {
	public Word getWord();
	public String toString();
	public Operand add(Operand b);
	public Operand mul(Operand b);
}
