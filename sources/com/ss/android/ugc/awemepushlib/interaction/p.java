package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.awemepushlib.a.a;

final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f145463a;

    static {
        Covode.recordClassIndex(95118);
    }

    p(Context context) {
        this.f145463a = context;
    }

    public final void run() {
        Context context = this.f145463a;
        if (((Boolean) a.f145359e.getValue()).booleanValue()) {
            j.b(context);
        } else {
            new Handler(Looper.getMainLooper()).post(new q(context));
        }
        StringBuilder sb = new StringBuilder("method_push_start_bdpush_start");
        int i2 = j.f145447a;
        j.f145447a = i2 + 1;
        c.a(sb.append(i2).toString());
        com.ss.android.ugc.awemepushlib.manager.a.a().f(context);
        System.out.println();
        c.b("method_push_start_bdpush_start");
    }
}
