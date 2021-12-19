package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.d;
import com.ss.android.ugc.aweme.mediachoose.helper.c;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import h.f.a.b;
import h.z;

final /* synthetic */ class ah implements b {

    /* renamed from: a  reason: collision with root package name */
    private final ae f128916a;

    static {
        Covode.recordClassIndex(84593);
    }

    ah(ae aeVar) {
        this.f128916a = aeVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        ae aeVar = this.f128916a;
        if (obj == OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE) {
            if (aeVar.f128910k == 0) {
                c.a(4, ae.f128901b, aeVar.f128910k, aeVar.n, d.b.f109381a);
            }
            if (aeVar.f128909j == 0) {
                c.a(aeVar.f128912m ? 1 : 3, ae.f128902c, aeVar.f128909j, aeVar.n, d.b.f109381a);
            }
        }
        return z.f158842a;
    }
}
