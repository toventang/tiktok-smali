package com.ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f135737a = new g();

    static {
        Covode.recordClassIndex(88727);
    }

    private g() {
    }

    @Override // com.google.c.a.f
    public final Object a(Object obj) {
        return Boolean.valueOf(((StickerItemModel) obj).type == 2);
    }
}
