package com.ss.android.ugc.aweme.app.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.bytedance.crash.a.b;
import com.bytedance.crash.a.c;
import com.ss.android.agilelogger.ALog;

public final class a implements com.ss.android.ugc.aweme.app.application.a {
    static {
        Covode.recordClassIndex(41053);
    }

    public final void run() {
        if (ALog.isInitSuccess()) {
            Npth.enableALogCollector(ALog.sConfig.f59087f, new c() {
                /* class com.ss.android.ugc.aweme.app.d.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(41054);
                }

                @Override // com.bytedance.crash.a.c
                public final void a() {
                    ALog.flush();
                    ALog.forceLogSharding();
                }
            }, new b());
        }
    }
}
