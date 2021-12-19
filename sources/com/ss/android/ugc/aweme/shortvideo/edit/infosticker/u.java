package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import dmt.av.video.t;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements androidx.lifecycle.u {

    /* renamed from: a  reason: collision with root package name */
    private final i f127787a;

    static {
        Covode.recordClassIndex(83765);
    }

    u(i iVar) {
        this.f127787a = iVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        i iVar = this.f127787a;
        Long l2 = (Long) obj;
        if (iVar.M && l2 != null) {
            iVar.t.a().setValue(t.a((long) iVar.s.s(l2.intValue())));
        }
    }
}
