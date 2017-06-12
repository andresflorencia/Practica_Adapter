package com.example.andres_dell.practica_adapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by ANDRES-DELL on 07/06/2017.
 */
public class Noticias {
    private String titulo;
    private String subtitulo;
    private String URL;

//    public Noticias(String tit, String sub){
//        titulo = tit;
//        subtitulo = sub;
//    }

    public Noticias(JSONObject a) throws JSONException {
        titulo=a.getString("titu");
        subtitulo=a.getString("intr");
    }

    public String getTitulo(){
        return titulo;
    }
    public String getSubtitulo(){
        return subtitulo;
    }

    public static ArrayList<Noticias> JsonObjectBuild(JSONArray datos) throws JSONException {
        ArrayList<Noticias> noticias = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            noticias.add(new Noticias(datos.getJSONObject(i)));
        }
    }

}
