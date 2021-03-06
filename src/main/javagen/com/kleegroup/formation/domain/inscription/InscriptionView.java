package com.kleegroup.formation.domain.inscription;

import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.model.DtObject;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
/**
 * Attention cette classe est générée automatiquement !
 * Objet de données InscriptionView
 */
public final class InscriptionView implements DtObject {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1L;

	private Long sesId;
	private String formationName;
	private java.util.Date dateDebut;
	private java.util.Date dateFin;
	private String horaires;
	private Long duree;
	private String niveau;
	private String commentaire;
	private java.math.BigDecimal satisfaction;
	private Boolean presence;
	private String nom;
	private String prenom;

	
	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'SesId'. 
	 * @return Long sesId 
	 */
	@Field(domain = "DO_IDENTIFIANT", label = "SesId")
	public Long getSesId() {
		return sesId;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'SesId'.
	 * @param sesId Long 
	 */
	public void setSesId(final Long sesId) {
		this.sesId = sesId;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Libellé court'. 
	 * @return String formationName 
	 */
	@Field(domain = "DO_LIBELLE_COURT", label = "Libellé court")
	public String getFormationName() {
		return formationName;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Libellé court'.
	 * @param formationName String 
	 */
	public void setFormationName(final String formationName) {
		this.formationName = formationName;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Début'. 
	 * @return java.util.Date dateDebut 
	 */
	@Field(domain = "DO_DATE_MINUTE", label = "Début")
	public java.util.Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Début'.
	 * @param dateDebut java.util.Date 
	 */
	public void setDateDebut(final java.util.Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Fin'. 
	 * @return java.util.Date dateFin 
	 */
	@Field(domain = "DO_DATE_MINUTE", label = "Fin")
	public java.util.Date getDateFin() {
		return dateFin;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Fin'.
	 * @param dateFin java.util.Date 
	 */
	public void setDateFin(final java.util.Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Horaires'. 
	 * @return String horaires 
	 */
	@Field(domain = "DO_LIBELLE_LONG", label = "Horaires")
	public String getHoraires() {
		return horaires;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Horaires'.
	 * @param horaires String 
	 */
	public void setHoraires(final String horaires) {
		this.horaires = horaires;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Durée'. 
	 * @return Long duree 
	 */
	@Field(domain = "DO_IDENTIFIANT", label = "Durée")
	public Long getDuree() {
		return duree;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Durée'.
	 * @param duree Long 
	 */
	public void setDuree(final Long duree) {
		this.duree = duree;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Niveau'. 
	 * @return String niveau 
	 */
	@Field(domain = "DO_LIBELLE_COURT", label = "Niveau")
	public String getNiveau() {
		return niveau;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Niveau'.
	 * @param niveau String 
	 */
	public void setNiveau(final String niveau) {
		this.niveau = niveau;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Descriptif'. 
	 * @return String commentaire 
	 */
	@Field(domain = "DO_LIBELLE_LONG", label = "Descriptif")
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Descriptif'.
	 * @param commentaire String 
	 */
	public void setCommentaire(final String commentaire) {
		this.commentaire = commentaire;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Satisfaction'. 
	 * @return java.math.BigDecimal satisfaction 
	 */
	@Field(domain = "DO_STATIQUE", label = "Satisfaction")
	public java.math.BigDecimal getSatisfaction() {
		return satisfaction;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Satisfaction'.
	 * @param satisfaction java.math.BigDecimal 
	 */
	public void setSatisfaction(final java.math.BigDecimal satisfaction) {
		this.satisfaction = satisfaction;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Présence'. 
	 * @return Boolean presence 
	 */
	@Field(domain = "DO_OUI_NON", label = "Présence")
	public Boolean getPresence() {
		return presence;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Présence'.
	 * @param presence Boolean 
	 */
	public void setPresence(final Boolean presence) {
		this.presence = presence;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Nom'. 
	 * @return String nom 
	 */
	@Field(domain = "DO_LIBELLE", label = "Nom")
	public String getNom() {
		return nom;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Nom'.
	 * @param nom String 
	 */
	public void setNom(final String nom) {
		this.nom = nom;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Prénom'. 
	 * @return String prenom 
	 */
	@Field(domain = "DO_LIBELLE", label = "Prénom")
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Prénom'.
	 * @param prenom String 
	 */
	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	//Aucune Association déclarée

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
