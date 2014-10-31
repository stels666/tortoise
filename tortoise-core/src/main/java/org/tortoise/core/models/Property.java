package org.tortoise.core.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "property")
public class Property extends ModelObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1816066695231575494L;

	private String name;
	
	private String value;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Override
	public Long getId() {
		return super.getId();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
