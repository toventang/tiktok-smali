package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ap.a;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

final /* synthetic */ class ab implements f {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16448a;

    static {
        Covode.recordClassIndex(9092);
    }

    ab(CommentWidget commentWidget) {
        this.f16448a = commentWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        CommentWidget commentWidget = this.f16448a;
        if (((d) obj).statusCode == 0) {
            b.a.a("livesdk_set_comment_status").a(commentWidget.dataChannel).a("status", "open").a("situation", "comment_popup").b();
            c.a((com.bytedance.android.livesdk.ao.c) a.bR, (Object) true);
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.b(true));
            commentWidget.b();
            return;
        }
        ao.a(y.e(), (int) R.string.e8a);
    }
}
