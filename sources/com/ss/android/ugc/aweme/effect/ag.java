package com.ss.android.ugc.aweme.effect;

import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import dmt.av.video.p;
import dmt.av.video.w;

final /* synthetic */ class ag implements g {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88806a;

    static {
        Covode.recordClassIndex(55860);
    }

    ag(ac acVar) {
        this.f88806a = acVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        ac acVar = this.f88806a;
        if (!iVar.a() || !((Boolean) iVar.d()).booleanValue()) {
            acVar.f88784g.setValue(false);
            return null;
        }
        acVar.f88784g.setValue(true);
        if (acVar.M == null || !TextUtils.equals("1", acVar.M.getKey()) || !acVar.K) {
            return null;
        }
        p value = acVar.f88781d.getValue();
        if (value != null && value.f156931g == 0) {
            p a2 = p.a((long) acVar.A.k());
            a2.f156932h = acVar.B.c();
            acVar.f88781d.setValue(a2);
        }
        acVar.l();
        w b2 = w.b();
        acVar.f88787j.setOverlayColor(acVar.E);
        acVar.f88783f.setValue(b2);
        acVar.k();
        return null;
    }
}
