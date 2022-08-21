package com.ironhack.crm;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.dao.manager.implementation.AccountManagerImpl;
import com.ironhack.crm.domain.enums.OpportunityStatus;
import com.ironhack.crm.domain.enums.ProductType;
import com.ironhack.crm.domain.models.Account;
import com.ironhack.crm.domain.models.Contact;
import com.ironhack.crm.domain.models.Opportunity;
import com.ironhack.crm.domain.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class SecondHomeworkApplication {

	public static void main(String[] args) throws IOException {
		//System.out.println(readOpportunities().get(1).getQuantity());
		//SpringApplication.run(SecondHomeworkApplication.class, args);

		AccountManagerImpl acc = new AccountManagerImpl();
		Contact contact1 = new Contact("Juan", "<@juan", "647733243", "Company1");
		Contact contact2 = new Contact("Pedro", "<@pedro", "647755543", "Company2");
		List<Contact> contactList = new ArrayList<Contact>();
		contactList.add(contact1);
		contactList.add(contact2);

		Product product = new Product("product1", ProductType.FLATBED);
		Product product2 = new Product("product2", ProductType.HYBRID);

		Opportunity opportunity1 = new Opportunity(contact1, 3, OpportunityStatus.OPEN, product);
		Opportunity opportunity2 = new Opportunity(contact2, 6, OpportunityStatus.CLOSED_LOST, product);
		List<Opportunity> opportunityList = new ArrayList<Opportunity>();
		opportunityList.add(opportunity1);
		opportunityList.add(opportunity2);


		Account acc1 = new Account("Industry1", 5, "bcn", "spain", contactList, opportunityList);
		Account acc2 = new Account("Industry2", 10, "bdn", "ravalistan", contactList, opportunityList);
		List<Account> accountList = new ArrayList<Account>();
		acc.accounts = new ArrayList<Account>();
		acc.accounts.add(acc1);
		acc.accounts.add(acc2);

		acc.writeJSON();
	}

	private static List<Opportunity> readOpportunities() {
		List<Opportunity> opportunities = null;
		try {
			Gson gson = new Gson();
			Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/opportunity.json"));
			opportunities = new Gson().fromJson(reader, new TypeToken<List<Opportunity>>() {}.getType());
			reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return opportunities;
	}

}
