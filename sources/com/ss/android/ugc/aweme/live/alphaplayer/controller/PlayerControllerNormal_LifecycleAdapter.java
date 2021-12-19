package com.ss.android.ugc.aweme.live.alphaplayer.controller;

import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.bytedance.covode.number.Covode;

public class PlayerControllerNormal_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    final PlayerControllerNormal f108234a;

    static {
        Covode.recordClassIndex(69356);
    }

    PlayerControllerNormal_LifecycleAdapter(PlayerControllerNormal playerControllerNormal) {
        this.f108234a = playerControllerNormal;
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
            if (aVar == i.a.ON_PAUSE) {
                if (!z2 || sVar.a("onPause", 1)) {
                    this.f108234a.onPause();
                }
            } else if (aVar == i.a.ON_RESUME) {
                if (!z2 || sVar.a("onResume", 1)) {
                    this.f108234a.onResume();
                }
            } else if (aVar == i.a.ON_STOP) {
                if (!z2 || sVar.a("onStop", 1)) {
                    this.f108234a.onStop();
                }
            } else if (aVar != i.a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.a("onDestroy", 1)) {
                    this.f108234a.onDestroy();
                }
            }
        }
    }
}
