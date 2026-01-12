package TD2.code_enonce;

public  class Vaisseau {
	private Arme monArme;
	public Vaisseau() {
		this.monArme=null;
	}
	public void simuler() {
		monArme.tirer();
	}
	public void setArme(Arme monArme) {
		this.monArme=monArme;
	};

}
