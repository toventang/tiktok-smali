package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import androidx.core.g.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements u {

    /* renamed from: a  reason: collision with root package name */
    private final i f98089a;

    static {
        Covode.recordClassIndex(62349);
    }

    p(i iVar) {
        this.f98089a = iVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        i iVar = this.f98089a;
        if (iVar.L) {
            e<Long, Long> playBoundary = iVar.f98073h.getPlayBoundary();
            iVar.s.a().setValue(t.a((long) iVar.r.s(((Long) Objects.requireNonNull(playBoundary.f2398b)).intValue())));
            iVar.a(Math.max(((Long) Objects.requireNonNull(playBoundary.f2397a)).intValue() - 30, 0), Math.min(playBoundary.f2398b.intValue() + 150, iVar.r.j()));
        }
    }
}
