package com.ss.android.ugc.aweme.challenge.ui;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;

final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f70133a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f70134b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f70135c;

    /* renamed from: d  reason: collision with root package name */
    private final int f70136d;

    /* renamed from: e  reason: collision with root package name */
    private final int f70137e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f70138f;

    /* renamed from: g  reason: collision with root package name */
    private final SpannableString f70139g;

    /* renamed from: h  reason: collision with root package name */
    private final SpannableString f70140h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f70141i;

    static {
        Covode.recordClassIndex(43251);
    }

    f(ImageView imageView, ViewGroup viewGroup, TextView textView, int i2, int i3, boolean z, SpannableString spannableString, SpannableString spannableString2, TextView textView2) {
        this.f70133a = imageView;
        this.f70134b = viewGroup;
        this.f70135c = textView;
        this.f70136d = i2;
        this.f70137e = i3;
        this.f70138f = z;
        this.f70139g = spannableString;
        this.f70140h = spannableString2;
        this.f70141i = textView2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0051 */
    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ImageView imageView = this.f70133a;
        ViewGroup viewGroup = this.f70134b;
        TextView textView = this.f70135c;
        int i2 = this.f70136d;
        int i3 = this.f70137e;
        boolean z = this.f70138f;
        SpannableString spannableString = this.f70139g;
        SpannableString spannableString2 = this.f70140h;
        TextView textView2 = this.f70141i;
        boolean isSelected = imageView.isSelected();
        ChallengeDetailLegacyServiceImpl.a().a(viewGroup, imageView, textView, i2, i3, isSelected, z, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: INVOKE  
              (wrap: com.ss.android.ugc.aweme.IChallengeDetailLegacyService : 0x0019: INVOKE  (r3v0 com.ss.android.ugc.aweme.IChallengeDetailLegacyService) =  type: STATIC call: com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl.a():com.ss.android.ugc.aweme.IChallengeDetailLegacyService)
              (r4v0 'viewGroup' android.view.ViewGroup)
              (r5v0 'imageView' android.widget.ImageView)
              (r6v0 'textView' android.widget.TextView)
              (r7v0 'i2' int)
              (r8v0 'i3' int)
              (r9v0 'isSelected' boolean)
              (r10v0 'z' boolean)
              (wrap: com.ss.android.ugc.aweme.challenge.ui.c$1 : 0x001f: CONSTRUCTOR  (r11v0 com.ss.android.ugc.aweme.challenge.ui.c$1) = 
              (r9v0 'isSelected' boolean)
              (r6v0 'textView' android.widget.TextView)
              (r1v0 'spannableString' android.text.SpannableString)
             call: com.ss.android.ugc.aweme.challenge.ui.c.1.<init>(boolean, android.widget.TextView, android.text.SpannableString):void type: CONSTRUCTOR)
             type: INTERFACE call: com.ss.android.ugc.aweme.IChallengeDetailLegacyService.a(android.view.ViewGroup, android.widget.ImageView, android.widget.TextView, int, int, boolean, boolean, android.animation.AnimatorListenerAdapter):void in method: com.ss.android.ugc.aweme.challenge.ui.f.onClick(android.view.View):void, file: classes5.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001f: CONSTRUCTOR  (r11v0 com.ss.android.ugc.aweme.challenge.ui.c$1) = 
              (r9v0 'isSelected' boolean)
              (r6v0 'textView' android.widget.TextView)
              (r1v0 'spannableString' android.text.SpannableString)
             call: com.ss.android.ugc.aweme.challenge.ui.c.1.<init>(boolean, android.widget.TextView, android.text.SpannableString):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.challenge.ui.f.onClick(android.view.View):void, file: classes5.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.challenge.ui.c, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r13)
            android.widget.ImageView r5 = r12.f70133a
            android.view.ViewGroup r4 = r12.f70134b
            android.widget.TextView r6 = r12.f70135c
            int r7 = r12.f70136d
            int r8 = r12.f70137e
            boolean r10 = r12.f70138f
            android.text.SpannableString r1 = r12.f70139g
            android.text.SpannableString r0 = r12.f70140h
            android.widget.TextView r2 = r12.f70141i
            boolean r9 = r5.isSelected()
            com.ss.android.ugc.aweme.IChallengeDetailLegacyService r3 = com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl.a()
            com.ss.android.ugc.aweme.challenge.ui.c$1 r11 = new com.ss.android.ugc.aweme.challenge.ui.c$1
            r11.<init>(r9, r6, r1)
            r3.a(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r9 == 0) goto L_0x002a
            r6.setText(r0)
        L_0x002a:
            android.content.Context r1 = r6.getContext()
            if (r9 == 0) goto L_0x005c
            r0 = 2131824299(0x7f110eab, float:1.9281422E38)
        L_0x0033:
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            r0 = r9 ^ 1
            r5.setSelected(r0)
            if (r9 != 0) goto L_0x005b
        L_0x0041:
            if (r4 == 0) goto L_0x0051
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L_0x0051
            android.view.ViewParent r4 = r4.getParent()
            android.view.View r4 = (android.view.View) r4
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout
            if (r0 == 0) goto L_0x0041
        L_0x0051:
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout
            if (r0 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout r4 = (com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout) r4
            r0 = 0
            r4.scrollTo(r0, r0)
        L_0x005b:
            return
        L_0x005c:
            r0 = 2131824009(0x7f110d89, float:1.9280834E38)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.f.onClick(android.view.View):void");
    }
}
