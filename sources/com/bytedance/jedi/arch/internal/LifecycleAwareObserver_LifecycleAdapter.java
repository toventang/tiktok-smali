package com.bytedance.jedi.arch.internal;

import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.bytedance.covode.number.Covode;

public class LifecycleAwareObserver_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    final LifecycleAwareObserver f39464a;

    static {
        Covode.recordClassIndex(24284);
    }

    LifecycleAwareObserver_LifecycleAdapter(LifecycleAwareObserver lifecycleAwareObserver) {
        this.f39464a = lifecycleAwareObserver;
    }

    @Override // androidx.lifecycle.e
    public final void a(m mVar, i.a aVar, boolean z, s sVar) {
        boolean z2;
        if (sVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!z2 || sVar.a("onLifecycleEvent", 2)) {
                this.f39464a.onLifecycleEvent(mVar);
            }
        } else if (aVar != i.a.ON_DESTROY) {
        } else {
            if (!z2 || sVar.a("onDestroy", 1)) {
                this.f39464a.onDestroy();
            }
        }
    }
}
