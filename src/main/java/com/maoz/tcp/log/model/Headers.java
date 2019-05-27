
package com.maoz.tcp.log.model;

import java.util.HashMap;
import java.util.Map;

public class Headers {

    private String accept;
    private String host;
    private String userAgent;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Headers [accept=" + accept + ", host=" + host + ", userAgent=" + userAgent + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
