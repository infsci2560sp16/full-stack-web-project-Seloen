import com.google.gson.Gson;
import java.sql.Connection;

import java.util.HashMap;
import java.util.Map;

import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.*;

import com.heroku.sdk.jdbc.DatabaseUrl;
import java.text.SimpleDateFormat;
import static spark.Spark.get;


public class Userinfo {

    Gson gson = new Gson();

    public Userinfo() {
        getUserinfo();
    }


    private void getUserinfo() {
            String interest[]  = {"horror","comedy"};
            get("/userinfo", (req, res) -> {

                Map<String, Object> attributes = new HashMap<>();
                attributes.put("username","User1");
                attributes.put("interests",interest);

               
           return new ModelAndView(attributes, "userinfo.ftl");
           }, new FreeMarkerEngine());
    }



}