package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import h.z;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f127148a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerItemModel f127149b;

    static {
        Covode.recordClassIndex(83402);
    }

    f(c cVar, StickerItemModel stickerItemModel) {
        this.f127148a = cVar;
        this.f127149b = stickerItemModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        c cVar = this.f127148a;
        StickerItemModel stickerItemModel = this.f127149b;
        ByteBuffer a2 = al.a(stickerItemModel.pinAlgorithmFile);
        if (a2 != null) {
            cVar.f127135e.a(stickerItemModel.getId(), a2);
        }
        return z.f158842a;
    }
}
