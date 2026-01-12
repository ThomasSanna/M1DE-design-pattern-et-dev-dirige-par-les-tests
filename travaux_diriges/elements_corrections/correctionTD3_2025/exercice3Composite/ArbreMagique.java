package exercice3Composite;

	import java.util.ArrayList;
	import java.util.List;

	public class ArbreMagique {
	    private String nom;
	    private List<Nid> nids = new ArrayList<>();

	    public ArbreMagique(String nom) {
	        this.nom = nom;
	    }

	    public void ajouterNid(Nid nid) {
	        nids.add(nid);
	    }

	    public void interagirAvecTousLesNids(Personnage personnage) {
	        for (int i=0;i<nids.size();i++) {
	        	System.out.println("-Interaction avec le nid N° "+ (i+1) + " : "+ nids.get(i));
	        	nids.get(i).interagir(personnage);;
	        }
	    }

	    public void interagirAvecNidSpecifique(Personnage personnage, int index) {
	        if (index >= 0 && index < nids.size()) {
	        	System.out.println(" : " +nids.get(index));
	            nids.get(index).interagir(personnage);
	        } else {
	            System.out.println("Index de nid invalide.");
	        }
	    }
	    
	    public String toString() {
	    	String msg=nom;
	    	if (nids.size()==0) {
	    		msg+= " qui ne contient aucun nid";
	    	}
	    	else
	    		msg+=" qui contient " + nids.size() + " nids";
	    	return msg;
	    }
	    
	    public void afficherNids() {
	        for (int i=0;i<nids.size();i++) {
	        	System.out.println("Nid N° "+ (i+1) + " : "+ nids.get(i));
	    	}
	    	
	    }
	}

