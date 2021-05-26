package it.polito.tdp.PremierLeague.model;

public class Adiacenza {

	Player p1;
	Player p2;
	double peso;
	public Adiacenza(Player p1, Player p2, double peso) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.peso = peso;
	}
	public Player getP1() {
		return p1;
	}
	public void setP1(Player p1) {
		this.p1 = p1;
	}
	public Player getP2() {
		return p2;
	}
	public void setP2(Player p2) {
		this.p2 = p2;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Adiacenza [p1=" + p1 + ", p2=" + p2 + ", peso=" + peso + "]";
	}
	
}
