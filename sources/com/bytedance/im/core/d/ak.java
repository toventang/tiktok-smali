package com.bytedance.im.core.d;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.b.a.ac;
import com.bytedance.im.core.internal.b.a.af;
import com.bytedance.im.core.internal.b.a.x;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.a;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.e.d;
import com.bytedance.im.core.internal.utils.m;
import com.bytedance.im.core.internal.utils.n;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.MessageDirection;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.im.core.proto.ParticipantMinIndex;
import com.bytedance.im.core.proto.RequestBody;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ak implements t, v, x {
    public static Comparator q = new Comparator<ai>() {
        /* class com.bytedance.im.core.d.ak.AnonymousClass1 */

        static {
            Covode.recordClassIndex(22672);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(ai aiVar, ai aiVar2) {
            ai aiVar3 = aiVar;
            ai aiVar4 = aiVar2;
            if (aiVar3.getOrderIndex() < aiVar4.getOrderIndex()) {
                return -1;
            }
            if (aiVar3.getOrderIndex() == aiVar4.getOrderIndex()) {
                return 0;
            }
            return 1;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f37718a;

    /* renamed from: b  reason: collision with root package name */
    public m f37719b = new m();

    /* renamed from: c  reason: collision with root package name */
    public int f37720c = 50;

    /* renamed from: d  reason: collision with root package name */
    public v f37721d;

    /* renamed from: e  reason: collision with root package name */
    public x f37722e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f37723f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f37724g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f37725h = true;

    /* renamed from: i  reason: collision with root package name */
    boolean f37726i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f37727j = false;

    /* renamed from: k  reason: collision with root package name */
    public q f37728k;

    /* renamed from: l  reason: collision with root package name */
    public Map<Long, ao> f37729l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    public long f37730m = 0;
    long n = -1;
    boolean o = false;
    public bb p;
    private boolean r;
    private boolean s;

    @Override // com.bytedance.im.core.d.t
    public final void a(String str) {
        if (TextUtils.equals(this.f37718a, str)) {
            f.b("imsdk", "MessageModel onLeakRepairEnd, mRequestLoadOlder:" + this.r + ", mRequestLoadNewer" + this.s, (Throwable) null);
            if (this.r) {
                this.r = false;
                e();
            } else if (this.s) {
                this.s = false;
                i();
            }
        }
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(ai aiVar, boolean z) {
        v vVar;
        if (this.f37724g && (vVar = this.f37721d) != null) {
            vVar.a(aiVar, z);
        }
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(final List<ai> list, final int i2, final ar arVar) {
        if (!this.f37724g) {
            final AnonymousClass20 r3 = new b() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass20 */

                static {
                    Covode.recordClassIndex(22684);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                    ak.this.b(list, i2, arVar);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(Object obj) {
                    ak.this.b(list, i2, arVar);
                }
            };
            f.b("imsdk", "MessageModel loadNewerMessageListToEnd", (Throwable) null);
            if (!this.f37724g) {
                if (this.f37719b.isEmpty()) {
                    b();
                } else if (aa.a().a(this.f37718a)) {
                    f.b("imsdk", "MessageModel loadNewerMessageListToEnd checking now", (Throwable) null);
                    this.s = true;
                } else if (this.f37726i) {
                    f.b("imsdk", "MessageModel loadNewerMessageListToEnd querying now", (Throwable) null);
                    r3.a(u.a().a().f38031a);
                } else {
                    this.f37726i = true;
                    final ArrayList arrayList = new ArrayList(this.f37719b);
                    d.a(new c<List<ai>>() {
                        /* class com.bytedance.im.core.d.ak.AnonymousClass9 */

                        static {
                            Covode.recordClassIndex(22709);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.im.core.internal.e.c
                        public final /* synthetic */ List<ai> a() {
                            f.b("imsdk", "MessageModel loadNewerMessageListToEnd onRun", (Throwable) null);
                            ai f2 = ak.this.f();
                            h a2 = ak.this.a();
                            if (f2 == null || a2 == null || a2.getLastMessage() == null || f2.getIndex() >= a2.getLastMessage().getIndex()) {
                                return Collections.emptyList();
                            }
                            String str = ak.this.f37718a;
                            long index = f2.getIndex();
                            aa.a();
                            return i.a(str, index, aa.b(ak.this.f37718a, ak.b(arrayList)), 0, null, false);
                        }
                    }, new com.bytedance.im.core.internal.e.b<List<ai>>() {
                        /* class com.bytedance.im.core.d.ak.AnonymousClass10 */

                        static {
                            Covode.recordClassIndex(22673);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.im.core.internal.e.b
                        public final /* synthetic */ void a(List<ai> list) {
                            List<ai> list2 = list;
                            f.b("imsdk", "MessageModel onPerformLoadNewerToEnd onCallback", (Throwable) null);
                            ak.this.f37724g = true;
                            ak akVar = ak.this;
                            f.b("imsdk", "MessageModel onPerformLoadNewerToEnd, result:" + list2.size(), (Throwable) null);
                            Collections.reverse(list2);
                            akVar.f37719b.addList(list2);
                            akVar.f37726i = false;
                            akVar.d();
                            akVar.b(list2, true);
                            akVar.a(akVar.f37718a);
                            b bVar = r3;
                            if (bVar != null) {
                                bVar.a((Object) null);
                            }
                        }
                    });
                }
            }
        } else {
            b(list, i2, arVar);
        }
        this.p.a(h());
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(ai aiVar) {
        v vVar;
        if (this.f37719b.remove(aiVar) && (vVar = this.f37721d) != null) {
            vVar.a(aiVar);
        }
    }

    @Override // com.bytedance.im.core.d.v
    public void a(List<ai> list, int i2, String str) {
        v vVar = this.f37721d;
        if (vVar != null) {
            vVar.a(list, i2, str);
        }
        this.p.a(h());
        bb bbVar = this.p;
        com.bytedance.im.core.a.d a2 = com.bytedance.im.core.a.d.a();
        l.a((Object) a2, "");
        if (a2.b().aJ && bbVar.f37882f) {
            bbVar.f37880d.sendEmptyMessageDelayed(bbVar.f37877a, bbVar.f37878b);
        }
        if (com.bytedance.im.core.a.d.a().f37563c != null) {
            d.a(new c() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass23 */

                static {
                    Covode.recordClassIndex(22687);
                }

                @Override // com.bytedance.im.core.internal.e.c
                public final Object a() {
                    int[] iArr;
                    try {
                        ak akVar = ak.this;
                        if (com.bytedance.im.core.a.d.a().f37563c == null) {
                            return null;
                        }
                        m mVar = akVar.f37719b;
                        if (mVar == null || mVar.size() <= 0) {
                            iArr = new int[]{0, 0};
                        } else {
                            ArrayList<ai> arrayList = new ArrayList(mVar);
                            Collections.sort(arrayList, new Comparator<ai>() {
                                /* class com.bytedance.im.core.d.ak.AnonymousClass24 */

                                static {
                                    Covode.recordClassIndex(22688);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // java.util.Comparator
                                public final /* synthetic */ int compare(ai aiVar, ai aiVar2) {
                                    ai aiVar3 = aiVar;
                                    ai aiVar4 = aiVar2;
                                    if (aiVar3.getOrderIndex() > aiVar4.getOrderIndex()) {
                                        return 1;
                                    }
                                    if (aiVar3.getOrderIndex() < aiVar4.getOrderIndex()) {
                                        return -1;
                                    }
                                    return 0;
                                }
                            });
                            long j2 = 0;
                            int i2 = 0;
                            for (ai aiVar : arrayList) {
                                if (j2 > aiVar.getIndex()) {
                                    i2++;
                                }
                                j2 = aiVar.getIndex();
                            }
                            iArr = new int[]{arrayList.size(), i2};
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("receive_no", iArr[0]);
                            jSONObject.put("disordered_no", iArr[1]);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        f.a("sdk_enter_chat", jSONObject);
                        com.bytedance.im.core.c.d dVar = new com.bytedance.im.core.c.d();
                        dVar.f37623a = "message_data_source";
                        dVar.f37624b = "wrong_order";
                        dVar.a("total_count", Integer.valueOf(iArr[0])).a("count", Integer.valueOf(iArr[1])).a();
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }, (com.bytedance.im.core.internal.e.b) null);
        }
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(List<ai> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            this.f37719b.appendList(list);
        }
        v vVar = this.f37721d;
        if (vVar != null) {
            vVar.a(list, z);
        }
        this.p.a(h());
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(List<ai> list, Map<String, Map<String, String>> map) {
        if (list != null && !list.isEmpty()) {
            this.f37719b.updateList(list);
            v vVar = this.f37721d;
            if (vVar != null) {
                vVar.a(list, map);
            }
        }
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(ai aiVar, Map<String, List<ag>> map, Map<String, List<ag>> map2) {
        v vVar = this.f37721d;
        if (vVar != null) {
            vVar.a(aiVar, map, map2);
        }
    }

    public final void a(final String str, final ai aiVar, final b<Pair<List<Long>, List<Long>>> bVar) {
        j.a();
        j.a(str, new b<List<ParticipantMinIndex>>() {
            /* class com.bytedance.im.core.d.ak.AnonymousClass29 */

            static {
                Covode.recordClassIndex(22697);
            }

            @Override // com.bytedance.im.core.a.a.b
            public final void a(u uVar) {
                ak.this.b(aiVar, bVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.a.a.b
            public final /* synthetic */ void a(List<ParticipantMinIndex> list) {
                final List<ParticipantMinIndex> list2 = list;
                d.a(new c<Pair<Boolean, Map<Long, ao>>>() {
                    /* class com.bytedance.im.core.d.ak.AnonymousClass29.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(22698);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // com.bytedance.im.core.internal.e.c
                    public final /* synthetic */ Pair<Boolean, Map<Long, ao>> a() {
                        long j2;
                        long j3;
                        ak akVar = ak.this;
                        String str = str;
                        List list = list2;
                        if (TextUtils.isEmpty(str)) {
                            return null;
                        }
                        boolean b2 = akVar.b(str);
                        if (akVar.f37729l != null && !akVar.f37729l.isEmpty()) {
                            HashSet hashSet = new HashSet();
                            if (list != null && !list.isEmpty()) {
                                int size = list.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    ParticipantMinIndex participantMinIndex = (ParticipantMinIndex) list.get(i2);
                                    if (participantMinIndex != null) {
                                        if (participantMinIndex.user_id != null) {
                                            j2 = participantMinIndex.user_id.longValue();
                                        } else {
                                            j2 = 0;
                                        }
                                        if (participantMinIndex.index != null) {
                                            j3 = participantMinIndex.index.longValue();
                                        } else {
                                            j3 = Long.MIN_VALUE;
                                        }
                                        hashSet.add(Long.valueOf(j2));
                                        if (akVar.f37729l.get(Long.valueOf(j2)) != null && j3 > akVar.f37729l.get(Long.valueOf(j2)).f37820c) {
                                            akVar.f37729l.get(Long.valueOf(j2)).a(j3);
                                            b2 = true;
                                        }
                                    }
                                }
                            }
                        }
                        return new Pair(Boolean.valueOf(b2), akVar.f37729l);
                    }
                }, new com.bytedance.im.core.internal.e.b<Pair<Boolean, Map<Long, ao>>>() {
                    /* class com.bytedance.im.core.d.ak.AnonymousClass29.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(22699);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.im.core.internal.e.b
                    public final /* synthetic */ void a(Pair<Boolean, Map<Long, ao>> pair) {
                        Pair<Boolean, Map<Long, ao>> pair2 = pair;
                        if (pair2 != null) {
                            final Map<Long, ao> map = (Map) pair2.second;
                            if (map != null && !map.isEmpty()) {
                                Pair<List<Long>, List<Long>> a2 = ak.this.a(aiVar, map);
                                if (bVar != null) {
                                    bVar.a(a2);
                                }
                            } else if (bVar != null) {
                                bVar.a(new Pair(Collections.emptyList(), Collections.emptyList()));
                            }
                            if (((Boolean) pair2.first).booleanValue()) {
                                d.a(new c<Boolean>() {
                                    /* class com.bytedance.im.core.d.ak.AnonymousClass29.AnonymousClass2.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(22700);
                                    }

                                    /* Return type fixed from 'java.lang.Object' to match base method */
                                    @Override // com.bytedance.im.core.internal.e.c
                                    public final /* synthetic */ Boolean a() {
                                        return Boolean.valueOf(com.bytedance.im.core.internal.a.f.a(str, map));
                                    }
                                }, null, a.d());
                            }
                        } else if (bVar != null) {
                            bVar.a(u.a(k.a(-9999)));
                        }
                    }
                }, a.d());
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.d.ak.b(java.lang.String):boolean");
    }

    public final List<ai> h() {
        return new ArrayList(this.f37719b);
    }

    static {
        Covode.recordClassIndex(22671);
    }

    public final h a() {
        return j.a().a(this.f37718a);
    }

    public void b() {
        a(this.f37720c, "MessageModel.initMessageList.default", (b) null);
    }

    public final ai f() {
        if (this.f37719b.isEmpty()) {
            return null;
        }
        return (ai) this.f37719b.get(0);
    }

    public final ai g() {
        if (this.f37719b.isEmpty()) {
            return null;
        }
        m mVar = this.f37719b;
        return (ai) mVar.get(mVar.size() - 1);
    }

    public void c() {
        if (aa.a().a(this.f37718a)) {
            f.b("imsdk", "MessageModel requestHistoryMessage checking now", (Throwable) null);
            return;
        }
        final ArrayList arrayList = new ArrayList(this.f37719b);
        d.a(new c<Boolean>() {
            /* class com.bytedance.im.core.d.ak.AnonymousClass2 */

            static {
                Covode.recordClassIndex(22683);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ Boolean a() {
                boolean z;
                aa.a();
                long a2 = aa.a(ak.this.f37718a, ak.a(arrayList));
                long d2 = i.d(ak.this.f37718a);
                f.b("imsdk", "MessageModel requestHistoryMessage onRun, cid:" + ak.this.f37718a + ", loadOlderMinIndex:" + a2 + ", minIndex:" + d2, (Throwable) null);
                if (a2 <= 0 || d2 >= a2) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, new com.bytedance.im.core.internal.e.b<Boolean>() {
            /* class com.bytedance.im.core.d.ak.AnonymousClass3 */

            static {
                Covode.recordClassIndex(22701);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                f.b("imsdk", "MessageModel requestHistoryMessage onCallback, cid:" + ak.this.f37718a + ", result:" + bool2, (Throwable) null);
                if (bool2.booleanValue()) {
                    x.a();
                    String str = ak.this.f37718a;
                    ac acVar = new ac();
                    h a2 = j.a().a(str);
                    if (a2 == null || !a2.hasMore() || a2.isLocal()) {
                        q.a().b(str, (List<ai>) null);
                    } else {
                        d.a(new c<Long>(str, a2) {
                            /* class com.bytedance.im.core.internal.b.a.ac.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ String f38272a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ h f38273b;

                            static {
                                Covode.recordClassIndex(22923);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // com.bytedance.im.core.internal.e.c
                            public final /* synthetic */ Long a() {
                                long d2 = i.d(this.f38272a);
                                if (d2 <= 0) {
                                    return Long.valueOf(this.f38273b.getLastMessageIndex());
                                }
                                return Long.valueOf(d2);
                            }

                            {
                                this.f38272a = r2;
                                this.f38273b = r3;
                            }
                        }, new com.bytedance.im.core.internal.e.b<Long>(str, a2) {
                            /* class com.bytedance.im.core.internal.b.a.ac.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ String f38275a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ h f38276b;

                            static {
                                Covode.recordClassIndex(22924);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.bytedance.im.core.internal.e.b
                            public final /* synthetic */ void a(Long l2) {
                                Long l3 = l2;
                                if (l3.longValue() == -1) {
                                    q.a().b(this.f38275a, (List<ai>) null);
                                    return;
                                }
                                ac acVar = ac.this;
                                h hVar = this.f38276b;
                                RequestBody build = new RequestBody.Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(hVar.getConversationId()).conversation_short_id(Long.valueOf(hVar.getConversationShortId())).conversation_type(Integer.valueOf(hVar.getConversationType())).direction(MessageDirection.OLDER).anchor_index(Long.valueOf(l3.longValue())).build()).build();
                                acVar.a(hVar.getInboxType(), build, null, hVar.getConversationId());
                            }

                            {
                                this.f38275a = r2;
                                this.f38276b = r3;
                            }
                        }, a.c());
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (!this.f37724g) {
            if (aa.a().a(this.f37718a)) {
                f.b("imsdk", "MessageModel requestNewerMessage checking now", (Throwable) null);
                return;
            }
            final ArrayList arrayList = new ArrayList(this.f37719b);
            d.a(new c<Boolean>() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(22704);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Boolean a() {
                    boolean z;
                    aa.a();
                    long b2 = aa.b(ak.this.f37718a, ak.b(arrayList));
                    long e2 = i.e(ak.this.f37718a);
                    f.b("imsdk", "MessageModel requestNewerMessage onRun, cid:" + ak.this.f37718a + ", loadNewerMaxIndex:" + b2 + ", maxIndex:" + e2, (Throwable) null);
                    if (b2 <= 0 || e2 <= b2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }, new com.bytedance.im.core.internal.e.b<Boolean>() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(22705);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(Boolean bool) {
                    Boolean bool2 = bool;
                    f.b("imsdk", "MessageModel requestNewerMessage onCallback, cid:" + ak.this.f37718a + ", result:" + bool2, (Throwable) null);
                    if (bool2.booleanValue()) {
                        x.a();
                        String str = ak.this.f37718a;
                        af afVar = new af();
                        h a2 = j.a().a(str);
                        if (a2 == null || a2.isLocal()) {
                            q.a().c(str, (List<ai>) null);
                        } else {
                            d.a(new c<Long>(str, a2) {
                                /* class com.bytedance.im.core.internal.b.a.af.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ String f38299a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ h f38300b;

                                static {
                                    Covode.recordClassIndex(22934);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // com.bytedance.im.core.internal.e.c
                                public final /* synthetic */ Long a() {
                                    long e2 = i.e(this.f38299a);
                                    if (e2 <= 0) {
                                        return Long.valueOf(this.f38300b.getMinIndex());
                                    }
                                    return Long.valueOf(e2);
                                }

                                {
                                    this.f38299a = r2;
                                    this.f38300b = r3;
                                }
                            }, new com.bytedance.im.core.internal.e.b<Long>(str, a2) {
                                /* class com.bytedance.im.core.internal.b.a.af.AnonymousClass2 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ String f38302a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ h f38303b;

                                static {
                                    Covode.recordClassIndex(22935);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.im.core.internal.e.b
                                public final /* synthetic */ void a(Long l2) {
                                    Long l3 = l2;
                                    if (l3.longValue() == -1) {
                                        q.a().c(this.f38302a, (List<ai>) null);
                                        return;
                                    }
                                    af afVar = af.this;
                                    h hVar = this.f38303b;
                                    RequestBody build = new RequestBody.Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(hVar.getConversationId()).conversation_short_id(Long.valueOf(hVar.getConversationShortId())).conversation_type(Integer.valueOf(hVar.getConversationType())).direction(MessageDirection.NEWER).anchor_index(Long.valueOf(l3.longValue())).build()).build();
                                    afVar.a(hVar.getInboxType(), build, null, hVar.getConversationId());
                                }

                                {
                                    this.f38302a = r2;
                                    this.f38303b = r3;
                                }
                            }, a.c());
                        }
                    }
                }
            });
        }
    }

    private void i() {
        f.b("imsdk", "MessageModel loadNewerMessageList", (Throwable) null);
        if (this.f37724g) {
            b((List<ai>) null, true);
        } else if (this.f37719b.isEmpty()) {
            b((List<ai>) null, false);
            b();
        } else if (aa.a().a(this.f37718a)) {
            f.b("imsdk", "MessageModel loadNewerMessageList checking now", (Throwable) null);
            this.s = true;
            b((List<ai>) null, false);
        } else if (this.f37726i) {
            f.b("imsdk", "MessageModel loadNewerMessageList querying now", (Throwable) null);
            b((List<ai>) null, false);
        } else {
            this.f37726i = true;
            final ArrayList arrayList = new ArrayList(this.f37719b);
            d.a(new c<List<ai>>() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(22707);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ List<ai> a() {
                    f.b("imsdk", "MessageModel loadNewerMessageList onRun", (Throwable) null);
                    ai f2 = ak.this.f();
                    h a2 = ak.this.a();
                    if (f2 == null || a2 == null || a2.getLastMessage() == null || f2.getIndex() >= a2.getLastMessage().getIndex()) {
                        return Collections.emptyList();
                    }
                    String str = ak.this.f37718a;
                    long index = f2.getIndex();
                    aa.a();
                    return i.a(str, index, aa.b(ak.this.f37718a, ak.b(arrayList)), ak.this.f37720c + 5);
                }
            }, new com.bytedance.im.core.internal.e.b<List<ai>>() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(22708);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(List<ai> list) {
                    List<ai> list2 = list;
                    if (list2.size() > ak.this.f37720c) {
                        list2 = list2.subList(list2.size() - ak.this.f37720c, list2.size());
                        ak.this.f37724g = false;
                    } else {
                        ak.this.f37724g = true;
                    }
                    f.b("imsdk", "MessageModel loadNewerMessageList onCallback", (Throwable) null);
                    ak akVar = ak.this;
                    f.b("imsdk", "MessageModel onPerformLoadNewer, result:" + list2.size(), (Throwable) null);
                    Collections.reverse(list2);
                    akVar.f37719b.addList(list2);
                    akVar.f37726i = false;
                    if (list2.size() < akVar.f37720c) {
                        f.b("imsdk", "MessageModel onProcessLoadMore, less than limit, loadNewer", (Throwable) null);
                        akVar.d();
                    }
                    akVar.b(list2, true);
                    akVar.a(akVar.f37718a);
                }
            });
        }
    }

    public final void e() {
        f.b("imsdk", "MessageModel loadOlderMessageList", (Throwable) null);
        if (a() == null) {
            a((List<ai>) null, false);
        } else if (this.f37726i) {
            f.b("imsdk", "MessageModel loadOlderMessageList querying now", (Throwable) null);
            a((List<ai>) null, false);
        } else if (aa.a().a(this.f37718a)) {
            f.b("imsdk", "MessageModel loadOlderMessageList checking now", (Throwable) null);
            this.r = true;
            a((List<ai>) null, false);
        } else {
            this.f37726i = true;
            final ArrayList arrayList = new ArrayList(this.f37719b);
            d.a(new c<List<ai>>() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass11 */

                static {
                    Covode.recordClassIndex(22674);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public List<ai> a() {
                    f.b("imsdk", "MessageModel loadOlderMessageList onRun", (Throwable) null);
                    ai g2 = ak.this.g();
                    if (g2 == null) {
                        return null;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    String str = ak.this.f37718a;
                    long index = g2.getIndex();
                    aa.a();
                    List<ai> a2 = i.a(str, index, aa.a(ak.this.f37718a, ak.a(arrayList)), ak.this.f37720c, null);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        e.a("im_load_more_msg_duration", jSONObject);
                    } catch (Exception unused) {
                    }
                    return a2;
                }
            }, new com.bytedance.im.core.internal.e.b<List<ai>>() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass12 */

                static {
                    Covode.recordClassIndex(22675);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(List<ai> list) {
                    Integer valueOf;
                    List<ai> list2 = list;
                    f.b("imsdk", "MessageModel loadOlderMessageList onCallback", (Throwable) null);
                    ak akVar = ak.this;
                    StringBuilder sb = new StringBuilder("MessageModel onPerformLoadMore, result:");
                    if (list2 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(list2.size());
                    }
                    f.b("imsdk", sb.append(valueOf).toString(), (Throwable) null);
                    akVar.f37726i = false;
                    if (list2 == null || list2.size() < akVar.f37720c) {
                        f.b("imsdk", "MessageModel onProcessLoadMore, less than limit, loadHistory", (Throwable) null);
                        akVar.c();
                    }
                    akVar.a(list2, true);
                    akVar.a(akVar.f37718a);
                }
            });
        }
    }

    public static void b(final ai aiVar) {
        f.b("imsdk", "MessageModel updateMessage", (Throwable) null);
        d.a(new c<ai>() {
            /* class com.bytedance.im.core.d.ak.AnonymousClass15 */

            static {
                Covode.recordClassIndex(22678);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* bridge */ /* synthetic */ ai a() {
                if (i.a(aiVar, true, true)) {
                    return aiVar;
                }
                return null;
            }
        }, new com.bytedance.im.core.internal.e.b<ai>(null) {
            /* class com.bytedance.im.core.d.ak.AnonymousClass16 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f37740a = null;

            static {
                Covode.recordClassIndex(22679);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(ai aiVar) {
                if (aiVar != null) {
                    q.a().a(Collections.singletonList(aiVar));
                    b bVar = this.f37740a;
                    if (bVar != null) {
                        bVar.a(aiVar);
                        return;
                    }
                    return;
                }
                b bVar2 = this.f37740a;
                if (bVar2 != null) {
                    bVar2.a(u.a(k.a(-3001)));
                }
            }
        });
    }

    public static long a(List<ai> list) {
        if (list.isEmpty()) {
            return 0;
        }
        s.a();
        long d2 = s.d();
        long j2 = Long.MAX_VALUE;
        for (ai aiVar : list) {
            long indexInConversationV2 = aiVar.getIndexInConversationV2();
            if (indexInConversationV2 >= d2) {
                j2 = Math.min(indexInConversationV2, j2);
            }
        }
        if (j2 != Long.MAX_VALUE) {
            return j2;
        }
        return 0;
    }

    public static long b(List<ai> list) {
        if (list.isEmpty()) {
            return 0;
        }
        s.a();
        long d2 = s.d();
        long j2 = Long.MIN_VALUE;
        for (ai aiVar : list) {
            long indexInConversationV2 = aiVar.getIndexInConversationV2();
            if (indexInConversationV2 >= d2) {
                j2 = Math.max(indexInConversationV2, j2);
            }
        }
        if (j2 != Long.MIN_VALUE) {
            return j2;
        }
        return 0;
    }

    public static void a(ai aiVar, b<ai> bVar) {
        x.a();
        x.a(aiVar, bVar);
    }

    public ak(String str, boolean z) {
        f.b("imsdk", "MessageModel constructor, conversationId:" + str + ", unreadLiveControl:true, enableMsgRead:" + z, (Throwable) null);
        this.f37718a = str;
        this.f37723f = true;
        this.f37727j = z;
        if (z) {
            f.b("imsdk", "MessageModel enter conversation request minIndex", (Throwable) null);
            a(this.f37718a, (ai) null, (b<Pair<List<Long>, List<Long>>>) null);
            this.f37728k = new q() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(22706);
                }

                @Override // com.bytedance.im.core.d.q
                public final void a(h hVar) {
                    if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId()) && hVar.getConversationId().equals(ak.this.f37718a)) {
                        f.b("imsdk", "MessageModel onMemberChange", (Throwable) null);
                        ak akVar = ak.this;
                        akVar.a(akVar.f37718a, (ai) null, (b<Pair<List<Long>, List<Long>>>) null);
                    }
                }
            };
        }
        this.p = new bb(this.f37718a, com.bytedance.im.core.a.d.a().b().aJ);
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(final int i2, final ai aiVar) {
        if (aiVar.getLocalCache(-1) != null || this.f37724g) {
            b(i2, aiVar);
        } else {
            a(this.f37720c, "MessageModel.onAddMessage", new b() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass19 */

                static {
                    Covode.recordClassIndex(22682);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                    ak.this.b(i2, aiVar);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(Object obj) {
                    ak.this.b(i2, aiVar);
                }
            });
        }
    }

    public final void b(int i2, ai aiVar) {
        f.b("imsdk", "MessageModel onAddMessageInner, mUptoNewest:" + this.f37724g, (Throwable) null);
        if (this.f37724g) {
            if (aiVar != null) {
                this.f37719b.add(aiVar);
                if (this.f37719b.size() > 3000) {
                    this.f37719b = new m(this.f37719b.subList(0, 3000));
                }
            }
            v vVar = this.f37721d;
            if (vVar != null) {
                vVar.a(i2, aiVar);
            }
        }
    }

    public final Pair<List<Long>, List<Long>> a(ai aiVar, Map<Long, ao> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId()) && aiVar.getConversationId().equals(this.f37718a) && map != null && !map.isEmpty()) {
            for (Map.Entry<Long, ao> entry : map.entrySet()) {
                if (!(entry == null || entry.getValue() == null || entry.getValue().f37819b == com.bytedance.im.core.a.d.a().f37562b.a() || Math.abs(entry.getValue().f37820c) > aiVar.getIndex())) {
                    arrayList2.add(Long.valueOf(entry.getValue().f37819b));
                    if (!aiVar.isIndexLocal() && (entry.getValue().f37822e >= aiVar.getOrderIndex() || (entry.getValue().f37821d >= aiVar.getIndex() && !entry.getValue().b()))) {
                        arrayList.add(Long.valueOf(entry.getValue().f37819b));
                    }
                }
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public final void b(final ai aiVar, final b<Pair<List<Long>, List<Long>>> bVar) {
        f.b("imsdk", "read_receiptgetReadAndAllByLocal", (Throwable) null);
        d.a(new c<Map<Long, ao>>() {
            /* class com.bytedance.im.core.d.ak.AnonymousClass30 */

            static {
                Covode.recordClassIndex(22702);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ Map<Long, ao> a() {
                ai aiVar = aiVar;
                if (aiVar == null || !aiVar.isSelf() || aiVar.isDeleted() || !n.c(aiVar) || TextUtils.isEmpty(aiVar.getConversationId()) || !aiVar.getConversationId().equals(ak.this.f37718a)) {
                    return null;
                }
                if (ak.this.f37729l == null || ak.this.f37729l.isEmpty()) {
                    ak.this.f37729l = com.bytedance.im.core.internal.a.f.c(aiVar.getConversationId(), ak.this.f37729l);
                }
                return ak.this.f37729l;
            }
        }, new com.bytedance.im.core.internal.e.b<Map<Long, ao>>() {
            /* class com.bytedance.im.core.d.ak.AnonymousClass31 */

            static {
                Covode.recordClassIndex(22703);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(Map<Long, ao> map) {
                Map<Long, ao> map2 = map;
                if (map2 == null || map2.isEmpty()) {
                    b bVar = bVar;
                    if (bVar != null) {
                        bVar.a(new Pair(Collections.emptyList(), Collections.emptyList()));
                        return;
                    }
                    return;
                }
                Pair<List<Long>, List<Long>> a2 = ak.this.a(aiVar, map2);
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(a2);
                }
            }
        }, a.d());
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(int i2, an anVar) {
        v vVar = this.f37721d;
        if (vVar != null) {
            vVar.a(i2, anVar);
        }
    }

    @Override // com.bytedance.im.core.d.v
    public final void b(List<ai> list, boolean z) {
        v vVar = this.f37721d;
        if (vVar != null) {
            vVar.b(list, z);
        }
        this.p.a(h());
    }

    @Override // com.bytedance.im.core.d.x
    public final void a(int i2, int i3, ai aiVar) {
        if (this.f37722e != null && aiVar != null && TextUtils.equals(this.f37718a, aiVar.getConversationId())) {
            this.f37722e.a(i2, i3, aiVar);
        }
    }

    public final void b(int i2, ai aiVar, ay ayVar) {
        if (this.f37724g) {
            if (aiVar != null && i2 == e.b.f37585a) {
                this.f37719b.add(aiVar);
                if (this.f37719b.size() > 3000) {
                    this.f37719b = new m(this.f37719b.subList(0, 3000));
                }
            }
            v vVar = this.f37721d;
            if (vVar != null) {
                vVar.a(i2, aiVar, ayVar);
            }
        }
    }

    @Override // com.bytedance.im.core.d.v
    public final void a(final int i2, final ai aiVar, final ay ayVar) {
        f.b("imsdk", "MessageModel onSendMessage statusCode=" + i2 + " message=" + aiVar, (Throwable) null);
        if (!this.f37724g) {
            a(this.f37720c, "MessageModel.onSendMessage", new b() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass18 */

                static {
                    Covode.recordClassIndex(22681);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                    ak.this.b(i2, aiVar, ayVar);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(Object obj) {
                    ak.this.b(i2, aiVar, ayVar);
                }
            });
        } else {
            b(i2, aiVar, ayVar);
        }
    }

    public final void b(final List<ai> list, final int i2, final ar arVar) {
        Integer num;
        StringBuilder sb = new StringBuilder("MessageModel onGetMessage, list:");
        final ai aiVar = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        f.b("imsdk", sb.append(num).append(", msgSource:").append(i2).append(", mUptoNewest:").append(this.f37724g).toString(), (Throwable) null);
        if (this.f37724g) {
            Iterator it = this.f37719b.iterator();
            final long j2 = 0;
            while (it.hasNext()) {
                ai aiVar2 = (ai) it.next();
                if (aiVar2 != null) {
                    j2 = Math.max(j2, aiVar2.getIndexInConversationV2());
                }
            }
            if (!this.f37719b.isEmpty()) {
                aiVar = (ai) this.f37719b.get(0);
            }
            d.a(new c<List<ai>>() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass21 */

                static {
                    Covode.recordClassIndex(22685);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ List<ai> a() {
                    f.b("imsdk", "MessageModel onGetMessage, onRun", (Throwable) null);
                    return aa.a().a(ak.this.f37718a, j2, aiVar, list);
                }
            }, new com.bytedance.im.core.internal.e.b<List<ai>>() {
                /* class com.bytedance.im.core.d.ak.AnonymousClass22 */

                static {
                    Covode.recordClassIndex(22686);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(List<ai> list) {
                    List<ai> list2 = list;
                    ak akVar = ak.this;
                    int i2 = i2;
                    ar arVar = arVar;
                    f.b("imsdk", "MessageModel onPerformGetMessage, result:" + com.bytedance.im.core.internal.utils.e.a((List) list2), (Throwable) null);
                    if (akVar.f37727j) {
                        d.a(new c<Pair<Boolean, Map<Long, ao>>>(list2) {
                            /* class com.bytedance.im.core.d.ak.AnonymousClass26 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ List f37773a;

                            static {
                                Covode.recordClassIndex(22693);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // com.bytedance.im.core.internal.e.c
                            public final /* synthetic */ Pair<Boolean, Map<Long, ao>> a() {
                                List list = this.f37773a;
                                if (list == null || list.isEmpty()) {
                                    return null;
                                }
                                ArrayList<ai> arrayList = new ArrayList(this.f37773a);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ai aiVar = (ai) it.next();
                                    if (aiVar == null || aiVar.isSelf() || TextUtils.isEmpty(aiVar.getConversationId()) || !aiVar.getConversationId().equals(ak.this.f37718a)) {
                                        it.remove();
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    return null;
                                }
                                ak akVar = ak.this;
                                boolean b2 = akVar.b(akVar.f37718a);
                                f.b("imsdk", "updateReadIndexOnGetOtherMsg before update readIndex mReadStatusMap=" + com.bytedance.im.core.internal.utils.h.f38770a.b(ak.this.f37729l), (Throwable) null);
                                for (ai aiVar2 : arrayList) {
                                    long index = aiVar2.getIndex();
                                    long orderIndex = aiVar2.getOrderIndex();
                                    long sender = aiVar2.getSender();
                                    ao aoVar = ak.this.f37729l.get(Long.valueOf(sender));
                                    if (aoVar != null) {
                                        if (aoVar.b()) {
                                            if (orderIndex > aoVar.f37822e) {
                                                aoVar.b(index);
                                                aoVar.c(orderIndex);
                                                ak.this.f37729l.put(Long.valueOf(sender), aoVar);
                                            }
                                        } else if (index >= aoVar.f37821d) {
                                            aoVar.b(index);
                                            aoVar.c(orderIndex);
                                            ak.this.f37729l.put(Long.valueOf(sender), aoVar);
                                        }
                                        b2 = true;
                                    }
                                }
                                f.b("imsdk", "updateReadIndexOnGetOtherMsg after update readIndex mReadStatusMap=" + com.bytedance.im.core.internal.utils.h.f38770a.b(ak.this.f37729l), (Throwable) null);
                                return new Pair(Boolean.valueOf(b2), ak.this.f37729l);
                            }

                            {
                                this.f37773a = r2;
                            }
                        }, new com.bytedance.im.core.internal.e.b<Pair<Boolean, Map<Long, ao>>>() {
                            /* class com.bytedance.im.core.d.ak.AnonymousClass27 */

                            static {
                                Covode.recordClassIndex(22694);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.bytedance.im.core.internal.e.b
                            public final /* synthetic */ void a(Pair<Boolean, Map<Long, ao>> pair) {
                                final Pair<Boolean, Map<Long, ao>> pair2 = pair;
                                if (pair2 != null && ((Boolean) pair2.first).booleanValue()) {
                                    d.a(new c<Boolean>() {
                                        /* class com.bytedance.im.core.d.ak.AnonymousClass27.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(22695);
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        @Override // com.bytedance.im.core.internal.e.c
                                        public final /* synthetic */ Boolean a() {
                                            com.bytedance.im.core.internal.a.f.a(ak.this.f37718a, (Map) pair2.second);
                                            return true;
                                        }
                                    }, null, a.d());
                                }
                            }
                        }, a.d());
                    }
                    if (list2 != null && !list2.isEmpty()) {
                        akVar.f37719b.addList(list2);
                        if (akVar.f37721d != null) {
                            akVar.f37721d.a(list2, i2, arVar);
                        }
                    }
                    akVar.p.a(akVar.h());
                }
            }, a.d());
        }
    }

    public void a(final int i2, final String str, final b bVar) {
        f.b("imsdk", "MessageModel initMessageList", (Throwable) null);
        if (this.f37726i) {
            f.b("imsdk", "MessageModel initMessageList mLocalDBQuerying, return", (Throwable) null);
            if (bVar != null) {
                bVar.a(u.a().a().f38031a);
                return;
            }
            return;
        }
        this.f37726i = true;
        this.n = SystemClock.uptimeMillis();
        d.a(new c<Pair<List<ai>, y>>() {
            /* class com.bytedance.im.core.d.ak.AnonymousClass17 */

            static {
                Covode.recordClassIndex(22680);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public Pair<List<ai>, y> a() {
                f.b("imsdk", "MessageModel initMessageList onRun", (Throwable) null);
                long uptimeMillis = SystemClock.uptimeMillis();
                List<ai> a2 = i.a(ak.this.f37718a, i2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                    com.bytedance.im.core.c.e.a("im_init_msg_duration", jSONObject);
                } catch (Exception unused) {
                }
                aa a3 = aa.a();
                String str = ak.this.f37718a;
                f.b("imsdk", "LeakMsgRepairManager onModelInit, cid:" + str + ", list:" + com.bytedance.im.core.internal.utils.e.a((List) a2) + ", repair:true", (Throwable) null);
                long uptimeMillis2 = SystemClock.uptimeMillis();
                y yVar = new y();
                List<ai> a4 = aa.a(str, a2, yVar);
                yVar.f38035d = a4.size();
                yVar.f38043l = SystemClock.uptimeMillis() - uptimeMillis2;
                if (TextUtils.isEmpty(str) || a3.f37656c.contains(str)) {
                    f.b("imsdk", "LeakMsgRepairManager triggerRepair, cid:" + str + ", already doing", (Throwable) null);
                } else {
                    s.a();
                    if (!s.c()) {
                        f.b("imsdk", "LeakMsgRepairManager triggerRepair, cid:" + str + ", no recent mode", (Throwable) null);
                    } else {
                        a3.f37656c.add(str);
                        d.a(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d1: INVOKE  
                              (wrap: com.bytedance.im.core.d.aa$1 : 0x00c5: CONSTRUCTOR  (r2v1 com.bytedance.im.core.d.aa$1) = (r7v1 'a3' com.bytedance.im.core.d.aa), (r6v0 'str' java.lang.String) call: com.bytedance.im.core.d.aa.1.<init>(com.bytedance.im.core.d.aa, java.lang.String):void type: CONSTRUCTOR)
                              (wrap: com.bytedance.im.core.d.aa$2 : 0x00ca: CONSTRUCTOR  (r1v7 com.bytedance.im.core.d.aa$2) = (r7v1 'a3' com.bytedance.im.core.d.aa), (r6v0 'str' java.lang.String) call: com.bytedance.im.core.d.aa.2.<init>(com.bytedance.im.core.d.aa, java.lang.String):void type: CONSTRUCTOR)
                              (wrap: java.util.concurrent.Executor : 0x00cd: INVOKE  (r0v23 java.util.concurrent.Executor) =  type: STATIC call: com.bytedance.im.core.internal.e.a.a():java.util.concurrent.Executor)
                             type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b, java.util.concurrent.Executor):void in method: com.bytedance.im.core.d.ak.17.b():android.util.Pair<java.util.List<com.bytedance.im.core.d.ai>, com.bytedance.im.core.d.y>, file: classes10.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c5: CONSTRUCTOR  (r2v1 com.bytedance.im.core.d.aa$1) = (r7v1 'a3' com.bytedance.im.core.d.aa), (r6v0 'str' java.lang.String) call: com.bytedance.im.core.d.aa.1.<init>(com.bytedance.im.core.d.aa, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.im.core.d.ak.17.b():android.util.Pair<java.util.List<com.bytedance.im.core.d.ai>, com.bytedance.im.core.d.y>, file: classes10.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 24 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.d.aa, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 30 more
                            */
                        /*
                        // Method dump skipped, instructions count: 213
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.d.ak.AnonymousClass17.a():android.util.Pair");
                    }
                }, new com.bytedance.im.core.internal.e.b<Pair<List<ai>, y>>() {
                    /* class com.bytedance.im.core.d.ak.AnonymousClass28 */

                    static {
                        Covode.recordClassIndex(22696);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX WARNING: Removed duplicated region for block: B:18:0x0098  */
                    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a  */
                    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ad  */
                    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
                    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b6  */
                    @Override // com.bytedance.im.core.internal.e.b
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ void a(android.util.Pair<java.util.List<com.bytedance.im.core.d.ai>, com.bytedance.im.core.d.y> r19) {
                        /*
                        // Method dump skipped, instructions count: 467
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.d.ak.AnonymousClass28.a(java.lang.Object):void");
                    }
                });
            }
        }
