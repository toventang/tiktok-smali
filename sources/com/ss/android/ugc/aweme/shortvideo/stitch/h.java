package com.ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class h extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f130845a = new h();

    static {
        Covode.recordClassIndex(85757);
    }

    h() {
        super(CutVideoState.class, "quitEvent", "getQuitEvent()Lcom/bytedance/jedi/arch/JediUnitEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((CutVideoState) obj).getQuitEvent();
    }
}
