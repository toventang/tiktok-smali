package com.ss.android.ugc.aweme.photo;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final PhotoModule f114890a;

    static {
        Covode.recordClassIndex(73897);
    }

    n(PhotoModule photoModule) {
        this.f114890a = photoModule;
    }

    public final void run() {
        PhotoModule photoModule = this.f114890a;
        photoModule.f114827a.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE  
              (wrap: com.ss.android.ugc.asve.recorder.c.a : 0x0002: IGET  (r1v0 com.ss.android.ugc.asve.recorder.c.a) = (r2v0 'photoModule' com.ss.android.ugc.aweme.photo.PhotoModule) com.ss.android.ugc.aweme.photo.PhotoModule.a com.ss.android.ugc.asve.recorder.c.a)
              (wrap: com.ss.android.ugc.aweme.photo.PhotoModule$1 : 0x0006: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.photo.PhotoModule$1) = (r2v0 'photoModule' com.ss.android.ugc.aweme.photo.PhotoModule) call: com.ss.android.ugc.aweme.photo.PhotoModule.1.<init>(com.ss.android.ugc.aweme.photo.PhotoModule):void type: CONSTRUCTOR)
             type: INTERFACE call: com.ss.android.ugc.asve.recorder.c.a.a(com.ss.android.vesdk.ax$h):void in method: com.ss.android.ugc.aweme.photo.n.run():void, file: classes4.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r0v0 com.ss.android.ugc.aweme.photo.PhotoModule$1) = (r2v0 'photoModule' com.ss.android.ugc.aweme.photo.PhotoModule) call: com.ss.android.ugc.aweme.photo.PhotoModule.1.<init>(com.ss.android.ugc.aweme.photo.PhotoModule):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.photo.n.run():void, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.photo.PhotoModule, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.photo.PhotoModule r2 = r3.f114890a
            com.ss.android.ugc.asve.recorder.c.a r1 = r2.f114827a
            com.ss.android.ugc.aweme.photo.PhotoModule$1 r0 = new com.ss.android.ugc.aweme.photo.PhotoModule$1
            r0.<init>()
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.photo.n.run():void");
    }
}
