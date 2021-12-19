package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.ParticipantMinIndex;
import java.util.List;

public final class q extends w<List<ParticipantMinIndex>> {
    static {
        Covode.recordClassIndex(23035);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public q() {
        super(IMCMD.GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3.getValue());
    }

    public q(b<List<ParticipantMinIndex>> bVar) {
        super(IMCMD.GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar == null || kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.participants_min_index_body == null) {
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
            a(kVar.f38725f.body.participants_min_index_body.indexes);
        } else {
            b(kVar);
        }
        e.a(kVar, z).a("conversation_id", conversationId).a("conversation_type", Integer.valueOf(hVar.getConversationType())).a();
    }
}
