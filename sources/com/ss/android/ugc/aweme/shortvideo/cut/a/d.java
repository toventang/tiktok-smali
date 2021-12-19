package com.ss.android.ugc.aweme.shortvideo.cut.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f125440a;

    static {
        Covode.recordClassIndex(82329);
    }

    d(a aVar) {
        this.f125440a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f125440a;
        Boolean bool = (Boolean) obj;
        aVar.f125412f = bool != null && bool.booleanValue();
        if (bool == null || !bool.booleanValue()) {
            aVar.f125413g.a();
        } else {
            aVar.f125413g.b();
        }
    }
}
