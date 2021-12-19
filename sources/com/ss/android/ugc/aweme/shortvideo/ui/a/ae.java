package com.ss.android.ugc.aweme.shortvideo.ui.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.v;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ad.a;
import com.ss.android.ugc.aweme.shortvideo.dm;
import h.f.b.l;

public final class ae implements v {

    /* renamed from: a  reason: collision with root package name */
    private final d f131253a;

    /* renamed from: b  reason: collision with root package name */
    private final ShortVideoContext f131254b;

    static {
        Covode.recordClassIndex(85990);
    }

    @Override // com.bytedance.creativex.recorder.b.a.v
    public final void a() {
        a aVar = new a(this.f131253a.D());
        if (!dm.b(this.f131254b) ? this.f131254b.f124757b.a() : this.f131254b.f124757b.f124717l) {
            aVar.b();
        } else {
            aVar.a();
        }
    }

    public ae(d dVar, ShortVideoContext shortVideoContext) {
        l.d(dVar, "");
        l.d(shortVideoContext, "");
        this.f131253a = dVar;
        this.f131254b = shortVideoContext;
    }
}
