package videogamedbentity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long gameid;
	private String Mario;
	private String Sonic;
	private String Zelda;
	private String FinalFantasy;
	private String Metroid;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToOne
	@JoinColumn(name = "devsid", nullable = false)
	private devs devs;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
			name = "genres",
			joinColumns = @JoinColumn(name = "devsid"),
			inverseJoinColumns = @JoinColumn(name = "genres")
)
	private Set<genres> genres = new HashSet<>();

	public static Long getgameid() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getSonic() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getMario() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getZelda() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getFinalFantasy() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getMetroid() {
		// TODO Auto-generated method stub
		return null;
	}

	public static game[] getgame() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
