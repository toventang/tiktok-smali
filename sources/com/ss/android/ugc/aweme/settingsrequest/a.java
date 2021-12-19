package com.ss.android.ugc.aweme.settingsrequest;

import b.i;
import com.bytedance.common.utility.collection.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.g.c;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.b;
import com.bytedance.keva.Keva;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.experiment.ee;
import com.ss.android.ugc.aweme.setting.IAbTestManager;
import com.ss.android.ugc.aweme.setting.bg;
import com.ss.android.ugc.aweme.setting.cd;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.video.local.f;
import f.a.t;
import f.a.z;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class a implements IAbTestManager, cd.a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f123159a;

    /* renamed from: b  reason: collision with root package name */
    private d<bg> f123160b = new d<>();

    static {
        Covode.recordClassIndex(80884);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager, com.ss.android.ugc.aweme.setting.cd.a
    public final void cz_() {
        com.ss.android.ugc.aweme.settingsrequest.api.a.a();
        c.b();
    }

    private static void f() {
        Keva.getRepoSync("ab_repo_cold_boot", 0).storeBoolean("clear_red_point_cost", true);
    }

    public a() {
        cd.f122158b.a(3, this);
    }

    public static void c() {
        d();
        VideoBitRateABManager.f143220a.c();
        f();
        com.ss.android.di.push.a.a().initNotificationChannel();
        i.b(b.f123176a, i.f4824a);
        com.ss.android.ugc.aweme.settingsrequest.a.a.a();
        e();
    }

    private static void d() {
        boolean z = true;
        if (b.a().a(true, "use_surface_view", false) != com.ss.android.ugc.aweme.settingsrequest.c.d.f123187a) {
            z = false;
        }
        f.a().storeBoolean("useSurfaceView", z);
    }

    private static void e() {
        Keva.getRepo("settings_v3_config", 1).storeBoolean("tt_use_libra_config_and", SettingsManager.a().a("tt_use_libra_setting", false));
    }

    public static a b() {
        MethodCollector.i(8490);
        if (f123159a == null) {
            synchronized (a.class) {
                try {
                    if (f123159a == null) {
                        f123159a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8490);
                    throw th;
                }
            }
        }
        a aVar = f123159a;
        MethodCollector.o(8490);
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void a(bg bgVar) {
        this.f123160b.a(bgVar);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void a(o oVar) {
        o oVar2 = new o();
        oVar2.a("data", oVar);
        com.ss.android.ugc.aweme.settingsrequest.api.a.a(oVar2);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void a(l lVar) {
        if (lVar != null) {
            try {
                t.a(new com.ss.android.ugc.aweme.settingsrequest.api.d(lVar)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((z) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: INVOKE  
                      (wrap: f.a.t : 0x001b: INVOKE  (r1v2 f.a.t) = 
                      (wrap: f.a.t : 0x0011: INVOKE  (r1v1 f.a.t) = 
                      (wrap: f.a.t : 0x0007: INVOKE  (r1v0 f.a.t) = 
                      (wrap: com.ss.android.ugc.aweme.settingsrequest.api.d : 0x0004: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.settingsrequest.api.d) = (r3v0 'lVar' com.google.gson.l) call: com.ss.android.ugc.aweme.settingsrequest.api.d.<init>(com.google.gson.l):void type: CONSTRUCTOR)
                     type: STATIC call: f.a.t.a(f.a.w):f.a.t)
                      (wrap: f.a.aa : 0x000d: INVOKE  (r0v3 f.a.aa) = (wrap: f.a.aa : 0x000b: SGET  (r0v2 f.a.aa) =  f.a.k.a.c f.a.aa) type: STATIC call: f.a.h.a.b(f.a.aa):f.a.aa)
                     type: VIRTUAL call: f.a.t.b(f.a.aa):f.a.t)
                      (wrap: f.a.aa : 0x0017: INVOKE  (r0v5 f.a.aa) = (wrap: f.a.aa : 0x0015: SGET  (r0v4 f.a.aa) =  f.a.a.b.a.a f.a.aa) type: STATIC call: f.a.a.a.a.a(f.a.aa):f.a.aa)
                     type: VIRTUAL call: f.a.t.a(f.a.aa):f.a.t)
                      (wrap: f.a.z : ?: CAST (f.a.z) (wrap: com.ss.android.ugc.aweme.settingsrequest.api.a$1 : 0x0021: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.settingsrequest.api.a$1) =  call: com.ss.android.ugc.aweme.settingsrequest.api.a.1.<init>():void type: CONSTRUCTOR))
                     type: VIRTUAL call: f.a.t.b(f.a.z):void in method: com.ss.android.ugc.aweme.settingsrequest.a.a(com.google.gson.l):void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (f.a.z) (wrap: com.ss.android.ugc.aweme.settingsrequest.api.a$1 : 0x0021: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.settingsrequest.api.a$1) =  call: com.ss.android.ugc.aweme.settingsrequest.api.a.1.<init>():void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.settingsrequest.a.a(com.google.gson.l):void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: CONSTRUCTOR  (r0v6 com.ss.android.ugc.aweme.settingsrequest.api.a$1) =  call: com.ss.android.ugc.aweme.settingsrequest.api.a.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.settingsrequest.a.a(com.google.gson.l):void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.settingsrequest.api.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 34 more
                    */
                /*
                    this = this;
                    if (r3 == 0) goto L_0x002c
                    com.ss.android.ugc.aweme.settingsrequest.api.d r0 = new com.ss.android.ugc.aweme.settingsrequest.api.d     // Catch:{ Exception -> 0x0028 }
                    r0.<init>(r3)     // Catch:{ Exception -> 0x0028 }
                    f.a.t r1 = f.a.t.a(r0)     // Catch:{ Exception -> 0x0028 }
                    f.a.aa r0 = f.a.k.a.f158006c     // Catch:{ Exception -> 0x0028 }
                    f.a.aa r0 = f.a.h.a.b(r0)     // Catch:{ Exception -> 0x0028 }
                    f.a.t r1 = r1.b(r0)     // Catch:{ Exception -> 0x0028 }
                    f.a.aa r0 = f.a.a.b.a.f157156a     // Catch:{ Exception -> 0x0028 }
                    f.a.aa r0 = f.a.a.a.a.a(r0)     // Catch:{ Exception -> 0x0028 }
                    f.a.t r1 = r1.a(r0)     // Catch:{ Exception -> 0x0028 }
                    com.ss.android.ugc.aweme.settingsrequest.api.a$1 r0 = new com.ss.android.ugc.aweme.settingsrequest.api.a$1     // Catch:{ Exception -> 0x0028 }
                    r0.<init>()     // Catch:{ Exception -> 0x0028 }
                    r1.b(r0)     // Catch:{ Exception -> 0x0028 }
                    return
                L_0x0028:
                    r0 = move-exception
                    r0.printStackTrace()
                L_0x002c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settingsrequest.a.a(com.google.gson.l):void");
            }

            @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
            public final void a(boolean z) {
                cd.f122158b.a(3, z);
                if (z) {
                    if (ee.f89904d) {
                        com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new Runnable() {
                            /* class com.ss.android.ugc.aweme.settingsrequest.a.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(80885);
                            }

                            public final void run() {
                                i.b(new c(this), i.f4824a);
                            }
                        }, 300);
                    } else {
                        c();
                    }
                    com.ss.android.ugc.aweme.framework.a.a.a(4, "InterestSelectExperiment", "ab value refresh success,start to notify");
                    try {
                        Iterator<bg> it = this.f123160b.iterator();
                        while (it.hasNext()) {
                            bg next = it.next();
                            if (next != null) {
                                next.bH();
                            }
                        }
                    } catch (ConcurrentModificationException e2) {
                        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                    }
                    if (ee.f89904d) {
                        com.bytedance.aweme.b.a.f25788b.f25790a.post(new Runnable() {
                            /* class com.ss.android.ugc.aweme.settingsrequest.a.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(80886);
                            }

                            public final void run() {
                                SettingsRequestServiceImpl.i().a(com.bytedance.ies.ugc.appcontext.d.a());
                            }
                        });
                        return;
                    }
                    com.ss.android.ugc.aweme.settings.a.a.a(SettingsManager.a().a("enable_safe_view_checker", false));
                    SettingsRequestServiceImpl.i().a(com.bytedance.ies.ugc.appcontext.d.a());
                }
            }
        }
