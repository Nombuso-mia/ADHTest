package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Money;
import service.moneyEJB;

@ManagedBean(name = "moneycontroller")
@SessionScoped
public class moneyController {
	
	@EJB
	moneyEJB moneyservice;
	
	@ManagedProperty(value = "#{money}")
	private Money money;
	
	public void addNewMoney() {
		System.out.println("testing");
		moneyservice.addNew(money.getEntity());
	}

	public Money getMoney() {
		return money;
	}

	public void setMoney(Money money) {
		this.money = money;
	}
	
	

}
