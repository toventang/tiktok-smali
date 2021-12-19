package com.bytedance.im.core.internal.b.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.p;
import com.bytedance.im.core.d.r;
import com.bytedance.im.core.internal.a.e;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.f;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.im.core.proto.ConversationOperationStatus;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.SecUidPair;
import java.util.HashMap;
import java.util.List;

public final class a extends w<List<ah>> {

    /* renamed from: a  reason: collision with root package name */
    public long f38240a = -1;

    static {
        Covode.recordClassIndex(22912);
    }

    a() {
        super(IMCMD.ADD_CONVERSATION_PARTICIPANTS.getValue());
    }

    public a(b<List<ah>> bVar) {
        super(IMCMD.ADD_CONVERSATION_PARTICIPANTS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.conversation_add_participants_body == null || kVar.f38725f.body.conversation_add_participants_body.status == null || kVar.f38725f.body.conversation_add_participants_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, final Runnable runnable) {
        boolean z;
        if (!kVar.l() || !a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        final String str = (String) kVar.f38723d[0];
        final List list = (List) kVar.f38723d[1];
        final int size = list.size();
        if (z) {
            final ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody = kVar.f38725f.body.conversation_add_participants_body;
            d.a(new c<Pair<h, List<ah>>>() {
                /* class com.bytedance.im.core.internal.b.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22913);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Pair<h, List<ah>> a() {
                    int conversationType;
                    List<SecUidPair> list;
                    if (conversationAddParticipantsResponseBody.failed_participants != null) {
                        list.removeAll(conversationAddParticipantsResponseBody.failed_participants);
                    }
                    long c2 = e.c(str);
                    h a2 = j.a().a(str);
                    if (a.this.f38240a > 0 && a2 == null) {
                        a aVar = a.this;
                        String str = str;
                        h hVar = new h();
                        hVar.setConversationId(str);
                        hVar.setConversationShortId(aVar.f38240a);
                        hVar.setConversationType(e.a.f37582b);
                        hVar.setIsMember(true);
                        com.bytedance.im.core.internal.a.c.a(hVar);
                    }
                    String str2 = str;
                    if (a2 == null) {
                        conversationType = -1;
                    } else {
                        conversationType = a2.getConversationType();
                    }
                    String str3 = str;
                    List list2 = list;
                    ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody = conversationAddParticipantsResponseBody;
                    HashMap hashMap = null;
                    if (!(conversationAddParticipantsResponseBody == null || (list = conversationAddParticipantsResponseBody.sec_success_participants) == null || list.isEmpty())) {
                        hashMap = new HashMap();
                        for (SecUidPair secUidPair : list) {
                            if (!(secUidPair == null || secUidPair.uid == null)) {
                                hashMap.put(secUidPair.uid, secUidPair.sec_uid);
                            }
                        }
                    }
                    com.bytedance.im.core.internal.a.e.a(str2, conversationType, f.a(str3, list2, hashMap, c2));
                    h a3 = com.bytedance.im.core.internal.a.c.a(str, true);
                    if (a3 != null) {
                        if (kVar.f38725f != null) {
                            a3.setInboxType(kVar.f38725f.inbox_type.intValue());
                        }
                        a3.setMemberCount(a3.getMemberCount() + list.size());
                        com.bytedance.im.core.internal.a.c.a(a3, false);
                    }
                    return new Pair(a3, com.bytedance.im.core.internal.a.e.a(str, list));
                }
            }, new com.bytedance.im.core.internal.e.b<Pair<h, List<ah>>>() {
                /* class com.bytedance.im.core.internal.b.a.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(22914);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(Pair<h, List<ah>> pair) {
                    Pair<h, List<ah>> pair2 = pair;
                    if (pair2.first != null) {
                        j.a().a((h) pair2.first, 1);
                    }
                    a.this.a(pair2.second, kVar);
                    j a2 = j.a();
                    List<ah> list = (List) pair2.second;
                    if (list != null && !list.isEmpty()) {
                        q a3 = q.a();
                        if (!list.isEmpty()) {
                            a3.b(list.get(0).getConversationId(), new q.a<r>(list) {
                                /* class com.bytedance.im.core.internal.utils.q.AnonymousClass23 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ List f38834a;

                                static {
                                    Covode.recordClassIndex(23156);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.im.core.internal.utils.q.a
                                public final /* synthetic */ void a(r rVar) {
                                    rVar.b(this.f38834a);
                                }

                                {
                                    this.f38834a = r2;
                                }
                            });
                        }
                        for (p pVar : a2.f37963e) {
                            pVar.b(list);
                        }
                    }
                    com.bytedance.im.core.c.e.a(kVar, true).a("conversation_id", str).a("total_count", Integer.valueOf(size)).a("count", Integer.valueOf(((List) pair2.second).size())).a();
                    runnable.run();
                }
            });
            return;
        }
        b(kVar);
        runnable.run();
        com.bytedance.im.core.c.e.a(kVar, false).a("conversation_id", str).a("total_count", Integer.valueOf(size)).a();
    }
}
