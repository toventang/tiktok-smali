package com.bytedance.geckox.policy.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.statistic.model.a;
import com.bytedance.q.a.e;
import java.util.concurrent.ConcurrentHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, Long> f29981a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f29982b;

    /* renamed from: c  reason: collision with root package name */
    private String f29983c;

    /* renamed from: d  reason: collision with root package name */
    private a f29984d;

    static {
        Covode.recordClassIndex(17399);
    }

    public final void b() {
        f29981a.put(this.f29983c, Long.valueOf(System.currentTimeMillis()));
    }

    public final void a() {
        if (this.f29982b && f29981a.containsKey(this.f29983c)) {
            if (System.currentTimeMillis() - f29981a.get(this.f29983c).longValue() > 600000) {
                f29981a.remove(this.f29983c);
                return;
            }
            com.bytedance.geckox.i.a.a(this.f29983c + ":gecko update request control-throttle hit", null);
            this.f29984d.f30080h = 1;
            this.f29984d.f30081i = 600;
            throw new e(600, "repeat gecko update request", new Throwable("Only one request with the same parameters is allowed in 600s"));
        }
    }

    public d(boolean z, String str, a aVar) {
        this.f29982b = z;
        this.f29983c = str;
        this.f29984d = aVar;
    }
}
