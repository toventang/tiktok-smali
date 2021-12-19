package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishState;
import h.f.b.y;
import h.k.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ag extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f132200a = new ag();

    static {
        Covode.recordClassIndex(86578);
    }

    ag() {
        super(VideoPublishState.class, "cancelEvent", "getCancelEvent()Lcom/bytedance/jedi/arch/JediPairEvent;", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return ((VideoPublishState) obj).getCancelEvent();
    }
}
