package com.ss.android.ugc.aweme.ftc;

import android.widget.FrameLayout;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ftc.h.a;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.d;
import com.ss.android.ugc.aweme.shortvideo.ui.f;
import com.ss.android.ugc.aweme.sticker.presenter.i;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FTCVideoRecordNewActivity f98928a;

    static {
        Covode.recordClassIndex(62898);
    }

    x(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f98928a = fTCVideoRecordNewActivity;
    }

    public final void run() {
        d a2;
        c cVar;
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f98928a;
        c cVar2 = fTCVideoRecordNewActivity.t;
        q.a("addFragment onFragmentActivityCreated PlanC");
        f.a(fTCVideoRecordNewActivity.v);
        if (cVar2 instanceof d) {
            fTCVideoRecordNewActivity.f97387m = (FrameLayout) fTCVideoRecordNewActivity.findViewById(R.id.c7a);
            q.a("addFragment onFragmentActivityCreated initFilterModule");
            j m2 = fTCVideoRecordNewActivity.m();
            m2.K();
            m2.n();
            com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new i(fTCVideoRecordNewActivity, m2));
            fTCVideoRecordNewActivity.m().C().a();
            if (fTCVideoRecordNewActivity.getIntent() != null && (((a2 = com.ss.android.ugc.aweme.port.in.c.f115629h.a(fTCVideoRecordNewActivity.getIntent().getSerializableExtra("music_wave_data"))) != null && k.b.a(a2.getMusicWavePointArray())) || ((cVar = cr.a().f125295a) != null && k.b.a(cVar.getMusicWaveData()) && (a2 = k.b(cVar)) != null && k.b.a(a2.getMusicWavePointArray())))) {
                fTCVideoRecordNewActivity.f97381g.aw = k.a(a2);
            } else if (fTCVideoRecordNewActivity.f97381g.f124757b.y != null) {
                k.a(fTCVideoRecordNewActivity.f97381g.f124757b.y, new j(fTCVideoRecordNewActivity));
            }
            com.ss.android.ugc.gamora.recorder.sticker.c.k.a((i) fTCVideoRecordNewActivity.E, true);
            if (fTCVideoRecordNewActivity.p) {
                fTCVideoRecordNewActivity.f97382h.post(new w(fTCVideoRecordNewActivity));
            }
            if (fTCVideoRecordNewActivity.f97381g.f124757b.f124714i) {
                a aVar = (a) ApiCenter.a.a(fTCVideoRecordNewActivity).a(a.class);
                aVar.a(fTCVideoRecordNewActivity.f97381g.n());
                aVar.a(0);
                fTCVideoRecordNewActivity.B.x();
            }
            fTCVideoRecordNewActivity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b4: INVOKE  
                  (wrap: android.view.ViewTreeObserver : 0x00ab: INVOKE  (r1v4 android.view.ViewTreeObserver) = 
                  (wrap: android.view.View : 0x00a7: INVOKE  (r0v23 android.view.View) = 
                  (wrap: android.view.Window : 0x00a3: INVOKE  (r0v22 android.view.Window) = (r2v0 'fTCVideoRecordNewActivity' com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity) type: VIRTUAL call: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.getWindow():android.view.Window)
                 type: VIRTUAL call: android.view.Window.getDecorView():android.view.View)
                 type: VIRTUAL call: android.view.View.getViewTreeObserver():android.view.ViewTreeObserver)
                  (wrap: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity$1 : 0x00b1: CONSTRUCTOR  (r0v24 com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity$1) = (r2v0 'fTCVideoRecordNewActivity' com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity) call: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.1.<init>(com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.view.ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener):void in method: com.ss.android.ugc.aweme.ftc.x.run():void, file: classes7.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b1: CONSTRUCTOR  (r0v24 com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity$1) = (r2v0 'fTCVideoRecordNewActivity' com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity) call: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity.1.<init>(com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.ftc.x.run():void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 243
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.x.run():void");
        }
    }
