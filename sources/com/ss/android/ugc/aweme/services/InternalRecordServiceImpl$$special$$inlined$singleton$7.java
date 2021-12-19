package com.ss.android.ugc.aweme.services;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.o.p;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.sticker.d.d;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.view.internal.search.TTSearchStickerViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.search.a;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.f.b.l;

public final class InternalRecordServiceImpl$$special$$inlined$singleton$7 extends p<a> {
    static {
        Covode.recordClassIndex(79499);
    }

    @Override // com.bytedance.o.p
    public final a get(f fVar) {
        l.d(fVar, "");
        o t = ((j) fVar.a(j.class, (String) null)).t();
        d u = ((j) fVar.a(j.class, (String) null)).u();
        Object a2 = fVar.a(com.ss.android.ugc.tools.b.a.d.class);
        l.b(a2, "");
        TTSearchStickerViewModel tTSearchStickerViewModel = new TTSearchStickerViewModel((m) fVar.a(m.class, (String) null), t, u, new com.ss.android.ugc.aweme.sticker.view.internal.main.m((com.ss.android.ugc.tools.b.a.d) a2));
        AVApi b2 = AVApiImpl.b();
        l.b(b2, "");
        String a3 = b2.a();
        l.b(a3, "");
        tTSearchStickerViewModel.b(a3);
        return tTSearchStickerViewModel;
    }
}
