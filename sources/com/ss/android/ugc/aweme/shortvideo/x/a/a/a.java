package com.ss.android.ugc.aweme.shortvideo.x.a.a;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.b;
import com.ss.android.ugc.asve.recorder.camera.d;
import h.f.b.l;

public final class a extends com.ss.android.ugc.asve.recorder.camera.c.a {
    static {
        Covode.recordClassIndex(86965);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.a
    public final int a() {
        if (this.f62261f) {
            return 2;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.a
    public final boolean b() {
        Context context = this.f62258c;
        l.b(context, "");
        d dVar = this.f62257b;
        l.b(dVar, "");
        l.d(context, "");
        l.d(dVar, "");
        int i2 = dVar.s().getInt("device_support_wide_angle_mode", -1);
        b.f61927a.c("CameraDeviceAbility isSupportWideAngle:".concat(String.valueOf(i2)));
        if (i2 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.x.a.a.a$a  reason: collision with other inner class name */
    public static final class C3441a implements com.ss.android.medialib.camera.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.medialib.camera.a f132980a = null;

        static {
            Covode.recordClassIndex(86966);
        }

        C3441a(com.ss.android.medialib.camera.a aVar) {
        }

        @Override // com.ss.android.medialib.camera.a
        public final void a(int i2) {
            com.ss.android.medialib.camera.a aVar = this.f132980a;
            if (aVar != null) {
                aVar.a(i2);
            }
        }

        @Override // com.ss.android.medialib.camera.a
        public final void a(int i2, int i3, String str) {
            l.d(str, "");
            com.ss.android.medialib.camera.a aVar = this.f132980a;
            if (aVar != null) {
                aVar.a(i2, i3, str);
            }
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.a
    public final void a(boolean z) {
        this.f62259d = true;
        this.f62260e = com.ss.android.ugc.asve.recorder.camera.b.a(com.ss.android.ugc.asve.recorder.camera.b.f62210a);
        this.f62261f = z;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.a
    public final boolean b(boolean z) {
        if (z || !b()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.c.a
    public final void a(Context context, PrivacyCert privacyCert) {
        int i2;
        l.d(context, "");
        d dVar = this.f62257b;
        if (this.f62261f) {
            i2 = 0;
        } else {
            i2 = 2;
        }
        dVar.b(i2, new C3441a(null), privacyCert);
        this.f62261f = !this.f62261f;
        this.f62257b.e().a(this.f62261f);
    }
}
