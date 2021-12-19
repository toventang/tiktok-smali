package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.d;
import com.ss.android.ugc.aweme.mediachoose.helper.c;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aw;

final /* synthetic */ class ag implements aw.d {

    /* renamed from: a  reason: collision with root package name */
    private final ae f128915a;

    static {
        Covode.recordClassIndex(84592);
    }

    ag(ae aeVar) {
        this.f128915a = aeVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aw.d
    public final void a(int i2, d dVar) {
        ae aeVar = this.f128915a;
        if (i2 == 4) {
            if (!aeVar.f128908i) {
                return;
            }
            if (dVar != d.a.f109380a) {
                c cVar = aeVar.f128904e;
                int i3 = ae.f128901b;
                int i4 = aeVar.f128910k + 1;
                aeVar.f128910k = i4;
                cVar.a(i2, i3, i4, aeVar.n);
            } else if (f.a(aeVar) == OpeningChooseMediaPageState.NoSceneAnimation.INSTANCE) {
                c.a(i2, ae.f128901b, aeVar.f128910k, aeVar.n, d.b.f109381a);
            }
        } else if ((i2 != 3 && i2 != 1) || !aeVar.f128907h) {
        } else {
            if (dVar != d.a.f109380a) {
                c cVar2 = aeVar.f128904e;
                int i5 = ae.f128902c;
                int i6 = aeVar.f128909j + 1;
                aeVar.f128909j = i6;
                cVar2.a(i2, i5, i6, aeVar.n);
            } else if (f.a(aeVar) == OpeningChooseMediaPageState.NoSceneAnimation.INSTANCE) {
                c.a(i2, ae.f128902c, aeVar.f128909j, aeVar.n, d.b.f109381a);
            }
        }
    }
}
