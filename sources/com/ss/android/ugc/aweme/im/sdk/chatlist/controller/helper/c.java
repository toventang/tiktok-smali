package com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.google.gson.f;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.j;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ag;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final f f101904a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f101905b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final c f101906c = new c();

    private c() {
    }

    public static boolean a(h hVar) {
        ai lastMessage;
        if (hVar == null || (lastMessage = hVar.getLastMessage()) == null) {
            return false;
        }
        if (b(hVar) > lastMessage.getCreatedAt()) {
            return true;
        }
        return false;
    }

    public static void b() {
        f101905b.a();
    }

    public static boolean c() {
        return f101905b.b();
    }

    static {
        Covode.recordClassIndex(65206);
        GsonProvider c2 = GsonHolder.c();
        l.b(c2, "");
        f101904a = c2.b();
    }

    public static boolean a() {
        Integer mark_read;
        Long l2;
        List<h> a2 = a.C0745a.a().a();
        ArrayList arrayList = new ArrayList();
        for (T t : a2) {
            if (com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.c.b(t)) {
                arrayList.add(t);
            }
        }
        ArrayList<h> arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            for (h hVar : arrayList2) {
                com.ss.android.ugc.aweme.im.sdk.chatlist.b.a c2 = c(hVar);
                if (!(c2 == null || (mark_read = c2.getMark_read()) == null || mark_read.intValue() != 0)) {
                    StringBuilder append = new StringBuilder("timestamp: ").append(c2.getCreate_at()).append(" needShowNoticeDot : ").append(hVar.getConversationId()).append(" has unread like in message uuid ").append(c2.getMessage_id()).append(" and message id ");
                    ai message = c2.getMessage();
                    if (message != null) {
                        l2 = Long.valueOf(message.getMsgId());
                    } else {
                        l2 = null;
                    }
                    com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", append.append(l2).toString());
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(IMUser iMUser) {
        if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
            return true;
        }
        return false;
    }

    public static long b(h hVar) {
        Long create_at;
        long j2 = 0;
        if (hVar == null) {
            return 0;
        }
        com.ss.android.ugc.aweme.im.sdk.chatlist.b.a c2 = c(hVar);
        if (!(c2 == null || (create_at = c2.getCreate_at()) == null)) {
            j2 = create_at.longValue();
        }
        return j2 * 1000;
    }

    public static boolean d(h hVar) {
        Integer mark_read;
        com.ss.android.ugc.aweme.im.sdk.chatlist.b.a c2 = c(hVar);
        if (c2 == null || (mark_read = c2.getMark_read()) == null || mark_read.intValue() != 0) {
            return false;
        }
        return true;
    }

    public static String a(List<ai> list) {
        if (list == null) {
            return null;
        }
        for (T t : list) {
            if (!(t.isSelf() || com.ss.android.ugc.aweme.im.sdk.chat.ui.a.a.a.v.contains(b.f.a((ai) t)))) {
                return t.getUuid();
            }
        }
        return null;
    }

    public static com.ss.android.ugc.aweme.im.sdk.chatlist.b.a c(h hVar) {
        Map<String, String> localExt;
        String str;
        com.ss.android.ugc.aweme.im.sdk.chatlist.b.a aVar = null;
        if (hVar == null || (localExt = hVar.getLocalExt()) == null || (str = localExt.get("a:s_latest_message_property")) == null) {
            return null;
        }
        try {
            aVar = (com.ss.android.ugc.aweme.im.sdk.chatlist.b.a) f101904a.a(str, com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.class);
            return aVar;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            return aVar;
        }
    }

    public static IMUser a(com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar) {
        IMUser iMUser;
        String conversationId;
        if (aVar != null) {
            iMUser = aVar.getSingleChatFromUser();
        } else {
            iMUser = null;
        }
        try {
            if (!(!a(iMUser) || aVar == null || (conversationId = aVar.getConversationId()) == null)) {
                long c2 = b.a.c(conversationId);
                com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "check-ing->uidFromConversationId");
                if (c2 != -1) {
                    IMUser a2 = g.a(String.valueOf(c2), com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.a(conversationId));
                    if (!a(a2)) {
                        com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "Success->checkImUserInvalidForDmLike");
                        aVar.setFromUser(a2);
                        return a2;
                    }
                    com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "Failed->checkImUserInvalidForDmLike not right");
                } else {
                    com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "Failed->uidFromConversationId not right");
                }
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
        }
        return iMUser;
    }

    public static void e(h hVar) {
        com.ss.android.ugc.aweme.im.sdk.chatlist.b.a c2;
        if (hVar != null && (c2 = c(hVar)) != null) {
            Integer mark_read = c2.getMark_read();
            if (mark_read == null || mark_read.intValue() != 1) {
                c2.setMark_read(1);
                Map<String, String> localExt = hVar.getLocalExt();
                if (localExt != null) {
                    localExt.put("a:s_latest_message_property", f101904a.b(c2));
                    hVar.setLocalExt(localExt);
                    String conversationId = hVar.getConversationId();
                    com.ss.android.ugc.aweme.im.service.m.a.b("DmHelper", "markLastPropertyRead :".concat(String.valueOf(conversationId)));
                    l.b(conversationId, "");
                    b.a.a(conversationId).b(localExt, (com.bytedance.im.core.a.a.b<h>) null);
                }
            }
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            j.f102261b.b(str);
            d.f().b();
            ag.a(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.im.sdk.notification.a.k a(com.ss.android.ugc.aweme.im.sdk.notification.a.i r25) {
        /*
        // Method dump skipped, instructions count: 339
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a(com.ss.android.ugc.aweme.im.sdk.notification.a.i):com.ss.android.ugc.aweme.im.sdk.notification.a.k");
    }

    public static String a(com.ss.android.ugc.aweme.im.service.k.a aVar, h hVar) {
        if (aVar.c() == 20 || aVar.c() == 0) {
            return f101905b.a(hVar);
        }
        return null;
    }

    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            j.f102261b.b(str);
            d.f().b();
            ag.b(str, str2);
        }
    }
}
