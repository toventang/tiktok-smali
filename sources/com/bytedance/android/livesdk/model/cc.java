package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.model.message.c.r;
import com.bytedance.covode.number.Covode;

public final class cc implements b<MaskLayer> {
    static {
        Covode.recordClassIndex(11361);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ MaskLayer a(f fVar) {
        return b(fVar);
    }

    public static MaskLayer b(f fVar) {
        MaskLayer maskLayer = new MaskLayer();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return maskLayer;
            } else if (b2 == 1) {
                maskLayer.title = r.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                maskLayer.subTitle = r.b(fVar);
            }
        }
    }
}
