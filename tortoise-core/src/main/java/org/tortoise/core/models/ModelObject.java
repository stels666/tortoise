package org.tortoise.core.models;

import java.io.Serializable;

public class ModelObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4289629584782586119L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
