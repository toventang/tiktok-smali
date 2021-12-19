package com.ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoState;
import h.f.b.y;

final /* synthetic */ class k extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final h.k.k f130848a = new k();

    static {
        Covode.recordClassIndex(85760);
    }

    k() {
        super(CutVideoState.class, "nextEvent", "getNextEvent()Lcom/bytedance/jedi/arch/JediUnitEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((CutVideoState) obj).getNextEvent();
    }
}
