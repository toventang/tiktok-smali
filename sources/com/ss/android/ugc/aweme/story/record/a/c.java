package com.ss.android.ugc.aweme.story.record.a;

import androidx.core.g.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.record.r;

final /* synthetic */ class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final f f138162a;

    static {
        Covode.recordClassIndex(90364);
    }

    c(f fVar) {
        this.f138162a = fVar;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        f fVar = this.f138162a;
        r rVar = (r) obj;
        rVar.f130131a.f130085a = new g(fVar);
        rVar.f130131a.f130086b = new h(fVar);
        rVar.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: INVOKE  
              (r6v1 'rVar' com.ss.android.ugc.aweme.shortvideo.record.r)
              (wrap: com.ss.android.ugc.aweme.story.record.a.b$1 : 0x0018: CONSTRUCTOR  (r0v2 com.ss.android.ugc.aweme.story.record.a.b$1) =  call: com.ss.android.ugc.aweme.story.record.a.b.1.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: com.ss.android.ugc.aweme.shortvideo.record.r.a(com.ss.android.ugc.aweme.tools.extract.v):void in method: com.ss.android.ugc.aweme.story.record.a.c.a(java.lang.Object):void, file: classes7.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0018: CONSTRUCTOR  (r0v2 com.ss.android.ugc.aweme.story.record.a.b$1) =  call: com.ss.android.ugc.aweme.story.record.a.b.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.story.record.a.c.a(java.lang.Object):void, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.story.record.a.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.a.c.a(java.lang.Object):void");
    }
}
