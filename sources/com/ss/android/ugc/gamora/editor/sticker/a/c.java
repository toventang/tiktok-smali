package com.ss.android.ugc.gamora.editor.sticker.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.d;
import com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionStickerPanelState;
import h.f.b.r;
import h.k.h;

final /* synthetic */ class c extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final h f146391a = new c();

    static {
        Covode.recordClassIndex(96248);
    }

    c() {
        super(CommentAndQuestionStickerPanelState.class, "clickCommentStickerEvent", "getClickCommentStickerEvent()Lcom/bytedance/jedi/arch/Event;", 0);
    }

    @Override // h.f.b.r, h.k.k
    public final Object get(Object obj) {
        return ((CommentAndQuestionStickerPanelState) obj).getClickCommentStickerEvent();
    }

    @Override // h.f.b.r
    public final void set(Object obj, Object obj2) {
        ((CommentAndQuestionStickerPanelState) obj).setClickCommentStickerEvent((d) obj2);
    }
}
