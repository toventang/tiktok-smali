package com.ss.android.ugc.gamora.editor.sticker.core;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextState;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y extends h.f.b.y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f146499a = new y();

    static {
        Covode.recordClassIndex(96395);
    }

    y() {
        super(ReadTextState.class, "textStickerData", "getTextStickerData()Lcom/bytedance/jedi/arch/Async;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((ReadTextState) obj).getTextStickerData();
    }
}
