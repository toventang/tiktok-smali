package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import h.f.a.a;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

final class AlbumServiceImpl$subscribeAlbumClose$2 extends m implements b<ClosingChooseMediaPageState, z> {
    final /* synthetic */ a $runnable;

    static {
        Covode.recordClassIndex(79413);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlbumServiceImpl$subscribeAlbumClose$2(a aVar) {
        super(1);
        this.$runnable = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // h.f.a.b
    public final /* bridge */ /* synthetic */ z invoke(ClosingChooseMediaPageState closingChooseMediaPageState) {
        invoke(closingChooseMediaPageState);
        return z.f158842a;
    }

    public final void invoke(ClosingChooseMediaPageState closingChooseMediaPageState) {
        l.d(closingChooseMediaPageState, "");
        if (l.a(closingChooseMediaPageState, ClosingChooseMediaPageState.Closed.INSTANCE)) {
            this.$runnable.invoke();
        }
    }
}
