package com.ss.ttuploader;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class TTExternResponseInfo {
    public byte[] responseBody;
    public JSONObject responseHeader;
    public String responseHeaderStr;
    public int statusCode;
    public String url;

    static {
        Covode.recordClassIndex(101385);
    }

    public byte[] getResponseBody() {
        return this.responseBody;
    }

    public JSONObject getResponseHeader() {
        return this.responseHeader;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getUrl() {
        return this.url;
    }

    public void setResponseBody(byte[] bArr) {
        this.responseBody = bArr;
    }

    public void setStatusCode(int i2) {
        this.statusCode = i2;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setResponseHeader(JSONObject jSONObject) {
        this.responseHeader = jSONObject;
        if (jSONObject != null) {
            this.responseHeaderStr = jSONObject.toString();
        }
    }
}
