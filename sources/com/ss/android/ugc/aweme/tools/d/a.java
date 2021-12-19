package com.ss.android.ugc.aweme.tools.d;

import com.bytedance.covode.number.Covode;
import com.google.c.c.ao;
import com.google.c.c.k;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f139289a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final ao<String, Object> f139290b;

    private a() {
    }

    static {
        Covode.recordClassIndex(91064);
        k.a(8, "expectedKeys");
        ao<String, Object> b2 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: INVOKE  (r1v2 'b2' com.google.c.c.ao<java.lang.String, java.lang.Object>) = 
              (wrap: com.google.c.c.as$d$2 : 0x001b: CONSTRUCTOR  (r0v3 com.google.c.c.as$d$2) = 
              (wrap: com.google.c.c.as$1 : 0x0016: CONSTRUCTOR  (r1v1 com.google.c.c.as$1) =  call: com.google.c.c.as.1.<init>():void type: CONSTRUCTOR)
             call: com.google.c.c.as.d.2.<init>(com.google.c.c.as$d):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.google.c.c.as.c.b():com.google.c.c.ao in method: com.ss.android.ugc.aweme.tools.d.a.<clinit>():void, file: classes7.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR  (r0v3 com.google.c.c.as$d$2) = 
              (wrap: com.google.c.c.as$1 : 0x0016: CONSTRUCTOR  (r1v1 com.google.c.c.as$1) =  call: com.google.c.c.as.1.<init>():void type: CONSTRUCTOR)
             call: com.google.c.c.as.d.2.<init>(com.google.c.c.as$d):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.tools.d.a.<clinit>():void, file: classes7.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.c.c.as, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            r0 = 91064(0x163b8, float:1.27608E-40)
            com.bytedance.covode.number.Covode.recordClassIndex(r0)
            com.ss.android.ugc.aweme.tools.d.a r0 = new com.ss.android.ugc.aweme.tools.d.a
            r0.<init>()
            com.ss.android.ugc.aweme.tools.d.a.f139289a = r0
            r1 = 8
            java.lang.String r0 = "expectedKeys"
            com.google.c.c.k.a(r1, r0)
            com.google.c.c.as$1 r1 = new com.google.c.c.as$1
            r1.<init>()
            com.google.c.c.as$d$2 r0 = new com.google.c.c.as$d$2
            r0.<init>()
            com.google.c.c.ao r1 = r0.b()
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            com.ss.android.ugc.aweme.tools.d.a.f139290b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.d.a.<clinit>():void");
    }

    public static void a(String str, Object obj) {
        l.d(str, "");
        l.d(obj, "");
        List<Object> list = f139290b.get(str);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
