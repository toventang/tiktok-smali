package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b;

import com.bytedance.covode.number.Covode;
import com.facebook.drawee.f.a;
import com.facebook.drawee.f.e;
import com.facebook.drawee.view.d;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(65542);
    }

    public static final void a(d dVar, float[] fArr) {
        l.d(dVar, "");
        l.d(fArr, "");
        if (!dVar.hasHierarchy()) {
            dVar.setHierarchy(new com.facebook.drawee.f.b(dVar.getResources()).a());
        }
        a aVar = (a) dVar.getHierarchy();
        l.b(aVar, "");
        aVar.a(e.b(fArr[0], fArr[1], fArr[2], fArr[3]));
    }
}
