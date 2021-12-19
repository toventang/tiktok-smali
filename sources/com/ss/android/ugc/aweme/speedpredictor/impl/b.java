package com.ss.android.ugc.aweme.speedpredictor.impl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.m;
import com.ss.android.ml.n;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.b;
import com.ss.android.ugc.aweme.speedpredictor.api.d;
import com.ss.android.ugc.aweme.speedpredictor.api.e;
import com.ss.android.ugc.aweme.speedpredictor.impl.a;
import com.ss.android.ugc.h.c;
import com.ss.android.ugc.h.f;
import com.ss.android.ugc.h.g;
import java.util.HashMap;
import java.util.Map;

public final class b implements ISpeedCalculator {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Object, Object> f134672a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final c f134673b = g.e().f148507b;

    static {
        Covode.recordClassIndex(88000);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final double a() {
        return this.f134673b.d();
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final double b() {
        return this.f134673b.a();
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void e() {
        this.f134673b.c();
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final e[] d() {
        return a.c.a(this.f134673b.b());
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final int c() {
        double d2 = this.f134673b.d();
        if (d2 == -1.0d) {
            return -1;
        }
        return (int) ((d2 / 8.0d) / 1000.0d);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void a(double d2) {
        this.f134673b.a(d2);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void a(int i2) {
        this.f134673b.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
    public final void a(d dVar) {
        a.C3501a.AnonymousClass1 r0;
        c cVar = this.f134673b;
        if (dVar == null) {
            r0 = null;
        } else {
            r0 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: CONSTRUCTOR  (r0v0 'r0' com.ss.android.ugc.aweme.speedpredictor.impl.a$a$1) = (r3v0 'dVar' com.ss.android.ugc.aweme.speedpredictor.api.d) call: com.ss.android.ugc.aweme.speedpredictor.impl.a.a.1.<init>(com.ss.android.ugc.aweme.speedpredictor.api.d):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.speedpredictor.impl.b.a(com.ss.android.ugc.aweme.speedpredictor.api.d):void, file: classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.speedpredictor.impl.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                */
            /*
                this = this;
                com.ss.android.ugc.h.c r1 = r2.f134673b
                if (r3 != 0) goto L_0x0009
                r0 = 0
            L_0x0005:
                r1.a(r0)
                return
            L_0x0009:
                com.ss.android.ugc.aweme.speedpredictor.impl.a$a$1 r0 = new com.ss.android.ugc.aweme.speedpredictor.impl.a$a$1
                r0.<init>(r3)
                goto L_0x0005
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.speedpredictor.impl.b.a(com.ss.android.ugc.aweme.speedpredictor.api.d):void");
        }

        @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
        public final void a(e eVar) {
            this.f134673b.a(eVar.f134669c, eVar.f134667a / 8.0d, (long) eVar.f134668b);
        }

        @Override // com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator
        public final void a(ISpeedCalculatorConfig iSpeedCalculatorConfig) {
            Object c2;
            if (iSpeedCalculatorConfig != null) {
                this.f134673b.a(iSpeedCalculatorConfig.getSpeedQueueSize());
                this.f134673b.a(iSpeedCalculatorConfig.getDefaultSpeedInBPS());
                d.a speedAlgorithmType = iSpeedCalculatorConfig.getSpeedAlgorithmType();
                if (speedAlgorithmType == d.a.INTELLIGENT) {
                    boolean z = true;
                    if (b.a.f134665a == null || !b.a.f134665a.a() || b.a.f134665a == null || !b.a.f134665a.b()) {
                        z = false;
                    }
                    AnonymousClass1 r2 = null;
                    if (!z || b.a.f134665a == null || (c2 = b.a.f134665a.c()) == null || !(c2 instanceof g.a)) {
                        this.f134673b.a(new com.ss.android.ugc.h.e(new c(iSpeedCalculatorConfig)));
                        f fVar = f.a.f148504a;
                        final com.ss.android.ugc.aweme.speedpredictor.api.a intelligentAlgoConfig = iSpeedCalculatorConfig.getIntelligentAlgoConfig();
                        if (intelligentAlgoConfig != null) {
                            r2 = new n() {
                                /* class com.ss.android.ugc.aweme.speedpredictor.impl.b.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(88001);
                                }

                                @Override // com.ss.android.ml.n
                                public final String a() {
                                    return intelligentAlgoConfig.a();
                                }

                                @Override // com.ss.android.ml.n
                                public final String b() {
                                    return intelligentAlgoConfig.b();
                                }

                                @Override // com.ss.android.ml.n
                                public final boolean c() {
                                    return intelligentAlgoConfig.c();
                                }

                                @Override // com.ss.android.ml.n
                                public final String d() {
                                    return intelligentAlgoConfig.d();
                                }
                            };
                        }
                        fVar.f148503a = new m(r2);
                        fVar.f148503a.b();
                        return;
                    }
                    this.f134673b.a((g.a) c2);
                } else if (speedAlgorithmType == d.a.AVERAGE) {
                    this.f134673b.a(new com.ss.android.ugc.h.a());
                } else {
                    this.f134673b.a(new com.ss.android.ugc.h.b());
                }
            }
        }
    }
