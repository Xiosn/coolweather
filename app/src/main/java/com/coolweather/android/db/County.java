package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String countyName(){
        return countyName;
    }

    public void setcountyName(String countyName){
        this.countyName=countyName;
    }

    public String getweatherId(){
        return weatherId;
    }

    public void setweatherId(String weatherId){
        this.weatherId=weatherId;
    }

    public int getcityId(){
        return cityId;
    }

    public void setcityId(int cityId){
        this.cityId=cityId;
    }
}
