package com.practice.builder;

public class BuilderClient {

	public static void main(String[] args) {
		MovieTicket movieTicket = new MovieTicket.MovieTicketBuilder("Amoeba").withMovieName("IronMan")
				.withPaymentMethod("Cash").withResturant("Dominos").build();

		System.out.println(movieTicket.toString());
	}

}
