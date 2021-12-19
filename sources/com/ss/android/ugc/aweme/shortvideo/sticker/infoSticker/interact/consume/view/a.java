package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.h;
import com.google.gson.f;
import com.google.gson.t;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.feed.i.i;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.j;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.List;
import java.util.Objects;

public abstract class a implements e {

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dh.d f130429b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f130430c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.tux.tooltip.a f130431d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f130432e;

    /* renamed from: f  reason: collision with root package name */
    public InteractStickerStruct f130433f;

    /* renamed from: g  reason: collision with root package name */
    public List<? extends NormalTrackTimeStamp> f130434g;

    /* renamed from: h  reason: collision with root package name */
    public final int f130435h;

    /* renamed from: i  reason: collision with root package name */
    public Context f130436i;

    /* renamed from: j  reason: collision with root package name */
    public final View f130437j;

    /* renamed from: k  reason: collision with root package name */
    public j f130438k;

    static {
        Covode.recordClassIndex(85536);
    }

    /* access modifiers changed from: protected */
    public int a(com.bytedance.tux.tooltip.a.a.d dVar) {
        l.d(dVar, "");
        return 0;
    }

    public void a(com.ss.android.ugc.aweme.dh.d dVar) {
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public void b(int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: protected */
    public abstract View e();

    /* access modifiers changed from: protected */
    public abstract void f();

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public void j() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public void k() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final InteractStickerStruct l() {
        return this.f130433f;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130455a;

        static {
            Covode.recordClassIndex(85542);
        }

        b(a aVar) {
            this.f130455a = aVar;
        }

        public final void run() {
            com.ss.android.b.a.a.a.b(this.f130455a.f130430c);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
    public final int m() {
        return hashCode();
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ long $animationDuration = 300;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(85544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.d.a.c.a(new i());
            new Handler().postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f130463a;

                static {
                    Covode.recordClassIndex(85545);
                }

                {
                    this.f130463a = r1;
                }

                public final void run() {
                    this.f130463a.this$0.f130432e = false;
                }
            }, this.$animationDuration);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
    public void i() {
        Runnable runnable = this.f130430c;
        if (runnable != null) {
            com.ss.android.b.a.a.a.c(runnable);
            this.f130430c = null;
        }
        com.ss.android.ugc.aweme.dh.d dVar = this.f130429b;
        if (dVar != null) {
            dVar.dismiss();
            this.f130429b = null;
        }
        j jVar = this.f130438k;
        if (jVar != null && jVar.o != null) {
            b();
        }
    }

    public final void n() {
        com.bytedance.tux.tooltip.a aVar;
        com.bytedance.tux.tooltip.a aVar2 = this.f130431d;
        if (aVar2 != null && aVar2.isShowing() && (aVar = this.f130431d) != null) {
            aVar.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a$a  reason: collision with other inner class name */
    public static final class RunnableC3402a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f130439a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f130440b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f130441c;

        static {
            Covode.recordClassIndex(85538);
        }

        RunnableC3402a(a aVar, float f2, float f3) {
            this.f130439a = aVar;
            this.f130440b = f2;
            this.f130441c = f3;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            if (this.f130439a.f130429b == null) {
                a aVar = this.f130439a;
                Context context = this.f130439a.f130436i;
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                aVar.f130429b = new com.ss.android.ugc.aweme.dh.d((Activity) context);
                com.ss.android.ugc.aweme.dh.d dVar = this.f130439a.f130429b;
                if (dVar != null) {
                    dVar.r = 300;
                }
                com.ss.android.ugc.aweme.dh.d dVar2 = this.f130439a.f130429b;
                if (dVar2 != null) {
                    dVar2.f80104k = false;
                    if (dVar2.f80095b != null) {
                        dVar2.f80095b.setNeedPath(false);
                    }
                }
                com.ss.android.ugc.aweme.dh.d dVar3 = this.f130439a.f130429b;
                if (dVar3 != null) {
                    dVar3.f80105l = true;
                }
                com.ss.android.ugc.aweme.dh.d dVar4 = this.f130439a.f130429b;
                if (dVar4 != null) {
                    dVar4.f80106m = true;
                }
                com.ss.android.ugc.aweme.dh.d dVar5 = this.f130439a.f130429b;
                if (dVar5 != null) {
                    View e2 = this.f130439a.e();
                    dVar5.f80095b = new com.ss.android.ugc.aweme.dh.a(dVar5.f80096c);
                    dVar5.f80095b.setBackgroundColor(0);
                    dVar5.f80095b.addView(e2);
                    dVar5.f80095b.setGravity(17);
                    dVar5.f80095b.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                    dVar5.f80095b.setVisibility(8);
                    if (dVar5.f80103j != 0) {
                        dVar5.f80095b.setBgColor(dVar5.f80103j);
                    }
                    dVar5.f80095b.setNeedPath(dVar5.f80104k);
                    dVar5.f80095b.setNeedPressFade(dVar5.f80105l);
                    dVar5.f80095b.setOnClickListener(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009f: INVOKE  
                          (wrap: com.ss.android.ugc.aweme.dh.a : 0x0098: IGET  (r1v22 com.ss.android.ugc.aweme.dh.a) = (r2v11 'dVar5' com.ss.android.ugc.aweme.dh.d) com.ss.android.ugc.aweme.dh.d.b com.ss.android.ugc.aweme.dh.a)
                          (wrap: com.ss.android.ugc.aweme.dh.d$2 : 0x009c: CONSTRUCTOR  (r0v85 com.ss.android.ugc.aweme.dh.d$2) = (r2v11 'dVar5' com.ss.android.ugc.aweme.dh.d) call: com.ss.android.ugc.aweme.dh.d.2.<init>(com.ss.android.ugc.aweme.dh.d):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.ss.android.ugc.aweme.dh.a.setOnClickListener(android.view.View$OnClickListener):void in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a.run():void, file: classes5.dex
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009c: CONSTRUCTOR  (r0v85 com.ss.android.ugc.aweme.dh.d$2) = (r2v11 'dVar5' com.ss.android.ugc.aweme.dh.d) call: com.ss.android.ugc.aweme.dh.d.2.<init>(com.ss.android.ugc.aweme.dh.d):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.a.run():void, file: classes5.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 24 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.dh.d, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 30 more
                        */
                    /*
                    // Method dump skipped, instructions count: 470
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.RunnableC3402a.run():void");
                }
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e
            public void a(InteractStickerStruct interactStickerStruct) {
                this.f130433f = interactStickerStruct;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c
            public void a(j jVar) {
                l.d(jVar, "");
                this.f130438k = jVar;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.d
            public void b(int i2) {
                Runnable runnable = this.f130430c;
                if (runnable != null) {
                    com.ss.android.b.a.a.a.c(runnable);
                    this.f130430c = null;
                }
                com.ss.android.ugc.aweme.dh.d dVar = this.f130429b;
                if (dVar != null) {
                    dVar.a();
                }
                this.f130429b = null;
            }

            /* access modifiers changed from: package-private */
            public static final class c extends m implements h.f.a.b<com.bytedance.tux.tooltip.a.a.d, z> {
                final /* synthetic */ z.c $actionCount;
                final /* synthetic */ z.c $tooltipHeight;
                final /* synthetic */ double $tooltipItemHeight = 42.0d;
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(85543);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(a aVar, z.c cVar, z.c cVar2) {
                    super(1);
                    this.this$0 = aVar;
                    this.$actionCount = cVar;
                    this.$tooltipHeight = cVar2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.tooltip.a.a.d dVar) {
                    com.bytedance.tux.tooltip.a.a.d dVar2 = dVar;
                    l.d(dVar2, "");
                    this.$actionCount.element = this.this$0.a(dVar2);
                    z.c cVar = this.$tooltipHeight;
                    int i2 = cVar.element;
                    double d2 = (double) this.$actionCount.element;
                    double d3 = this.$tooltipItemHeight;
                    Double.isNaN(d2);
                    cVar.element = i2 + n.a(d2 * d3);
                    return h.z.f158842a;
                }
            }

            public boolean b(float f2, float f3) {
                com.ss.android.ugc.d.a.c.a(new i(hashCode()));
                com.ss.android.ugc.aweme.dh.d dVar = this.f130429b;
                if (dVar == null || !dVar.isShowing()) {
                    d();
                    this.f130430c = new RunnableC3402a(this, f2, f3);
                    this.f130437j.post(new b(this));
                    return true;
                }
                com.ss.android.ugc.d.a.c.a(new i());
                return false;
            }

            public final boolean a(float f2, float f3) {
                com.ss.android.ugc.d.a.c.a(new i(hashCode()));
                com.bytedance.tux.tooltip.a aVar = this.f130431d;
                if ((aVar == null || !aVar.isShowing()) && !this.f130432e) {
                    d();
                    int a2 = n.a(58.0d);
                    int a3 = n.a(16.0d);
                    z.c cVar = new z.c();
                    cVar.element = n.a(10.0d);
                    z.c cVar2 = new z.c();
                    cVar2.element = 0;
                    int[] iArr = new int[2];
                    this.f130437j.getLocationOnScreen(iArr);
                    Context context = this.f130436i;
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    com.bytedance.tux.tooltip.b a4 = ((com.bytedance.tux.tooltip.a.a.b) new com.bytedance.tux.tooltip.a.a.b((Activity) context).a(-1001L).b(300L).d(a3)).a(new c(this, cVar2, cVar)).a(new d(this));
                    if (f3 < ((float) (cVar.element + a2 + a3))) {
                        a4.a(h.BOTTOM);
                        if (f3 > ((float) (a2 - a3))) {
                            a4.b(a3);
                        } else {
                            f3 = (float) a2;
                        }
                    } else {
                        a4.a(h.TOP);
                        a4.b(-a3);
                    }
                    a4.a(((int) f2) + iArr[0], ((int) f3) + iArr[1]);
                    if (cVar2.element <= 0) {
                        return false;
                    }
                    com.bytedance.tux.tooltip.a d2 = a4.d();
                    this.f130431d = d2;
                    if (d2 != null) {
                        d2.a();
                    }
                    this.f130432e = true;
                    return true;
                }
                com.ss.android.ugc.d.a.c.a(new i());
                com.bytedance.tux.tooltip.a aVar2 = this.f130431d;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
                return false;
            }

            public a(int i2, Context context, View view, InteractStickerStruct interactStickerStruct, j jVar) {
                String str;
                l.d(context, "");
                l.d(view, "");
                l.d(interactStickerStruct, "");
                this.f130435h = i2;
                this.f130436i = context;
                this.f130437j = view;
                this.f130438k = jVar;
                this.f130433f = interactStickerStruct;
                try {
                    f b2 = GsonHolder.c().b();
                    InteractStickerStruct interactStickerStruct2 = this.f130433f;
                    if (interactStickerStruct2 != null) {
                        str = interactStickerStruct2.getTrackList();
                    } else {
                        str = null;
                    }
                    this.f130434g = (List) b2.a(str, new com.google.gson.b.a<List<? extends NormalTrackTimeStamp>>() {
                        /* class com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(85537);
                        }
                    }.type);
                } catch (t unused) {
                }
            }
        }
