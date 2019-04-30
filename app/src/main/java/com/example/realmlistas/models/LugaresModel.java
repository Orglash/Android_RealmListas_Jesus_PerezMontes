package com.example.realmlistas.models;


import com.example.realmlistas.application.MyApp;
import io.realm.RealmList;
import io.realm.RealmObject;


public class LugaresModel extends RealmObject {

    private int id;
    private String lugar;
    private String provincia;
    private RealmList<LugaresModel> LugaresList;

    public LugaresModel() {

    }

    public LugaresModel(String lugar, String provincia) {
        this.id = MyApp.lugarId.incrementAndGet();
        this.lugar = lugar;
        this.provincia = provincia;
    }

    public int getId() {
        return id;
    }

    public String getLugar() {
        return lugar;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}

