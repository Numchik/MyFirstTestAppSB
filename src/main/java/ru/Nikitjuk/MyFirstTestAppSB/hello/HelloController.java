package ru.Nikitjuk.MyFirstTestAppSB.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello (@RequestParam(value = "name",
    defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
        }
        private ArrayList<String> arrayList;
        private HashMap<Integer, String> hashMap;

        @GetMapping("/update-array")
    public String updatearray(@RequestParam (value = "value")String value ) {
            String txt = "";
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                txt = "ArrayList was created";
            } else {
                arrayList.add(value);
                txt = "ArrayList was updated " + value;
            }
            return txt;
        }
    @GetMapping("/show-array")
    public ArrayList<String> showarray() {
        return arrayList;
    }
    @GetMapping("/update-map")
    public String updatemap(@RequestParam(value = "value") String value) {
        String txt = "";
        if (hashMap == null) {
            hashMap = new HashMap<Integer, String>();
            txt = "HashMap was created";
        } else {
            hashMap.put(hashMap.size(), value);
            txt = "HashMap was updated " + value;
        }

        return txt;
    }
    @GetMapping("/show-hashMap")
    public HashMap<Integer, String> showHashMap() {
        return hashMap;
    }
    @GetMapping("/showAllLength")
    public String showAllLength() {
        return String.format("ArrayList length: %d, HashMap length: %d", arrayList.size(), hashMap.size());
    }


}
