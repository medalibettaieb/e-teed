package training.manyToManyBi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Z
 *
 */
@Entity

public class Z implements Serializable {

	   
	@Id
	private int idZ;
	
	@ManyToMany
	private List<W> ws;
	private static final long serialVersionUID = 1L;

	public Z() {
		super();
	}   
	public int getIdZ() {
		return this.idZ;
	}

	public void setIdZ(int idZ) {
		this.idZ = idZ;
	}
	public List<W> getWs() {
		return ws;
	}
	public void setWs(List<W> ws) {
		this.ws = ws;
	}
   
}
