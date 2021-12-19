package com.ss.android.ugc.aweme.performance;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.g;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public long f114813a;

    /* renamed from: b  reason: collision with root package name */
    public long f114814b;

    /* renamed from: c  reason: collision with root package name */
    public long f114815c;

    /* renamed from: d  reason: collision with root package name */
    public g f114816d;

    /* renamed from: e  reason: collision with root package name */
    public int f114817e;

    /* renamed from: f  reason: collision with root package name */
    public final String f114818f;

    static {
        Covode.recordClassIndex(73861);
    }

    public k(String str) {
        l.d(str, "");
        this.f114818f = str;
    }

    public static void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                keys.remove();
            }
        }
    }
}
