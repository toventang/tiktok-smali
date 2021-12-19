package com.bytedance.im.core.internal.b.a;

import android.text.TextUtils;
import android.util.Pair;
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
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.ConversationOperationStatus;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import java.util.ArrayList;
import java.util.List;

public final class ak extends w<List<ah>> {
    static {
        Covode.recordClassIndex(22957);
    }

    ak() {
        super(IMCMD.REMOVE_CONVERSATION_PARTICIPANTS.getValue());
    }

    public ak(b<List<ah>> bVar) {
        super(IMCMD.REMOVE_CONVERSATION_PARTICIPANTS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.conversation_remove_participants_body == null || kVar.f38725f.body.conversation_remove_participants_body.status == null || kVar.f38725f.body.conversation_remove_participants_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue()) {
            return false;
        }
        return true;
    }

    public static List<ah> a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Long l2 : list) {
            if (l2 != null) {
                ah ahVar = new ah();
                ahVar.setUid(l2.longValue());
                ahVar.setConversationId(str);
                arrayList.add(ahVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, final Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            b(kVar);
            runnable.run();
            e.a(kVar, false).a();
            return;
        }
        final String str = (String) kVar.f38723d[0];
        final List list = (List) kVar.f38723d[1];
        final ConversationRemoveParticipantsResponseBody conversationRemoveParticipantsResponseBody = kVar.f38725f.body.conversation_remove_participants_body;
        d.a(new c<Pair<h, List<ah>>>() {
            /* class com.bytedance.im.core.internal.b.a.ak.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22958);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ Pair<h, List<ah>> a() {
                if (conversationRemoveParticipantsResponseBody.failed_participants != null) {
                    list.removeAll(conversationRemoveParticipantsResponseBody.failed_participants);
                }
                if (list.size() <= 0) {
                    return null;
                }
                List<ah> a2 = com.bytedance.im.core.internal.a.e.a(str, list);
                int b2 = com.bytedance.im.core.internal.a.e.b(str, list);
                h a3 = com.bytedance.im.core.internal.a.c.a(str, true);
                if (a3 != null && b2 > 0) {
                    a3.setMemberCount(Math.max(0, a3.getMemberCount() - b2));
                    com.bytedance.im.core.internal.a.c.a(a3, false);
                }
                if (a2 == null || a2.isEmpty()) {
                    a2 = ak.a(str, list);
                }
                return new Pair(a3, a2);
            }
        }, new com.bytedance.im.core.internal.e.b<Pair<h, List<ah>>>() {
            /* class com.bytedance.im.core.internal.b.a.ak.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22959);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(Pair<h, List<ah>> pair) {
                Object obj;
                Pair<h, List<ah>> pair2 = pair;
                if (pair2 != null) {
                    if (pair2.first != null) {
                        j.a().a((h) pair2.first, 8);
                    }
                    j a2 = j.a();
                    List<ah> list = (List) pair2.second;
                    if (list != null && !list.isEmpty()) {
                        q a3 = q.a();
                        if (!list.isEmpty()) {
                            a3.b(list.get(0).getConversationId(), new q.a<r>(list) {
                                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass24 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ List f38836a;

                                static {
                                    Covode.recordClassIndex(23157);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.im.core.internal.utils.q.a
                                public final /* synthetic */ void a(r rVar) {
                                    rVar.c(this.f38836a);
                                }

                                {
                                    this.f38836a = r2;
                                }
                            });
                        }
                        for (p pVar : a2.f37963e) {
                            pVar.c(list);
                        }
                    }
                    e.a(kVar, true).a();
                }
                ak akVar = ak.this;
                if (pair2 != null) {
                    obj = pair2.second;
                } else {
                    obj = null;
                }
                akVar.a(obj);
                runnable.run();
            }
        });
    }
}
