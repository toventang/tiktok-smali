package com.bytedance.im.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.a.a.b.c;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.GetConversationAuditListRequestBody;
import com.bytedance.im.core.proto.GetConversationAuditListResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.RequestBody;

public final class d extends w<c> {
    static {
        Covode.recordClassIndex(22595);
        GetConversationAuditListRequestBody.registerAdapter();
        GetConversationAuditListResponseBody.registerAdapter();
    }

    public d() {
        super(IMCMD.GET_CONVERSATION_AUDIT_LIST.getValue());
    }

    public d(b<c> bVar) {
        super(IMCMD.GET_CONVERSATION_AUDIT_LIST.getValue(), bVar);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.getExtension(2027) == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        int i2 = 0;
        if (!kVar.l() || !a(kVar)) {
            f.b("imsdk", "GetConversationAuditListHandler Failed, code = " + kVar.f38728i + " &status = " + kVar.b() + " &checkCode = " + kVar.d() + " &checkMsg = " + kVar.e() + " &logId = " + kVar.f(), (Throwable) null);
            e.a(kVar, false).a();
            b(kVar);
            return;
        }
        GetConversationAuditListResponseBody getConversationAuditListResponseBody = (GetConversationAuditListResponseBody) kVar.f38725f.body.getExtension(2027);
        StringBuilder append = new StringBuilder("GetConversationAuditListHandler Success, next_cursor = ").append(getConversationAuditListResponseBody.apply_info_list).append(" &list_size = ");
        if (getConversationAuditListResponseBody.apply_info_list != null) {
            i2 = getConversationAuditListResponseBody.apply_info_list.size();
        }
        f.a("imsdk", append.append(i2).toString(), (Throwable) null);
        a(new c(getConversationAuditListResponseBody.next_cursor.longValue(), getConversationAuditListResponseBody.apply_info_list, getConversationAuditListResponseBody.has_more.booleanValue()));
    }

    public final void a(long j2, long j3, boolean z) {
        f.a("imsdk", "GetConversationAuditListHandler, request cursor = " + j2 + " &limit = 20 &no_clear_unread" + z, (Throwable) null);
        a(0, new RequestBody.Builder().addExtension(2027, GetConversationAuditListRequestBody.ADAPTER, new GetConversationAuditListRequestBody.Builder().cursor(Long.valueOf(j2)).limit(20).conv_short_id(Long.valueOf(j3)).no_clear_unread(Boolean.valueOf(z)).build()).build(), null, new Object[0]);
    }
}
