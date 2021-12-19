package com.ss.android.ugc.aweme.services;

import com.bytedance.als.dsl.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.panel.g;
import com.bytedance.o.f;
import com.bytedance.o.p;
import com.bytedance.scene.group.b;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import com.ss.android.ugc.aweme.sticker.x;
import h.f.b.l;

public final class InternalRecordServiceImpl$attachStickerComponent$$inlined$apply$lambda$1 extends p<g> {
    final /* synthetic */ d $builder$inlined;
    final /* synthetic */ r.b $listener$inlined;
    final /* synthetic */ b $parentScene$inlined;
    final /* synthetic */ int $viewId$inlined;

    static {
        Covode.recordClassIndex(79501);
    }

    @Override // com.bytedance.o.p
    public final g get(f fVar) {
        l.d(fVar, "");
        b bVar = this.$parentScene$inlined;
        int i2 = this.$viewId$inlined;
        r.b bVar2 = this.$listener$inlined;
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(bVar2, "");
        return new g(fVar, bVar, i2, new x.a(fVar, bVar2));
    }

    public InternalRecordServiceImpl$attachStickerComponent$$inlined$apply$lambda$1(d dVar, b bVar, int i2, r.b bVar2) {
        this.$builder$inlined = dVar;
        this.$parentScene$inlined = bVar;
        this.$viewId$inlined = i2;
        this.$listener$inlined = bVar2;
    }
}
