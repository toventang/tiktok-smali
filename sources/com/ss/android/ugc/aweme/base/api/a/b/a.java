package com.ss.android.ugc.aweme.base.api.a.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;

public class a extends com.ss.android.ugc.aweme.base.api.a.a {

    /* renamed from: a  reason: collision with root package name */
    private static f f67980a;
    private int blockCode;
    protected String mErrorMsg;
    protected String mPrompt;
    private Object mResponse;
    protected String mUrl;

    static {
        Covode.recordClassIndex(41860);
    }

    public int getBlockCode() {
        return this.blockCode;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getPrompt() {
        return this.mPrompt;
    }

    public Object getRawResponse() {
        return this.mResponse;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String getResponse() {
        return convertResponseToString();
    }

    public String convertResponseToString() {
        Object obj = this.mResponse;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (f67980a == null) {
            f67980a = new f();
        }
        String b2 = f67980a.b(this.mResponse);
        this.mResponse = b2;
        return b2;
    }

    public a(int i2) {
        super(i2);
    }

    public void setBlockCode(int i2) {
        this.blockCode = i2;
    }

    public a setErrorMsg(String str) {
        this.mErrorMsg = str;
        return this;
    }

    public a setPrompt(String str) {
        this.mPrompt = str;
        return this;
    }

    public a setResponse(Object obj) {
        this.mResponse = obj;
        return this;
    }

    public a setUrl(String str) {
        this.mUrl = str;
        return this;
    }

    public a setResponse(String str) {
        this.mResponse = str;
        return this;
    }
}
