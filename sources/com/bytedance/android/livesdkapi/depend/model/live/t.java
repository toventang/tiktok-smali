package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class t implements b<BALinkStruct> {
    static {
        Covode.recordClassIndex(13731);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ BALinkStruct a(f fVar) {
        return b(fVar);
    }

    public static BALinkStruct b(f fVar) {
        BALinkStruct bALinkStruct = new BALinkStruct();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bALinkStruct;
            } else if (b2 == 1) {
                bALinkStruct.baLinkPermission = fVar.e();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                bALinkStruct.baLinkData = fVar.d();
            }
        }
    }
}
