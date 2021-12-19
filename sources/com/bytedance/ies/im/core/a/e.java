package com.bytedance.ies.im.core.a;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.f;
import com.bytedance.ies.im.core.api.f.c;
import com.bytedance.ies.im.core.e.t;
import com.bytedance.ies.im.core.f.g;
import com.bytedance.ies.im.core.g.d;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.ak;
import com.bytedance.im.core.d.an;
import com.bytedance.im.core.d.ay;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.d.v;
import com.bytedance.im.core.internal.b.a.ah;
import com.bytedance.im.core.internal.b.a.x;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.utils.i;
import com.bytedance.im.core.internal.utils.n;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.im.core.proto.RequestBody;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class e extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final e f33936b = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(20170);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<ai, z> {
        final /* synthetic */ com.bytedance.im.core.a.a.b $callback;

        static {
            Covode.recordClassIndex(20171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.bytedance.im.core.a.a.b bVar) {
            super(1);
            this.$callback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ai aiVar) {
            ai aiVar2 = aiVar;
            t.a(aiVar2, (u) null);
            com.bytedance.im.core.a.a.b bVar = this.$callback;
            if (bVar != null) {
                bVar.a(aiVar2);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.f
    public final void b(ai aiVar) {
        l.d(aiVar, "");
        ak.b(aiVar);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<u, z> {
        final /* synthetic */ com.bytedance.im.core.a.a.b $callback;
        final /* synthetic */ ai $msg;

        static {
            Covode.recordClassIndex(20172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ai aiVar, com.bytedance.im.core.a.a.b bVar) {
            super(1);
            this.$msg = aiVar;
            this.$callback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(u uVar) {
            u uVar2 = uVar;
            t.a(this.$msg, uVar2);
            com.bytedance.im.core.a.a.b bVar = this.$callback;
            if (bVar != null) {
                bVar.a(uVar2);
            }
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.bytedance.im.core.d.ai */
    /* JADX WARN: Multi-variable type inference failed */
    public static List<ai> a(d dVar) {
        long j2;
        l.d(dVar, "");
        String str = dVar.f34174a;
        if (str == null) {
            l.b();
        }
        List<? extends c> list = dVar.f34175b;
        if (list == null) {
            l.b();
        }
        List<? extends com.bytedance.im.core.d.c> list2 = dVar.f34176c;
        com.bytedance.ies.im.core.api.f.b bVar = dVar.f34179f;
        Map<String, String> map = dVar.f34177d;
        Map<String, String> map2 = dVar.f34178e;
        ReferenceInfo referenceInfo = dVar.f34182i;
        h a2 = a.f33921b.a(str);
        if (a2 == null) {
            com.bytedance.ies.im.core.api.a.b().c("MessageOperator", "buildMessageList conversation null: ".concat(String.valueOf(str)));
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        ai lastMessage = a2.getLastMessage();
        if (lastMessage != null) {
            j2 = lastMessage.getOrderIndex();
        } else {
            j2 = 0;
        }
        long j3 = j2 + 1;
        for (c cVar : list) {
            int a3 = com.bytedance.ies.im.core.api.a.f().a(cVar);
            if (a3 < 0) {
                com.bytedance.ies.im.core.api.a.b().c("MessageOperator", "buildMessageList msgType unknown: ".concat(String.valueOf(cVar)));
            } else {
                ai.a aVar = new ai.a();
                aVar.f37702a.conversationId = a2.getConversationId();
                aVar.f37702a.conversationShortId = a2.getConversationShortId();
                aVar.f37702a.conversationType = a2.getConversationType();
                aVar.f37702a.orderIndex = a2.getLastMessageOrderIndex() + 1;
                aVar.f37702a.index = a2.getLastMessageIndex() + 1;
                aVar.f37702a.indexInConversationV2 = -1;
                i.a().a("imsdk", "Message conversation content=" + aVar.f37702a.getLogContent() + ", index=" + aVar.f37702a.index + ", orderIndex=" + aVar.f37702a.orderIndex);
                aVar.f37702a.addLocalExt("s:message_index_is_local", "1");
                aVar.f37702a.msgType = a3;
                aVar.f37702a.content = dg.a().b(cVar);
                aVar.f37702a.uuid = UUID.randomUUID().toString();
                aVar.f37702a.sender = com.bytedance.im.core.e.a.a().b();
                aVar.f37702a.createdAt = System.currentTimeMillis();
                aVar.f37702a.msgStatus = 0;
                aVar.f37702a.secSender = com.bytedance.im.core.e.a.a().c();
                ai aiVar = aVar.f37702a;
                if (map != null) {
                    aiVar.putExt(map);
                }
                if (map2 != null) {
                    aiVar.putLocalExt(map2);
                }
                l.b(aiVar, "");
                aiVar.setOrderIndex(j3);
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        it.next().setMsgUuid(aiVar.getUuid());
                    }
                }
                aiVar.setAttachments(list2);
                if (bVar != null) {
                    com.bytedance.ies.im.core.g.c.a(aiVar, bVar);
                }
                if (referenceInfo != null) {
                    aiVar.setRefMsg(referenceInfo);
                }
                com.bytedance.ies.im.core.api.a.f().a(a2, aiVar, cVar);
                j3++;
                arrayList.add(aiVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ies.im.core.api.b.f
    public final boolean a(ai aiVar) {
        l.d(aiVar, "");
        return n.a(aiVar);
    }

    @Override // com.bytedance.ies.im.core.api.b.f
    public final ai a(String str, long j2) {
        l.d(str, "");
        return com.bytedance.im.core.internal.a.i.a(str, j2);
    }

    @Override // com.bytedance.ies.im.core.api.b.f
    public final void a(ai aiVar, com.bytedance.im.core.a.a.b<ai> bVar) {
        l.d(aiVar, "");
        a(aiVar, bVar, 0, null);
    }

    public static void b(ai aiVar, com.bytedance.im.core.a.a.b<ai> bVar) {
        l.d(aiVar, "");
        com.bytedance.im.core.c.f.b("imsdk", "MessageModel addMessage", (Throwable) null);
        if (com.bytedance.im.core.a.d.a().b().A) {
            aiVar = com.bytedance.im.core.internal.utils.c.a(aiVar);
        }
        com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<Pair<h, ai>>(aiVar) {
            /* class com.bytedance.im.core.d.ak.AnonymousClass13 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ai f37736a;

            static {
                Covode.recordClassIndex(22676);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.im.core.internal.e.c
            public final /* synthetic */ Pair<h, ai> a() {
                boolean a2 = com.bytedance.im.core.internal.a.i.a(this.f37736a, true, true);
                h a3 = com.bytedance.im.core.internal.a.c.a(this.f37736a.getConversationId(), true);
                if (a3 != null) {
                    a3.setUnreadCount(com.bytedance.im.core.internal.a.c.e(a3));
                    a3.setUpdatedTime(Math.max(a3.getUpdatedTime(), this.f37736a.getCreatedAt()));
                    a3.setLastMessageIndex(Math.max(a3.getLastMessageIndex(), this.f37736a.getIndex()));
                    com.bytedance.im.core.internal.a.c.a(a3, false);
                }
                if (a2) {
                    return new Pair(a3, this.f37736a);
                }
                return null;
            }

            {
                this.f37736a = r1;
            }
        }, new com.bytedance.im.core.internal.e.b<Pair<h, ai>>(bVar, aiVar) {
            /* class com.bytedance.im.core.d.ak.AnonymousClass14 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f37737a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ai f37738b;

            static {
                Covode.recordClassIndex(22677);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.internal.e.b
            public final /* synthetic */ void a(Pair<h, ai> pair) {
                Pair<h, ai> pair2 = pair;
                int i2 = -3001;
                if (pair2 != null) {
                    if (pair2.first != null) {
                        j.a().a((h) pair2.first, 2);
                    }
                    b bVar = this.f37737a;
                    if (bVar != null) {
                        bVar.a(this.f37738b);
                    }
                } else {
                    this.f37738b.setMsgStatus(3);
                    b bVar2 = this.f37737a;
                    if (bVar2 != null) {
                        bVar2.a(u.a(k.a(-3001)));
                    }
                }
                q a2 = q.a();
                if (pair2 != null) {
                    i2 = e.b.f37585a;
                }
                ai aiVar = this.f37738b;
                if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
                    a2.a(aiVar.getConversationId(), new q.a<v>(i2, aiVar) {
                        /* class com.bytedance.im.core.internal.utils.q.AnonymousClass6 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ int f38848a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ ai f38849b;

                        static {
                            Covode.recordClassIndex(23161);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.im.core.internal.utils.q.a
                        public final /* bridge */ /* synthetic */ void a(v vVar) {
                            vVar.a(this.f38848a, this.f38849b);
                        }

                        {
                            this.f38848a = r2;
                            this.f38849b = r3;
                        }
                    });
                }
            }

            {
                this.f37737a = r1;
                this.f37738b = r2;
            }
        });
    }

    @Override // com.bytedance.ies.im.core.api.b.f
    public final void a(an anVar, com.bytedance.im.core.a.a.b<an> bVar) {
        l.d(anVar, "");
        x.a();
        new ah(bVar).a(anVar);
    }

    @Override // com.bytedance.ies.im.core.api.b.f
    public final void a(long j2, h hVar, com.bytedance.im.core.a.a.b<ai> bVar) {
        x.a();
        com.bytedance.im.core.internal.b.a.t tVar = new com.bytedance.im.core.internal.b.a.t(bVar);
        if (!com.bytedance.im.core.internal.b.a.t.f38564a) {
            tVar.a(j2, hVar);
            return;
        }
        ai aiVar = tVar.f38565b.get(Long.valueOf(j2));
        if (aiVar != null) {
            tVar.a(aiVar);
        } else {
            com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<ai>(j2) {
                /* class com.bytedance.im.core.internal.b.a.t.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ long f38566a;

                static {
                    Covode.recordClassIndex(23041);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* bridge */ /* synthetic */ ai a() {
                    return com.bytedance.im.core.internal.a.i.a(this.f38566a);
                }

                {
                    this.f38566a = r2;
                }
            }, new com.bytedance.im.core.internal.e.b<ai>(j2, hVar) {
                /* class com.bytedance.im.core.internal.b.a.t.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ long f38568a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ h f38569b;

                static {
                    Covode.recordClassIndex(23042);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* bridge */ /* synthetic */ void a(ai aiVar) {
                    if (aiVar != null) {
                        t.this.a(aiVar);
                    } else {
                        t.this.a(this.f38568a, this.f38569b);
                    }
                }

                {
                    this.f38568a = r2;
                    this.f38569b = r4;
                }
            }, com.bytedance.im.core.internal.e.a.a());
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.f
    public final void a(ai aiVar, boolean z, com.bytedance.im.core.a.a.b<ai> bVar) {
        l.d(aiVar, "");
        x a2 = x.a();
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId())) {
            j.a().b(aiVar.getConversationId(), new com.bytedance.im.core.a.a.b<h>(bVar, aiVar, false) {
                /* class com.bytedance.im.core.internal.b.a.x.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f38639a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ai f38640b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ boolean f38641c;

                static {
                    Covode.recordClassIndex(23058);
                }

                @Override // com.bytedance.im.core.a.a.b
                public final void a(u uVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.a.a.b
                public final /* synthetic */ void a(h hVar) {
                    boolean z;
                    h hVar2 = hVar;
                    if (hVar2 == null || !hVar2.isStranger()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    k kVar = new k(z, this.f38639a);
                    ai aiVar = this.f38640b;
                    boolean z2 = this.f38641c;
                    com.bytedance.im.core.c.f.b("imsdk", "DeleteMsgHandler delete, isLocal:" + z2 + ", stranger:" + kVar.f38496a, (Throwable) null);
                    if (aiVar == null) {
                        kVar.b(k.a(-1015));
                        return;
                    }
                    kVar.f38497b = aiVar;
                    String uuid = aiVar.getUuid();
                    String conversationId = aiVar.getConversationId();
                    if (TextUtils.isEmpty(uuid) || TextUtils.isEmpty(conversationId)) {
                        kVar.b(k.a(-1015));
                        return;
                    }
                    h a2 = j.a().a(conversationId);
                    if (a2 != null && aiVar.getMsgId() > 0 && !z2) {
                        int inboxType = a2.getInboxType();
                        long conversationShortId = aiVar.getConversationShortId();
                        int conversationType = aiVar.getConversationType();
                        long msgId = aiVar.getMsgId();
                        if (kVar.f38496a) {
                            RequestBody build = new RequestBody.Builder().delete_stranger_message_body(new DeleteStrangerMessageRequestBody.Builder().conversation_short_id(Long.valueOf(conversationShortId)).server_message_id(Long.valueOf(msgId)).build()).build();
                            kVar.f38498c = build;
                            kVar.a(inboxType, build, null, new Object[0]);
                        } else {
                            RequestBody build2 = new RequestBody.Builder().delete_message_body(new DeleteMessageRequestBody.Builder().conversation_id(conversationId).conversation_short_id(Long.valueOf(conversationShortId)).conversation_type(Integer.valueOf(conversationType)).message_id(Long.valueOf(msgId)).build()).build();
                            kVar.f38498c = build2;
                            kVar.a(inboxType, build2, null, new Object[0]);
                        }
                    }
                    com.bytedance.im.core.internal.e.d.a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c5: INVOKE  
                          (wrap: com.bytedance.im.core.internal.b.a.k$1 : 0x00bd: CONSTRUCTOR  (r1v7 com.bytedance.im.core.internal.b.a.k$1) = 
                          (r7v0 'kVar' com.bytedance.im.core.internal.b.a.k)
                          (r4v0 'uuid' java.lang.String)
                          (r3v0 'conversationId' java.lang.String)
                          (r6v0 'aiVar' com.bytedance.im.core.d.ai)
                         call: com.bytedance.im.core.internal.b.a.k.1.<init>(com.bytedance.im.core.internal.b.a.k, java.lang.String, java.lang.String, com.bytedance.im.core.d.ai):void type: CONSTRUCTOR)
                          (wrap: com.bytedance.im.core.internal.b.a.k$2 : 0x00c2: CONSTRUCTOR  (r0v10 com.bytedance.im.core.internal.b.a.k$2) = (r7v0 'kVar' com.bytedance.im.core.internal.b.a.k), (r6v0 'aiVar' com.bytedance.im.core.d.ai) call: com.bytedance.im.core.internal.b.a.k.2.<init>(com.bytedance.im.core.internal.b.a.k, com.bytedance.im.core.d.ai):void type: CONSTRUCTOR)
                         type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b):void in method: com.bytedance.im.core.internal.b.a.x.3.a(com.bytedance.im.core.d.h):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00bd: CONSTRUCTOR  (r1v7 com.bytedance.im.core.internal.b.a.k$1) = 
                          (r7v0 'kVar' com.bytedance.im.core.internal.b.a.k)
                          (r4v0 'uuid' java.lang.String)
                          (r3v0 'conversationId' java.lang.String)
                          (r6v0 'aiVar' com.bytedance.im.core.d.ai)
                         call: com.bytedance.im.core.internal.b.a.k.1.<init>(com.bytedance.im.core.internal.b.a.k, java.lang.String, java.lang.String, com.bytedance.im.core.d.ai):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.b.a.x.3.a(com.bytedance.im.core.d.h):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 22 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.internal.b.a.k, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 28 more
                        */
                    /*
                    // Method dump skipped, instructions count: 266
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.x.AnonymousClass3.a(java.lang.Object):void");
                }

                {
                    this.f38639a = r2;
                    this.f38640b = r3;
                    this.f38641c = r4;
                }
            });
        } else if (bVar != null) {
            bVar.a(u.a(k.a(-1015)));
        }
    }

    public final void a(ai aiVar, com.bytedance.im.core.a.a.b<ai> bVar, int i2, u uVar) {
        l.d(aiVar, "");
        com.bytedance.ies.im.core.api.a.f().a(aiVar);
        com.bytedance.im.core.a.a.b a2 = com.bytedance.ies.im.core.api.e.a.a(new a(bVar), new b(aiVar, bVar));
        if (!aiVar.getExt().containsKey("old_client_message_id")) {
            Map<String, String> ext = aiVar.getExt();
            l.b(ext, "");
            ext.put("old_client_message_id", String.valueOf(com.bytedance.ies.im.core.api.i.a.a()));
        }
        try {
            Long l2 = g.f34148c;
            if (l2 != null) {
                Map<String, String> ext2 = aiVar.getExt();
                l.b(ext2, "");
                ext2.put("im_client_send_msg_time", String.valueOf(System.currentTimeMillis() + l2.longValue()));
            }
        } catch (Exception unused) {
        }
        com.bytedance.ies.im.core.api.f.b a3 = com.bytedance.ies.im.core.g.c.f34165a.a(aiVar);
        if (a3 != null) {
            a3.f33978h = com.bytedance.ies.im.core.api.a.d().a();
            if (!a3.f33978h) {
                com.bytedance.ies.im.core.api.a.c();
            }
            a3.f33975e = SystemClock.uptimeMillis();
        }
        if (i2 != 0) {
            b(aiVar);
            h a4 = a.f33921b.a(aiVar.getConversationId());
            if (a4 != null) {
                j.a().a(a4, 2);
            }
            q.a().a(i2, aiVar, (ay) null);
            a2.a(uVar);
            return;
        }
        ak.a(aiVar, a2);
    }
}
