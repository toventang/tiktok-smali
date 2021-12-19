package com.ss.android.ugc.gamora.editor.sticker.qa;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class g extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f146813a = new g();

    static {
        Covode.recordClassIndex(96692);
    }

    g() {
        super(EditStickerState.class, "enableDirectEditEvent", "getEnableDirectEditEvent()Lcom/bytedance/jedi/arch/JediBooleanEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((EditStickerState) obj).getEnableDirectEditEvent();
    }
}
