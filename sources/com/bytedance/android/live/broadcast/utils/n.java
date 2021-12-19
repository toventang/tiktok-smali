package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final StickerImageUploader f8655a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerImageUploader.c f8656b;

    static {
        Covode.recordClassIndex(4428);
    }

    n(StickerImageUploader stickerImageUploader, StickerImageUploader.c cVar) {
        this.f8655a = stickerImageUploader;
        this.f8656b = cVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f8655a;
        a.a(6, "StickerImageUploader", "upload sticker fail pic->" + this.f8656b.f8609b);
        stickerImageUploader.f8603c = false;
        stickerImageUploader.a();
    }
}
