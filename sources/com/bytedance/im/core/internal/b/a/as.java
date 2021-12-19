package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.p;
import com.bytedance.im.core.d.r;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.f;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.ConversationOperationStatus;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.Participant;
import java.util.Collections;
import java.util.List;

public final class as extends w<ah> {
    static {
        Covode.recordClassIndex(22979);
    }

    as() {
        super(IMCMD.UPDATE_CONVERSATION_PARTICIPANT.getValue());
    }

    public as(b<ah> bVar) {
        super(IMCMD.UPDATE_CONVERSATION_PARTICIPANT.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.update_conversation_participant_body == null || kVar.f38725f.body.update_conversation_participant_body.status == null || kVar.f38725f.body.update_conversation_participant_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || kVar.f38725f.body.update_conversation_participant_body.participant == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, final Runnable runnable) {
        final String str = (String) kVar.f38723d[0];
        if (!kVar.l() || !a(kVar)) {
            e.a(kVar, false).a("conversation_id", str).a();
            b(kVar);
            runnable.run();
            return;
        }
        final Participant participant = kVar.f38725f.body.update_conversation_participant_body.participant;
        d.a(new c<ah>() {
            /* class com.bytedance.im.core.internal.b.a.as.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22980);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ ah a() {
                int conversationType;
                ah a2 = f.a(str, participant);
                h a3 = j.a().a(str);
                String str = str;
                if (a3 == null) {
                    conversationType = -1;
                } else {
                    conversationType = a3.getConversationType();
                }
                if (com.bytedance.im.core.internal.a.e.a(str, conversationType, Collections.singletonList(a2))) {
                    return a2;
                }
                return null;
            }
        }, new com.bytedance.im.core.internal.e.b<ah>() {
            /* class com.bytedance.im.core.internal.b.a.as.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22981);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(ah ahVar) {
                if (ahVar != null) {
                    j a2 = j.a();
                    List<ah> singletonList = Collections.singletonList(ahVar);
                    if (singletonList != null && !singletonList.isEmpty()) {
                        q a3 = q.a();
                        if (!singletonList.isEmpty()) {
                            a3.b(singletonList.get(0).getConversationId(), new q.a<r>(singletonList) {
                                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass22 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ List f38832a;

                                static {
                                    Covode.recordClassIndex(23155);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.im.core.internal.utils.q.a
                                public final /* bridge */ /* synthetic */ void a(r rVar) {
                                    rVar.a(this.f38832a);
                                }

                                {
                                    this.f38832a = r2;
                                }
                            });
                        }
                        for (p pVar : a2.f37963e) {
                            pVar.a(singletonList);
                        }
                    }
                    e.a(kVar, true).a("conversation_id", str).a();
                    as.this.a(ahVar);
                } else {
                    as.this.b(k.a(-3001));
                }
                runnable.run();
            }
        });
    }
}
