package com.ss.android.ugc.aweme.playerkit.configpickerimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.playerkit.a.b;
import com.ss.android.ugc.aweme.playerkit.a.f;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.a;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.lang.reflect.Type;
import java.util.List;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f115512a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b f115513b = new com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b();

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.b f115514c = new com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.b();

    static {
        Covode.recordClassIndex(74147);
    }

    @Override // com.ss.android.ugc.aweme.playerkit.a.b
    public final <T> T a(f fVar, Type type) {
        return (T) com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a.a(new d(this, fVar, type));
    }

    /* access modifiers changed from: package-private */
    public final synchronized <T> T b(f fVar, Type type) {
        ConditionConfig conditionConfig;
        MethodCollector.i(3293);
        this.f115512a.a(fVar);
        com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b bVar = this.f115513b;
        bVar.f115506a = fVar;
        if (bVar.f115507b == null) {
            bVar.f115507b = (List) com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b.a(bVar.f115506a.f115469e, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: IPUT  
                  (wrap: java.util.List<java.lang.String> : 0x0022: CHECK_CAST (r0v43 java.util.List<java.lang.String>) = (java.util.List) (wrap: java.lang.Object : 0x001e: INVOKE  (r0v42 java.lang.Object) = 
                  (wrap: com.google.gson.i : 0x0015: IGET  (r1v6 com.google.gson.i) = 
                  (wrap: com.ss.android.ugc.aweme.playerkit.a.f : 0x0013: IGET  (r0v39 com.ss.android.ugc.aweme.playerkit.a.f) = (r2v0 'bVar' com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b) com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b.a com.ss.android.ugc.aweme.playerkit.a.f)
                 com.ss.android.ugc.aweme.playerkit.a.f.e com.google.gson.i)
                  (wrap: java.lang.reflect.Type : 0x001c: IGET  (r0v41 java.lang.reflect.Type) = 
                  (wrap: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b$1 : 0x0019: CONSTRUCTOR  (r0v40 com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b$1) = (r2v0 'bVar' com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b) call: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b.1.<init>(com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b):void type: CONSTRUCTOR)
                 com.google.gson.b.a.type java.lang.reflect.Type)
                 type: STATIC call: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b.a(com.google.gson.l, java.lang.reflect.Type):java.lang.Object))
                  (r2v0 'bVar' com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b)
                 com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b.b java.util.List in method: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b(com.ss.android.ugc.aweme.playerkit.a.f, java.lang.reflect.Type):T, file: classes10.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: CHECK_CAST (r0v43 java.util.List<java.lang.String>) = (java.util.List) (wrap: java.lang.Object : 0x001e: INVOKE  (r0v42 java.lang.Object) = 
                  (wrap: com.google.gson.i : 0x0015: IGET  (r1v6 com.google.gson.i) = 
                  (wrap: com.ss.android.ugc.aweme.playerkit.a.f : 0x0013: IGET  (r0v39 com.ss.android.ugc.aweme.playerkit.a.f) = (r2v0 'bVar' com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b) com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b.a com.ss.android.ugc.aweme.playerkit.a.f)
                 com.ss.android.ugc.aweme.playerkit.a.f.e com.google.gson.i)
                  (wrap: java.lang.reflect.Type : 0x001c: IGET  (r0v41 java.lang.reflect.Type) = 
                  (wrap: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b$1 : 0x0019: CONSTRUCTOR  (r0v40 com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b$1) = (r2v0 'bVar' com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b) call: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b.1.<init>(com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b):void type: CONSTRUCTOR)
                 com.google.gson.b.a.type java.lang.reflect.Type)
                 type: STATIC call: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b.a(com.google.gson.l, java.lang.reflect.Type):java.lang.Object) in method: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b(com.ss.android.ugc.aweme.playerkit.a.f, java.lang.reflect.Type):T, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: INVOKE  (r0v42 java.lang.Object) = 
                  (wrap: com.google.gson.i : 0x0015: IGET  (r1v6 com.google.gson.i) = 
                  (wrap: com.ss.android.ugc.aweme.playerkit.a.f : 0x0013: IGET  (r0v39 com.ss.android.ugc.aweme.playerkit.a.f) = (r2v0 'bVar' com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b) com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b.a com.ss.android.ugc.aweme.playerkit.a.f)
                 com.ss.android.ugc.aweme.playerkit.a.f.e com.google.gson.i)
                  (wrap: java.lang.reflect.Type : 0x001c: IGET  (r0v41 java.lang.reflect.Type) = 
                  (wrap: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b$1 : 0x0019: CONSTRUCTOR  (r0v40 com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b$1) = (r2v0 'bVar' com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b) call: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b.1.<init>(com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b):void type: CONSTRUCTOR)
                 com.google.gson.b.a.type java.lang.reflect.Type)
                 type: STATIC call: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b.a(com.google.gson.l, java.lang.reflect.Type):java.lang.Object in method: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b(com.ss.android.ugc.aweme.playerkit.a.f, java.lang.reflect.Type):T, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: IGET  (r0v41 java.lang.reflect.Type) = 
                  (wrap: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b$1 : 0x0019: CONSTRUCTOR  (r0v40 com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b$1) = (r2v0 'bVar' com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b) call: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b.1.<init>(com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b):void type: CONSTRUCTOR)
                 com.google.gson.b.a.type java.lang.reflect.Type in method: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b(com.ss.android.ugc.aweme.playerkit.a.f, java.lang.reflect.Type):T, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 31 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0019: CONSTRUCTOR  (r0v40 com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b$1) = (r2v0 'bVar' com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b) call: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b.1.<init>(com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b(com.ss.android.ugc.aweme.playerkit.a.f, java.lang.reflect.Type):T, file: classes10.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.instanceField(InsnGen.java:167)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 37 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.playerkit.configpickerimpl.b.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 43 more
                */
            /*
            // Method dump skipped, instructions count: 259
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b(com.ss.android.ugc.aweme.playerkit.a.f, java.lang.reflect.Type):java.lang.Object");
        }
    }
