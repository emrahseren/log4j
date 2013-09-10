package com.gtech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Run {

	private static final Logger logger = LoggerFactory.getLogger(Run.class);
	
	public static void main(String[] args) {
		logger.info("start app");
		String number="123A";
		try {
			Integer.parseInt(number);
		} catch (NumberFormatException e) {
			logger.info(e.toString());
		}
		logger.info("finish app");
	}

}
