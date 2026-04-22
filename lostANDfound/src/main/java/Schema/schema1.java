package Schema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class schema1 {
	@JsonProperty(access=JsonProperty.Access.READ_ONLY)
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	

}
