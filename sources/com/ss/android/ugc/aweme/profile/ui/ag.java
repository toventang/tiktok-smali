package com.ss.android.ugc.aweme.profile.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ce.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ag implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final HeaderDetailActivity f116860a;

    static {
        Covode.recordClassIndex(75470);
    }

    ag(HeaderDetailActivity headerDetailActivity) {
        this.f116860a = headerDetailActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        HeaderDetailActivity headerDetailActivity = this.f116860a;
        headerDetailActivity.f116773g.setVisibility(0);
        headerDetailActivity.f116774h.setVisibility(0);
        headerDetailActivity.f116772f.setVisibility(8);
        headerDetailActivity.showLoadAnim(headerDetailActivity.f116773g);
        b.a(headerDetailActivity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0027: INVOKE  
              (r2v0 'headerDetailActivity' com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity)
              (wrap: java.lang.String[] : 0x001e: FILLED_NEW_ARRAY  (r1v2 java.lang.String[]) = ("android.permission.WRITE_EXTERNAL_STORAGE") elemType: java.lang.String)
              (wrap: com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity$3 : 0x0024: CONSTRUCTOR  (r0v5 com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity$3) = (r2v0 'headerDetailActivity' com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity) call: com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity.3.<init>(com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity):void type: CONSTRUCTOR)
             type: STATIC call: com.ss.android.ugc.aweme.ce.b.a(android.app.Activity, java.lang.String[], com.ss.android.ugc.aweme.ce.b$b):void in method: com.ss.android.ugc.aweme.profile.ui.ag.onClick(android.view.View):void, file: classes6.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: CONSTRUCTOR  (r0v5 com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity$3) = (r2v0 'headerDetailActivity' com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity) call: com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity.3.<init>(com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.profile.ui.ag.onClick(android.view.View):void, file: classes6.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r4)
            com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity r2 = r3.f116860a
            android.widget.ImageView r0 = r2.f116773g
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r2.f116774h
            r0.setVisibility(r1)
            android.widget.ImageView r1 = r2.f116772f
            r0 = 8
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r2.f116773g
            r2.showLoadAnim(r0)
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity$3 r0 = new com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity$3
            r0.<init>()
            com.ss.android.ugc.aweme.ce.b.a(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.ag.onClick(android.view.View):void");
    }
}
