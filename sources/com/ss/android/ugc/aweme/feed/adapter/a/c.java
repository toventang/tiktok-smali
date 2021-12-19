package com.ss.android.ugc.aweme.feed.adapter.a;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.ce;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.aweme.player.sdk.b.b;
import com.ss.android.ugc.aweme.video.f.a;
import com.ss.android.ugc.aweme.video.local.f;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.i;
import com.ss.android.ugc.playerkit.videoview.k;
import java.util.Objects;

public final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    public final k f91583b;

    /* renamed from: c  reason: collision with root package name */
    private VideoViewComponent f91584c;

    /* renamed from: d  reason: collision with root package name */
    private final i f91585d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f91586e;

    static {
        Covode.recordClassIndex(57671);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void A() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void b(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void e(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final int s() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void z() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final i c() {
        return this.f91585d;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah, com.ss.android.ugc.aweme.feed.adapter.a.a
    public final a O() {
        return super.O();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final boolean w() {
        return this.f91585d.c();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final Surface x() {
        return this.f91585d.b();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final View y() {
        return this.f91585d.a();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final boolean b() {
        if (this.f91585d.e() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.h
    public final j.g j() {
        VideoViewComponent videoViewComponent = this.f91584c;
        if (videoViewComponent != null) {
            return videoViewComponent.j();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        super.onPlayPause(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        super.onPlayPrepare(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        super.onPlayRelease(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        super.onPlayStop(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        super.onPlaying(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(n nVar) {
        super.onRenderReady(nVar);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.h
    public final void a(OnUIPlayListener onUIPlayListener) {
        VideoViewComponent videoViewComponent = this.f91584c;
        if (videoViewComponent != null) {
            videoViewComponent.a(onUIPlayListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void a(k kVar) {
        this.f91585d.a(kVar);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void e(boolean z) {
        if (z) {
            this.f91585d.g();
        } else {
            this.f91585d.h();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j2) {
        super.onBufferedTimeMs(str, j2);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        super.onBuffering(str, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        super.onSeekEnd(str, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i2) {
        super.onPlayCompleted(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, l lVar) {
        super.onPlayFailed(str, lVar);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        super.onPlayStop(str, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, o oVar) {
        super.onRenderFirstFrame(str, oVar);
    }

    public c(ViewGroup viewGroup, k kVar) {
        h.f.b.l.d(viewGroup, "");
        h.f.b.l.d(kVar, "");
        this.f91583b = kVar;
        Context context = viewGroup.getContext();
        this.f91586e = context;
        com.ss.android.ugc.playerkit.videoview.j a2 = com.ss.android.ugc.playerkit.videoview.j.a(viewGroup);
        h.f.b.l.b(a2, "");
        this.f91585d = a2;
        if (f.f143475a && (a2.a() instanceof SurfaceView)) {
            d dVar = ce.a.f91760a.get(context);
            if (dVar == null) {
                dVar = new d();
                ce.a.f91760a.put(context, dVar);
            }
            View a3 = a2.a();
            h.f.b.l.b(a3, "");
            a3.setVisibility(8);
            a2.a(kVar);
            View a4 = a2.a();
            Objects.requireNonNull(a4, "null cannot be cast to non-null type android.view.SurfaceView");
            dVar.a(a4);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j2, int i2) {
        super.onBufferedPercent(str, j2, i2);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i2, float f2) {
        super.onSeekStart(str, i2, f2);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, b bVar, int i2) {
        super.onVideoBitrateChanged(str, bVar, i2);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j2, long j3) {
        super.onPlayProgressChange(str, j2, j3);
    }
}
