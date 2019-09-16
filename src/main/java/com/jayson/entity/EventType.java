/*    */
package com.jayson.entity;
/*    */
/*    */

import com.jayson.entity.EventType;

/*    */
 public class EventType {
    /*  6 */   private String name = "";
    private int id;
    /*  7 */   private String description = "";
    /*  8 */   private String color = "";

    /*    */
    /*    */
    /* 11 */
    public int getId() {
        return this.id;
    }

    /*    */
    /*    */
    /*    */
    /* 15 */
    public void setId(int id) {
        this.id = id;
    }

    /*    */
    /*    */
    /*    */
    /* 19 */
    public String getName() {
        return this.name;
    }

    /*    */
    /*    */
    /*    */
    /* 23 */
    public void setName(String name) {
        this.name = name;
    }

    /*    */
    /*    */
    /*    */
    /* 27 */
    public String getDescription() {
        return this.description;
    }

    /*    */
    /*    */
    /*    */
    /* 31 */
    public void setDescription(String description) {
        this.description = description;
    }

    /*    */
    /*    */
    /*    */
    /* 35 */
    public String getColor() {
        return this.color;
    }

    /*    */
    /*    */
    /*    */
    /* 39 */
    public void setColor(String color) {
        this.color = color;
    }
    /*    */
}


/* Location:              C:\Users\MichaelOD_WIN10\Desktop\fsdownload\sdu-meeting-0.0.9-SNAPSHOT.jar!\BOOT-INF\classes\com\jayson\entity\EventType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */