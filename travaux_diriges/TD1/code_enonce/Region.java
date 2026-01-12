package TD1.code_enonce;

/**
 * Classe représentant une région avec son climat et ses phénomènes météorologiques.
 */
public class Region {
    private String nom;
    private String typeClimat;
    private String phenomeneMeteo;

    /**
     * Constructeur de la classe Region.
     *
     * @param nom Le nom de la région.
     * @param typeClimat Le type de climat de la région.
     */
    public Region(String nom, String typeClimat) {
        this.nom = nom;
        this.typeClimat = typeClimat;
        switch (typeClimat) {
            case "tropical":
                phenomeneMeteo = "pluies";
                break;
            case "désertique":
                phenomeneMeteo = "canicules";
                break;
            case "polaire":
                phenomeneMeteo = "blizzards";
                break;
            case "tempéré":
                phenomeneMeteo = "brises";
                break;
            default:
                phenomeneMeteo = "inconnu";
                break;
        }
    }

    /**
     * Fournit une prévision météorologique basée sur le phénomène météorologique principal de la région.
     *
     * @return Une chaîne de caractères décrivant la prévision.
     */
    public String getPrevision() {
        String prevision;
        switch (phenomeneMeteo) {
            case "pluies":
                prevision = "Il va pleuvoir";
                break;
            case "canicules":
                prevision = "Il va y avoir une canicule";
                break;
            case "blizzards":
                prevision = "Il va y avoir du blizzard";
                break;
            case "brises":
                prevision = "Il y aura des brises légères";
                break;
            default:
                prevision = "prévisions non disponibles";
                break;
        }
        return prevision;
    }

    /**
     * Retourne le type de climat de la région.
     *
     * @return Le type de climat de la région.
     */
    public String getTypeClimat() {
        return typeClimat;
    }

    /**
     * Retourne le nom de la région.
     *
     * @return Le nom de la région.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Représentation en chaîne de caractères de la région.
     *
     * @return Une chaîne de caractères représentant le nom de la région et son climat.
     */
    @Override
    public String toString() {
        return this.getNom() + " - Climat " + this.getTypeClimat();

    }
}

