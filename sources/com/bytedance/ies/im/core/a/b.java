package com.bytedance.ies.im.core.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.k;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.a.c;
import com.bytedance.im.core.internal.a.e;
import com.bytedance.im.core.internal.b.a.ab;
import com.bytedance.im.core.internal.b.a.ak;
import com.bytedance.im.core.internal.b.a.ao;
import com.bytedance.im.core.internal.b.a.ap;
import com.bytedance.im.core.internal.b.a.as;
import com.bytedance.im.core.internal.b.a.at;
import com.bytedance.im.core.internal.b.a.x;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody;
import com.bytedance.im.core.proto.ConversationLeaveRequestBody;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody;
import com.bytedance.im.core.proto.DissolveConversationRequestBody;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantRequestBody;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class b extends com.bytedance.ies.im.core.api.b.b {

    /* renamed from: b  reason: collision with root package name */
    public final String f33922b;

    /* renamed from: c  reason: collision with root package name */
    private final am f33923c = an.a(bf.f159040a);

    /* renamed from: d  reason: collision with root package name */
    private final h f33924d = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(20162);
    }

    private final k f() {
        return (k) this.f33924d.getValue();
    }

    @Override // com.bytedance.ies.im.core.api.b.b
    public final String b() {
        return this.f33922b;
    }

    @Override // com.bytedance.ies.im.core.api.b.b
    public final void a(boolean z, com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h> bVar) {
        k f2 = f();
        if (j.a().a(f2.f37997a) != null) {
            x.a();
            String str = f2.f37997a;
            ap apVar = new ap(bVar);
            com.bytedance.im.core.d.h a2 = j.a().a(str);
            RequestBody build = new RequestBody.Builder().set_conversation_setting_info_body(new SetConversationSettingInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).set_stick_on_top(Boolean.valueOf(z)).build()).build();
            int inboxType = a2.getInboxType();
            Object[] objArr = new Object[3];
            boolean z2 = false;
            objArr[0] = str;
            if (d.a().b().D && z) {
                z2 = true;
            }
            objArr[1] = Boolean.valueOf(z2);
            objArr[2] = "s:stick_on_top";
            apVar.a(inboxType, build, null, objArr);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.b
    public final void a(Map<String, String> map, com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h> bVar) {
        l.d(map, "");
        k f2 = f();
        if (j.a().a(f2.f37997a) != null) {
            x.a();
            String str = f2.f37997a;
            at atVar = new at(bVar);
            if (map != null) {
                com.bytedance.im.core.d.h a2 = j.a().a(str);
                RequestBody build = new RequestBody.Builder().upsert_conversation_setting_ext_info_body(new UpsertConversationSettingExtInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).ext(map).build()).build();
                atVar.a(a2.getInboxType(), build, null, str);
            }
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.b
    public final void a() {
        f().a();
    }

    static final class a extends m implements h.f.a.a<k> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(20163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ k invoke() {
            return new k(this.this$0.f33922b);
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.b
    public final com.bytedance.im.core.d.h c() {
        return a.f33921b.a(this.f33922b);
    }

    /* renamed from: com.bytedance.ies.im.core.a.b$b  reason: collision with other inner class name */
    static final class RunnableC0744b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f33925a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.im.core.a.a.b f33926b;

        static {
            Covode.recordClassIndex(20164);
        }

        RunnableC0744b(b bVar, com.bytedance.im.core.a.a.b bVar2) {
            this.f33925a = bVar;
            this.f33926b = bVar2;
        }

        public final void run() {
            com.bytedance.im.core.a.a.b bVar = this.f33926b;
            if (bVar != null) {
                bVar.a(a.f33921b.a(this.f33925a.f33922b));
            }
        }
    }

    @Override // com.bytedance.ies.im.core.api.b.b
    public final void e() {
        j.a();
        String str = this.f33922b;
        j.a().b(str, new com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h>(str) {
            /* class com.bytedance.im.core.internal.b.a.x.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f38637a;

            static {
                Covode.recordClassIndex(23057);
            }

            @Override // com.bytedance.im.core.a.a.b
            public final void a(u uVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.a.a.b
            public final /* synthetic */ void a(com.bytedance.im.core.d.h hVar) {
                com.bytedance.im.core.d.h hVar2 = hVar;
                if (hVar2 == null || !hVar2.isStranger()) {
                    ag agVar = new ag();
                    String str = this.f38637a;
                    com.bytedance.im.core.internal.e.d.a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0080: INVOKE  
                          (wrap: com.bytedance.im.core.internal.b.a.ag$1 : 0x0078: CONSTRUCTOR  (r1v0 com.bytedance.im.core.internal.b.a.ag$1) = (r3v0 'agVar' com.bytedance.im.core.internal.b.a.ag), (r2v0 'str' java.lang.String) call: com.bytedance.im.core.internal.b.a.ag.1.<init>(com.bytedance.im.core.internal.b.a.ag, java.lang.String):void type: CONSTRUCTOR)
                          (wrap: com.bytedance.im.core.internal.b.a.ag$2 : 0x007d: CONSTRUCTOR  (r0v0 com.bytedance.im.core.internal.b.a.ag$2) = (r3v0 'agVar' com.bytedance.im.core.internal.b.a.ag), (r2v0 'str' java.lang.String) call: com.bytedance.im.core.internal.b.a.ag.2.<init>(com.bytedance.im.core.internal.b.a.ag, java.lang.String):void type: CONSTRUCTOR)
                         type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b):void in method: com.bytedance.im.core.internal.b.a.x.2.a(com.bytedance.im.core.d.h):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0078: CONSTRUCTOR  (r1v0 com.bytedance.im.core.internal.b.a.ag$1) = (r3v0 'agVar' com.bytedance.im.core.internal.b.a.ag), (r2v0 'str' java.lang.String) call: com.bytedance.im.core.internal.b.a.ag.1.<init>(com.bytedance.im.core.internal.b.a.ag, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.b.a.x.2.a(com.bytedance.im.core.d.h):void, file: classes10.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 21 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.internal.b.a.ag, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 27 more
                        */
                    /*
                    // Method dump skipped, instructions count: 132
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.b.a.x.AnonymousClass2.a(java.lang.Object):void");
                }

                {
                    this.f38637a = r2;
                }
            });
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void d() {
            k f2 = f();
            f.b("imsdk", "ConversationModel queryMemberList:" + f2.f37997a, (Throwable) null);
            com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<List<ah>>() {
                /* class com.bytedance.im.core.d.k.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22782);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ List<ah> a() {
                    return e.b(k.this.f37997a);
                }
            }, new com.bytedance.im.core.internal.e.b<List<ah>>() {
                /* class com.bytedance.im.core.d.k.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f38003a = null;

                static {
                    Covode.recordClassIndex(22784);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* bridge */ /* synthetic */ void a(List<ah> list) {
                    List<ah> list2 = list;
                    k kVar = k.this;
                    kVar.a(kVar.f37997a, list2);
                    b bVar = this.f38003a;
                    if (bVar != null) {
                        bVar.a(list2);
                    }
                }
            });
        }

        static final class c extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
            final /* synthetic */ Map $ext;
            int label;
            final /* synthetic */ b this$0;

            static {
                Covode.recordClassIndex(20165);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(b bVar, Map map, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = bVar;
                this.$ext = map;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new c(this.this$0, this.$ext, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r.a(obj);
                    com.bytedance.im.core.internal.a.c.a(this.this$0.f33922b, this.$ext);
                    return z.f158842a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public b(String str) {
            l.d(str, "");
            this.f33922b = str;
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void a(Map<String, String> map) {
            l.d(map, "");
            bz unused = kotlinx.coroutines.i.a(this.f33923c, null, null, new c(this, map, null), 3);
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void a(com.bytedance.ies.im.core.api.b.a.b bVar) {
            l.d(bVar, "");
            k f2 = f();
            f2.f37998b = bVar;
            q a2 = q.a();
            String str = f2.f37997a;
            List<com.bytedance.im.core.d.r> list = a2.f38790d.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            if (!list.contains(f2)) {
                int i2 = 0;
                while (i2 < list.size() && (list.get(i2) == null || f2.d() >= list.get(i2).d())) {
                    i2++;
                }
                list.add(i2, f2);
            }
            a2.f38790d.put(str, list);
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void b(com.bytedance.im.core.a.a.b<String> bVar) {
            k f2 = f();
            x.a();
            String str = f2.f37997a;
            com.bytedance.im.core.internal.b.a.l lVar = new com.bytedance.im.core.internal.b.a.l(bVar);
            com.bytedance.im.core.d.h a2 = j.a().a(str);
            if (a2 == null) {
                lVar.b(com.bytedance.im.core.internal.d.k.a(-1017));
                return;
            }
            com.bytedance.im.core.internal.b.a.b(a2.getInboxType(), str);
            RequestBody build = new RequestBody.Builder().dissolve_conversation_body(new DissolveConversationRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).build()).build();
            lVar.a(a2.getInboxType(), build, null, str, true);
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void a(com.bytedance.im.core.a.a.b<String> bVar) {
            k f2 = f();
            x.a();
            String str = f2.f37997a;
            ab abVar = new ab(bVar);
            com.bytedance.im.core.d.h a2 = j.a().a(str);
            if (a2 == null) {
                abVar.a(u.a(com.bytedance.im.core.internal.d.k.a(-1017)));
                return;
            }
            RequestBody build = new RequestBody.Builder().leave_conversation_body(new ConversationLeaveRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).build()).build();
            abVar.a(a2.getInboxType(), build, null, str, true);
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void b(Map<String, String> map, com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h> bVar) {
            l.d(map, "");
            k f2 = f();
            RunnableC0744b bVar2 = new RunnableC0744b(this, bVar);
            String str = f2.f37997a;
            f.b("imsdk", "ConversationModel updateLocal, conversationId:".concat(String.valueOf(str)), (Throwable) null);
            com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<Boolean>(str, map) {
                /* class com.bytedance.im.core.d.k.AnonymousClass6 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f38010a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Map f38011b;

                static {
                    Covode.recordClassIndex(22787);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Boolean a() {
                    return Boolean.valueOf(c.a(this.f38010a, this.f38011b));
                }

                {
                    this.f38010a = r1;
                    this.f38011b = r2;
                }
            }, new com.bytedance.im.core.internal.e.b<Boolean>(str, map, bVar2) {
                /* class com.bytedance.im.core.d.k.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f38000a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Map f38001b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Runnable f38002c;

                static {
                    Covode.recordClassIndex(22783);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.im.core.internal.e.b
                public final /* synthetic */ void a(Boolean bool) {
                    h a2;
                    Boolean bool2 = bool;
                    if (!(bool2 == null || !bool2.booleanValue() || (a2 = j.a().a(this.f38000a)) == null)) {
                        a2.setLocalExt(this.f38001b);
                        j.a().a(a2, 10);
                    }
                    Runnable runnable = this.f38002c;
                    if (runnable != null) {
                        runnable.run();
                    }
                }

                {
                    this.f38000a = r1;
                    this.f38001b = r2;
                    this.f38002c = r3;
                }
            });
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void b(String str, com.bytedance.im.core.a.a.b<ah> bVar) {
            l.d(str, "");
            l.d(bVar, "");
            long a2 = com.bytedance.ies.im.core.api.e.a.a(str, bVar);
            if (a2 > 0) {
                k f2 = f();
                String str2 = this.f33922b;
                String valueOf = String.valueOf(a2);
                f.b("imsdk", "ConversationModel queryMember, conversationId:" + f2.f37997a + ", uid:" + valueOf, (Throwable) null);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(valueOf)) {
                    com.bytedance.im.core.internal.e.d.a(new com.bytedance.im.core.internal.e.c<ah>(str2, valueOf) {
                        /* class com.bytedance.im.core.d.k.AnonymousClass4 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ String f38005a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f38006b;

                        static {
                            Covode.recordClassIndex(22785);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.im.core.internal.e.c
                        public final /* bridge */ /* synthetic */ ah a() {
                            return e.a(this.f38005a, this.f38006b);
                        }

                        {
                            this.f38005a = r2;
                            this.f38006b = r3;
                        }
                    }, new com.bytedance.im.core.internal.e.b<ah>(bVar) {
                        /* class com.bytedance.im.core.d.k.AnonymousClass5 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f38008a;

                        static {
                            Covode.recordClassIndex(22786);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.im.core.internal.e.b
                        public final /* bridge */ /* synthetic */ void a(ah ahVar) {
                            this.f38008a.a(ahVar);
                        }

                        {
                            this.f38008a = r2;
                        }
                    });
                }
            }
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void a(String str, com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h> bVar) {
            l.d(str, "");
            k f2 = f();
            if (j.a().a(f2.f37997a) != null) {
                x.a();
                String str2 = f2.f37997a;
                ao aoVar = new ao(bVar);
                HashMap hashMap = new HashMap();
                com.bytedance.im.core.d.h a2 = j.a().a(str2);
                RequestBody build = new RequestBody.Builder().set_conversation_core_info_body(new SetConversationCoreInfoRequestBody.Builder().conversation_id(str2).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).ext(hashMap).name(str).is_name_set(true).build()).build();
                aoVar.a(a2.getInboxType(), build, null, str2, "s:name");
            }
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void b(boolean z, com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h> bVar) {
            k f2 = f();
            if (j.a().a(f2.f37997a) != null) {
                x.a();
                String str = f2.f37997a;
                ap apVar = new ap(bVar);
                com.bytedance.im.core.d.h a2 = j.a().a(str);
                RequestBody build = new RequestBody.Builder().set_conversation_setting_info_body(new SetConversationSettingInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).set_mute(Boolean.valueOf(z)).build()).build();
                apVar.a(a2.getInboxType(), build, null, str, false, "s:mute");
            }
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void b(List<String> list, Map<String, String> map, com.bytedance.im.core.a.a.b<List<ah>> bVar) {
            l.d(list, "");
            List<Long> a2 = com.bytedance.ies.im.core.api.e.a.a(list);
            k f2 = f();
            x.a();
            String str = f2.f37997a;
            ak akVar = new ak(bVar);
            if (a2 != null && !a2.isEmpty()) {
                com.bytedance.im.core.d.h a3 = j.a().a(str);
                ConversationRemoveParticipantsRequestBody.Builder participants = new ConversationRemoveParticipantsRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a3.getConversationShortId())).conversation_type(Integer.valueOf(a3.getConversationType())).participants(a2);
                if (map != null) {
                    participants.biz_ext(map);
                }
                RequestBody build = new RequestBody.Builder().conversation_remove_participants_body(participants.build()).build();
                akVar.a(a3.getInboxType(), build, null, str, a2);
            }
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void a(List<String> list, Map<String, String> map, com.bytedance.im.core.a.a.b<List<ah>> bVar) {
            com.bytedance.im.core.d.h a2;
            l.d(list, "");
            List<Long> a3 = com.bytedance.ies.im.core.api.e.a.a(list);
            k f2 = f();
            x.a();
            String str = f2.f37997a;
            com.bytedance.im.core.internal.b.a.a aVar = new com.bytedance.im.core.internal.b.a.a(bVar);
            if (a3 != null && !a3.isEmpty() && (a2 = j.a().a(str)) != null) {
                long conversationShortId = a2.getConversationShortId();
                int conversationType = a2.getConversationType();
                int inboxType = a2.getInboxType();
                if (!a3.isEmpty() && !TextUtils.isEmpty(str)) {
                    ConversationAddParticipantsRequestBody.Builder participants = new ConversationAddParticipantsRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(conversationShortId)).conversation_type(Integer.valueOf(conversationType)).participants(a3);
                    participants.biz_ext(map);
                    aVar.a(inboxType, new RequestBody.Builder().conversation_add_participants_body(participants.build()).build(), null, str, a3);
                }
            }
        }

        @Override // com.bytedance.ies.im.core.api.b.b
        public final void a(String str, int i2, Map<String, String> map, com.bytedance.im.core.a.a.b<ah> bVar) {
            l.d(str, "");
            long a2 = com.bytedance.ies.im.core.api.e.a.a(str, bVar);
            if (a2 > 0) {
                k f2 = f();
                if (j.a().a(f2.f37997a) != null) {
                    x.a();
                    String str2 = f2.f37997a;
                    as asVar = new as(bVar);
                    com.bytedance.im.core.d.h a3 = j.a().a(str2);
                    UpdateConversationParticipantRequestBody.Builder role = new UpdateConversationParticipantRequestBody.Builder().conversation_id(str2).conversation_short_id(Long.valueOf(a3.getConversationShortId())).conversation_type(Integer.valueOf(a3.getConversationType())).user_id(Long.valueOf(a2)).role(Integer.valueOf(i2));
                    if (map != null) {
                        role.biz_ext(map);
                    }
                    RequestBody build = new RequestBody.Builder().update_conversation_participant_body(role.build()).build();
                    asVar.a(a3.getInboxType(), build, null, str2);
                }
            }
        }
    }
