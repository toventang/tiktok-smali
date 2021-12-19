package com.ss.android.ugc.aweme.services;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.o.p;
import com.ss.android.ugc.aweme.property.bj;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.panel.i;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.sticker.view.a.b;
import com.ss.android.ugc.aweme.sticker.view.internal.main.c;
import com.ss.android.ugc.aweme.sticker.view.internal.search.a;
import com.ss.android.ugc.tools.view.style.j;
import h.f.b.l;
import h.z;
import java.lang.reflect.Type;

public final class InternalRecordServiceImpl$registerNeededObjects$$inlined$apply$lambda$2 extends p<b<j, Fragment>> {
    final /* synthetic */ ShortVideoContext $shortVideoContext$inlined;
    final /* synthetic */ InternalRecordServiceImpl this$0;

    static {
        Covode.recordClassIndex(79508);
    }

    @Override // com.bytedance.o.p
    public final b<j, Fragment> get(final f fVar) {
        l.d(fVar, "");
        c cVar = new c((byte) 0);
        cVar.a("sticker_category:favorite", new com.ss.android.ugc.aweme.sticker.view.internal.pager.b.b((m) fVar.a(m.class, (String) null), (com.ss.android.ugc.aweme.sticker.favorite.b) fVar.a(com.ss.android.ugc.aweme.sticker.favorite.b.class, (String) null), ((com.ss.android.ugc.gamora.recorder.sticker.c.j) fVar.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).t(), (StickerPreferences) fVar.a(StickerPreferences.class, (String) null)));
        if (bj.a()) {
            cVar.a("sticker_category:search", new com.ss.android.ugc.aweme.sticker.view.internal.search.j((e) fVar.a(e.class, (String) null), (a) fVar.a(a.class, (String) null), this.this$0.assembleStickerDependencyRequired(fVar), (com.ss.android.ugc.aweme.sticker.panel.j) fVar.a(com.ss.android.ugc.aweme.sticker.panel.j.class, (String) null), new h.f.a.a<z>() {
                /* class com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$registerNeededObjects$$inlined$apply$lambda$2.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(79509);
                }

                @Override // h.f.a.a
                public final void invoke() {
                    i v = ((com.ss.android.ugc.gamora.recorder.sticker.c.j) fVar.a((Type) com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).v();
                    if (v != null) {
                        v.l();
                    }
                }
            }));
        }
        return cVar;
    }

    public InternalRecordServiceImpl$registerNeededObjects$$inlined$apply$lambda$2(InternalRecordServiceImpl internalRecordServiceImpl, ShortVideoContext shortVideoContext) {
        this.this$0 = internalRecordServiceImpl;
        this.$shortVideoContext$inlined = shortVideoContext;
    }
}
