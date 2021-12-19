package com.ss.android.ugc.aweme.login;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.account.login.loginlog.LoginLog;
import com.ss.android.ugc.aweme.account.login.loginlog.a;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;
import java.text.SimpleDateFormat;
import java.util.Date;

public class l extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(69821);
    }

    public void onReceive(Context context, Intent intent) {
        b.b().logout("expired_logout", "sdk_expired_logout");
        a a2 = a.a();
        boolean isLogin = b.g().isLogin();
        LoginLog loginLog = new LoginLog();
        loginLog.errorDesc = "session_expire";
        loginLog.errorUrl = "";
        loginLog.isSuccess = false;
        loginLog.isLogin = isLogin;
        loginLog.platform = "user_login_out";
        loginLog.time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        if (a2.f63489a != null) {
            a2.f63489a.add(loginLog);
        }
        n.a("aweme_user_logout", "", new c().a("errorDesc", "session_expire").a());
    }
}
