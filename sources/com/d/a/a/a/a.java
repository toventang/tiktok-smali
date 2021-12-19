package com.d.a.a.a;

import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.d.a.a.a.c.b;
import com.d.a.a.a.c.f;
import com.d.a.a.a.e.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static c f46317a = new c();

    static {
        Covode.recordClassIndex(28287);
    }

    public static void a(Context context) {
        c cVar = f46317a;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        d.a(applicationContext, "Application Context cannot be null");
        if (!cVar.f46366a) {
            cVar.f46366a = true;
            f a2 = f.a();
            a2.f46389b = new com.d.a.a.a.a.d(new Handler(), applicationContext, new com.d.a.a.a.a.a(), a2);
            b bVar = b.f46370a;
            Context applicationContext2 = applicationContext.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext2 == null) {
                applicationContext2 = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            bVar.f46371b = applicationContext2;
            com.d.a.a.a.e.b.f46398b = applicationContext.getResources().getDisplayMetrics().density;
            com.d.a.a.a.e.b.f46397a = (WindowManager) com.d.a.a.a.e.b.a(applicationContext, "window");
            com.d.a.a.a.c.d dVar = com.d.a.a.a.c.d.f46381a;
            Context applicationContext3 = applicationContext.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext3 == null) {
                applicationContext3 = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            dVar.f46382b = applicationContext3;
        }
    }
}
