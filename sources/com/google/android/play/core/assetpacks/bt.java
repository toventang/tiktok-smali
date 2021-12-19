package com.google.android.play.core.assetpacks;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bt implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bu f52916a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f52917b;

    static {
        Covode.recordClassIndex(32712);
    }

    bt(bu buVar, Intent intent) {
        this.f52916a = buVar;
        this.f52917b = intent;
    }

    public final void run() {
        bu buVar = this.f52916a;
        buVar.f52920b.a(buVar.f52921c, this.f52917b);
    }
}
