package com.ss.android.ugc.aweme.ftc.components.volume;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class f extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f98318a = new f();

    static {
        Covode.recordClassIndex(62531);
    }

    f() {
        super(FTCEditVolumeState.class, "musicVolume", "getMusicVolume()Ljava/lang/Integer;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((FTCEditVolumeState) obj).getMusicVolume();
    }
}
