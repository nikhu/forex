package com.nikhu.server.forex.controller;

import java.util.Date;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nikhu.server.forex.model.ExchangeRate;
import com.nikhu.server.forex.model.ExchangeRateResponse;

@Controller
@RequestMapping("/api")
public class ForexController {
	private static final Logger LOG = Logger.getLogger(ForexController.class);

	@RequestMapping(value = "/{base}/{target}/{amount}", method = RequestMethod.GET)
	public @ResponseBody
	ExchangeRateResponse exchangeRate(@PathVariable("base") String base,
			@PathVariable("target") String target,
			@PathVariable("amount") int amount) {
		LOG.info("Exchange rate request recieved with {base}:" + base
				+ " {target}:" + target + " {amount}:" + amount);
		float randomValue = (70 - 60) * new Random().nextFloat() + 60;
		return new ExchangeRateResponse(new ExchangeRate("USD", "INR", randomValue, new Date()), "ok", "");
	}
}
