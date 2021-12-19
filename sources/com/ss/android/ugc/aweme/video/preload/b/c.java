package com.ss.android.ugc.aweme.video.preload.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.simkit.d;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.speedpredictor.api.e;
import com.ss.android.ugc.aweme.video.preload.b.a;
import com.ss.android.ugc.h.g;
import com.ss.android.ugc.h.i;
import java.util.HashMap;
import java.util.Map;

public final class c implements com.ss.android.ugc.h.c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Object, Object> f143639a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private ISpeedCalculator f143640b = d.a().f();

    static {
        Covode.recordClassIndex(93987);
    }

    @Override // com.ss.android.ugc.h.c
    public final double a() {
        return this.f143640b.b();
    }

    @Override // com.ss.android.ugc.h.c
    public final void c() {
        this.f143640b.e();
    }

    @Override // com.ss.android.ugc.h.d
    public final double d() {
        return this.f143640b.a();
    }

    @Override // com.ss.android.ugc.h.c
    public final i[] b() {
        return a.c.a(this.f143640b.d());
    }

    @Override // com.ss.android.ugc.h.c
    public final void a(double d2) {
        this.f143640b.a(d2);
    }

    @Override // com.ss.android.ugc.h.c
    public final void a(int i2) {
        this.f143640b.a(i2);
    }

    @Override // com.ss.android.ugc.h.c
    public final void a(g.a aVar) {
        a.C3825a.AnonymousClass1 r0;
        ISpeedCalculator iSpeedCalculator = this.f143640b;
        if (aVar == null) {
            r0 = null;
        } else {
            r0 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: CONSTRUCTOR  (r0v0 'r0' com.ss.android.ugc.aweme.video.preload.b.a$a$1) = (r3v0 'aVar' com.ss.android.ugc.h.g$a) call: com.ss.android.ugc.aweme.video.preload.b.a.a.1.<init>(com.ss.android.ugc.h.g$a):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.video.preload.b.c.a(com.ss.android.ugc.h.g$a):void, file: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.video.preload.b.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                */
            /*
                this = this;
                com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator r1 = r2.f143640b
                if (r3 != 0) goto L_0x0009
                r0 = 0
            L_0x0005:
                r1.a(r0)
                return
            L_0x0009:
                com.ss.android.ugc.aweme.video.preload.b.a$a$1 r0 = new com.ss.android.ugc.aweme.video.preload.b.a$a$1
                r0.<init>(r3)
                goto L_0x0005
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.b.c.a(com.ss.android.ugc.h.g$a):void");
        }

        @Override // com.ss.android.ugc.h.c
        public final void a(double d2, double d3, long j2) {
            this.f143640b.a(new e(d3 * 8.0d, (double) j2));
        }
    }
