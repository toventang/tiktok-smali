package com.ss.android.ugc.aweme.crossplatform.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ax.a.s;
import com.ss.android.ugc.aweme.crossplatform.c.d;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f78726a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f78727b = n.c("error_code", "loading_status_code", "loadso");

    private h() {
    }

    static {
        Covode.recordClassIndex(48872);
    }

    private static String a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        l.b(keys, "");
        long j2 = 0;
        String str = "none";
        while (keys.hasNext()) {
            String next = keys.next();
            Long valueOf = Long.valueOf(jSONObject.optLong(next));
            if (valueOf.longValue() > j2 && valueOf != null) {
                j2 = valueOf.longValue();
                l.b(next, "");
                str = next;
            }
        }
        return str;
    }

    public static void a(JSONObject jSONObject, s sVar) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            l.b(next, "");
            if (p.b(next, "tick_", false)) {
                jSONObject4.put(next, jSONObject.opt(next));
            } else if (p.b(next, "dur_", false)) {
                jSONObject3.put(next, jSONObject.opt(next));
            } else if (f78727b.contains(next)) {
                jSONObject2.put(next, jSONObject.opt(next).toString());
            }
        }
        d.a.a();
        d.a(sVar, "hybrid_monitor_ttwebview_full_log", a(jSONObject4), jSONObject2, jSONObject3, jSONObject4);
    }
}
