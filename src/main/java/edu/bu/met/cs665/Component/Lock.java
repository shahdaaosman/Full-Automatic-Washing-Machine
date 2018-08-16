package edu.bu.met.cs665.Component;

import edu.bu.met.cs665.mediator.WasherColleague;
import edu.bu.met.cs665.mediator.Mediator;

public class Lock implements WasherColleague{
	
	protected Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
		
	}
}
