package com.ss.android.ugc.aweme.social.widget.card.rec.vm;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.widget.card.a.i;
import h.f.b.l;

public final class a implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    public final i f133923a;

    static {
        Covode.recordClassIndex(87621);
    }

    public a(i iVar) {
        l.d(iVar, "");
        this.f133923a = iVar;
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return new SocialCardVM(this.f133923a);
    }
}
