package com.ss.android.ugc.aweme.publish.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.e.a;
import com.ss.android.ugc.aweme.publish.j;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.m.p;

final class g implements j {
    static {
        Covode.recordClassIndex(77175);
    }

    @Override // com.ss.android.ugc.aweme.publish.j
    public final void a(String str, Throwable th) {
        l.d(str, "");
        l.d(th, "");
        a.a(str, th);
    }

    @Override // com.ss.android.ugc.aweme.publish.j
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str, "");
        l.d(str2, "");
        if (com.ss.android.ugc.aweme.settings.l.a()) {
            StringBuilder append = new StringBuilder("[stage-").append(str).append("][thread-");
            Thread currentThread = Thread.currentThread();
            l.b(currentThread, "");
            q.a("Tiktok-Publish", p.c(append.append(currentThread.getName()).append("] ").append(str2).toString(), a.f118715a));
        }
    }
}
