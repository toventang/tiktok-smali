package com.ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class s extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f126619a = new s();

    static {
        Covode.recordClassIndex(83050);
    }

    s() {
        super(DuetLayoutModeState.class, "chosenPosition", "getChosenPosition()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((DuetLayoutModeState) obj).getChosenPosition());
    }
}
