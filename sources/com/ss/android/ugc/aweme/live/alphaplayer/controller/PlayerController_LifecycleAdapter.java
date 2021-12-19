package com.ss.android.ugc.aweme.live.alphaplayer.controller;

import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.bytedance.covode.number.Covode;

public class PlayerController_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    final PlayerController f108235a;

    static {
        Covode.recordClassIndex(69357);
    }

    PlayerController_LifecycleAdapter(PlayerController playerController) {
        this.f108235a = playerController;
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
                    this.f108235a.onPause();
                }
            } else if (aVar == i.a.ON_RESUME) {
                if (!z2 || sVar.a("onResume", 1)) {
                    this.f108235a.onResume();
                }
            } else if (aVar == i.a.ON_STOP) {
                if (!z2 || sVar.a("onStop", 1)) {
                    this.f108235a.onStop();
                }
            } else if (aVar != i.a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.a("onDestroy", 1)) {
                    this.f108235a.onDestroy();
                }
            }
        }
    }
}
