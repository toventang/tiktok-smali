package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.event.d;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class ag implements b {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16457a;

    static {
        Covode.recordClassIndex(9097);
    }

    ag(CommentWidget commentWidget) {
        this.f16457a = commentWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f16457a;
        d dVar = (d) obj;
        if (dVar != null) {
            commentWidget.a(dVar.f17185a, false, false, 0);
        }
        return z.f158842a;
    }
}
