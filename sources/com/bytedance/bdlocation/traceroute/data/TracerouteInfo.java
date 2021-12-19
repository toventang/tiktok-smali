package com.bytedance.bdlocation.traceroute.data;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class TracerouteInfo {
    private String cmd;
    private String domain;
    private String execInfo;
    private List<HopInfo> hopInfo;
    private String networkType;
    private long timestamp;

    static {
        Covode.recordClassIndex(15500);
    }

    public String getCmd() {
        return this.cmd;
    }

    public String getDomain() {
        return this.domain;
    }

    public String getExecInfo() {
        return this.execInfo;
    }

    public List<HopInfo> getHopInfo() {
        return this.hopInfo;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setCmd(String str) {
        this.cmd = str;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setExecInfo(String str) {
        this.execInfo = str;
    }

    public void setHopInfo(List<HopInfo> list) {
        this.hopInfo = list;
    }

    public void setNetworkType(String str) {
        this.networkType = str;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }
}
