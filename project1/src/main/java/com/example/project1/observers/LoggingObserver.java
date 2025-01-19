package com.example.project1.observers;

import com.example.project1.model.CompanyDataModel;
import org.slf4j.LoggerFactory;


import java.util.logging.Logger;


public class LoggingObserver implements Observer {

    @Override
    public void update(CompanyDataModel companyDataModel) {
        System.out.println(String.format("Data changed. For company: %s, " +
                "lastTransaction: %s, on date: %s", companyDataModel.getId(), companyDataModel.getLastTransactionPrice(),
                companyDataModel.getDate()));
    }
}
