package instructions;

import datatypes.*;

public abstract class Calculate implements Instruction {
	protected Operand op1;
	protected Operand op2;
	protected Address dest;
	
	public void execute(Memory mem, ProgramConuter pc) {
		doCalc();
	}
	protected  abstract void doCalc();
}
