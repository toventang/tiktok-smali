package com.bytedance.z.a.b;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.z.a.a.a;
import com.bytedance.z.a.a.c;
import com.bytedance.z.a.d.b;

public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f46251a;

    /* renamed from: b  reason: collision with root package name */
    private Context f46252b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.z.a.b.b.a f46253c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.z.a.b.d.a f46254d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.z.a.b.c.a f46255e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.z.a.b.a.a f46256f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.z.a.a.a f46257g;

    static {
        Covode.recordClassIndex(28252);
    }

    @Override // com.bytedance.z.a.a.c
    public final com.bytedance.z.a.a.a a() {
        return this.f46257g;
    }

    @Override // com.bytedance.z.a.a.c
    public final boolean c() {
        com.bytedance.z.a.b.b.a aVar = this.f46253c;
        aVar.b();
        return aVar.f46264d;
    }

    @Override // com.bytedance.z.a.a.c
    public final int e() {
        com.bytedance.z.a.b.b.a aVar = this.f46253c;
        aVar.b();
        return aVar.f46265e;
    }

    @Override // com.bytedance.z.a.a.c
    public final float f() {
        com.bytedance.z.a.b.b.a aVar = this.f46253c;
        aVar.b();
        return aVar.f46266f;
    }

    @Override // com.bytedance.z.a.a.c
    public final void g() {
        this.f46255e.b();
    }

    @Override // com.bytedance.z.a.a.c
    public final c.b h() {
        return this.f46255e.d();
    }

    @Override // com.bytedance.z.a.a.c
    public final boolean i() {
        return this.f46256f.a();
    }

    @Override // com.bytedance.z.a.a.c
    public final c b() {
        this.f46253c.a();
        this.f46254d.a();
        this.f46255e.a();
        return this;
    }

    @Override // com.bytedance.z.a.a.c
    public final int d() {
        com.bytedance.z.a.b.b.a aVar = this.f46253c;
        if (Build.VERSION.SDK_INT < 21) {
            return -1;
        }
        if (aVar.f46263c.isPowerSaveMode()) {
            return 1;
        }
        return 0;
    }

    @Override // com.bytedance.z.a.a.c
    public final c.a j() {
        String str;
        int i2;
        c.a aVar = new c.a();
        if (com.bytedance.z.a.d.a.f46304a != null) {
            str = com.bytedance.z.a.d.a.f46304a;
        } else {
            b.a("/proc/cpuinfo", 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0045: INVOKE  
                  ("/proc/cpuinfo")
                  (wrap: com.bytedance.z.a.d.a$2 : 0x0040: CONSTRUCTOR  (r1v0 com.bytedance.z.a.d.a$2) =  call: com.bytedance.z.a.d.a.2.<init>():void type: CONSTRUCTOR)
                 type: STATIC call: com.bytedance.z.a.d.b.a(java.lang.String, com.bytedance.z.a.d.b$a):void in method: com.bytedance.z.a.b.a.j():com.bytedance.z.a.a.c$a, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0040: CONSTRUCTOR  (r1v0 com.bytedance.z.a.d.a$2) =  call: com.bytedance.z.a.d.a.2.<init>():void type: CONSTRUCTOR in method: com.bytedance.z.a.b.a.j():com.bytedance.z.a.a.c$a, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.z.a.d.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 25 more
                */
            /*
                this = this;
                com.bytedance.z.a.a.c$a r2 = new com.bytedance.z.a.a.c$a
                r2.<init>()
                java.lang.String r0 = com.bytedance.z.a.d.a.f46304a
                if (r0 == 0) goto L_0x003e
                java.lang.String r0 = com.bytedance.z.a.d.a.f46304a
            L_0x000b:
                r2.f46231a = r0
                boolean r0 = r3.c()
                r2.f46232b = r0
                int r0 = r3.e()
                r2.f46233c = r0
                com.bytedance.z.a.b.d.a r1 = r3.f46254d
                android.os.PowerManager r0 = r1.f46298c
                if (r0 == 0) goto L_0x003c
                android.os.PowerManager r0 = r1.f46298c
                int r0 = r0.getCurrentThermalStatus()
            L_0x0025:
                r2.f46234d = r0
                int r0 = r3.d()
                r2.f46235e = r0
                float r0 = r3.f()
                r2.f46236f = r0
                com.bytedance.z.a.b.c.a r0 = r3.f46255e
                java.util.List r0 = r0.c()
                r2.f46237g = r0
                return r2
            L_0x003c:
                r0 = 0
                goto L_0x0025
            L_0x003e:
                com.bytedance.z.a.d.a$2 r1 = new com.bytedance.z.a.d.a$2
                r1.<init>()
                java.lang.String r0 = "/proc/cpuinfo"
                com.bytedance.z.a.d.b.a(r0, r1)
                java.lang.String r0 = com.bytedance.z.a.d.a.f46304a
                goto L_0x000b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.z.a.b.a.j():com.bytedance.z.a.a.c$a");
        }

        private a(Context context) {
            this(context, com.bytedance.z.a.a.a.f46219a);
        }

        public static a a(Context context) {
            MethodCollector.i(4832);
            if (f46251a == null) {
                synchronized (a.class) {
                    try {
                        if (f46251a == null) {
                            f46251a = new a(context);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(4832);
                        throw th;
                    }
                }
            }
            a aVar = f46251a;
            MethodCollector.o(4832);
            return aVar;
        }

        @Override // com.bytedance.z.a.a.c
        public final boolean a(float f2) {
            c.b h2;
            com.bytedance.z.a.b.a.a aVar = this.f46256f;
            if (aVar.a()) {
                a.C1151a aVar2 = aVar.f46258a.a().f46224f;
                if (aVar2 == null) {
                    return true;
                }
                float f3 = aVar2.f46227c;
                float f4 = aVar2.f46230f;
                if (f2 >= f3) {
                    if (((double) f4) <= 0.0d || (h2 = aVar.f46258a.h()) == null || h2.o > f4) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        private a(Context context, com.bytedance.z.a.a.a aVar) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f46252b = applicationContext;
            this.f46257g = aVar == null ? com.bytedance.z.a.a.a.f46219a : aVar;
            this.f46253c = new com.bytedance.z.a.b.b.a(this.f46252b, this);
            this.f46254d = new com.bytedance.z.a.b.d.a(this.f46252b, this);
            this.f46255e = new com.bytedance.z.a.b.c.a(this.f46252b, this);
            this.f46256f = new com.bytedance.z.a.b.a.a(this);
        }
    }
