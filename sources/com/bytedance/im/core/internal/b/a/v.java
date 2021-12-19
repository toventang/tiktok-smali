package com.bytedance.im.core.internal.b.a;

import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.ar;
import com.bytedance.im.core.d.aw;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.a.a.b;
import com.bytedance.im.core.internal.d.j;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.utils.l;
import com.bytedance.im.core.internal.utils.n;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.GetRecentMessageReqBody;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class v extends w<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public int f38592a;

    /* renamed from: b  reason: collision with root package name */
    public String f38593b;

    /* renamed from: c  reason: collision with root package name */
    public int f38594c;

    /* renamed from: d  reason: collision with root package name */
    public int f38595d;

    /* renamed from: e  reason: collision with root package name */
    public int f38596e;

    /* renamed from: f  reason: collision with root package name */
    public int f38597f;

    /* renamed from: g  reason: collision with root package name */
    public long f38598g;

    /* renamed from: h  reason: collision with root package name */
    public long f38599h;

    /* renamed from: i  reason: collision with root package name */
    public long f38600i;

    /* renamed from: j  reason: collision with root package name */
    public long f38601j;

    /* renamed from: k  reason: collision with root package name */
    public long f38602k;

    /* renamed from: l  reason: collision with root package name */
    public long f38603l;

    /* renamed from: m  reason: collision with root package name */
    public long f38604m;
    public long n;
    private long o;

    static {
        Covode.recordClassIndex(23046);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(final k kVar, Runnable runnable) {
        boolean z = true;
        final GetRecentMessageRespBody getRecentMessageRespBody = null;
        if (d.a().b().aj) {
            this.f38600i += SystemClock.uptimeMillis() - this.o;
            long uptimeMillis = SystemClock.uptimeMillis();
            final boolean z2 = kVar.l() && a(kVar);
            f.b("imsdk", "GetRecentMsgHandler handleResponse, seqId:" + kVar.f38720a + ", success:" + z2, (Throwable) null);
            if (z2) {
                getRecentMessageRespBody = kVar.f38725f.body.get_recent_message_body;
            }
            this.n += SystemClock.uptimeMillis() - uptimeMillis;
            final long uptimeMillis2 = SystemClock.uptimeMillis();
            com.bytedance.im.core.internal.e.d.a(new c<a>() {
                /* class com.bytedance.im.core.internal.b.a.v.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(23049);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public a a() {
                    if (!z2) {
                        return null;
                    }
                    a aVar = new a();
                    try {
                        b.a("GetRecentMsgHandler.handleResponse()");
                        v.this.a(aVar, getRecentMessageRespBody.messages);
                        b.a("GetRecentMsgHandler.handleResponse()", true);
                        v.this.a(aVar, getRecentMessageRespBody.next_conversation_version);
                    } catch (Exception e2) {
                        f.b("imsdk", "GetRecentMsgHandler handleResponse saveMessage error", e2);
                        b.a("GetRecentMsgHandler.handleResponse()", false);
                        e.a(e2);
                        com.bytedance.im.core.g.b.a(4, e2);
                        s.a();
                        if (s.e(v.this.f38592a)) {
                            v.this.a(aVar, getRecentMessageRespBody.next_conversation_version);
                        } else {
                            f.b("imsdk", "GetRecentMsgHandler handleResponse forbid to update version", (Throwable) null);
                        }
                    }
                    return aVar;
                }
            }, new com.bytedance.im.core.internal.e.b<a>() {
                /* class com.bytedance.im.core.internal.b.a.v.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(23050);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(a aVar) {
                    boolean z;
                    a aVar2 = aVar;
                    v.this.f38603l = SystemClock.uptimeMillis() - uptimeMillis2;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    boolean z2 = false;
                    if (z2) {
                        f.b("imsdk", "GetRecentMsgHandler handleResponse onCallback, seqId:" + kVar.f38720a + ", result:" + aVar2, (Throwable) null);
                        v.a(aVar2);
                        v.this.f38604m += SystemClock.uptimeMillis() - uptimeMillis;
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        if (aVar2.f38624f <= 0 || !getRecentMessageRespBody.has_more.booleanValue()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (d.a().b().x == 1 || !z) {
                            if (v.this.f38594c == 0) {
                                z2 = true;
                            }
                            com.bytedance.im.core.internal.b.a.a(z2);
                            if (!z) {
                                com.bytedance.im.core.internal.b.a.f(v.this.f38592a);
                                e.a(kVar, true).a();
                                v.this.n += SystemClock.uptimeMillis() - uptimeMillis2;
                                com.bytedance.im.core.g.b.a(true, true, SystemClock.uptimeMillis() - v.this.f38598g, v.this.f38595d, 0, v.this.f38596e, v.this.f38597f, null, v.this.f38599h, v.this.f38600i, v.this.f38601j, v.this.f38602k, v.this.f38603l, v.this.f38604m, v.this.n);
                                v.this.a((Object) true);
                                l.a().c();
                                v.this.a(true);
                                return;
                            }
                        }
                        v.this.n += SystemClock.uptimeMillis() - uptimeMillis2;
                        return;
                    }
                    com.bytedance.im.core.internal.b.a.f(v.this.f38592a);
                    e.a(kVar, false).a();
                    v.this.n += SystemClock.uptimeMillis() - uptimeMillis;
                    com.bytedance.im.core.g.b.a(true, false, SystemClock.uptimeMillis() - v.this.f38598g, v.this.f38595d, 0, v.this.f38596e, v.this.f38597f, u.a(kVar), v.this.f38599h, v.this.f38600i, v.this.f38601j, v.this.f38602k, v.this.f38603l, v.this.f38604m, v.this.n);
                    v.this.a((Object) false);
                    v.this.a(false);
                }
            }, com.bytedance.im.core.internal.e.a.c());
            long uptimeMillis3 = SystemClock.uptimeMillis();
            if (!z2 || getRecentMessageRespBody.next_conversation_version == null || getRecentMessageRespBody.next_conversation_version.longValue() <= 0 || !getRecentMessageRespBody.has_more.booleanValue()) {
                z = false;
            }
            this.n += SystemClock.uptimeMillis() - uptimeMillis3;
            if (z) {
                a(this.f38593b, getRecentMessageRespBody.next_conversation_version.longValue());
                return;
            }
            return;
        }
        this.f38600i += SystemClock.uptimeMillis() - this.o;
        long uptimeMillis4 = SystemClock.uptimeMillis();
        if (!kVar.l() || !a(kVar)) {
            z = false;
        }
        f.b("imsdk", "GetRecentMsgHandler handleResponse, seqId:" + kVar.f38720a + ", success:" + z, (Throwable) null);
        if (!z) {
            com.bytedance.im.core.internal.b.a.f(this.f38592a);
            e.a(kVar, false).a();
            this.n += SystemClock.uptimeMillis() - uptimeMillis4;
            com.bytedance.im.core.g.b.a(true, false, SystemClock.uptimeMillis() - this.f38598g, this.f38595d, 0, this.f38596e, this.f38597f, u.a(kVar), this.f38599h, this.f38600i, this.f38601j, this.f38602k, this.f38603l, this.f38604m, this.n);
            a((Object) false);
            a(false);
            return;
        }
        final GetRecentMessageRespBody getRecentMessageRespBody2 = kVar.f38725f.body.get_recent_message_body;
        this.n += SystemClock.uptimeMillis() - uptimeMillis4;
        final long uptimeMillis5 = SystemClock.uptimeMillis();
        com.bytedance.im.core.internal.e.d.a(new c<a>() {
            /* class com.bytedance.im.core.internal.b.a.v.AnonymousClass1 */

            static {
                Covode.recordClassIndex(23047);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public a a() {
                a aVar = new a();
                try {
                    b.a("GetRecentMsgHandler.handleResponse()");
                    v.this.a(aVar, getRecentMessageRespBody2.messages);
                    b.a("GetRecentMsgHandler.handleResponse()", true);
                    v.this.a(aVar, getRecentMessageRespBody2.next_conversation_version);
                } catch (Exception e2) {
                    f.b("imsdk", "GetRecentMsgHandler handleResponse saveMessage error", e2);
                    b.a("GetRecentMsgHandler.handleResponse()", false);
                    e.a(e2);
                    com.bytedance.im.core.g.b.a(4, e2);
                    s.a();
                    if (s.e(v.this.f38592a)) {
                        v.this.a(aVar, getRecentMessageRespBody2.next_conversation_version);
                    } else {
                        f.b("imsdk", "GetRecentMsgHandler handleResponse forbid to update version", (Throwable) null);
                    }
                }
                return aVar;
            }
        }, new com.bytedance.im.core.internal.e.b<a>() {
            /* class com.bytedance.im.core.internal.b.a.v.AnonymousClass2 */

            static {
                Covode.recordClassIndex(23048);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(a aVar) {
                boolean z;
                a aVar2 = aVar;
                v.this.f38603l = SystemClock.uptimeMillis() - uptimeMillis5;
                long uptimeMillis = SystemClock.uptimeMillis();
                f.b("imsdk", "GetRecentMsgHandler handleResponse onCallback, seqId:" + kVar.f38720a + ", result:" + aVar2, (Throwable) null);
                v.a(aVar2);
                v.this.f38604m += SystemClock.uptimeMillis() - uptimeMillis;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                boolean z2 = false;
                if (aVar2.f38624f <= 0 || !getRecentMessageRespBody2.has_more.booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                if (d.a().b().x == 1 || !z) {
                    if (v.this.f38594c == 0) {
                        z2 = true;
                    }
                    com.bytedance.im.core.internal.b.a.a(z2);
                    if (!z) {
                        com.bytedance.im.core.internal.b.a.f(v.this.f38592a);
                        e.a(kVar, true).a();
                        v.this.n += SystemClock.uptimeMillis() - uptimeMillis2;
                        com.bytedance.im.core.g.b.a(true, true, SystemClock.uptimeMillis() - v.this.f38598g, v.this.f38595d, 0, v.this.f38596e, v.this.f38597f, null, v.this.f38599h, v.this.f38600i, v.this.f38601j, v.this.f38602k, v.this.f38603l, v.this.f38604m, v.this.n);
                        v.this.a((Object) true);
                        l.a().c();
                        v.this.a(true);
                        return;
                    }
                }
                v.this.n += SystemClock.uptimeMillis() - uptimeMillis2;
                v vVar = v.this;
                vVar.a(vVar.f38593b, aVar2.f38624f);
            }
        }, com.bytedance.im.core.internal.e.a.c());
    }

    public final void a(String str, long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        f.b("imsdk", "GetRecentMsgHandler pull, source:" + str + ", inbox:" + this.f38592a + ", version:" + j2, (Throwable) null);
        this.f38593b = str;
        com.bytedance.im.core.internal.b.a.e(this.f38592a);
        GetRecentMessageReqBody.Builder conversation_version = new GetRecentMessageReqBody.Builder().source(str).conversation_version(Long.valueOf(j2));
        if (this.f38594c == 0) {
            d.a();
        }
        a(this.f38592a, new RequestBody.Builder().get_recent_message_body(conversation_version.build()).build(), (j) null, new Object[0]);
        this.f38599h += SystemClock.uptimeMillis() - uptimeMillis;
        this.o = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Set<h> f38619a = new LinkedHashSet();

        /* renamed from: b  reason: collision with root package name */
        final Set<String> f38620b = new LinkedHashSet();

        /* renamed from: c  reason: collision with root package name */
        final Map<String, Integer> f38621c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        final Map<String, List<ai>> f38622d = new LinkedHashMap();

        /* renamed from: e  reason: collision with root package name */
        final List<ai> f38623e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        long f38624f = -1;

        static {
            Covode.recordClassIndex(23051);
        }

        a() {
        }

        public final String toString() {
            return "ProcessResult{has:" + this.f38619a.size() + ", waiting:" + this.f38620b.size() + ", nextPullVersion:" + this.f38624f + ", msgListMap:" + this.f38622d.size() + ", pushMsgList:" + this.f38623e.size() + "}";
        }
    }

    v(int i2) {
        this(i2, null);
    }

    public final void a(boolean z) {
        if (this.f38594c == 0) {
            q.a().a(this.f38592a);
        }
        q.a();
        q.a(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.get_recent_message_body == null) {
            return false;
        }
        return true;
    }

    public static void a(a aVar) {
        HashSet hashSet = new HashSet();
        for (h hVar : aVar.f38619a) {
            String conversationId = hVar.getConversationId();
            hashSet.add(conversationId);
            a(conversationId, hVar, aVar.f38622d.get(conversationId), aVar.f38621c.get(conversationId));
        }
        if (d.a().b().am) {
            for (String str : aVar.f38620b) {
                if (!hashSet.contains(str)) {
                    a(str, (h) null, aVar.f38622d.get(str), (Integer) null);
                }
            }
        }
        if (!aVar.f38623e.isEmpty()) {
            d.a();
        }
    }

    public final void a(int i2) {
        Log.getStackTraceString(new Exception());
        if (!(i2 == 9 || l.a().b() == 1)) {
            com.bytedance.im.core.g.b.a(4, i2);
        }
        String a2 = com.bytedance.im.core.internal.utils.e.a(i2);
        if (com.bytedance.im.core.internal.b.a.f38230d.contains(Integer.valueOf(this.f38592a))) {
            f.b("imsdk", "GetRecentMsgHandler pull, source:" + a2 + ", inbox:" + this.f38592a + ", already doing, return", (Throwable) null);
            return;
        }
        this.f38594c = i2;
        this.f38598g = SystemClock.uptimeMillis();
        s.a();
        a(a2, s.b(this.f38592a));
    }

    public v(int i2, com.bytedance.im.core.a.a.b<Boolean> bVar) {
        super(IMCMD.GET_RECENT_MESSAGE.getValue(), bVar);
        this.f38595d = 0;
        this.f38596e = 0;
        this.f38597f = 0;
        this.f38599h = 0;
        this.f38600i = 0;
        this.f38601j = 0;
        this.f38602k = 0;
        this.f38603l = 0;
        this.f38604m = 0;
        this.n = 0;
        this.f38592a = i2;
    }

    public final void a(a aVar, Long l2) {
        long j2;
        s.a();
        long b2 = s.b(this.f38592a);
        if (l2 == null || l2.longValue() <= b2) {
            StringBuilder sb = new StringBuilder("GetRecentMsgHandler updateVersion version invalid, next:");
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = -1;
            }
            f.b("imsdk", sb.append(j2).append(", local:").append(b2).toString(), (Throwable) null);
            return;
        }
        s.a();
        s.b(this.f38592a, l2.longValue());
        aVar.f38624f = l2.longValue();
    }

    public final void a(a aVar, List<ConversationRecentMessage> list) {
        if (list != null && list.size() > 0) {
            s.a();
            s.f38859a.a(s.a("ever_use_recent_link"), true);
            int i2 = 0;
            for (ConversationRecentMessage conversationRecentMessage : list) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (!(conversationRecentMessage == null || conversationRecentMessage.conversation_short_id == null || conversationRecentMessage.conversation_short_id.longValue() <= 0)) {
                    List<MessageBody> list2 = conversationRecentMessage.messages;
                    if (!com.bytedance.im.core.internal.utils.d.a(list2)) {
                        String str = list2.get(0).conversation_id;
                        ArrayList arrayList = new ArrayList();
                        for (MessageBody messageBody : list2) {
                            i2++;
                            aw a2 = ai.a(messageBody, false, (Pair<String, String>) new Pair("s:msg_get_by_pull", "1"), 4);
                            if (!(a2 == null || a2.f37849a == null)) {
                                arrayList.add(a2.f37849a);
                            }
                        }
                        this.f38601j += SystemClock.uptimeMillis() - uptimeMillis;
                        if (!arrayList.isEmpty()) {
                            this.f38596e++;
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            aVar.f38622d.put(str, arrayList);
                            List<ai> a3 = n.a(str, arrayList);
                            if (!com.bytedance.im.core.internal.utils.d.a(a3)) {
                                aVar.f38623e.addAll(a3);
                            }
                            ai aiVar = (ai) arrayList.get(0);
                            h a4 = com.bytedance.im.core.internal.a.c.a(str, true);
                            if (a4 == null || a4.isWaitingInfo() || !a4.isReadBadgeCountUpdated()) {
                                if (d.a().b().aB) {
                                    o.a(this.f38592a, aiVar.getConversationId(), aiVar.getConversationShortId(), aiVar.getConversationType(), aiVar.getCreatedAt(), conversationRecentMessage.badge_count.intValue(), aiVar);
                                } else {
                                    o.a(this.f38592a, aiVar.getConversationId(), aiVar.getConversationShortId(), aiVar.getConversationType(), aiVar.getCreatedAt(), conversationRecentMessage.badge_count.intValue());
                                }
                                com.bytedance.im.core.internal.b.a.a(this.f38592a, aiVar);
                                aVar.f38620b.add(str);
                            } else {
                                long unreadCount = a4.getUnreadCount();
                                aVar.f38621c.put(str, Integer.valueOf(conversationRecentMessage.badge_count.intValue() - a4.getBadgeCount()));
                                ai.a(a4, aiVar, conversationRecentMessage.badge_count);
                                this.f38597f = (int) (((long) this.f38597f) + (a4.getUnreadCount() - unreadCount));
                                aVar.f38619a.add(a4);
                            }
                            this.f38602k += SystemClock.uptimeMillis() - uptimeMillis2;
                        }
                    }
                }
            }
            this.f38595d += i2;
        }
    }

    private static void a(String str, h hVar, List<ai> list, Integer num) {
        Object obj;
        int i2;
        StringBuilder append = new StringBuilder("GetRecentMsgHandler notifyByConversation, cid:").append(str).append(", msgList:");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "null";
        }
        f.b("imsdk", append.append(obj).toString(), (Throwable) null);
        if (!com.bytedance.im.core.internal.utils.d.a(list)) {
            ar arVar = new ar();
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = -1;
            }
            arVar.f37825b = i2;
            q.a().a(list, 4, arVar);
        }
        h a2 = com.bytedance.im.core.d.j.a().a(str);
        if (a2 != null) {
            hVar = a2;
        } else if (hVar == null) {
            return;
        }
        com.bytedance.im.core.d.j.a().a(2, hVar);
    }
}
