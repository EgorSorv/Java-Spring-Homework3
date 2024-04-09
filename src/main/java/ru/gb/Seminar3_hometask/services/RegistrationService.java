package ru.gb.Seminar3_hometask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }

    @Autowired
    private DataProcessingService dataProcessingService;

    // UserService, NotificationService

    //processRegistration
}
