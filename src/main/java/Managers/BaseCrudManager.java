package Managers;

import Services.CrudService;

public class BaseCrudManager implements CrudService
{

	public void getAll() {
		System.out.println("T�m gamerlar getirildi.");
	  
		
	}

	@Override
	public void add() {
		System.out.println("Nesne eklendi.");
		
	}

	@Override
	public void update() {
		System.out.println("Nesne g�ncellendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Nesne silindi.");
		
	}


}
