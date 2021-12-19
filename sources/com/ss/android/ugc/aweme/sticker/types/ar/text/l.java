package com.ss.android.ugc.aweme.sticker.types.ar.text;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class l implements u {

    /* renamed from: a  reason: collision with root package name */
    private final k f135862a;

    static {
        Covode.recordClassIndex(88793);
    }

    l(k kVar) {
        this.f135862a = kVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        k kVar = this.f135862a;
        q qVar = (q) obj;
        kVar.f135858a = qVar;
        if (qVar != null) {
            kVar.a(qVar);
        }
    }
}
