package com.bytedance.apm.agent.tracing;

import com.bytedance.covode.number.Covode;

public class Trace {
    public String className;
    public long entryTime;
    public long exitTime;
    public String extraData;
    public String methodName;
    public String scene;
    public String traceType;

    static {
        Covode.recordClassIndex(14383);
    }

    public Trace() {
    }

    public void setExitTime(long j2) {
        this.exitTime = j2;
    }

    public void setExtraData(String str) {
        this.extraData = str;
    }

    public Trace(String str, String str2, long j2, String str3) {
        this.className = str;
        this.methodName = str2;
        this.entryTime = j2;
        this.traceType = str3;
    }

    public Trace(String str, String str2, String str3, long j2, String str4) {
        this.scene = str;
        this.className = str2;
        this.methodName = str3;
        this.entryTime = j2;
        this.traceType = str4;
    }
}
