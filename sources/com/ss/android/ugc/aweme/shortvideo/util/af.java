package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f132199a = new af();

    static {
        Covode.recordClassIndex(86577);
    }

    af() {
        super(VideoPublishState.class, "backEvent", "getBackEvent()Lcom/bytedance/jedi/arch/JediPairEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((VideoPublishState) obj).getBackEvent();
    }
}
