package com.ss.android.ugc.gamora.editor.sticker.core;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f146500a = new z();

    static {
        Covode.recordClassIndex(96396);
    }

    z() {
        super(ReadTextState.class, "fetchFailed", "getFetchFailed()Lcom/bytedance/jedi/arch/JediPairEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((ReadTextState) obj).getFetchFailed();
    }
}
