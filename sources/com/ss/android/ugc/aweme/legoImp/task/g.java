package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.appsflyer.AppsFlyerConversionListener;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final InitAppsFlyer.AnonymousClass2 f107971a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f107972b;

    /* renamed from: c  reason: collision with root package name */
    private final AppsFlyerConversionListener f107973c;

    static {
        Covode.recordClassIndex(69213);
    }

    g(InitAppsFlyer.AnonymousClass2 r1, Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        this.f107971a = r1;
        this.f107972b = context;
        this.f107973c = appsFlyerConversionListener;
    }

    public final void run() {
        InitAppsFlyer.a(this.f107972b, this.f107973c);
    }
}
