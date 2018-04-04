package instructions;

import datatypes.*;

public class Add extends Calculate {

	@Override
	protected void doCalc() {
		op1.add(op2);
	}

}
