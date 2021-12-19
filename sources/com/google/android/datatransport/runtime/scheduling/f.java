package com.google.android.datatransport.runtime.scheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import dagger.a.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import javax.a.a;

public final class f implements c<g> {

    /* renamed from: a  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.d.a> f49547a;

    static {
        Covode.recordClassIndex(31000);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        g.a a2 = new g.a().a(d.DEFAULT, g.b.d().a(30000).a().b()).a(d.HIGHEST, g.b.d().a(1000).a().b()).a(d.VERY_LOW, g.b.d().a(86400000).a().a(Collections.unmodifiableSet(new HashSet(Arrays.asList(g.c.NETWORK_UNMETERED, g.c.DEVICE_IDLE)))).b());
        a2.f49571a = this.f49547a.get();
        Objects.requireNonNull(a2.f49571a, "missing required property: clock");
        if (a2.f49572b.keySet().size() >= d.values().length) {
            Map<d, g.b> map = a2.f49572b;
            a2.f49572b = new HashMap();
            return dagger.a.f.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(a2.f49571a, map), "Cannot return null from a non-@Nullable @Provides method");
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }

    public f(a<com.google.android.datatransport.runtime.d.a> aVar) {
        this.f49547a = aVar;
    }
}
