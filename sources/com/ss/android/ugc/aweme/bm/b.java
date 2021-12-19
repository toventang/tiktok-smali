package com.ss.android.ugc.aweme.bm;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.video.b.q;
import h.f.b.l;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f68729a = "VideoPlayer_Log";

    /* renamed from: b  reason: collision with root package name */
    public static final b f68730b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final String f68731c = "event";

    /* renamed from: d  reason: collision with root package name */
    private static final String f68732d = "data";

    private b() {
    }

    static {
        Covode.recordClassIndex(42320);
    }

    public static final void a(String str) {
        l.d(str, "");
        if (q.a()) {
            a.a(3, f68729a, str);
        }
    }

    public static String a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f68731c, str);
        jSONObject2.put(f68732d, jSONObject);
        String jSONObject3 = jSONObject2.toString();
        l.b(jSONObject3, "");
        return jSONObject3;
    }

    public static final void b(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        if (q.a()) {
            String a2 = a(str, jSONObject);
            if (!TextUtils.isEmpty(a2)) {
                a(a2);
            }
        }
    }

    public static final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (q.a()) {
            a.a(6, str, str2);
        }
    }
}
