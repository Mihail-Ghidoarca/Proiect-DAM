package org.example.domain.internetCafe;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class InternetCafe {
    @Min(1)
    @NotNull(message = "internetCafeNo is required")
    @EqualsAndHashCode.Include
    private Integer internetCafeNo;

    @NotNull(message = "InternetCafe Name is required!")
    @Size(min=1, message = "InternetCafe must have an explicit name!")
    private String name;

    private Integer internetCafeID;
    private String address;
    private String owner;
    private List<Game> gamesList;
    private List<User> usersList;
    private List<Reservation> reservationsList;
    private List<Device> devicesList;
    public InternetCafe(Integer internetCafeID, String name, String address, String owner, List<Game> gamesList) {
        this.internetCafeID = internetCafeID;
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.gamesList = gamesList;
    }

    public InternetCafe(String name, Integer internetCafeID) {
        this.name = name;
        this.internetCafeID = internetCafeID;
    }

    @Override
    public String toString() {
        return "InternetCafe{" +
                "internetCafeID=" + internetCafeID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
