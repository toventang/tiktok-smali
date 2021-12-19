package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.core.g.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements u {

    /* renamed from: a  reason: collision with root package name */
    private final i f127782a;

    static {
        Covode.recordClassIndex(83760);
    }

    p(i iVar) {
        this.f127782a = iVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        i iVar = this.f127782a;
        if (iVar.M) {
            e<Long, Long> playBoundary = iVar.f127159h.getPlayBoundary();
            iVar.t.a().setValue(t.a((long) iVar.s.s(playBoundary.f2398b.intValue())));
            iVar.a(Math.max(playBoundary.f2397a.intValue() - 30, 0), Math.min(playBoundary.f2398b.intValue() + ((iVar.s.j() - playBoundary.f2398b.intValue()) + -30 < 150 ? 120 : 0) + 30, iVar.s.j()));
            iVar.e();
        }
    }
}
