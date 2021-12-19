package com.bytedance.android.livesdk.share;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.z;

final /* synthetic */ class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private final g f21486a;

    static {
        Covode.recordClassIndex(12643);
    }

    h(g gVar) {
        this.f21486a = gVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        g gVar = this.f21486a;
        Integer num = (Integer) obj;
        if (gVar.n && gVar.o != null) {
            if (num == null || num.intValue() <= 0) {
                gVar.o.setText(y.a((int) R.string.edo));
            } else {
                gVar.o.setText(aa.a((long) num.intValue()));
            }
        }
        return z.f158842a;
    }
}
