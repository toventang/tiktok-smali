package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final StickerImageUploader f8647a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerImageUploader.c f8648b;

    static {
        Covode.recordClassIndex(4424);
    }

    j(StickerImageUploader stickerImageUploader, StickerImageUploader.c cVar) {
        this.f8647a = stickerImageUploader;
        this.f8648b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return StickerImageUploader.a(this.f8648b.f8609b);
    }
}
