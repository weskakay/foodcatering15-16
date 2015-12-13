package org.tudresden.ecatering.model.kitchen;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.javamoney.moneta.Money;
import org.salespointframework.catalog.Product;


@Entity
public class MenuItem extends Product {

	
	private static final long serialVersionUID = -3839280035059479617L;
	
	
	
	
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.DETACH)
	private Meal meal;
	
	private Helping helping;
	
	@SuppressWarnings({ "unused", "deprecation" })
	private MenuItem() {}
	
	protected MenuItem(Meal meal, Money price, Helping helping) {
		super(meal.getName(),price);
		this.meal = meal;
		this.helping = helping;
	}
	
	public Meal getMeal() {
		return meal;
	}
	
	public Helping getHelping() {
		return helping;
	}
	
	@Override
	public int hashCode() {	
	     return new HashCodeBuilder(611, 99).
	       append(super.hashCode()).
	       append(meal).
	       toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public String toString() {
		   return ToStringBuilder.reflectionToString(this);
	}	
	

}
