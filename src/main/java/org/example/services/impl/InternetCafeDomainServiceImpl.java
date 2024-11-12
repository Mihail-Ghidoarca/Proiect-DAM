package org.example.services.impl;

import org.example.domain.internetCafe.*;
import org.example.services.IInternetCafeDomainService;
import org.example.services.IInternetCafeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class InternetCafeDomainServiceImpl implements IInternetCafeDomainService {
    @Autowired
    private IInternetCafeEntityRepository entityRepository;
    @Override
    public List<String> getInternetCafeGamesList(InternetCafe internetCafe) {
        List<String> gamesList = new ArrayList<>();
        for(Game game : internetCafe.getGamesList())
            gamesList.add(game.getGameName());
        return gamesList;
    }

    @Override
    public Integer getInternetCafeGamesCount(InternetCafe internetCafe) {
        List<String> gamesList = getInternetCafeGamesList(internetCafe);
        return gamesList.size();
    }

    @Override
    public List<String> getInternetCafeGamesList(Integer internetCafeID) {
        return List.of();
    }

    @Override
    public Integer getInternetCafeGamesCount(Integer internetCafeID) {
        InternetCafe internetCafe = entityRepository.getByID(internetCafeID);
        return getInternetCafeGamesCount(internetCafe);
    }

    @Override
    public List<Integer> getInternetCafeReservationsList(InternetCafe internetCafe) {
        List<Integer> reservationsList = new ArrayList<>();
        for(Reservation reservation : internetCafe.getReservationsList())
            reservationsList.add(reservation.getIdReservation());
        return reservationsList;
    }

    @Override
    public Integer getInternetCafeReservationsCount(InternetCafe internetCafe) {
        List<Integer> reservationsList = getInternetCafeReservationsList(internetCafe);
        return reservationsList.size();
    }

    @Override
    public List<String> getInternetCafeDevicesList(InternetCafe internetCafe) {
        return List.of();
    }

    @Override
    public Integer getInternetCafeDevicesCount(InternetCafe internetCafe) {
        return 0;
    }

    @Override
    public List<String> getInternetCafeUsersList(InternetCafe internetCafe) {
        return List.of();
    }

    @Override
    public Integer getInternetCafeUsersCount(InternetCafe internetCafe) {
        return 0;
    }


}
