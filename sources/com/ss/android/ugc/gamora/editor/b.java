package com.ss.android.ugc.gamora.editor;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f145692a = new b();

    static {
        Covode.recordClassIndex(95684);
    }

    b() {
        super(EditStickerState.class, "enableDirectEditEvent", "getEnableDirectEditEvent()Lcom/bytedance/jedi/arch/JediBooleanEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((EditStickerState) obj).getEnableDirectEditEvent();
    }
}
