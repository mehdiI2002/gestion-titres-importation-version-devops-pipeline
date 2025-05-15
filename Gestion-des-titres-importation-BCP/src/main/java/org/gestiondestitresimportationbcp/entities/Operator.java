package org.gestiondestitresimportationbcp.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.gestiondestitresimportationbcp.models.OperatorId;

import java.util.ArrayList;
import java.util.List;

@Entity
@XmlAccessorType(XmlAccessType.FIELD)
public class Operator {
    @EmbeddedId
    private OperatorId id ;
    @XmlElement(name="IdFiscalUnique")
    private long idFiscalUnique;
    @XmlElement(name = "Nom")
    private String nom;

    @XmlElement(name = "Centre")
private int centre ;
    @XmlElement(name = "TypeIdentification")
private String typeIdentification;
@Transient
    @XmlElement(name = "NumIdentification")
private long numIdentification;
    @XmlElement(name = "IdentifiantDouane")
private long identifiantDouane;
    @XmlElement(name = "RibBancaire")
private String ribBancaire ;

    @OneToMany(mappedBy = "operator")

    private List<TitreImportation> titresImportations ;

    public Operator() {
        titresImportations = new ArrayList<>();
    }


    public Operator(OperatorId id, long idFiscalUnique, String nom, int centre, String typeIdentification, long numIdentification, long identifiantDouane, String ribBancaire) {
        this.id = id;
        this.idFiscalUnique = idFiscalUnique;
        this.nom = nom;
        this.centre = centre;
        this.typeIdentification = typeIdentification;
        this.numIdentification = numIdentification;
        this.identifiantDouane = identifiantDouane;
        this.ribBancaire = ribBancaire;

    }

    public long getIdentifiantDouane() {
        return identifiantDouane;
    }

    public long getIdFiscalUnique() {
        return idFiscalUnique;
    }

    public String getNom() {
        return nom;
    }

    public int getCentre() {
        return centre;
    }

    public String getTypeIdentification() {
        return typeIdentification;
    }

    public long getNumIdentification() {
        return numIdentification;
    }

    public String getRibBancaire() {
        return ribBancaire;
    }

    public void setIdFiscalUnique(long idFiscalUnique) {
        this.idFiscalUnique = idFiscalUnique;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCentre(int centre) {
        this.centre = centre;
    }

    public void setTypeIdentification(String typeIdentification) {
        this.typeIdentification = typeIdentification;
    }

    public void setNumIdentification(long numIdentification) {
        this.numIdentification = numIdentification;
    }

    public void setIdentifiantDouane(long identifiantDouane) {
        this.identifiantDouane = identifiantDouane;
    }

    public void setRibBancaire(String  ribBancaire) {
        this.ribBancaire = ribBancaire;
    }

    public void setTitresImportations(List<TitreImportation> titresImportations) {
        this.titresImportations = titresImportations;
    }
    public void setId(OperatorId id) {
        this.id = id;
    }

    public List<TitreImportation> getTitresImportations() {
        return titresImportations;
    }

    public OperatorId getId() {
        return id;
    }
}
