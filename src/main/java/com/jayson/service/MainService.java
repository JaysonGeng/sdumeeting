package com.jayson.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jayson.entity.Event;
import com.jayson.entity.Room;
import com.jayson.entity.User;
import com.jayson.mapper.MainMapper;
import com.jayson.service.MainService;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
public class MainService {
    @Autowired
    MainMapper mainMapper;

    public JSONObject init() {
        /*  33 */
        JSONObject param = new JSONObject();


        /*  36 */
        List<Event> events = this.mainMapper.getAllEvents();

        /*  38 */
        JSONArray jsonArrayEvents = new JSONArray();
        /*  39 */
        for (Event e : events) {
            /*  40 */
            JSONObject jsonObject = new JSONObject();
            /*  41 */
            String title = e.getName().substring(0, e.getName().length() - 26);
            /*  42 */
            String time = e.getName().substring(e.getName().length() - 26);
            /*  43 */
            jsonObject.put("title", title);
            /*  44 */
            jsonObject.put("time", time);
            /*  45 */
            User user = this.mainMapper.getUserById(e.getUserId());
            /*  46 */
            if (user==null){
                jsonObject.put("user", "null");
            }else {
                jsonObject.put("user", user.getName());
            }

            /*  47 */
            jsonObject.put("textColor", "white");
            /*  48 */
            if (e.getRoomId() == 1) {
                /*  49 */
                jsonArrayEvents.add(jsonObject);
            }
        }



        /*  55 */
        param.put("events", jsonArrayEvents);

        /*  57 */
        return param;
    }


    public JSONObject view() {
        /*  64 */
        JSONObject param = new JSONObject();


        /*  67 */
        List<Event> events = this.mainMapper.getAllEvents();

        /*  69 */
        JSONArray jsonArrayEvents = new JSONArray();
        /*  70 */
        for (Event e : events) {
            /*  71 */
            JSONObject jsonObject = new JSONObject();
            /*  72 */
            jsonObject.put("title", e.getName());
            /*  73 */
            jsonObject.put("roomId", Integer.valueOf(e.getRoomId()));
            /*  74 */
            jsonObject.put("textColor", "white");
            /*  75 */
            String startDate = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")).format(e.getStartTime());
            /*  76 */
            String endDate = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")).format(e.getEndTime());
            /*  77 */
            jsonObject.put("start", startDate);
            /*  78 */
            jsonObject.put("end", endDate);
            /*  79 */
            jsonArrayEvents.add(jsonObject);
        }


        /*  83 */
        List<Room> rooms = this.mainMapper.getAllRooms();

        /*  85 */
        JSONArray jsonArrayRooms = new JSONArray();
        /*  86 */
        for (Room r : rooms) {
            /*  87 */
            JSONObject jsonObject = new JSONObject();

            /*  89 */
            jsonObject.put("id", Integer.valueOf(r.getId()));
            /*  90 */
            jsonObject.put("name", r.getName() + "(" + r.getPeopleCount() + ")");
            /*  91 */
            jsonObject.put("textColor", "white");
            /*  92 */
            jsonArrayRooms.add(jsonObject);
        }

        /*  95 */
        param.put("rooms", jsonArrayRooms);
        /*  96 */
        param.put("events", jsonArrayEvents);


        /*  99 */
        return param;
    }


    public JSONObject viewByRoom(int roomId) {
        /* 105 */
        JSONObject param = new JSONObject();


        /* 108 */
        List<Event> events = this.mainMapper.getAllEvents();

        /* 110 */
        JSONArray jsonArrayEvents = new JSONArray();
        /* 111 */
        for (Event e : events) {

            /* 113 */
            JSONObject jsonObject = new JSONObject();
            /* 114 */
            jsonObject.put("title", e.getName());
            /* 115 */
            jsonObject.put("roomId", Integer.valueOf(e.getRoomId()));
            /* 116 */
            jsonObject.put("textColor", "white");
            /* 117 */
            String startDate = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")).format(e.getStartTime());
            /* 118 */
            String endDate = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")).format(e.getEndTime());
            /* 119 */
            jsonObject.put("start", startDate);
            /* 120 */
            jsonObject.put("end", endDate);

            /* 122 */
            if (e.getRoomId() == roomId) {
                /* 123 */
                jsonArrayEvents.add(jsonObject);
            }
        }



        /* 129 */
        List<Room> rooms = this.mainMapper.getAllRooms();

        /* 131 */
        JSONArray jsonArrayRooms = new JSONArray();

        /* 133 */
        String nowRoomName = "";
        /* 134 */
        for (Room r : rooms) {
            /* 135 */
            JSONObject jsonObject = new JSONObject();

            /* 137 */
            jsonObject.put("id", Integer.valueOf(r.getId()));
            /* 138 */
            jsonObject.put("name", r.getName() + "(" + r.getPeopleCount() + ")");
            /* 139 */
            jsonObject.put("textColor", "white");
            /* 140 */
            if (r.getId() == roomId) {
                /* 141 */
                nowRoomName = r.getName() + "(" + r.getPeopleCount() + ")";
            }
            /* 143 */
            jsonArrayRooms.add(jsonObject);
        }

        /* 146 */
        param.put("rooms", jsonArrayRooms);
        /* 147 */
        param.put("events", jsonArrayEvents);

        /* 149 */
        param.put("nowRoomName", nowRoomName);

        /* 151 */
        return param;
    }

    public int  userEdit(int id , int roleId){
        return mainMapper.userEdit(id,roleId);
    }
}
