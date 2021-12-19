package com.ss.android.ugc.gamora.editor.volume;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class f extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f147336a = new f();

    static {
        Covode.recordClassIndex(97094);
    }

    f() {
        super(EditVolumeState.class, "musicVolume", "getMusicVolume()Ljava/lang/Integer;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((EditVolumeState) obj).getMusicVolume();
    }
}
