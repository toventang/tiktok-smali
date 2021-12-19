package com.facebook.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.facebook.m;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static a f48592a = new a() {
        /* class com.facebook.internal.b.a.f.AnonymousClass1 */

        static {
            Covode.recordClassIndex(29295);
        }

        @Override // com.facebook.internal.b.a.f.a
        public final void a() {
            if (!com.facebook.internal.a.b.a.a(b.class)) {
                try {
                    if (!b.f48572b) {
                        b.f48572b = true;
                        if (!com.facebook.internal.a.b.a.a(b.class)) {
                            try {
                                m.c().execute(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: INVOKE  
                                      (wrap: java.util.concurrent.Executor : 0x0017: INVOKE  (r1v2 java.util.concurrent.Executor) =  type: STATIC call: com.facebook.m.c():java.util.concurrent.Executor)
                                      (wrap: com.facebook.internal.b.a.b$1 : 0x001d: CONSTRUCTOR  (r0v9 com.facebook.internal.b.a.b$1) =  call: com.facebook.internal.b.a.b.1.<init>():void type: CONSTRUCTOR)
                                     type: INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void in method: com.facebook.internal.b.a.f.1.a():void, file: classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
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
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
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
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r0v9 com.facebook.internal.b.a.b$1) =  call: com.facebook.internal.b.a.b.1.<init>():void type: CONSTRUCTOR in method: com.facebook.internal.b.a.f.1.a():void, file: classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 41 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.internal.b.a.b, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 47 more
                                    */
                                /*
                                    this = this;
                                    java.lang.Class<com.facebook.internal.b.a.b> r0 = com.facebook.internal.b.a.b.class
                                    boolean r0 = com.facebook.internal.a.b.a.a(r0)
                                    if (r0 != 0) goto L_0x0036
                                    boolean r0 = com.facebook.internal.b.a.b.f48572b     // Catch:{ all -> 0x0030 }
                                    if (r0 != 0) goto L_0x0036
                                    r0 = 1
                                    com.facebook.internal.b.a.b.f48572b = r0     // Catch:{ all -> 0x0030 }
                                    java.lang.Class<com.facebook.internal.b.a.b> r0 = com.facebook.internal.b.a.b.class
                                    boolean r0 = com.facebook.internal.a.b.a.a(r0)     // Catch:{ all -> 0x0030 }
                                    if (r0 != 0) goto L_0x002a
                                    java.util.concurrent.Executor r1 = com.facebook.m.c()     // Catch:{ all -> 0x0024 }
                                    com.facebook.internal.b.a.b$1 r0 = new com.facebook.internal.b.a.b$1     // Catch:{ all -> 0x0024 }
                                    r0.<init>()     // Catch:{ all -> 0x0024 }
                                    r1.execute(r0)     // Catch:{ all -> 0x0024 }
                                    goto L_0x002a
                                L_0x0024:
                                    r1 = move-exception
                                    java.lang.Class<com.facebook.internal.b.a.b> r0 = com.facebook.internal.b.a.b.class
                                    com.facebook.internal.a.b.a.a(r1, r0)
                                L_0x002a:
                                    com.facebook.internal.b.d r0 = com.facebook.internal.b.a.b.f48573c
                                    r0.a()
                                    return
                                L_0x0030:
                                    r1 = move-exception
                                    java.lang.Class<com.facebook.internal.b.a.b> r0 = com.facebook.internal.b.a.b.class
                                    com.facebook.internal.a.b.a.a(r1, r0)
                                L_0x0036:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.b.a.f.AnonymousClass1.a():void");
                            }
                        };

                        public interface a {
                            static {
                                Covode.recordClassIndex(29296);
                            }

                            void a();
                        }

                        static {
                            Covode.recordClassIndex(29294);
                        }
                    }
