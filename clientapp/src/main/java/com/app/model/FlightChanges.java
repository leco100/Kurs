package com.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FlightChanges {

    @JsonProperty("id")
    long id;

    @JsonProperty("flight")
    Flight flight;

    @JsonProperty("flyStatus")
    FlyStatus flyStatus;

    @JsonProperty("changeTime")
    LocalDateTime changeTime;

    @JsonProperty("addTime")
    int addTime;

    public FlightChanges() {
    }
}
