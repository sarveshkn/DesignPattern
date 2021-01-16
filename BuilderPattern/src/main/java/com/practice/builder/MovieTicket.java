package com.practice.builder;

/**
 * Class following a Builder pattern
 * 
 * Builder pattern aims to “Separate the construction of a complex object from
 * its representation so that the same construction process can create different
 * representations.”
 * 
 * The builder pattern, as name implies, is an alternative way to construct
 * complex objects. This should be used only when you want to build different
 * immutable objects using same object building process.
 * 
 * Below is the coded solution of problem we discussed above. This uses a
 * additional class UserBuilder which helps us in building desired User object
 * with all mandatory attributes and combination of optional attributes, without
 * loosing the immutability.
 * 
 * @author skaushik
 *
 */

public class MovieTicket {

	private final boolean movie;

	private final String movieName;

	private final String bowling;

	private final String resturant;

	private final String paymentMethod;

	public MovieTicket(MovieTicketBuilder movieTicketBuilder) {
		super();
		this.movie = movieTicketBuilder.movie;
		this.movieName = movieTicketBuilder.movieName;
		this.paymentMethod = movieTicketBuilder.paymentMethod;
		this.resturant = movieTicketBuilder.resturant;
		this.bowling = movieTicketBuilder.bowling;
	}

	public boolean isMovie() {
		return movie;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getBowling() {
		return bowling;
	}

	public String getResturant() {
		return resturant;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	static class MovieTicketBuilder {

		private boolean movie;

		private String movieName;

		private final String bowling;

		private String resturant;

		private String paymentMethod;

		public MovieTicketBuilder(String bowling) {
			this.bowling = bowling;
		}

		public MovieTicketBuilder isMovie(boolean movie) {
			this.movie = movie;
			return this;
		}

		public MovieTicketBuilder withMovieName(String movieName) {
			this.movieName = movieName;
			return this;
		}

		public MovieTicketBuilder withResturant(String resturant) {
			this.resturant = resturant;
			return this;
		}

		public MovieTicketBuilder withPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
			return this;
		}

		public MovieTicket build() {
			MovieTicket movieTicket = new MovieTicket(this);
			return movieTicket;
		}

		@Override
		public String toString() {
			return "MovieTicketBuilder [movie=" + movie + ", movieName=" + movieName + ", bowling=" + bowling
					+ ", resturant=" + resturant + ", paymentMethod=" + paymentMethod + "]";
		}

	}

}
