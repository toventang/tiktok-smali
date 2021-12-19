package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements f {

    /* renamed from: a  reason: collision with root package name */
    private final StickerImageUploader f8651a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerImageUploader.c f8652b;

    static {
        Covode.recordClassIndex(4426);
    }

    l(StickerImageUploader stickerImageUploader, StickerImageUploader.c cVar) {
        this.f8651a = stickerImageUploader;
        this.f8652b = cVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        StickerImageUploader stickerImageUploader = this.f8651a;
        a.a(6, "StickerImageUploader", "compress file  throw error->" + this.f8652b.f8609b);
        stickerImageUploader.f8603c = false;
        stickerImageUploader.a();
    }
}
