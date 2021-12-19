package com.bytedance.im.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.proto.AckConversationApplyRequestBody;
import com.bytedance.im.core.proto.AckConversationApplyResponseBody;
import com.bytedance.im.core.proto.ApplyErrorCode;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.im.core.proto.IMCMD;

public final class a extends w<ConversationApplyInfo> {
    static {
        Covode.recordClassIndex(22592);
        AckConversationApplyRequestBody.registerAdapter();
        AckConversationApplyResponseBody.registerAdapter();
    }

    public a() {
        super(IMCMD.ACK_CONVERSATION_APPLY.getValue());
    }

    public a(b<ConversationApplyInfo> bVar) {
        super(IMCMD.ACK_CONVERSATION_APPLY.getValue(), bVar);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.getExtension(2025) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            f.b("imsdk", "ACKConversationApplyHandler Failed, code = " + kVar.f38728i + " &status = " + kVar.b() + " &checkCode = " + kVar.d() + " &checkMsg = " + kVar.e() + " &logId = " + kVar.f(), (Throwable) null);
            e.a(kVar, false).a();
            b(kVar);
            return;
        }
        AckConversationApplyResponseBody ackConversationApplyResponseBody = (AckConversationApplyResponseBody) kVar.f38725f.body.getExtension(2025);
        f.a("imsdk", "ACKConversationApplyHandler Success, response_status = " + ackConversationApplyResponseBody.status, (Throwable) null);
        if (ackConversationApplyResponseBody.status.intValue() == ApplyErrorCode.APPLY_SUCCESS.getValue()) {
            a(ackConversationApplyResponseBody.apply_info);
            return;
        }
        if (ackConversationApplyResponseBody.apply_info != null) {
            kVar.s = h.f38770a.b(ackConversationApplyResponseBody.apply_info);
        }
        b(kVar);
    }
}
