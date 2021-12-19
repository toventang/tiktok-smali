package com.ss.android.ugc.aweme.share;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.g;
import java.util.UUID;

public final class ad {
    static {
        Covode.recordClassIndex(81002);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("utm_source")) {
            return str.replaceAll("utm_source=\\w*_?\\w?", "utm_source=".concat(String.valueOf(str2)));
        }
        g gVar = new g(str);
        gVar.a("utm_source", str2);
        gVar.a("utm_campaign", "client_share");
        gVar.a("utm_medium", "android");
        gVar.a("share_iid", AppLog.getInstallId());
        gVar.a("share_link_id", new StringBuilder().append(UUID.randomUUID()).toString());
        gVar.a("share_app_id", d.n);
        return gVar.a();
    }

    public static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        return ah.f123353b.a(str, str2, str3).cE_();
    }
}
