package com.ss.android.ugc.aweme.player.sdk.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.b.b;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.ss.android.ugc.playerkit.model.o;
import org.json.JSONObject;

public interface OnUIPlayListener {
    static {
        Covode.recordClassIndex(74055);
    }

    OnUIPlayListener getWrapperedListener();

    void onBufferedPercent(String str, long j2, int i2);

    void onBufferedTimeMs(String str, long j2);

    void onBuffering(String str, boolean z);

    void onBuffering(boolean z);

    void onCompleteLoaded(String str, boolean z);

    void onDecoderBuffering(String str, boolean z);

    void onDecoderBuffering(boolean z);

    void onPausePlay(String str);

    void onPlayCompleted(String str);

    void onPlayCompleted(String str, int i2);

    void onPlayCompletedFirstTime(String str);

    void onPlayFailed(l lVar);

    void onPlayFailed(String str, l lVar);

    void onPlayPause(String str);

    void onPlayPrepare(String str);

    void onPlayProgressChange(float f2);

    void onPlayProgressChange(String str, long j2, long j3);

    void onPlayRelease(String str);

    void onPlayStop(String str);

    void onPlayStop(String str, JSONObject jSONObject);

    void onPlayStop(String str, boolean z);

    void onPlayerInternalEvent(String str, int i2, JSONObject jSONObject);

    void onPlaying(String str);

    void onPreParePlay(String str, n nVar);

    void onPreRenderSessionMissed(String str);

    void onPreparePlay(String str);

    void onRenderFirstFrame(o oVar);

    void onRenderFirstFrame(String str, o oVar);

    void onRenderFirstFrameFromResume(String str);

    void onRenderReady(n nVar);

    void onResumePlay(String str);

    void onRetryOnError(l lVar);

    void onRetryOnError(String str, l lVar);

    void onSeekEnd(String str, boolean z);

    void onSeekStart(String str, int i2, float f2);

    void onVideoBitrateChanged(String str, b bVar, int i2);

    void onVideoSizeChanged(String str, int i2, int i3);
}
