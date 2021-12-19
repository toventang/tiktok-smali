package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class SpeedPredictorResultItem {
    private float mbandwidth;
    private String mhost;
    private String mloadType;
    private int mtrackType;

    static {
        Covode.recordClassIndex(28053);
    }

    public float getBandwidth() {
        return this.mbandwidth;
    }

    public String getHost() {
        return this.mhost;
    }

    public String getLoadType() {
        return this.mloadType;
    }

    public int getTrackType() {
        return this.mtrackType;
    }

    public JSONObject toJsonObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.mloadType;
            if (str != null) {
                jSONObject.put("loadType", str);
            }
            String str2 = this.mhost;
            if (str2 != null) {
                jSONObject.put("host", str2);
            }
            jSONObject.put("bandwidth", (double) this.mbandwidth);
            jSONObject.put("trackType", this.mtrackType);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void setBandwidth(float f2) {
        this.mbandwidth = f2;
    }

    public void setHost(String str) {
        this.mhost = str;
    }

    public void setLoadType(String str) {
        this.mloadType = str;
    }

    public void setTrackType(int i2) {
        this.mtrackType = i2;
    }

    public SpeedPredictorResultItem(String str, String str2, float f2, int i2) {
        this.mloadType = str;
        this.mhost = str2;
        this.mbandwidth = f2;
        this.mtrackType = i2;
    }
}
