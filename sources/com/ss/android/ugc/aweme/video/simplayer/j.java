package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.b.b;
import com.ss.android.ugc.aweme.video.simplayer.f;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import java.util.HashMap;
import org.json.JSONObject;

public final class j implements OnUIPlayListener {

    /* renamed from: a  reason: collision with root package name */
    public OnUIPlayListener f143887a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, Object> f143888b;

    /* renamed from: c  reason: collision with root package name */
    private c f143889c;

    /* renamed from: d  reason: collision with root package name */
    private f.d f143890d;

    static {
        Covode.recordClassIndex(94152);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreParePlay(String str, n nVar) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreRenderSessionMissed(String str) {
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final OnUIPlayListener getWrapperedListener() {
        return this.f143887a;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPausePlay(String str) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(l lVar) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPause(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPrepare(String str) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayPrepare(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f2) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayRelease(String str) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayRelease(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlaying(String str) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlaying(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(o oVar) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderFirstFrame(oVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrameFromResume(String str) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderFirstFrameFromResume(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(n nVar) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderReady(nVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(l lVar) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(boolean z) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(z);
        }
    }

    public j(f.d dVar, c cVar) {
        this.f143890d = dVar;
        this.f143889c = cVar;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedTimeMs(String str, long j2) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBufferedTimeMs(str, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBuffering(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onCompleteLoaded(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onCompleteLoaded(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onDecoderBuffering(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onDecoderBuffering(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekEnd(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekEnd(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str, int i2) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayCompleted(str, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(String str, l lVar) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed(str, lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, JSONObject jSONObject) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(String str, o oVar) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRenderFirstFrame(str, oVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRetryOnError(String str, l lVar) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onRetryOnError(str, lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayStop(String str, boolean z) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayStop(str, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onBufferedPercent(String str, long j2, int i2) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onBufferedPercent(str, j2, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayerInternalEvent(str, i2, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onSeekStart(String str, int i2, float f2) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onSeekStart(str, i2, f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoBitrateChanged(String str, b bVar, int i2) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onVideoBitrateChanged(str, bVar, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onVideoSizeChanged(String str, int i2, int i3) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onVideoSizeChanged(str, i2, i3);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j2, long j3) {
        OnUIPlayListener onUIPlayListener = this.f143887a;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayProgressChange(str, j2, j3);
        }
    }
}
