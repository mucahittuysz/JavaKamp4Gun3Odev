package Managers;

import Services.CrudService;

public class BaseCrudManager implements CrudService
{

	public void getAll() {
		System.out.println("Tüm gamerlar getirildi.");
	  
		
	}

	@Override
	public void add() {
		System.out.println("Nesne eklendi.");
		
	}

	@Override
	public void update() {
		System.out.println("Nesne güncellendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Nesne silindi.");
		
	}


}
