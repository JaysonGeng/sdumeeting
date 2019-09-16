package com.jayson.entity;

import com.jayson.entity.Room;

public class Room {
    /*  6 */   private String name = "";
    private int id;
    /*  7 */   private String description = "";
    private int peopleCount;
    /*  9 */   private String image = "";


    /* 13 */
    public int getId() {
        return this.id;
    }


    /* 17 */
    public void setId(int id) {
        this.id = id;
    }


    /* 21 */
    public String getName() {
        return this.name;
    }


    /* 25 */
    public void setName(String name) {
        this.name = name;
    }


    /* 29 */
    public String getDescription() {
        return this.description;
    }


    /* 33 */
    public void setDescription(String description) {
        this.description = description;
    }


    /* 37 */
    public int getPeopleCount() {
        return this.peopleCount;
    }


    /* 41 */
    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }


    /* 45 */
    public String getImage() {
        return this.image;
    }


    /* 49 */
    public void setImage(String image) {
        this.image = image;
    }
}


/* Location:              C:\Users\MichaelOD_WIN10\Desktop\fsdownload\sdu-meeting-0.0.9-SNAPSHOT.jar!\BOOT-INF\classes\com\jayson\entity\Room.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */