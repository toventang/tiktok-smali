package com.ss.android.ugc.effectmanager.common.task;

import android.accounts.NetworkErrorException;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.ErrorConstants;
import com.ss.android.ugc.effectmanager.common.exception.MD5Exception;
import com.ss.android.ugc.effectmanager.common.exception.NetException;
import com.ss.android.ugc.effectmanager.common.exception.StatusCodeException;
import com.ss.android.ugc.effectmanager.common.exception.UnzipException;
import com.ss.android.ugc.effectmanager.common.exception.UrlNotExistException;
import java.io.IOException;
import org.json.JSONException;

public class ExceptionResult {
    private int errorCode;
    private Exception exception;
    private String msg;
    private String remoteIp;
    private String requestUrl;
    private String selectedHost;

    static {
        Covode.recordClassIndex(95315);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getMsg() {
        return this.msg;
    }

    public String toString() {
        if (this.exception != null) {
            return "ExceptionResult{errorCode=" + this.errorCode + ", msg='" + this.msg + '\'' + ", requestUrl='" + this.requestUrl + '\'' + ", selectedHost='" + this.selectedHost + '\'' + ", remoteIp='" + this.remoteIp + '\'' + ", exception=" + this.exception.getMessage() + '}';
        }
        return "ExceptionResult{errorCode=" + this.errorCode + ", msg='" + this.msg + ", requestUrl='" + this.requestUrl + '\'' + ", selectedHost='" + this.selectedHost + '\'' + ", remoteIp='" + this.remoteIp + '\'' + '}';
    }

    public void setErrorCode(int i2) {
        this.errorCode = i2;
    }

    public void setException(Exception exc) {
        this.exception = exc;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public ExceptionResult(Exception exc) {
        this(exc, null, null, null);
    }

    public ExceptionResult(int i2) {
        this.errorCode = -1;
        this.errorCode = i2;
        this.msg = ErrorConstants.APIErrorHandle(i2);
        this.exception = null;
    }

    public ExceptionResult(int i2, Exception exc) {
        this.errorCode = -1;
        this.errorCode = i2;
        this.msg = ErrorConstants.APIErrorHandle(i2);
        this.exception = exc;
    }

    public void setTrackParams(String str, String str2, String str3) {
        this.requestUrl = str;
        this.selectedHost = str2;
        this.remoteIp = str3;
    }

    public ExceptionResult(Exception exc, String str, String str2, String str3) {
        this.errorCode = -1;
        this.requestUrl = str;
        this.selectedHost = str2;
        this.remoteIp = str3;
        this.exception = exc;
        if (exc instanceof NetException) {
            this.errorCode = ((NetException) exc).getStatus_code();
            this.msg = exc.getMessage();
        } else if (exc instanceof StatusCodeException) {
            this.errorCode = ((StatusCodeException) exc).getStatusCode();
            this.msg = exc.getMessage();
        } else if (exc instanceof JSONException) {
            this.errorCode = 10008;
            this.msg = exc.getMessage();
        } else if (exc instanceof NetworkErrorException) {
            this.errorCode = 10002;
            this.msg = exc.getMessage();
        } else if (exc instanceof UrlNotExistException) {
            this.errorCode = 10015;
            this.msg = exc.getMessage();
        } else if (exc instanceof UnzipException) {
            this.errorCode = 10013;
            this.msg = exc.getMessage();
        } else if (exc instanceof MD5Exception) {
            this.errorCode = 10010;
            this.msg = exc.getMessage();
        } else if (exc instanceof IOException) {
            this.errorCode = 10012;
            this.msg = exc.getMessage();
        } else if (exc != null) {
            if ("network unavailable".equals(exc.getMessage())) {
                this.errorCode = 10011;
            } else {
                this.errorCode = 10005;
            }
            this.msg = exc.getMessage();
        } else {
            this.errorCode = 1;
            this.msg = ErrorConstants.APIErrorHandle(1);
        }
    }
}
