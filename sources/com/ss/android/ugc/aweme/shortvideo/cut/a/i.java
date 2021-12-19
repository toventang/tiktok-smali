package com.ss.android.ugc.aweme.shortvideo.cut.a;

import androidx.core.g.e;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f125445a;

    static {
        Covode.recordClassIndex(82334);
    }

    i(a aVar) {
        this.f125445a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f125445a;
        e<Long, Long> singleVideoPlayBoundary = aVar.f125410d.getSingleVideoPlayBoundary();
        if (singleVideoPlayBoundary != null && singleVideoPlayBoundary.f2397a != null && singleVideoPlayBoundary.f2398b != null) {
            aVar.f125413g.f109435b.a(singleVideoPlayBoundary.f2397a.longValue(), singleVideoPlayBoundary.f2398b.longValue());
            aVar.f125413g.f109435b.a(aVar.f125410d.getSinglePlayingPosition());
        }
    }
}
