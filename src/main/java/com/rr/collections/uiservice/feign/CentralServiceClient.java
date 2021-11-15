package com.rr.collections.uiservice.feign;

import com.rr.collections.uiservice.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "central-service", url = "#{'${central.service.api}'}" )
public interface CentralServiceClient {

    @RequestMapping(method = RequestMethod.POST, path = "/registerNewCustomer", headers = {"X-Feign-Type=CENTRAL-SERVICE"})
    Customer registerNewCustomer(@RequestBody Customer customer);
}
