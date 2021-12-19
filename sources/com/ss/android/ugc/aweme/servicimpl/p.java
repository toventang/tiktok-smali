package com.ss.android.ugc.aweme.servicimpl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.a.j;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.d;
import f.a.v;
import f.a.w;

final /* synthetic */ class p implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ShortVideoContext f121923a;

    static {
        Covode.recordClassIndex(79936);
    }

    p(ShortVideoContext shortVideoContext) {
        this.f121923a = shortVideoContext;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        ShortVideoContext shortVideoContext = this.f121923a;
        d dVar = shortVideoContext.aw;
        if (TextUtils.isEmpty(shortVideoContext.f124757b.y)) {
            vVar.a(j.absent());
            vVar.a();
        } else if (dVar == null || !TextUtils.equals(dVar.getMusicPath(), shortVideoContext.f124757b.y)) {
            k.a(shortVideoContext.f124757b.y, new t(shortVideoContext, vVar));
        } else {
            vVar.a(j.of(dVar));
            vVar.a();
        }
    }
}
