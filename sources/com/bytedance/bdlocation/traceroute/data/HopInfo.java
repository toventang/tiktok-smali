package com.bytedance.bdlocation.traceroute.data;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class HopInfo {
    private int hop;
    private List<HopData> hopData;

    static {
        Covode.recordClassIndex(15498);
    }

    public int getHop() {
        return this.hop;
    }

    public List<HopData> getHopData() {
        return this.hopData;
    }

    public void setHop(int i2) {
        this.hop = i2;
    }

    public void setHopData(List<HopData> list) {
        this.hopData = list;
    }
}
