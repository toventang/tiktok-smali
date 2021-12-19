package com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.g;
import com.ss.android.ugc.aweme.im.service.c.b;
import com.ss.android.ugc.aweme.im.service.k.d;
import com.ss.android.ugc.aweme.im.service.m.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f101895a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(65195);
    }

    public static boolean b(h hVar) {
        if (hVar == null) {
            a.c("SessionConverter", "conversation convert fail cause null");
            return false;
        } else if (hVar.getLastMessage() != null) {
            return true;
        } else {
            a.c("SessionConverter", "conversation convertToChat fail cause lastMessage is null! conv id is " + hVar.getConversationId() + " is single chat " + hVar.isSingleChat() + " last message property: " + com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.c(hVar));
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.ss.android.ugc.aweme.im.service.k.a a(com.bytedance.im.core.d.h r12) {
        /*
        // Method dump skipped, instructions count: 507
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.c.a(com.bytedance.im.core.d.h):com.ss.android.ugc.aweme.im.service.k.a");
    }

    private static d a(com.ss.android.ugc.aweme.im.service.k.a aVar, h hVar) {
        boolean z;
        d a2;
        boolean z2 = true;
        if (aVar.q > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = aVar.r;
        a.c("SessionConverter", "im session unread number " + aVar.q + " isMute: " + hVar.isMute() + " isStranger: " + hVar.isStranger() + "has unread likes " + z3);
        if (!z && !z3) {
            return null;
        }
        int a3 = g.a();
        if (z || !z3) {
            z2 = false;
        }
        if (hVar.isStranger()) {
            a2 = d.b(z2, a3);
        } else if (hVar.isMute()) {
            a2 = d.a(a3);
        } else {
            a2 = d.a(z2, a3);
        }
        a.c("SessionConverter", "im session unread view strategy " + a3 + " and state " + a2 + "session id " + aVar.bF_());
        return a2;
    }

    private static String a(BaseContent baseContent, ai aiVar) {
        int i2;
        IMUser b2;
        String refmsg_uid;
        String str = null;
        String wrapMsgHint = baseContent.wrapMsgHint(!aiVar.isSelf(), false, null);
        if (wrapMsgHint == null) {
            a.d("SessionConverter", "wrapMsgHint is null for conv " + aiVar.getConversationId());
            wrapMsgHint = "";
        }
        if (aiVar.getConversationType() != e.a.f37582b) {
            return wrapMsgHint;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (b.a()) {
            i2 = com.ss.android.ugc.aweme.im.sdk.group.b.a.a.a(aiVar.getConversationShortId());
            if (i2 > 0) {
                str2 = "[" + com.bytedance.ies.ugc.appcontext.d.a().getResources().getQuantityString(R.plurals.cw, i2) + "] ";
                sb.append(str2);
            }
        } else {
            i2 = 0;
        }
        if (!aiVar.isSelf() && !com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.c.a(aiVar) && (b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.b(null, aiVar.getSecSender())) != null) {
            if (aiVar.getReferenceInfo() != null) {
                ReferenceInfo referenceInfo = aiVar.getReferenceInfo();
                l.b(referenceInfo, "");
                ReferenceInfoHint a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.c.a(referenceInfo);
                if (!(a2 == null || (refmsg_uid = a2.getRefmsg_uid()) == null)) {
                    User d2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.d();
                    if (d2 != null) {
                        str = d2.getUid();
                    }
                    if (l.a((Object) refmsg_uid, (Object) str)) {
                        sb.append(com.bytedance.ies.ugc.appcontext.d.a().getResources().getString(R.string.b_3, b2.getNickName(), ""));
                    }
                }
            }
            sb.append(b2.getNickName()).append(": ");
        }
        sb.append(wrapMsgHint);
        String sb2 = sb.toString();
        l.b(sb2, "");
        if (sb2.length() > 300) {
            Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
            sb2 = sb2.substring(0, 300);
            l.b(sb2, "");
        }
        SpannableString spannableString = new SpannableString(sb2);
        if (i2 > 0) {
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.d.a(), R.color.bh)), 0, str2.length(), 33);
        }
        return spannableString.toString();
    }

    public static String a(BaseContent baseContent, ai aiVar, boolean z) {
        String str;
        l.d(aiVar, "");
        if (baseContent == null) {
            return "";
        }
        IMUser a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(String.valueOf(aiVar.getSender()), aiVar.getSecSender());
        if (a2 != null) {
            str = a2.getDisplayName();
        } else {
            str = "";
        }
        String wrapMsgHint = baseContent.wrapMsgHint(!aiVar.isSelf(), z, str);
        if (wrapMsgHint == null) {
            return "";
        }
        return wrapMsgHint;
    }
}
