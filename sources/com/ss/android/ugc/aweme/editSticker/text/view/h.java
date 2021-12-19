package com.ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.d;
import com.ss.android.ugc.aweme.editSticker.g;
import com.ss.android.ugc.aweme.editSticker.text.a.b;
import com.ss.android.ugc.aweme.shortvideo.s.c;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final g f88671a;

    /* renamed from: b  reason: collision with root package name */
    private final f f88672b;

    static {
        Covode.recordClassIndex(55789);
    }

    h(g gVar, f fVar) {
        this.f88671a = gVar;
        this.f88672b = fVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        g gVar = this.f88671a;
        f fVar = this.f88672b;
        if (fVar.getFontData() != null) {
            gVar.f88664b = fVar.getFontData().f88297e;
        }
        if (fVar.f88655a != null) {
            if (fVar.f88655a.b()) {
                gVar.a(fVar.getFontData());
            } else if (fVar.f88655a.f88300h == 3) {
                fVar.b();
            } else if (!c.a(fVar.getContext())) {
                d.e().a(fVar.getContext(), R.string.b1x);
            } else {
                b a2 = b.a();
                Context context = fVar.getContext();
                com.ss.android.ugc.aweme.editSticker.text.a.c cVar = fVar.f88655a;
                if (context != null) {
                    g.b().b(cVar.f88301i, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0067: INVOKE  
                          (wrap: com.ss.android.ugc.tools.b.a.d : 0x005c: INVOKE  (r2v1 com.ss.android.ugc.tools.b.a.d) =  type: STATIC call: com.ss.android.ugc.aweme.editSticker.g.b():com.ss.android.ugc.tools.b.a.d)
                          (wrap: com.ss.android.ugc.effectmanager.effect.model.Effect : 0x0060: IGET  (r1v2 com.ss.android.ugc.effectmanager.effect.model.Effect) = (r0v9 'cVar' com.ss.android.ugc.aweme.editSticker.text.a.c) com.ss.android.ugc.aweme.editSticker.text.a.c.i com.ss.android.ugc.effectmanager.effect.model.Effect)
                          (wrap: com.ss.android.ugc.aweme.editSticker.text.a.b$4 : 0x0064: CONSTRUCTOR  (r0v11 com.ss.android.ugc.aweme.editSticker.text.a.b$4) = 
                          (r3v0 'a2' com.ss.android.ugc.aweme.editSticker.text.a.b)
                          (r5v0 'fVar' com.ss.android.ugc.aweme.editSticker.text.view.f)
                         call: com.ss.android.ugc.aweme.editSticker.text.a.b.4.<init>(com.ss.android.ugc.aweme.editSticker.text.a.b, com.ss.android.ugc.aweme.editSticker.text.a.a):void type: CONSTRUCTOR)
                         type: INTERFACE call: com.ss.android.ugc.tools.b.a.d.b(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener):void in method: com.ss.android.ugc.aweme.editSticker.text.view.h.onClick(android.view.View):void, file: classes9.dex
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0064: CONSTRUCTOR  (r0v11 com.ss.android.ugc.aweme.editSticker.text.a.b$4) = 
                          (r3v0 'a2' com.ss.android.ugc.aweme.editSticker.text.a.b)
                          (r5v0 'fVar' com.ss.android.ugc.aweme.editSticker.text.view.f)
                         call: com.ss.android.ugc.aweme.editSticker.text.a.b.4.<init>(com.ss.android.ugc.aweme.editSticker.text.a.b, com.ss.android.ugc.aweme.editSticker.text.a.a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.editSticker.text.view.h.onClick(android.view.View):void, file: classes9.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 33 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.editSticker.text.a.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 39 more
                        */
                    /*
                    // Method dump skipped, instructions count: 114
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.view.h.onClick(android.view.View):void");
                }
            }
