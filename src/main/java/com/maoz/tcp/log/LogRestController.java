package com.maoz.tcp.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.maoz.tcp.log.model.KongLog;

@RestController
public class LogRestController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired KongService kongService;
	
	@RequestMapping(value = "/logs", method = RequestMethod.POST)
	public void logs(@RequestBody KongLog kongLog) throws JsonProcessingException {
		
		log.info(kongLog.toString());
		
		kongService.addKongRequest(kongLog.getRequest());
		
	}
}
