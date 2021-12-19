package com.bytedance.android.live.a.a.b;

import com.bytedance.covode.number.Covode;

public class a extends com.bytedance.android.live.a.a.a {
    private String mAlert;
    private Object mData;
    private String mErrorMsg;
    private String mExtra;
    private String mPrompt;

    static {
        Covode.recordClassIndex(3518);
    }

    public String getAlert() {
        return this.mAlert;
    }

    public Object getData() {
        return this.mData;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getExtra() {
        return this.mExtra;
    }

    public String getPrompt() {
        return this.mPrompt;
    }

    @Override // com.bytedance.android.live.a.a.a
    public String getMessage() {
        return " TYPE = ApiServerException, errorMsg = " + this.mErrorMsg + " extra = " + this.mExtra + " " + super.getMessage();
    }

    public a(int i2) {
        super(i2);
    }

    public a setAlert(String str) {
        this.mAlert = str;
        return this;
    }

    public a setData(Object obj) {
        this.mData = obj;
        return this;
    }

    public a setErrorMsg(String str) {
        this.mErrorMsg = str;
        return this;
    }

    public a setExtra(String str) {
        this.mExtra = str;
        return this;
    }

    public a setPrompt(String str) {
        this.mPrompt = str;
        return this;
    }
}
