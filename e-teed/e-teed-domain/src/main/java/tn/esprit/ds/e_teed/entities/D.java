package tn.esprit.ds.e_teed.entities;

import java.io.Serializable;
import javax.persistence.*;

import training.oneToOneUni.C;

/**
 * Entity implementation class for Entity: D
 *
 */
@Entity

public class D implements Serializable {

	   
	@Id
	private int idD;
	
	@OneToOne
	private C c;
	private static final long serialVersionUID = 1L;

	public D() {
		super();
	}   
	public int getIdD() {
		return this.idD;
	}

	public void setIdD(int idD) {
		this.idD = idD;
	}
	public C getC() {
		return c;
	}
	public void setC(C c) {
		this.c = c;
	}
   
}
