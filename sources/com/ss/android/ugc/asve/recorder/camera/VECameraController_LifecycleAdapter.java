package com.ss.android.ugc.asve.recorder.camera;

import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.bytedance.covode.number.Covode;

public class VECameraController_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    final VECameraController f62194a;

    static {
        Covode.recordClassIndex(38230);
    }

    VECameraController_LifecycleAdapter(VECameraController vECameraController) {
        this.f62194a = vECameraController;
    }

    @Override // androidx.lifecycle.e
    public final void a(m mVar, i.a aVar, boolean z, s sVar) {
        boolean z2;
        if (sVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || aVar != i.a.ON_DESTROY) {
            return;
        }
        if (!z2 || sVar.a("onDestroy", 1)) {
            this.f62194a.onDestroy();
        }
    }
}
