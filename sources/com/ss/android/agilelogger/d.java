package com.ss.android.agilelogger;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.alog.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

/* access modifiers changed from: package-private */
public final class d implements b {
    static {
        Covode.recordClassIndex(36555);
    }

    d() {
    }

    @Override // com.bytedance.android.alog.b
    public final void a() {
        try {
            Librarian.a("alog", ALog.sConfig.f59082a);
        } catch (Throwable unused) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.a("alog", false, (Context) null);
            m.a(uptimeMillis, "alog");
        }
    }
}
