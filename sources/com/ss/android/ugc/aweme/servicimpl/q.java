package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.f;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import f.a.v;
import f.a.w;
import java.lang.reflect.Type;

final /* synthetic */ class q implements w {

    /* renamed from: a  reason: collision with root package name */
    private final j f121924a;

    /* renamed from: b  reason: collision with root package name */
    private final f f121925b;

    static {
        Covode.recordClassIndex(79937);
    }

    q(j jVar, f fVar) {
        this.f121924a = jVar;
        this.f121925b = fVar;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        j jVar = this.f121924a;
        if (this.f121925b.f140197d > 0) {
            ((j) jVar.f121909h.getDiContainer().a((Type) j.class, (String) null)).o();
        }
        vVar.a(new Object());
        vVar.a();
    }
}
