package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.b;
import org.json.JSONObject;

public class TTExternRequestInfo {
    private byte[] data;
    private b extraInfo;
    private String method;
    private JSONObject requestHeader;
    private String url;

    static {
        Covode.recordClassIndex(101384);
    }

    public TTExternRequestInfo() {
    }

    public byte[] getData() {
        return this.data;
    }

    public b getExtraInfo() {
        return this.extraInfo;
    }

    public String getMethod() {
        return this.method;
    }

    public JSONObject getRequestHeader() {
        return this.requestHeader;
    }

    public String getUrl() {
        return this.url;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setExtraInfo(b bVar) {
        this.extraInfo = bVar;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRequestHeader(JSONObject jSONObject) {
        this.requestHeader = jSONObject;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public TTExternRequestInfo(String str, String str2, JSONObject jSONObject, byte[] bArr, b bVar) {
        this.url = str;
        this.method = str2;
        this.data = bArr;
        this.requestHeader = jSONObject;
        this.extraInfo = bVar;
    }
}
