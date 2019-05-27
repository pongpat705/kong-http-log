
package com.maoz.tcp.log.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KongLog {

    private Request request;
    private String upstreamUri;
    private Response response;
    private List<Try> tries = null;
    private AuthenticatedEntity authenticatedEntity;
    private Route route;
    private Service_ service;
    private List<Workspace> workspaces = null;
    private Consumer consumer;
    private Latencies latencies;
    private String clientIp;
    private Integer startedAt;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String getUpstreamUri() {
        return upstreamUri;
    }

    public void setUpstreamUri(String upstreamUri) {
        this.upstreamUri = upstreamUri;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public List<Try> getTries() {
        return tries;
    }

    public void setTries(List<Try> tries) {
        this.tries = tries;
    }

    public AuthenticatedEntity getAuthenticatedEntity() {
        return authenticatedEntity;
    }

    public void setAuthenticatedEntity(AuthenticatedEntity authenticatedEntity) {
        this.authenticatedEntity = authenticatedEntity;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Service_ getService() {
        return service;
    }

    public void setService(Service_ service) {
        this.service = service;
    }

    public List<Workspace> getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(List<Workspace> workspaces) {
        this.workspaces = workspaces;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public Latencies getLatencies() {
        return latencies;
    }

    public void setLatencies(Latencies latencies) {
        this.latencies = latencies;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Integer getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Integer startedAt) {
        this.startedAt = startedAt;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KongLog [");
		if (request != null)
			builder.append("request=").append(request).append(", ");
		if (upstreamUri != null)
			builder.append("upstreamUri=").append(upstreamUri).append(", ");
		if (response != null)
			builder.append("response=").append(response).append(", ");
		if (tries != null)
			builder.append("tries=").append(tries).append(", ");
		if (authenticatedEntity != null)
			builder.append("authenticatedEntity=").append(authenticatedEntity).append(", ");
		if (route != null)
			builder.append("route=").append(route).append(", ");
		if (service != null)
			builder.append("service=").append(service).append(", ");
		if (workspaces != null)
			builder.append("workspaces=").append(workspaces).append(", ");
		if (consumer != null)
			builder.append("consumer=").append(consumer).append(", ");
		if (latencies != null)
			builder.append("latencies=").append(latencies).append(", ");
		if (clientIp != null)
			builder.append("clientIp=").append(clientIp).append(", ");
		if (startedAt != null)
			builder.append("startedAt=").append(startedAt).append(", ");
		if (additionalProperties != null)
			builder.append("additionalProperties=").append(additionalProperties);
		builder.append("]");
		return builder.toString();
	}

	
}
