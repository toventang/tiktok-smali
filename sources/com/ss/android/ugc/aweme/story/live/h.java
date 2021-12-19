package com.ss.android.ugc.aweme.story.live;

import com.bytedance.android.livesdkapi.l.a;
import com.bytedance.android.livesdkapi.l.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cg;
import com.ss.android.ugc.aweme.ch;
import com.ss.android.ugc.aweme.live.model.b;
import f.a.d.f;

final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f137981a;

    static {
        Covode.recordClassIndex(90247);
    }

    h(c cVar) {
        this.f137981a = cVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar = this.f137981a;
        b bVar = (b) obj;
        e.f137977b = bVar.f108523a.f108524a;
        e.f137978c = bVar.f108523a.f108525b.f69864d;
        ch chVar = bVar.f108523a.f108525b;
        cg cgVar = bVar.f108523a.f108526c;
        a aVar = null;
        com.bytedance.android.livesdkapi.l.b bVar2 = chVar != null ? new com.bytedance.android.livesdkapi.l.b(chVar.f69864d, chVar.f69861a, chVar.f69863c, chVar.f69862b, chVar.f69865e) : null;
        if (cgVar != null) {
            aVar = new a(cgVar.f69843c, cgVar.f69842b, cgVar.f69841a);
        }
        cVar.a(Boolean.valueOf(e.f137977b), bVar2, aVar);
    }
}
