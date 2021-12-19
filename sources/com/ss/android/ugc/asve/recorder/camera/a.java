package com.ss.android.ugc.asve.recorder.camera;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.b;
import h.f.b.l;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62195a = new a();

    @Override // com.ss.android.ugc.asve.recorder.camera.e
    public final boolean a() {
        return false;
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(38231);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.e
    public final boolean a(Context context, d dVar, int i2) {
        l.d(context, "");
        l.d(dVar, "");
        int i3 = dVar.s().getInt("device_support_antishake_mode", -1);
        b.f61927a.c("CameraDeviceAbility isSupportAntiShake:".concat(String.valueOf(i3)));
        if (i3 == 1) {
            return true;
        }
        return false;
    }
}
