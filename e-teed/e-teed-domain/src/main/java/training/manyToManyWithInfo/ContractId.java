package training.manyToManyWithInfo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class ContractId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idPlayer;
	private int idTeam;
	private Date signatureDate;

	public ContractId() {
	}

	public ContractId(int idPlayer, int idTeam) {
		super();
		this.idPlayer = idPlayer;
		this.idTeam = idTeam;
		this.signatureDate = new Date();
	}

	public int getIdPlayer() {
		return idPlayer;
	}

	public void setIdPlayer(int idPlayer) {
		this.idPlayer = idPlayer;
	}

	public int getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}

	public Date getSignatureDate() {
		return signatureDate;
	}

	public void setSignatureDate(Date signatureDate) {
		this.signatureDate = signatureDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPlayer;
		result = prime * result + idTeam;
		result = prime * result + ((signatureDate == null) ? 0 : signatureDate.hashCode());
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
		ContractId other = (ContractId) obj;
		if (idPlayer != other.idPlayer)
			return false;
		if (idTeam != other.idTeam)
			return false;
		if (signatureDate == null) {
			if (other.signatureDate != null)
				return false;
		} else if (!signatureDate.equals(other.signatureDate))
			return false;
		return true;
	}

}
