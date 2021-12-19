package com.ss.android.ugc.gamora.recorder.sticker.b;

import android.widget.FrameLayout;
import androidx.appcompat.app.d;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.a;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.panel.b.c;
import com.ss.android.ugc.aweme.sticker.panel.i;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.f.b.l;

public final class b implements a, c {

    /* renamed from: a  reason: collision with root package name */
    private final f f148315a;

    static {
        Covode.recordClassIndex(97740);
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f148315a;
    }

    public b(f fVar) {
        l.d(fVar, "");
        this.f148315a = fVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.b.c
    public final i a(d dVar, FrameLayout frameLayout, m mVar, androidx.fragment.app.i iVar) {
        l.d(dVar, "");
        l.d(frameLayout, "");
        l.d(mVar, "");
        l.d(iVar, "");
        j jVar = (j) getDiContainer().a(j.class, (String) null);
        return com.ss.android.ugc.aweme.sticker.l.a((com.ss.android.ugc.aweme.sticker.panel.j) getDiContainer().a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null), jVar.t(), jVar.u(), (com.ss.android.ugc.tools.b.a.d) getDiContainer().a(com.ss.android.ugc.tools.b.a.d.class, (String) null), (h) getDiContainer().a(h.class, (String) null), getDiContainer()).a(dVar, frameLayout, mVar, iVar);
    }
}
