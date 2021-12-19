package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final StickerImageUploader f8653a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerImageUploader.c f8654b;

    static {
        Covode.recordClassIndex(4427);
    }

    m(StickerImageUploader stickerImageUploader, StickerImageUploader.c cVar) {
        this.f8653a = stickerImageUploader;
        this.f8654b = cVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f8653a;
        a.a(6, "StickerImageUploader", "upload sticker success pic->" + this.f8654b.f8609b);
        stickerImageUploader.f8603c = false;
        stickerImageUploader.a();
    }
}
