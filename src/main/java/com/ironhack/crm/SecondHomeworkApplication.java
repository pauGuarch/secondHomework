package com.ironhack.crm;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.controller.CRMController;
import com.ironhack.crm.domain.models.Opportunity;
import com.ironhack.crm.view.CRMView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class SecondHomeworkApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SecondHomeworkApplication.class, args);
		CRMController.runCRM();
	}

}
