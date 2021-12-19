package com.ss.android.ugc.aweme.util;

import android.app.Activity;
import com.bytedance.apm.c;
import com.bytedance.apm.p.b;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f142487a;

    static {
        Covode.recordClassIndex(93191);
    }

    d(Activity activity) {
        this.f142487a = activity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String simpleName = this.f142487a.getClass().getSimpleName();
        if (c.f24685a == null) {
            return null;
        }
        b.a.f25210a.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: INVOKE  
              (wrap: com.bytedance.apm.p.b : 0x000e: SGET  (r1v0 com.bytedance.apm.p.b) =  com.bytedance.apm.p.b.a.a com.bytedance.apm.p.b)
              (wrap: com.bytedance.apm.b$16 : 0x0012: CONSTRUCTOR  (r0v4 com.bytedance.apm.b$16) = (r2v0 'simpleName' java.lang.String) call: com.bytedance.apm.b.16.<init>(java.lang.String):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.apm.p.b.a(java.lang.Runnable):void in method: com.ss.android.ugc.aweme.util.d.call():java.lang.Object, file: classes2.dex
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
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: CONSTRUCTOR  (r0v4 com.bytedance.apm.b$16) = (r2v0 'simpleName' java.lang.String) call: com.bytedance.apm.b.16.<init>(java.lang.String):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.util.d.call():java.lang.Object, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 18 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
            this = this;
            android.app.Activity r0 = r3.f142487a
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = r0.getSimpleName()
            android.content.Context r0 = com.bytedance.apm.c.f24685a
            if (r0 == 0) goto L_0x0018
            com.bytedance.apm.p.b r1 = com.bytedance.apm.p.b.a.f25210a
            com.bytedance.apm.b$16 r0 = new com.bytedance.apm.b$16
            r0.<init>(r2)
            r1.a(r0)
        L_0x0018:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.util.d.call():java.lang.Object");
    }
}
