package com.ss.android.ugc.aweme.sticker.text;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.t;
import com.ss.android.ugc.aweme.port.in.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f135738a = new h();

    static {
        Covode.recordClassIndex(88728);
    }

    private h() {
    }

    @Override // com.google.c.a.f
    public final Object a(Object obj) {
        return t.i(((TextStickerData) g.a().G().a(((StickerItemModel) obj).extra, TextStickerData.class)).getTextWrapList());
    }
}
