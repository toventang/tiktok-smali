package com.ss.ugc.live.sdk.msg.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<Long, d> f154167a = new LinkedHashMap<>();

    static {
        Covode.recordClassIndex(102813);
    }

    public final d a(long j2) {
        return this.f154167a.get(Long.valueOf(j2));
    }

    public final void a(d dVar) {
        l.c(dVar, "");
        this.f154167a.remove(Long.valueOf(dVar.f154159f));
    }
}
