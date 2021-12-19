package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.b.b;
import com.bytedance.crash.b.c;
import com.bytedance.crash.b.h;
import com.bytedance.crash.b.i;
import com.bytedance.crash.e.a;
import com.bytedance.crash.e.d;
import com.bytedance.crash.gwpasan.GwpAsan;
import com.bytedance.crash.j.f;
import com.bytedance.crash.m;
import com.bytedance.crash.n;
import com.bytedance.crash.nativecrash.NativeCrashCollector;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.crash.runtime.a.e;
import com.bytedance.crash.runtime.j;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.ab;
import com.bytedance.crash.util.n;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.v;
import com.bytedance.crash.util.w;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

public final class Npth {
    private static boolean sInit;

    static {
        Covode.recordClassIndex(16126);
    }

    public static void setAlogFlushAddr(long j2) {
    }

    public static void setAlogLogDirAddr(long j2) {
    }

    public static void setAlogWriteAddr(long j2) {
    }

    public static void stopEnsure() {
        n.f27745i = true;
    }

    public static void stopUpload() {
        n.f27744h = true;
    }

    public static ConfigManager getConfigManager() {
        return m.f27730g;
    }

    public static boolean hasCrashWhenNativeCrash() {
        return a.f27522d;
    }

    public static boolean isANREnable() {
        return n.f27739c;
    }

    public static boolean isInit() {
        return sInit;
    }

    public static boolean isJavaCrashEnable() {
        return n.f27738b;
    }

    public static boolean isNativeCrashEnable() {
        return n.f27740d;
    }

    public static boolean isStopUpload() {
        return n.f27744h;
    }

    public static boolean hasCrash() {
        return n.a();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return n.b();
    }

    public static boolean isRunning() {
        if (SystemClock.uptimeMillis() - b.f27441b <= 15000) {
            return true;
        }
        return false;
    }

    public static void openANRMonitor() {
        if (n.f27737a) {
            h.a(m.f27724a).f27498a.a();
            n.f27739c = true;
        }
    }

    public static void openJavaCrashMonitor() {
        if (n.f27737a && !n.f27738b) {
            Context context = m.f27724a;
            a a2 = a.a();
            a2.f27526a = new d(context, true);
            a2.f27527b = new d(context, false);
        }
    }

    public static boolean openNativeCrashMonitor() {
        if (n.f27737a && !n.f27740d) {
            boolean a2 = NativeImpl.a(m.f27724a);
            n.f27740d = a2;
            if (!a2) {
                n.f27741e = true;
            }
        }
        return n.f27740d;
    }

    public static void stopAnr() {
        if (n.f27737a) {
            com.bytedance.crash.b.a aVar = h.a(m.f27724a).f27498a;
            if (aVar.f27416b) {
                aVar.f27416b = false;
                if (aVar.f27415a != null) {
                    aVar.f27415a.f27444c = true;
                }
                if (i.f27499a) {
                    i.f27499a = false;
                }
                aVar.f27415a = null;
            }
            n.f27739c = false;
        }
    }

