package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.al;
import com.bytedance.im.core.d.ao;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.internal.a.e;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.utils.v;
import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody;
import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.bytedance.im.core.proto.RequestBody;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class c extends w<List<al>> {
    static {
        Covode.recordClassIndex(22986);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public c() {
        super(IMCMD.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX.getValue());
    }

    public c(b<List<al>> bVar) {
        super(IMCMD.BATCH_GAT_CONVERSATION_PARTICIPANTS_READINDEX.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar == null || kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.batch_get_conversation_participants_readindex == null) {
            return false;
        }
        return true;
    }

    public final void a(List<ai> list, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (ai aiVar : list) {
            if (aiVar.getSender() == d.a().f37562b.a()) {
                arrayList.add(aiVar);
                String conversationId = aiVar.getConversationId();
                h a2 = j.a().a(conversationId);
                if (a2 != null) {
                    i2 = a2.getInboxType();
                    arrayList2.add(conversationId);
                    arrayList3.add(Long.valueOf(a2.getConversationShortId()));
                }
            }
        }
        a(i2, new RequestBody.Builder().batch_get_conversation_participants_readindex(new BatchGetConversationParticipantsReadIndexRequestBody.Builder().conversation_id(arrayList2).conversation_short_id(arrayList3).request_from(str).min_index_required(Boolean.valueOf(d.a().b().aK)).build()).build(), null, arrayList);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, Runnable runnable) {
        boolean z;
        if (!kVar.l() || !a(kVar)) {
            z = false;
            b(kVar);
        } else {
            z = true;
            List<ai> list = (List) kVar.f38723d[0];
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (ConversationParticipantReadIndex conversationParticipantReadIndex : kVar.f38725f.body.batch_get_conversation_participants_readindex.conversationParticipantsReadIndex) {
                hashMap.put(conversationParticipantReadIndex.conversation_id, conversationParticipantReadIndex);
            }
            v.b(new Runnable() {
                /* class com.bytedance.im.core.internal.b.a.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22987);
                }

                public final void run() {
                    ao aoVar;
                    List<ConversationParticipantReadIndex> list = kVar.f38725f.body.batch_get_conversation_participants_readindex.conversationParticipantsReadIndex;
                    l.c(list, "");
                    d a2 = d.a();
                    l.a((Object) a2, "");
                    if (a2.b().aJ) {
                        f.a("imsdk", " ConvReadInfoHelperimczy updateReadInfo netParticipantIndexInfoList = ".concat(String.valueOf(list)), (Throwable) null);
                        HashMap hashMap = new HashMap();
                        for (ConversationParticipantReadIndex conversationParticipantReadIndex : list) {
                            String str = conversationParticipantReadIndex.conversation_id;
                            HashMap<Long, ao> hashMap2 = com.bytedance.im.core.d.f.f37949b.get(str);
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap<>();
                            }
                            l.a((Object) hashMap2, "");
                            for (ParticipantReadIndex participantReadIndex : conversationParticipantReadIndex.participantReadIndex) {
                                HashMap<Long, ao> hashMap3 = com.bytedance.im.core.d.f.f37949b.get(str);
                                if (hashMap3 == null || (aoVar = hashMap3.get(participantReadIndex.user_id)) == null) {
                                    aoVar = new ao();
                                }
                                d a3 = d.a();
                                l.a((Object) a3, "");
                                if (a3.b().aK && participantReadIndex.index_min != null) {
                                    Long l2 = participantReadIndex.index_min;
                                    l.a((Object) l2, "");
                                    aoVar.a(l2.longValue());
                                }
                                Long l3 = participantReadIndex.user_id;
                                l.a((Object) l3, "");
                                aoVar.f37819b = l3.longValue();
                                aoVar.f37818a = str;
                                long j2 = aoVar.f37821d;
                                Long l4 = participantReadIndex.index;
                                if (l4 == null || j2 != l4.longValue()) {
                                    Long l5 = participantReadIndex.index;
                                    l.a((Object) l5, "");
                                    aoVar.b(l5.longValue());
                                    aoVar.c(participantReadIndex.index.longValue() * 1000);
                                    if (!hashMap.containsKey(str)) {
                                        l.a((Object) str, "");
                                        hashMap.put(str, new HashMap());
                                    }
                                    HashMap hashMap4 = (HashMap) hashMap.get(str);
                                    if (hashMap4 != null) {
                                        hashMap4.put(participantReadIndex.user_id, aoVar);
                                    }
                                }
                                hashMap2.put(Long.valueOf(aoVar.f37819b), aoVar);
                            }
                            ConcurrentHashMap<String, HashMap<Long, ao>> concurrentHashMap = com.bytedance.im.core.d.f.f37949b;
                            l.a((Object) str, "");
                            concurrentHashMap.put(str, hashMap2);
                        }
                        Set<String> keySet = com.bytedance.im.core.d.f.f37949b.keySet();
                        l.a((Object) keySet, "");
                        com.bytedance.im.core.d.f.a(keySet);
                        com.bytedance.im.core.d.f.a(hashMap);
                    }
                }
            });
            for (ai aiVar : list) {
                ConversationParticipantReadIndex conversationParticipantReadIndex2 = (ConversationParticipantReadIndex) hashMap.get(aiVar.getConversationId());
                if (conversationParticipantReadIndex2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    h a2 = j.a().a(conversationParticipantReadIndex2.conversation_id);
                    if (a2 == null || a2.getMemberIds() == null || a2.getMemberIds().isEmpty()) {
                        arrayList3.addAll(e.a(conversationParticipantReadIndex2.conversation_id));
                    } else {
                        arrayList3.addAll(a2.getMemberIds());
                    }
                    arrayList3.remove(Long.valueOf(d.a().f37562b.a()));
                    for (ParticipantReadIndex participantReadIndex : conversationParticipantReadIndex2.participantReadIndex) {
                        if (participantReadIndex.user_id.longValue() != d.a().f37562b.a()) {
                            if ("1".equals(aiVar.getLocalExt().get("s:message_index_is_local"))) {
                                if (participantReadIndex.index.longValue() > aiVar.getIndex()) {
                                    arrayList2.add(participantReadIndex.user_id);
                                }
                            } else if (participantReadIndex.index.longValue() >= aiVar.getIndex()) {
                                arrayList2.add(participantReadIndex.user_id);
                            }
                        }
                    }
                    arrayList.add(new al(arrayList2, arrayList3, conversationParticipantReadIndex2.conversation_id, aiVar.getMsgId(), aiVar.getSender()));
                }
            }
            a(arrayList);
        }
        com.bytedance.im.core.c.e.a(kVar, z).a();
    }
}
