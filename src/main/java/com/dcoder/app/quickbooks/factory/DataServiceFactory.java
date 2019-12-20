package com.dcoder.app.quickbooks.factory;

import com.intuit.ipp.exception.FMSException;
import com.intuit.ipp.services.DataService;
import org.springframework.stereotype.Component;

@Component
public class DataServiceFactory {
    /**
     * Initializes DataService for a given app/company profile
     *
     * @return
     * @throws FMSException
     */
    public static DataService getDataService() throws FMSException {
        //create dataservice
        return new DataService(ContextFactory.getContext());
    }
}
