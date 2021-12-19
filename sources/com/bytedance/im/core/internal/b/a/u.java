package com.bytedance.im.core.internal.b.a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.c.g;
import com.bytedance.im.core.c.h;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.ar;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.g.b;
import com.bytedance.im.core.internal.b.a;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.utils.e;
import com.bytedance.im.core.internal.utils.l;
import com.bytedance.im.core.internal.utils.n;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserRequestBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class u extends w {

    /* renamed from: a  reason: collision with root package name */
    public int f38571a;

    /* renamed from: b  reason: collision with root package name */
    public int f38572b;

    /* renamed from: c  reason: collision with root package name */
    public int f38573c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f38574d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f38575e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f38576f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f38577g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f38578h = 0;

    /* renamed from: i  reason: collision with root package name */
    public long f38579i = 0;

    /* renamed from: j  reason: collision with root package name */
    public long f38580j = 0;

    /* renamed from: k  reason: collision with root package name */
    public long f38581k = 0;

    /* renamed from: l  reason: collision with root package name */
    public long f38582l = 0;

    /* renamed from: m  reason: collision with root package name */
    public long f38583m = 0;
    public long n = 0;
    public k o = null;
    private long q;
    private long r;
    private long s = 0;
    private long t = 0;

    static {
        Covode.recordClassIndex(23043);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public final void c() {
        if (!this.f38574d) {
            f.b("imsdk", "GetMsgByUserHandler recordExceptionWhileSaveMsg", (Throwable) null);
            s.a();
            long a2 = s.a(this.f38571a);
            s.a();
            String a3 = s.a(this.f38571a, "error_cursor");
            String b2 = s.f38859a.b(a3, (String) null);
            if (!TextUtils.isEmpty(b2)) {
                String[] split = b2.split(":");
                if (split.length == 2) {
                    long a4 = e.a(split[0], 0L);
                    int a5 = e.a(split[1], 0);
                    f.b("imsdk", "SPUtils getErrorCursor, key:" + a3 + ", cursor:" + a4 + ", count:" + a5, (Throwable) null);
                    Pair pair = new Pair(Long.valueOf(a4), Integer.valueOf(a5));
                    long longValue = ((Long) pair.first).longValue();
                    int intValue = ((Integer) pair.second).intValue();
                    if (longValue != a2) {
                        s.a();
                        s.a(this.f38571a, a2, 1);
                    } else if (intValue == 2) {
                        f.b("imsdk", "GetMsgByUserHandler cursor always fail, skip: ".concat(String.valueOf(a2)), (Throwable) null);
                        return;
                    } else {
                        s.a();
                        s.a(this.f38571a, a2, intValue + 1);
                    }
                    this.f38574d = true;
                }
            }
            s.a();
            s.a(this.f38571a, a2, 1);
            this.f38574d = true;
        }
    }

    private void b(int i2) {
        boolean z;
        if (this.f38572b != 8) {
            d.a().f37562b.b(this.f38571a, i2);
        }
        q.a();
        if (i2 == 5) {
            z = true;
        } else {
            z = false;
        }
        q.a(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.messages_per_user_body == null) {
            return false;
        }
        return true;
    }

    u(int i2) {
        super(IMCMD.GET_MESSAGES_BY_USER.getValue());
        this.f38571a = i2;
    }

    public static Map<String, ConversationBadgeCountInfo> a(MessagesPerUserResponseBody messagesPerUserResponseBody) {
        HashMap hashMap = new HashMap();
        if (messagesPerUserResponseBody.conversation_badge_count == null) {
            return hashMap;
        }
        for (ConversationBadgeCountInfo conversationBadgeCountInfo : messagesPerUserResponseBody.conversation_badge_count) {
            if (!(conversationBadgeCountInfo == null || TextUtils.isEmpty(conversationBadgeCountInfo.conversation_id) || conversationBadgeCountInfo.badge_count == null)) {
                hashMap.put(conversationBadgeCountInfo.conversation_id, conversationBadgeCountInfo);
            }
        }
        return hashMap;
    }

    public final void a(int i2) {
        Log.getStackTraceString(new Exception());
        if (!(i2 == 9 || l.a().b() == 0)) {
            b.a(3, i2);
        }
        this.q = SystemClock.uptimeMillis();
        s.a();
        a(i2, s.a(this.f38571a));
    }

    private void a(int i2, long j2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (a.b(this.f38571a) || a.i(this.f38571a)) {
            f.b("imsdk", "GetMsgByUserHandler pull, reason:" + i2 + ", inbox:" + this.f38571a + ", already doing, return", (Throwable) null);
            return;
        }
        f.b("imsdk", "GetMsgByUserHandler pull, reason:" + i2 + ", inbox:" + this.f38571a + ", cursor:" + j2, (Throwable) null);
        if (i2 != 1) {
            this.f38573c = i2;
        }
        this.f38572b = i2;
        if (i2 != 1) {
            b(i2);
        }
        a.c(this.f38571a);
        MessagesPerUserRequestBody.Builder cursor = new MessagesPerUserRequestBody.Builder().cursor(Long.valueOf(j2));
        if (this.f38572b == 8) {
            cursor.interval(Long.valueOf(com.bytedance.im.core.f.a.a().b()));
        }
        if (this.f38572b == 0) {
            d.a();
        }
        a(this.f38571a, new RequestBody.Builder().messages_per_user_body(cursor.build()).build(), null, new Object[0]);
        this.s += SystemClock.uptimeMillis() - uptimeMillis;
        this.r = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        boolean z;
        Integer valueOf;
        this.t += SystemClock.uptimeMillis() - this.r;
        this.o = kVar;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (!kVar.l() || !a(kVar)) {
            z = false;
        } else {
            z = true;
        }
        f.b("imsdk", "GetMsgByUserHandler handleResponse, seqId:" + kVar.f38720a + ", success:" + z, (Throwable) null);
        if (z) {
            this.n = System.currentTimeMillis();
            final MessagesPerUserResponseBody messagesPerUserResponseBody = kVar.f38725f.body.messages_per_user_body;
            if (messagesPerUserResponseBody.messages != null && messagesPerUserResponseBody.messages.size() > 0) {
                this.f38583m += SystemClock.uptimeMillis() - uptimeMillis;
                final long j2 = kVar.f38720a;
                final long uptimeMillis2 = SystemClock.uptimeMillis();
                final List<MessageBody> list = messagesPerUserResponseBody.messages;
                final Boolean bool = messagesPerUserResponseBody.has_more;
                Long l2 = messagesPerUserResponseBody.next_cursor;
                Long l3 = messagesPerUserResponseBody.next_conversation_version;
                StringBuilder sb = new StringBuilder("GetMsgByUserHandler saveMsg, messages:");
                if (list == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(list.size());
                }
                f.b("imsdk", sb.append(valueOf).append(", hasMore:").append(bool).append(", nextCursor:").append(l2).append(", nextVersion:").append(l3).append(", seqId:").append(j2).toString(), (Throwable) null);
                com.bytedance.im.core.internal.e.d.a(new c<Map<String, List<ai>>>() {
                    /* class com.bytedance.im.core.internal.b.a.u.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(23044);
                    }

                    /* access modifiers changed from: private */
                    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01b8, code lost:
                        if (com.bytedance.im.core.internal.utils.s.c() != false) goto L_0x01e8;
                     */
                    /* renamed from: b */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public java.util.Map<java.lang.String, java.util.List<com.bytedance.im.core.d.ai>> a() {
                        /*
                        // Method dump skipped, instructions count: 807
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.u.AnonymousClass1.a():java.util.Map");
                    }
                }, new com.bytedance.im.core.internal.e.b<Map<String, List<ai>>>() {
                    /* class com.bytedance.im.core.internal.b.a.u.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(23045);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.im.core.internal.e.b
                    public final /* synthetic */ void a(Map<String, List<ai>> map) {
                        int size;
                        boolean z;
                        boolean z2;
                        List<ai> a2;
                        Map<String, List<ai>> map2 = map;
                        u.this.f38581k += SystemClock.uptimeMillis() - uptimeMillis2;
                        StringBuilder sb = new StringBuilder("GetMsgByUserHandler saveMsg onCallback, result:");
                        if (map2 == null) {
                            size = 0;
                        } else {
                            size = map2.size();
                        }
                        f.b("imsdk", sb.append(size).append(", seqId:").append(j2).toString(), (Throwable) null);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (map2 == null || map2.isEmpty()) {
                            z = false;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (String str : map2.keySet()) {
                                List<ai> list = map2.get(str);
                                q.a().a(list, 3, new ar());
                                for (ai aiVar : list) {
                                    g b2 = h.b(aiVar.getMsgId());
                                    if (!(b2 == null || u.this.f38573c == 0)) {
                                        b2.f37639e = Long.valueOf(System.currentTimeMillis() - b2.f37637c.longValue());
                                        b2.f37640f = Long.valueOf(System.currentTimeMillis() - b2.f37636b.longValue());
                                        h.a(aiVar);
                                        h.b(aiVar);
                                    }
                                }
                                f.b("GetMsgByUserHandler saveMsg onCallback onGetMessage, conversationId:", str + ", messageList:" + Integer.valueOf(list.size()) + ", seqId:" + j2, (Throwable) null);
                                if (d.a().b().aB) {
                                    a2 = n.a(str, list);
                                } else {
                                    a2 = n.a(str, map2.get(str));
                                }
                                if (a2 != null) {
                                    arrayList.addAll(a2);
                                }
                                if (!a.a(u.this.f38571a, str)) {
                                    f.b("GetMsgByUserHandler  saveMsg onCallback onUpdateConversation, conversationId:", str + ", seqId:" + j2, (Throwable) null);
                                    j.a().a(2, j.a().a(str));
                                }
                            }
                            z = false;
                            if (!arrayList.isEmpty()) {
                                d.a();
                            }
                        }
                        u.this.f38582l += SystemClock.uptimeMillis() - uptimeMillis;
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        if (d.a().b().x == 1) {
                            if (u.this.f38572b == 0) {
                                z = true;
                            }
                            a.a(z);
                        } else if (!bool.booleanValue()) {
                            if (u.this.f38572b == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            a.a(z2);
                            int i2 = u.this.f38571a;
                            if (!a.f38234h.containsKey(Integer.valueOf(i2)) || a.f38234h.get(Integer.valueOf(i2)).isEmpty()) {
                                a.a(u.this.f38571a);
                            }
                        }
                        u.this.f38583m += SystemClock.uptimeMillis() - uptimeMillis2;
                        if (!bool.booleanValue()) {
                            u.this.a(true, (com.bytedance.im.core.d.u) null);
                        }
                    }
                }, com.bytedance.im.core.internal.e.a.c());
            } else if (!messagesPerUserResponseBody.has_more.booleanValue()) {
                this.f38583m += SystemClock.uptimeMillis() - uptimeMillis;
                a(true, (com.bytedance.im.core.d.u) null);
            }
            long uptimeMillis3 = SystemClock.uptimeMillis();
            if (this.f38572b == 8 && messagesPerUserResponseBody.next_interval != null) {
                if (messagesPerUserResponseBody.next_interval.longValue() > 0) {
                    com.bytedance.im.core.f.a a2 = com.bytedance.im.core.f.a.a();
                    a2.f38063d = messagesPerUserResponseBody.next_interval.longValue();
                    if (a2.f38062c != null) {
                        a2.f38061b.removeCallbacks(a2.f38062c);
                        a2.f38061b.postDelayed(a2.f38062c, a2.b() * 1000);
                    }
                } else {
                    com.bytedance.im.core.f.a.a().d();
                }
            }
            a.d(this.f38571a);
            this.f38583m += SystemClock.uptimeMillis() - uptimeMillis3;
            if (messagesPerUserResponseBody.has_more.booleanValue()) {
                a(1, messagesPerUserResponseBody.next_cursor.longValue());
                return;
            }
            long uptimeMillis4 = SystemClock.uptimeMillis();
            b(5);
            com.bytedance.im.core.c.e.a(kVar, true).a();
            l a3 = l.a();
            if (a3.f38776a || a3.f38778c) {
                f.b("imsdk", "LinkModeManager afterPullMixLink checking or ever migrated, isChecking:" + a3.f38776a + ", isEverMigrated:" + a3.f38778c, (Throwable) null);
            } else {
                a3.f38776a = true;
                com.bytedance.im.core.internal.e.d.a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01b3: INVOKE  
                      (wrap: com.bytedance.im.core.internal.utils.l$1 : 0x01a7: CONSTRUCTOR  (r3v5 com.bytedance.im.core.internal.utils.l$1) = (r6v5 'a3' com.bytedance.im.core.internal.utils.l) call: com.bytedance.im.core.internal.utils.l.1.<init>(com.bytedance.im.core.internal.utils.l):void type: CONSTRUCTOR)
                      (wrap: com.bytedance.im.core.internal.utils.l$2 : 0x01ac: CONSTRUCTOR  (r1v6 com.bytedance.im.core.internal.utils.l$2) = (r6v5 'a3' com.bytedance.im.core.internal.utils.l) call: com.bytedance.im.core.internal.utils.l.2.<init>(com.bytedance.im.core.internal.utils.l):void type: CONSTRUCTOR)
                      (wrap: java.util.concurrent.Executor : 0x01af: INVOKE  (r0v40 java.util.concurrent.Executor) =  type: STATIC call: com.bytedance.im.core.internal.e.a.d():java.util.concurrent.Executor)
                     type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b, java.util.concurrent.Executor):void in method: com.bytedance.im.core.internal.b.a.u.a(com.bytedance.im.core.internal.d.k, java.lang.Runnable):void, file: classes10.dex
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
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01a7: CONSTRUCTOR  (r3v5 com.bytedance.im.core.internal.utils.l$1) = (r6v5 'a3' com.bytedance.im.core.internal.utils.l) call: com.bytedance.im.core.internal.utils.l.1.<init>(com.bytedance.im.core.internal.utils.l):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.b.a.u.a(com.bytedance.im.core.internal.d.k, java.lang.Runnable):void, file: classes10.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 30 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.internal.utils.l, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 36 more
                    */
                /*
                // Method dump skipped, instructions count: 468
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.u.a(com.bytedance.im.core.internal.d.k, java.lang.Runnable):void");
            }

            public final void a(boolean z, com.bytedance.im.core.d.u uVar) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f38572b == 0) {
                    q.a().a(this.f38571a);
                }
                q.a();
                q.a(z);
                this.f38583m += SystemClock.uptimeMillis() - uptimeMillis;
                b.a(false, z, SystemClock.uptimeMillis() - this.q, this.f38575e, this.f38576f, this.f38577g, this.f38578h, uVar, this.s, this.t, this.f38579i, this.f38580j, this.f38581k, this.f38582l, this.f38583m);
            }
        }
