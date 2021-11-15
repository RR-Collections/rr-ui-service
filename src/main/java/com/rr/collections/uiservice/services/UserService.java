package com.rr.collections.uiservice.services;

import com.rr.collections.uiservice.feign.CentralServiceClient;
import com.rr.collections.uiservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private CentralServiceClient centralServiceClient;

    public Long registerNewCustomer(final Customer customer) {
        return centralServiceClient.registerNewCustomer(customer);
    }
}
