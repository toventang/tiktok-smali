package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.f;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import f.a.v;
import f.a.w;
import java.lang.reflect.Type;

final /* synthetic */ class bc implements w {

    /* renamed from: a  reason: collision with root package name */
    private final av f124996a;

    /* renamed from: b  reason: collision with root package name */
    private final f f124997b;

    static {
        Covode.recordClassIndex(82109);
    }

    bc(av avVar, f fVar) {
        this.f124996a = avVar;
        this.f124997b = fVar;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        av avVar = this.f124996a;
        if (this.f124997b.f140197d > 0) {
            ((j) avVar.f124978h.getDiContainer().a((Type) j.class, (String) null)).o();
        }
        vVar.a(new Object());
        vVar.a();
    }
}
