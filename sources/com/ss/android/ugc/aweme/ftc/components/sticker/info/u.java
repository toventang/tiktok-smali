package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements androidx.lifecycle.u {

    /* renamed from: a  reason: collision with root package name */
    private final i f98094a;

    static {
        Covode.recordClassIndex(62354);
    }

    u(i iVar) {
        this.f98094a = iVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        i iVar = this.f98094a;
        Long l2 = (Long) obj;
        if (iVar.L && l2 != null) {
            iVar.s.a().setValue(t.a((long) iVar.r.s(l2.intValue())));
        }
    }
}
