package datatypes;

public class LongWord implements Operand, Word {
	private Long value;
	
	public LongWord(Long value) {
		this.value = value;
	}

	@Override
	public Word getWord() {
		return this;
	}
	
	public String toString() {
		return (new String("Word: " + value));
	}

	@Override
	public Operand add(Operand b) {
		Word otherWord = b.getWord();
		LongWord lw = (LongWord) otherWord;
		Long l = this.value + lw.value;
		return (new LongWord(l));
	}

	@Override
	public Operand mul(Operand b) {
		Word otherWord = b.getWord();
		LongWord lw = (LongWord) otherWord;
		Long l = this.value * lw.value;
		return (new LongWord(l));
	}
}
