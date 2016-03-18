package fr.afcepf.al26.ria.rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * class toto.
 */
@XmlRootElement(name = "personne")
public class Toto {
    /**
     * id.
     */
    private int id;
    /**
     * nom.
     */
    private String nom;
    /**
     * prenom.
     */
    private String prenom;

    /**
     * constructor.
     */
    public Toto() {
    }

    /**
     * constructor with params.
     * @param paramId id.
     * @param paramNom nom.
     * @param paramPrenom prenom.
     */
    public Toto(int paramId, String paramNom, String paramPrenom) {
        id = paramId;
        nom = paramNom;
        prenom = paramPrenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int paramId) {
        id = paramId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String paramNom) {
        nom = paramNom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String paramPrenom) {
        prenom = paramPrenom;
    }
}
