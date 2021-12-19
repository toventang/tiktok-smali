package com.ss.android.ugc.aweme.profile.edit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.edit.api.a;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final h f116129a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116130b;

    /* renamed from: c  reason: collision with root package name */
    private final String f116131c;

    /* renamed from: d  reason: collision with root package name */
    private final String f116132d;

    /* renamed from: e  reason: collision with root package name */
    private final String f116133e;

    static {
        Covode.recordClassIndex(74909);
    }

    i(h hVar, String str, String str2, String str3, String str4) {
        this.f116129a = hVar;
        this.f116130b = str;
        this.f116131c = str2;
        this.f116132d = str3;
        this.f116133e = str4;
    }

    public final void run() {
        h hVar = this.f116129a;
        String str = this.f116130b;
        String str2 = this.f116131c;
        String str3 = this.f116132d;
        String str4 = this.f116133e;
        hVar.f116122d = true;
        a.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0012: INVOKE  
              (wrap: com.ss.android.ugc.aweme.profile.edit.h$1 : 0x000f: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.profile.edit.h$1) = 
              (r1v0 'hVar' com.ss.android.ugc.aweme.profile.edit.h)
              (r2v0 'str' java.lang.String)
              (r3v0 'str2' java.lang.String)
              (r4v0 'str3' java.lang.String)
              (r5v0 'str4' java.lang.String)
             call: com.ss.android.ugc.aweme.profile.edit.h.1.<init>(com.ss.android.ugc.aweme.profile.edit.h, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR)
             type: STATIC call: com.ss.android.ugc.aweme.profile.edit.api.a.a(com.ss.android.ugc.aweme.profile.edit.api.a$a):void in method: com.ss.android.ugc.aweme.profile.edit.i.run():void, file: classes8.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.profile.edit.h$1) = 
              (r1v0 'hVar' com.ss.android.ugc.aweme.profile.edit.h)
              (r2v0 'str' java.lang.String)
              (r3v0 'str2' java.lang.String)
              (r4v0 'str3' java.lang.String)
              (r5v0 'str4' java.lang.String)
             call: com.ss.android.ugc.aweme.profile.edit.h.1.<init>(com.ss.android.ugc.aweme.profile.edit.h, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.profile.edit.i.run():void, file: classes8.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.profile.edit.h, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.profile.edit.h r1 = r6.f116129a
            java.lang.String r2 = r6.f116130b
            java.lang.String r3 = r6.f116131c
            java.lang.String r4 = r6.f116132d
            java.lang.String r5 = r6.f116133e
            r0 = 1
            r1.f116122d = r0
            com.ss.android.ugc.aweme.profile.edit.h$1 r0 = new com.ss.android.ugc.aweme.profile.edit.h$1
            r0.<init>(r2, r3, r4, r5)
            com.ss.android.ugc.aweme.profile.edit.api.a.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.edit.i.run():void");
    }
}
