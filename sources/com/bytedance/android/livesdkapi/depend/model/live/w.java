package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class w implements b<CommerceStruct> {
    static {
        Covode.recordClassIndex(13734);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ CommerceStruct a(f fVar) {
        return b(fVar);
    }

    public static CommerceStruct b(f fVar) {
        CommerceStruct commerceStruct = new CommerceStruct();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return commerceStruct;
            } else if (b2 == 1) {
                commerceStruct.commercePermission = (int) fVar.f();
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                commerceStruct.oecInitDataString = fVar.d();
            }
        }
    }
}
