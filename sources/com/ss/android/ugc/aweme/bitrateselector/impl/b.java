package com.ss.android.ugc.aweme.bitrateselector.impl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bitrateselector.a.f;
import com.ss.android.ugc.aweme.bitrateselector.impl.a;
import com.ss.android.ugc.aweme.bitrateselector.impl.c;
import com.ss.android.ugc.aweme.bitrateselector.impl.d;
import com.ss.android.ugc.f.a.a.a.b.d;
import com.ss.android.ugc.f.a.a.a.b.e;
import com.ss.android.ugc.f.a.a.a.b.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b implements com.ss.android.ugc.aweme.bitrateselector.a.b {

    /* renamed from: a  reason: collision with root package name */
    private g f68717a;

    static {
        Covode.recordClassIndex(42302);
    }

    @Override // com.ss.android.ugc.aweme.bitrateselector.a.b
    public final void a(f fVar) {
        g a2;
        int i2 = d.AnonymousClass1.f68720a[fVar.f68703f.ordinal()];
        if (i2 == 1) {
            a2 = new d.a(a.e.a(fVar.f68698a)).a(a.g.a(fVar.f68699b)).b(a.b.a(fVar.f68700c)).a(a.C1552a.a(fVar.f68701d)).a();
        } else if (i2 != 2) {
            a2 = new c.a(a.e.a(fVar.f68698a)).a(a.g.a(fVar.f68699b)).b(a.b.a(fVar.f68700c)).a(a.C1552a.a(fVar.f68701d)).a();
        } else {
            a2 = new e();
        }
        this.f68717a = a2;
    }

    @Override // com.ss.android.ugc.aweme.bitrateselector.a.b
    public final com.ss.android.ugc.aweme.bitrateselector.a.a.f a(List<? extends com.ss.android.ugc.aweme.bitrateselector.a.a.c> list, Map<String, Object> map) {
        com.ss.android.ugc.aweme.bitrateselector.a.a aVar;
        a.d.AnonymousClass2 r0;
        g gVar = this.f68717a;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends com.ss.android.ugc.aweme.bitrateselector.a.a.c> it = list.iterator();
        while (true) {
            aVar = null;
            a.d.AnonymousClass1 r4 = null;
            if (!it.hasNext()) {
                break;
            }
            com.ss.android.ugc.aweme.bitrateselector.a.a.c cVar = (com.ss.android.ugc.aweme.bitrateselector.a.a.c) it.next();
            if (cVar != null) {
                r4 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0020: CONSTRUCTOR  (r4v3 'r4' com.ss.android.ugc.aweme.bitrateselector.impl.a$d$1) = (r0v9 'cVar' com.ss.android.ugc.aweme.bitrateselector.a.a.c) call: com.ss.android.ugc.aweme.bitrateselector.impl.a.d.1.<init>(com.ss.android.ugc.aweme.bitrateselector.a.a.c):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.bitrateselector.impl.b.a(java.util.List<? extends com.ss.android.ugc.aweme.bitrateselector.a.a.c>, java.util.Map<java.lang.String, java.lang.Object>):com.ss.android.ugc.aweme.bitrateselector.a.a.f, file: classes4.dex
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
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:194)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.bitrateselector.impl.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 28 more
                    */
                /*
                    this = this;
                    com.ss.android.ugc.f.a.a.a.b.g r3 = r5.f68717a
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r1 = r6.iterator()
                L_0x000b:
                    boolean r0 = r1.hasNext()
                    r4 = 0
                    if (r0 == 0) goto L_0x0024
                    java.lang.Object r0 = r1.next()
                    com.ss.android.ugc.aweme.bitrateselector.a.a.c r0 = (com.ss.android.ugc.aweme.bitrateselector.a.a.c) r0
                    if (r0 != 0) goto L_0x001e
                L_0x001a:
                    r2.add(r4)
                    goto L_0x000b
                L_0x001e:
                    com.ss.android.ugc.aweme.bitrateselector.impl.a$d$1 r4 = new com.ss.android.ugc.aweme.bitrateselector.impl.a$d$1
                    r4.<init>(r0)
                    goto L_0x001a
                L_0x0024:
                    com.ss.android.ugc.f.a.a.a.a.f r3 = r3.a(r2, r7)
                    if (r3 != 0) goto L_0x002b
                    return r4
                L_0x002b:
                    com.ss.android.ugc.aweme.bitrateselector.a.a.f r2 = new com.ss.android.ugc.aweme.bitrateselector.a.a.f
                    r2.<init>()
                    com.ss.android.ugc.f.a.a.a.a.c r1 = r3.f145547a
                    if (r1 != 0) goto L_0x0054
                    r0 = r4
                L_0x0035:
                    r2.f68692a = r0
                    double r0 = r3.f145550d
                    r2.f68695d = r0
                    int r0 = r3.f145549c
                    r2.f68694c = r0
                    com.ss.android.ugc.f.a.a.a.b r0 = r3.f145548b
                    if (r0 != 0) goto L_0x0046
                L_0x0043:
                    r2.f68693b = r4
                    return r2
                L_0x0046:
                    com.ss.android.ugc.aweme.bitrateselector.a.a r4 = new com.ss.android.ugc.aweme.bitrateselector.a.a
                    int r1 = r0.getCode()
                    java.lang.String r0 = r0.getMessage()
                    r4.<init>(r1, r0)
                    goto L_0x0043
                L_0x0054:
                    com.ss.android.ugc.aweme.bitrateselector.impl.a$d$2 r0 = new com.ss.android.ugc.aweme.bitrateselector.impl.a$d$2
                    r0.<init>(r1)
                    goto L_0x0035
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bitrateselector.impl.b.a(java.util.List, java.util.Map):com.ss.android.ugc.aweme.bitrateselector.a.a.f");
            }
        }
