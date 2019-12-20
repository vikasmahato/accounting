package com.dcoder.app.quickbooks.factory;

import com.intuit.ipp.exception.FMSException;
import com.intuit.ipp.services.ReportService;

public class ReportServiceFactory {
    /**
     * Initializes ReportService for a given app/company profile
     *
     * @return
     * @throws FMSException
     */
    public static ReportService getReportService() throws FMSException {
        //create reportservice
        return new ReportService(ContextFactory.getContext());
    }
}
