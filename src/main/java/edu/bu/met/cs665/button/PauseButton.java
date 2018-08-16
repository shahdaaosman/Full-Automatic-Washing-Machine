package edu.bu.met.cs665.button;

import edu.bu.met.cs665.mediator.WasherColleague;
import edu.bu.met.cs665.mediator.WasherMediator;

public class PauseButton implements WasherColleague{

	protected WasherMediator mediator;

	@Override
	public void setMediator(WasherMediator mediator) {
		this.mediator = mediator;
		
	}

}
