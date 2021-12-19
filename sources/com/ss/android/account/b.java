package com.ss.android.account;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.a.f.e;
import com.ss.android.ug.bus.a.a;
import com.ss.android.ug.bus.c;

public class b implements com.bytedance.sdk.a.a.b, a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f58172b;

    /* renamed from: a  reason: collision with root package name */
    volatile boolean f58173a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f58174c;

    /* renamed from: d  reason: collision with root package name */
    private String f58175d = "";

    static {
        Covode.recordClassIndex(36164);
    }

    private void d() {
        if (!this.f58173a) {
            b();
        }
    }

    @Override // com.ss.android.ug.bus.a.a
    public final String c() {
        d();
        return e.a(f.a().b()).c();
    }

    public static b a() {
        MethodCollector.i(12102);
        if (f58172b == null) {
            synchronized (b.class) {
                try {
                    if (f58172b == null) {
                        f58172b = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12102);
                    throw th;
                }
            }
        }
        b bVar = f58172b;
        MethodCollector.o(12102);
        return bVar;
    }

    public final void b() {
        this.f58173a = true;
        e.a(f.a().b()).a(this);
        String c2 = e.a(f.a().b()).c();
        this.f58175d = c2;
        this.f58174c = true ^ TextUtils.isEmpty(c2);
    }

    @Override // com.ss.android.ug.bus.a.a
    public final void a(final a.AbstractC1346a aVar) {
        d();
        
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: INVOKE  
              (wrap: com.bytedance.sdk.a.l.a$1 : 0x000a: CONSTRUCTOR  (r0v0 com.bytedance.sdk.a.l.a$1) = 
              (wrap: com.ss.android.account.b$1 : 0x0005: CONSTRUCTOR  (r1v0 com.ss.android.account.b$1) = (r2v0 'this' com.ss.android.account.b A[IMMUTABLE_TYPE, THIS]), (r3v0 'aVar' com.ss.android.ug.bus.a.a$a A[SKIP_ARG]) call: com.ss.android.account.b.1.<init>(com.ss.android.account.b, com.ss.android.ug.bus.a.a$a):void type: CONSTRUCTOR)
             call: com.bytedance.sdk.a.l.a.1.<init>(com.bytedance.sdk.a.l.b.b):void type: CONSTRUCTOR)
             type: VIRTUAL call: com.bytedance.sdk.a.l.a.a.b():void in method: com.ss.android.account.b.a(com.ss.android.ug.bus.a.a$a):void, file: classes.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: CONSTRUCTOR  (r0v0 com.bytedance.sdk.a.l.a$1) = 
              (wrap: com.ss.android.account.b$1 : 0x0005: CONSTRUCTOR  (r1v0 com.ss.android.account.b$1) = (r2v0 'this' com.ss.android.account.b A[IMMUTABLE_TYPE, THIS]), (r3v0 'aVar' com.ss.android.ug.bus.a.a$a A[SKIP_ARG]) call: com.ss.android.account.b.1.<init>(com.ss.android.account.b, com.ss.android.ug.bus.a.a$a):void type: CONSTRUCTOR)
             call: com.bytedance.sdk.a.l.a.1.<init>(com.bytedance.sdk.a.l.b.b):void type: CONSTRUCTOR in method: com.ss.android.account.b.a(com.ss.android.ug.bus.a.a$a):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.sdk.a.l.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            r2.d()
            com.ss.android.account.b$1 r1 = new com.ss.android.account.b$1
            r1.<init>(r3)
            com.bytedance.sdk.a.l.a$1 r0 = new com.bytedance.sdk.a.l.a$1
            r0.<init>(r1)
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.account.b.a(com.ss.android.ug.bus.a.a$a):void");
    }

    @Override // com.bytedance.sdk.a.a.b
    public final void a(com.bytedance.sdk.a.a.a aVar) {
        d();
        if (aVar.f43066a == 1 || aVar.f43066a == 2) {
            this.f58174c = false;
            this.f58175d = "";
            c.a(new com.ss.android.ug.bus.a.a.b());
        } else if (!this.f58174c) {
            String c2 = c();
            if (!this.f58174c) {
                c.a(new com.ss.android.ug.bus.a.a.a(c2));
                this.f58175d = c2;
                this.f58174c = true;
            }
        } else {
            String c3 = c();
            if (!this.f58175d.equals(c3)) {
                this.f58175d = c3;
                c.a(new com.ss.android.ug.bus.a.a.c(c3));
            }
        }
    }
}
