
package com.maoz.tcp.log.model;

import java.util.HashMap;
import java.util.Map;

public class AuthenticatedEntity {

    private String consumerId;
    private String id;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
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

}
