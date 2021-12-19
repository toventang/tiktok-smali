package com.ss.android.newmedia.redbadge;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;
import com.ss.android.message.a.a;
import com.ss.android.message.b;
import com.ss.android.message.d;
import java.util.Map;

public final class g implements b {
    static {
        Covode.recordClassIndex(37110);
    }

    @Override // com.ss.android.message.c
    public final void a(Context context) {
    }

    @Override // com.ss.android.message.b
    public final void a(Context context, Map<String, String> map) {
    }

    @Override // com.ss.android.message.c
    public final void a(Intent intent) {
    }

    @Override // com.ss.android.message.c
    public final void b() {
    }

    @Override // com.ss.android.message.b
    public final void a(Context context, final com.ss.android.pushmanager.b bVar) {
        String b2;
        if (!a.a(context) && (b2 = f.b(context)) != null && b2.endsWith(a.f59820b)) {
            a.f59822d = false;
            try {
                d.a().a(new Runnable() {
                    /* class com.ss.android.newmedia.redbadge.g.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(37111);
                    }

                    public final void run() {
                        c.a(bVar);
                    }
                }, 0);
            } catch (Throwable unused) {
            }
        }
    }
}
