package com.kleegroup.formation.domain.administration.utilisateur;

import io.vertigo.dynamo.domain.stereotype.Field;
import io.vertigo.dynamo.domain.model.Entity;
import io.vertigo.dynamo.domain.model.URI;
import io.vertigo.dynamo.domain.util.DtObjectUtil;
/**
 * Attention cette classe est générée automatiquement !
 * Objet de données Role
 */
public final class Role implements Entity {

	/** SerialVersionUID. */
	private static final long serialVersionUID = 1L;

	private String rolCode;
	private String libelle;

	/** {@inheritDoc} */
	@Override
	public URI<Role> getURI() {
		return DtObjectUtil.createURI(this);
	}
	
	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'ROL_CODE'. 
	 * @return String rolCode <b>Obligatoire</b>
	 */
	@Field(domain = "DO_CODE", type = "ID", required = true, label = "ROL_CODE")
	public String getRolCode() {
		return rolCode;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'ROL_CODE'.
	 * @param rolCode String <b>Obligatoire</b>
	 */
	public void setRolCode(final String rolCode) {
		this.rolCode = rolCode;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Libellé'. 
	 * @return String libelle <b>Obligatoire</b>
	 */
	@Field(domain = "DO_LIBELLE", required = true, label = "Libellé")
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Libellé'.
	 * @param libelle String <b>Obligatoire</b>
	 */
	public void setLibelle(final String libelle) {
		this.libelle = libelle;
	}


	// Association : Utilisateur non navigable

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
