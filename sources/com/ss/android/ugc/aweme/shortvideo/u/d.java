package com.ss.android.ugc.aweme.shortvideo.u;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.effect.IEffectService;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final IEffectService.OnVideoCoverCallback f131095a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f131096b;

    static {
        Covode.recordClassIndex(85908);
    }

    d(IEffectService.OnVideoCoverCallback onVideoCoverCallback, Bitmap bitmap) {
        this.f131095a = onVideoCoverCallback;
        this.f131096b = bitmap;
    }

    public final void run() {
        IEffectService.OnVideoCoverCallback onVideoCoverCallback = this.f131095a;
        Bitmap bitmap = this.f131096b;
        if (onVideoCoverCallback == null) {
            return;
        }
        if (bitmap != null) {
            onVideoCoverCallback.onGetVideoCoverSuccess(bitmap);
        } else {
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
        }
    }
}
