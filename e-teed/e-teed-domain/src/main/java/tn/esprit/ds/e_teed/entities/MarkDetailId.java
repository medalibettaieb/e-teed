package tn.esprit.ds.e_teed.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class MarkDetailId implements Serializable {

	private int code;
	private int idCourse;
	private Date dateOfAssignement;

	private static final long serialVersionUID = 1L;

	public MarkDetailId() {
	}

	public MarkDetailId(int code, int idCourse) {
		super();
		this.code = code;
		this.idCourse = idCourse;
		this.dateOfAssignement = new Date();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}

	public Date getDateOfAssignement() {
		return dateOfAssignement;
	}

	public void setDateOfAssignement(Date dateOfAssignement) {
		this.dateOfAssignement = dateOfAssignement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((dateOfAssignement == null) ? 0 : dateOfAssignement.hashCode());
		result = prime * result + idCourse;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarkDetailId other = (MarkDetailId) obj;
		if (code != other.code)
			return false;
		if (dateOfAssignement == null) {
			if (other.dateOfAssignement != null)
				return false;
		} else if (!dateOfAssignement.equals(other.dateOfAssignement))
			return false;
		if (idCourse != other.idCourse)
			return false;
		return true;
	}

	

}
