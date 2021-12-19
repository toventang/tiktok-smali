package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.a;
import com.bytedance.ies.dmt.ui.widget.d;
import com.ss.android.ugc.aweme.feed.ui.az;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class v implements az.a {

    /* renamed from: a  reason: collision with root package name */
    private final p f95122a;

    static {
        Covode.recordClassIndex(60289);
    }

    v(p pVar) {
        this.f95122a = pVar;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.az.a
    public final View a(View view) {
        p pVar = this.f95122a;
        d dVar = new d.a(pVar.getActivity()).a(2131233141).b(R.string.h2z).c(R.string.h2y).a(a.BORDER, R.string.h35, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002e: IGET  (r2v1 'dVar' com.bytedance.ies.dmt.ui.widget.d) = 
              (wrap: com.bytedance.ies.dmt.ui.widget.d$a : 0x002a: INVOKE  (r0v5 com.bytedance.ies.dmt.ui.widget.d$a) = 
              (wrap: com.bytedance.ies.dmt.ui.widget.d$a : 0x001c: INVOKE  (r3v0 com.bytedance.ies.dmt.ui.widget.d$a) = 
              (wrap: com.bytedance.ies.dmt.ui.widget.d$a : 0x0015: INVOKE  (r1v2 com.bytedance.ies.dmt.ui.widget.d$a) = 
              (wrap: com.bytedance.ies.dmt.ui.widget.d$a : 0x000e: INVOKE  (r1v1 com.bytedance.ies.dmt.ui.widget.d$a) = 
              (wrap: com.bytedance.ies.dmt.ui.widget.d$a : 0x0008: CONSTRUCTOR  (r1v0 com.bytedance.ies.dmt.ui.widget.d$a) = 
              (wrap: androidx.fragment.app.e : 0x0004: INVOKE  (r0v0 androidx.fragment.app.e) = (r4v0 'pVar' com.ss.android.ugc.aweme.feed.ui.p) type: VIRTUAL call: androidx.fragment.app.Fragment.getActivity():androidx.fragment.app.e)
             call: com.bytedance.ies.dmt.ui.widget.d.a.<init>(android.content.Context):void type: CONSTRUCTOR)
              (2131233141 int)
             type: VIRTUAL call: com.bytedance.ies.dmt.ui.widget.d.a.a(int):com.bytedance.ies.dmt.ui.widget.d$a)
              (wrap: int : ?: SGET   com.zhiliaoapp.musically.R.string.h2z int)
             type: VIRTUAL call: com.bytedance.ies.dmt.ui.widget.d.a.b(int):com.bytedance.ies.dmt.ui.widget.d$a)
              (wrap: int : ?: SGET   com.zhiliaoapp.musically.R.string.h2y int)
             type: VIRTUAL call: com.bytedance.ies.dmt.ui.widget.d.a.c(int):com.bytedance.ies.dmt.ui.widget.d$a)
              (wrap: com.bytedance.ies.dmt.ui.widget.a : 0x0020: SGET  (r2v0 com.bytedance.ies.dmt.ui.widget.a) =  com.bytedance.ies.dmt.ui.widget.a.BORDER com.bytedance.ies.dmt.ui.widget.a)
              (wrap: int : ?: SGET   com.zhiliaoapp.musically.R.string.h35 int)
              (wrap: com.ss.android.ugc.aweme.feed.ui.p$2 : 0x0024: CONSTRUCTOR  (r1v3 com.ss.android.ugc.aweme.feed.ui.p$2) = (r4v0 'pVar' com.ss.android.ugc.aweme.feed.ui.p) call: com.ss.android.ugc.aweme.feed.ui.p.2.<init>(com.ss.android.ugc.aweme.feed.ui.p):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.ies.dmt.ui.widget.d.a.a(com.bytedance.ies.dmt.ui.widget.a, int, android.view.View$OnClickListener):com.bytedance.ies.dmt.ui.widget.d$a)
             com.bytedance.ies.dmt.ui.widget.d.a.a com.bytedance.ies.dmt.ui.widget.d in method: com.ss.android.ugc.aweme.feed.ui.v.a(android.view.View):android.view.View, file: classes5.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002a: INVOKE  (r0v5 com.bytedance.ies.dmt.ui.widget.d$a) = 
              (wrap: com.bytedance.ies.dmt.ui.widget.d$a : 0x001c: INVOKE  (r3v0 com.bytedance.ies.dmt.ui.widget.d$a) = 
              (wrap: com.bytedance.ies.dmt.ui.widget.d$a : 0x0015: INVOKE  (r1v2 com.bytedance.ies.dmt.ui.widget.d$a) = 
              (wrap: com.bytedance.ies.dmt.ui.widget.d$a : 0x000e: INVOKE  (r1v1 com.bytedance.ies.dmt.ui.widget.d$a) = 
              (wrap: com.bytedance.ies.dmt.ui.widget.d$a : 0x0008: CONSTRUCTOR  (r1v0 com.bytedance.ies.dmt.ui.widget.d$a) = 
              (wrap: androidx.fragment.app.e : 0x0004: INVOKE  (r0v0 androidx.fragment.app.e) = (r4v0 'pVar' com.ss.android.ugc.aweme.feed.ui.p) type: VIRTUAL call: androidx.fragment.app.Fragment.getActivity():androidx.fragment.app.e)
             call: com.bytedance.ies.dmt.ui.widget.d.a.<init>(android.content.Context):void type: CONSTRUCTOR)
              (2131233141 int)
             type: VIRTUAL call: com.bytedance.ies.dmt.ui.widget.d.a.a(int):com.bytedance.ies.dmt.ui.widget.d$a)
              (wrap: int : ?: SGET   com.zhiliaoapp.musically.R.string.h2z int)
             type: VIRTUAL call: com.bytedance.ies.dmt.ui.widget.d.a.b(int):com.bytedance.ies.dmt.ui.widget.d$a)
              (wrap: int : ?: SGET   com.zhiliaoapp.musically.R.string.h2y int)
             type: VIRTUAL call: com.bytedance.ies.dmt.ui.widget.d.a.c(int):com.bytedance.ies.dmt.ui.widget.d$a)
              (wrap: com.bytedance.ies.dmt.ui.widget.a : 0x0020: SGET  (r2v0 com.bytedance.ies.dmt.ui.widget.a) =  com.bytedance.ies.dmt.ui.widget.a.BORDER com.bytedance.ies.dmt.ui.widget.a)
              (wrap: int : ?: SGET   com.zhiliaoapp.musically.R.string.h35 int)
              (wrap: com.ss.android.ugc.aweme.feed.ui.p$2 : 0x0024: CONSTRUCTOR  (r1v3 com.ss.android.ugc.aweme.feed.ui.p$2) = (r4v0 'pVar' com.ss.android.ugc.aweme.feed.ui.p) call: com.ss.android.ugc.aweme.feed.ui.p.2.<init>(com.ss.android.ugc.aweme.feed.ui.p):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.ies.dmt.ui.widget.d.a.a(com.bytedance.ies.dmt.ui.widget.a, int, android.view.View$OnClickListener):com.bytedance.ies.dmt.ui.widget.d$a in method: com.ss.android.ugc.aweme.feed.ui.v.a(android.view.View):android.view.View, file: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
            	at jadx.core.codegen.InsnGen.instanceField(InsnGen.java:167)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: CONSTRUCTOR  (r1v3 com.ss.android.ugc.aweme.feed.ui.p$2) = (r4v0 'pVar' com.ss.android.ugc.aweme.feed.ui.p) call: com.ss.android.ugc.aweme.feed.ui.p.2.<init>(com.ss.android.ugc.aweme.feed.ui.p):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.feed.ui.v.a(android.view.View):android.view.View, file: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.feed.ui.p, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 26 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.feed.ui.p r4 = r5.f95122a
            com.bytedance.ies.dmt.ui.widget.d$a r1 = new com.bytedance.ies.dmt.ui.widget.d$a
            androidx.fragment.app.e r0 = r4.getActivity()
            r1.<init>(r0)
            r0 = 2131233141(0x7f080975, float:1.8082411E38)
            com.bytedance.ies.dmt.ui.widget.d$a r1 = r1.a(r0)
            r0 = 2131831313(0x7f112a11, float:1.9295648E38)
            com.bytedance.ies.dmt.ui.widget.d$a r1 = r1.b(r0)
            r0 = 2131831312(0x7f112a10, float:1.9295646E38)
            com.bytedance.ies.dmt.ui.widget.d$a r3 = r1.c(r0)
            com.bytedance.ies.dmt.ui.widget.a r2 = com.bytedance.ies.dmt.ui.widget.a.BORDER
            com.ss.android.ugc.aweme.feed.ui.p$2 r1 = new com.ss.android.ugc.aweme.feed.ui.p$2
            r1.<init>()
            r0 = 2131831319(0x7f112a17, float:1.929566E38)
            com.bytedance.ies.dmt.ui.widget.d$a r0 = r3.a(r2, r0, r1)
            com.bytedance.ies.dmt.ui.widget.d r2 = r0.f33648a
            com.bytedance.ies.dmt.ui.widget.e r1 = new com.bytedance.ies.dmt.ui.widget.e
            android.content.Context r0 = r6.getContext()
            r1.<init>(r0)
            r1.setStatus(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.v.a(android.view.View):android.view.View");
    }
}
