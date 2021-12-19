package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.ab.i;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class ao implements b {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16465a;

    static {
        Covode.recordClassIndex(9105);
    }

    ao(CommentWidget commentWidget) {
        this.f16465a = commentWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f16465a;
        if (((Boolean) obj).booleanValue()) {
            commentWidget.getView().setVisibility(4);
        } else {
            commentWidget.getView().setVisibility(0);
        }
        i.b();
        i.b("ttlive_comment", "CommentWidget contentView status changed, visible:" + commentWidget.isShowing() + ", reason: DATA_KEYBOARD_STATUS");
        return z.f158842a;
    }
}