    private static boolean isGwpAsanSupportApiLevel() {
        JSONArray a2 = n.a(com.bytedance.crash.runtime.b.a(), "custom_event_settings", "npth_simple_setting", "gwp_asan_api_level");
        if (a2 != null && a2.length() > 0) {
            if ("all".equals(a2.optString(0))) {
                return true;
            }
            for (int i2 = 1; i2 < a2.length(); i2++) {
                try {
                    if (Build.VERSION.SDK_INT == Integer.parseInt(a2.optString(i2))) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    private static boolean isGwpAsanSupportDeviceBrand() {
        JSONArray a2;
        if (!Build.BRAND.isEmpty() && (a2 = n.a(com.bytedance.crash.runtime.b.a(), "custom_event_settings", "npth_simple_setting", "gwp_asan_device_brand")) != null && a2.length() > 0) {
            if ("all".equals(a2.optString(0))) {
                return true;
            }
            for (int i2 = 1; i2 < a2.length(); i2++) {
                try {
                    if (Build.BRAND.equals(a2.optString(i2))) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    public static void setCurProcessName(String str) {
        com.bytedance.crash.util.b.f27978a = str;
    }

    public static void setLogcatImpl(com.bytedance.crash.runtime.i iVar) {
        j.f27919a = iVar;
    }

    public static void setNpthStartEventDelayTime(long j2) {
        m.f27736m = j2;
    }

    public static void setRequestIntercept(com.bytedance.crash.j.j jVar) {
        f.f27673b = jVar;
    }

    public static void setScriptStackCallback(g gVar) {
        NativeCrashCollector.f27755b = gVar;
    }

    public static void customActivityName(com.bytedance.crash.i.a aVar) {
        com.bytedance.crash.runtime.a.a.a().z = aVar;
    }

    public static void dumpHprof(String str) {
        NativeTools.a().b(str);
    }

    public static void registerHprofCallback(IOOMCallback iOOMCallback) {
        n.f27742f.f27899d.add(iOOMCallback);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        n.f27742f.f27898c.add(iOOMCallback);
    }

    public static void removeTag(String str) {
        m.f27731h.a(str, (String) null);
    }

    public static void setApplication(Application application) {
        if (application != null) {
            m.f27725b = application;
        }
    }

    public static void setBusiness(String str) {
        if (str != null) {
            m.f27728e = str;
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        m.f27731h.mFilter = iCrashFilter;
    }

    public static void setEncryptImpl(e eVar) {
        m.f27730g.setEncryptImpl(eVar);
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        if (map != null && !map.isEmpty()) {
            m.f27731h.mTagMap.putAll(map);
        }
    }

    public static Context com_bytedance_crash_Npth_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static void reportDartError(String str) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.crash.c.a.a(str, null, null, null);
        }
    }

    public static long getFileSize(String str) {
        MethodCollector.i(1943);
        NativeTools.a();
        long nativeGetPathSize = NativeTools.nativeGetPathSize(str, 0);
        MethodCollector.o(1943);
        return nativeGetPathSize;
    }

    public static long getFolderSize(String str) {
        MethodCollector.i(1941);
        NativeTools.a();
        long nativeGetPathSize = NativeTools.nativeGetPathSize(str, 1);
        MethodCollector.o(1941);
        return nativeGetPathSize;
    }

    public static void reportError(String str) {
        if (m.f27730g.isReportErrorEnable() && str != null) {
            com.bytedance.crash.runtime.n.b().a(new Runnable(str) {
                /* class com.bytedance.crash.e.a.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f27536a;

                static {
                    Covode.recordClassIndex(16175);
                }

                public final void run() {
                    com.bytedance.crash.entity.b bVar = new com.bytedance.crash.entity.b();
                    bVar.a("data", (Object) this.f27536a);
                    bVar.a("userdefine", (Object) 1);
                    com.bytedance.crash.entity.b a2 = e.a().a(CrashType.CUSTOM_JAVA, bVar);
                    if (a2 != null) {
                        com.bytedance.crash.j.e.a().b(a2.f27557a);
                    }
                }

                {
                    this.f27536a = r1;
                }
            });
        }
    }

    public static void setAlogFlushV2Addr(long j2) {
        MethodCollector.i(1857);
        if (NativeImpl.f27758a) {
            try {
                NativeImpl.doSetAlogFlushAddr(j2);
                MethodCollector.o(1857);
                return;
            } catch (Throwable unused) {
            }
        }
        MethodCollector.o(1857);
    }

    public static void reportError(Throwable th) {
        if (m.f27730g.isReportErrorEnable() && th != null) {
            com.bytedance.crash.runtime.n.b().a(new Runnable(th) {
                /* class com.bytedance.crash.e.a.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Throwable f27535a;

                static {
                    Covode.recordClassIndex(16174);
                }

                public final void run() {
                    Context context = m.f27724a;
                    long currentTimeMillis = System.currentTimeMillis();
                    Throwable th = this.f27535a;
                    if (currentTimeMillis == 0) {
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    com.bytedance.crash.entity.b bVar = new com.bytedance.crash.entity.b();
                    bVar.a("isJava", (Object) 1);
                    bVar.a("data", (Object) ab.a(th));
                    bVar.a("crash_time", Long.valueOf(currentTimeMillis));
                    bVar.a("process_name", (Object) com.bytedance.crash.util.b.c(context));
                    if (!com.bytedance.crash.util.b.b(context)) {
                        bVar.a("remote_process", (Object) 1);
                    }
                    bVar.a("userdefine", (Object) 1);
                    com.bytedance.crash.entity.b a2 = e.a().a(CrashType.CUSTOM_JAVA, bVar);
                    if (a2 != null) {
                        com.bytedance.crash.j.e.a().b(a2.f27557a);
                    }
                }

                {
                    this.f27535a = r1;
                }
            });
        }
    }

    public static void enableGwpAsan(boolean z) {
        if (!NativeTools.a().c()) {
            v.b("[XAsan]is 32 app.");
        } else if (Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT <= 29) {
            if ((m.c() || com.bytedance.crash.entity.e.b()) && !com.bytedance.crash.runtime.b.i()) {
                startGwpAsan(1, 8192, 0, 150, com.bytedance.crash.runtime.b.h(), 5);
            } else if (z && !com.bytedance.crash.runtime.b.i()) {
                if (!isGwpAsanSupportApiLevel()) {
                    v.b("[XAsan]android apilevel dont find.");
                } else if (!isGwpAsanSupportDeviceBrand()) {
                    v.b("[XAsan] android device dont find");
                } else {
                    startGwpAsan(com.bytedance.crash.runtime.b.d(), com.bytedance.crash.runtime.b.e(), com.bytedance.crash.runtime.b.f(), com.bytedance.crash.runtime.b.g(), com.bytedance.crash.runtime.b.h(), com.bytedance.crash.runtime.b.a(120));
                }
            }
        }
    }

    public static void registerSdk(String str, String str2) {
        m.a(str, str2);
    }

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            m.f27731h.a(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            m.f27731h.a(attachUserData, crashType);
        }
    }

    public static void addTag(String str, String str2) {
        m.f27731h.a(str, str2);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            m.f27731h.a(crashType, attachUserData);
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            m.f27731h.a(crashType, attachUserData);
        }
    }

    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            m.f27731h.a(attachUserData, crashType);
        }
    }

    public static void unregisterHprofCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        n.f27742f.f27899d.remove(iOOMCallback);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        n.f27742f.f27898c.remove(iOOMCallback);
    }

    public static void setAnrInfoFileObserver(String str, f fVar) {
        com.bytedance.crash.runtime.n.b().a(new Runnable(str, fVar) {
            /* class com.bytedance.crash.n.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f27748a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f27749b;

            static {
                Covode.recordClassIndex(16257);
            }

            public final void run() {
                if (com.bytedance.crash.util.b.b(m.f27724a)) {
                    c.a(this.f27748a, this.f27749b);
                }
            }

            {
                this.f27748a = r1;
                this.f27749b = r2;
            }
        });
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            MethodCollector.i(1728);
            init(context, iCommonParams, true, false, false);
            MethodCollector.o(1728);
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            MethodCollector.i(1726);
            m.f27729f = true;
            init(context, iCommonParams, true, false, true, true);
            MethodCollector.o(1726);
        }
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        com.bytedance.crash.runtime.c cVar = n.f27742f;
        if (crashType == CrashType.ALL) {
            cVar.f27896a.removeAll(iCrashCallback);
        } else {
            cVar.f27896a.removeInList(crashType, iCrashCallback);
        }
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        com.bytedance.crash.runtime.c cVar = n.f27742f;
        if (crashType == CrashType.ALL) {
            cVar.f27896a.addMulti(iCrashCallback, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
            return;
        }
        cVar.f27896a.add(crashType, iCrashCallback);
    }

    public static void registerCrashInfoCallback(b bVar, CrashType crashType) {
        com.bytedance.crash.runtime.c cVar = n.f27742f;
        if (crashType == CrashType.ALL) {
            cVar.f27897b.addMulti(bVar, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
            return;
        }
        cVar.f27897b.add(crashType, bVar);
    }

    public static void registerSdk(int i2, String str) {
        MethodCollector.i(1854);
        if (m.f27732i == null) {
            synchronized (m.class) {
                try {
                    if (m.f27732i == null) {
                        m.f27732i = new ConcurrentHashMap<>();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1854);
                    throw th;
                }
            }
        }
        m.f27732i.put(Integer.valueOf(i2), str);
        MethodCollector.o(1854);
    }

    public static void reportGameException(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            com.bytedance.crash.runtime.n.b().a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: INVOKE  
                  (wrap: com.bytedance.crash.runtime.s : 0x0012: INVOKE  (r1v0 com.bytedance.crash.runtime.s) =  type: STATIC call: com.bytedance.crash.runtime.n.b():com.bytedance.crash.runtime.s)
                  (wrap: com.bytedance.crash.d.a$1 : 0x0018: CONSTRUCTOR  (r0v1 com.bytedance.crash.d.a$1) = (r2v0 'str' java.lang.String), (r3v0 'str2' java.lang.String), (r4v0 'str3' java.lang.String) call: com.bytedance.crash.d.a.1.<init>(java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.bytedance.crash.runtime.s.a(java.lang.Runnable):boolean in method: com.bytedance.crash.Npth.reportGameException(java.lang.String, java.lang.String, java.lang.String):void, file: classes.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0018: CONSTRUCTOR  (r0v1 com.bytedance.crash.d.a$1) = (r2v0 'str' java.lang.String), (r3v0 'str2' java.lang.String), (r4v0 'str3' java.lang.String) call: com.bytedance.crash.d.a.1.<init>(java.lang.String, java.lang.String, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.crash.Npth.reportGameException(java.lang.String, java.lang.String, java.lang.String):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.crash.d.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                boolean r0 = android.text.TextUtils.isEmpty(r4)
                if (r0 == 0) goto L_0x0012
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto L_0x0012
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L_0x001e
            L_0x0012:
                com.bytedance.crash.runtime.s r1 = com.bytedance.crash.runtime.n.b()
                com.bytedance.crash.d.a$1 r0 = new com.bytedance.crash.d.a$1
                r0.<init>(r2, r3, r4)
                r1.a(r0)
            L_0x001e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.Npth.reportGameException(java.lang.String, java.lang.String, java.lang.String):void");
        }

        public static void enableALogCollector(String str, com.bytedance.crash.a.c cVar, com.bytedance.crash.a.d dVar) {
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                com.bytedance.crash.a.a a2 = com.bytedance.crash.a.a.a();
                a2.f27407a = str;
                a2.f27408b = cVar;
                a2.f27409c = dVar;
                if (!a2.f27410d) {
                    a2.f27410d = true;
                }
            }
        }

        public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, h hVar) {
            if (!TextUtils.isEmpty(str)) {
                com.bytedance.crash.c.a.a(str, map, map2, hVar);
            }
        }

        public static void startNativeHeapTracker(int i2, int i3, int i4, boolean z) {
            Context context = m.f27724a;
            com.bytedance.crash.util.b.c(context);
            new File(r.j(context), "NativeHeapTracker");
        }

        public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams, int i2, String str) {
            synchronized (Npth.class) {
                MethodCollector.i(1727);
                m.f27729f = true;
                m.f27734k = i2;
                m.f27735l = str;
                init(context, iCommonParams, true, true, true, true);
                MethodCollector.o(1727);
            }
        }

        public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3) {
            synchronized (Npth.class) {
                MethodCollector.i(1730);
                init(context, iCommonParams, z, z, z2, z3);
                MethodCollector.o(1730);
            }
        }

        public static void startGwpAsan(int i2, int i3, int i4, int i5, int i6, int i7) {
            Context context = m.f27724a;
            GwpAsan gwpAsan = new GwpAsan(context, r.b(context), i2, i3, i4, i5, i6, i7);
            if (GwpAsan.f27592h) {
                v.a("XASAN", "execute() Already running!");
            } else if (gwpAsan.f27602e != 1 || Build.BRAND.isEmpty() || !Build.BRAND.equals("Meizu")) {
                if (m.c() || com.bytedance.crash.entity.e.b()) {
                    v.a("XASAN", "offline Test Mode");
                } else if (!GwpAsan.b()) {
                    v.a("XASAN", "xasan check time");
                    return;
                }
                new Thread("XAsanTracker") {
                    /* class com.bytedance.crash.gwpasan.GwpAsan.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(16199);
                    }

                    public final void run() {
                        MethodCollector.i(11890);
                        try {
                            if (!GwpAsan.this.a()) {
                                com.bytedance.crash.d.a("XAsanTracker Init Failed load Lib Fail", "EnsureNotReachHere", null);
                                MethodCollector.o(11890);
                            } else if (GwpAsan.f27595k == null) {
                                m.f27730g.isDebugMode();
                                MethodCollector.o(11890);
                            } else if (GwpAsan.f27595k.exists() || GwpAsan.f27595k.mkdir()) {
                                String str = GwpAsan.f27595k.getAbsolutePath() + '/' + m.e();
                                String absolutePath = GwpAsan.f27595k.getAbsolutePath();
                                Context context = GwpAsan.f27596l;
                                if (GwpAsan.f27597m == null && new File(context.getApplicationInfo().nativeLibraryDir, "libnpth_dumper.so").exists()) {
                                    GwpAsan.f27597m = context.getApplicationInfo().nativeLibraryDir;
                                }
                                GwpAsan.GwpAsanSetParams(GwpAsan.this.f27598a, GwpAsan.this.f27603f, str, absolutePath, GwpAsan.f27597m);
                                v.a("XASAN", "SetParams");
                                GwpAsan.f27592h = true;
                                v.a("XASAN", "init");
                                int gwpAsanNativeInit = GwpAsan.gwpAsanNativeInit(Build.VERSION.SDK_INT, GwpAsan.this.f27602e, GwpAsan.this.f27599b, GwpAsan.this.f27600c, GwpAsan.this.f27601d);
                                if (1 != gwpAsanNativeInit) {
                                    com.bytedance.crash.d.a("XAsanTracker Init Failed code ".concat(String.valueOf(gwpAsanNativeInit)), "EnsureNotReachHere", null);
                                    MethodCollector.o(11890);
                                    return;
                                }
                                v.a("XASAN", "init end");
                                MethodCollector.o(11890);
                            } else {
                                m.f27730g.isDebugMode();
                                MethodCollector.o(11890);
                            }
                        } catch (Throwable th) {
                            com.bytedance.crash.d.a("NPTH_CATCH", th);
                            MethodCollector.o(11890);
                        }
                    }
                }.start();
            } else {
                v.a("XASAN", "Not load libnpth_xasan return!");
            }
        }

        public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4) {
            synchronized (Npth.class) {
                MethodCollector.i(1738);
                init(context, iCommonParams, z, z2, z3, z4, 0);
                MethodCollector.o(1738);
            }
        }

        public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j2) {
            String str;
            Application application;
            synchronized (Npth.class) {
                MethodCollector.i(1742);
                if (m.f27725b != null) {
                    application = m.f27725b;
                } else if (context instanceof Application) {
                    application = (Application) context;
                    if (application.getBaseContext() == null) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Param 'application' have not called 'super.attachBaseContext()', please using 'baseContext' param and invoking 'Npth.setApplication(Application)' before init");
                        MethodCollector.o(1742);
                        throw illegalArgumentException;
                    }
                } else {
                    try {
                        application = (Application) com_bytedance_crash_Npth_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
                        if (application == null) {
                            throw new IllegalArgumentException(str);
                        } else if (application.getBaseContext() != null) {
                            context = application.getBaseContext();
                        }
                    } finally {
                        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Couldn't obtain Application instance before 'super.attachBaseContext()', please invoking 'Npth.setApplication(Application)' before init.");
                        MethodCollector.o(1742);
                    }
                }
                init(application, context, iCommonParams, z, z2, z3, z4, j2);
                MethodCollector.o(1742);
            }
        }

        public static synchronized void init(Application application, final Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j2) {
            synchronized (Npth.class) {
                MethodCollector.i(1752);
                SystemClock.uptimeMillis();
                if (sInit) {
                    MethodCollector.o(1752);
                    return;
                }
                sInit = true;
                m.a(application, context, iCommonParams);
                new l() {
                    /* class com.bytedance.crash.Npth.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(16127);
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.crash.l
                    public final String a() {
                        return m.g();
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.crash.l
                    public final void a(String str, String str2) {
                        Npth.registerSdk(str, str2);
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.crash.l
                    public final void b(String str, String str2) {
                        m.a(str + ".so", str2);
                        if (NativeImpl.f27760c) {
                            com.bytedance.crash.nativecrash.f.a(str, str2);
                        }
                    }
                };
                n.a(application, context, z, z2, z3, z4);
                com.bytedance.crash.runtime.n.b().a(new Runnable() {
                    /* class com.bytedance.crash.Npth.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(16128);
                    }

                    public final void run() {
                        Map<String, Object> a2 = m.a().a();
                        int a3 = w.a(a2.get("update_version_code"), 0);
                        int a4 = w.a(a2.get("aid"), 4444);
                        MonitorCrash init = MonitorCrash.init(context, String.valueOf(a4), (long) a3, String.valueOf(a2.get("app_version")));
                        if (init != null) {
                            init.config().setDeviceId(m.a().c()).setChannel(String.valueOf(a2.get("channel")));
                        }
                    }
                });
                n.f27746j = new n.b() {
                    /* class com.bytedance.crash.Npth.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(16129);
                    }

                    /* access modifiers changed from: package-private */
                    @Override // com.bytedance.crash.n.b
                    public final void a(int i2, int i3, int i4, boolean z) {
                        Npth.startNativeHeapTracker(i2, i3, i4, z);
                    }
                };
                n.f27747k = new n.a() {
                    /* class com.bytedance.crash.Npth.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(16130);
                    }

                    /* access modifiers changed from: package-private */
                    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f6, code lost:
                        r8 = th;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f8, code lost:
                        r8 = e;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02fe, code lost:
                        r8 = th;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0300, code lost:
                        r8 = e;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:157:0x030a, code lost:
                        r8 = th;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030e, code lost:
                        r8 = e;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:167:0x031e, code lost:
                        r8 = th;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0321, code lost:
                        r8 = e;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0326, code lost:
                        r8 = th;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:176:0x033f, code lost:
                        r8 = e;
                     */
                    /* JADX WARNING: Failed to process nested try/catch */
                    /* JADX WARNING: Removed duplicated region for block: B:147:0x02f6 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:107:0x01ef] */
                    /* JADX WARNING: Removed duplicated region for block: B:151:0x02fe A[ExcHandler: all (th java.lang.Throwable), Splitter:B:79:0x019b] */
                    /* JADX WARNING: Removed duplicated region for block: B:157:0x030a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:36:0x0088] */
                    /* JADX WARNING: Removed duplicated region for block: B:167:0x031e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:19:0x004d] */
                    /* JADX WARNING: Removed duplicated region for block: B:172:0x0326 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x003e] */
                    @Override // com.bytedance.crash.n.a
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(java.lang.String r26) {
                        /*
                        // Method dump skipped, instructions count: 874
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.Npth.AnonymousClass4.a(java.lang.String):void");
                    }

                    /* access modifiers changed from: package-private */
                    @Override // com.bytedance.crash.n.a
                    public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
                        Npth.startGwpAsan(i2, i3, i4, i5, i6, i7);
                    }
                };
                MethodCollector.o(1752);
            }
        }
    }
