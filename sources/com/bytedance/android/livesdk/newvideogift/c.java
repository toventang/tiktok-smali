package com.bytedance.android.livesdk.newvideogift;

import android.content.res.Resources;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ac.g;
import com.bytedance.android.livesdk.manage.a;
import com.bytedance.android.livesdk.model.message.r;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget;
import com.bytedance.android.livesdk.service.c.c.d;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.a.b;

final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewVideoGiftWidget f19938a;

    static {
        Covode.recordClassIndex(11791);
    }

    c(LiveNewVideoGiftWidget liveNewVideoGiftWidget) {
        this.f19938a = liveNewVideoGiftWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        String str;
        String a2;
        LiveNewVideoGiftWidget liveNewVideoGiftWidget = this.f19938a;
        y yVar = (y) obj;
        User owner = liveNewVideoGiftWidget.f19843c.getOwner();
        long j2 = 0;
        if (yVar.f19703a || !(yVar.getMessageId() == 0 || yVar.f19705g == null)) {
            u uVar = yVar.t;
            if (yVar.f19703a || uVar != null) {
                String c2 = a.c(yVar.f19703a ? yVar.f19707i : uVar.n);
                if (yVar.f19703a) {
                    uVar = new u();
                    uVar.n = yVar.f19707i;
                    str = "";
                } else if (yVar.f19706h == null || yVar.f19706h.getId() <= 0 || (owner != null && yVar.f19706h.getId() == owner.getId())) {
                    str = uVar.f19760c;
                } else {
                    Resources a3 = com.bytedance.android.live.core.f.y.a();
                    Object[] objArr = new Object[1];
                    if (g.a(yVar.f19706h) == null) {
                        a2 = "";
                    } else {
                        a2 = g.a(yVar.f19706h);
                    }
                    objArr[0] = a2;
                    str = a3.getString(R.string.goi, objArr);
                }
                r rVar = new r();
                rVar.f19673a = yVar.getMessageId();
                rVar.f19674b = uVar.n;
                rVar.f19675c = uVar.f19763f;
                rVar.f19676d = c2;
                rVar.f19677e = yVar.r;
                rVar.f19678f = yVar.f19706h;
                rVar.f19679g = yVar.f19705g;
                rVar.f19680h = str;
                rVar.f19681i = yVar.q;
                rVar.f19682j = uVar.f19761d;
                rVar.n = yVar.s;
                rVar.f19683k = yVar.f19708j;
                Long valueOf = Long.valueOf(rVar.f19674b);
                if (valueOf != null) {
                    j2 = valueOf.longValue();
                }
                boolean b2 = a.b(j2);
                d dVar = d.a.C0463a.f21379a;
                dVar.f21373c = rVar.f19674b;
                dVar.f21372b = rVar.n;
                dVar.f21374d = com.bytedance.android.livesdk.utils.a.a.a();
                dVar.f21371a = b2;
                LiveNewVideoGiftWidget.AnonymousClass1 r8 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c7: CONSTRUCTOR  (r8v2 'r8' com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget$1) = 
                      (r5v0 'liveNewVideoGiftWidget' com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget)
                      (r2v0 'rVar' com.bytedance.android.livesdk.model.message.r)
                     call: com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget.1.<init>(com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget, com.bytedance.android.livesdk.model.message.r):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.newvideogift.c.invoke(java.lang.Object):java.lang.Object, file: classes6.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.newvideogift.LiveNewVideoGiftWidget, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    */
                /*
                // Method dump skipped, instructions count: 393
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.newvideogift.c.invoke(java.lang.Object):java.lang.Object");
            }
        }
