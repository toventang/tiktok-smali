package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.a.j;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import f.a.v;
import f.a.w;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bb implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ShortVideoContext f124995a;

    static {
        Covode.recordClassIndex(82108);
    }

    bb(ShortVideoContext shortVideoContext) {
        this.f124995a = shortVideoContext;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        ShortVideoContext shortVideoContext = this.f124995a;
        d dVar = shortVideoContext.aw;
        if (TextUtils.isEmpty(shortVideoContext.f124757b.y)) {
            vVar.a(j.absent());
            vVar.a();
        } else if (dVar == null || !TextUtils.equals(dVar.getMusicPath(), shortVideoContext.f124757b.y)) {
            k.a(shortVideoContext.f124757b.y, new be(shortVideoContext, vVar));
        } else {
            vVar.a(j.of(dVar));
            vVar.a();
        }
    }
}
