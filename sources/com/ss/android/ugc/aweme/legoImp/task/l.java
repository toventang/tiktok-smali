package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask;

final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final JsBridge2InitTask.AnonymousClass1 f107981a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f107982b;

    /* renamed from: c  reason: collision with root package name */
    private final long f107983c;

    static {
        Covode.recordClassIndex(69218);
    }

    l(JsBridge2InitTask.AnonymousClass1 r1, Context context, long j2) {
        this.f107981a = r1;
        this.f107982b = context;
        this.f107983c = j2;
    }

    public final void run() {
        JsBridge2InitTask.AnonymousClass1 r6 = this.f107981a;
        Context context = this.f107982b;
        long j2 = this.f107983c;
        if (SettingsManager.a().a("use_bridge_engine_v2", true)) {
            JsBridge2InitTask.this.a(context, j2);
        }
    }
}
