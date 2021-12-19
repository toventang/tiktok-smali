package com.bytedance.android.livesdk;

import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class ae implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ab f13689a;

    static {
        Covode.recordClassIndex(7594);
    }

    ae(ab abVar) {
        this.f13689a = abVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ab abVar = this.f13689a;
        com.bytedance.android.livesdk.n.f fVar = (com.bytedance.android.livesdk.n.f) obj;
        try {
            if (abVar.f13399i.c(abVar.f13399i.a() - 1).getId() == fVar.f19840a) {
                return;
            }
        } catch (Exception unused) {
            if (fVar == null) {
                return;
            }
        }
        if (abVar.f13399i != null) {
            abVar.f13399i.a(fVar.f19840a);
        }
    }
}
