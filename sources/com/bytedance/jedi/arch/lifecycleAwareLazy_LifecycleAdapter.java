package com.bytedance.jedi.arch;

import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.bytedance.covode.number.Covode;

public class lifecycleAwareLazy_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    final lifecycleAwareLazy f39546a;

    static {
        Covode.recordClassIndex(24328);
    }

    lifecycleAwareLazy_LifecycleAdapter(lifecycleAwareLazy lifecycleawarelazy) {
        this.f39546a = lifecycleawarelazy;
    }

    @Override // androidx.lifecycle.e
    public final void a(m mVar, i.a aVar, boolean z, s sVar) {
        boolean z2;
        if (sVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || aVar != i.a.ON_CREATE) {
            return;
        }
        if (!z2 || sVar.a("onStart", 1)) {
            this.f39546a.onStart();
        }
    }
}
