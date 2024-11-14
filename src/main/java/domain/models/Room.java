package domain.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Room {

    @Id
    private int RoomId;

    @Column(nullable=false)
    private String name;
}
