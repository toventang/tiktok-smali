package com.ss.android.ugc.aweme.effect;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.c.b.a;
import dmt.av.video.p;
import dmt.av.video.t;
import java.util.ArrayList;

public final /* synthetic */ class ap implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88815a;

    static {
        Covode.recordClassIndex(55869);
    }

    public ap(ac acVar) {
        this.f88815a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ac acVar = this.f88815a;
        p pVar = (p) obj;
        if (pVar != null) {
            long j2 = pVar.f156927c;
            if (pVar.f156931g == 0) {
                try {
                    acVar.f88787j.a(pVar.f156925a[0], pVar.f156929e, pVar.f156933i, pVar.f156932h);
                } catch (NullPointerException e2) {
                    throw new NullPointerException(e2.getMessage() + " " + pVar.toString());
                }
            } else if (pVar.f156931g == 5) {
                acVar.a(a.a(pVar.f156929e, pVar.f156930f), true, true);
            } else if (pVar.f156931g == 7) {
                acVar.x.a(false, true, (androidx.core.g.a<Void>) null);
            } else if (pVar.f156931g == 8) {
                acVar.c(false);
                acVar.b(true);
                acVar.a((int) pVar.f156929e, (int) pVar.f156930f);
                acVar.x.a(false, true, (androidx.core.g.a<Void>) new bd(acVar, pVar, j2));
            } else {
                ArrayList<EffectPointModel> effectPointModels = acVar.f88787j.getEffectPointModels();
                if (pVar.f156931g == 1) {
                    if (!effectPointModels.isEmpty()) {
                        acVar.f88787j.a(effectPointModels.get(effectPointModels.size() - 1).getIndex(), pVar.f156930f);
                    }
                } else if (pVar.f156931g == 2) {
                    acVar.a(pVar.f156925a[0]);
                } else if (pVar.f156931g == 3) {
                    if (acVar.f88782e != null) {
                        acVar.f88782e.setValue(t.b(0));
                    }
                    acVar.a((int) acVar.B.a(0), false);
                    acVar.f88787j.f88759b.clear();
                } else if (pVar.f156931g == 4 && acVar.R != null) {
                    for (int length = pVar.f156925a.length - 1; length >= 0; length--) {
                        acVar.a(pVar.f156925a[length]);
                    }
                }
            }
        }
    }
}
