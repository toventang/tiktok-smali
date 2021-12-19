package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.c.b.a;
import dmt.av.video.p;
import dmt.av.video.t;
import java.util.ArrayList;

final /* synthetic */ class s implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97884a;

    static {
        Covode.recordClassIndex(62211);
    }

    s(f fVar) {
        this.f97884a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        f fVar = this.f97884a;
        p pVar = (p) obj;
        if (pVar != null) {
            long j2 = pVar.f156927c;
            if (pVar.f156931g == 0) {
                try {
                    fVar.f97857j.a(pVar.f156925a[0], pVar.f156929e, pVar.f156933i, pVar.f156932h);
                } catch (NullPointerException e2) {
                    throw new NullPointerException(e2.getMessage() + " " + pVar.toString());
                }
            } else if (pVar.f156931g == 5) {
                fVar.a(a.a(pVar.f156929e, pVar.f156930f), true, true);
            } else if (pVar.f156931g == 7) {
                fVar.x.a(false, true, (androidx.core.g.a<Void>) null);
            } else if (pVar.f156931g == 8) {
                fVar.c(false);
                fVar.b(true);
                fVar.a((int) pVar.f156929e, (int) pVar.f156930f);
                fVar.x.a(false, true, (androidx.core.g.a<Void>) new af(fVar, pVar, j2));
            } else {
                ArrayList<EffectPointModel> effectPointModels = fVar.f97857j.getEffectPointModels();
                if (pVar.f156931g == 1) {
                    if (!effectPointModels.isEmpty()) {
                        fVar.f97857j.a(effectPointModels.get(effectPointModels.size() - 1).getIndex(), pVar.f156930f);
                    }
                } else if (pVar.f156931g == 2) {
                    fVar.a(pVar.f156925a[0]);
                } else if (pVar.f156931g == 3) {
                    if (fVar.f97852e != null) {
                        fVar.f97852e.setValue(t.b(0));
                    }
                    fVar.a((int) fVar.B.a(0), false);
                    fVar.f97857j.f88759b.clear();
                } else if (pVar.f156931g == 4 && fVar.R != null) {
                    for (int length = pVar.f156925a.length - 1; length >= 0; length--) {
                        fVar.a(pVar.f156925a[length]);
                    }
                }
            }
        }
    }
}
