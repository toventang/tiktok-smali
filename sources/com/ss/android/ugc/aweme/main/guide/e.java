package com.ss.android.ugc.aweme.main.guide;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.c;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f109273a;

    static {
        Covode.recordClassIndex(69977);
    }

    public e(c cVar) {
        this.f109273a = cVar;
    }

    public final void run() {
        c cVar = this.f109273a;
        if (cVar.f109271e != null) {
            cVar.f109271e.d();
        }
        View view = cVar.f109270d;
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
        c.a(new b(false));
    }
}
