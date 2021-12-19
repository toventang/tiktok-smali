package com.bytedance.ies.im.core.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.e;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.c.i;
import com.bytedance.im.core.d.aa;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.ak;
import com.bytedance.im.core.d.bb;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.b.a.r;
import com.bytedance.im.core.internal.b.a.x;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.a;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.m;
import com.bytedance.im.core.internal.utils.n;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.bytedance.im.core.proto.RequestBody;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f33931b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.im.core.i.a f33932c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f33933d;

    /* renamed from: e  reason: collision with root package name */
    private final String f33934e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f33935f;

    static {
        Covode.recordClassIndex(20168);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20169);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final String a() {
        return this.f33934e;
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final int e() {
        return this.f33932c.f37720c;
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final void g() {
        this.f33932c.e();
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final void f() {
        this.f33933d = true;
        this.f33932c.b();
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final List<ai> h() {
        m mVar = this.f33932c.f37719b;
        l.b(mVar, "");
        return mVar;
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final List<ai> i() {
        List<ai> h2 = this.f33932c.h();
        l.b(h2, "");
        return h2;
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final void c() {
        com.bytedance.im.core.i.a aVar = this.f33932c;
        f.b("imsdk", "MessageModel resume", (Throwable) null);
        if (aVar.f37723f) {
            j a2 = j.a();
            a2.f37962d.add(aVar.f37718a);
        }
        new i().a("imsdk_enter_conversation").a("conversation_id", aVar.f37718a).a("result", 1).b();
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final void d() {
        com.bytedance.im.core.i.a aVar = this.f33932c;
        f.b("imsdk", "MessageModel stop", (Throwable) null);
        if (aVar.f37723f) {
            j a2 = j.a();
            a2.f37962d.remove(aVar.f37718a);
        }
        bb bbVar = aVar.p;
        bbVar.f37880d.removeMessages(bbVar.f37877a);
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final void b() {
        com.bytedance.im.core.i.a aVar = this.f33932c;
        f.b("imsdk", "MessageModel unregister", (Throwable) null);
        aVar.f37719b.clear();
        aVar.f37721d = null;
        q.a().b(aVar.f37718a, aVar);
        aVar.f37722e = null;
        q.a().f38793g.remove(aVar);
        if (aVar.f37727j) {
            q a2 = q.a();
            String str = aVar.f37718a;
            com.bytedance.im.core.d.q qVar = aVar.f37728k;
            List<com.bytedance.im.core.d.q> list = a2.f38791e.get(str);
            if (list != null) {
                list.remove(qVar);
            }
            a2.f38791e.put(str, list);
            aVar.f37728k = null;
        }
        aa.a().f37655b.remove(aVar);
        new i().a("imsdk_close_conversation").a("conversation_id", aVar.f37718a).a("result", 1).b();
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final void a(int i2) {
        this.f33932c.f37720c = i2;
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final void a(com.bytedance.ies.im.core.api.b.a.d dVar) {
        l.d(dVar, "");
        com.bytedance.im.core.i.a aVar = this.f33932c;
        f.b("imsdk", "MessageModel register, autoGetConversationInfo:true", (Throwable) null);
        aVar.f37721d = dVar;
        q.a().a(aVar.f37718a, aVar);
        j.a();
        j.b(aVar.f37718a);
        if (aVar.f37727j) {
            q a2 = q.a();
            String str = aVar.f37718a;
            com.bytedance.im.core.d.q qVar = aVar.f37728k;
            List<com.bytedance.im.core.d.q> list = a2.f38791e.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            if (!list.contains(qVar)) {
                list.add(qVar);
            }
            a2.f38791e.put(str, list);
        }
        aa.a().f37655b.add(aVar);
    }

    public d(String str, boolean z) {
        l.d(str, "");
        this.f33934e = str;
        this.f33935f = z;
        this.f33932c = new com.bytedance.im.core.i.a(str, z);
    }

    @Override // com.bytedance.ies.im.core.api.b.e
    public final void a(ai aiVar, boolean z, b<Pair<List<Long>, List<Long>>> bVar) {
        l.d(aiVar, "");
        com.bytedance.im.core.i.a aVar = this.f33932c;
        if (aiVar == null || !aiVar.isSelf() || aiVar.isDeleted() || !n.c(aiVar) || TextUtils.isEmpty(aiVar.getConversationId()) || !aiVar.getConversationId().equals(aVar.f37718a) || !aiVar.isSuccessOrNormal() || !aVar.f37727j) {
            f.b("imsdk", "read_receipt, getMessageReadStatusAsync failed", (Throwable) null);
            bVar.a(u.a(k.a(-1015)));
            return;
        }
        f.b("imsdk", "read_receipt, getMessageReadStatusAsync, msgSvrId:" + aiVar.getMsgId() + ", needRequestNet:" + z, (Throwable) null);
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - aVar.f37730m >= ((long) com.bytedance.im.core.a.d.a().b().U)) {
                aVar.f37730m = currentTimeMillis;
                j.a();
                String conversationId = aiVar.getConversationId();
                ak.AnonymousClass25 r0 = new b<List<ParticipantReadIndex>>(aiVar, bVar) {
                    /* class com.bytedance.im.core.d.ak.AnonymousClass25 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ ai f37765a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ b f37766b;

                    static {
                        Covode.recordClassIndex(22689);
                    }

                    @Override // com.bytedance.im.core.a.a.b
                    public final void a(u uVar) {
                        ak.this.b(this.f37765a, this.f37766b);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.im.core.a.a.b
                    public final /* synthetic */ void a(List<ParticipantReadIndex> list) {
                        final List<ParticipantReadIndex> list2 = list;
                        d.a(new c<Pair<Boolean, Map<Long, ao>>>() {
                            /* class com.bytedance.im.core.d.ak.AnonymousClass25.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(22690);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // com.bytedance.im.core.internal.e.c
                            public final /* synthetic */ Pair<Boolean, Map<Long, ao>> a() {
                                long j2;
                                long j3;
                                ak akVar = ak.this;
                                String conversationId = AnonymousClass25.this.f37765a.getConversationId();
                                List list = list2;
                                if (TextUtils.isEmpty(conversationId)) {
                                    return null;
                                }
                                boolean b2 = akVar.b(conversationId);
                                if (akVar.f37729l != null && !akVar.f37729l.isEmpty() && list != null && !list.isEmpty()) {
                                    int size = list.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        ParticipantReadIndex participantReadIndex = (ParticipantReadIndex) list.get(i2);
                                        if (participantReadIndex != null) {
                                            if (participantReadIndex.user_id != null) {
                                                j2 = participantReadIndex.user_id.longValue();
                                            } else {
                                                j2 = 0;
                                            }
                                            if (participantReadIndex.index != null) {
                                                j3 = participantReadIndex.index.longValue();
                                            } else {
                                                j3 = 0;
                                            }
                                            long c2 = com.bytedance.im.core.internal.a.i.c(conversationId, j3);
                                            ao aoVar = akVar.f37729l.get(Long.valueOf(j2));
                                            if (aoVar != null) {
                                                if (c2 > 0) {
                                                    if (c2 > aoVar.f37822e) {
                                                        aoVar.b(j3);
                                                        aoVar.c(c2);
                                                    }
                                                } else if (j3 > aoVar.f37821d) {
                                                    aoVar.b(j3);
                                                    aoVar.a();
                                                }
                                                b2 = true;
                                            }
                                        }
                                    }
                                }
                                return new Pair(Boolean.valueOf(b2), akVar.f37729l);
                            }
                        }, new com.bytedance.im.core.internal.e.b<Pair<Boolean, Map<Long, ao>>>() {
                            /* class com.bytedance.im.core.d.ak.AnonymousClass25.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(22691);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.bytedance.im.core.internal.e.b
                            public final /* synthetic */ void a(Pair<Boolean, Map<Long, ao>> pair) {
                                Pair<Boolean, Map<Long, ao>> pair2 = pair;
                                if (pair2 != null) {
                                    final Map<Long, ao> map = (Map) pair2.second;
                                    if (map != null && !map.isEmpty()) {
                                        Iterator<Map.Entry<Long, ao>> it = map.entrySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                Map.Entry<Long, ao> next = it.next();
                                                if (next != null && next.getValue() != null && next.getValue().f37820c < 0) {
                                                    ak.this.a(AnonymousClass25.this.f37765a.getConversationId(), AnonymousClass25.this.f37765a, AnonymousClass25.this.f37766b);
                                                    break;
                                                }
                                            } else {
                                                Pair<List<Long>, List<Long>> a2 = ak.this.a(AnonymousClass25.this.f37765a, map);
                                                if (AnonymousClass25.this.f37766b != null) {
                                                    AnonymousClass25.this.f37766b.a(a2);
                                                }
                                            }
                                        }
                                    } else if (AnonymousClass25.this.f37766b != null) {
                                        AnonymousClass25.this.f37766b.a(new Pair(Collections.emptyList(), Collections.emptyList()));
                                    }
                                    if (((Boolean) pair2.first).booleanValue()) {
                                        d.a(new c<Boolean>() {
                                            /* class com.bytedance.im.core.d.ak.AnonymousClass25.AnonymousClass2.AnonymousClass1 */

                                            static {
                                                Covode.recordClassIndex(22692);
                                            }

                                            /* Return type fixed from 'java.lang.Object' to match base method */
                                            @Override // com.bytedance.im.core.internal.e.c
                                            public final /* synthetic */ Boolean a() {
                                                return Boolean.valueOf(com.bytedance.im.core.internal.a.f.a(AnonymousClass25.this.f37765a.getConversationId(), map));
                                            }
                                        }, null, a.d());
                                    }
                                } else if (AnonymousClass25.this.f37766b != null) {
                                    AnonymousClass25.this.f37766b.a(u.a(k.a(-9999)));
                                }
                            }
                        }, a.d());
                    }

                    {
                        this.f37765a = r2;
                        this.f37766b = r3;
                    }
                };
                x.a();
                r rVar = new r(r0);
                h a2 = j.a().a(conversationId);
                if (a2 == null || a2.isLocal()) {
                    rVar.b(k.a(-1017));
                    return;
                }
                RequestBody build = new RequestBody.Builder().participants_read_index_body(new GetConversationParticipantsReadIndexV3RequestBody.Builder().conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).conversation_id(a2.getConversationId()).build()).build();
                rVar.a(a2.getInboxType(), build, null, a2);
                return;
            }
        }
        aVar.b(aiVar, bVar);
    }
}
