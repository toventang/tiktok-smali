package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.p.e;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16524a;

    static {
        Covode.recordClassIndex(9162);
    }

    y(CommentWidget commentWidget) {
        this.f16524a = commentWidget;
    }

    public final void onClick(View view) {
        CommentWidget commentWidget = this.f16524a;
        if (commentWidget.dataChannel != null) {
            commentWidget.dataChannel.c(e.class, true);
        }
        commentWidget.b();
    }
}
