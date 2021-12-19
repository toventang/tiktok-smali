package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.j.ef;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class an implements b {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16464a;

    static {
        Covode.recordClassIndex(9104);
    }

    an(CommentWidget commentWidget) {
        this.f16464a = commentWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        CommentWidget commentWidget = this.f16464a;
        com.bytedance.android.livesdk.event.b bVar = (com.bytedance.android.livesdk.event.b) obj;
        if (commentWidget.isViewValid() && !commentWidget.f16263b) {
            commentWidget.dataChannel.a(ef.class, bVar);
            if (commentWidget.q != null) {
                commentWidget.q.a(bVar);
            } else {
                commentWidget.r.f15761c = bVar.f17179a;
                commentWidget.r.f15762d = bVar.f17180b;
            }
        }
        return z.f158842a;
    }
}
