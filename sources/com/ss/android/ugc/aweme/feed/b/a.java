package com.ss.android.ugc.aweme.feed.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.gcsuppression.GcSuppression;

public final class a implements com.bytedance.ies.ugc.aweme.a.a<Void> {
    static {
        Covode.recordClassIndex(58754);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.ies.ugc.aweme.a.a
    public final /* synthetic */ void run(Void r4) {
        GcSuppression a2 = GcSuppression.a();
        if (a2.f29688a.get() == 2) {
            a2.f29690c.execute(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0014: INVOKE  
                  (wrap: java.util.concurrent.ExecutorService : 0x000d: IGET  (r1v1 java.util.concurrent.ExecutorService) = (r2v0 'a2' com.bytedance.gcsuppression.GcSuppression) com.bytedance.gcsuppression.GcSuppression.c java.util.concurrent.ExecutorService)
                  (wrap: com.bytedance.gcsuppression.GcSuppression$2 : 0x0011: CONSTRUCTOR  (r0v2 com.bytedance.gcsuppression.GcSuppression$2) = (r2v0 'a2' com.bytedance.gcsuppression.GcSuppression) call: com.bytedance.gcsuppression.GcSuppression.2.<init>(com.bytedance.gcsuppression.GcSuppression):void type: CONSTRUCTOR)
                 type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.feed.b.a.run(java.lang.Void):void, file: classes4.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: CONSTRUCTOR  (r0v2 com.bytedance.gcsuppression.GcSuppression$2) = (r2v0 'a2' com.bytedance.gcsuppression.GcSuppression) call: com.bytedance.gcsuppression.GcSuppression.2.<init>(com.bytedance.gcsuppression.GcSuppression):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.feed.b.a.run(java.lang.Void):void, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.gcsuppression.GcSuppression, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                this = this;
                com.bytedance.gcsuppression.GcSuppression r2 = com.bytedance.gcsuppression.GcSuppression.a()
                java.util.concurrent.atomic.AtomicInteger r0 = r2.f29688a
                int r1 = r0.get()
                r0 = 2
                if (r1 != r0) goto L_0x0017
                java.util.concurrent.ExecutorService r1 = r2.f29690c
                com.bytedance.gcsuppression.GcSuppression$2 r0 = new com.bytedance.gcsuppression.GcSuppression$2
                r0.<init>()
                r1.execute(r0)
            L_0x0017:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.b.a.run(java.lang.Object):void");
        }
    }
