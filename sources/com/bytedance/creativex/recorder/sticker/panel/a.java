package com.bytedance.creativex.recorder.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.sticker.panel.j;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class a implements c, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    private final f f28448a;

    /* renamed from: b  reason: collision with root package name */
    private final b<j, z> f28449b;

    static {
        Covode.recordClassIndex(16718);
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f28448a;
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.c
    public final b a() {
        com.bytedance.creativex.recorder.sticker.a.a aVar = (com.bytedance.creativex.recorder.sticker.a.a) getDiContainer().a(com.bytedance.creativex.recorder.sticker.a.a.class, (String) null);
        f diContainer = getDiContainer();
        com.ss.android.ugc.aweme.sticker.panel.b.a aVar2 = new com.ss.android.ugc.aweme.sticker.panel.b.a(aVar.t(), aVar.u());
        b<j, z> bVar = this.f28449b;
        if (bVar != null) {
            l.d(bVar, "");
            aVar2.f135029h = bVar;
        }
        return new d(diContainer, aVar2);
    }

    private a(f fVar) {
        l.d(fVar, "");
        this.f28448a = fVar;
        this.f28449b = null;
    }

    public /* synthetic */ a(f fVar, byte b2) {
        this(fVar);
    }
}
