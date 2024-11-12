package org.example.services;

import org.example.domain.internetCafe.*;

import java.util.List;

public interface IInternetCafeDomainService {
    public List<String> getInternetCafeGamesList(InternetCafe internetCafe);
    public Integer getInternetCafeGamesCount(InternetCafe internetCafe);

    public List<String> getInternetCafeGamesList(Integer internetCafeID);
    public Integer getInternetCafeGamesCount(Integer internetCafeID);

    public List<Integer> getInternetCafeReservationsList(InternetCafe internetCafe);
    public Integer getInternetCafeReservationsCount(InternetCafe internetCafe);

    public List<String> getInternetCafeDevicesList(InternetCafe internetCafe);
    public Integer getInternetCafeDevicesCount(InternetCafe internetCafe);

    public List<String> getInternetCafeUsersList(InternetCafe internetCafe);
    public Integer getInternetCafeUsersCount(InternetCafe internetCafe);

}
