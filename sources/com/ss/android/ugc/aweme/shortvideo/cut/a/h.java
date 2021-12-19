package com.ss.android.ugc.aweme.shortvideo.cut.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class h implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f125444a;

    static {
        Covode.recordClassIndex(82333);
    }

    h(a aVar) {
        this.f125444a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f125444a;
        if (aVar.f125410d.getPlayBoundary() != null && aVar.f125410d.getPlayBoundary().f2397a != null) {
            aVar.f125413g.f109435b.b(aVar.f125410d.getPlayBoundary().f2397a.longValue());
            aVar.a();
        }
    }
}
