package edu.bu.met.cs665.mediator;

public class WasherController implements WasherColleague {

	private Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
		
	}

	public void start() {
		
		mediator.wash();
	}



	
}
