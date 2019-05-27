
package com.maoz.tcp.log.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Route {

    private Integer createdAt;
    private Object hosts;
    private String id;
    private Object methods;
    private List<String> paths = null;
    private Boolean preserveHost;
    private List<String> protocols = null;
    private Integer regexPriority;
    private Service service;
    private Boolean stripPath;
    private Integer updatedAt;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Object getHosts() {
        return hosts;
    }

    public void setHosts(Object hosts) {
        this.hosts = hosts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getMethods() {
        return methods;
    }

    public void setMethods(Object methods) {
        this.methods = methods;
    }

    public List<String> getPaths() {
        return paths;
    }

    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    public Boolean getPreserveHost() {
        return preserveHost;
    }

    public void setPreserveHost(Boolean preserveHost) {
        this.preserveHost = preserveHost;
    }

    public List<String> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    public Integer getRegexPriority() {
        return regexPriority;
    }

    public void setRegexPriority(Integer regexPriority) {
        this.regexPriority = regexPriority;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Boolean getStripPath() {
        return stripPath;
    }

    public void setStripPath(Boolean stripPath) {
        this.stripPath = stripPath;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Route [createdAt=" + createdAt + ", hosts=" + hosts + ", id=" + id + ", methods=" + methods + ", paths="
				+ paths + ", preserveHost=" + preserveHost + ", protocols=" + protocols + ", regexPriority="
				+ regexPriority + ", service=" + service + ", stripPath=" + stripPath + ", updatedAt=" + updatedAt
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}
