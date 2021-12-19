package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.util.SparseBooleanArray;
import com.bytedance.android.live.n.q;
import com.bytedance.android.livesdk.chatroom.g.e;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class w implements f {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16522a;

    static {
        Covode.recordClassIndex(9160);
    }

    w(CommentWidget commentWidget) {
        this.f16522a = commentWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        CommentWidget commentWidget = this.f16522a;
        g gVar = (g) obj;
        if (commentWidget.isVisibilityToUser() && gVar != null && gVar.f17192a != null && commentWidget.getView() != null && commentWidget.isViewValid()) {
            SparseBooleanArray sparseBooleanArray = gVar.f17192a;
            int i2 = gVar.f17193b;
            sparseBooleanArray.get(0);
            boolean z = sparseBooleanArray.get(2);
            boolean z2 = sparseBooleanArray.get(1);
            boolean z3 = !z;
            e.a(commentWidget.context, commentWidget.getView(), z3, gVar.f17194c);
            if (commentWidget.dataChannel == null) {
                return;
            }
            if (commentWidget.f16266e || (i2 != 1 && !z2)) {
                commentWidget.dataChannel.c(q.class, Boolean.valueOf(z3));
            }
        }
    }
}
