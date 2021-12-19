package com.ss.android.ugc.aweme.shortvideo.w;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.by;
import com.ss.android.ugc.aweme.shortvideo.cr;
import h.f.b.l;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f132674a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(86810);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.w.b
    public final long a(CameraComponentModel cameraComponentModel) {
        long j2;
        long j3;
        l.d(cameraComponentModel, "");
        if (cameraComponentModel.t) {
            j2 = g.a().l().getMaxDurationResolver().getMaxShootingDuration();
        } else {
            j2 = 15000;
        }
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        String str = cameraComponentModel.y;
        if (cVar == null || str == null || str.length() == 0) {
            j3 = cameraComponentModel.f124712g;
        } else {
            j2 = Math.min(j2, by.a(cVar, str));
            j3 = cameraComponentModel.f124712g;
        }
        return j2 - j3;
    }
}
