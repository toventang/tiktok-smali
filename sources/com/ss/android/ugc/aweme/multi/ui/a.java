package com.ss.android.ugc.aweme.multi.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.b;
import com.ss.android.ugc.aweme.multi.c;
import com.ss.android.ugc.aweme.multi.d;
import com.ss.android.ugc.aweme.multi.maker.o;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final d f111030a;

    /* renamed from: b  reason: collision with root package name */
    public final Dialog f111031b;

    static {
        Covode.recordClassIndex(71261);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final Context a(Context context) {
        return context;
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a() {
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(int i2, int i3, Intent intent) {
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(int i2, Intent intent) {
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final boolean a(int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(com.bytedance.ies.foundation.activity.a aVar, boolean z) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final Resources a(Resources resources) {
        l.d(resources, "");
        l.d(resources, "");
        return resources;
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void b(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void c(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void d(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void g(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void h(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void i(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void j(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void k(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void l(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void m(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void n(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void o(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void p(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void q(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void r(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void b(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void c(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void e(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
        for (c cVar : this.f111030a.f110896a) {
            cVar.a(aVar, this.f111031b);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void f(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
        for (c cVar : this.f111030a.f110896a) {
            if (cVar instanceof o) {
                o oVar = (o) cVar;
                if (l.a((Object) oVar.r().getLocalClassName(), (Object) aVar.getLocalClassName())) {
                    oVar.f110995i = SystemClock.elapsedRealtime();
                }
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(Bundle bundle) {
        l.d(bundle, "");
        l.d(bundle, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    public a(d dVar, Dialog dialog) {
        l.d(dVar, "");
        l.d(dialog, "");
        this.f111030a = dVar;
        this.f111031b = dialog;
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void d(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(bundle, "");
        b.a.c(aVar, bundle);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void b(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void c(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(bundle, "");
        b.a.b(aVar, bundle);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(com.bytedance.ies.foundation.activity.a aVar, Configuration configuration) {
        l.d(aVar, "");
        l.d(configuration, "");
        b.a.a(aVar, configuration);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void a(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(bundle, "");
        b.a.a(aVar, bundle);
    }
}
