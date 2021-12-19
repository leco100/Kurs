package com.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flight_changes")
@Getter
@Setter
@Builder
public class FlightChanges {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @JsonIgnore
    @ManyToOne
    Flight flight;

    @Column
    @Enumerated(EnumType.ORDINAL)
    FlyStatus flyStatus;

    @Column
    LocalDateTime changeTime;

    int addTime;

    public FlightChanges() {
    }

    public FlightChanges(long id, Flight flight, FlyStatus flyStatus, LocalDateTime changeTime, int addTime) {
        this.id = id;
        this.flight = flight;
        this.flyStatus = flyStatus;
        this.changeTime = changeTime;
        this.addTime = addTime;
    }
}
