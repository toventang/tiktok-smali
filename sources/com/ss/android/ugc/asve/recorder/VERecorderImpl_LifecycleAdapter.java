package com.ss.android.ugc.asve.recorder;

import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.bytedance.covode.number.Covode;

public class VERecorderImpl_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    final VERecorderImpl f62124a;

    static {
        Covode.recordClassIndex(38184);
    }

    VERecorderImpl_LifecycleAdapter(VERecorderImpl vERecorderImpl) {
        this.f62124a = vERecorderImpl;
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
            if (aVar == i.a.ON_RESUME) {
                if (!z2 || sVar.a("onResume", 1)) {
                    this.f62124a.onResume();
                }
            } else if (aVar == i.a.ON_PAUSE) {
                if (!z2 || sVar.a("onPause", 1)) {
                    this.f62124a.onPause();
                }
            } else if (aVar != i.a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.a("release", 1)) {
                    this.f62124a.release();
                }
            }
        }
    }
}
