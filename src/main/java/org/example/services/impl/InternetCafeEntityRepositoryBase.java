package org.example.services.impl;

import org.example.domain.internetCafe.InternetCafe;
import org.example.services.IInternetCafeEntityRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.logging.Logger;
@Repository @Scope("singleton")
public class InternetCafeEntityRepositoryBase implements IInternetCafeEntityRepository {

    private static Logger logger = Logger.getLogger(InternetCafeEntityRepositoryBase.class.getName());

    public InternetCafeEntityRepositoryBase()  {
        logger.info(">>> BEAN: InternetCafeEntityRepositoryCDI instantiated!");
    }

    private Map<Integer, InternetCafe> entities = new HashMap<>();

    private Integer nextID = 0;

    @Override
    public Integer getNextID() {
        nextID++;
        return nextID;
    }

    @Override
    public InternetCafe getByID(Integer id) {
        return entities.get(id);
    }

    @Override
    public InternetCafe get(InternetCafe sample) {
        return null;
    }

    @Override
    public Collection<InternetCafe> toCollection() {
        List<InternetCafe> internetCafeList = new ArrayList<>();
        internetCafeList.addAll(this.entities.values());
        return internetCafeList;
    }

    @Override
    public InternetCafe add(InternetCafe entity) {
        if (entity.getInternetCafeNo() == null) {
            nextID++;
            entity.setInternetCafeNo(nextID);
        }
        entities.put(entity.getInternetCafeNo(), entity);
        return entity;
    }

    @Override
    public Collection<InternetCafe> addAll(Collection<InternetCafe> entities) {
        for(InternetCafe entity: entities)
            this.add(entity);
        return entities;
    }

    @Override
    public boolean remove(InternetCafe entity) {
        if (this.entities.containsValue(entity)) {
            this.entities.remove(entity.getInternetCafeNo());
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection<InternetCafe> entities) {
        Boolean flag =  true;
        for(InternetCafe entity: entities) {
            if (!this.remove(entity))
                flag = false;
        }

        return flag;
    }

    @Override
    public int size() {
        return this.entities.values().size();
    }
}
