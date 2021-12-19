package com.ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.task.a;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;

final /* synthetic */ class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b f140821a;

    static {
        Covode.recordClassIndex(91952);
    }

    e(b bVar) {
        this.f140821a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        b bVar = this.f140821a;
        bVar.f140783c.a("mv", true, "all", 0, 0, (IFetchPanelInfoListener) 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0010: INVOKE  
              (wrap: com.ss.android.ugc.aweme.effectplatform.f : 0x0002: IGET  (r1v0 com.ss.android.ugc.aweme.effectplatform.f) = (r0v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) com.ss.android.ugc.aweme.tools.mvtemplate.b.c com.ss.android.ugc.aweme.effectplatform.f)
              ("mv")
              true
              ("all")
              (0 int)
              (0 int)
              (wrap: com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener : ?: CAST (com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener) (wrap: com.ss.android.ugc.aweme.tools.mvtemplate.b$1 : 0x0006: CONSTRUCTOR  (r7v0 com.ss.android.ugc.aweme.tools.mvtemplate.b$1) = (r0v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) call: com.ss.android.ugc.aweme.tools.mvtemplate.b.1.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.b):void type: CONSTRUCTOR))
             type: INTERFACE call: com.ss.android.ugc.aweme.effectplatform.f.a(java.lang.String, boolean, java.lang.String, int, int, com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener):void in method: com.ss.android.ugc.aweme.tools.mvtemplate.e.a():void, file: classes7.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener) (wrap: com.ss.android.ugc.aweme.tools.mvtemplate.b$1 : 0x0006: CONSTRUCTOR  (r7v0 com.ss.android.ugc.aweme.tools.mvtemplate.b$1) = (r0v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) call: com.ss.android.ugc.aweme.tools.mvtemplate.b.1.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.b):void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.tools.mvtemplate.e.a():void, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r7v0 com.ss.android.ugc.aweme.tools.mvtemplate.b$1) = (r0v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) call: com.ss.android.ugc.aweme.tools.mvtemplate.b.1.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.tools.mvtemplate.e.a():void, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.tools.mvtemplate.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 24 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.tools.mvtemplate.b r0 = r8.f140821a
            com.ss.android.ugc.aweme.effectplatform.f r1 = r0.f140783c
            com.ss.android.ugc.aweme.tools.mvtemplate.b$1 r7 = new com.ss.android.ugc.aweme.tools.mvtemplate.b$1
            r7.<init>()
            java.lang.String r2 = "mv"
            r3 = 1
            java.lang.String r4 = "all"
            r5 = 0
            r6 = 0
            r1.a(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.e.a():void");
    }
}
