package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.c.ap;
import com.bytedance.android.livesdk.chatroom.c.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ak implements f {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16461a;

    static {
        Covode.recordClassIndex(9101);
    }

    ak(CommentWidget commentWidget) {
        this.f16461a = commentWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        CommentWidget commentWidget = this.f16461a;
        if (obj instanceof b) {
            commentWidget.onEvent((b) obj);
        } else if (obj instanceof ap) {
            commentWidget.onEvent((ap) obj);
        }
    }
}
