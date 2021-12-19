package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import java.util.List;

public final class r extends w<List<ParticipantReadIndex>> {
    static {
        Covode.recordClassIndex(23036);
    }

    public r() {
        super(IMCMD.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue());
    }

    public r(b<List<ParticipantReadIndex>> bVar) {
        super(IMCMD.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar == null || kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.participants_read_index_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        boolean z;
        if (!kVar.l() || !a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        h hVar = (h) kVar.f38723d[0];
        String conversationId = hVar.getConversationId();
        if (z) {
            a(kVar.f38725f.body.participants_read_index_body.indexes);
        } else {
            b(kVar);
        }
        e.a(kVar, z).a("conversation_id", conversationId).a("conversation_type", Integer.valueOf(hVar.getConversationType())).a();
    }
}
