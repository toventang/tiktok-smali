package com.ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import dmt.av.video.t;
import h.f.a.b;
import h.z;

final /* synthetic */ class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f125248a;

    /* renamed from: b  reason: collision with root package name */
    private final b f125249b;

    static {
        Covode.recordClassIndex(82249);
    }

    e(b bVar, b bVar2) {
        this.f125248a = bVar;
        this.f125249b = bVar2;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        b bVar = this.f125248a;
        b bVar2 = this.f125249b;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            if (bVar.r != null) {
                bVar.r.dismiss();
            }
            bVar.f125240k.removeCallbacksAndMessages(null);
            bVar.f125241l.b().setValue(t.b());
            bVar.f125241l.a().a(false);
            bVar.f125241l.b().setValue(t.a());
            if (bVar.getFragmentManager() != null) {
                bVar.requireFragmentManager().a().a(bVar).c();
                if (bVar2 != null) {
                    bVar2.invoke(true);
                }
            } else if (bVar2 != null) {
                bVar2.invoke(false);
            }
        }
        return z.f158842a;
    }
}
