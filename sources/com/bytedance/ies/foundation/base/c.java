package com.bytedance.ies.foundation.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.b;
import com.bytedance.ies.foundation.fragment.a;
import h.f.b.l;

public abstract class c implements b, com.bytedance.ies.foundation.fragment.c {

    /* renamed from: c  reason: collision with root package name */
    public b f33893c;

    static {
        Covode.recordClassIndex(20131);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final Context a(Context context) {
        return context;
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void a() {
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void a(int i2, int i3, Intent intent) {
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void a(int i2, Intent intent) {
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public boolean a(int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public void a(i iVar, a aVar, View view, Bundle bundle) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(view, "");
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(view, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void a(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void a(com.bytedance.ies.foundation.activity.a aVar, Configuration configuration) {
        l.d(aVar, "");
        l.d(configuration, "");
        b.a.a(aVar, configuration);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void a(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(bundle, "");
        b.a.a(aVar, bundle);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void a(com.bytedance.ies.foundation.activity.a aVar, boolean z) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    public final b b() {
        b bVar = this.f33893c;
        if (bVar == null) {
            l.a("configuration");
        }
        return bVar;
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final Resources a(Resources resources) {
        l.d(resources, "");
        l.d(resources, "");
        return resources;
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void c(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
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
    public void p(com.bytedance.ies.foundation.activity.a aVar) {
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
    public final void b(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void d(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void e(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void f(com.bytedance.ies.foundation.activity.a aVar) {
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
    public void c(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void a(Activity activity) {
        l.d(activity, "");
        l.d(activity, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void a(Bundle bundle) {
        l.d(bundle, "");
        l.d(bundle, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void b(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public final void d(i iVar, a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(iVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public final void e(i iVar, a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(iVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public final void f(i iVar, a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(iVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public final void g(i iVar, a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(iVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public final void h(i iVar, a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(iVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public final void i(i iVar, a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(iVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public void j(i iVar, a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(iVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public void c(i iVar, a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(iVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public final void b(i iVar, a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(iVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void d(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(bundle, "");
        b.a.c(aVar, bundle);
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public final void c(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(bundle, "");
        b.a.b(aVar, bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public final void a(i iVar, a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(iVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.activity.b
    public void b(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public final void b(i iVar, a aVar, Context context) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(context, "");
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(context, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public void a(i iVar, a aVar, Context context) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(context, "");
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(context, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.c
    public final void a(i iVar, a aVar, Bundle bundle) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(bundle, "");
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(bundle, "");
    }
}
