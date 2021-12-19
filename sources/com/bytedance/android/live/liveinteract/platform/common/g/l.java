package com.bytedance.android.live.liveinteract.platform.common.g;

import com.bytedance.android.live.liveinteract.platform.common.api.LogReportApi;
import com.bytedance.android.live.network.e;
import com.bytedance.covode.number.Covode;
import f.a.d.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f11993a = new l();

    static {
        Covode.recordClassIndex(6539);
    }

    private l() {
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        return ((LogReportApi) e.a().a(LogReportApi.class)).logReport("a", obj);
    }
}
