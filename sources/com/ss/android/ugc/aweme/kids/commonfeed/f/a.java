package com.ss.android.ugc.aweme.kids.commonfeed.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.b.b;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import org.json.JSONObject;

public final class a implements OnUIPlayListener {

    /* renamed from: a  reason: collision with root package name */
    public final i f106044a = new v(false);

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.kids.commonfeed.e.a f106045b;

    static {
        Covode.recordClassIndex(67839);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j2, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j2, long j3) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, o oVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, l lVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i2, float f2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, b bVar, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i2, int i3) {
    }

    public final boolean a() {
        return this.f106044a.o();
    }

    public final void c() {
        this.f106044a.y();
    }

    public final void d() {
        this.f106044a.B();
    }

    private final OnUIPlayListener e() {
        com.ss.android.ugc.aweme.kids.commonfeed.h.a d2 = this.f106045b.d();
        if (!(d2 instanceof OnUIPlayListener)) {
            d2 = null;
        }
        return (OnUIPlayListener) d2;
    }

    public final void b() {
        Video video;
        com.ss.android.ugc.aweme.kids.commonfeed.h.a d2 = this.f106045b.d();
        if (d2 != null) {
            Aweme b2 = d2.b();
            this.f106044a.a(this);
            this.f106044a.a(d2.g());
            i iVar = this.f106044a;
            if (b2 != null) {
                video = b2.getVideo();
            } else {
                video = null;
            }
            iVar.a(video, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        OnUIPlayListener e2 = e();
        if (e2 != null) {
            e2.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        OnUIPlayListener e2 = e();
        if (e2 != null) {
            e2.onDecoderBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        OnUIPlayListener e2 = e();
        if (e2 != null) {
            e2.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        OnUIPlayListener e2 = e();
        if (e2 != null) {
            e2.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        OnUIPlayListener e2 = e();
        if (e2 != null) {
            e2.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(l lVar) {
        OnUIPlayListener e2 = e();
        if (e2 != null) {
            e2.onPlayFailed(lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f2) {
        OnUIPlayListener e2 = e();
        if (e2 != null) {
            e2.onPlayProgressChange(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        OnUIPlayListener e2 = e();
        if (e2 != null) {
            e2.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(o oVar) {
        OnUIPlayListener e2 = e();
        if (e2 != null) {
            e2.onRenderFirstFrame(oVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        OnUIPlayListener e2 = e();
        if (e2 != null) {
            e2.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(l lVar) {
        OnUIPlayListener e2 = e();
        if (e2 != null) {
            e2.onRetryOnError(lVar);
        }
    }

    public a(com.ss.android.ugc.aweme.kids.commonfeed.e.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f106045b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d7  */
    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRenderReady(com.ss.android.ugc.playerkit.model.n r7) {
        /*
        // Method dump skipped, instructions count: 586
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.f.a.onRenderReady(com.ss.android.ugc.playerkit.model.n):void");
    }
}
