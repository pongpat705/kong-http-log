package com.maoz.tcp.log.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogRestController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/logs", method = RequestMethod.POST)
	public void logs(@RequestBody KongLog kongLog) {
		
		log.info(kongLog.toString());
	}
}
