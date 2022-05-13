package com.devsuperior.dsmovies.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePK id = new ScorePK();
	
	private Double values;
	
	public Score() {
	}

	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return values;
	}

	public void setValue(Double values) {
		this.values = values;
	}
	

}
