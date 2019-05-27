
package com.maoz.tcp.log.model;

import java.util.HashMap;
import java.util.Map;

public class Request {

    private String method;
    private String uri;
    private String url;
    private String size;
    private Querystring querystring;
    private Headers headers;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Querystring getQuerystring() {
        return querystring;
    }

    public void setQuerystring(Querystring querystring) {
        this.querystring = querystring;
    }

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
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
		return "Request [method=" + method + ", uri=" + uri + ", url=" + url + ", size=" + size + ", querystring="
				+ querystring.toString() + ", headers=" + headers.toString() + ", additionalProperties=" + additionalProperties + "]";
	}

}
