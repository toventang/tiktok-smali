package com.ss.android.ugc.aweme.shortvideo.cut.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f125443a;

    static {
        Covode.recordClassIndex(82332);
    }

    g(a aVar) {
        this.f125443a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f125443a;
        if (aVar.f125410d.getPlayBoundary() != null && aVar.f125410d.getPlayBoundary().f2398b != null) {
            aVar.f125413g.f109435b.c(aVar.f125410d.getPlayBoundary().f2398b.longValue());
            aVar.a();
        }
    }
}
