package com.ss.android.common.applog.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.m;
import com.ss.android.common.applog.r;
import com.ss.android.common.applog.t;
import com.ss.android.deviceregister.a.a;
import com.ss.android.ugc.aweme.bf.d;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    Context f59203a;

    static {
        Covode.recordClassIndex(36604);
    }

    public final void b(d dVar) {
        if (dVar != null) {
            a(dVar.a());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (str == null) {
            str = "";
        }
        try {
            SharedPreferences.Editor edit = d.a(this.f59203a, a.f59402a, 0).edit();
            edit.putString("key_task_session", str);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f59203a = applicationContext;
        r.a(context);
        t.a().a(new Runnable() {
            /* class com.ss.android.common.applog.b.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36605);
            }

            public final void run() {
                d a2 = d.a(d.a(b.this.f59203a, a.f59402a, 0).getString("key_task_session", ""));
                if (a2 != null) {
                    b.this.a(a2);
                }
                b.this.a("");
            }
        });
    }

    public final void a(d dVar) {
        r a2 = r.a(this.f59203a);
        if (dVar != null) {
            d dVar2 = new d();
            dVar2.f59231a = dVar.f59231a;
            dVar2.f59232b = dVar.f59232b;
            dVar2.f59233c = dVar.f59233c;
            dVar2.f59234d = dVar.f59234d;
            dVar2.f59235e = dVar.f59235e;
            dVar2.f59236f = dVar.f59236f;
            dVar2.f59237g = dVar.f59237g;
            dVar2.f59238h = dVar.f59238h;
            dVar2.f59239i = dVar.f59239i;
            m mVar = new m();
            mVar.f59294a = dVar2;
            AppLog instance = AppLog.getInstance(a2.f59334a);
            if (instance != null) {
                instance.enqueue(mVar);
            }
        }
    }
}
