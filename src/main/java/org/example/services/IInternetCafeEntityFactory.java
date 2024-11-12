package org.example.services;

import org.example.domain.internetCafe.InternetCafe;

public interface IInternetCafeEntityFactory {
    public InternetCafe createInternetCafe(String internetCafeName);
    public InternetCafe toEntity(InternetCafe internetCafeDTO);
}
