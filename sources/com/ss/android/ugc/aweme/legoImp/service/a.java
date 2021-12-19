package com.ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AOTOptimizeService f107714a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f107715b;

    static {
        Covode.recordClassIndex(68902);
    }

    a(AOTOptimizeService aOTOptimizeService, Context context) {
        this.f107714a = aOTOptimizeService;
        this.f107715b = context;
    }

    public final void run() {
        AOTOptimizeService.c(this.f107715b);
    }
}
