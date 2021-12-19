package com.bytedance.apm.internal;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.battery.a;
import com.bytedance.apm.battery.b;
import com.bytedance.apm.block.a.f;
import com.bytedance.apm.block.a.g;
import com.bytedance.apm.config.SlardarConfigManagerImpl;
import com.bytedance.apm.config.b;
import com.bytedance.apm.config.c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.d.b;
import com.bytedance.apm.f.a;
import com.bytedance.apm.impl.ApmAgentServiceImpl;
import com.bytedance.apm.impl.LaunchTraceImpl;
import com.bytedance.apm.impl.MonitorLogManagerImpl;
import com.bytedance.apm.k.c.d;
import com.bytedance.apm.k.e;
import com.bytedance.apm.k.j;
import com.bytedance.apm.p.b;
import com.bytedance.apm.trace.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.BinderMonitor;
import com.bytedance.monitor.collector.IOMonitor;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.monitor.collector.h;
import com.bytedance.monitor.collector.j;
import com.bytedance.monitor.collector.k;
import com.bytedance.monitor.collector.l;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.ILaunchTrace;
import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.apm.api.e;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public class ApmDelegate implements com.bytedance.services.slardar.config.a {
    private static long r;
    private static boolean s;
    private static boolean t;

    /* renamed from: a  reason: collision with root package name */
    b f25007a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.apm.trace.a f25008b;

    /* renamed from: c  reason: collision with root package name */
    public d f25009c;

    /* renamed from: d  reason: collision with root package name */
    public c f25010d;

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.apm.g.b f25011e;

    /* renamed from: f  reason: collision with root package name */
    public e f25012f;

    /* renamed from: g  reason: collision with root package name */
    public SlardarConfigManagerImpl f25013g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f25014h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f25015i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f25016j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f25017k;

    /* renamed from: l  reason: collision with root package name */
    public Set<Object> f25018l;

    /* renamed from: m  reason: collision with root package name */
    boolean f25019m;
    public boolean n;
    List<String> o;
    List<String> p;
    List<String> q;

    static {
        Covode.recordClassIndex(14612);
    }

    private void initEvilMethodTraceInject() {
        initTraceEvilMethod();
    }

    private ApmDelegate() {
        this.n = true;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final ApmDelegate f25042a = new ApmDelegate((byte) 0);

        static {
            Covode.recordClassIndex(14626);
        }
    }

    public final b b() {
        b bVar = this.f25007a;
        if (bVar == null) {
            return b.a().a();
        }
        return bVar;
    }

    private void c() {
        SlardarConfigManagerImpl slardarConfigManagerImpl = new SlardarConfigManagerImpl();
        this.f25013g = slardarConfigManagerImpl;
        com.bytedance.news.common.service.manager.c.a(IConfigManager.class, slardarConfigManagerImpl);
        com.bytedance.news.common.service.manager.c.a(IMonitorLogManager.class, (com.bytedance.news.common.service.manager.a) new com.bytedance.news.common.service.manager.a<IMonitorLogManager>() {
            /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass3 */

            static {
                Covode.recordClassIndex(14619);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.news.common.service.manager.a
            public final /* synthetic */ IMonitorLogManager a() {
                return new MonitorLogManagerImpl();
            }
        });
        com.bytedance.news.common.service.manager.c.a(IActivityLifeManager.class, (com.bytedance.news.common.service.manager.a) new com.bytedance.news.common.service.manager.a<IActivityLifeManager>() {
            /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass4 */

            static {
                Covode.recordClassIndex(14620);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.news.common.service.manager.a
            public final /* synthetic */ IActivityLifeManager a() {
                return ActivityLifeObserver.getInstance();
            }
        });
        com.bytedance.news.common.service.manager.c.a(IApmAgent.class, (com.bytedance.news.common.service.manager.a) new com.bytedance.news.common.service.manager.a<IApmAgent>() {
            /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass5 */

            static {
                Covode.recordClassIndex(14621);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.news.common.service.manager.a
            public final /* synthetic */ IApmAgent a() {
                return new ApmAgentServiceImpl();
            }
        });
        com.bytedance.news.common.service.manager.c.a(ILaunchTrace.class, (com.bytedance.news.common.service.manager.a) new com.bytedance.news.common.service.manager.a<ILaunchTrace>() {
            /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass6 */

            static {
                Covode.recordClassIndex(14622);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.news.common.service.manager.a
            public final /* synthetic */ ILaunchTrace a() {
                return new LaunchTraceImpl();
            }
        });
    }

    private static void initTraceEvilMethod() {
        com.bytedance.p.b.c.a(r);
        com.bytedance.p.b.c.f41756e = s;
        com.bytedance.p.b.c.f41755d = true;
        f.r.a();
        g.a();
        new com.bytedance.p.b.c((byte) 0).a();
        k.a().f41550f = true;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!this.f25019m) {
            this.f25019m = true;
            com.bytedance.apm.p.a.f25196a.post(new Runnable() {
                /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(14618);
                }

                public final void run() {
                    h.a();
                }
            });
            com.bytedance.apm.block.b bVar = new com.bytedance.apm.block.b();
            bVar.f24643c.a(this.f25010d.f24804k);
            bVar.f24643c.f24668b = this.f25010d.f24803j;
            ActivityLifeObserver.getInstance().register(bVar);
            com.bytedance.apm.f.a(bVar);
            bVar.f24643c.f24667a = f.r.o;
            f.r.a(bVar);
            bVar.f24642b = true;
            if (com.bytedance.apm.c.e()) {
                new String[]{"BlockDetector init: "};
            }
            if (ActivityLifeObserver.getInstance().isForeground()) {
                bVar.a();
            }
        }
    }

    @Override // com.bytedance.services.slardar.config.a
    public final void d() {
        this.f25014h = true;
        com.bytedance.apm.g.b bVar = this.f25011e;
        if (bVar != null) {
            bVar.a();
        }
        JSONObject config = this.f25013g.getConfig();
        if (this.f25017k) {
            if (com.bytedance.apm.q.g.a(config, "performance_modules", "fd", "enable_upload") == 1) {
                new com.bytedance.apm.k.c().h();
            }
            new j().h();
            if (com.bytedance.apm.q.g.a(config, "performance_modules", "traffic", "enable_collect") == 1) {
                d.a.f25095a.h();
            }
        }
        if (this.f25010d.f24806m && com.bytedance.apm.q.g.a(config, "performance_modules", "battery", "enable_upload") == 1) {
            Context context = com.bytedance.apm.c.f24685a;
            String a2 = com.bytedance.apm.q.a.a(Process.myPid());
            if (a2 != null && !a2.contains(":") && a2.equals(context.getPackageName())) {
                new com.bytedance.apm.battery.d().h();
                b.C0524b.f24467a.h();
            }
            new com.bytedance.apm.battery.c().h();
            a.C0523a.f24435a.h();
        }
        if (this.f25010d.f24802i && e.a.f25105a.a("block_monitor")) {
            a();
        }
    }

    /* synthetic */ ApmDelegate(byte b2) {
        this();
    }

    public final boolean a(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        if (!this.f25014h || (slardarConfigManagerImpl = this.f25013g) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getLogTypeSwitch(str);
    }

    public final boolean b(String str) {
        SlardarConfigManagerImpl slardarConfigManagerImpl;
        if (!this.f25014h || (slardarConfigManagerImpl = this.f25013g) == null) {
            return false;
        }
        return slardarConfigManagerImpl.getServiceSwitch(str);
    }

    @Override // com.bytedance.services.slardar.config.a
    public final void a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        if (optJSONObject != null) {
            this.n = optJSONObject.optBoolean("enable_active_upload_alog", true);
        } else {
            this.n = true;
        }
    }

    public final void a(final Context context, final com.bytedance.apm.config.b bVar) {
        if (!this.f25015i) {
            long nanoTime = System.nanoTime();
            this.f25015i = true;
            com.bytedance.apm.c.d();
            this.f25007a = bVar;
            com.bytedance.apm.trace.a aVar = this.f25008b;
            if (aVar != null) {
                bVar.f24772e = aVar;
            }
            com.bytedance.apm.trace.d dVar = this.f25009c;
            if (dVar != null) {
                this.f25007a.f24769b = dVar.f25363b;
                this.f25007a.f24770c = this.f25009c.f25362a;
                this.f25007a.f24773f = this.f25009c.f25365d;
                this.f25007a.f24774g = (long) this.f25009c.f25364c;
            }
            com.bytedance.apm.c.a.f24698a = bVar.f24768a;
            Application a2 = com.bytedance.apm.q.a.a(context);
            com.bytedance.apm.c.a(a2);
            ActivityLifeObserver.init(a2);
            c();
            com.bytedance.apm.c.f24697m = bVar.o;
            this.f25017k = com.bytedance.apm.c.b();
            final Runnable a3 = com.bytedance.b.a.a(context);
            b.a.f25210a.a(new Runnable() {
                /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14613);
                }

                public final void run() {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    ApmDelegate.this.f25013g.registerConfigListener(a.f25042a);
                    if ((bVar.f24778k & 1) == 0 || a.C0529a.f24928a.a().f24956b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.bytedance.apm.c.a.d.f24708i = z;
                    com.bytedance.apm.config.b bVar = bVar;
                    long j2 = a.C0529a.f24928a.a().f24960f;
                    if (j2 == -1) {
                        j2 = bVar.f24779l;
                    }
                    com.bytedance.apm.c.a.d.f24707h = j2;
                    Context context = context;
                    if (!a.f25043a) {
                        a.f25043a = true;
                        if (a.f25044b == null) {
                            a.f25044b = com.ss.android.ugc.aweme.bf.d.a(context, "monitor_switch_config", 0);
                        }
                        if (a.f25044b != null) {
                            int i2 = a.f25044b.getInt("monitor_switch_config_first_flag", 0);
                            a.f25045c = i2;
                            a.f25046d = i2;
                            a.f25047e = a.f25044b.getLong("monitor_switch_config_atrace_flag", 0);
                        }
                    }
                    if (ApmDelegate.this.f25017k) {
                        f.r.o.f25216a.start();
                        j.a aVar = new j.a();
                        aVar.f41543g = a.f25047e;
                        if (a.f25047e == 0 || !a.b(2)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        aVar.f41537a = z2;
                        if (!bVar.f24777j || !a.b(2)) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        aVar.f41538b = z3;
                        aVar.f41542f = a.b(64);
                        aVar.f41539c = false;
                        aVar.f41541e = true;
                        aVar.f41544h = (-536870912 & a.f25045c) >>> 29;
                        k a2 = k.a();
                        Context context2 = com.bytedance.apm.c.f24685a;
                        com.bytedance.monitor.collector.j jVar = new com.bytedance.monitor.collector.j(aVar);
                        if (!a2.f41547c) {
                            synchronized (a2) {
                                if (!a2.f41547c) {
                                    boolean a3 = k.a(context2);
                                    a2.f41551g = jVar.f41534f;
                                    if (a2.n != null && !a2.f41550f) {
                                        boolean z4 = a2.f41551g;
                                    }
                                    if (a3) {
                                        if (com.bytedance.apm.c.e()) {
                                            try {
                                                if (k.f41545a) {
                                                    MonitorJni.doSetDebugMode(true);
                                                }
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        a2.o = jVar;
                                        try {
                                            if (k.f41545a) {
                                                MonitorJni.doInit();
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                        a2.f41553i = new l(jVar.f41536h);
                                        if (jVar.f41530b) {
                                            a2.f41552h = new BinderMonitor(jVar.f41536h);
                                            MonitorJni.enableBinderHook();
                                        }
                                        if (jVar.f41529a) {
                                            a2.f41554j = new com.bytedance.monitor.collector.c(jVar.f41536h);
                                            a2.f41554j.a(jVar.f41535g);
                                            if (jVar.f41531c) {
                                                try {
                                                    if (k.f41545a) {
                                                        MonitorJni.doEnableLock();
                                                    }
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                        }
                                        if (jVar.f41532d) {
                                            a2.f41555k = new IOMonitor(jVar.f41536h);
                                            if (k.f41545a) {
                                                MonitorJni.doEnableIO();
                                            }
                                        }
                                    }
                                    if (jVar.f41533e) {
                                        a2.f41556l = new com.bytedance.monitor.collector.g(jVar.f41536h);
                                    }
                                    a2.f41547c = true;
                                }
                            }
                        }
                        k a4 = k.a();
                        for (int i3 = 0; i3 < a4.f41546b.size(); i3++) {
                            a4.f41546b.get(i3).a();
                        }
                        a4.f41548d = true;
                    }
                    
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x017f: CONSTRUCTOR  
                          (wrap: com.bytedance.apm.block.f : 0x0179: INVOKE  (r1v2 com.bytedance.apm.block.f) =  type: STATIC call: com.bytedance.apm.block.f.a():com.bytedance.apm.block.f)
                         call: com.bytedance.apm.block.f.1.<init>(com.bytedance.apm.block.f):void type: CONSTRUCTOR in method: com.bytedance.apm.internal.ApmDelegate.1.run():void, file: classes.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.block.f, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 14 more
                        */
                    /*
                    // Method dump skipped, instructions count: 394
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.internal.ApmDelegate.AnonymousClass1.run():void");
                }
            });
            if (this.f25017k) {
                com.bytedance.apm.k.b.a.a(a2, this.f25007a.f24780m);
                if (bVar.f24769b) {
                    new com.bytedance.apm.trace.c().a(bVar.f24770c);
                }
                AutoPageTraceHelper.setMaxValidTimeMs(bVar.f24770c);
                AutoLaunchTraceHelper.setMaxValidTimeMs(bVar.f24771d);
                t = bVar.f24775h;
                r = bVar.f24774g;
                s = bVar.f24773f;
                boolean z = bVar.f24776i;
                f.r.a();
                if (z) {
                    final com.bytedance.apm.block.a.b bVar2 = new com.bytedance.apm.block.a.b();
                    com.bytedance.apm.trace.b.c.s = bVar2;
                    com.bytedance.p.b.c.f41754b = new com.bytedance.p.b.d() {
                        /* class com.bytedance.apm.internal.ApmDelegate.AnonymousClass9 */

                        static {
                            Covode.recordClassIndex(14625);
                        }

                        @Override // com.bytedance.p.b.d
                        public final void a(long j2, boolean z) {
                            f.r.o.a(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: INVOKE  
                                  (wrap: com.bytedance.apm.p.d : 0x0004: IGET  (r1v0 com.bytedance.apm.p.d) = 
                                  (wrap: com.bytedance.apm.block.a.f : 0x0002: SGET  (r0v0 com.bytedance.apm.block.a.f) =  com.bytedance.apm.block.a.f.r com.bytedance.apm.block.a.f)
                                 com.bytedance.apm.block.a.f.o com.bytedance.apm.p.d)
                                  (wrap: com.bytedance.apm.block.a.b$1 : 0x0008: CONSTRUCTOR  (r0v1 com.bytedance.apm.block.a.b$1) = 
                                  (wrap: com.bytedance.apm.block.a.b : 0x0000: IGET  (r2v0 com.bytedance.apm.block.a.b) = (r3v0 'this' com.bytedance.apm.internal.ApmDelegate$9 A[IMMUTABLE_TYPE, THIS]) com.bytedance.apm.internal.ApmDelegate.9.a com.bytedance.apm.block.a.b)
                                  (r4v0 'j2' long)
                                  (r6v0 'z' boolean)
                                 call: com.bytedance.apm.block.a.b.1.<init>(com.bytedance.apm.block.a.b, long, boolean):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: com.bytedance.apm.p.d.a(java.lang.Runnable):boolean in method: com.bytedance.apm.internal.ApmDelegate.9.a(long, boolean):void, file: classes.dex
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
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: CONSTRUCTOR  (r0v1 com.bytedance.apm.block.a.b$1) = 
                                  (wrap: com.bytedance.apm.block.a.b : 0x0000: IGET  (r2v0 com.bytedance.apm.block.a.b) = (r3v0 'this' com.bytedance.apm.internal.ApmDelegate$9 A[IMMUTABLE_TYPE, THIS]) com.bytedance.apm.internal.ApmDelegate.9.a com.bytedance.apm.block.a.b)
                                  (r4v0 'j2' long)
                                  (r6v0 'z' boolean)
                                 call: com.bytedance.apm.block.a.b.1.<init>(com.bytedance.apm.block.a.b, long, boolean):void type: CONSTRUCTOR in method: com.bytedance.apm.internal.ApmDelegate.9.a(long, boolean):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 14 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.apm.block.a.b, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 20 more
                                */
                            /*
                                this = this;
                                com.bytedance.apm.block.a.b r2 = r1
                                com.bytedance.apm.block.a.f r0 = com.bytedance.apm.block.a.f.r
                                com.bytedance.apm.p.d r1 = r0.o
                                com.bytedance.apm.block.a.b$1 r0 = new com.bytedance.apm.block.a.b$1
                                r0.<init>(r4, r6)
                                r1.a(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.internal.ApmDelegate.AnonymousClass9.a(long, boolean):void");
                        }
                    };
                    f.r.a(bVar2);
                }
                initEvilMethodTraceInject();
                com.bytedance.apm.f.a.b.c();
                if (bVar.q != null) {
                    a.C0529a.f24928a.a(bVar.q);
                }
                com.bytedance.apm.c.n = bVar.p;
                com.bytedance.apm.c.o = bVar.r;
                com.bytedance.apm.c.f24688d = System.nanoTime() - nanoTime;
            }
            if (com.bytedance.apm.c.e()) {
                if (this.f25017k) {
                    b.a.f24903a.a("APM_INIT", (String) null);
                } else {
                    b.a.f24903a.a("APM_INIT_OTHER_PROCESS", (String) null);
                }
            }
            com.bytedance.b.a.a(context);
            com.bytedance.apm.c.s = true;
        }
    }
}
