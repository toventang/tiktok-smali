package com.ss.android.ugc.aweme.editSticker.text;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.als.EditTextStickerViewState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f88610a = new m();

    static {
        Covode.recordClassIndex(55765);
    }

    m() {
        super(EditTextStickerViewState.class, "reloadStickerEvent", "getReloadStickerEvent()Lcom/bytedance/jedi/arch/JediUnitEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((EditTextStickerViewState) obj).getReloadStickerEvent();
    }
}
