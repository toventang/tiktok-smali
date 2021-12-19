package com.bytedance.jedi.ext.adapter;

import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.bytedance.covode.number.Covode;

public class JediViewHolder_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    final JediViewHolder f39568a;

    static {
        Covode.recordClassIndex(24365);
    }

    JediViewHolder_LifecycleAdapter(JediViewHolder jediViewHolder) {
        this.f39568a = jediViewHolder;
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
                if (!z2 || sVar.a("create$ext_adapter_release", 1)) {
                    this.f39568a.create$ext_adapter_release();
                }
            } else if (aVar == i.a.ON_START) {
                if (!z2 || sVar.a("start$ext_adapter_release", 1)) {
                    this.f39568a.start$ext_adapter_release();
                }
            } else if (aVar == i.a.ON_RESUME) {
                if (!z2 || sVar.a("resume$ext_adapter_release", 1)) {
                    this.f39568a.resume$ext_adapter_release();
                }
            } else if (aVar == i.a.ON_PAUSE) {
                if (!z2 || sVar.a("pause$ext_adapter_release", 1)) {
                    this.f39568a.pause$ext_adapter_release();
                }
            } else if (aVar == i.a.ON_STOP) {
                if (!z2 || sVar.a("stop$ext_adapter_release", 1)) {
                    this.f39568a.stop$ext_adapter_release();
                }
            } else if (aVar != i.a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.a("destroy$ext_adapter_release", 1)) {
                    this.f39568a.destroy$ext_adapter_release();
                }
            }
        }
    }
}
