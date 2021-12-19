package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.o.p;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.m.b;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.f.a.a;
import h.f.b.l;
import java.lang.reflect.Type;

public final class InternalRecordServiceImpl$registerNeededObjects$$inlined$apply$lambda$1 extends p<h> {
    final /* synthetic */ ShortVideoContext $shortVideoContext$inlined;
    final /* synthetic */ InternalRecordServiceImpl this$0;

    static {
        Covode.recordClassIndex(79506);
    }

    @Override // com.bytedance.o.p
    public final h get(final f fVar) {
        l.d(fVar, "");
        return new b(this.$shortVideoContext$inlined, new a<j>() {
            /* class com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$registerNeededObjects$$inlined$apply$lambda$1.AnonymousClass1 */

            static {
                Covode.recordClassIndex(79507);
            }

            @Override // h.f.a.a
            public final j invoke() {
                return (j) fVar.a((Type) j.class, (String) null);
            }
        });
    }

    public InternalRecordServiceImpl$registerNeededObjects$$inlined$apply$lambda$1(InternalRecordServiceImpl internalRecordServiceImpl, ShortVideoContext shortVideoContext) {
        this.this$0 = internalRecordServiceImpl;
        this.$shortVideoContext$inlined = shortVideoContext;
    }
}
