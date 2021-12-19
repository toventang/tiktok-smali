package com.ss.android.ugc.aweme.commercialize.log;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.commercialize.e;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f74810a = g.class.getSimpleName();

    static {
        Covode.recordClassIndex(46113);
    }

    public static void a(ah ahVar, Collection<String> collection, boolean z) {
        if (!b.a((Collection) collection)) {
            String a2 = RawURLGetter.a("other");
            for (String str : collection) {
                if (!TextUtils.isEmpty(str)) {
                    a(str, z, ahVar, a2);
                }
            }
        }
    }

    private static String a(String str, long j2, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.contains("{TS}") || str.contains("__TS__")) {
                str = str.replace("{TS}", String.valueOf(j2)).replace("__TS__", String.valueOf(j2));
            }
            String serverDeviceId = AppLog.getServerDeviceId();
            if (TextUtils.isEmpty(serverDeviceId)) {
                return str;
            }
            String a2 = e.a(str, serverDeviceId);
            if (a2.contains("{UA}") || a2.contains("__UA__")) {
                return a2.replace("{UA}", str2).replace("__UA__", str2);
            }
            return a2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    private static void a(String str, boolean z, ah ahVar, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = a(str, currentTimeMillis, str2);
        if (z) {
            a2 = m.b(a2);
        }
        Uri parse = Uri.parse(a2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url", a2);
            jSONObject.put("scheme", parse.getScheme());
            jSONObject.put("host", parse.getHost());
            jSONObject.put("path", parse.getPath());
            jSONObject.put("ref", "native");
        } catch (JSONException unused) {
        }
        RawURLGetter.a(a2, new h(ahVar, a2, currentTimeMillis, jSONObject));
    }
}
