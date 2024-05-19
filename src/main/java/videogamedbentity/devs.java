package videogamedbentity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Entity
@Data
public class devs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long devsid;
	private String square;
	private String nintendo;
	private String sega;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<game> game = new HashSet<>();
}
