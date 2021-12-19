package com.ss.android.ugc.aweme.sticker.types.multi;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.d;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d f136176a;

    static {
        Covode.recordClassIndex(88936);
    }

    g(d dVar) {
        this.f136176a = dVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        d dVar = this.f136176a;
        d dVar2 = (d) obj;
        if (dVar2 != null) {
            dVar2.a(new h(dVar));
        }
    }
}
