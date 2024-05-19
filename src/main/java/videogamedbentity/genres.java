package videogamedbentity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class genres {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long genres;
	private String action;
	private String platformers;
	private String rpg;
	private String adventure;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(mappedBy = "game")
	private Set<game> game = new HashSet<>();
}
