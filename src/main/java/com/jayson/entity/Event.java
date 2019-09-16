package com.jayson.entity;

import com.jayson.entity.Event;

import java.sql.Timestamp;

public class Event {
    private int id;
    private int roomId;
    /* 10 */   private String name = "";


    private Timestamp startTime;

    private Timestamp endTime;

    private int userId;

    private int eventTypeId;


    /* 22 */
    public int getId() {
        return this.id;
    }


    /* 26 */
    public void setId(int id) {
        this.id = id;
    }


    /* 30 */
    public int getRoomId() {
        return this.roomId;
    }


    /* 34 */
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }


    /* 38 */
    public String getName() {
        return this.name;
    }


    /* 42 */
    public void setName(String name) {
        this.name = name;
    }


    /* 46 */
    public Timestamp getStartTime() {
        return this.startTime;
    }


    /* 50 */
    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }


    /* 54 */
    public Timestamp getEndTime() {
        return this.endTime;
    }


    /* 58 */
    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }


    /* 62 */
    public int getUserId() {
        return this.userId;
    }


    /* 66 */
    public void setUserId(int userId) {
        this.userId = userId;
    }


    /* 70 */
    public int getEventTypeId() {
        return this.eventTypeId;
    }


    /* 74 */
    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }
}


/* Location:              C:\Users\MichaelOD_WIN10\Desktop\fsdownload\sdu-meeting-0.0.9-SNAPSHOT.jar!\BOOT-INF\classes\com\jayson\entity\Event.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */