package com.bytedance.android.livesdk.widgets.giftwidget.b;

import android.content.DialogInterface;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.c;
import com.bytedance.android.live.wallet.model.g;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.android.livesdk.widgets.giftwidget.b.ag;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class aq implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ag.AnonymousClass2 f22748a;

    /* renamed from: b  reason: collision with root package name */
    private final g f22749b;

    /* renamed from: c  reason: collision with root package name */
    private final d f22750c;

    /* renamed from: d  reason: collision with root package name */
    private final RevenueExchange f22751d;

    /* renamed from: e  reason: collision with root package name */
    private final long f22752e;

    static {
        Covode.recordClassIndex(13407);
    }

    aq(ag.AnonymousClass2 r1, g gVar, d dVar, RevenueExchange revenueExchange, long j2) {
        this.f22748a = r1;
        this.f22749b = gVar;
        this.f22750c = dVar;
        this.f22751d = revenueExchange;
        this.f22752e = j2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        ag.AnonymousClass2 r4 = this.f22748a;
        g gVar = this.f22749b;
        d dVar = this.f22750c;
        RevenueExchange revenueExchange = this.f22751d;
        long j2 = this.f22752e;
        if (gVar.f13235d != null && gVar.f13235d.getBasePackage() != null) {
            aw.b(ag.this.f22702c, dVar.f21286b);
            c cVar = new c();
            cVar.f13215a = (int) gVar.f13235d.getBasePackage().getId();
            cVar.f13218d = 1;
            cVar.f13217c = revenueExchange.getCurrency();
            cVar.f13219e = 0;
            cVar.f13220f = j2;
            cVar.f13221g = gVar.f13235d.getBasePackage().getPrice() * j2;
            cVar.f13222h = (long) gVar.f13235d.getBasePackage().getRealDot();
            ((IWalletService) a.a(IWalletService.class)).walletCenter().a(cVar, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006b: INVOKE  
                  (wrap: com.bytedance.android.live.wallet.d : 0x0062: INVOKE  (r1v0 com.bytedance.android.live.wallet.d) = 
                  (wrap: com.bytedance.android.live.wallet.IWalletService : 0x0060: CHECK_CAST (r0v21 com.bytedance.android.live.wallet.IWalletService) = (com.bytedance.android.live.wallet.IWalletService) (wrap: com.bytedance.android.live.base.a : 0x005c: INVOKE  (r0v20 com.bytedance.android.live.base.a) = (wrap: java.lang.Class : 0x005a: CONST_CLASS   com.bytedance.android.live.wallet.IWalletService.class) type: STATIC call: com.bytedance.android.live.t.a.a(java.lang.Class):com.bytedance.android.live.base.a))
                 type: INTERFACE call: com.bytedance.android.live.wallet.IWalletService.walletCenter():com.bytedance.android.live.wallet.d)
                  (r2v1 'cVar' com.bytedance.android.live.wallet.model.c)
                  (wrap: com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2$1 : 0x0068: CONSTRUCTOR  (r0v22 com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2$1) = 
                  (r4v0 'r4' com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2)
                  (r3v0 'dVar' com.bytedance.android.livesdk.service.b.d)
                  (r2v1 'cVar' com.bytedance.android.live.wallet.model.c)
                 call: com.bytedance.android.livesdk.widgets.giftwidget.b.ag.2.1.<init>(com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2, com.bytedance.android.livesdk.service.b.d, com.bytedance.android.live.wallet.model.c):void type: CONSTRUCTOR)
                 type: INTERFACE call: com.bytedance.android.live.wallet.d.a(com.bytedance.android.live.wallet.model.c, com.bytedance.android.livesdkapi.depend.d.b.a):void in method: com.bytedance.android.livesdk.widgets.giftwidget.b.aq.onClick(android.content.DialogInterface, int):void, file: classes6.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0068: CONSTRUCTOR  (r0v22 com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2$1) = 
                  (r4v0 'r4' com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2)
                  (r3v0 'dVar' com.bytedance.android.livesdk.service.b.d)
                  (r2v1 'cVar' com.bytedance.android.live.wallet.model.c)
                 call: com.bytedance.android.livesdk.widgets.giftwidget.b.ag.2.1.<init>(com.bytedance.android.livesdk.widgets.giftwidget.b.ag$2, com.bytedance.android.livesdk.service.b.d, com.bytedance.android.live.wallet.model.c):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.widgets.giftwidget.b.aq.onClick(android.content.DialogInterface, int):void, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.widgets.giftwidget.b.ag, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widgets.giftwidget.b.aq.onClick(android.content.DialogInterface, int):void");
        }
    }
