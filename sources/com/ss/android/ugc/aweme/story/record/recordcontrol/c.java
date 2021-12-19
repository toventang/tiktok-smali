package com.ss.android.ugc.aweme.story.record.recordcontrol;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.w.b;
import h.f.b.l;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f138420a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(90521);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.w.b
    public final long a(CameraComponentModel cameraComponentModel) {
        l.d(cameraComponentModel, "");
        return 15000 - cameraComponentModel.f124712g;
    }
}
