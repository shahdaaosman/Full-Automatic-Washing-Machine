package edu.bu.met.cs665.mediator;

public class WasherController implements WasherColleague {

	private WasherMediator mediator;

	@Override
	public void setMediator(WasherMediator mediator) {
		this.mediator = mediator;
		
	}

}
