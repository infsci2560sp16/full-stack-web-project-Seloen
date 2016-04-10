import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import java.net.URI;
import java.net.URISyntaxException;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;

import static javax.measure.unit.SI.KILOGRAM;
import javax.measure.quantity.Mass;
import org.jscience.physics.model.RelativisticModel;
import org.jscience.physics.amount.Amount;

public class Main {

  public static void main(String[] args) {
   
    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");
     Object r3 = new Userinfo();
      
    get("/hello", (req, res) -> "Hello World");
//      get("/hello", (req, res) -> {
//          RelativisticModel.select();
//          
//          String energy = System.getenv().get("ENERGY");
//          
//          Amount<Mass> m = Amount.valueOf(energy).to(KILOGRAM);
//          return "E=mc^2: " + energy + " = " + m.toString();
//      });

    get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World!");

            return new ModelAndView(attributes, "index.ftl");

    }, new FreeMarkerEngine());



     get("/about", (req, res) -> {

          Connection connection = null;
          

          Map<String, Object> attributes = new HashMap<>();
          try {


              String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
             

                  xml += "<Movie>";
                  xml += "<Name>Resident Evil</Name>";
                  xml += "<Category>Thrilling</Category>";
                  xml += "<Year>2000</Year>";
                  xml += "<Country>United States</Country>";
                  xml += "<Director>David</Director>";
                  xml += "<LeadingActor>Milla Jovovich</LeadingActor>";
                  xml += "<Duration>115 minutes</Duration>";
                  xml += "<Cost>1,000,000</Cost>";
                  xml += "<Profit>2,000,000</Profit>";
                  xml += "<Awards>none</Awards>";
                  xml += "</Movie>";

            
              res.type("text/xml");
              return xml;

          } catch (Exception e) {
              attributes.put("message", "There was an error: " + e);
              return attributes;
          } finally {
              if (connection != null) try{connection.close();} catch(SQLException e){}
          }
      });

    /*get("/db", (req, res) -> {
      Connection connection = null;
      Map<String, Object> attributes = new HashMap<>();
      try {
        connection = DatabaseUrl.extract().getConnection();

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
        stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
        ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

        ArrayList<String> output = new ArrayList<String>();
        while (rs.next()) {
          output.add( "Read from DB: " + rs.getTimestamp("tick"));
        }

        attributes.put("results", output);
        return new ModelAndView(attributes, "db.ftl");
      } catch (Exception e) {
        attributes.put("message", "There was an error: " + e);
        return new ModelAndView(attributes, "error.ftl");
      } finally {
        if (connection != null) try{connection.close();} catch(SQLException e){}
      }
    }*/
      
//      String country[]  = {"China","United States"};
//      get("/userinfo", (req, res) -> {
//          
//          Map<String, Object> attributes = new HashMap<>();
//          attributes.put("username","User1");
//          attributes.put("countries",country);
//          
//          
//          return new ModelAndView(attributes, "userinfo.ftl");
//      }, new FreeMarkerEngine());
      
      
      
      
       get("/db", (req, res) -> {
      Connection connection = null;
      Map<String, Object> attributes = new HashMap<>();
      try {
        connection = DatabaseUrl.extract().getConnection();

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
        stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
        ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

        ArrayList<String> output = new ArrayList<String>();
        while (rs.next()) {
          output.add( "Read from DB: " + rs.getTimestamp("tick"));
        }

        attributes.put("results", output);
        return new ModelAndView(attributes, "db.ftl");
      } catch (Exception e) {
        attributes.put("message", "There was an error: " + e);
        return new ModelAndView(attributes, "error.ftl");
      } finally {
        if (connection != null) try{connection.close();} catch(SQLException e){}
      }
    }, new FreeMarkerEngine());

  }

}
