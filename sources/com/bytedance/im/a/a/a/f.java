package com.bytedance.im.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody;
import com.bytedance.im.core.proto.UpdateConversationAuditSwitchResponseBody;

public final class f extends w<Boolean> {
    static {
        Covode.recordClassIndex(22597);
        UpdateConversationAuditSwitchRequestBody.registerAdapter();
        UpdateConversationAuditSwitchResponseBody.registerAdapter();
    }

    public f() {
        super(IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH.getValue());
    }

    public f(b<Boolean> bVar) {
        super(IMCMD.UPDATE_CONVERSATION_AUDIT_SWITCH.getValue(), bVar);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.getExtension(2023) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            com.bytedance.im.core.c.f.b("imsdk", "UpdateConversationAuditSwitchHandler Failed, code = " + kVar.f38728i + " &status = " + kVar.b() + " &checkCode = " + kVar.d() + " &checkMsg = " + kVar.e() + " &logId = " + kVar.f(), (Throwable) null);
            e.a(kVar, false).a();
            b(kVar);
            return;
        }
        UpdateConversationAuditSwitchResponseBody updateConversationAuditSwitchResponseBody = (UpdateConversationAuditSwitchResponseBody) kVar.f38725f.body.getExtension(2023);
        com.bytedance.im.core.c.f.a("imsdk", "UpdateConversationAuditSwitchHandler Success, switch_status = " + updateConversationAuditSwitchResponseBody.switch_status, (Throwable) null);
        a(updateConversationAuditSwitchResponseBody.switch_status);
    }
}
