package com.bytedance.android.livesdk.service.assets;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.service.assets.j;
import com.bytedance.android.livesdk.service.network.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final j f21274a;

    /* renamed from: b  reason: collision with root package name */
    private final long f21275b;

    static {
        Covode.recordClassIndex(12551);
    }

    k(j jVar, long j2) {
        this.f21274a = jVar;
        this.f21275b = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        j jVar = this.f21274a;
        long j2 = this.f21275b;
        d dVar = (d) obj;
        jVar.f21271a.clear();
        jVar.f21271a.addAll(((a) dVar.data).f21437a);
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = dVar.extra.now;
        for (Prop prop : jVar.f21271a) {
            prop.setNowTimeDiff((j3 - currentTimeMillis) / 1000);
        }
        for (j.a aVar : jVar.f21272b) {
            aVar.b(jVar.f21271a);
        }
        c.a(com.bytedance.android.livesdk.ab.d.d.a("ttlive_prop_list_status"), 0, SystemClock.uptimeMillis() - j2);
    }
}
