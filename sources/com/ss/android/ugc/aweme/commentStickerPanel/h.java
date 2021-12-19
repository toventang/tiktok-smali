package com.ss.android.ugc.aweme.commentStickerPanel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.k;
import h.f.b.r;

final /* synthetic */ class h extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h.k.h f73191a = new h();

    static {
        Covode.recordClassIndex(45086);
    }

    h() {
        super(CommentAndQuestionStickerPanelState.class, "replaceStickerModelEvent", "getReplaceStickerModelEvent()Lcom/bytedance/jedi/arch/JediBooleanEvent;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((CommentAndQuestionStickerPanelState) obj).getReplaceStickerModelEvent();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((CommentAndQuestionStickerPanelState) obj).setReplaceStickerModelEvent((k) obj2);
    }
}
