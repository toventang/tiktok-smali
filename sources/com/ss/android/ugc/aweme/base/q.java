package com.ss.android.ugc.aweme.base;

import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements Serializable, Runnable {
    private final String arg$1;
    private final String arg$2;
    private final float arg$3;

    static {
        Covode.recordClassIndex(42034);
    }

    q(String str, String str2, float f2) {
        this.arg$1 = str;
        this.arg$2 = str2;
        this.arg$3 = f2;
    }

    public final void run() {
        String str = this.arg$1;
        String str2 = this.arg$2;
        float f2 = this.arg$3;
        b.a.f25210a.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: INVOKE  
              (wrap: com.bytedance.apm.p.b : 0x0006: SGET  (r1v0 com.bytedance.apm.p.b) =  com.bytedance.apm.p.b.a.a com.bytedance.apm.p.b)
              (wrap: com.bytedance.apm.b$12 : 0x000a: CONSTRUCTOR  (r0v0 com.bytedance.apm.b$12) = (r4v0 'str' java.lang.String), (r3v0 'str2' java.lang.String), (r2v0 'f2' float) call: com.bytedance.apm.b.12.<init>(java.lang.String, java.lang.String, float):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.apm.p.b.a(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.base.q.run():void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: CONSTRUCTOR  (r0v0 com.bytedance.apm.b$12) = (r4v0 'str' java.lang.String), (r3v0 'str2' java.lang.String), (r2v0 'f2' float) call: com.bytedance.apm.b.12.<init>(java.lang.String, java.lang.String, float):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.base.q.run():void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            java.lang.String r4 = r5.arg$1
            java.lang.String r3 = r5.arg$2
            float r2 = r5.arg$3
            com.bytedance.apm.p.b r1 = com.bytedance.apm.p.b.a.f25210a
            com.bytedance.apm.b$12 r0 = new com.bytedance.apm.b$12
            r0.<init>(r4, r3, r2)
            r1.a(r0)
            boolean r0 = com.bytedance.apm.c.f24687c
            if (r0 == 0) goto L_0x0020
            com.bytedance.apm.p.c r1 = com.bytedance.apm.p.c.a()
            com.bytedance.apm.b$13 r0 = new com.bytedance.apm.b$13
            r0.<init>(r4, r3, r2)
            r1.a(r0)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.q.run():void");
    }
}
