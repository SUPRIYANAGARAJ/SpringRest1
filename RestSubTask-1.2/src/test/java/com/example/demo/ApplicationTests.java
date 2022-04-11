package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.demo.service.QuoteService;
import com.example.demo.ws.obj.Quote;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {
	
QuoteService quoteService;
	
	@BeforeEach
	public void before() {
		this.quoteService = new QuoteService();
	}
	

	@Test
	void contextLoads() {
		this.quoteService.addQuote(new Quote("ABC","D"));
		assertEquals("ABC", this.quoteService.getQuote().getValue());
	}
	
	@Test
	public void testGetQuoteMultiple() {
		this.quoteService.addQuote(new Quote("ABC","D"));
		this.quoteService.addQuote(new Quote("EFG","H"));
		assertTrue(
				"ABC".equals(this.quoteService.getQuote().getValue()) ||
		        "EFG".equals(this.quoteService.getQuote().getValue()));
	}
}
