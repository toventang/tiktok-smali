package com.bytedance.b.f;

import android.app.Application;
import android.content.Context;
import com.bytedance.b.b.a.g;
import com.bytedance.b.c.a.b;
import com.bytedance.b.c.d.a;
import com.bytedance.b.e.b.c;
import com.bytedance.b.f.a.d;
import com.bytedance.b.f.a.f;
import com.bytedance.b.g.b;
import com.bytedance.b.k.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.e;
import java.util.List;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f26206a;

    static {
        Covode.recordClassIndex(15209);
    }

    public static synchronized Runnable a(final b bVar) {
        synchronized (a.class) {
            if (f26206a) {
                return null;
            }
            f26206a = true;
            com.bytedance.b.e.a.a.f26190a = bVar;
            Context b2 = bVar.b();
            if (b2 != null) {
                if (!(b2 instanceof Application)) {
                    b2 = b2.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && b2 == null) {
                        b2 = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                }
                com.bytedance.b.k.a.f26313g = (Application) b2;
            }
            com.bytedance.b.e.a.a.f26191b = System.currentTimeMillis();
            com.bytedance.b.e.a.a.f26192c = System.currentTimeMillis();
            if (com.bytedance.b.e.a.a.r()) {
                bVar.g();
            }
            b.f26317a = new c();
            com.bytedance.b.j.c.f26302a.put(com.bytedance.b.j.d.a.class, new com.bytedance.b.e.a());
            return new Runnable() {
                /* class com.bytedance.b.f.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15210);
                }

                public final void run() {
                    b bVar = bVar;
                    com.bytedance.b.j.c.a(IHttpService.class, new com.bytedance.b.j.a<IHttpService>(bVar) {
                        /* class com.bytedance.b.f.a.AnonymousClass11 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f26208a;

                        static {
                            Covode.recordClassIndex(15212);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* bridge */ /* synthetic */ IHttpService a() {
                            return this.f26208a.a();
                        }

                        {
                            this.f26208a = r1;
                        }
                    });
                    com.bytedance.b.j.c.a(com.bytedance.b.b.a.a.b.class, new com.bytedance.b.j.a<com.bytedance.b.b.a.a.b>(bVar) {
                        /* class com.bytedance.b.f.a.AnonymousClass12 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f26209a;

                        static {
                            Covode.recordClassIndex(15213);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ com.bytedance.b.b.a.a.b a() {
                            return new f();
                        }

                        {
                            this.f26209a = r1;
                        }
                    });
                    com.bytedance.b.j.c.a(com.bytedance.b.a.a.b.class, new com.bytedance.b.j.a<com.bytedance.b.a.a.b>(bVar) {
                        /* class com.bytedance.b.f.a.AnonymousClass13 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f26210a;

                        static {
                            Covode.recordClassIndex(15214);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ com.bytedance.b.a.a.b a() {
                            return new com.bytedance.b.f.a.a();
                        }

                        {
                            this.f26210a = r1;
                        }
                    });
                    com.bytedance.b.j.c.a(com.bytedance.b.c.b.b.class, new com.bytedance.b.j.a<com.bytedance.b.c.b.b>(bVar) {
                        /* class com.bytedance.b.f.a.AnonymousClass14 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f26211a;

                        static {
                            Covode.recordClassIndex(15215);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ com.bytedance.b.c.b.b a() {
                            return new com.bytedance.b.f.a.b();
                        }

                        {
                            this.f26211a = r1;
                        }
                    });
                    com.bytedance.b.j.c.a(com.bytedance.apm.config.f.class, new com.bytedance.b.j.a<com.bytedance.apm.config.f>(bVar) {
                        /* class com.bytedance.b.f.a.AnonymousClass15 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f26212a;

                        static {
                            Covode.recordClassIndex(15216);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ com.bytedance.apm.config.f a() {
                            return new d();
                        }

                        {
                            this.f26212a = r1;
                        }
                    });
                    com.bytedance.b.j.c.a(com.bytedance.b.j.d.a.class, new com.bytedance.b.j.a<com.bytedance.b.j.d.a>() {
                        /* class com.bytedance.b.f.a.AnonymousClass16 */

                        static {
                            Covode.recordClassIndex(15217);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ com.bytedance.b.j.d.a a() {
                            return new com.bytedance.b.e.a();
                        }
                    });
                    com.bytedance.b.j.c.a(e.class, new com.bytedance.b.j.a<e>(bVar) {
                        /* class com.bytedance.b.f.a.AnonymousClass17 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f26213a;

                        static {
                            Covode.recordClassIndex(15218);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ e a() {
                            return this.f26213a.o();
                        }

                        {
                            this.f26213a = r1;
                        }
                    });
                    com.bytedance.b.j.c.a(com.bytedance.b.j.b.a.class, new com.bytedance.b.j.a<com.bytedance.b.j.b.a>(bVar) {
                        /* class com.bytedance.b.f.a.AnonymousClass18 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f26214a;

                        static {
                            Covode.recordClassIndex(15219);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ com.bytedance.b.j.b.a a() {
                            return this.f26214a.p();
                        }

                        {
                            this.f26214a = r1;
                        }
                    });
                    com.bytedance.b.j.c.a(com.bytedance.b.j.e.b.class, new com.bytedance.b.j.a<com.bytedance.b.j.e.b>() {
                        /* class com.bytedance.b.f.a.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(15220);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* bridge */ /* synthetic */ com.bytedance.b.j.e.b a() {
                            return com.bytedance.b.i.a.c.a();
                        }
                    });
                    new com.bytedance.b.e.a();
                    com.bytedance.b.j.c.a(com.bytedance.b.g.a.b.class, new com.bytedance.b.j.a<com.bytedance.b.g.a.b>(bVar) {
                        /* class com.bytedance.b.f.a.AnonymousClass3 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f26215a;

                        static {
                            Covode.recordClassIndex(15221);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ com.bytedance.b.g.a.b a() {
                            return this.f26215a.u();
                        }

                        {
                            this.f26215a = r1;
                        }
                    });
                    com.bytedance.b.j.c.a(com.bytedance.b.g.a.class, new com.bytedance.b.j.a<com.bytedance.b.g.a>(bVar) {
                        /* class com.bytedance.b.f.a.AnonymousClass4 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f26216a;

                        static {
                            Covode.recordClassIndex(15222);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ com.bytedance.b.g.a a() {
                            return this.f26216a.v();
                        }

                        {
                            this.f26216a = r1;
                        }
                    });
                    com.bytedance.b.j.c.a(com.bytedance.b.j.a.a.class, new com.bytedance.b.j.a<com.bytedance.b.j.a.a>(bVar) {
                        /* class com.bytedance.b.f.a.AnonymousClass5 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f26217a;

                        static {
                            Covode.recordClassIndex(15223);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ com.bytedance.b.j.a.a a() {
                            return this.f26217a.w();
                        }

                        {
                            this.f26217a = r1;
                        }
                    });
                    com.bytedance.b.j.c.a(com.bytedance.b.d.a.b.class, new com.bytedance.b.j.a<com.bytedance.b.d.a.b>() {
                        /* class com.bytedance.b.f.a.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(15224);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ com.bytedance.b.d.a.b a() {
                            return new com.bytedance.b.f.a.c();
                        }
                    });
                    com.bytedance.b.j.c.a(com.bytedance.b.j.e.a.class, new com.bytedance.b.j.a<com.bytedance.b.j.e.a>() {
                        /* class com.bytedance.b.f.a.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(15225);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* bridge */ /* synthetic */ com.bytedance.b.j.e.a a() {
                            return a.C0557a.f26115a;
                        }
                    });
                    com.bytedance.b.j.c.a(g.class, new com.bytedance.b.j.a<g>(bVar) {
                        /* class com.bytedance.b.f.a.AnonymousClass8 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f26218a;

                        static {
                            Covode.recordClassIndex(15226);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.b.j.a
                        public final /* synthetic */ g a() {
                            return this.f26218a.t();
                        }

                        {
                            this.f26218a = r1;
                        }
                    });
                    com.bytedance.b.f.a.a.a.a().b();
                    com.bytedance.b.k.d.b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).a(new com.bytedance.b.k.d.a() {
                        /* class com.bytedance.b.f.a.AnonymousClass9 */

                        static {
                            Covode.recordClassIndex(15227);
                        }

                        public final void run() {
                            long j2;
                            com.bytedance.b.b.a.e eVar = com.bytedance.b.b.a.e.f25965a;
                            if (!com.bytedance.b.h.a.f26291a.contains(eVar)) {
                                com.bytedance.b.h.a.f26291a.add(eVar);
                            }
                            b.a.f26271a.a();
                            if (com.bytedance.b.e.a.a.c()) {
                                com.bytedance.b.d.a aVar = com.bytedance.b.d.a.f26116a;
                                if (!aVar.f26118c) {
                                    aVar.f26118c = true;
                                    com.bytedance.b.d.a.b bVar = (com.bytedance.b.d.a.b) com.bytedance.b.j.c.a(com.bytedance.b.d.a.b.class);
                                    if (bVar != null) {
                                        aVar.a(bVar.a());
                                    }
                                }
                            }
                            com.bytedance.b.c.a.b bVar2 = b.a.f25999a;
                            if (bVar2.f25990a.compareAndSet(false, true)) {
                                bVar2.f25994e = (com.bytedance.b.j.d.a) com.bytedance.b.j.c.a(com.bytedance.b.j.d.a.class);
                                bVar2.f25993d = com.bytedance.apm.core.d.a(com.bytedance.b.k.a.f26313g, "apm_cpu_front");
                                if (com.bytedance.b.e.a.a.c()) {
                                    bVar2.b();
                                    com.bytedance.b.k.d.b.a(com.bytedance.b.k.d.c.LIGHT_WEIGHT).a(
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0067: INVOKE  
                                          (wrap: com.bytedance.b.k.d.b : 0x005e: INVOKE  (r1v8 com.bytedance.b.k.d.b) = 
                                          (wrap: com.bytedance.b.k.d.c : 0x005c: SGET  (r0v31 com.bytedance.b.k.d.c) =  com.bytedance.b.k.d.c.LIGHT_WEIGHT com.bytedance.b.k.d.c)
                                         type: STATIC call: com.bytedance.b.k.d.b.a(com.bytedance.b.k.d.c):com.bytedance.b.k.d.b)
                                          (wrap: com.bytedance.b.c.a.b$1 : 0x0064: CONSTRUCTOR  (r0v32 com.bytedance.b.c.a.b$1) = (r4v0 'bVar2' com.bytedance.b.c.a.b) call: com.bytedance.b.c.a.b.1.<init>(com.bytedance.b.c.a.b):void type: CONSTRUCTOR)
                                         type: VIRTUAL call: com.bytedance.b.k.d.b.a(com.bytedance.b.k.d.a):void in method: com.bytedance.b.f.a.9.run():void, file: classes.dex
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
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
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
                                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0064: CONSTRUCTOR  (r0v32 com.bytedance.b.c.a.b$1) = (r4v0 'bVar2' com.bytedance.b.c.a.b) call: com.bytedance.b.c.a.b.1.<init>(com.bytedance.b.c.a.b):void type: CONSTRUCTOR in method: com.bytedance.b.f.a.9.run():void, file: classes.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                        	... 24 more
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.b.c.a.b, state: GENERATED_AND_UNLOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                        	... 30 more
                                        */
                                    /*
                                    // Method dump skipped, instructions count: 215
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.f.a.AnonymousClass9.run():void");
                                }
                            });
                            com.bytedance.b.b.a.e.c.f25972a.a(new com.bytedance.b.b.a.e.b() {
                                /* class com.bytedance.b.f.a.AnonymousClass10 */

                                static {
                                    Covode.recordClassIndex(15211);
                                }

                                @Override // com.bytedance.b.b.a.e.b
                                public final void a(List<com.bytedance.b.b.a.e.a> list) {
                                    if (!com.bytedance.b.k.f.a(list)) {
                                        JSONObject jSONObject = new JSONObject();
                                        for (com.bytedance.b.b.a.e.a aVar : list) {
                                            try {
                                                jSONObject.put("before_size_" + aVar.f25969a, aVar.f25970b);
                                                jSONObject.put("after_size_" + aVar.f25969a, aVar.f25971c);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        com.bytedance.b.a.a.a("apm_db_size", null, jSONObject, null);
                                    }
                                }
                            });
                        }
                    };
                }
            }
        }
