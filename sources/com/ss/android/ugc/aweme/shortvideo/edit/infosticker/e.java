package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import h.z;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f127146a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerItemModel f127147b;

    static {
        Covode.recordClassIndex(83401);
    }

    e(c cVar, StickerItemModel stickerItemModel) {
        this.f127146a = cVar;
        this.f127147b = stickerItemModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        c cVar = this.f127146a;
        StickerItemModel stickerItemModel = this.f127147b;
        ByteBuffer a2 = al.a(stickerItemModel.pinAlgorithmFile);
        if (a2 != null) {
            cVar.f127135e.a(stickerItemModel.getId(), a2);
        }
        return z.f158842a;
    }
}
