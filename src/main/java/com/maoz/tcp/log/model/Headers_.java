
package com.maoz.tcp.log.model;

import java.util.HashMap;
import java.util.Map;

public class Headers_ {

    private String contentLength;
    private String via;
    private String connection;
    private String accessControlAllowCredentials;
    private String contentType;
    private String server;
    private String accessControlAllowOrigin;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getAccessControlAllowCredentials() {
        return accessControlAllowCredentials;
    }

    public void setAccessControlAllowCredentials(String accessControlAllowCredentials) {
        this.accessControlAllowCredentials = accessControlAllowCredentials;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getAccessControlAllowOrigin() {
        return accessControlAllowOrigin;
    }

    public void setAccessControlAllowOrigin(String accessControlAllowOrigin) {
        this.accessControlAllowOrigin = accessControlAllowOrigin;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Headers_ [contentLength=" + contentLength + ", via=" + via + ", connection=" + connection
				+ ", accessControlAllowCredentials=" + accessControlAllowCredentials + ", contentType=" + contentType
				+ ", server=" + server + ", accessControlAllowOrigin=" + accessControlAllowOrigin
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}
