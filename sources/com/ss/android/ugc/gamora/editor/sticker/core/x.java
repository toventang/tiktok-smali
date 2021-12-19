package com.ss.android.ugc.gamora.editor.sticker.core;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f146498a = new x();

    static {
        Covode.recordClassIndex(96394);
    }

    x() {
        super(EditTextStickerViewState.class, "forceHideReadItemEvent", "getForceHideReadItemEvent()Lcom/bytedance/jedi/arch/JediBooleanEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((EditTextStickerViewState) obj).getForceHideReadItemEvent();
    }
}
