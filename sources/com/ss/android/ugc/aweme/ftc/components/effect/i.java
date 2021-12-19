package com.ss.android.ugc.aweme.ftc.components.effect;

import android.text.TextUtils;
import b.g;
import com.bytedance.covode.number.Covode;
import dmt.av.video.p;
import dmt.av.video.w;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final f f97874a;

    static {
        Covode.recordClassIndex(62201);
    }

    i(f fVar) {
        this.f97874a = fVar;
    }

    @Override // b.g
    public final Object then(b.i iVar) {
        f fVar = this.f97874a;
        if (!iVar.a() || !((Boolean) iVar.d()).booleanValue()) {
            fVar.f97854g.setValue(false);
            return null;
        }
        fVar.f97854g.setValue(true);
        if (fVar.M == null || !TextUtils.equals("1", fVar.M.getKey()) || !fVar.K) {
            return null;
        }
        p value = fVar.f97851d.getValue();
        if (value != null && value.f156931g == 0) {
            p a2 = p.a((long) fVar.A.k());
            a2.f156932h = fVar.B.c();
            fVar.f97851d.setValue(a2);
        }
        fVar.j();
        w b2 = w.b();
        fVar.f97857j.setOverlayColor(fVar.E);
        fVar.f97853f.setValue(b2);
        fVar.i();
        return null;
    }
}
