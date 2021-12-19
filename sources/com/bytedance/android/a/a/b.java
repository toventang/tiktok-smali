package com.bytedance.android.a.a;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.a.a.d.a;
import com.bytedance.covode.number.Covode;

public final class b {
    static {
        Covode.recordClassIndex(3177);
    }

    b() {
    }

    public final void a(final View view, final a aVar) {
        if (!e.d().b()) {
            com.bytedance.android.a.a.h.a.a("ByteAdTracker is not available now");
            return;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        com.bytedance.android.a.a.c.a.a(new com.bytedance.android.a.a.c.b() {
            /* class com.bytedance.android.a.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3178);
            }

            @Override // com.bytedance.android.a.a.c.c
            public final void a() {
                c.a().a(SystemClock.uptimeMillis() - uptimeMillis);
                e.d().f6646d.a(view, aVar);
            }
        });
    }
}
