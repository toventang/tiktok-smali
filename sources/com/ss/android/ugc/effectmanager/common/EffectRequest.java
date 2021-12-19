package com.ss.android.ugc.effectmanager.common;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class EffectRequest {
    private long contentLength;
    private String errorMsg;
    protected boolean isCancel;
    private Map<String, Object> mBodyParams = new HashMap();
    private String mContentType = "application/x-www-form-urlencoded";
    private Map<String, String> mHeaders = new HashMap();
    String mHttpMethod = "GET";
    private String mUrl = "";
    private boolean mUseCommonParams = true;

    static {
        Covode.recordClassIndex(95243);
    }

    public void cancel() {
        this.isCancel = true;
    }

    /* access modifiers changed from: protected */
    public String getParamsEncoding() {
        return "UTF-8";
    }

    public long getContentLength() {
        return this.contentLength;
    }

    public String getContentType() {
        return this.mContentType;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    public String getHttpMethod() {
        return this.mHttpMethod;
    }

    public Map<String, Object> getParams() {
        return this.mBodyParams;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean isCanceled() {
        return this.isCancel;
    }

    public boolean isUseCommonParams() {
        return this.mUseCommonParams;
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public void setBodyParams(Map<String, Object> map) {
        this.mBodyParams = map;
    }

    public void setContentLength(long j2) {
        this.contentLength = j2;
    }

    public void setContentType(String str) {
        this.mContentType = str;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setUseCommonParams(boolean z) {
        this.mUseCommonParams = z;
    }

    public EffectRequest(String str, String str2) {
        this.mHttpMethod = str;
        this.mUrl = str2;
        this.mUseCommonParams = true;
    }

    public EffectRequest(String str, String str2, boolean z) {
        this.mHttpMethod = str;
        this.mUrl = str2;
        this.mUseCommonParams = z;
    }
}
