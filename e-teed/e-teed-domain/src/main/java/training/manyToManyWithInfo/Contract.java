package training.manyToManyWithInfo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Contract
 *
 */
@Entity

public class Contract implements Serializable {

	@EmbeddedId
	private ContractId contractId;
	private Date startDate;
	private int duration;

	@ManyToOne
	@JoinColumn(name="idPlayer",referencedColumnName="id",updatable=false,insertable=false)
	private Player player;

	@ManyToOne
	@JoinColumn(name="idTeam",referencedColumnName="id",updatable=false,insertable=false)
	private Team team;
	private static final long serialVersionUID = 1L;

	public Contract() {
		super();
	}

	public Contract(Date startDate, int duration, Player player, Team team) {
		super();
		this.startDate = startDate;
		this.duration = duration;
		this.player = player;
		this.team = team;
		this.contractId=new ContractId(player.getId(), team.getId());
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public ContractId getContractId() {
		return contractId;
	}

	public void setContractId(ContractId contractId) {
		this.contractId = contractId;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
