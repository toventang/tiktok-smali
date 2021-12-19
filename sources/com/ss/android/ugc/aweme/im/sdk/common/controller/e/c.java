package com.ss.android.ugc.aweme.im.sdk.common.controller.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.i;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class c {
    static {
        Covode.recordClassIndex(65413);
    }

    public static final long a(h hVar) {
        if (hVar == null) {
            return -1;
        }
        return b.a.c(hVar.getConversationId());
    }

    public static final String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return b(a.C0745a.a().a(str));
    }

    public static final IMUser c(h hVar) {
        if (hVar == null || !hVar.isSingleChat()) {
            return null;
        }
        long c2 = b.a.c(hVar.getConversationId());
        return g.a(String.valueOf(c2), b(hVar));
    }

    public static final int d(h hVar) {
        i coreInfo;
        Map<String, String> ext;
        String str;
        if (hVar == null || (coreInfo = hVar.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str = ext.get("a:s_group_member_limit")) == null || str.length() == 0) {
            return com.ss.android.ugc.aweme.im.sdk.common.controller.c.b.a();
        }
        return Integer.parseInt(str);
    }

    public static final String b(h hVar) {
        String secUid;
        String secSender;
        if (hVar != null && hVar.isSingleChat()) {
            String valueOf = String.valueOf(a(hVar));
            if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().equals(valueOf)) {
                return com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.c();
            }
            User d2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.d();
            if (!(d2 == null || (secUid = d2.getSecUid()) == null)) {
                List<ah> singleChatMembers = hVar.getSingleChatMembers();
                if (singleChatMembers != null) {
                    for (T t : singleChatMembers) {
                        l.b(t, "");
                        String secUid2 = t.getSecUid();
                        if (!(secUid2 == null || secUid2.length() == 0 || !(!l.a((Object) t.getSecUid(), (Object) secUid)))) {
                            return t.getSecUid();
                        }
                        h.a(valueOf, t.getSecUid());
                    }
                }
                ai lastMessage = hVar.getLastMessage();
                if (!(lastMessage == null || !(!lastMessage.isSelf()) || (secSender = lastMessage.getSecSender()) == null || secSender.length() == 0)) {
                    return lastMessage.getSecSender();
                }
            }
        }
        return null;
    }
}
