package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.t;
import java.util.Objects;

/* access modifiers changed from: package-private */
public final /* synthetic */ class o implements u {

    /* renamed from: a  reason: collision with root package name */
    private final i f98088a;

    static {
        Covode.recordClassIndex(62348);
    }

    o(i iVar) {
        this.f98088a = iVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        i iVar = this.f98088a;
        if (iVar.L) {
            iVar.f98073h.isEnabled();
            iVar.f();
            iVar.a(0, iVar.r.G());
            iVar.s.a().setValue(t.a((long) iVar.r.s(((Long) Objects.requireNonNull(iVar.f98073h.getPlayBoundary().f2398b)).intValue())));
        }
    }
}
