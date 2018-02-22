package training.manyToManyBi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: W
 *
 */
@Entity

public class W implements Serializable {

	@Id
	private int idW;

	@ManyToMany(mappedBy="ws")
	private List<Z> zs;
	private static final long serialVersionUID = 1L;

	public W() {
		super();
	}

	public int getIdW() {
		return this.idW;
	}

	public void setIdW(int idW) {
		this.idW = idW;
	}

	public List<Z> getZs() {
		return zs;
	}

	public void setZs(List<Z> zs) {
		this.zs = zs;
	}

}
