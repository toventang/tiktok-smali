package com.ss.android.ugc.aweme.im.sdk.chat.b.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.g;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public abstract class i extends Enum<i> {
    public static final i PROPERTY_CHANGE;
    public static final i REAL_MESSAGE;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ i[] f100216a;

    static {
        Covode.recordClassIndex(63878);
        b bVar = new b("REAL_MESSAGE");
        REAL_MESSAGE = bVar;
        a aVar = new a("PROPERTY_CHANGE");
        PROPERTY_CHANGE = aVar;
        f100216a = new i[]{bVar, aVar};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f100216a.clone();
    }

    public void beforeReport(ai aiVar) {
        l.d(aiVar, "");
    }

    public boolean keepEnterFrom(ai aiVar) {
        l.d(aiVar, "");
        return false;
    }

    public Map<String, String> makeExtraParam(ai aiVar, BaseContent baseContent) {
        l.d(aiVar, "");
        return null;
    }

    public boolean shouldReport(String str) {
        l.d(str, "");
        return true;
    }

    public abstract String transformMessageType(String str);

    static final class a extends i {
        static {
            Covode.recordClassIndex(63879);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.c.i
        public final void beforeReport(ai aiVar) {
            l.d(aiVar, "");
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.c.i
        public final String transformMessageType(String str) {
            return "fast_emoji";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(String str) {
            super(str, 1, null);
        }
    }

    static final class b extends i {
        static {
            Covode.recordClassIndex(63880);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.c.i
        public final boolean shouldReport(String str) {
            l.d(str, "");
            return true;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.c.i
        public final String transformMessageType(String str) {
            return str;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(String str) {
            super(str, 0, null);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.c.i
        public final Map<String, String> makeExtraParam(ai aiVar, BaseContent baseContent) {
            String str;
            IMUser a2;
            Map<String, String> eventParam;
            l.d(aiVar, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (aiVar.getLocalExt() == null || !aiVar.getLocalExt().containsKey("key_resend")) {
                str = "0";
            } else {
                str = "1";
            }
            linkedHashMap.put("is_resend", str);
            String str2 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102188b;
            if (TextUtils.isEmpty(str2) && aiVar.getLocalExt() != null) {
                str2 = aiVar.getLocalExt().get("process_id");
            }
            if (str2 != null) {
                linkedHashMap.put("process_id", str2);
            }
            if (!(baseContent == null || (eventParam = baseContent.eventParam()) == null)) {
                linkedHashMap.putAll(eventParam);
            }
            long c2 = b.a.c(aiVar.getConversationId());
            if (aiVar.getConversationType() == e.a.f37581a && (a2 = g.a(String.valueOf(c2), c.a(aiVar.getConversationId()))) != null) {
                linkedHashMap.put("relation_tag", String.valueOf(a2.getFollowStatus()));
            }
            return linkedHashMap;
        }
    }

    private i(String str, int i2) {
    }

    public /* synthetic */ i(String str, int i2, h.f.b.g gVar) {
        this(str, i2);
    }

    public final Map<String, String> makeParams(ai aiVar, BaseContent baseContent, String str, String str2) {
        String str3;
        String str4 = "";
        l.d(aiVar, str4);
        l.d(str2, str4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aiVar.getConversationType() == e.a.f37582b) {
            str3 = "group";
        } else {
            str3 = "private";
        }
        linkedHashMap.put("chat_type", str3);
        linkedHashMap.put("conversation_id", aiVar.getConversationId());
        linkedHashMap.put("is_master", String.valueOf(com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a(aiVar)));
        String str5 = aiVar.getLocalExt().get("enter_from");
        String str6 = aiVar.getLocalExt().get("message_type");
        if (!TextUtils.equals(str5, "live") && !TextUtils.equals(str6, "ttFarm")) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a();
            str5 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a("enter_from", aiVar.getLocalExt().get("enter_from"));
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a();
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("enter_from", str5);
        }
        linkedHashMap.put("enter_from", str5);
        linkedHashMap.put("send_method", t.a(baseContent));
        if (!TextUtils.equals(str2, "long_press")) {
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a();
            str2 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a("enter_method", aiVar.getLocalExt().get("enter_method"));
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a();
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("enter_method", str2);
        }
        linkedHashMap.put("enter_method", str2);
        linkedHashMap.put("relation_tag", com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a("relation_tag", "-1"));
        String transformMessageType = transformMessageType(str);
        if (transformMessageType != null && !TextUtils.isEmpty(transformMessageType)) {
            linkedHashMap.put("message_type", transformMessageType);
        }
        long c2 = b.a.c(aiVar.getConversationId());
        if (c2 > 0) {
            linkedHashMap.put("to_user_id", String.valueOf(c2));
            com.ss.android.ugc.aweme.im.sdk.common.data.service.b familiarService = IMServiceProvider.INSTANCE.getFamiliarService();
            String valueOf = String.valueOf(c2);
            l.b(valueOf, str4);
            String a2 = familiarService.a(valueOf, c.a(aiVar.getConversationId()), null);
            if (a2 != null) {
                linkedHashMap.put("rec_type", a2);
            }
            IMUser b2 = g.b(String.valueOf(c2), c.a(aiVar.getConversationId()));
            if (b2 != null && b2.getFriendRecType() == 1) {
                str4 = "share_link_match";
            }
            linkedHashMap.put("rec_reason", str4);
        }
        Map<String, String> makeExtraParam = makeExtraParam(aiVar, baseContent);
        if (makeExtraParam != null) {
            linkedHashMap.putAll(makeExtraParam);
        }
        return linkedHashMap;
    }
}
