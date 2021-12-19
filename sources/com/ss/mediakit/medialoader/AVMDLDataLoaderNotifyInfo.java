package com.ss.mediakit.medialoader;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class AVMDLDataLoaderNotifyInfo {
    public long code;
    public JSONObject jsonLog;
    public String logExtraJsonStr;
    public String logInfo;
    public String logType;
    public long parameter;
    public int what;

    static {
        Covode.recordClassIndex(101119);
    }

    public AVMDLDataLoaderNotifyInfo() {
        this.what = -1;
        this.code = -1;
        this.parameter = -1;
    }

    public void logToJson() {
        if (this.logInfo != null) {
            this.jsonLog = null;
            try {
                this.jsonLog = new JSONObject(this.logInfo);
            } catch (Exception unused) {
                this.jsonLog = null;
            }
        }
    }

    public AVMDLDataLoaderNotifyInfo(int i2, int i3, String str) {
        this.what = i2;
        this.code = (long) i3;
        this.parameter = -1;
        this.logInfo = str;
    }
}
