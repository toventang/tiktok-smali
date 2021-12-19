package com.ss.android.sdk.app;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.g.g;
import com.bytedance.g.i;
import com.bytedance.g.k;
import com.bytedance.ies.abmock.debugtool.mock.ConfigMock;
import com.bytedance.ies.abmock.j;
import com.bytedance.ies.abmock.n;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.h;
import com.google.c.h.a.q;
import com.google.gson.f;
import com.ss.android.c;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.lang.reflect.Type;
import java.util.List;

public class AbTestSdkInitTask implements com.ss.android.ugc.aweme.lego.a, w {

    /* access modifiers changed from: package-private */
    public interface AbTestApi {
        static {
            Covode.recordClassIndex(37155);
        }

        @h
        q<String> doGet(@ag String str);
    }

    static {
        Covode.recordClassIndex(37152);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final int d() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static class a extends n {
        static {
            Covode.recordClassIndex(37156);
        }

        @Override // com.bytedance.ies.abmock.n, com.bytedance.ies.abmock.datacenter.f
        public final boolean a() {
            return true;
        }

        @Override // com.bytedance.ies.abmock.n, com.bytedance.ies.abmock.datacenter.f
        public final com.bytedance.ies.abmock.datacenter.a.a c() {
            return ConfigMock.INSTANCE;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.CPU;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static final /* synthetic */ String a(String str) {
        try {
            return ((AbTestApi) RetrofitFactory.a().b(b.f59141e).d().a(AbTestApi.class)).doGet(str).get();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        MethodCollector.i(6455);
        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "AbTestSdkInitTask");
        String str = c.f59126a;
        j a2 = j.a();
        a2.f31867d = new a();
        if (!(a2.f31867d == null || !a2.f31867d.a() || a2.f31867d.c() == null)) {
            a2.f31867d.c().init(context);
        }
        Application application = (Application) context;
        String trim = str.trim();
        AnonymousClass1 r10 = new com.bytedance.g.j() {
            /* class com.ss.android.sdk.app.AbTestSdkInitTask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37153);
            }

            @Override // com.bytedance.g.j
            public final <T> T a(String str, Type type) {
                return (T) new aj(str, type).b();
            }
        };
        AnonymousClass2 r7 = new i() {
            /* class com.ss.android.sdk.app.AbTestSdkInitTask.AnonymousClass2 */

            /* renamed from: b  reason: collision with root package name */
            private f f60150b = new f();

            static {
                Covode.recordClassIndex(37154);
            }

            @Override // com.bytedance.g.i
            public final <T> T a(String str, Type type) {
                return (T) this.f60150b.a(str, type);
            }
        };
        g gVar = a.f60151a;
        com.bytedance.g.h hVar = b.f60152a;
        if (!com.bytedance.g.c.f29648d) {
            synchronized (com.bytedance.g.c.f29649e) {
                try {
                    if (!com.bytedance.g.c.f29648d) {
                        com.bytedance.g.c.f29647c = k.a(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0060: SPUT  
                              (wrap: java.util.concurrent.Future : 0x005c: INVOKE  (r0v8 java.util.concurrent.Future) = 
                              (wrap: com.bytedance.g.c$1 : 0x0059: CONSTRUCTOR  (r4v0 com.bytedance.g.c$1) = 
                              (r5v1 'application' android.app.Application)
                              (r6v0 'trim' java.lang.String)
                              (r7v0 'r7' com.ss.android.sdk.app.AbTestSdkInitTask$2)
                              (r8v0 'gVar' com.bytedance.g.g)
                              (r9v0 'hVar' com.bytedance.g.h)
                              (r10v0 'r10' com.ss.android.sdk.app.AbTestSdkInitTask$1)
                             call: com.bytedance.g.c.1.<init>(android.app.Application, java.lang.String, com.bytedance.g.i, com.bytedance.g.g, com.bytedance.g.h, com.bytedance.g.j):void type: CONSTRUCTOR)
                             type: STATIC call: com.bytedance.g.k.a(java.lang.Runnable):java.util.concurrent.Future)
                             com.bytedance.g.c.c java.util.concurrent.Future in method: com.ss.android.sdk.app.AbTestSdkInitTask.a(android.content.Context):void, file: classes.dex
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
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005c: INVOKE  (r0v8 java.util.concurrent.Future) = 
                              (wrap: com.bytedance.g.c$1 : 0x0059: CONSTRUCTOR  (r4v0 com.bytedance.g.c$1) = 
                              (r5v1 'application' android.app.Application)
                              (r6v0 'trim' java.lang.String)
                              (r7v0 'r7' com.ss.android.sdk.app.AbTestSdkInitTask$2)
                              (r8v0 'gVar' com.bytedance.g.g)
                              (r9v0 'hVar' com.bytedance.g.h)
                              (r10v0 'r10' com.ss.android.sdk.app.AbTestSdkInitTask$1)
                             call: com.bytedance.g.c.1.<init>(android.app.Application, java.lang.String, com.bytedance.g.i, com.bytedance.g.g, com.bytedance.g.h, com.bytedance.g.j):void type: CONSTRUCTOR)
                             type: STATIC call: com.bytedance.g.k.a(java.lang.Runnable):java.util.concurrent.Future in method: com.ss.android.sdk.app.AbTestSdkInitTask.a(android.content.Context):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:439)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 36 more
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0059: CONSTRUCTOR  (r4v0 com.bytedance.g.c$1) = 
                              (r5v1 'application' android.app.Application)
                              (r6v0 'trim' java.lang.String)
                              (r7v0 'r7' com.ss.android.sdk.app.AbTestSdkInitTask$2)
                              (r8v0 'gVar' com.bytedance.g.g)
                              (r9v0 'hVar' com.bytedance.g.h)
                              (r10v0 'r10' com.ss.android.sdk.app.AbTestSdkInitTask$1)
                             call: com.bytedance.g.c.1.<init>(android.app.Application, java.lang.String, com.bytedance.g.i, com.bytedance.g.g, com.bytedance.g.h, com.bytedance.g.j):void type: CONSTRUCTOR in method: com.ss.android.sdk.app.AbTestSdkInitTask.a(android.content.Context):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 40 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.g.c, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 46 more
                            */
                        /*
                        // Method dump skipped, instructions count: 130
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.app.AbTestSdkInitTask.a(android.content.Context):void");
                    }
                }
