package com.ss.android.ugc.aweme.services.mvtemplate;

import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.c;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import h.f.b.l;

public final class AVVideoViewComponentFactoryImpl$create$1 implements e {
    final /* synthetic */ VideoViewComponent $videoViewComponent;
    private OnUIPlayListener aVOnUIPlayListener;

    static {
        Covode.recordClassIndex(79741);
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final boolean isPlaying() {
        return this.$videoViewComponent.g();
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final void pause() {
        this.$videoViewComponent.b();
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final void stop() {
        this.$videoViewComponent.c();
    }

    AVVideoViewComponentFactoryImpl$create$1(VideoViewComponent videoViewComponent) {
        this.$videoViewComponent = videoViewComponent;
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final void tryResume(Video video) {
        l.d(video, "");
        this.$videoViewComponent.a(video);
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final void wrap(TextureView textureView) {
        l.d(textureView, "");
        this.$videoViewComponent.a((KeepSurfaceTextureView) textureView);
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final void addPlayerListener(c cVar) {
        l.d(cVar, "");
        VideoViewComponent videoViewComponent = this.$videoViewComponent;
        OnUIPlayListener onUIPlayListener = AVVideoViewComponentFactoryImplKt.toOnUIPlayListener(cVar);
        this.aVOnUIPlayListener = onUIPlayListener;
        videoViewComponent.b(onUIPlayListener);
    }
}
