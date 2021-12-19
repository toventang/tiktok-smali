package com.ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.d.k;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class k implements com.bytedance.android.livesdkapi.depend.d.k {

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f91809b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(57791);
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.k
    public final /* bridge */ /* synthetic */ Map a() {
        return this.f91809b;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.k
    public final Map<String, String> b() {
        return a();
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.k
    public final void e() {
        a("sdk_player_first_frame", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.k
    public final void c() {
        if (a() instanceof HashMap) {
            Map<String, String> a2 = a();
            Objects.requireNonNull(a2, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
            ((HashMap) a2).clear();
        } else if (a() instanceof ConcurrentHashMap) {
            Map<String, String> a3 = a();
            Objects.requireNonNull(a3, "null cannot be cast to non-null type java.util.concurrent.ConcurrentHashMap<kotlin.String, kotlin.String>");
            ((ConcurrentHashMap) a3).clear();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.k
    public final long d() {
        long j2;
        long j3;
        String str = this.f91809b.get("start");
        if (str != null) {
            j2 = Long.parseLong(str);
        } else {
            j2 = Long.MAX_VALUE;
        }
        String str2 = this.f91809b.get("sdk_player_first_frame");
        if (str2 != null) {
            j3 = Long.parseLong(str2);
        } else {
            j3 = Long.MIN_VALUE;
        }
        long j4 = j3 - j2;
        if (j4 >= 0) {
            return j4;
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.k
    public final long f() {
        Long l2;
        String str = this.f91809b.get("start");
        Long l3 = null;
        if (str != null) {
            l2 = p.g(str);
        } else {
            l2 = null;
        }
        String str2 = this.f91809b.get("player_first_video_package_end");
        if (str2 != null) {
            l3 = p.g(str2);
        }
        if (l2 == null || l3 == null) {
            return 0;
        }
        return l3.longValue() - l2.longValue();
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.k
    public final void a(JSONObject jSONObject) {
        l.d(jSONObject, "");
        String optString = jSONObject.optString("event_key");
        l.b(optString, "");
        if (TextUtils.equals(optString, "first_frame")) {
            int length = k.a.f22961a.length;
            for (int i2 = 0; i2 < length; i2++) {
                String str = k.a.f22961a[i2];
                long optLong = jSONObject.optLong(k.a.f22962b[i2], 0);
                if (optLong != 0) {
                    this.f91809b.put(str, String.valueOf(optLong));
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.k
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f91809b.put(str, str2);
        }
    }
}
