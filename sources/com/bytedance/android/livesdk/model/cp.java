package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;

public final class cp implements b<WarningTag> {
    static {
        Covode.recordClassIndex(11374);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ WarningTag a(f fVar) {
        return b(fVar);
    }

    public static WarningTag b(f fVar) {
        WarningTag warningTag = new WarningTag();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return warningTag;
            } else if (b2 == 1) {
                warningTag.text = r.b(fVar);
            } else if (b2 == 2) {
                warningTag.duration = Long.valueOf(fVar.f());
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                warningTag.tagSource = fVar.e();
            }
        }
    }
}
