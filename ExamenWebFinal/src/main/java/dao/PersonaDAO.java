/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.BusquedaBean;
import beans.Persona;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.commons.collections4.IteratorUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Dell
 */
public class PersonaDAO {
    static  String urlArchivo="C:\\Users\\Dell\\Desktop\\fuzzy-search.txt";
     public boolean escribirElementoJSON(String objetoJSON) throws ParseException {
            JSONObject obj = new JSONObject();
            JSONObject json = new JSONObject();
            Gson g = new Gson();
            JSONParser parser = new JSONParser();
            try (Reader reader = new FileReader(urlArchivo)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONArray msg = (JSONArray) jsonObject.get("personas");
            System.out.println(objetoJSON.replace("??", "\""));
            Persona p = g.fromJson(objetoJSON.replaceAll("�", "\""), Persona.class);
            json.put("name", p.getName());
            //System.out.println(p);
            msg.add(json);
            obj.put("personas", msg);
            try (FileWriter file = new FileWriter(urlArchivo)) {
                file.write(obj.toJSONString());
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
         }catch (IOException ex) {
            ex.printStackTrace();
            return false;
        } catch (ParseException ec) {
            ec.printStackTrace();
            return false;
        }
            //  System.out.print(obj);
        
    }

    public  List obtenerPersonas() {
         List myList = new ArrayList();
        JSONParser parser = new JSONParser();
         JSONArray msg = new JSONArray();

        try (Reader reader = new FileReader(urlArchivo)) {

            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            // loop array
            msg = (JSONArray) jsonObject.get("personas");
            Iterator<Persona> iterator = msg.iterator();
            myList=msg;

        } catch (IOException e) {
            myList = new ArrayList<Persona>();
            e.printStackTrace();
        } catch (ParseException e) {
            myList = new ArrayList<Persona>();
            e.printStackTrace();
        }
        
        return myList;
    }


public Object buscarPersona(String jsonBusqueda){
    
   Object o= new Object();
    JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader(urlArchivo)) {
            Gson g = new Gson();
            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("personas");
           
            BusquedaBean b = g.fromJson(jsonBusqueda.replaceAll("�", "\""), BusquedaBean.class);
            
            System.out.println(b);
            
            for (int i = 0; i < msg.size(); i++) {
                JSONObject objetoEncontrado=(JSONObject) msg.get(i);                
                if (objetoEncontrado.get("name").toString().contains(b.getSearch())) {
                 //p.setName(objetoEncontrado.get("name").toString());
                    o=msg.get(i);
                }
            }

        } catch (IOException e) {
            o= new Object();
            e.printStackTrace();
        } catch (ParseException e) {
            o=new Object();
            e.printStackTrace();
        }
        return o;
}
}
