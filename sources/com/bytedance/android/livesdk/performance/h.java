package com.bytedance.android.livesdk.performance;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Double> f20266a = ag.a();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Long> f20267b = ag.a();

    static {
        Covode.recordClassIndex(11962);
    }

    public final void a(Map<String, Double> map) {
        l.d(map, "");
        this.f20266a = map;
    }

    public final void b(Map<String, Long> map) {
        l.d(map, "");
        this.f20267b = map;
    }
}
