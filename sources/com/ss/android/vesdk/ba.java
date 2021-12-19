package com.ss.android.vesdk;

import android.content.Context;
import android.os.Build;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.ss.android.medialib.VideoSdkCore;
import com.ss.android.ttve.log.TELog2ClientInvoker;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.monitor.b;
import com.ss.android.ttve.monitor.e;
import com.ss.android.ttve.monitor.g;
import com.ss.android.ttve.monitor.h;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESensService;
import com.ss.android.vesdk.runtime.VEEffectConfig;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.runtime.a.a;
import com.ss.android.vesdk.runtime.c;
import com.ss.android.vesdk.runtime.f;
import com.ss.android.vesdk.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class ba {

    /* renamed from: a  reason: collision with root package name */
    public static int f151052a = h.f61218a;

    public static void a() {
        e.f61199e = true;
    }

    public static void a(boolean z) {
        MethodCollector.i(13519);
        if (!VERuntime.a.INSTANCE.veRuntime.f151406k) {
            an.d("VERuntime", "runtime not init");
            z zVar = new z(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.o(13519);
            throw zVar;
        }
        VERuntime.nativeEnableImport10BitByteVC1Video(false);
        MethodCollector.o(13519);
    }

    public static void a(boolean z, int i2) {
        MethodCollector.i(13659);
        VERuntime vERuntime = VERuntime.a.INSTANCE.veRuntime;
        if (!vERuntime.f151406k) {
            an.d("VERuntime", "runtime not init");
            z zVar = new z(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.o(13659);
            throw zVar;
        }
        if (i2 <= 320) {
            i2 = 330;
        }
        vERuntime.nativeEnableHDH264HWDecoder(z, i2);
        MethodCollector.o(13659);
    }

    public static void a(boolean z, int i2, int i3) {
        MethodCollector.i(13722);
        VERuntime vERuntime = VERuntime.a.INSTANCE.veRuntime;
        if (!vERuntime.f151406k) {
            an.d("VERuntime", "runtime not init");
            z zVar = new z(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.o(13722);
            throw zVar;
        }
        vERuntime.nativeEnableHighFpsByteVC1HWDecoder(z, i2, i3);
        MethodCollector.o(13722);
    }

    public static void d() {
        VEEffectConfig.setUseNewEffectAlgorithmApi(true);
    }

    static {
        Covode.recordClassIndex(99344);
    }

    public static void c() {
        if (VERuntime.a.INSTANCE.veRuntime.f151399d == null) {
            throw new z(-108, "please set VEEnv or VEEnv#init");
        }
        VEEffectConfig.setEnableStickerAmazing(true);
    }

    public static void b() {
        MethodCollector.i(13583);
        VERuntime vERuntime = VERuntime.a.INSTANCE.veRuntime;
        if (!vERuntime.f151406k) {
            an.d("VERuntime", "runtime not init");
            z zVar = new z(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.o(13583);
            throw zVar;
        }
        vERuntime.nativeEnableTTByteVC1Decoder(true);
        MethodCollector.o(13583);
    }

    private static void e() {
        MethodCollector.i(13431);
        int i2 = 0;
        if (((Integer) u.a().a("use_open_gl_three", (Object) 1)).intValue() == 1) {
            int i3 = Build.VERSION.SDK_INT;
            VERuntime.a.INSTANCE.veRuntime.f151400e = true;
            VideoSdkCore.enableGLES3(true);
        } else {
            an.a("VESDK", "No gles config");
        }
        VERuntime.nativeEnableAudioSDKApiV2(((Boolean) u.a().a("aeabtest_v2api", (Object) false)).booleanValue());
        VERuntime.nativeEnableCrossPlatGLBaseFBO(((Boolean) u.a().a("crossplat_glbase_fbo", (Object) false)).booleanValue());
        VERuntime.nativeEnableRenderLib(((Boolean) u.a().a("enable_render_lib", (Object) false)).booleanValue());
        VESensService.getInstance().init();
        int registerSensCheckObject = VESensService.getInstance().registerSensCheckObject(VESensService.SENS_SERVICE_TYPE_MIC);
        int registerSensCheckObject2 = VESensService.getInstance().registerSensCheckObject(VESensService.SENS_SERVICE_TYPE_CAMERA);
        VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject, VESensService.a.ACTION_TYPE_ALOG);
        VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject2, VESensService.a.ACTION_TYPE_ALOG);
        an.a("VESDK", "error action type default value:ACTION_TYPE_ALOG");
        u.d a2 = u.a().a("privacy_error_action");
        if (!(a2 == null || a2.f151496b == null || !(a2.f151496b instanceof Integer))) {
            int intValue = ((Integer) a2.f151496b).intValue();
            VESensService.a[] values = VESensService.a.values();
            int length = values.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                VESensService.a aVar = values[i2];
                if (intValue == aVar.getActionType()) {
                    VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject, aVar);
                    VESensService.getInstance().setStatusAbnormalAction(registerSensCheckObject2, aVar);
                    break;
                }
                i2++;
            }
            an.a("VESDK", "error action type value:".concat(String.valueOf(intValue)));
        }
        u.d a3 = u.a().a("privacy_error_check_interval");
        if (!(a3 == null || a3.f151496b == null || !(a3.f151496b instanceof Integer))) {
            int intValue2 = ((Integer) a3.f151496b).intValue();
            VESensService.getInstance().setObjectStatusCheckInterval(intValue2);
            an.a("VESDK", "error monitor time out value:".concat(String.valueOf(intValue2)));
        }
        u.d a4 = u.a().a("privacy_error_check_threshold");
        if (!(a4 == null || a4.f151496b == null || !(a4.f151496b instanceof Integer))) {
            int intValue3 = ((Integer) a4.f151496b).intValue();
            VESensService.getInstance().setObjectStatusCheckThreshold(registerSensCheckObject, intValue3);
            VESensService.getInstance().setObjectStatusCheckThreshold(registerSensCheckObject2, intValue3);
            an.a("VESDK", "error threshold time out value:".concat(String.valueOf(intValue3)));
        }
        MethodCollector.o(13431);
    }

    public static void a(ResourceFinder resourceFinder) {
        VERuntime.a.INSTANCE.veRuntime.a(resourceFinder);
    }

    public static void a(VEListener.ac acVar) {
        VERuntime vERuntime = VERuntime.a.INSTANCE.veRuntime;
        vERuntime.f151407l = new WeakReference<>(acVar);
        h.f61220c = new WeakReference<>(vERuntime.o);
    }

    public static int a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    az.f151044h.put(next, Long.valueOf(jSONObject.getLong(next)));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            return 0;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return 0;
        }
    }

    public static void c(boolean z) {
        if (VERuntime.a.INSTANCE.veRuntime.f151399d == null) {
            throw new z(-108, "please set VEEnv or VEEnv#init");
        }
        VEEffectConfig.setEffectAsynAPI(z);
    }

    public static void a(VEListener.d dVar) {
        VERuntime vERuntime = VERuntime.a.INSTANCE.veRuntime;
        vERuntime.f151408m = new WeakReference<>(dVar);
        b.a(vERuntime.p);
    }

    public static void b(boolean z) {
        MethodCollector.i(13660);
        VERuntime vERuntime = VERuntime.a.INSTANCE.veRuntime;
        if (!vERuntime.f151406k) {
            an.d("VERuntime", "runtime not init");
            z zVar = new z(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.o(13660);
            throw zVar;
        }
        vERuntime.nativeEnableHighFpsH264HWDecoder(z, 40, 1070);
        MethodCollector.o(13660);
    }

    public static void a(VEListener.u uVar) {
        WeakReference<g.a> weakReference;
        VERuntime vERuntime = VERuntime.a.INSTANCE.veRuntime;
        vERuntime.n = uVar;
        g.a aVar = vERuntime.q;
        if (aVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(aVar);
        }
        g.f61217a = weakReference;
    }

    public static void a(k kVar) {
        e.a("user_id", kVar.f151345b);
        e.a("device_id", kVar.f151346c);
        a.EnumC4060a.INSTANCE.mInstance.a("KEY_DEVICEID", kVar.f151346c, true);
        e.a("app_version", kVar.f151344a);
    }

    public static void b(boolean z, int i2) {
        MethodCollector.i(13721);
        VERuntime vERuntime = VERuntime.a.INSTANCE.veRuntime;
        if (!vERuntime.f151406k) {
            an.d("VERuntime", "runtime not init");
            z zVar = new z(-108, "please set VEEnv or VEEnv#init");
            MethodCollector.o(13721);
            throw zVar;
        }
        if (i2 <= 720) {
            i2 = 730;
        }
        vERuntime.nativeEnableHDByteVC1HWDecoder(z, i2);
        MethodCollector.o(13721);
    }

    public static void a(Context context, String str) {
        MethodCollector.i(13433);
        bi.a();
        VERuntime vERuntime = VERuntime.a.INSTANCE.veRuntime;
        if (!vERuntime.f151406k) {
            vERuntime.f151406k = true;
            vERuntime.f151396a = context;
            Context context2 = vERuntime.f151396a;
            if (d.f107194b == null || !d.f107197e) {
                d.f107194b = context2.getCacheDir();
            }
            VEEffectConfig.setCacheDir(d.f107194b.getAbsolutePath());
            com.ss.android.ttve.nativePort.d.a(context);
            vERuntime.f151399d = new c();
            vERuntime.f151399d.f151438a = str;
            vERuntime.f151403h = new i();
            vERuntime.f151398c = new f(VERuntime.a.INSTANCE.veRuntime.f151399d.f151438a);
            vERuntime.r = a.EnumC4060a.INSTANCE.mInstance;
            a aVar = vERuntime.r;
            synchronized (aVar) {
                try {
                    if (!aVar.f151421a) {
                        aVar.f151422b = com.ss.android.ugc.aweme.bf.d.a(context, context.getPackageName(), 0);
                        aVar.f151421a = true;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13433);
                    throw th;
                }
            }
            Context context3 = vERuntime.f151396a;
            String str2 = (String) vERuntime.r.a("KEY_DEVICEID", "");
            TEMonitorInvoker.nativeInit();
            Context applicationContext = context3.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            if (e.f61195a) {
                SDKMonitorUtils.a("1357", new ArrayList(Arrays.asList("https://mon-sg.tiktokv.com/monitor/appmonitor/v2/settings", "https://mon.tiktokv.com/monitor/appmonitor/v2/settings", "https://mon.tiktokv.com/monitor/appmonitor/v2/settings")));
                SDKMonitorUtils.b("1357", new ArrayList(Arrays.asList("https://mon-sg.tiktokv.com/monitor/collect/", "https://mon-sg.tiktokv.com/monitor/collect/", "https://mon-sg.tiktokv.com/monitor/collect/", "https://mon-sg.tiktokv.com/monitor/collect/")));
                if (!e.f61199e) {
                    com.ss.android.ttve.monitor.c.a(applicationContext, str2, null, null);
                    e.f61197c = true;
                } else if (!e.f61197c && e.f61196b == null) {
                    Thread thread = new Thread(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d6: CONSTRUCTOR  (r1v5 'thread' java.lang.Thread) = 
                          (wrap: com.ss.android.ttve.monitor.e$1 : 0x00d3: CONSTRUCTOR  (r0v37 com.ss.android.ttve.monitor.e$1) = (r4v3 'applicationContext' android.content.Context), (r5v1 'str2' java.lang.String) call: com.ss.android.ttve.monitor.e.1.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR)
                         call: java.lang.Thread.<init>(java.lang.Runnable):void type: CONSTRUCTOR in method: com.ss.android.vesdk.ba.a(android.content.Context, java.lang.String):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d3: CONSTRUCTOR  (r0v37 com.ss.android.ttve.monitor.e$1) = (r4v3 'applicationContext' android.content.Context), (r5v1 'str2' java.lang.String) call: com.ss.android.ttve.monitor.e.1.<init>(android.content.Context, java.lang.String):void type: CONSTRUCTOR in method: com.ss.android.vesdk.ba.a(android.content.Context, java.lang.String):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 31 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ttve.monitor.e, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 37 more
                        */
                    /*
                    // Method dump skipped, instructions count: 300
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.ba.a(android.content.Context, java.lang.String):void");
                }

                public static void a(am amVar, boolean z) {
                    MethodCollector.i(13777);
                    com.ss.android.ttve.log.a.f61101a = amVar;
                    TELog2ClientInvoker.nativeInit();
                    TELog2ClientInvoker.nativeSetIsToLogcat(false);
                    MethodCollector.o(13777);
                }
            }
