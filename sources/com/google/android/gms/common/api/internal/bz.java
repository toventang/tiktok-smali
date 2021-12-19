package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.p;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class bz {

    /* renamed from: a  reason: collision with root package name */
    public static final Status f50131a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: b  reason: collision with root package name */
    static final BasePendingResult<?>[] f50132b = new BasePendingResult[0];

    /* renamed from: c  reason: collision with root package name */
    final Set<BasePendingResult<?>> f50133c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d  reason: collision with root package name */
    private final ca f50134d = new by(this);

    /* renamed from: e  reason: collision with root package name */
    private final Map<a.c<?>, a.f> f50135e;

    static {
        Covode.recordClassIndex(31269);
    }

    public final void a() {
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f50133c.toArray(f50132b);
        for (BasePendingResult basePendingResult : basePendingResultArr) {
            basePendingResult.a((ca) null);
            basePendingResult.c();
            if (basePendingResult.d()) {
                this.f50133c.remove(basePendingResult);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends p> basePendingResult) {
        this.f50133c.add(basePendingResult);
        basePendingResult.a(this.f50134d);
    }

    public bz(Map<a.c<?>, a.f> map) {
        this.f50135e = map;
    }
}
