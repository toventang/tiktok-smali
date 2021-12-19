package com.ss.android.ugc.aweme.im.sdk.common.controller.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.UUID;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f102186a = new a();

    public static String a(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 20 ? "" : "group" : "stranger" : "private";
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(65391);
    }

    public static final String a() {
        String uuid = UUID.randomUUID().toString();
        l.b(uuid, "");
        b.a(uuid);
        return uuid;
    }

    public static final String a(com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar) {
        if (aVar == null) {
            return "";
        }
        if (aVar.isStrangerChat()) {
            return "message_box";
        }
        String a2 = b.a("enter_from", "chat");
        l.b(a2, "");
        return a2;
    }
}
