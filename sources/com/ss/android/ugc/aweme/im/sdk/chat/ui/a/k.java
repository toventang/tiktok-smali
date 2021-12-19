package com.ss.android.ugc.aweme.im.sdk.chat.ui.a;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.a.f;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.g;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.b.b;

final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass2 f101144a;

    /* renamed from: b  reason: collision with root package name */
    private final View f101145b;

    static {
        Covode.recordClassIndex(64705);
    }

    k(c.AnonymousClass2 r1, View view) {
        this.f101144a = r1;
        this.f101145b = view;
    }

    public final void onClick(View view) {
        g.a a2;
        ClickAgent.onClick(view);
        c.AnonymousClass2 r5 = this.f101144a;
        Activity a3 = com.bytedance.tux.h.c.a(this.f101145b.getContext());
        if (!(a3 == null || (a2 = g.a(r5.f101131c)) == null)) {
            g.a(a2, a3, "2");
            String sb = new StringBuilder().append(r5.f101131c.getSender()).toString();
            if (a2.f100208h == 3) {
                a.a("group_chat_long_press", sb, "im");
            } else {
                b.d(sb, "click_head");
            }
        }
        f.a(c.this.n.getChatType() == 3, "report");
    }
}
