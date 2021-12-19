package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.core.content.b;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.a;
import com.ss.android.ugc.aweme.effect.s;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.themechange.base.c;
import com.zhiliaoapp.musically.R;
import dmt.av.video.t;

final /* synthetic */ class ah implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97820a;

    static {
        Covode.recordClassIndex(62171);
    }

    ah(f fVar) {
        this.f97820a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        f fVar = this.f97820a;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            fVar.K = booleanValue;
            if (!booleanValue) {
                fVar.s.setVisibility(8);
                fVar.t.setVisibility(8);
            }
            s.a(fVar.f97859l, booleanValue, fVar.g(), fVar.I, new al(fVar, booleanValue));
            if (booleanValue) {
                if (fVar.aa != null) {
                    fVar.aa.b(fVar.ab);
                }
                if (fVar.f97857j != null) {
                    fVar.f97852e.setValue(t.b(0));
                    fVar.a(0, false);
                    fVar.k();
                }
                fVar.l();
                if (fVar.D == null) {
                    fVar.D = new x(fVar);
                    fVar.A.c(fVar.D);
                }
            } else if (fVar.aa != null) {
                fVar.aa.c(fVar.ab);
            }
            if (bool.booleanValue()) {
                fVar.X.k().setValue(dmt.av.video.u.a(c.a(true, false, false, false), fVar.f() + dh.c(fVar.L), fVar.g(), fVar.m(), a.f66177a.d()));
                fVar.x.o();
                return;
            }
            fVar.X.k().setValue(dmt.av.video.u.b(b.c(fVar.L, R.color.a2), fVar.f() + dh.c(fVar.L), fVar.g(), fVar.m(), a.f66177a.d()));
        }
    }
}
