package com.ss.android.ugc.aweme.autoplay.player.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.o;

public interface f extends b.d, OnUIPlayListener {
    static {
        Covode.recordClassIndex(41616);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    void A();

    void c();

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onBuffering(boolean z);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onDecoderBuffering(boolean z);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPausePlay(String str);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayCompleted(String str);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayCompletedFirstTime(String str);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayFailed(l lVar);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPlayProgressChange(float f2);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onPreparePlay(String str);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onRenderFirstFrame(o oVar);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onResumePlay(String str);

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    void onRetryOnError(l lVar);

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    void x();

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    void y();

    @Override // com.ss.android.ugc.aweme.autoplay.player.b.d
    void z();
}
