package com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.common.controller.b.b;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f100915a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(64553);
    }

    public static void b(ai aiVar) {
        l.d(aiVar, "");
        r.a("cancel_like_message", a(aiVar).f66730a);
    }

    private static String c(ai aiVar) {
        int msgType = aiVar.getMsgType();
        if (msgType == 5) {
            return "GIF";
        }
        if (msgType == 7) {
            return "text";
        }
        if (msgType != 8) {
            return "card";
        }
        return "video";
    }

    static d a(ai aiVar) {
        d a2 = new d().a("to_user_id", String.valueOf(aiVar.getSender())).a("message_type", c(aiVar)).a("conversation_id", aiVar.getConversationId());
        l.b(a2, "");
        return a2;
    }

    public static void a(ai aiVar, boolean z, boolean z2) {
        String str;
        String str2;
        l.d(aiVar, "");
        d a2 = a(aiVar);
        if (aiVar.getConversationType() == e.a.f37582b) {
            str = "group";
        } else {
            str = "private";
        }
        d a3 = a2.a("chat_type", str);
        if (z) {
            str2 = "double_click";
        } else {
            str2 = "button";
        }
        r.a("like_message", a3.a("like_method", str2).a("isauthor", !z2 ? 1 : 0).a("is_master", b.a(aiVar)).f66730a);
    }
}
