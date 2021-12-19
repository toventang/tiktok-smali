package com.ss.android.ugc.aweme.im.sdk.chat.ui.a;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.im.sdk.chat.a.f;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.ss.android.ugc.aweme.im.service.m.a;
import h.f.b.l;
import java.util.Map;

final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass2 f101140a;

    static {
        Covode.recordClassIndex(64702);
    }

    h(c.AnonymousClass2 r1) {
        this.f101140a = r1;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        c.AnonymousClass2 r2 = this.f101140a;
        c.this.p.setValue(r2.f101131c);
        ai aiVar = r2.f101131c;
        String a2 = t.a(aiVar, b.content(aiVar));
        a.c("MessageAdapter", "Reply option clicked ".concat(String.valueOf(a2)));
        ai aiVar2 = r2.f101131c;
        boolean isGroupChat = c.this.n.isGroupChat();
        f.c cVar = f.c.f100115a;
        l.d(aiVar2, "");
        l.d(a2, "");
        l.d(cVar, "");
        Map<String, String> map = new d().a("conversation_id", aiVar2.getConversationId()).a("chat_type", isGroupChat ? "group" : "private").a("quote_user_id", aiVar2.getSender()).a("is_self", aiVar2.isSelf() ? 1 : 0).a("message_type", a2).f66730a;
        l.b(map, "");
        cVar.invoke("quote_message", map);
    }
}
