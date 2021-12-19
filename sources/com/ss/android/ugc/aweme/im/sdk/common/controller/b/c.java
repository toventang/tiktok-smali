package com.ss.android.ugc.aweme.im.sdk.common.controller.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f102191a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(65393);
    }

    public static void a(h hVar, String str) {
        String str2;
        l.d(hVar, "");
        l.d(str, "");
        d a2 = new d().a("conversation_id", hVar.getConversationId());
        if (hVar.isGroupChat()) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        d a3 = a2.a("chat_type", str2);
        if ((!hVar.isGroupChat()) && a3 != null) {
            a3.a("to_user_id", b.a.c(hVar.getConversationId()));
        }
        r.a("message_read_status", a3.a("read_status", str).f66730a);
    }
}
