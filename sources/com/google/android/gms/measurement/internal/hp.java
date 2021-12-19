package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
public final class hp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f51778a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hn f51779b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ hn f51780c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f51781d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ hq f51782e;

    static {
        Covode.recordClassIndex(32291);
    }

    public final void run() {
        hq hqVar = this.f51782e;
        Bundle bundle = this.f51778a;
        hn hnVar = this.f51779b;
        hn hnVar2 = this.f51780c;
        long j2 = this.f51781d;
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        hqVar.a(hnVar, hnVar2, j2, true, hqVar.o().a((String) null, "screen_view", bundle, (List<String>) null, true, true));
    }

    hp(hq hqVar, Bundle bundle, hn hnVar, hn hnVar2, long j2) {
        this.f51782e = hqVar;
        this.f51778a = bundle;
        this.f51779b = hnVar;
        this.f51780c = hnVar2;
        this.f51781d = j2;
    }
}
