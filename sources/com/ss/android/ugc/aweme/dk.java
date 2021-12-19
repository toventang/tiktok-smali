package com.ss.android.ugc.aweme;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.ss.android.ugc.aweme.money.growth.c;
import com.ss.android.ugc.aweme.money.growth.e;
import h.f.b.l;

final /* synthetic */ class dk implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f82875a;

    static {
        Covode.recordClassIndex(51639);
    }

    dk(Context context) {
        this.f82875a = context;
    }

    public final void run() {
        Context context = this.f82875a;
        l.d(context, "");
        if (c.f110831c) {
            c.f110831c = false;
            return;
        }
        UgChannelPopup f2 = e.f110853g.f();
        if (f2 == null) {
            return;
        }
        if (!l.a(Looper.getMainLooper(), Looper.myLooper())) {
            new Handler(Looper.getMainLooper()).post(new c.a.RunnableC2831a(context, f2));
        } else {
            c.a.a(context, f2);
        }
    }
}
