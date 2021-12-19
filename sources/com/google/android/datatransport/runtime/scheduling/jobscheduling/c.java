package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.d;
import com.google.android.datatransport.runtime.d.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import java.util.Map;
import java.util.Objects;

public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    private final a f49558a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<d, g.b> f49559b;

    static {
        Covode.recordClassIndex(31006);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    public final a a() {
        return this.f49558a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.g
    public final Map<d, g.b> b() {
        return this.f49559b;
    }

    public final int hashCode() {
        return ((this.f49558a.hashCode() ^ 1000003) * 1000003) ^ this.f49559b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f49558a + ", values=" + this.f49559b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (!this.f49558a.equals(gVar.a()) || !this.f49559b.equals(gVar.b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public c(a aVar, Map<d, g.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f49558a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f49559b = map;
    }
}
