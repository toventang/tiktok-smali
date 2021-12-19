package com.bytedance.vcloud.networkpredictor;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class SpeedPredictorRecordItem {
    private long mBytes;
    private long mLastDataRecv;
    private String mProtocol;
    private long mTcpInfoRtt;
    private long mTime;
    private long mTimestamp;
    private int mTrackType;
    private String mhost;
    private String mloadType;

    static {
        Covode.recordClassIndex(28049);
    }

    public long getBytes() {
        return this.mBytes;
    }

    public String getHost() {
        return this.mhost;
    }

    public long getLastDataRecv() {
        return this.mLastDataRecv;
    }

    public String getLoadType() {
        return this.mloadType;
    }

    public String getProtocol() {
        return this.mProtocol;
    }

    public long getTcpInfoRtt() {
        return this.mTcpInfoRtt;
    }

    public long getTime() {
        return this.mTime;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public int getTrackType() {
        return this.mTrackType;
    }

    public void setBytes(long j2) {
        this.mBytes = j2;
    }

    public void setHost(String str) {
        this.mhost = str;
    }

    public void setLastDataRecv(long j2) {
        this.mLastDataRecv = j2;
    }

    public void setLoadType(String str) {
        this.mloadType = str;
    }

    public void setProtocol(String str) {
        this.mProtocol = str;
    }

    public void setTcpInfoRtt(long j2) {
        this.mTcpInfoRtt = j2;
    }

    public void setTime(long j2) {
        this.mTime = j2;
    }

    public void setTimestamp(long j2) {
        this.mTimestamp = j2;
    }

    public void setTrackType(int i2) {
        this.mTrackType = i2;
    }

    public void extractFields(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mTrackType = jSONObject.optInt("trackType");
            this.mBytes = jSONObject.optLong("size");
            this.mTime = jSONObject.optLong("costTime");
            this.mTimestamp = jSONObject.optLong("timestamp");
            this.mloadType = jSONObject.optString("loadType");
            this.mhost = jSONObject.optString("host");
            this.mTcpInfoRtt = jSONObject.optLong("rtt");
            this.mLastDataRecv = jSONObject.optLong("last_data_recv");
            this.mProtocol = jSONObject.optString("protocol");
        }
    }
}
