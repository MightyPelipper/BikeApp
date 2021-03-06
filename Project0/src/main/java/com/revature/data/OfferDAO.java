package com.revature.data;

import java.util.Set;

import com.revature.beans.Offer;


public interface OfferDAO extends GenericDAO<Offer> {

	public Offer add(Offer o);
	public void completeOffer(Offer o);
	public void removeOffer(Offer o);
	public Set<Offer> getAvailableOffers();
}
