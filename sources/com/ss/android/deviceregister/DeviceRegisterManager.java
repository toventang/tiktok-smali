package com.ss.android.deviceregister;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.q;
import com.ss.android.deviceregister.a.b;
import com.ss.android.deviceregister.b.c;
import com.ss.android.deviceregister.b.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceRegisterManager {
    private static volatile String sAppVersionMinor = "";
    private static volatile boolean sChildMode = false;
    private static Context sContext;
    private static String sDeviceRequestId;
    private static volatile boolean sInitGuard;
    private static boolean sInitWithActivity;
    private static volatile DeviceRegisterManager sInstance;
    private static boolean sIsLocalTest;
    private static final Object sLock = new Object();
    private final c mRegisterService;

    public interface a {
        static {
            Covode.recordClassIndex(36684);
        }

        void a(String str, String str2);

        void a(boolean z);

        void a(boolean z, boolean z2);
    }

    public static String getDeviceId() {
        return com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_AppLogLancet_getDeviceId();
    }

    public static String getInstallId() {
        return com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId();
    }

    public static void getSSIDs(Map map) {
        com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_AppLogLancet_getSSIDs(map);
    }

    public static void init(Context context, boolean z) {
        com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_init(context, z);
    }

    public static void setUseGoogleAdId(boolean z) {
    }

    public static String getAppVersionMinor() {
        return sAppVersionMinor;
    }

    public static boolean hasInit() {
        return sInitGuard;
    }

    public static boolean isChildMode() {
        return sChildMode;
    }

    public static boolean isLocalTest() {
        return sIsLocalTest;
    }

    public static void onPause() {
        d.p = System.currentTimeMillis();
    }

    public static void onResume() {
        d.p = System.currentTimeMillis();
    }

    private void tryUpdateDeviceId() {
        c cVar = this.mRegisterService;
        if (cVar != null) {
            cVar.d();
        }
    }

    public static String DeviceRegisterManager__getInstallId$___twin___() {
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (deviceRegisterManager == null) {
            return "";
        }
        String str = deviceRegisterManager.mRegisterService.t;
        Logger.debug();
        return str;
    }

    static {
        Covode.recordClassIndex(36683);
    }

    public static String DeviceRegisterManager__getDeviceId$___twin___() {
        String str;
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (deviceRegisterManager != null) {
            str = deviceRegisterManager.mRegisterService.a();
        } else {
            str = "";
        }
        Logger.debug();
        return str;
    }

    public static String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_AppLogLancet_getDeviceId() {
        Context a2;
        if (com.ss.android.ugc.aweme.lancet.a.f107165c || (a2 = com.bytedance.ies.ugc.appcontext.d.a()) == null) {
            return DeviceRegisterManager__getDeviceId$___twin___();
        }
        return com.ss.android.ugc.aweme.bf.d.a(a2, com.ss.android.deviceregister.a.a.f59402a, 0).getString("device_id", "");
    }

    public static String com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_getInstallId() {
        Context a2;
        if (com.ss.android.ugc.aweme.lancet.a.c.f107175a || (a2 = com.bytedance.ies.ugc.appcontext.d.a()) == null) {
            return DeviceRegisterManager__getInstallId$___twin___();
        }
        return com.ss.android.ugc.aweme.bf.d.a(a2, com.ss.android.deviceregister.a.a.f59402a, 0).getString("install_id", "");
    }

    public static String getClientUDID() {
        String str;
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (deviceRegisterManager != null) {
            str = deviceRegisterManager.mRegisterService.c();
        } else {
            str = "";
        }
        Logger.debug();
        return str;
    }

    public static String getClientUDIDWithBackup() {
        Context context;
        if (sInstance != null || (context = sContext) == null) {
            return getClientUDID();
        }
        return com.ss.android.ugc.aweme.bf.d.a(context, com.ss.android.deviceregister.a.a.f59402a, 0).getString("clientudid", null);
    }

    public static String getDeviceIdWithBackup() {
        Context context;
        if (sInstance != null || (context = sContext) == null) {
            return getDeviceId();
        }
        return com.ss.android.ugc.aweme.bf.d.a(context, com.ss.android.deviceregister.a.a.f59402a, 0).getString("device_id", "");
    }

    public static String getInstallIdWithBackup() {
        Context context;
        if (sInstance != null || (context = sContext) == null) {
            return getInstallId();
        }
        return com.ss.android.ugc.aweme.bf.d.a(context, com.ss.android.deviceregister.a.a.f59402a, 0).getString("install_id", null);
    }

    public static String getOpenIdWithBackup() {
        Context context;
        if (sInstance != null || (context = sContext) == null) {
            return getOpenUdId();
        }
        return com.ss.android.ugc.aweme.bf.d.a(context, com.ss.android.deviceregister.a.a.f59402a, 0).getString("openudid", null);
    }

    public static String getOpenUdId() {
        String str;
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (deviceRegisterManager != null) {
            str = deviceRegisterManager.mRegisterService.b();
        } else {
            str = "";
        }
        Logger.debug();
        return str;
    }

    public static void updateDeviceInfo() {
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (deviceRegisterManager != null) {
            c cVar = deviceRegisterManager.mRegisterService;
            if (cVar.w != null) {
                cVar.w.a();
            }
            Logger.debug();
        }
    }

    public void stop() {
        MethodCollector.i(3858);
        c cVar = this.mRegisterService;
        synchronized (cVar.f59443e) {
            try {
                d.u = true;
                cVar.f59443e.notifyAll();
            } finally {
                MethodCollector.o(3858);
            }
        }
    }

    public static String getRequestId() {
        MethodCollector.i(3878);
        if (TextUtils.isEmpty(sDeviceRequestId)) {
            synchronized (sLock) {
                try {
                    if (TextUtils.isEmpty(sDeviceRequestId)) {
                        sDeviceRequestId = UUID.randomUUID().toString();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3878);
                    throw th;
                }
            }
        }
        String str = sDeviceRequestId;
        MethodCollector.o(3878);
        return str;
    }

    public static void tryWaitDeviceIdInit() {
        MethodCollector.i(3871);
        Context context = sContext;
        if (d.z.get() != null || !m.a(d.a(context))) {
            MethodCollector.o(3871);
            return;
        }
        synchronized (d.f59436b) {
            try {
                if (!d.f59440g) {
                    if (!m.a(d.a(context))) {
                        MethodCollector.o(3871);
                        return;
                    }
                    long j2 = 1500;
                    if (d.f59441h) {
                        j2 = 4000;
                    }
                    try {
                        d.f59436b.wait(j2);
                    } catch (Exception unused) {
                    }
                    d.f59440g = true;
                    MethodCollector.o(3871);
                }
            } finally {
                MethodCollector.o(3871);
            }
        }
    }

    public static void setAnonymous(boolean z) {
        com.ss.android.deviceregister.a.a.f59403b = z;
    }

    public static void setAntiCheatingSwitch(boolean z) {
        com.ss.android.deviceregister.b.a.f59422e = z;
    }

    public static void setAppId(int i2) {
        com.ss.android.deviceregister.a.d.f59409e = i2;
    }

    public static void setAppVersionMinor(String str) {
        sAppVersionMinor = str;
    }

    public static void setChannel(String str) {
        com.ss.android.deviceregister.a.d.f59405a = str;
    }

    public static void setChildModeBeforeInit(boolean z) {
        sChildMode = z;
    }

    public static void setCustomMonitor(b bVar) {
        d.f59435a = bVar;
    }

    public static void setCustomVersion(String str) {
        com.ss.android.deviceregister.a.d.f59408d = str;
    }

    public static void setInitWithActivity(boolean z) {
        sInitWithActivity = z;
    }

    public static void setLocalTest(boolean z) {
        sIsLocalTest = z;
    }

    public static void setPreInstallChannelCallback(g gVar) {
        d.f59438d = gVar;
    }

    public static void setSDKVersion(String str) {
        com.ss.android.deviceregister.a.d.f59411g = str;
    }

    public static String getSigHash(Context context) {
        return com.ss.android.deviceregister.a.d.a(context);
    }

    public static boolean isNewUserMode(Context context) {
        return c.b(context);
    }

    public static void setAppContext(com.ss.android.common.a aVar) {
        com.ss.android.deviceregister.a.d.f59406b = aVar;
        q.f59324b = aVar;
    }

    public static void setContext(Context context) {
        sContext = com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
    }

    public static void setILogDepend(com.ss.android.deviceregister.a.c cVar) {
        d.f59437c = cVar;
        com.ss.android.deviceregister.a.d.f59416l = cVar;
    }

    public static void addOnDeviceConfigUpdateListener(a aVar) {
        if (aVar != null) {
            d.y.add(new WeakReference<>(aVar));
        }
    }

    public static Context com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static boolean clearWhenSwitchChildMode(boolean z) {
        c cVar;
        sChildMode = z;
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (!hasInit() || deviceRegisterManager == null || (cVar = deviceRegisterManager.mRegisterService) == null) {
            return false;
        }
        sDeviceRequestId = null;
        cVar.a(z);
        return true;
    }

    public static void setDeviceRegisterURL(String[] strArr) {
        if (strArr != null && strArr.length > 0 && !m.a(strArr[0])) {
            com.ss.android.deviceregister.b.a.f59418a = strArr;
        }
    }

    public static void setForbidReportPhoneDetailInfo(boolean z) {
        MethodCollector.i(3868);
        com.ss.android.deviceregister.a.d.f59417m = z;
        if (com.ss.android.deviceregister.a.d.f59412h != null) {
            synchronized (com.ss.android.deviceregister.a.d.f59414j) {
            }
            MethodCollector.o(3868);
            return;
        }
        MethodCollector.o(3868);
    }

    public static void addCustomerHeaser(Bundle bundle) {
        MethodCollector.i(3780);
        if (bundle == null || bundle.size() <= 0) {
            MethodCollector.o(3780);
        } else if (bundle.size() <= 0) {
            MethodCollector.o(3780);
        } else {
            synchronized (d.f59439f) {
                try {
                    d.f59439f.putAll(bundle);
                } finally {
                    MethodCollector.o(3780);
                }
            }
        }
    }

    public static void DeviceRegisterManager__getSSIDs$___twin___(Map<String, String> map) {
        DeviceRegisterManager deviceRegisterManager = sInstance;
        if (map != null) {
            if (deviceRegisterManager != null) {
                String openUdId = getOpenUdId();
                if (openUdId != null) {
                    map.put("openudid", openUdId);
                }
                String clientUDID = getClientUDID();
                if (clientUDID != null) {
                    map.put("clientudid", clientUDID);
                }
                String installId = getInstallId();
                if (installId != null) {
                    map.put("install_id", installId);
                }
                String deviceId = getDeviceId();
                if (deviceId != null) {
                    map.put("device_id", deviceId);
                    return;
                }
                return;
            }
        } else if (deviceRegisterManager != null) {
            return;
        }
        Context context = sContext;
        if (context != null) {
            SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(context, com.ss.android.deviceregister.a.a.f59402a, 0);
            String string = a2.getString("device_id", "");
            if (!TextUtils.isEmpty(string)) {
                map.put("device_id", string);
            }
            String string2 = a2.getString("install_id", "");
            if (!TextUtils.isEmpty(string2)) {
                map.put("install_id", string2);
            }
            String string3 = com.ss.android.ugc.aweme.bf.d.a(sContext, com.ss.android.deviceregister.a.a.a(), 0).getString("openudid", null);
            if (!TextUtils.isEmpty(string3)) {
                map.put("openudid", string3);
            }
        }
    }

    public static void com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_AppLogLancet_getSSIDs(Map map) {
        Context a2;
        if (!com.ss.android.ugc.aweme.lancet.a.f107165c && (a2 = com.bytedance.ies.ugc.appcontext.d.a()) != null) {
            SharedPreferences a3 = com.ss.android.ugc.aweme.bf.d.a(a2, com.ss.android.deviceregister.a.a.f59402a, 0);
            String string = a3.getString("device_id", "");
            if (!TextUtils.isEmpty(string)) {
                map.put("device_id", string);
            }
            String string2 = a3.getString("install_id", "");
            if (!TextUtils.isEmpty(string2)) {
                map.put("install_id", string2);
            }
            String string3 = com.ss.android.ugc.aweme.bf.d.a(a2, com.ss.android.deviceregister.a.a.a(), 0).getString("openudid", null);
            if (!TextUtils.isEmpty(string3)) {
                map.put("openudid", string3);
            }
        }
        DeviceRegisterManager__getSSIDs$___twin___(map);
    }

    private DeviceRegisterManager(boolean z) {
        sChildMode = z;
        Context context = sContext;
        e eVar = new e(context);
        if (eVar.f59473d) {
            com.ss.android.deviceregister.a.a.a(context).edit().remove("google_aid").remove("gaid_limited").apply();
            com.ss.android.deviceregister.b.a.a a2 = c.a(context);
            com.ss.android.deviceregister.a.d.n = a2.c();
            a2.b("openudid");
            a2.b("clientudid");
            a2.b("udid");
            a2.b("udid_list");
            a2.b("device_id");
            clearDidAndIid(context, "clearMigrationInfo");
        }
        eVar.f59471b.setComponentEnabledSetting(eVar.f59472c, 2, 1);
        eVar.f59470a.edit().putInt("component_state", 2).apply();
        c cVar = new c(sContext, z);
        this.mRegisterService = cVar;
        com.ss.android.deviceregister.b.a.f59421d = sInitWithActivity;
        com.ss.android.deviceregister.a.d.f59415k = cVar;
        cVar.o = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences a3 = com.ss.android.deviceregister.a.a.a(cVar.f59447m);
        cVar.f59445k = a3.getInt("last_config_version", 0);
        cVar.t = a3.getString("install_id", "");
        boolean equals = TextUtils.equals(com.ss.android.deviceregister.a.d.c(cVar.f59447m), a3.getString("dr_channel", null));
        if (cVar.f59445k == com.ss.android.deviceregister.a.d.a() && equals) {
            long j2 = a3.getLong("last_config_time", 0);
            currentTimeMillis = j2 <= currentTimeMillis ? j2 : currentTimeMillis;
            boolean a4 = q.a(cVar.a());
            boolean a5 = q.a(cVar.t);
            if (!a4 && !a5) {
                cVar.q = currentTimeMillis;
            }
        }
        if (com.ss.android.deviceregister.a.d.a(cVar.f59447m, cVar.o, cVar.f59444j) || !Logger.debug()) {
            cVar.w = new d.a();
            cVar.w.start();
            Context context2 = sContext;
            com.ss.android.deviceregister.b.b.f59432a = true;
            e.a(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00fc: INVOKE  
                  (wrap: com.ss.android.deviceregister.b.b$2 : 0x00f9: CONSTRUCTOR  (r0v21 com.ss.android.deviceregister.b.b$2) = (r1v7 'context2' android.content.Context) call: com.ss.android.deviceregister.b.b.2.<init>(android.content.Context):void type: CONSTRUCTOR)
                 type: STATIC call: com.bytedance.common.utility.b.e.a(java.lang.Runnable):void in method: com.ss.android.deviceregister.DeviceRegisterManager.<init>(boolean):void, file: classes.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f9: CONSTRUCTOR  (r0v21 com.ss.android.deviceregister.b.b$2) = (r1v7 'context2' android.content.Context) call: com.ss.android.deviceregister.b.b.2.<init>(android.content.Context):void type: CONSTRUCTOR in method: com.ss.android.deviceregister.DeviceRegisterManager.<init>(boolean):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.deviceregister.b.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 266
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.deviceregister.DeviceRegisterManager.<init>(boolean):void");
        }

        public static void com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_AppLogLancet_init(Context context, boolean z) {
            DeviceRegisterManager__init$___twin___(context, z);
            com.ss.android.ugc.aweme.lancet.a.f107165c = true;
        }

        public static void com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_DeviceRegisterManagerLancet_init(Context context, boolean z) {
            com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_AppLogLancet_init(context, z);
            com.ss.android.ugc.aweme.lancet.a.c.f107175a = true;
        }

        public static void clearValue(Context context, String str) {
            com.ss.android.deviceregister.b.a.a a2 = c.a(context);
            if (a2 instanceof b) {
                ((a) a2).b(str);
            }
            sInstance.tryUpdateDeviceId();
        }

        public static void setAccount(Context context, Account account) {
            if (c.f59454a instanceof b) {
                ((a) c.f59454a).a(account);
            } else {
                c.f59455b = account;
            }
            com.ss.android.deviceregister.c.b.f59463a = account;
        }

        public static void saveAppTrack(Context context, String str) {
            DeviceRegisterManager deviceRegisterManager = sInstance;
            if (sInstance != null) {
                c cVar = deviceRegisterManager.mRegisterService;
                if (!m.a(str)) {
                    try {
                        cVar.v = str;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                try {
                    SharedPreferences.Editor edit = com.ss.android.deviceregister.a.a.a(context).edit();
                    edit.putString("app_track", str);
                    edit.commit();
                } catch (Throwable unused) {
                }
            }
        }

        public static void DeviceRegisterManager__init$___twin___(Context context, boolean z) {
            MethodCollector.i(3767);
            if (context != null) {
                sInitGuard = true;
                if (context instanceof Activity) {
                    sInitWithActivity = true;
                }
                sContext = com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
                if (sInstance == null) {
                    synchronized (DeviceRegisterManager.class) {
                        try {
                            if (sInstance == null) {
                                sInstance = new DeviceRegisterManager(z);
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(3767);
                            throw th;
                        }
                    }
                }
                Logger.debug();
                MethodCollector.o(3767);
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("context = null");
            MethodCollector.o(3767);
            throw illegalArgumentException;
        }

        public static void clearDidAndIid(Context context, String str) {
            if (sInitGuard) {
                com.ss.android.deviceregister.b.a.a a2 = c.a(context);
                if (a2 instanceof b) {
                    a aVar = (a) a2;
                    if (!TextUtils.isEmpty(str)) {
                        a.f59394d = null;
                        String concat = "clear_key_prefix".concat(String.valueOf(str));
                        SharedPreferences a3 = com.ss.android.deviceregister.a.a.a(context);
                        if (!a3.getBoolean(concat, false)) {
                            SharedPreferences.Editor edit = a3.edit();
                            edit.putBoolean(concat, true);
                            if (a3.contains("device_id")) {
                                edit.remove("device_id");
                            }
                            if (a3.contains("install_id")) {
                                edit.remove("install_id");
                            }
                            edit.apply();
                            aVar.f59399c.b("device_id");
                            Logger.debug();
                        } else {
                            Logger.debug();
                        }
                        aVar.f59399c.b("", "");
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("please init first");
        }

        public static void setNewUserMode(Context context, boolean z) {
            String str;
            if (context != null && c.a()) {
                com.ss.android.deviceregister.c.a a2 = com.ss.android.deviceregister.c.a.a(context);
                a2.f59458a = z;
                if (a2.a()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : a2.f59460c.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("is_new_user_mode", a2.f59458a);
                        jSONObject2.put("auto_mode", a2.f59459b);
                        jSONObject2.put("debug_custom_param", jSONObject.toString());
                        str = jSONObject2.toString();
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        str = "";
                    }
                    Context context2 = a2.f59461d.get();
                    String concat = "newUserModeUtil:".concat(String.valueOf(str));
                    try {
                        AccountManager accountManager = AccountManager.get(context2);
                        Account a3 = com.ss.android.deviceregister.c.b.a(context2);
                        if (accountManager == null) {
                            return;
                        }
                        if (a3 != null) {
                            accountManager.setUserData(a3, "new_user_mode_account", concat);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public static void resetDidWhenSwitchChildMode(boolean z, long j2, f fVar) {
            c cVar;
            MethodCollector.i(3884);
            sChildMode = z;
            DeviceRegisterManager deviceRegisterManager = sInstance;
            if (!hasInit() || deviceRegisterManager == null || (cVar = deviceRegisterManager.mRegisterService) == null) {
                MethodCollector.o(3884);
                return;
            }
            synchronized (cVar) {
                try {
                    cVar.f59444j = z;
                    cVar.q = 0;
                    cVar.s = 0;
                    com.ss.android.deviceregister.a.d.f59412h = null;
                    JSONObject jSONObject = new JSONObject();
                    com.ss.android.deviceregister.a.d.a(cVar.f59447m, jSONObject, cVar.f59444j);
                    cVar.o = jSONObject;
                    cVar.x = fVar;
                    cVar.d();
                } catch (Throwable th) {
                    MethodCollector.o(3884);
                    throw th;
                }
            }
            new Handler(Looper.getMainLooper()).postDelayed(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0047: INVOKE  
                  (wrap: android.os.Handler : 0x003f: CONSTRUCTOR  (r1v2 android.os.Handler) = 
                  (wrap: android.os.Looper : 0x003b: INVOKE  (r0v5 android.os.Looper) =  type: STATIC call: android.os.Looper.getMainLooper():android.os.Looper)
                 call: android.os.Handler.<init>(android.os.Looper):void type: CONSTRUCTOR)
                  (wrap: com.ss.android.deviceregister.b.d$1 : 0x0044: CONSTRUCTOR  (r0v6 com.ss.android.deviceregister.b.d$1) = (r3v0 'cVar' com.ss.android.deviceregister.b.c) call: com.ss.android.deviceregister.b.d.1.<init>(com.ss.android.deviceregister.b.d):void type: CONSTRUCTOR)
                  (r6v0 'j2' long)
                 type: VIRTUAL call: android.os.Handler.postDelayed(java.lang.Runnable, long):boolean in method: com.ss.android.deviceregister.DeviceRegisterManager.resetDidWhenSwitchChildMode(boolean, long, com.ss.android.deviceregister.f):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0044: CONSTRUCTOR  (r0v6 com.ss.android.deviceregister.b.d$1) = (r3v0 'cVar' com.ss.android.deviceregister.b.c) call: com.ss.android.deviceregister.b.d.1.<init>(com.ss.android.deviceregister.b.d):void type: CONSTRUCTOR in method: com.ss.android.deviceregister.DeviceRegisterManager.resetDidWhenSwitchChildMode(boolean, long, com.ss.android.deviceregister.f):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 18 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.deviceregister.b.d, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 24 more
                */
            /*
                r4 = 3884(0xf2c, float:5.443E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
                com.ss.android.deviceregister.DeviceRegisterManager.sChildMode = r5
                com.ss.android.deviceregister.DeviceRegisterManager r1 = com.ss.android.deviceregister.DeviceRegisterManager.sInstance
                boolean r0 = hasInit()
                if (r0 == 0) goto L_0x0015
                if (r1 == 0) goto L_0x0015
                com.ss.android.deviceregister.b.c r3 = r1.mRegisterService
                if (r3 != 0) goto L_0x0019
            L_0x0015:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                return
            L_0x0019:
                monitor-enter(r3)
                r3.f59444j = r5     // Catch:{ all -> 0x004e }
                r0 = 0
                r3.q = r0     // Catch:{ all -> 0x004e }
                r3.s = r0     // Catch:{ all -> 0x004e }
                r0 = 0
                com.ss.android.deviceregister.a.d.f59412h = r0     // Catch:{ all -> 0x004e }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x004e }
                r2.<init>()     // Catch:{ all -> 0x004e }
                android.content.Context r1 = r3.f59447m     // Catch:{ all -> 0x004e }
                boolean r0 = r3.f59444j     // Catch:{ all -> 0x004e }
                com.ss.android.deviceregister.a.d.a(r1, r2, r0)     // Catch:{ all -> 0x004e }
                r3.o = r2     // Catch:{ all -> 0x004e }
                r3.x = r8     // Catch:{ all -> 0x004e }
                r3.d()     // Catch:{ all -> 0x004e }
                monitor-exit(r3)     // Catch:{ all -> 0x004e }
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r1.<init>(r0)
                com.ss.android.deviceregister.b.d$1 r0 = new com.ss.android.deviceregister.b.d$1
                r0.<init>()
                r1.postDelayed(r0, r6)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                return
            L_0x004e:
                r0 = move-exception
                monitor-exit(r3)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.deviceregister.DeviceRegisterManager.resetDidWhenSwitchChildMode(boolean, long, com.ss.android.deviceregister.f):void");
        }
    }
