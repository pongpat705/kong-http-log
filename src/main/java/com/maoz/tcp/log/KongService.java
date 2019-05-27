package com.maoz.tcp.log;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maoz.tcp.log.entity.KongRequest;
import com.maoz.tcp.log.model.Request;
import com.maoz.tcp.log.repos.KongRequestRepository;

@Service
public class KongService {

	@Autowired private KongRequestRepository kongRequestRepos;
	
	
	@Transactional
	public void addKongRequest(Request kongRequest) throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		
		KongRequest kongRequestEntity = new KongRequest();
		kongRequestEntity.setId(UUID.randomUUID());
		kongRequestEntity.setHeader(mapper.writeValueAsString(kongRequest.getHeaders()));
		kongRequestEntity.setMethod(kongRequest.getMethod());
		kongRequestEntity.setQueryString(mapper.writeValueAsString(kongRequest.getQuerystring()));
		kongRequestEntity.setSize(kongRequest.getSize());
		kongRequestEntity.setUri(kongRequest.getUri());
		kongRequestEntity.setUrl(kongRequest.getUrl());
		
		kongRequestRepos.save(kongRequestEntity);
		
	}
}
