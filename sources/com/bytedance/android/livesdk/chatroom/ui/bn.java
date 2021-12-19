package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final /* synthetic */ class bn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bg f15977a;

    static {
        Covode.recordClassIndex(8838);
    }

    bn(bg bgVar) {
        this.f15977a = bgVar;
    }

    public final void run() {
        int i2;
        MethodCollector.i(1022);
        bg bgVar = this.f15977a;
        if (!(bgVar.f15946e || ((IHostContext) a.a(IHostContext.class)).context() == null || bgVar.getContext() == null)) {
            bgVar.n.setAdapter(new as(bgVar.v));
            bgVar.n.addOnPageChangeListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0032: INVOKE  
                  (wrap: androidx.viewpager.widget.ViewPager : 0x002b: IGET  (r1v1 androidx.viewpager.widget.ViewPager) = (r2v0 'bgVar' com.bytedance.android.livesdk.chatroom.ui.bg) com.bytedance.android.livesdk.chatroom.ui.bg.n androidx.viewpager.widget.ViewPager)
                  (wrap: com.bytedance.android.livesdk.chatroom.ui.bg$7 : 0x002f: CONSTRUCTOR  (r0v8 com.bytedance.android.livesdk.chatroom.ui.bg$7) = (r2v0 'bgVar' com.bytedance.android.livesdk.chatroom.ui.bg) call: com.bytedance.android.livesdk.chatroom.ui.bg.7.<init>(com.bytedance.android.livesdk.chatroom.ui.bg):void type: CONSTRUCTOR)
                 type: VIRTUAL call: androidx.viewpager.widget.ViewPager.addOnPageChangeListener(androidx.viewpager.widget.ViewPager$e):void in method: com.bytedance.android.livesdk.chatroom.ui.bn.run():void, file: classes6.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: CONSTRUCTOR  (r0v8 com.bytedance.android.livesdk.chatroom.ui.bg$7) = (r2v0 'bgVar' com.bytedance.android.livesdk.chatroom.ui.bg) call: com.bytedance.android.livesdk.chatroom.ui.bg.7.<init>(com.bytedance.android.livesdk.chatroom.ui.bg):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.chatroom.ui.bn.run():void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.chatroom.ui.bg, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
            // Method dump skipped, instructions count: 226
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.bn.run():void");
        }
    }
