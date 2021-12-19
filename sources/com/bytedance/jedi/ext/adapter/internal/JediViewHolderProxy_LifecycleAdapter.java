package com.bytedance.jedi.ext.adapter.internal;

import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.bytedance.covode.number.Covode;

public class JediViewHolderProxy_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    final JediViewHolderProxy f39723a;

    static {
        Covode.recordClassIndex(24473);
    }

    JediViewHolderProxy_LifecycleAdapter(JediViewHolderProxy jediViewHolderProxy) {
        this.f39723a = jediViewHolderProxy;
    }

    @Override // androidx.lifecycle.e
    public final void a(m mVar, i.a aVar, boolean z, s sVar) {
        boolean z2;
        if (sVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (aVar == i.a.ON_CREATE) {
                if (!z2 || sVar.a("onCreate", 1)) {
                    this.f39723a.onCreate();
                }
            } else if (aVar == i.a.ON_START) {
                if (!z2 || sVar.a("onStart", 1)) {
                    this.f39723a.onStart();
                }
            } else if (aVar == i.a.ON_STOP) {
                if (!z2 || sVar.a("onStop", 1)) {
                    this.f39723a.onStop();
                }
            } else if (aVar != i.a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.a("onDestroy", 1)) {
                    this.f39723a.onDestroy();
                }
            }
        }
    }
}
