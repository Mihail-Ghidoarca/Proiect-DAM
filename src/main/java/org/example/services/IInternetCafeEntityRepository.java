package org.example.services;

import org.example.domain.internetCafe.InternetCafe;

import java.util.Collection;

public interface IInternetCafeEntityRepository {
    public Integer getNextID();
    public InternetCafe getByID(Integer id);
    public InternetCafe get(InternetCafe sample);
    public Collection<InternetCafe> toCollection();

    public InternetCafe add(InternetCafe entity);
    public Collection<InternetCafe> addAll(Collection<InternetCafe> entities);
    public boolean remove(InternetCafe entity);
    public boolean removeAll(Collection<InternetCafe> entities);

    public int size();
}
