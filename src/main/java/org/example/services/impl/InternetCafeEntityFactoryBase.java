package org.example.services.impl;

import jakarta.annotation.PostConstruct;
import org.example.domain.internetCafe.*;
import org.example.services.IInternetCafeEntityFactory;
import org.example.services.IInternetCafeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
@Service
@Scope("singleton")
public class InternetCafeEntityFactoryBase implements IInternetCafeEntityFactory {
    @Autowired
    private IInternetCafeEntityRepository entityRepository;
    
    private static Logger logger = Logger.getLogger(InternetCafeEntityFactoryBase.class.getName());
    public InternetCafeEntityFactoryBase() {
        logger.info(">>> BEAN: InternetCafeEntityFactoryCDI instantiated!");
    }
    @Override
    public InternetCafe createInternetCafe(String internetCafeName) {
        Integer nextID = this.entityRepository.getNextID();
        return new InternetCafe(internetCafeName, nextID);
    }
    
    public void setInternetCafeEntityRepository(IInternetCafeEntityRepository repository) {
        this.entityRepository = repository;
    }

    public InternetCafeEntityFactoryBase(IInternetCafeEntityRepository entityRepository) {
        super();
        this.entityRepository = entityRepository;
    }
    
    
    @Override
    public InternetCafe toEntity(InternetCafe internetCafeDTO) {
        InternetCafe InternetCafeEntity = this.entityRepository.get(internetCafeDTO);
        InternetCafeEntity.setName(internetCafeDTO.getName());
        return InternetCafeEntity;
    }

    @PostConstruct
    public void initDomainServiceEntities() {
        logger.info(">> PostConstruct :: initDomainServiceEntities");
        for(int i=1; i<=3; i++) {
            InternetCafe newInternetCafe = createInternetCafe("InternetCafe_" + i);

            entityRepository.add(newInternetCafe);
        }
        logger.info(">> EntityRepository project.count :: " + entityRepository.size());
    }
    
}
