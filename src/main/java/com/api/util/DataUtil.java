package com.api.util;

import com.api.model.Address;
import com.api.model.UserDetails;

import java.util.HashMap;

public class DataUtil {

    public static UserDetails fetchDetails(String userId){
        HashMap<String, UserDetails> details = new HashMap<>();

        details.put("U1001",UserDetails.builder().userId("U1001").username("Sandhya")
                .address(Address.builder().houseNumber("50").street("Assering")
                        .city("Hoofdorp").zipCode("1181YU").build()).build());

        details.put("U1002",UserDetails.builder().userId("U1002").username("Sandhya")
                .address(Address.builder().houseNumber("51").street("Brink")
                        .city("Haarlem").zipCode("1182YU").build()).build());

        details.put("U1003",UserDetails.builder().userId("U1003").username("Sandhya")
                .address(Address.builder().houseNumber("52").street("Orangejaban")
                        .city("StationZuid").zipCode("1183YU").build()).build());

        details.put("U1004",UserDetails.builder().userId("U1004").username("Sandhya")
                .address(Address.builder().houseNumber("53").street("Nikola")
                        .city("Niewnoop").zipCode("1184YU").build()).build());

        details.put("U1005",UserDetails.builder().userId("U1005").username("Sandhya")
                .address(Address.builder().houseNumber("54").street("Milkweg")
                        .city("arnhem").zipCode("1189YU").build()).build());

        details.put("U1006",UserDetails.builder().userId("U1006").username("Sandhya")
                .address(Address.builder().houseNumber("55").street("William")
                        .city("zwolle").zipCode("1185YU").build()).build());

        details.put("U1007",UserDetails.builder().userId("U1007").username("Sandhya")
                .address(Address.builder().houseNumber("56").street("King")
                        .city("Lelylaan").zipCode("1186YU").build()).build());

        return details.get(userId);

    }
}
