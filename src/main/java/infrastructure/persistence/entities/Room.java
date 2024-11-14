package infrastructure.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Room {

    @Column(nullable = false)
    @Id
    private int RoomId;

    @Column(nullable=false)
    private String name;

    @OneToMany
    private List<Device> devices;

    public Room(){

    }

    public Room(int roomId, String name) {
        RoomId = roomId;
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public int getRoomId() {
        return RoomId;
    }

    public void setRoomId(int roomId) {
        RoomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}
