package com.bytedance.im.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.ClearConversationAuditUnreadRequestBody;
import com.bytedance.im.core.proto.ClearConversationAuditUnreadResponseBody;
import com.bytedance.im.core.proto.IMCMD;

public final class c extends w<String> {
    static {
        Covode.recordClassIndex(22594);
        ClearConversationAuditUnreadRequestBody.registerAdapter();
        ClearConversationAuditUnreadResponseBody.registerAdapter();
    }

    public c() {
        super(IMCMD.CLEAR_CONVERSATION_AUDIT_UNREAD.getValue());
    }

    public c(b<String> bVar) {
        super(IMCMD.CLEAR_CONVERSATION_AUDIT_UNREAD.getValue(), bVar);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.getExtension(2029) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            b(kVar);
        } else {
            a("Success");
        }
    }
}
