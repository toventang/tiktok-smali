package com.ss.android.ugc.aweme.story.record.a;

import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.b.g;
import com.ss.android.ugc.aweme.property.am;
import com.ss.android.ugc.aweme.shortvideo.record.aw;
import com.ss.android.ugc.aweme.tools.beauty.g.k;
import h.f.a.b;
import java.lang.reflect.Type;

final /* synthetic */ class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private final f f138167a;

    static {
        Covode.recordClassIndex(90369);
    }

    h(f fVar) {
        this.f138167a = fVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        int option;
        g gVar;
        aw awVar = (aw) obj;
        ((d) this.f138167a.a((Type) d.class, (String) null)).getApplication();
        boolean d2 = new k("").d();
        awVar.f130071a = true;
        awVar.f130072b = d2 ? 1 : 0;
        if (am.a()) {
            option = com.ss.android.ugc.asve.b.f.AS_OPTION_FLAG_PICTURE_SIZE.getOption() | 0;
        } else {
            option = (com.ss.android.ugc.asve.b.f.AS_OPTION_FLAG_PICTURE_SIZE.getOption() ^ -1) & 0;
        }
        awVar.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0038: INVOKE  
              (r5v1 'awVar' com.ss.android.ugc.aweme.shortvideo.record.aw)
              (wrap: com.ss.android.ugc.aweme.story.record.a.k$1 : 0x0035: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.story.record.a.k$1) = (wrap: byte : 0x0032: CAST (r1v2 byte) = (byte) (r0v12 'option' int)) call: com.ss.android.ugc.aweme.story.record.a.k.1.<init>(byte):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.ss.android.ugc.aweme.shortvideo.record.aw.a(com.ss.android.ugc.asve.context.a):void in method: com.ss.android.ugc.aweme.story.record.a.h.invoke(java.lang.Object):java.lang.Object, file: classes7.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0035: CONSTRUCTOR  (r0v13 com.ss.android.ugc.aweme.story.record.a.k$1) = (wrap: byte : 0x0032: CAST (r1v2 byte) = (byte) (r0v12 'option' int)) call: com.ss.android.ugc.aweme.story.record.a.k.1.<init>(byte):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.story.record.a.h.invoke(java.lang.Object):java.lang.Object, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.story.record.a.k, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.a.h.invoke(java.lang.Object):java.lang.Object");
    }
}
