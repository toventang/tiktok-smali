package com.bytedance.im.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.GetConversationAuditSwitchRequestBody;
import com.bytedance.im.core.proto.GetConversationAuditSwitchResponseBody;
import com.bytedance.im.core.proto.IMCMD;

public final class e extends w<Boolean> {
    static {
        Covode.recordClassIndex(22596);
        GetConversationAuditSwitchRequestBody.registerAdapter();
        GetConversationAuditSwitchResponseBody.registerAdapter();
    }

    public e() {
        super(IMCMD.GET_CONVERSATION_AUDIT_SWITCH.getValue());
    }

    public e(b<Boolean> bVar) {
        super(IMCMD.GET_CONVERSATION_AUDIT_SWITCH.getValue(), bVar);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.getExtension(2022) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            f.b("imsdk", "GetConversationAuditSwitchHandler Failed, code = " + kVar.f38728i + " &status = " + kVar.b() + " &checkCode = " + kVar.d() + " &checkMsg = " + kVar.e() + " &logId = " + kVar.f(), (Throwable) null);
            com.bytedance.im.core.c.e.a(kVar, false).a();
            b(kVar);
            return;
        }
        GetConversationAuditSwitchResponseBody getConversationAuditSwitchResponseBody = (GetConversationAuditSwitchResponseBody) kVar.f38725f.body.getExtension(2022);
        f.a("imsdk", "GetConversationAuditSwitchHandler Success, switch_status = " + getConversationAuditSwitchResponseBody.switch_status, (Throwable) null);
        a(getConversationAuditSwitchResponseBody.switch_status);
    }
}
