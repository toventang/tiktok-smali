package com.ss.android.ugc.aweme.commercialize.feed.assem;

import com.bytedance.assem.arch.b.i;
import com.bytedance.assem.arch.b.w;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.b.l;
import java.util.List;

public abstract class q<RECEIVER extends d> extends w<RECEIVER> implements i<VideoItemParams> {
    static {
        Covode.recordClassIndex(45745);
    }

    @Override // com.bytedance.assem.arch.b.i
    public final void a() {
    }

    /* renamed from: a */
    public boolean c(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void b(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.List] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams, List list) {
        l.d(videoItemParams, "");
    }
}
