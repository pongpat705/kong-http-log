
package com.maoz.tcp.log.model;

import java.util.HashMap;
import java.util.Map;

public class Consumer {

    private String username;
    private Integer createdAt;
    private String id;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Consumer [username=" + username + ", createdAt=" + createdAt + ", id=" + id + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
