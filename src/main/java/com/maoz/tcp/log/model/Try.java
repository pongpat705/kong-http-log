
package com.maoz.tcp.log.model;

import java.util.HashMap;
import java.util.Map;

public class Try {

    private String state;
    private Integer code;
    private String ip;
    private Integer port;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Try [state=" + state + ", code=" + code + ", ip=" + ip + ", port=" + port + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
