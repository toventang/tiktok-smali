package com.ss.android.ugc.aweme.im.sdk.relations.data.core.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.relations.data.b.c;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;

public final class b extends a<IMContact> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f103073b = new a((byte) 0);

    static {
        Covode.recordClassIndex(66082);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66083);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(c cVar) {
            l.d(cVar, "");
            return new b(cVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    public final boolean a(IMContact iMContact) {
        l.d(iMContact, "");
        if (!this.f103072a.a() && !this.f103072a.f102984e) {
            return true;
        }
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            if (iMUser.getShareStatus() == 2) {
                com.ss.android.ugc.aweme.im.service.m.a.a("CannotMessageFilter", "user has been filter " + iMUser.getUid() + " shareStatus:" + iMUser.getShareStatus());
                return false;
            }
        }
        if (!(iMContact instanceof IMConversation) || ((IMConversation) iMContact).getConversationMemberCount() != 0) {
            return true;
        }
        return false;
    }
}
