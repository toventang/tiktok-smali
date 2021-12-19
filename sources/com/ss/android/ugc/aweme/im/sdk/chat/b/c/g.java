package com.ss.android.ugc.aweme.im.sdk.chat.b.c;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.i;
import com.google.gson.o;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.c;
import com.ss.android.ugc.aweme.im.sdk.common.controller.b.b;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.a.n;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f100200a = new g();

    private g() {
    }

    public static void a(a aVar, Activity activity, String str) {
        l.d(aVar, "");
        l.d(activity, "");
        l.d(str, "");
        String str2 = aVar.f100203c;
        c.a(str2);
        c.a(str2, Integer.valueOf(aVar.f100208h));
        ai aiVar = aVar.f100206f;
        if (aiVar != null) {
            c.a(str2, n.a(aiVar));
        }
        a(activity, aVar, str);
        b.c(aVar.f100203c, aVar.f100208h == 3 ? "group_chat" : "private");
    }

    static {
        Covode.recordClassIndex(63872);
    }

    public static long a() {
        String obj = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().toString();
        long currentTimeMillis = System.currentTimeMillis();
        if (l.a((Object) obj, (Object) "-1")) {
            return currentTimeMillis;
        }
        String str = obj + currentTimeMillis;
        long j2 = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            j2 = ((j2 * 10) + ((long) (str.charAt(i2) - '0'))) % Long.MAX_VALUE;
        }
        return Math.abs(j2);
    }

    public static String a(IMUser iMUser) {
        String str;
        if (iMUser == null) {
            return "";
        }
        String uniqueId = iMUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            str = iMUser.getShortId();
            if (str == null) {
                str = "";
            }
        } else {
            str = iMUser.getUniqueId();
            if (str == null) {
                return "";
            }
        }
        return str;
    }

    public static a a(String str) {
        String str2;
        i coreInfo;
        l.d(str, "");
        String valueOf = String.valueOf(a());
        h a2 = a.C0745a.a().a(str);
        if (a2 == null || (coreInfo = a2.getCoreInfo()) == null) {
            str2 = null;
        } else {
            str2 = coreInfo.getName();
        }
        return new a(valueOf, "", str, (String) null, (Boolean) null, "im_group_chat", 3, str2, 56);
    }

    public static a a(ai aiVar) {
        String uid;
        boolean z;
        int i2;
        String str;
        l.d(aiVar, "");
        String conversationId = aiVar.getConversationId();
        String valueOf = String.valueOf(aiVar.getConversationShortId());
        IMUser b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.b(String.valueOf(aiVar.getSender()), aiVar.getSecSender());
        String str2 = null;
        if (b2 == null || (uid = b2.getUid()) == null) {
            return null;
        }
        boolean isBlock = b2.isBlock();
        h a2 = a.C0745a.a().a(conversationId);
        if (a2 == null) {
            return null;
        }
        if (aiVar.getConversationType() == e.a.f37582b) {
            z = true;
            i2 = 3;
        } else {
            z = false;
            if (a2.isStranger()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        }
        if (z) {
            valueOf = String.valueOf(a());
        }
        l.b(conversationId, "");
        i coreInfo = a2.getCoreInfo();
        if (coreInfo != null) {
            str2 = coreInfo.getName();
        }
        String a3 = a(b2);
        Boolean valueOf2 = Boolean.valueOf(isBlock);
        if (z) {
            str = "im_group_chat";
        } else {
            str = "im";
        }
        return new a(valueOf, uid, conversationId, a3, valueOf2, aiVar, str, i2, str2);
    }

    public static a a(com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar) {
        String uid;
        l.d(aVar, "");
        String conversationId = aVar.getConversationId();
        IMUser singleChatFromUser = aVar.getSingleChatFromUser();
        String str = null;
        if (singleChatFromUser == null || (uid = singleChatFromUser.getUid()) == null) {
            return null;
        }
        boolean isBlock = singleChatFromUser.isBlock();
        h a2 = a.C0745a.a().a(conversationId);
        if (a2 == null) {
            return null;
        }
        long conversationShortId = a2.getConversationShortId();
        if (conversationId.length() == 0 || conversationShortId <= 0) {
            return null;
        }
        int chatType = aVar.getChatType();
        String valueOf = String.valueOf(conversationShortId);
        i coreInfo = a2.getCoreInfo();
        if (coreInfo != null) {
            str = coreInfo.getName();
        }
        return new a(valueOf, uid, conversationId, a(singleChatFromUser), Boolean.valueOf(isBlock), "im", chatType, str, 32);
    }

    private static String a(a aVar) {
        o oVar = new o();
        oVar.a("conversation_id", aVar.f100203c);
        String str = aVar.f100204d;
        if (str != null) {
            oVar.a("unique_id", str);
        }
        Boolean bool = aVar.f100205e;
        if (bool != null) {
            oVar.a("is_blocked", Boolean.valueOf(bool.booleanValue()));
        }
        ai aiVar = aVar.f100206f;
        if (aiVar != null) {
            oVar.a("msg_list", String.valueOf(aiVar.getMsgId()));
        }
        return j.a(oVar);
    }

    private static void a(Activity activity, a aVar, String str) {
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("owner_id", aVar.f100202b).appendQueryParameter("report_type", aVar.f100207g).appendQueryParameter("object_id", aVar.f100201a).appendQueryParameter("entrance", str);
        if (aVar.f100208h == 3) {
            appendQueryParameter.appendQueryParameter("con_short_id", aVar.f100203c);
            appendQueryParameter.appendQueryParameter("conversation_name", aVar.f100209i);
        }
        appendQueryParameter.appendQueryParameter("extra", a(aVar));
        com.ss.android.ugc.aweme.compliance.api.a.a().a(activity, appendQueryParameter);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f100201a;

        /* renamed from: b  reason: collision with root package name */
        public final String f100202b;

        /* renamed from: c  reason: collision with root package name */
        public final String f100203c;

        /* renamed from: d  reason: collision with root package name */
        public final String f100204d;

        /* renamed from: e  reason: collision with root package name */
        public final Boolean f100205e;

        /* renamed from: f  reason: collision with root package name */
        public final ai f100206f;

        /* renamed from: g  reason: collision with root package name */
        public final String f100207g;

        /* renamed from: h  reason: collision with root package name */
        public final int f100208h;

        /* renamed from: i  reason: collision with root package name */
        public final String f100209i;

        static {
            Covode.recordClassIndex(63873);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f100201a, aVar.f100201a) && l.a(this.f100202b, aVar.f100202b) && l.a(this.f100203c, aVar.f100203c) && l.a(this.f100204d, aVar.f100204d) && l.a(this.f100205e, aVar.f100205e) && l.a(this.f100206f, aVar.f100206f) && l.a(this.f100207g, aVar.f100207g) && this.f100208h == aVar.f100208h && l.a(this.f100209i, aVar.f100209i);
        }

        public final int hashCode() {
            String str = this.f100201a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f100202b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f100203c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f100204d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.f100205e;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            ai aiVar = this.f100206f;
            int hashCode6 = (hashCode5 + (aiVar != null ? aiVar.hashCode() : 0)) * 31;
            String str5 = this.f100207g;
            int hashCode7 = (((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f100208h) * 31;
            String str6 = this.f100209i;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            return hashCode7 + i2;
        }

        public final String toString() {
            return "ReportParams(objectId=" + this.f100201a + ", ownerId=" + this.f100202b + ", conversationId=" + this.f100203c + ", uniqueId=" + this.f100204d + ", isBlocked=" + this.f100205e + ", msg=" + this.f100206f + ", reportType=" + this.f100207g + ", chatType=" + this.f100208h + ", conversationName=" + this.f100209i + ")";
        }

        public a(String str, String str2, String str3, String str4, Boolean bool, ai aiVar, String str5, int i2, String str6) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str5, "");
            this.f100201a = str;
            this.f100202b = str2;
            this.f100203c = str3;
            this.f100204d = str4;
            this.f100205e = bool;
            this.f100206f = aiVar;
            this.f100207g = str5;
            this.f100208h = i2;
            this.f100209i = str6;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(String str, String str2, String str3, String str4, Boolean bool, String str5, int i2, String str6, int i3) {
            this(str, str2, str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : bool, (ai) null, str5, i2, (i3 & 256) == 0 ? str6 : null);
        }
    }
}
