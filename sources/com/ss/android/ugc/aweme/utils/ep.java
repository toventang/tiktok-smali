package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import org.json.JSONObject;

public final class ep {
    static {
        Covode.recordClassIndex(93490);
    }

    public static void a(int i2, String str, String str2) {
        if (TextUtils.isEmpty(str) || (!str.contains("check/in") && !str.contains("story") && !str.contains("rec/new") && !str.contains("follow/feed"))) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            if (i2 == 8 && createIUserServicebyMonsterPlugin.isLogin()) {
                try {
                    b.b().logout("LoginoutMonitorHelperLancet", "sdk_expired_logout");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("errorDesc", "api return errorcode==8");
                    jSONObject.put("errorUrl", str);
                    jSONObject.put("errorCookies", CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost()));
                    jSONObject.put("errorResponse", str2);
                    o.b("aweme_user_logout", "", jSONObject);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
