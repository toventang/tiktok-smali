package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class at implements b {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16470a;

    static {
        Covode.recordClassIndex(9110);
    }

    at(CommentWidget commentWidget) {
        this.f16470a = commentWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f16470a;
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue() && commentWidget.f16271j != null) {
            commentWidget.a(commentWidget.f16271j);
            commentWidget.f16271j = null;
        }
        if (!bool.booleanValue() && commentWidget.n != null) {
            commentWidget.a(commentWidget.n);
            commentWidget.n = null;
        }
        return z.f158842a;
    }
}
