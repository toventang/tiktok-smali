package com.bytedance.nita.api;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.c.a;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;

public abstract class NitaActivityDynamicView extends d implements au {

    /* renamed from: a  reason: collision with root package name */
    private Activity f41608a;

    /* renamed from: b  reason: collision with root package name */
    private int f41609b = 1;

    /* renamed from: c  reason: collision with root package name */
    private m f41610c;

    static {
        Covode.recordClassIndex(25456);
    }

    @Override // com.bytedance.nita.api.d, com.bytedance.nita.api.c
    public final void a(View view, Activity activity) {
        l.c(view, "");
        l.c(activity, "");
    }

    @Override // com.bytedance.nita.api.c
    public final int e() {
        return 0;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.nita.api.c
    public e c() {
        return e.AT_ONCE;
    }

    @v(a = i.a.ON_DESTROY)
    private final void onDestroy() {
        String a2 = a();
        Activity activity = this.f41608a;
        if (activity == null) {
            l.a();
        }
        l.c(a2, "");
        a.a(a2, activity);
        this.f41608a = null;
        this.f41610c = null;
    }
}
