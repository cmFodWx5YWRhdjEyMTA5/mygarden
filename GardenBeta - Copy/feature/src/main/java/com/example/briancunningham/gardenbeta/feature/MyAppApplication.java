package com.example.briancunningham.gardenbeta.feature;

import android.app.Application;
import android.util.Log;

import java.util.ArrayList;
// this is what I've been using as a global variable!
public class MyAppApplication extends Application {

    private ArrayList<verynicedatapoint> recordedData = new ArrayList<>();

        public void testingmessage(){
            Log.d("consoleprinting","scroopy doopers");
        }

    public ArrayList<verynicedatapoint> getRecordedData() {
        return this.recordedData;
    }

    public int size(){
            return recordedData.size();
    }

    public void addavalue() {
        verynicedatapoint temppoint = new verynicedatapoint();
        this.recordedData.add(temppoint);
    }

    public float getAirtemplevel(int z) {
        return recordedData.get(z).getAirtemplevel();
    }

    public float getAmbienthumiditylevel(int z) {
        return recordedData.get(z).getAirtemplevel();
    }

    public float getCanopyheightlevel(int z) {
        return recordedData.get(z).getCanopyheightlevel();
    }

    public float getCo2level(int z){
        return recordedData.get(z).getCo2level();
    }

    public float getDolevel(int z){
        return recordedData.get(z).getDolevel();
    }

    public float getLightheight(int z){
        return recordedData.get(z).getLightheight();
    }

    public float getO2level(int z){
        return recordedData.get(z).getO2level();
    }

    public float getOrplevel(int z){
        return recordedData.get(z).getOrplevel();
    }

    public float getTdslevel(int z){
        return recordedData.get(z).getTdslevel();
    }
    public float getPhlevel (int z){
        return recordedData.get(z).getPhlevel();
    }
    public float getSolutiontemplevel(int z){
        return recordedData.get(z).getSolutiontemplevel();
    }

    public boolean getReservoirs(int z){
        return recordedData.get(z).getReservoirs();
    }

    public String getDatapointdatetime(int z) {return recordedData.get(z).getDatapointdatetime();}






}