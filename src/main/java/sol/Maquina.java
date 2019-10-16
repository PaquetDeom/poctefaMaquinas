package sol;

import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MAQUINA")
public class Maquina {

	@Id
	@GeneratedValue
	@Column
	private int id = 0;

	@Column(length = 50)
	private String name = null;

	@Column(length = 50)
	private String ipAdress = null;

	public Maquina() {
		super();
	}

	public Maquina(String name) {
		super();
		setName(name);
	}

	public Maquina(String name, String ipAdress) throws Exception {
		this(name);
		setIpAdress(ipAdress);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		name = name.trim().toUpperCase();
		this.name = name;
	}

	public String getIpAdress() {
		return ipAdress;
	}

	private void setIpAdress(String ipAdress) throws Exception {

		String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

		String IP_REGEXP = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

		Pattern IP_PATTERN = Pattern.compile(IP_REGEXP);

		if (IP_PATTERN.matcher(ipAdress).matches())
			this.ipAdress = ipAdress;
		else
			throw new Exception("Adress IP Invalide");
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

}
