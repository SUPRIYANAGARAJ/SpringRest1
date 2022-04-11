package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.demo.ws.obj.Quote;

public class QuoteService {
	
	private List<Quote> quotes = new ArrayList<Quote>();

	//Spring boot restful web services
	public QuoteService() {
		
		/*this.quotes.add(new Quote("You know you're in love when you can't fall asleep because reality is finally better than your dreams","Dr.Seuss"));
		this.quotes.add(new Quote("Get busy living or get busy dying.","Stephan King"));
		this.quotes.add(new Quote("The first step toward success is taken when you refuse to be a captive of the environment in which you first find yourself","Mark Caine"));
		this.quotes.add(new Quote("When one door closes another always opens, but we usually look so long, so intently and so sorrowfully upon the closed door that we do not see the one that has opened","Jean Paul Richter"));
		this.quotes.add(new Quote("Twenty years from now you will be more disappointed by the things you didn't do than by the ones you did. So throw off the bowlines. Sail away from  the safe harbor. Catch the trade winds in your sails","Mark Tawn"));
		this.quotes.add(new Quote("Those who dare to fail miserably can achieve greatly.", "John F. Kennedy"));
		}*/
	}
	
	
	public Quote getQuote() {
		Random rn = new Random();
		int select = rn.nextInt(this.quotes.size());
		return this.quotes.get(select);
	}
	
	public void addQuote(Quote quote) {
		this.quotes.add(quote);
	}
	
	
}
