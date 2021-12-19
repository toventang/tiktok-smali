package com.ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import android.content.Context;
import b.i;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.abmock.datacenter.g;
import com.bytedance.ies.abmock.debugtool.mock.ConfigMock;
import com.bytedance.ies.abmock.e;
import com.bytedance.ies.abmock.j;
import com.bytedance.ies.abmock.n;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import h.f.b.l;
import java.util.List;

public class ABTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f107719a;

    static {
        Covode.recordClassIndex(68907);
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
    public final List j() {
        return null;
    }

    static class a extends com.bytedance.ies.abmock.datacenter.a {
        static {
            Covode.recordClassIndex(68908);
        }

        a() {
        }
    }

    static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f107720a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f107721b;

        static {
            Covode.recordClassIndex(68909);
        }

        @Override // com.bytedance.ies.abmock.n, com.bytedance.ies.abmock.datacenter.f
        public final boolean b() {
            return true;
        }

        b() {
        }

        @Override // com.bytedance.ies.abmock.n, com.bytedance.ies.abmock.datacenter.f
        public final com.bytedance.ies.abmock.datacenter.a.a c() {
            return ConfigMock.INSTANCE;
        }

        @Override // com.bytedance.ies.abmock.n, com.bytedance.ies.abmock.datacenter.f
        public final String d() {
            try {
                String curUserId = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
                if (curUserId == null) {
                    return "";
                }
                return curUserId;
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // com.bytedance.ies.abmock.n, com.bytedance.ies.abmock.datacenter.f
        public final boolean f() {
            return ((Boolean) com.ss.android.ugc.aweme.experiment.a.f89513a.getValue()).booleanValue();
        }

        @Override // com.bytedance.ies.abmock.n, com.bytedance.ies.abmock.datacenter.f
        public final boolean a() {
            if (this.f107720a == null) {
                this.f107720a = Boolean.valueOf(m.a(d.s, "lark_inhouse"));
            }
            if (this.f107720a.booleanValue()) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.ies.abmock.n, com.bytedance.ies.abmock.datacenter.f
        public final boolean e() {
            if (this.f107721b == null) {
                this.f107721b = Boolean.valueOf(Keva.getRepoSync("settings_v3_config", 1).getBoolean("tt_use_libra_config_and", false));
            }
            return this.f107721b.booleanValue();
        }

        @Override // com.bytedance.ies.abmock.n, com.bytedance.ies.abmock.datacenter.f
        public final void a(String str) {
            AppLog.setAbSDKVersion(str);
        }
    }

    static class c extends g {
        static {
            Covode.recordClassIndex(68910);
        }

        c() {
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.MAIN;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return q.f107989a;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        if (!f107719a) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        MethodCollector.i(7084);
        if (!f107719a) {
            synchronized (ABTask.class) {
                try {
                    if (!f107719a) {
                        a.b.f109011a.a("method_abtask_run_duration", false);
                        a.b.f109011a.a("method_abtask_anole_duration", false);
                        l.c(new com.ss.android.ugc.aweme.cv.a.a(), "");
                        a.b.f109011a.b("method_abtask_anole_duration", false);
                        a.b.f109011a.a("method_abtask_provider_duration", false);
                        b bVar = new b();
                        a.b.f109011a.b("method_abtask_provider_duration", false);
                        a.b.f109011a.a("method_abtask_abvalue_duration", false);
                        a aVar = new a();
                        a.b.f109011a.b("method_abtask_abvalue_duration", false);
                        a.b.f109011a.a("method_abtask_setting_duration", false);
                        c cVar = new c();
                        a.b.f109011a.b("method_abtask_setting_duration", false);
                        a.b.f109011a.a("method_abtask_init_duration", false);
                        j a2 = j.a();
                        Application application = (Application) d.a();
                        a2.f31864a = application;
                        a2.f31865b = bVar;
                        com.bytedance.ies.abmock.b.a().f31794a = aVar;
                        SettingsManager.a().f31787a = cVar;
                        e.a();
                        com.bytedance.ies.abmock.datacenter.e a3 = com.bytedance.ies.abmock.datacenter.e.a();
                        com.bytedance.ies.abmock.datacenter.a.a d2 = j.a().d();
                        boolean c2 = j.a().c();
                        a3.f31826b = bVar;
                        a3.f31825a = d2;
                        a3.f31827c = c2;
                        i.a((long) InteractFirstFrameTimeOutDurationSetting.DEFAULT).a(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b2: INVOKE  
                              (wrap: b.i<java.lang.Void> : 0x00a9: INVOKE  (r1v12 b.i<java.lang.Void>) = 
                              (wrap: long : ?: CAST (long) (wrap: ?? : ?: SGET   com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting.DEFAULT long))
                             type: STATIC call: b.i.a(long):b.i)
                              (wrap: com.bytedance.ies.abmock.datacenter.e$1 : 0x00af: CONSTRUCTOR  (r0v21 com.bytedance.ies.abmock.datacenter.e$1) = (r3v1 'a3' com.bytedance.ies.abmock.datacenter.e) call: com.bytedance.ies.abmock.datacenter.e.1.<init>(com.bytedance.ies.abmock.datacenter.e):void type: CONSTRUCTOR)
                             type: VIRTUAL call: b.i.a(b.g):b.i in method: com.ss.android.ugc.aweme.legoImp.task.ABTask.a(android.content.Context):void, file: classes.dex
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00af: CONSTRUCTOR  (r0v21 com.bytedance.ies.abmock.datacenter.e$1) = (r3v1 'a3' com.bytedance.ies.abmock.datacenter.e) call: com.bytedance.ies.abmock.datacenter.e.1.<init>(com.bytedance.ies.abmock.datacenter.e):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.legoImp.task.ABTask.a(android.content.Context):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 38 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.abmock.datacenter.e, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 44 more
                            */
                        /*
                        // Method dump skipped, instructions count: 234
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.ABTask.a(android.content.Context):void");
                    }
                }
