package com.bytedance.ies.xelement.pickview.d;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.e.a;

public final class b extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final a f37387a;

    static {
        Covode.recordClassIndex(22472);
    }

    public b(a aVar) {
        this.f37387a = aVar;
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1000) {
            this.f37387a.invalidate();
        } else if (i2 == 2000) {
            this.f37387a.a(a.EnumC0918a.FLING);
        } else if (i2 == 3000) {
            a aVar = this.f37387a;
            if (aVar.f37393a != null) {
                aVar.f37398f.postDelayed(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: INVOKE  
                      (wrap: android.os.Handler : 0x0015: IGET  (r3v0 android.os.Handler) = (r1v2 'aVar' com.bytedance.ies.xelement.pickview.e.a) com.bytedance.ies.xelement.pickview.e.a.f android.os.Handler)
                      (wrap: com.bytedance.ies.xelement.pickview.e.a$1 : 0x0019: CONSTRUCTOR  (r2v0 com.bytedance.ies.xelement.pickview.e.a$1) = (r1v2 'aVar' com.bytedance.ies.xelement.pickview.e.a) call: com.bytedance.ies.xelement.pickview.e.a.1.<init>(com.bytedance.ies.xelement.pickview.e.a):void type: CONSTRUCTOR)
                      (200 long)
                     type: VIRTUAL call: android.os.Handler.postDelayed(java.lang.Runnable, long):boolean in method: com.bytedance.ies.xelement.pickview.d.b.handleMessage(android.os.Message):void, file: classes9.dex
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0019: CONSTRUCTOR  (r2v0 com.bytedance.ies.xelement.pickview.e.a$1) = (r1v2 'aVar' com.bytedance.ies.xelement.pickview.e.a) call: com.bytedance.ies.xelement.pickview.e.a.1.<init>(com.bytedance.ies.xelement.pickview.e.a):void type: CONSTRUCTOR in method: com.bytedance.ies.xelement.pickview.d.b.handleMessage(android.os.Message):void, file: classes9.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 30 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.xelement.pickview.e.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 36 more
                    */
                /*
                    this = this;
                    int r1 = r5.what
                    r0 = 1000(0x3e8, float:1.401E-42)
                    if (r1 == r0) goto L_0x002a
                    r0 = 2000(0x7d0, float:2.803E-42)
                    if (r1 == r0) goto L_0x0022
                    r0 = 3000(0xbb8, float:4.204E-42)
                    if (r1 == r0) goto L_0x000f
                L_0x000e:
                    return
                L_0x000f:
                    com.bytedance.ies.xelement.pickview.e.a r1 = r4.f37387a
                    com.bytedance.ies.xelement.pickview.c.b r0 = r1.f37393a
                    if (r0 == 0) goto L_0x000e
                    android.os.Handler r3 = r1.f37398f
                    com.bytedance.ies.xelement.pickview.e.a$1 r2 = new com.bytedance.ies.xelement.pickview.e.a$1
                    r2.<init>()
                    r0 = 200(0xc8, double:9.9E-322)
                    r3.postDelayed(r2, r0)
                    goto L_0x000e
                L_0x0022:
                    com.bytedance.ies.xelement.pickview.e.a r1 = r4.f37387a
                    com.bytedance.ies.xelement.pickview.e.a$a r0 = com.bytedance.ies.xelement.pickview.e.a.EnumC0918a.FLING
                    r1.a(r0)
                    return
                L_0x002a:
                    com.bytedance.ies.xelement.pickview.e.a r0 = r4.f37387a
                    r0.invalidate()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.pickview.d.b.handleMessage(android.os.Message):void");
            }
        }
