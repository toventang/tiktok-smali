package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.j;
import com.bytedance.creativex.recorder.b.a.m;
import com.ss.android.ugc.aweme.shortvideo.w.b;
import com.ss.android.ugc.aweme.sticker.model.a;
import h.f.b.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final m f129524a;

    /* renamed from: b  reason: collision with root package name */
    private final CameraComponentModel f129525b;

    /* renamed from: c  reason: collision with root package name */
    private final b f129526c;

    static {
        Covode.recordClassIndex(85016);
    }

    public final void a() {
        a aVar;
        a aVar2 = this.f129525b.r;
        if (aVar2 != null) {
            long maxDuration = aVar2.getMaxDuration();
            if (maxDuration > 0 && (aVar = this.f129525b.r) != null && !aVar.isMultiBgVideo()) {
                long a2 = this.f129526c.a(this.f129525b);
                if (maxDuration > 0) {
                    a2 = Math.min(a2, maxDuration);
                }
                long j2 = this.f129525b.f124712g + a2;
                this.f129525b.f124707b = j2;
                this.f129524a.a(new j(j2));
            }
        }
    }

    public o(m mVar, CameraComponentModel cameraComponentModel, b bVar) {
        l.d(mVar, "");
        l.d(cameraComponentModel, "");
        l.d(bVar, "");
        this.f129524a = mVar;
        this.f129525b = cameraComponentModel;
        this.f129526c = bVar;
    }
}
