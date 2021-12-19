package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements u {

    /* renamed from: a  reason: collision with root package name */
    private final i f127781a;

    static {
        Covode.recordClassIndex(83759);
    }

    o(i iVar) {
        this.f127781a = iVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        i iVar = this.f127781a;
        if (iVar.M) {
            iVar.f127159h.isEnabled();
            iVar.g();
            iVar.a(0, iVar.s.G());
            iVar.t.a().setValue(t.a((long) iVar.s.s(iVar.f127159h.getPlayBoundary().f2398b.intValue())));
        }
    }
}
