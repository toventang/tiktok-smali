package com.bytedance.assem.arch.core;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public final class AssemContainerBridge$startActivityForResult$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f25524a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f25525b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f25526c;

    static {
        Covode.recordClassIndex(14869);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        this.f25525b.getLifecycle().b(this);
        this.f25524a.f25551a.b(this.f25526c);
    }

    AssemContainerBridge$startActivityForResult$1(b bVar, m mVar, int i2) {
        this.f25524a = bVar;
        this.f25525b = mVar;
        this.f25526c = i2;
    }
}
