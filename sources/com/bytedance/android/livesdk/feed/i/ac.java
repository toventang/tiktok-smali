package com.bytedance.android.livesdk.feed.i;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ViewFlipper;
import com.bytedance.android.live.base.model.live.c;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.livesdk.feed.banner.a;
import com.bytedance.android.livesdk.feed.feed.g;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.ui.b;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class ac extends b<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    ViewFlipper f17508a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f17509b = false;

    static {
        Covode.recordClassIndex(9696);
    }

    public ac(View view) {
        super(view);
        this.f17508a = (ViewFlipper) view.findViewById(R.id.bfu);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.bytedance.android.livesdk.ui.b
    public final /* synthetic */ void a(FeedItem feedItem, int i2) {
        int i3;
        a aVar;
        int size;
        MethodCollector.i(2026);
        com.bytedance.android.live.base.model.a.a aVar2 = ((g) feedItem.item).f17478a;
        if (aVar2 == null || h.a(aVar2.f7374b)) {
            this.f17508a.stopFlipping();
            this.f17508a.setVisibility(8);
            MethodCollector.o(2026);
            return;
        }
        int i4 = 0;
        while (i4 < aVar2.f7374b.size()) {
            if (i4 >= this.f17508a.getChildCount()) {
                View a2 = com.a.a(LayoutInflater.from(this.itemView.getContext()), R.layout.b8v, this.f17508a, false);
                this.f17508a.addView(a2);
                aVar = new a(a2, this.f17509b);
                a2.setTag(R.id.et6, aVar);
            } else {
                aVar = (a) this.f17508a.getChildAt(i4).getTag(R.id.et6);
            }
            c cVar = aVar2.f7374b.get(i4);
            if (aVar.f17284e) {
                p.b(aVar.f17281b, cVar.f7413e);
            }
            p.b(aVar.f17280a, cVar.f7409a);
            aVar.f17282c.setText(cVar.f7410b);
            aVar.f17285f.setOnClickListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0086: INVOKE  
                  (wrap: android.view.View : 0x007f: IGET  (r2v6 android.view.View) = (r0v26 'aVar' com.bytedance.android.livesdk.feed.banner.a) com.bytedance.android.livesdk.feed.banner.a.f android.view.View)
                  (wrap: com.bytedance.android.livesdk.feed.banner.a$1 : 0x0083: CONSTRUCTOR  (r1v7 com.bytedance.android.livesdk.feed.banner.a$1) = (r0v26 'aVar' com.bytedance.android.livesdk.feed.banner.a), (r8v1 'cVar' com.bytedance.android.live.base.model.live.c) call: com.bytedance.android.livesdk.feed.banner.a.1.<init>(com.bytedance.android.livesdk.feed.banner.a, com.bytedance.android.live.base.model.live.c):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.view.View.setOnClickListener(android.view.View$OnClickListener):void in method: com.bytedance.android.livesdk.feed.i.ac.a(com.bytedance.android.livesdk.model.FeedItem, int):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:239)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0083: CONSTRUCTOR  (r1v7 com.bytedance.android.livesdk.feed.banner.a$1) = (r0v26 'aVar' com.bytedance.android.livesdk.feed.banner.a), (r8v1 'cVar' com.bytedance.android.live.base.model.live.c) call: com.bytedance.android.livesdk.feed.banner.a.1.<init>(com.bytedance.android.livesdk.feed.banner.a, com.bytedance.android.live.base.model.live.c):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.feed.i.ac.a(com.bytedance.android.livesdk.model.FeedItem, int):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.feed.banner.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 300
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.i.ac.a(java.lang.Object, int):void");
        }
    }
