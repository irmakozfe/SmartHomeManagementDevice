package infrastructure.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class RoomEntity {

    @Column(nullable = false)
    @Id
    private int RoomId;

    @Column(nullable=false)
    private String name;

    @OneToMany
    private List<DeviceEntity> deviceEntities;

    public RoomEntity(){

    }

    public RoomEntity(int roomId, String name) {
        RoomId = roomId;
        this.name = name;
        this.deviceEntities = new ArrayList<>();
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

    public List<DeviceEntity> getDevices() {
        return deviceEntities;
    }

    public void setDevices(List<DeviceEntity> deviceEntities) {
        this.deviceEntities = deviceEntities;
    }
}
