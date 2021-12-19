package com.bytedance.creativex.recorder.sticker.a;

import android.widget.FrameLayout;
import com.bytedance.als.b;
import com.bytedance.als.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.sticker.presenter.i;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import f.a.t;
import h.p;

public interface a extends b, i {
    static {
        Covode.recordClassIndex(16668);
    }

    g<Boolean> a();

    void a(r.b bVar, FrameLayout frameLayout);

    void a(boolean z);

    g<b> b();

    void b(boolean z);

    d c();

    g<Boolean> d();

    g<Boolean> e();

    g<c> f();

    t<p<Effect, com.bytedance.creativex.recorder.sticker.b.a>> g();

    com.ss.android.ugc.aweme.sticker.presenter.a.c h();

    FaceStickerBean i();

    g<Effect> j();

    g<Boolean> k();

    void l();

    void m();

    void n();

    void o();

    void p();
}
