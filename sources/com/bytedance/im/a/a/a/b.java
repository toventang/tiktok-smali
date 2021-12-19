package com.bytedance.im.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.a.a.b.a;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.BatchGetConversationAuditUnreadRequestBody;
import com.bytedance.im.core.proto.BatchGetConversationAuditUnreadResponseBody;
import com.bytedance.im.core.proto.IMCMD;

public final class b extends w<a> {
    static {
        Covode.recordClassIndex(22593);
        BatchGetConversationAuditUnreadRequestBody.registerAdapter();
        BatchGetConversationAuditUnreadResponseBody.registerAdapter();
    }

    public b() {
        super(IMCMD.BATCH_GET_CONVERSATION_AUDIT_UNREAD.getValue());
    }

    public b(com.bytedance.im.core.a.a.b<a> bVar) {
        super(IMCMD.BATCH_GET_CONVERSATION_AUDIT_UNREAD.getValue(), bVar);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.getExtension(2042) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            f.b("imsdk", "GetConversationAuditUnReadHandler Failed, code = " + kVar.f38728i + " &status = " + kVar.b() + " &checkCode = " + kVar.d() + " &checkMsg = " + kVar.e() + " &logId = " + kVar.f(), (Throwable) null);
            e.a(kVar, false).a();
            b(kVar);
            return;
        }
        a(new a(((BatchGetConversationAuditUnreadResponseBody) kVar.f38725f.body.getExtension(2042)).unread_count));
    }
}
