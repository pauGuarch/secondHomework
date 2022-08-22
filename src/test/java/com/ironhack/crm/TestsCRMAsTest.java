package com.ironhack.crm;
import com.ironhack.crm.domain.models.Lead;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestsCRMAsTest {

    private ArrayList<Lead> leadsArrayList;

    @BeforeEach
    void setUp() {
        Lead lead = new Lead("Silvia", "Fagor", "silviafagor@gmail.com", "677222444");
        Lead lead2 = new Lead("María", "Ikea", "mariavikea@gmail.com", "625888444");

    @Test
    public void leadsArrayList() {
        assertEquals("Silvia", leadsArrayList.get(2));
    }
}