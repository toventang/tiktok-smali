package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.b.f;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdk.chatroom.c.ab;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final CommentWidget f16450a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16451b;

    /* renamed from: c  reason: collision with root package name */
    private final ab f16452c;

    static {
        Covode.recordClassIndex(9094);
    }

    ad(CommentWidget commentWidget, String str, ab abVar) {
        this.f16450a = commentWidget;
        this.f16451b = str;
        this.f16452c = abVar;
    }

    public final void run() {
        CommentWidget commentWidget = this.f16450a;
        String str = this.f16451b;
        ab abVar = this.f16452c;
        commentWidget.f16270i = true;
        d.b a2 = e.a(str);
        a2.f14310k = -1;
        a2.f14309j = 80;
        if (((Boolean) commentWidget.dataChannel.b(cp.class)).booleanValue()) {
            a2.f14302c = (int) y.e((int) (((float) y.b()) * 0.9f));
            a2.f14301b = (int) y.e(y.c());
            a2.x = y.a((int) R.string.e40);
            a2.y = true;
            a2.C = true;
        } else {
            d.b a3 = a2.a(8, 0, 0, 8);
            a3.n = true;
            a3.f14302c = (int) y.e(y.b());
            a3.f14301b = 395;
        }
        a.a(p.a(commentWidget.getContext()), ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager().a(a2));
        b.a.a("livesdk_comment_rethink_cg_ck").a(commentWidget.dataChannel).a("user_id", u.a().b().c()).a(UGCMonitor.EVENT_COMMENT, abVar.f15071b).a("resend_same_cmt", abVar.a() ? 1 : 0).b();
    }
}
