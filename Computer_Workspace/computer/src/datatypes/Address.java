package datatypes;

public class Address implements Operand {
	
	private Word word;
	
	@Override
	public Word getWord() {
		return word;
	}
	
	public void setWord(Word w) {
		this.word = w;
	}

	@Override
	public Operand add(Operand b) {
		Word w1 = this.getWord();
		return w1.add(b);
	}

	@Override
	public Operand mul(Operand b) {
		Word w1 = this.getWord();
		return w1.mul(b);
	}
}

// Hej, nu testar jag!
