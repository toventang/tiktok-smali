package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.bf;
import com.bytedance.android.livesdk.chatroom.c.ab;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ae implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16453a;

    /* renamed from: b  reason: collision with root package name */
    private final ab f16454b;

    static {
        Covode.recordClassIndex(9095);
    }

    ae(CommentWidget commentWidget, ab abVar) {
        this.f16453a = commentWidget;
        this.f16454b = abVar;
    }

    public final void run() {
        CommentWidget commentWidget = this.f16453a;
        ab abVar = this.f16454b;
        commentWidget.a(abVar.f15071b, false, true, abVar.f15072c);
        bf.a().c();
        commentWidget.f16269h = null;
        b.a.a("livesdk_comment_rethink_post_ck").a(commentWidget.dataChannel).a("user_id", u.a().b().c()).a(UGCMonitor.EVENT_COMMENT, abVar.f15071b).a("resend_same_cmt", abVar.a() ? 1 : 0).a("if_click_cg", commentWidget.f16270i ? 1 : 0).b();
    }
}
