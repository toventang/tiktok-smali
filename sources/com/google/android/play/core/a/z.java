package com.google.android.play.core.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.an;
import com.google.android.play.core.d.q;

public final /* synthetic */ class z {

    /* renamed from: a  reason: collision with root package name */
    private static ab f52753a;

    static {
        Covode.recordClassIndex(32660);
    }

    static synchronized ab a(Context context) {
        ab abVar;
        synchronized (z.class) {
            MethodCollector.i(7470);
            if (f52753a == null) {
                aa aaVar = new aa((byte) 0);
                aaVar.f52695a = new j(q.a(context));
                an.a(aaVar.f52695a, j.class);
                f52753a = new ab(aaVar.f52695a);
            }
            abVar = f52753a;
            MethodCollector.o(7470);
        }
        return abVar;
    }
}
