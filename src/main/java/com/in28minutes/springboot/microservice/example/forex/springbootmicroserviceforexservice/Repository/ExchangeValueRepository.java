package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice.Repository;

import com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice.Resource.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

    ExchangeValue findByFromAndTo(String from, String to);
}

