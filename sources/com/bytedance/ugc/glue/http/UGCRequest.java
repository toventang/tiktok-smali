package com.bytedance.ugc.glue.http;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONObject;

public class UGCRequest<T> {
    public static String HOST = "";
    public static String SCHEME = "https";
    public static boolean USE_GET_METHOD;
    private UGCCallback<T> callback;
    private UGCCallbackWithHeader<T> callbackWithHeader;
    private final HashMap<String, String> getParams = new HashMap<>();
    protected String host = HOST;
    protected JSONObject jsonParams = null;
    private final HashMap<String, String> params = new HashMap<>();
    protected String scheme = SCHEME;
    protected String url;
    protected boolean useGetMethod = USE_GET_METHOD;

    public UGCCallback<T> getCallback() {
        return this.callback;
    }

    public UGCCallbackWithHeader<T> getCallbackWithHeader() {
        return this.callbackWithHeader;
    }

    public HashMap<String, String> getGetParams() {
        return this.getParams;
    }

    public String getHost() {
        return this.host;
    }

    public JSONObject getJsonParams() {
        return this.jsonParams;
    }

    public HashMap<String, String> getParams() {
        return this.params;
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isUseGetMethod() {
        return this.useGetMethod;
    }

    public void send() {
        UGCHttpService.send(this);
    }

    static {
        Covode.recordClassIndex(27951);
    }

    public void setCallback(UGCCallback<T> uGCCallback) {
        this.callback = uGCCallback;
    }

    public void setCallbackWithHeader(UGCCallbackWithHeader<T> uGCCallbackWithHeader) {
        this.callbackWithHeader = uGCCallbackWithHeader;
    }

    /* access modifiers changed from: protected */
    public void addGetParam(String str, Object obj) {
        if (obj != null) {
            this.getParams.put(str, String.valueOf(obj));
        }
    }

    /* access modifiers changed from: protected */
    public void addParam(String str, Object obj) {
        if (obj != null) {
            this.params.put(str, String.valueOf(obj));
        }
    }
}
