package com.ss.android.ugc.aweme.account.login.loginlog;

import com.bytedance.covode.number.Covode;

public class LoginLog {
    public String action;
    public String cookie;
    public String errorDesc;
    public String errorUrl;
    public boolean isLogin;
    public boolean isSuccess;
    public String platform;
    public String postParams;
    public String time;

    static {
        Covode.recordClassIndex(39130);
    }
}
