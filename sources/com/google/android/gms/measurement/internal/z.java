package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

/* access modifiers changed from: package-private */
public final class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f52057a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f52058b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a f52059c;

    static {
        Covode.recordClassIndex(32386);
    }

    public final void run() {
        a aVar = this.f52059c;
        String str = this.f52057a;
        long j2 = this.f52058b;
        aVar.c();
        r.a(str);
        Integer num = aVar.f51320b.get(str);
        if (num != null) {
            hn a2 = aVar.h().a(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                aVar.f51320b.remove(str);
                Long l2 = aVar.f51319a.get(str);
                if (l2 == null) {
                    aVar.q().f51468c.a("First ad unit exposure time was never set");
                } else {
                    aVar.f51319a.remove(str);
                    aVar.a(str, j2 - l2.longValue(), a2);
                }
                if (!aVar.f51320b.isEmpty()) {
                    return;
                }
                if (aVar.f51321c == 0) {
                    aVar.q().f51468c.a("First ad exposure time was never set");
                    return;
                }
                aVar.a(j2 - aVar.f51321c, a2);
                aVar.f51321c = 0;
                return;
            }
            aVar.f51320b.put(str, Integer.valueOf(intValue));
            return;
        }
        aVar.q().f51468c.a("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    z(a aVar, String str, long j2) {
        this.f52059c = aVar;
        this.f52057a = str;
        this.f52058b = j2;
    }
}
