package edu.bu.met.cs665.Component;

import edu.bu.met.cs665.mediator.WasherColleague;
import edu.bu.met.cs665.mediator.WasherMediator;

public class Agitator implements WasherColleague {

	protected WasherMediator mediator;

	@Override
	public void setMediator(WasherMediator mediator) {
		this.mediator = mediator;
		
	}

}
