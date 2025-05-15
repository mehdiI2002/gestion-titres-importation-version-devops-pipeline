package org.gestiondestitresimportationbcp.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlTransient;
import org.gestiondestitresimportationbcp.models.TitreImportationId;

import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class TitreImportation  {
    @EmbeddedId
    private TitreImportationId id;
@Column
   @XmlElement(name = "Categorie")
    private int Categorie;
    @Transient
    @XmlElement(name="NumEnregistrement")
    private Long numEnregistrement;

    @Column
    @XmlElement(name ="TypeDemande")
    private int typeDedmande;
    @Column
    private String etat = "non traité";

@Column
    @XmlElement(name  = "Importateur")
    private String importateur;

@Column
    @XmlElement(name = "Expediteur")
    private String expediteur;

@Column
    @XmlElement(name = "RegimeDouanier")
    private int regimeDouanier;

@Column
    @XmlElement(name = "BureauDouanier")
    private int bureauDouanier ;

@Column
    @XmlElement(name = "MontantTotal")
    private double  montantTotale;

@Column
    @XmlElement(name = "MontantFOB")
    private double montantFOB;

@Column
    @XmlElement(name="MontantFret")
    private double motantFret;

@Column
    @XmlElement(name = "MontantAssuranceAcessoires")
    private String montantAssuranceAcessoires;

@Column
    @XmlElement(name = "Devise")
    private String devise;
@Column
    @XmlElement(name = "ConditionsLivraison")
    private int  ConditionsLivraison;

@Column
    @XmlElement(name = "Incoterm")
    private String incotermString;
@XmlTransient
@Column
private Date dateReception;
@XmlTransient
@Column
private Date dateTraitement;

@XmlTransient
@ManyToOne
private Operator operator;
@XmlTransient
@OneToOne
private Message message ;

@XmlTransient
@ManyToOne
private Banque banque;
@XmlTransient
@OneToOne
    private MarchandiseInfo marchandiseInfo;
    @OneToOne
    @XmlElement(name = "PaysProvenanceInfo", namespace = "http://portnet.ma/DemandeDomiciliation")
    private PaysProvenanceInfo paysProvenanceInfo;

    public TitreImportation() {
    }

    public TitreImportation(TitreImportationId id, int categorie, Long numEnregistrement, int typeDedmande, String etat, String importateur, String expediteur, int regimeDouanier, int bureauDouanier, double montantTotale, double montantFOB, double motantFret, String montantAssuranceAcessoires, String devise, int conditionsLivraison, String incotermString, Date dateReception, Date dateTraitement, Operator operator, Message message, Banque banque, MarchandiseInfo marchandiseInfo, PaysProvenanceInfo paysProvenanceInfo) {
        this.id = id;
        Categorie = categorie;
        this.numEnregistrement = numEnregistrement;
        this.typeDedmande = typeDedmande;
        this.etat = etat;
        this.importateur = importateur;
        this.expediteur = expediteur;
        this.regimeDouanier = regimeDouanier;
        this.bureauDouanier = bureauDouanier;
        this.montantTotale = montantTotale;
        this.montantFOB = montantFOB;
        this.motantFret = motantFret;
        this.montantAssuranceAcessoires = montantAssuranceAcessoires;
        this.devise = devise;
        ConditionsLivraison = conditionsLivraison;
        this.incotermString = incotermString;
        this.dateReception = dateReception;
        this.dateTraitement = dateTraitement;
        this.operator = operator;
        this.message = message;
        this.banque = banque;
        this.marchandiseInfo = marchandiseInfo;
        this.paysProvenanceInfo = paysProvenanceInfo;
    }

    public Operator getOperator() {
        return operator;
    }

    public Long getNumEnregistrement() {
        return numEnregistrement;
    }

    public int getCategorie() {
        return Categorie;
    }

    public int getTypeDedmande() {
        return typeDedmande;
    }

    public String getImportateur() {
        return importateur;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public int getRegimeDouanier() {
        return regimeDouanier;
    }

    public int getBureauDouanier() {
        return bureauDouanier;
    }

    public double getMontantTotale() {
        return montantTotale;
    }

    public double getMontantFOB() {
        return montantFOB;
    }

    public double getMotantFret() {
        return motantFret;
    }

    public String getMontantAssuranceAcessoires() {
        return montantAssuranceAcessoires;
    }

    public String getDevise() {
        return devise;
    }

    public int getConditionsLivraison() {
        return ConditionsLivraison;
    }

    public String getIncotermString() {
        return incotermString;
    }

    public void setNumEnregistrement(Long numEnregistrement) {
        this.numEnregistrement = numEnregistrement;
    }

    public void setCategorie(int categorie) {
        Categorie = categorie;
    }

    public void setTypeDedmande(int typeDedmande) {
        this.typeDedmande = typeDedmande;
    }

    public void setImportateur(String importateur) {
        this.importateur = importateur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public void setRegimeDouanier(int regimeDouanier) {
        this.regimeDouanier = regimeDouanier;
    }

    public void setBureauDouanier(int bureauDouanier) {
        this.bureauDouanier = bureauDouanier;
    }

    public void setMontantTotale(double montantTotale) {
        this.montantTotale = montantTotale;
    }

    public void setMontantFOB(double montantFOB) {
        this.montantFOB = montantFOB;
    }

    public void setMotantFret(double motantFret) {
        this.motantFret = motantFret;
    }

    public void setMontantAssuranceAcessoires(String montantAssuranceAcessoires) {
        this.montantAssuranceAcessoires = montantAssuranceAcessoires;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public void setConditionsLivraison(int conditionsLivraison) {
        ConditionsLivraison = conditionsLivraison;
    }

    public void setIncotermString(String incotermString) {
        this.incotermString = incotermString;
    }

    public PaysProvenanceInfo getPaysProvenanceInfo() {
        return paysProvenanceInfo;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }



    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public void setMarchandiseInfo(MarchandiseInfo marchandiseInfo) {
        this.marchandiseInfo = marchandiseInfo;
    }

    public MarchandiseInfo getMarchandiseInfo() {
        return marchandiseInfo;
    }

    public void setPaysProvenanceInfo(PaysProvenanceInfo paysProvenanceInfo) {
        this.paysProvenanceInfo = paysProvenanceInfo;
    }

    public void setId(TitreImportationId id) {
        this.id = id;
    }

    public TitreImportationId getId() {
        return id;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getEtat() {
        return etat;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public Date getDateTraitement() {
        return dateTraitement;
    }

    public void setDateTraitement(Date dateTraitement) {
        this.dateTraitement = dateTraitement;
    }
}


