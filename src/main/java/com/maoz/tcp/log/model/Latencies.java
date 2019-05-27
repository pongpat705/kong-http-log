
package com.maoz.tcp.log.model;

import java.util.HashMap;
import java.util.Map;

public class Latencies {

    private Integer proxy;
    private Integer kong;
    private Integer request;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getProxy() {
        return proxy;
    }

    public void setProxy(Integer proxy) {
        this.proxy = proxy;
    }

    public Integer getKong() {
        return kong;
    }

    public void setKong(Integer kong) {
        this.kong = kong;
    }

    public Integer getRequest() {
        return request;
    }

    public void setRequest(Integer request) {
        this.request = request;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Latencies [proxy=" + proxy + ", kong=" + kong + ", request=" + request + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
