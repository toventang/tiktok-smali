package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.SystemClock;
import com.bytedance.android.live.j;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.bf;
import com.bytedance.android.livesdk.chatroom.c.ab;
import com.bytedance.android.livesdk.chatroom.c.ap;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16455a;

    /* renamed from: b  reason: collision with root package name */
    private final ab f16456b;

    static {
        Covode.recordClassIndex(9096);
    }

    af(CommentWidget commentWidget, ab abVar) {
        this.f16455a = commentWidget;
        this.f16456b = abVar;
    }

    public final void run() {
        CommentWidget commentWidget = this.f16455a;
        ab abVar = this.f16456b;
        commentWidget.dataChannel.c(j.class, new ap(3, abVar.f15071b));
        bf.a().c();
        commentWidget.f16269h = null;
        commentWidget.f16272k = abVar;
        b.a.a("livesdk_comment_rethink_edit_ck").a(commentWidget.dataChannel).a("user_id", u.a().b().c()).a(UGCMonitor.EVENT_COMMENT, abVar.f15071b).a("resend_same_cmt", abVar.a() ? 1 : 0).a("if_click_cg", commentWidget.f16270i ? 1 : 0).b();
        commentWidget.f16273l = SystemClock.uptimeMillis();
    }
}
