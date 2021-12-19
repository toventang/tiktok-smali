package com.bytedance.im.core.internal.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.d.b.b;
import com.bytedance.im.core.internal.d.b.d;
import com.bytedance.im.core.internal.utils.x;
import java.util.List;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f38713b;

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f38714a;

    static {
        Covode.recordClassIndex(23092);
    }

    public static c a() {
        MethodCollector.i(10547);
        if (f38713b == null) {
            synchronized (c.class) {
                try {
                    if (f38713b == null) {
                        f38713b = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10547);
                    throw th;
                }
            }
        }
        c cVar = f38713b;
        MethodCollector.o(10547);
        return cVar;
    }

    private c() {
        b.AnonymousClass6 r2;
        e a2;
        b.AnonymousClass5 r1 = null;
        f.b("RequestManagerFactory", "config:" + com.bytedance.im.core.a.d.a().b().az, (Throwable) null);
        b.AnonymousClass1 r4 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: CONSTRUCTOR  (r4v0 'r4' com.bytedance.im.core.internal.d.b.b$1) =  call: com.bytedance.im.core.internal.d.b.b.1.<init>():void type: CONSTRUCTOR in method: com.bytedance.im.core.internal.d.c.<init>():void, file: classes10.dex
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.internal.d.b.b, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            */
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.d.c.<init>():void");
    }

    public final void a(k kVar) {
        for (d dVar : this.f38714a) {
            if (dVar.a(kVar)) {
                dVar.a().e(kVar);
                return;
            }
        }
    }

    public final void a(x xVar) {
        for (d dVar : this.f38714a) {
            dVar.a().a(xVar);
        }
    }
}
