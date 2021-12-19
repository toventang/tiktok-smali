package com.ss.android.ugc.aweme.shortvideo.ui.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.camera.b;
import h.f.a.q;
import h.z;

final /* synthetic */ class w implements q {

    /* renamed from: a  reason: collision with root package name */
    private final r f131368a;

    static {
        Covode.recordClassIndex(86069);
    }

    w(r rVar) {
        this.f131368a = rVar;
    }

    @Override // h.f.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r rVar = this.f131368a;
        Integer num = (Integer) obj;
        if (num.intValue() != 2 && num.intValue() != 1) {
            return null;
        }
        if (b.f62211b) {
            rVar.ae.a(z.f158842a);
        }
        if (!b.a(rVar.x.c().f62179j) || !rVar.ac) {
            return null;
        }
        rVar.ac = false;
        rVar.ad.a(z.f158842a);
        return null;
    }
}
