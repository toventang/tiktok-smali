package com.facebook.imagepipeline.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.g.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.c.b.i;
import com.facebook.common.d.l;
import com.facebook.common.g.d;
import com.facebook.imagepipeline.a.b.a;
import com.facebook.imagepipeline.a.b.b;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.d.h;
import com.facebook.imagepipeline.d.n;
import com.facebook.imagepipeline.d.o;
import com.facebook.imagepipeline.d.q;
import com.facebook.imagepipeline.g.c;
import com.facebook.imagepipeline.l.g;
import com.facebook.imagepipeline.memory.ac;
import com.facebook.imagepipeline.n.az;
import java.util.Collections;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f47914a = k.class;

    /* renamed from: b  reason: collision with root package name */
    private static k f47915b;
    private static c v;

    /* renamed from: c  reason: collision with root package name */
    private az f47916c;

    /* renamed from: d  reason: collision with root package name */
    private i f47917d;

    /* renamed from: e  reason: collision with root package name */
    private g f47918e;

    /* renamed from: f  reason: collision with root package name */
    private h<e, com.facebook.imagepipeline.j.c> f47919f;

    /* renamed from: g  reason: collision with root package name */
    private o<e, com.facebook.imagepipeline.j.c> f47920g;

    /* renamed from: h  reason: collision with root package name */
    private h<e, com.facebook.common.g.h> f47921h;

    /* renamed from: i  reason: collision with root package name */
    private o<e, com.facebook.common.g.h> f47922i;

    /* renamed from: j  reason: collision with root package name */
    private com.facebook.imagepipeline.d.e f47923j;

    /* renamed from: k  reason: collision with root package name */
    private i f47924k;

    /* renamed from: l  reason: collision with root package name */
    private c f47925l;

    /* renamed from: m  reason: collision with root package name */
    private h f47926m;
    private com.facebook.imagepipeline.q.c n;
    private m o;
    private n p;
    private com.facebook.imagepipeline.d.e q;
    private i r;
    private f s;
    private g t;
    private a u;

    static {
        Covode.recordClassIndex(28991);
    }

    public static k a() {
        return (k) com.facebook.common.d.i.a(f47915b, "ImagePipelineFactory was not initialized!");
    }

    private h<e, com.facebook.imagepipeline.j.c> j() {
        if (this.f47919f == null) {
            i();
            this.f47919f = com.facebook.imagepipeline.d.a.a(this.f47917d.f47861b, this.f47917d.p, this.f47917d.f47862c);
        }
        return this.f47919f;
    }

    public final a b() {
        if (this.u == null) {
            i();
            this.u = b.a(f(), this.f47917d.f47868i, j());
        }
        return this.u;
    }

    public final o<e, com.facebook.imagepipeline.j.c> c() {
        if (this.f47920g == null) {
            i();
            this.f47920g = com.facebook.imagepipeline.d.b.a(j(), this.f47917d.f47869j);
        }
        return this.f47920g;
    }

    public final i d() {
        if (this.f47924k == null) {
            i();
            this.f47924k = this.f47917d.f47866g.a(this.f47917d.o);
        }
        return this.f47924k;
    }

    public final f f() {
        if (this.s == null) {
            i();
            this.s = a(this.f47917d.t, g());
        }
        return this.s;
    }

    public final g g() {
        if (this.t == null) {
            i();
            this.t = a(this.f47917d.t, this.f47917d.z.o, this.f47917d.z.p);
        }
        return this.t;
    }

    public final i h() {
        if (this.r == null) {
            i();
            this.r = this.f47917d.f47866g.a(this.f47917d.x);
        }
        return this.r;
    }

    private h<e, com.facebook.common.g.h> k() {
        if (this.f47921h == null) {
            i();
            com.facebook.common.d.k<q> kVar = this.f47917d.f47867h;
            d dVar = this.f47917d.p;
            h<e, com.facebook.common.g.h> hVar = new h<>(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR  (r0v4 'hVar' com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h>) = 
                  (wrap: com.facebook.imagepipeline.d.l$1 : 0x0011: CONSTRUCTOR  (r2v0 com.facebook.imagepipeline.d.l$1) =  call: com.facebook.imagepipeline.d.l.1.<init>():void type: CONSTRUCTOR)
                  (wrap: com.facebook.imagepipeline.d.s : 0x0016: CONSTRUCTOR  (r1v0 com.facebook.imagepipeline.d.s) =  call: com.facebook.imagepipeline.d.s.<init>():void type: CONSTRUCTOR)
                  (r4v0 'kVar' com.facebook.common.d.k<com.facebook.imagepipeline.d.q>)
                 call: com.facebook.imagepipeline.d.h.<init>(com.facebook.imagepipeline.d.w, com.facebook.imagepipeline.d.h$a, com.facebook.common.d.k):void type: CONSTRUCTOR in method: com.facebook.imagepipeline.e.k.k():com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h>, file: classes6.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: CONSTRUCTOR  (r2v0 com.facebook.imagepipeline.d.l$1) =  call: com.facebook.imagepipeline.d.l.1.<init>():void type: CONSTRUCTOR in method: com.facebook.imagepipeline.e.k.k():com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h>, file: classes6.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.imagepipeline.d.l, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
                this = this;
                com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h> r0 = r5.f47921h
                if (r0 != 0) goto L_0x0023
                r5.i()
                com.facebook.imagepipeline.e.i r0 = r5.f47917d
                com.facebook.common.d.k<com.facebook.imagepipeline.d.q> r4 = r0.f47867h
                com.facebook.imagepipeline.e.i r0 = r5.f47917d
                com.facebook.common.g.d r3 = r0.p
                com.facebook.imagepipeline.d.l$1 r2 = new com.facebook.imagepipeline.d.l$1
                r2.<init>()
                com.facebook.imagepipeline.d.s r1 = new com.facebook.imagepipeline.d.s
                r1.<init>()
                com.facebook.imagepipeline.d.h r0 = new com.facebook.imagepipeline.d.h
                r0.<init>(r2, r1, r4)
                r3.a(r0)
                r5.f47921h = r0
            L_0x0023:
                com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h> r0 = r5.f47921h
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.e.k.k():com.facebook.imagepipeline.d.h");
        }

        private o<e, com.facebook.common.g.h> l() {
            if (this.f47922i == null) {
                i();
                h<e, com.facebook.common.g.h> k2 = k();
                n nVar = this.f47917d.f47869j;
                nVar.b(k2);
                this.f47922i = new o<>(k2, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001c: IPUT  
                      (wrap: com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h> : 0x0019: CONSTRUCTOR  (r0v4 com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h>) = 
                      (r2v0 'k2' com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h>)
                      (wrap: com.facebook.imagepipeline.d.m$1 : 0x0014: CONSTRUCTOR  (r1v0 com.facebook.imagepipeline.d.m$1) = (r0v3 'nVar' com.facebook.imagepipeline.d.n) call: com.facebook.imagepipeline.d.m.1.<init>(com.facebook.imagepipeline.d.n):void type: CONSTRUCTOR)
                     call: com.facebook.imagepipeline.d.o.<init>(com.facebook.imagepipeline.d.p, com.facebook.imagepipeline.d.r):void type: CONSTRUCTOR)
                      (r3v0 'this' com.facebook.imagepipeline.e.k A[IMMUTABLE_TYPE, THIS])
                     com.facebook.imagepipeline.e.k.i com.facebook.imagepipeline.d.o in method: com.facebook.imagepipeline.e.k.l():com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h>, file: classes6.dex
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0019: CONSTRUCTOR  (r0v4 com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h>) = 
                      (r2v0 'k2' com.facebook.imagepipeline.d.h<com.facebook.c.a.e, com.facebook.common.g.h>)
                      (wrap: com.facebook.imagepipeline.d.m$1 : 0x0014: CONSTRUCTOR  (r1v0 com.facebook.imagepipeline.d.m$1) = (r0v3 'nVar' com.facebook.imagepipeline.d.n) call: com.facebook.imagepipeline.d.m.1.<init>(com.facebook.imagepipeline.d.n):void type: CONSTRUCTOR)
                     call: com.facebook.imagepipeline.d.o.<init>(com.facebook.imagepipeline.d.p, com.facebook.imagepipeline.d.r):void type: CONSTRUCTOR in method: com.facebook.imagepipeline.e.k.l():com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h>, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 19 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0014: CONSTRUCTOR  (r1v0 com.facebook.imagepipeline.d.m$1) = (r0v3 'nVar' com.facebook.imagepipeline.d.n) call: com.facebook.imagepipeline.d.m.1.<init>(com.facebook.imagepipeline.d.n):void type: CONSTRUCTOR in method: com.facebook.imagepipeline.e.k.l():com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h>, file: classes6.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 23 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.imagepipeline.d.m, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 29 more
                    */
                /*
                    this = this;
                    com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h> r0 = r3.f47922i
                    if (r0 != 0) goto L_0x001e
                    r3.i()
                    com.facebook.imagepipeline.d.h r2 = r3.k()
                    com.facebook.imagepipeline.e.i r0 = r3.f47917d
                    com.facebook.imagepipeline.d.n r0 = r0.f47869j
                    r0.b(r2)
                    com.facebook.imagepipeline.d.m$1 r1 = new com.facebook.imagepipeline.d.m$1
                    r1.<init>(r0)
                    com.facebook.imagepipeline.d.o r0 = new com.facebook.imagepipeline.d.o
                    r0.<init>(r2, r1)
                    r3.f47922i = r0
                L_0x001e:
                    com.facebook.imagepipeline.d.o<com.facebook.c.a.e, com.facebook.common.g.h> r0 = r3.f47922i
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.e.k.l():com.facebook.imagepipeline.d.o");
            }

            private com.facebook.imagepipeline.d.e n() {
                if (this.f47923j == null) {
                    i();
                    this.f47923j = new com.facebook.imagepipeline.d.e(d(), this.f47917d.t.a(this.f47917d.q), this.f47917d.t.d(), this.f47917d.f47868i.a(), this.f47917d.f47868i.b(), this.f47917d.f47869j);
                }
                return this.f47923j;
            }

            private com.facebook.imagepipeline.d.e q() {
                if (this.q == null) {
                    i();
                    this.q = new com.facebook.imagepipeline.d.e(h(), this.f47917d.t.a(this.f47917d.q), this.f47917d.t.d(), this.f47917d.f47868i.a(), this.f47917d.f47868i.b(), this.f47917d.f47869j);
                }
                return this.q;
            }

            private c s() {
                if (v == null) {
                    try {
                        v = (c) Class.forName("com.bytedance.fresco.heif.HeifDecoder$HeifFormatDecoder").getConstructor(com.facebook.common.g.i.class).newInstance(this.f47917d.t.a(0));
                    } catch (Throwable unused) {
                        return null;
                    }
                }
                return v;
            }

            private void i() {
                MethodCollector.i(10835);
                if (this.f47917d != null) {
                    MethodCollector.o(10835);
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f47917d == null) {
                            com.facebook.imagepipeline.p.b.a();
                            this.f47917d = (i) com.facebook.common.d.i.a(this.f47918e.a());
                            this.f47916c = new az(this.f47917d.f47868i.e());
                            com.facebook.imagepipeline.p.b.a();
                            MethodCollector.o(10835);
                        }
                    } finally {
                        MethodCollector.o(10835);
                    }
                }
            }

            private c m() {
                c cVar;
                if (this.f47925l == null) {
                    i();
                    if (this.f47917d.f47870k != null) {
                        this.f47925l = this.f47917d.f47870k;
                    } else {
                        a b2 = b();
                        c s2 = s();
                        c cVar2 = null;
                        if (b2 != null) {
                            cVar2 = b2.getGifDecoder(Bitmap.Config.RGB_565);
                            cVar = b2.getWebPDecoder(Bitmap.Config.RGB_565);
                        } else {
                            cVar = null;
                        }
                        if (this.f47917d.y == null) {
                            this.f47925l = new com.facebook.imagepipeline.g.b(cVar2, cVar, s2, g());
                        } else {
                            this.f47925l = new com.facebook.imagepipeline.g.b(cVar2, cVar, s2, g(), this.f47917d.y.f47969a);
                            com.facebook.h.d b3 = com.facebook.h.d.b();
                            b3.f47637a = this.f47917d.y.f47970b;
                            b3.a();
                        }
                    }
                }
                return this.f47925l;
            }

            private n p() {
                boolean z;
                i();
                if (Build.VERSION.SDK_INT < 24 || !this.f47917d.z.f47893f) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.p == null) {
                    this.p = new n(b(this.f47917d.f47864e).getContentResolver(), o(), this.f47917d.r, this.f47917d.w, this.f47917d.z.f47888a, this.f47916c, this.f47917d.f47865f, z, this.f47917d.z.f47899l, this.f47917d.A, r());
                }
                return this.p;
            }

            private com.facebook.imagepipeline.q.c r() {
                if (this.n == null) {
                    i();
                    if (this.f47917d.f47871l == null && this.f47917d.f47872m == null && this.f47917d.z.f47898k) {
                        this.n = new com.facebook.imagepipeline.q.g(this.f47917d.z.f47897j);
                    } else {
                        this.n = new com.facebook.imagepipeline.q.e(this.f47917d.z.f47897j, this.f47917d.z.f47892e, this.f47917d.f47871l, this.f47917d.f47872m);
                    }
                }
                return this.n;
            }

            public final h e() {
                if (this.f47926m == null) {
                    i();
                    this.f47926m = new h(p(), Collections.unmodifiableSet(this.f47917d.v), this.f47917d.n, c(), l(), n(), q(), this.f47917d.f47863d, this.f47916c, l.a(false), this.f47917d.z.n);
                }
                return this.f47926m;
            }

            private m o() {
                if (this.o == null) {
                    i();
                    this.o = this.f47917d.z.f47900m.a(this.f47917d.f47864e, this.f47917d.t.e(), m(), this.f47917d.u, this.f47917d.f47865f, this.f47917d.w, this.f47917d.z.f47890c, this.f47917d.f47868i, this.f47917d.t.a(this.f47917d.q), c(), l(), n(), q(), this.f47917d.f47863d, f(), this.f47917d.z.f47894g, this.f47917d.z.f47895h, this.f47917d.z.f47896i, this.f47917d.z.f47897j);
                }
                return this.o;
            }

            private k(g gVar) {
                this.f47918e = (g) com.facebook.common.d.i.a(gVar);
            }

            private static Context b(Context context) {
                Context applicationContext = context.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                return applicationContext;
            }

            private k(i iVar) {
                com.facebook.imagepipeline.p.b.a();
                this.f47917d = (i) com.facebook.common.d.i.a(iVar);
                this.f47916c = new az(iVar.f47868i.e());
                com.facebook.imagepipeline.p.b.a();
            }

            public static synchronized void a(Context context) {
                synchronized (k.class) {
                    MethodCollector.i(10519);
                    com.facebook.imagepipeline.p.b.a();
                    a(i.a(context).a());
                    com.facebook.imagepipeline.p.b.a();
                    MethodCollector.o(10519);
                }
            }

            public static synchronized void a(i iVar) {
                synchronized (k.class) {
                    MethodCollector.i(10679);
                    if (f47915b != null) {
                        com.facebook.common.e.a.b(f47914a, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                    }
                    f47915b = new k(iVar);
                    MethodCollector.o(10679);
                }
            }

            private static f a(ac acVar, g gVar) {
                if (Build.VERSION.SDK_INT >= 21) {
                    return new com.facebook.imagepipeline.c.a(acVar.a());
                }
                int i2 = Build.VERSION.SDK_INT;
                return new com.facebook.imagepipeline.c.e(new com.facebook.imagepipeline.c.b(acVar.a(0)), gVar);
            }

            public static synchronized void a(g gVar, Boolean bool) {
                synchronized (k.class) {
                    MethodCollector.i(10833);
                    if (f47915b != null) {
                        com.facebook.common.e.a.b(f47914a, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                    }
                    f47915b = new k(gVar);
                    if (Boolean.TRUE == bool) {
                        f47915b.i();
                    }
                    MethodCollector.o(10833);
                }
            }

            private static g a(ac acVar, boolean z, boolean z2) {
                if (Build.VERSION.SDK_INT == 28 && z2) {
                    int c2 = acVar.c();
                    return new com.facebook.imagepipeline.l.f(acVar.a(), c2, new f.c(c2));
                } else if (Build.VERSION.SDK_INT >= 26) {
                    int c3 = acVar.c();
                    return new com.facebook.imagepipeline.l.e(acVar.a(), c3, new f.c(c3));
                } else if (Build.VERSION.SDK_INT >= 21) {
                    int c4 = acVar.c();
                    return new com.facebook.imagepipeline.l.a(acVar.a(), c4, new f.c(c4));
                } else {
                    if (z) {
                        int i2 = Build.VERSION.SDK_INT;
                    }
                    return new com.facebook.imagepipeline.l.d(acVar.b());
                }
            }
        }
