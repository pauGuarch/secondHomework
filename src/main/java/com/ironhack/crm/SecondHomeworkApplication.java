package com.ironhack.crm;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.domain.models.Lead;
import com.ironhack.crm.domain.models.Opportunity;
import com.ironhack.crm.utils.UtilsLists;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class SecondHomeworkApplication {

	public static void main(String[] args) {
		//System.out.println(readOpportunities().get(1).getQuantity());
		//SpringApplication.run(SecondHomeworkApplication.class, args);
		Lead contact1 = new Lead("Juaasssssaan", "Company1", "blutomato@tomato.com", "647733243");
		Lead contact2 = new Lead("Pedro", "Company2", "blutomato@tomato.com", "647733243");
		ArrayList <Lead> leads = new ArrayList<>();
		leads.add(contact1);
		leads.add(contact2);
		UtilsLists.showLeads(leads);

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
