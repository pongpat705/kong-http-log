
package com.maoz.tcp.log.model;

import java.util.HashMap;
import java.util.Map;

public class Response {

    private Integer status;
    private String size;
    private Headers_ headers;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Headers_ getHeaders() {
        return headers;
    }

    public void setHeaders(Headers_ headers) {
        this.headers = headers;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Response [status=" + status + ", size=" + size + ", headers=" + headers.toString() + ", additionalProperties="
				+ additionalProperties + "]";
	}

}
