package com.bytedance.assem.arch.core;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public final class AssemContainerBridge$requestPermissions$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f25521a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f25522b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f25523c;

    static {
        Covode.recordClassIndex(14868);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        this.f25522b.getLifecycle().b(this);
        this.f25521a.f25552b.b(this.f25523c);
    }
}
