package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class as implements b {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16469a;

    static {
        Covode.recordClassIndex(9109);
    }

    as(CommentWidget commentWidget) {
        this.f16469a = commentWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f16469a;
        if (commentWidget.f16269h != null) {
            commentWidget.f16269h.dismiss();
            commentWidget.f16269h = null;
        }
        if (commentWidget.f16274m != null) {
            commentWidget.f16274m.dismiss();
            commentWidget.f16274m = null;
        }
        return z.f158842a;
    }
}
