package com.jayson.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jayson.controller.MainController;
import com.jayson.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
    @Autowired
    MainService mainService;

    @RequestMapping({"/"})
    public String index(Model model) {
        /* 24 */
        JSONObject param = this.mainService.init();

        /* 26 */
        JSONArray events = param.getJSONArray("events");

        /* 28 */
        System.out.println(events.toJSONString());

        /* 30 */
        model.addAttribute("events", events);

        /* 32 */
        return "index";
    }

    @RequestMapping({"/view"})
    public String view(Model model) {
        /* 37 */
        JSONObject param = this.mainService.view();

        /* 39 */
        JSONArray events = param.getJSONArray("events");
        /* 40 */
        JSONArray rooms = param.getJSONArray("rooms");

        /* 42 */
        System.out.println(events.toJSONString());
        /* 43 */
        System.out.println(rooms.toJSONString());

        /* 45 */
        model.addAttribute("events", events);
        /* 46 */
        model.addAttribute("rooms", rooms);
        /* 47 */
        return "view";
    }

    @RequestMapping({"/viewBack"})
    public String viewBack(Model model) {
        /* 52 */
        JSONObject param = this.mainService.view();

        /* 54 */
        JSONArray events = param.getJSONArray("events");
        /* 55 */
        JSONArray rooms = param.getJSONArray("rooms");

        /* 57 */
        System.out.println(events.toJSONString());
        /* 58 */
        System.out.println(rooms.toJSONString());

        /* 60 */
        model.addAttribute("events", events);
        /* 61 */
        model.addAttribute("rooms", rooms);
        /* 62 */
        return "view2";
    }


    @RequestMapping({"/viewByRoom/{roomId}"})
    public String viewByRoom(@PathVariable("roomId") Integer roomId, Model model) {
        /* 68 */
        JSONObject param = this.mainService.viewByRoom(roomId.intValue());
        /* 69 */
        JSONArray events = param.getJSONArray("events");
        /* 70 */
        JSONArray rooms = param.getJSONArray("rooms");
        /* 71 */
        System.out.println(events.toJSONString());
        /* 72 */
        System.out.println(rooms.toJSONString());
        /* 73 */
        model.addAttribute("events", events);
        /* 74 */
        model.addAttribute("rooms", rooms);
        /* 75 */
        model.addAttribute("nowRoomName", param.get("nowRoomName"));
        /* 76 */
        return "view";
    }


    @RequestMapping({"/viewByRoomBack/{roomId}"})
    public String viewByRoomBack(@PathVariable("roomId") Integer roomId, Model model) {
        /* 82 */
        JSONObject param = this.mainService.viewByRoom(roomId.intValue());
        /* 83 */
        JSONArray events = param.getJSONArray("events");
        /* 84 */
        JSONArray rooms = param.getJSONArray("rooms");
        /* 85 */
        System.out.println(events.toJSONString());
        /* 86 */
        System.out.println(rooms.toJSONString());
        /* 87 */
        model.addAttribute("events", events);
        /* 88 */
        model.addAttribute("rooms", rooms);
        /* 89 */
        model.addAttribute("nowRoomName", param.get("nowRoomName"));
        /* 90 */
        return "view2";
    }

    @ResponseBody
    @RequestMapping({"user/edit"})
    public JSONObject userEdit(@RequestParam("userid") int id, @RequestParam("roleid") int roleId) {
        JSONObject jsonObject = new JSONObject();

        if (mainService.userEdit(id, roleId) > 0) {
            jsonObject.put("success", true);
        }
        return jsonObject;
    }

}


/* Location:              C:\Users\MichaelOD_WIN10\Desktop\fsdownload\sdu-meeting-0.0.9-SNAPSHOT.jar!\BOOT-INF\classes\com\jayson\controller\MainController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */