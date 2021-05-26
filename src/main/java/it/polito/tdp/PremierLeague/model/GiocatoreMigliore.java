package it.polito.tdp.PremierLeague.model;

public class GiocatoreMigliore {

	Player p;
	double delta;
	public GiocatoreMigliore(Player p, double delta) {
		super();
		this.p = p;
		this.delta = delta;
	}
	public Player getP() {
		return p;
	}
	public void setP(Player p) {
		this.p = p;
	}
	public double getDelta() {
		return delta;
	}
	public void setDelta(double delta) {
		this.delta = delta;
	}
	@Override
	public String toString() {
		return "GiocatoreMigliore :" + p + " delta=" + delta ;
	}
	
}
