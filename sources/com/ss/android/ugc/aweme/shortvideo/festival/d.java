package com.ss.android.ugc.aweme.shortvideo.festival;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.az;

final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ImageView f128486a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f128487b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f128488c;

    /* renamed from: d  reason: collision with root package name */
    private final int f128489d;

    /* renamed from: e  reason: collision with root package name */
    private final int f128490e;

    /* renamed from: f  reason: collision with root package name */
    private final SpannableString f128491f;

    /* renamed from: g  reason: collision with root package name */
    private final SpannableString f128492g;

    /* renamed from: h  reason: collision with root package name */
    private final TextView f128493h;

    static {
        Covode.recordClassIndex(84249);
    }

    d(ImageView imageView, ViewGroup viewGroup, TextView textView, int i2, int i3, SpannableString spannableString, SpannableString spannableString2, TextView textView2) {
        this.f128486a = imageView;
        this.f128487b = viewGroup;
        this.f128488c = textView;
        this.f128489d = i2;
        this.f128490e = i3;
        this.f128491f = spannableString;
        this.f128492g = spannableString2;
        this.f128493h = textView2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ImageView imageView = this.f128486a;
        ViewGroup viewGroup = this.f128487b;
        TextView textView = this.f128488c;
        int i2 = this.f128489d;
        int i3 = this.f128490e;
        SpannableString spannableString = this.f128491f;
        SpannableString spannableString2 = this.f128492g;
        TextView textView2 = this.f128493h;
        boolean isSelected = imageView.isSelected();
        az.a(viewGroup, imageView, textView, i2, i3, isSelected, false, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: INVOKE  
              (r3v0 'viewGroup' android.view.ViewGroup)
              (r4v0 'imageView' android.widget.ImageView)
              (r5v0 'textView' android.widget.TextView)
              (r6v0 'i2' int)
              (r7v0 'i3' int)
              (r8v0 'isSelected' boolean)
              false
              (wrap: com.ss.android.ugc.aweme.shortvideo.festival.a$1 : 0x0019: CONSTRUCTOR  (r10v0 com.ss.android.ugc.aweme.shortvideo.festival.a$1) = 
              (r8v0 'isSelected' boolean)
              (r5v0 'textView' android.widget.TextView)
              (r1v0 'spannableString' android.text.SpannableString)
             call: com.ss.android.ugc.aweme.shortvideo.festival.a.1.<init>(boolean, android.widget.TextView, android.text.SpannableString):void type: CONSTRUCTOR)
             type: STATIC call: com.ss.android.ugc.aweme.utils.az.a(android.view.ViewGroup, android.widget.ImageView, android.widget.TextView, int, int, boolean, boolean, android.animation.AnimatorListenerAdapter):void in method: com.ss.android.ugc.aweme.shortvideo.festival.d.onClick(android.view.View):void, file: classes3.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0019: CONSTRUCTOR  (r10v0 com.ss.android.ugc.aweme.shortvideo.festival.a$1) = 
              (r8v0 'isSelected' boolean)
              (r5v0 'textView' android.widget.TextView)
              (r1v0 'spannableString' android.text.SpannableString)
             call: com.ss.android.ugc.aweme.shortvideo.festival.a.1.<init>(boolean, android.widget.TextView, android.text.SpannableString):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.festival.d.onClick(android.view.View):void, file: classes3.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.festival.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r12)
            android.widget.ImageView r4 = r11.f128486a
            android.view.ViewGroup r3 = r11.f128487b
            android.widget.TextView r5 = r11.f128488c
            int r6 = r11.f128489d
            int r7 = r11.f128490e
            android.text.SpannableString r1 = r11.f128491f
            android.text.SpannableString r0 = r11.f128492g
            android.widget.TextView r2 = r11.f128493h
            boolean r8 = r4.isSelected()
            com.ss.android.ugc.aweme.shortvideo.festival.a$1 r10 = new com.ss.android.ugc.aweme.shortvideo.festival.a$1
            r10.<init>(r8, r5, r1)
            r9 = 0
            com.ss.android.ugc.aweme.utils.az.a(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r8 == 0) goto L_0x0025
            r5.setText(r0)
        L_0x0025:
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r1 = r0.getResources()
            if (r8 == 0) goto L_0x003f
            r0 = 2131824299(0x7f110eab, float:1.9281422E38)
        L_0x0032:
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            r0 = r8 ^ 1
            r4.setSelected(r0)
            return
        L_0x003f:
            r0 = 2131824009(0x7f110d89, float:1.9280834E38)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.festival.d.onClick(android.view.View):void");
    }
}
