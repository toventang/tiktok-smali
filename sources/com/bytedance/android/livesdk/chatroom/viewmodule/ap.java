package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class ap implements b {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16466a;

    static {
        Covode.recordClassIndex(9106);
    }

    ap(CommentWidget commentWidget) {
        this.f16466a = commentWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f16466a;
        Boolean bool = (Boolean) obj;
        if (commentWidget.getView() != null) {
            commentWidget.getView().setVisibility(bool.booleanValue() ? 8 : 0);
        }
        return z.f158842a;
    }
}
