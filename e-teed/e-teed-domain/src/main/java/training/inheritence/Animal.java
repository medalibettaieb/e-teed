package training.inheritence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Animal
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Animal implements Serializable {

	   
	@Id
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Animal() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
