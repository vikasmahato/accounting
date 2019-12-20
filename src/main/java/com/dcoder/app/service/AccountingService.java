package com.dcoder.app.service;

import javax.servlet.http.HttpSession;

public interface AccountingService {

    String connectToRemoteSource(HttpSession session);

    void disconnectFromRemoteSource();
}
