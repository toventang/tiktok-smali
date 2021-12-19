package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.covode.number.Covode;

public final class q implements b<RivalsListExtra.LogPbBean> {
    static {
        Covode.recordClassIndex(8628);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ RivalsListExtra.LogPbBean a(f fVar) {
        return b(fVar);
    }

    public static RivalsListExtra.LogPbBean b(f fVar) {
        RivalsListExtra.LogPbBean logPbBean = new RivalsListExtra.LogPbBean();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return logPbBean;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                logPbBean.imprId = fVar.d();
            }
        }
    }
}
