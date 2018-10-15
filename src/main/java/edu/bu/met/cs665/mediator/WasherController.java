package edu.bu.met.cs665.mediator;

public class WasherController implements WasherColleague {

	private Mediator mediator;

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
		
	}

	protected boolean pauseButton = false;
	
	
	public void start() {
	
		mediator.wash();
		
		if (pauseButton == true) {
			mediator.pause();
		}
	}

	


	
}
