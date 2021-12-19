package com.ss.android.ugc.aweme.effect;

import androidx.core.content.b;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.adaptation.a;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.i;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.ss.android.ugc.aweme.themechange.base.c;
import com.zhiliaoapp.musically.R;
import dmt.av.video.t;

public final /* synthetic */ class bf implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88868a;

    static {
        Covode.recordClassIndex(55901);
    }

    public bf(ac acVar) {
        this.f88868a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ac acVar = this.f88868a;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            acVar.K = booleanValue;
            if (!booleanValue) {
                acVar.s.setVisibility(8);
                acVar.t.setVisibility(8);
            }
            s.a(acVar.f88789l, booleanValue, acVar.i(), acVar.I, new af(acVar, booleanValue));
            if (booleanValue) {
                if (acVar.ae != null) {
                    acVar.ae.b(acVar.af);
                }
                if (acVar.f88787j != null) {
                    acVar.f88782e.setValue(t.b(0));
                    acVar.a(0, false);
                    acVar.m();
                }
                acVar.n();
                if (acVar.D == null) {
                    acVar.D = new av(acVar);
                    acVar.A.c(acVar.D);
                }
            } else if (acVar.ae != null) {
                acVar.ae.c(acVar.af);
            }
            if (bool.booleanValue()) {
                acVar.X.k().setValue(dmt.av.video.u.a(c.a(true, false, false, false), acVar.h() + dh.c(acVar.L), acVar.i(), acVar.o(), a.f66177a.d()));
                acVar.x.o();
            } else {
                acVar.X.k().setValue(dmt.av.video.u.b(b.c(acVar.L, R.color.a2), acVar.h() + dh.c(acVar.L), acVar.i(), acVar.o(), a.f66177a.d()));
            }
            if (bool.booleanValue() && es.n(acVar.f88779b) && acVar.ad) {
                if (acVar.y != null) {
                    acVar.x.a(acVar.x.getSlideX(), i.a(acVar.f88779b.getMediaModelList(), true, null, 4));
                    if (com.ss.android.ugc.aweme.effect.c.b.a.a(acVar.u, acVar.J, acVar.a())) {
                        acVar.b();
                    }
                }
                acVar.ad = false;
                if (acVar.C != null && acVar.w != null && acVar.w.getAdapter() != null) {
                    acVar.e();
                    acVar.C.b();
                    if (acVar.w.getAdapter() instanceof ChooseVideoCoverView.a) {
                        ((ChooseVideoCoverView.a) acVar.w.getAdapter()).a();
                    }
                }
            }
        }
    }
}
