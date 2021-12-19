package com.bytedance.bdlocation.traceroute.data;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class TraceEntity {
    private List<TracerouteInfo> tracerouteInfo;

    static {
        Covode.recordClassIndex(15499);
    }

    public List<TracerouteInfo> getTracerouteInfo() {
        return this.tracerouteInfo;
    }

    public void setTracerouteInfo(List<TracerouteInfo> list) {
        this.tracerouteInfo = list;
    }
}
