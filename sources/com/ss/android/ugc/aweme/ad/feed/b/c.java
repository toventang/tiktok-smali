package com.ss.android.ugc.aweme.ad.feed.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.model.n;
import h.f.b.l;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final OnUIPlayListener f65754a;

    static {
        Covode.recordClassIndex(40457);
    }

    public c(OnUIPlayListener onUIPlayListener) {
        l.d(onUIPlayListener, "");
        this.f65754a = onUIPlayListener;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.f
    public final void a(String str) {
        l.d(str, "");
        this.f65754a.onResumePlay(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.f
    public final void b(String str) {
        l.d(str, "");
        this.f65754a.onPausePlay(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.f
    public final void c(String str) {
        l.d(str, "");
        this.f65754a.onPlayCompleted(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.f
    public final void a(String str, long j2) {
        l.d(str, "");
        this.f65754a.onRenderReady(new n(str, false, j2));
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.f
    public final void a(String str, long j2, long j3) {
        l.d(str, "");
        this.f65754a.onPlayProgressChange(str, j2, j3);
    }
}
