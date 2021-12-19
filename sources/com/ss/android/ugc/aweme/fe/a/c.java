package com.ss.android.ugc.aweme.fe.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.q;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c {
    static {
        Covode.recordClassIndex(57234);
    }

    public static Map<String, String> a() {
        HashMap hashMap = new HashMap();
        q.b(hashMap, true);
        return hashMap;
    }

    public static Map<String, String> a(List<String> list) {
        HashMap hashMap = new HashMap();
        hashMap.put("appVersion", d.f());
        hashMap.put("device_id", AppLog.getServerDeviceId());
        Context a2 = d.a();
        if (TextUtils.isEmpty(j.f107227f) || !j.b() || j.c()) {
            j.f107227f = NetworkUtils.getNetworkAccessType(a2);
        }
        hashMap.put("netType", j.f107227f);
        hashMap.put("appName", d.b());
        hashMap.put("aid", String.valueOf(d.n));
        hashMap.put("user_id", b.g().getCurUserId());
        hashMap.put("versionCode", String.valueOf(d.e()));
        hashMap.put("channel", d.s);
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put("device_platform", "android");
        hashMap.put("ironManSupported", String.valueOf(c.a.f109704a.a().checkMiniAppEnable(d.a())));
        hashMap.put("prefetch_enable", "1");
        hashMap.put("device_type", Build.MODEL);
        if (list != null) {
            for (String str : list) {
                hashMap.remove(str);
            }
        }
        return hashMap;
    }
}
