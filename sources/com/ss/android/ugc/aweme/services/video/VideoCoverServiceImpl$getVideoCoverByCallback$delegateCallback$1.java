package com.ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import h.f.b.l;

public final class VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1 implements IEffectService.OnVideoCoverCallback {
    final /* synthetic */ IEffectService.OnVideoCoverCallback $callback;
    final /* synthetic */ c $draft;
    final /* synthetic */ VideoCoverServiceImpl this$0;

    static {
        Covode.recordClassIndex(79867);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i2) {
        IEffectService.OnVideoCoverCallback onVideoCoverCallback = this.$callback;
        if (onVideoCoverCallback != null) {
            onVideoCoverCallback.onGetVideoCoverFailed(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        l.d(bitmap, "");
        Bitmap mergeCoverTextImage = this.this$0.mergeCoverTextImage(bitmap, this.$draft.W.aR);
        IEffectService.OnVideoCoverCallback onVideoCoverCallback = this.$callback;
        if (onVideoCoverCallback != null) {
            onVideoCoverCallback.onGetVideoCoverSuccess(mergeCoverTextImage);
        }
    }

    VideoCoverServiceImpl$getVideoCoverByCallback$delegateCallback$1(VideoCoverServiceImpl videoCoverServiceImpl, c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        this.this$0 = videoCoverServiceImpl;
        this.$draft = cVar;
        this.$callback = onVideoCoverCallback;
    }
}
