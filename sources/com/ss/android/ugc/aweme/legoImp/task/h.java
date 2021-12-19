package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.appsflyer.AppsFlyerConversionListener;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final InitAppsFlyer.AnonymousClass2 f107974a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f107975b;

    /* renamed from: c  reason: collision with root package name */
    private final AppsFlyerConversionListener f107976c;

    static {
        Covode.recordClassIndex(69214);
    }

    h(InitAppsFlyer.AnonymousClass2 r1, Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        this.f107974a = r1;
        this.f107975b = context;
        this.f107976c = appsFlyerConversionListener;
    }

    public final void run() {
        InitAppsFlyer.a(this.f107975b, this.f107976c);
    }
}
