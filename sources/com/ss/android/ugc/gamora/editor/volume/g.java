package com.ss.android.ugc.gamora.editor.volume;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.editor.music.EditMusicState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class g extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f147337a = new g();

    static {
        Covode.recordClassIndex(97095);
    }

    g() {
        super(EditMusicState.class, "enableChangeVoice", "getEnableChangeVoice()Lcom/bytedance/jedi/arch/JediBooleanEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((EditMusicState) obj).getEnableChangeVoice();
    }
}
