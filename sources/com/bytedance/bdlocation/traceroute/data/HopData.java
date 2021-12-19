package com.bytedance.bdlocation.traceroute.data;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class HopData {
    private List<Double> cost;
    private String host;
    private String ip;

    static {
        Covode.recordClassIndex(15497);
    }

    public List<Double> getCost() {
        return this.cost;
    }

    public String getHost() {
        return this.host;
    }

    public String getIp() {
        return this.ip;
    }

    public void setCost(List<Double> list) {
        this.cost = list;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setIp(String str) {
        this.ip = str;
    }
}
