package com.ss.android.ugc.aweme.commercialize.track;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.a;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f75358a = b.class.getSimpleName();

    static {
        Covode.recordClassIndex(46504);
    }

    public static void a(e eVar, Collection<String> collection) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) collection)) {
            String c2 = RawURLGetter.c();
            for (String str : collection) {
                if (!TextUtils.isEmpty(str)) {
                    a(str, eVar, c2);
                }
            }
        }
    }

    public static String a(String str, long j2, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.contains("{TS}") || str.contains("__TS__")) {
                str = str.replace("{TS}", String.valueOf(j2)).replace("__TS__", String.valueOf(j2));
            }
            String deviceId = a.f31874c.getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                return str;
            }
            String a2 = a.f75356a.a(str, deviceId);
            if (a2.contains("{UA}") || a2.contains("__UA__")) {
                return a2.replace("{UA}", str2).replace("__UA__", str2);
            }
            return a2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    private static void a(String str, e eVar, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        String b2 = m.b(a(str, currentTimeMillis, str2));
        Uri parse = Uri.parse(b2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url", b2);
            jSONObject.put("scheme", parse.getScheme());
            jSONObject.put("host", parse.getHost());
            jSONObject.put("path", parse.getPath());
            jSONObject.put("ref", "native");
        } catch (JSONException unused) {
        }
        RawURLGetter.a(b2, new c(eVar, b2, currentTimeMillis, jSONObject));
    }
}
