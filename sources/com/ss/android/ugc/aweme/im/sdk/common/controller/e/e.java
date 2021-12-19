package com.ss.android.ugc.aweme.im.sdk.common.controller.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.i;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.group.a.e;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import h.f.a.a;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f102239a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(65415);
    }

    public static final IMContact a(h hVar) {
        l.d(hVar, "");
        if (hVar.getConversationType() != e.a.f37581a) {
            return b(hVar);
        }
        long c2 = b.a.c(hVar.getConversationId());
        return g.a(String.valueOf(c2), c.b(hVar));
    }

    public static final String a(IMContact iMContact) {
        l.d(iMContact, "");
        if (iMContact instanceof IMConversation) {
            return ((IMConversation) iMContact).getConversationId();
        }
        if (!(iMContact instanceof IMUser)) {
            return null;
        }
        String uid = ((IMUser) iMContact).getUid();
        l.b(uid, "");
        return b.a.a(Long.parseLong(uid));
    }

    public static final IMConversation b(h hVar) {
        l.d(hVar, "");
        IMConversation iMConversation = new IMConversation();
        iMConversation.setConversationType(hVar.getConversationType());
        iMConversation.setConversationId(hVar.getConversationId());
        iMConversation.setConversationMemberCount(hVar.getMemberCount());
        i coreInfo = hVar.getCoreInfo();
        if (coreInfo != null) {
            iMConversation.setConversationName(coreInfo.getName());
        }
        e.a.a();
        iMConversation.setConversationAvatar(com.ss.android.ugc.aweme.im.sdk.group.a.e.b(hVar));
        iMConversation.setInitialLetter(com.ss.android.ugc.aweme.im.sdk.relations.b.b.a(iMConversation.getDisplayName()));
        return iMConversation;
    }

    public static final List<String> a(IMContact[] iMContactArr) {
        l.d(iMContactArr, "");
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : iMContactArr) {
            if (iMContact instanceof IMConversation) {
                arrayList.add(((IMConversation) iMContact).getConversationId());
            } else if (iMContact instanceof IMUser) {
                String uid = ((IMUser) iMContact).getUid();
                l.b(uid, "");
                arrayList.add(b.a.a(Long.parseLong(uid)));
            }
        }
        return arrayList;
    }

    public static final void a(Context context, IMContact iMContact, a<z> aVar) {
        l.d(context, "");
        l.d(iMContact, "");
        l.d(aVar, "");
        l.d(context, "");
        l.d(iMContact, "");
        l.d(aVar, "");
        if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation.getConversationType() == e.a.f37582b) {
                ChatRoomActivity.a.a(a.b.a(context, 3, iMConversation.getConversationId()).a(6).b("share_toast").c("").f103883a);
                return;
            }
        }
        aVar.invoke();
    }
}
