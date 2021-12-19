package com.ss.android.common.applog;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.a.a;
import com.ss.android.common.applog.b;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.legoImp.task.InitModules;
import com.ss.android.ugc.aweme.net.monitor.n;
import com.ss.android.ugc.aweme.utils.in;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLog {
    public static final String[] BASE_HEADER_KEYS = {"appkey", "openudid", "sdk_version", "package", "channel", "display_name", "app_version", "version_code", "timezone", "access", "os", "os_version", "os_api", "device_model", "device_brand", "device_manufacturer", "language", "resolution", "display_density", "density_dpi", "carrier", "mcc_mnc", "clientudid", "install_id", "device_id", "sig_hash", "aid", "push_sdk", "rom", "release_build", "update_version_code", "manifest_version_code", "app_version_minor", "cpu_abi", "app_track", "not_request_sender", "rom_version", "region", "tz_name", "tz_offset", "sim_region", "custom", "google_aid", "app_language", "app_region", "ab_sdk_version", "user_unique_id"};
    private static volatile boolean mCollectFreeSpace;
    private static volatile f mFreeSpaceCollector;
    private static boolean mHasHandledCache;
    private static volatile long mLastGetAppConfigTime;
    public static int mLaunchFrom;
    private static String sAbSDKVersion;
    private static volatile boolean sAdjustTerminate;
    private static boolean sAliyunPushInclude = true;
    private static boolean sAnonymous;
    private static com.ss.android.common.a sAppContext;
    static int sAppCount = 0;
    private static volatile boolean sChildMode;
    private static volatile com.ss.android.common.applog.a.c sChildModeWhiteEventFilter;
    private static WeakReference<e> sConfigUpdateListener = null;
    private static final Bundle sCustomBundle = new Bundle();
    static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    private static volatile com.ss.android.common.applog.a.a sEventFilter;
    private static volatile int sEventFilterEnable = 0;
    private static long sFetchActiveTime = 0;
    private static Handler sHandler = new Handler(Looper.getMainLooper());
    public static volatile boolean sHasLoadDid = false;
    private static boolean sHasManualInvokeActiveUser = false;
    private static volatile JSONObject sHeaderCopy = null;
    private static boolean sHwPushInclude = true;
    private static volatile com.service.middleware.applog.a sIHeaderCustomTimelyCallback;
    private static volatile boolean sInitGuard;
    private static boolean sInitWithActivity = false;
    private static volatile AppLog sInstance;
    private static final ThreadLocal<Boolean> sIsConfigThread = new ThreadLocal<>();
    private static boolean sIsNotRequestSender = false;
    static String sLastCreateActivityName;
    static String sLastCreateActivityNameAndTime;
    static String sLastResumeActivityName;
    static String sLastResumeActivityNameAndTime;
    private static final Object sLock = new Object();
    private static final Object sLogConfigLock = new Object();
    static g sLogEncryptCfg;
    private static boolean sMiPushInclude = true;
    private static boolean sMyPushInclude = true;
    private static boolean sMzPushInclude = true;
    public static volatile boolean sPendingActiveUser = false;
    static String sRomInfo = null;
    static final List<h> sSessionHookList = new ArrayList(2);
    static String sSessionKey = "";
    private static volatile long sStartLogReaperDelay;
    static volatile boolean sStopped = false;
    static volatile j sTraceCallback;
    static AtomicLong sUserId = new AtomicLong();
    private static String sUserUniqueId;
    private static v urlConfig;
    d mActivityRecord;
    private long mActivityTime = 0;
    private volatile boolean mAllowOldImageSample = false;
    private String mAllowPushListJsonStr = "";
    private final HashSet<Integer> mAllowPushSet = new HashSet<>();
    private long mBatchEventInterval = 60000;
    private final ConcurrentHashMap<String, String> mBlockV1 = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, String> mBlockV3 = new ConcurrentHashMap<>();
    public final Context mContext;
    private final ConcurrentHashMap<String, String> mEventTimely = new ConcurrentHashMap<>();
    private boolean mForbidReportPhoneDetailInfo;
    private final AtomicLong mGlobalEventIndexMatrix = new AtomicLong();
    private final AtomicLong mGlobalEventIndexMatrixV1 = new AtomicLong();
    private boolean mHasSetup = false;
    private boolean mHasTryResendConfig = false;
    public boolean mHasUpdateConfig;
    private final JSONObject mHeader;
    private long mHeartbeatTime = System.currentTimeMillis();
    private int mHttpMonitorPort = 0;
    private AtomicInteger mImageFailureCount = new AtomicInteger();
    private AtomicInteger mImageSuccessCount = new AtomicInteger();
    volatile boolean mInitOk;
    private int mLastConfigVersion;
    private volatile boolean mLoadingOnlineConfig = false;
    final LinkedList<l> mLogQueue = new LinkedList<>();
    volatile o mLogReaper = null;
    private volatile long mLogSettingInterval = 21600000;
    private final com.bytedance.common.utility.a mNetWorkMonitor;
    final LinkedList<a> mQueue = new LinkedList<>();
    private Random mRandom = new Random();
    private LinkedList<i> mSamples = new LinkedList<>();
    private int mSendLaunchTimely = 1;
    private p mSession;
    public long mSessionInterval = 30000;
    private boolean mSetupOk = false;
    private volatile long mStartWaitSendTimely;
    private final AtomicBoolean mStopFlag = new AtomicBoolean();
    public JSONObject mTimeSync = null;
    private volatile long mTryUpdateConfigTime = 0;
    private volatile long mUpdateConfigTime = 0;
    private int mVersionCode = 1;

    public interface e {
        static {
            Covode.recordClassIndex(36586);
        }

        void a();

        void b();
    }

    public interface f {
        static {
            Covode.recordClassIndex(36587);
        }

        JSONObject a();
    }

    public interface g {
        static {
            Covode.recordClassIndex(36588);
        }

        boolean a();

        boolean b();
    }

    public interface h {
        static {
            Covode.recordClassIndex(36589);
        }

        void a(long j2);

        void a(long j2, String str, JSONObject jSONObject);

        void b(long j2, String str, JSONObject jSONObject);
    }

    public interface j {
        static {
            Covode.recordClassIndex(36591);
        }

        void a(String str, String str2, String str3);

        void a(List<Long> list);

        void onEventExpired(List<Long> list);
    }

    static boolean getEventV3Switch() {
        return true;
    }

    public static String getInstallId() {
        return com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_getInstallId();
    }

    public static void getSSIDs(Map map) {
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs(map);
    }

    public static String getServerDeviceId() {
        return com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_getServerDeviceId();
    }

    public static String getUserId() {
        return com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId();
    }

    private void notifyOnEvent(h hVar) {
    }

    public static void onEvent(Context context, String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_onEvent(context, str, str2, str3, j2, j3, z, jSONObject);
    }

    public static void recordMiscLog(Context context, String str, JSONObject jSONObject) {
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_recordMiscLog(context, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public void onEvent(String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
        com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(this, str, str2, str3, j2, j3, z, jSONObject);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f59182a;

        /* renamed from: b  reason: collision with root package name */
        public String f59183b;

        static {
            Covode.recordClassIndex(36585);
        }

        public d() {
        }

        public d(String str, int i2) {
            this.f59183b = str;
            this.f59182a = i2;
        }
    }

    public static String getAbSDKVersion() {
        return sAbSDKVersion;
    }

    static boolean getAdjustTerminate() {
        return sAdjustTerminate;
    }

    public static int getAppId() {
        return com.ss.android.deviceregister.a.d.f59409e;
    }

    public static JSONObject getHeaderCopy() {
        return sHeaderCopy;
    }

    public static com.service.middleware.applog.a getIHeaderCustomTimelyCallback() {
        return sIHeaderCustomTimelyCallback;
    }

    public static String getSessionKey() {
        return sSessionKey;
    }

    public static String getUserUniqueId() {
        return sUserUniqueId;
    }

    public static void tryWaitDeviceInit() {
        DeviceRegisterManager.tryWaitDeviceIdInit();
    }

    static String ACTIVE_USER_URL() {
        return urlConfig.f59343d;
    }

    static String APPLOG_CONFIG_URL() {
        return urlConfig.f59341b;
    }

    static String APPLOG_CONFIG_URL_FALLBACK() {
        return urlConfig.f59346g;
    }

    static String[] APPLOG_TIMELY_URL() {
        return urlConfig.f59342c;
    }

    static String[] APPLOG_URL() {
        return urlConfig.f59340a;
    }

    public static void addAppCount() {
        sAppCount++;
    }

    public static String com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getUserId() {
        InitModules.l();
        return AppLog__getUserId$___twin___();
    }

    public static String getAppVersionMinor() {
        return DeviceRegisterManager.getAppVersionMinor();
    }

    public static String AppLog__getInstallId$___twin___() {
        if (sInstance != null) {
            return DeviceRegisterManager.getInstallId();
        }
        return null;
    }

    public static String AppLog__getServerDeviceId$___twin___() {
        if (sInstance != null) {
            return DeviceRegisterManager.getDeviceId();
        }
        return null;
    }

    public static String AppLog__getUserId$___twin___() {
        return String.valueOf(sUserId.get());
    }

    private long doGetLastActivteTime() {
        if (this.mActivityRecord != null) {
            return System.currentTimeMillis();
        }
        return this.mActivityTime;
    }

    public static long genEventIndex() {
        if (sInstance != null) {
            return sInstance.mGlobalEventIndexMatrix.getAndIncrement();
        }
        return -1;
    }

    public static String genSession() {
        return UUID.randomUUID().toString();
    }

    public static String getClientId() {
        if (sInstance != null) {
            return DeviceRegisterManager.getClientUDID();
        }
        return null;
    }

    public static int getHttpMonitorPort() {
        AppLog appLog = sInstance;
        if (appLog != null) {
            return appLog.mHttpMonitorPort;
        }
        return 0;
    }

    public static long getLastActiveTime() {
        AppLog appLog = sInstance;
        if (appLog != null) {
            return appLog.doGetLastActivteTime();
        }
        return 0;
    }

    static boolean getLogEncryptSwitch() {
        g gVar = sLogEncryptCfg;
        if (gVar != null) {
            return gVar.b();
        }
        return true;
    }

    static boolean getLogRecoverySwitch() {
        g gVar = sLogEncryptCfg;
        if (gVar != null) {
            return gVar.a();
        }
        return true;
    }

    private void loadGlobalEventIndex() {
        this.mGlobalEventIndexMatrix.set(0);
        this.mGlobalEventIndexMatrixV1.set(0);
    }

    private void notifyConfigUpdate() {
        e eVar;
        WeakReference<e> weakReference = sConfigUpdateListener;
        if (weakReference != null && (eVar = weakReference.get()) != null) {
            try {
                eVar.b();
            } catch (Exception unused) {
            }
        }
    }

    public static String com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_getInstallId() {
        Context a2;
        if (com.ss.android.ugc.aweme.lancet.a.f107165c || (a2 = com.bytedance.ies.ugc.appcontext.d.a()) == null) {
            return AppLog__getInstallId$___twin___();
        }
        return com.ss.android.ugc.aweme.bf.d.a(a2, com.ss.android.deviceregister.a.a.f59402a, 0).getString("install_id", "");
    }

    public static String com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_getServerDeviceId() {
        Context a2;
        if (com.ss.android.ugc.aweme.lancet.a.f107165c || (a2 = com.bytedance.ies.ugc.appcontext.d.a()) == null) {
            return AppLog__getServerDeviceId$___twin___();
        }
        return com.ss.android.ugc.aweme.bf.d.a(a2, com.ss.android.deviceregister.a.a.f59402a, 0).getString("device_id", "");
    }

    public static String getCurrentSessionId() {
        if (sInstance == null || sInstance.mSession == null) {
            return null;
        }
        return sInstance.mSession.f59313b;
    }

    static void resetEventIndex() {
        if (sInstance != null) {
            sInstance.mGlobalEventIndexMatrix.set(0);
            sInstance.mGlobalEventIndexMatrixV1.set(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void checkSessionEnd() {
        p pVar = this.mSession;
        if (pVar != null && !pVar.f59320i) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.mSession.f59322k && currentTimeMillis - this.mSession.f59319h >= this.mSessionInterval) {
                p pVar2 = this.mSession;
                onSessionEnd();
                this.mSession = null;
                n nVar = new n();
                nVar.f59295a = pVar2;
                enqueue(nVar);
            }
        }
    }

    public synchronized void ensureHeaderCopy() {
        MethodCollector.i(6535);
        try {
            sHeaderCopy = new JSONObject(this.mHeader, c.f59240a);
            MethodCollector.o(6535);
        } catch (JSONException e2) {
            e2.printStackTrace();
            MethodCollector.o(6535);
        }
    }

    /* access modifiers changed from: package-private */
    public void sendHeartbeat() {
        MethodCollector.i(6320);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.mHeartbeatTime > 60000) {
            this.mHeartbeatTime = currentTimeMillis;
            synchronized (this.mLogQueue) {
                try {
                    this.mLogQueue.notify();
                } finally {
                    MethodCollector.o(6320);
                }
            }
            return;
        }
        MethodCollector.o(6320);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.common.applog.AppLog$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59148a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ae */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00ba */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 211
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.AnonymousClass2.<clinit>():void");
        }
    }

    class c extends Thread implements DeviceRegisterManager.a {

        /* renamed from: b  reason: collision with root package name */
        private boolean f59181b;

        static {
            Covode.recordClassIndex(36584);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
            if (r6.f59180a.mQueue.isEmpty() == false) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
            if (r3 == null) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
            r6.f59180a.processItem(r3);
            r6.f59181b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
            if (r6.f59181b == false) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
            r6.f59181b = false;
            r6.f59180a.checkSessionEnd();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 145
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.c.run():void");
        }

        public c() {
            super("ActionReaper");
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z) {
            AppLog.sHasLoadDid = true;
            if (AppLog.sPendingActiveUser) {
                AppLog.activeUserInvokeInternal(AppLog.this.mContext);
            }
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z, boolean z2) {
            if (AppLog.this.mHasUpdateConfig) {
                AppLog.this.mHasUpdateConfig = false;
            } else if (z) {
                AppLog.this.tryUpdateConfig(false, true, z2);
            }
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(String str, String str2) {
            a aVar = new a(b.DEVICE_ID_UPDATE);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_id", str);
                jSONObject.put("install_id", str2);
                aVar.f59163b = jSONObject;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            AppLog.this.enqueue(aVar);
            AppLog.this.mHasUpdateConfig = true;
        }
    }

    static {
        Covode.recordClassIndex(36571);
    }

    /* access modifiers changed from: package-private */
    public void loadSSIDs() {
        MethodCollector.i(6699);
        try {
            com.ss.android.common.a aVar = sAppContext;
            if (aVar != null) {
                this.mVersionCode = aVar.i();
            }
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(this.mContext, com.ss.android.deviceregister.a.a.f59402a, 0);
            int i2 = a2.getInt("app_log_last_config_version", 0);
            this.mLastConfigVersion = i2;
            if (i2 == this.mVersionCode) {
                long j2 = a2.getLong("app_log_last_config_time", 0);
                if (j2 <= currentTimeMillis) {
                    currentTimeMillis = j2;
                }
                this.mUpdateConfigTime = currentTimeMillis;
            }
            try {
                String string = a2.getString("allow_push_list", null);
                this.mAllowPushListJsonStr = string;
                if (string != null) {
                    synchronized (sLock) {
                        try {
                            parseIntSet(this.mAllowPushSet, new JSONArray(string));
                        } catch (Throwable th) {
                            MethodCollector.o(6699);
                            throw th;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            this.mAllowOldImageSample = a2.getBoolean("allow_old_image_sample", false);
            try {
                String string2 = a2.getString("real_time_events", null);
                if (!m.a(string2)) {
                    JSONArray jSONArray = new JSONArray(string2);
                    if (jSONArray.length() > 0) {
                        int length = jSONArray.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            String string3 = jSONArray.getString(i3);
                            if (!m.a(string3)) {
                                this.mEventTimely.put(string3, "timely");
                            }
                        }
                    }
                }
                MethodCollector.o(6699);
            } catch (Throwable unused2) {
                MethodCollector.o(6699);
            }
        } catch (Exception unused3) {
            MethodCollector.o(6699);
        }
    }

    /* access modifiers changed from: package-private */
    public void onSessionEnd() {
        p pVar = this.mSession;
        if (pVar != null) {
            d a2 = d.a(this.mContext);
            int i2 = 0;
            int andSet = this.mImageSuccessCount.getAndSet(0);
            int andSet2 = this.mImageFailureCount.getAndSet(0);
            if (pVar.f59312a > 0) {
                if (andSet > 0 || andSet2 > 0) {
                    h hVar = new h();
                    hVar.f59272b = "image";
                    hVar.f59273c = "stats";
                    hVar.f59275e = (long) andSet;
                    hVar.f59276f = (long) andSet2;
                    hVar.f59278h = pVar.f59319h;
                    hVar.f59279i = pVar.f59312a;
                    a2.a(hVar);
                }
                if (!this.mAllowOldImageSample) {
                    this.mSamples.clear();
                }
                Iterator<i> it = this.mSamples.iterator();
                while (it.hasNext()) {
                    i next = it.next();
                    h hVar2 = new h();
                    hVar2.f59272b = "image";
                    hVar2.f59273c = "sample";
                    hVar2.f59274d = next.f59184a;
                    hVar2.f59275e = (long) next.f59185b;
                    hVar2.f59276f = next.f59186c;
                    hVar2.f59278h = next.f59187d;
                    hVar2.f59279i = pVar.f59312a;
                    a2.a(hVar2);
                    i2++;
                    if (i2 >= 5) {
                        break;
                    }
                }
            }
            this.mSamples.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public enum b {
        PAGE_START(0),
        PAGE_END(1),
        EVENT(2),
        IMAGE_SAMPLE(3),
        CONFIG_UPDATE(4),
        API_SAMPLE(5),
        UA_UPDATE(6),
        SAVE_ANR_TAG(7),
        SAVE_DNS_REPORT(8),
        SAVE_MISC_LOG(9),
        DEVICE_ID_UPDATE(10),
        CUSTOMER_HEADER_UPDATE(11),
        UPDATE_GOOGLE_AID(12),
        UPDATE_APP_LANGUAGE_REGION(13),
        CLEAR_WHEN_SWITCH_CHILD_MODE(14),
        RESET_WHEN_SWITCH_CHILD_MODE(15),
        DELAY_START_LOG_REAPER(16);
        
        final int nativeInt;

        static {
            Covode.recordClassIndex(36583);
        }

        private b(int i2) {
            this.nativeInt = i2;
        }
    }

    public boolean setupLogReaper() {
        MethodCollector.i(6777);
        try {
            Context context = this.mContext;
            boolean z = this.mForbidReportPhoneDetailInfo;
            AnonymousClass9 r3 = new com.ss.android.deviceregister.a.c() {
                /* class com.ss.android.common.applog.AppLog.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(36581);
                }

                @Override // com.ss.android.deviceregister.a.c
                public final void a(String str, JSONObject jSONObject) {
                    com.ss.android.common.c.a.a(str, jSONObject);
                }
            };
            boolean z2 = sAnonymous;
            boolean z3 = sInitWithActivity;
            boolean z4 = sChildMode;
            DeviceRegisterManager.setForbidReportPhoneDetailInfo(z);
            DeviceRegisterManager.setILogDepend(r3);
            DeviceRegisterManager.setAnonymous(z2);
            DeviceRegisterManager.setInitWithActivity(z3);
            DeviceRegisterManager.init(context, z4);
        } catch (Exception e2) {
            try {
                e2.printStackTrace();
                if (Logger.debug()) {
                    MethodCollector.o(6777);
                    throw e2;
                }
            } catch (Exception unused) {
                MethodCollector.o(6777);
                return false;
            }
        }
        this.mInitOk = initHeader(this.mHeader, this.mContext);
        p b2 = d.a(this.mContext).b(0);
        this.mSession = b2;
        loadStats(b2);
        notifyConfigUpdate();
        if (this.mSession != null) {
            k kVar = new k();
            kVar.f59293a = this.mSession.f59312a;
            enqueue(kVar);
        }
        try {
            Bundle bundle = new Bundle();
            Bundle bundle2 = sCustomBundle;
            synchronized (bundle2) {
                try {
                    bundle.putAll(bundle2);
                } catch (Throwable th) {
                    MethodCollector.o(6777);
                    throw th;
                }
            }
            if (bundle.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str));
                }
                this.mHeader.put("custom", jSONObject);
            }
        } catch (Throwable unused2) {
        }
        this.mLogReaper = new o(this.mContext, new JSONObject(this.mHeader, c.f59240a), this.mLogQueue, this.mStopFlag, sSessionHookList, this.mSession, this.mBlockV1, this.mBlockV3);
        this.mLogReaper.a(this.mBatchEventInterval);
        this.mLogReaper.f59299a = this.mSendLaunchTimely;
        if (sStartLogReaperDelay > 0) {
            t.a().b(new Runnable() {
                /* class com.ss.android.common.applog.AppLog.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(36573);
                }

                public final void run() {
                    AppLog.this.enqueue(new a(b.DELAY_START_LOG_REAPER));
                }
            }, sStartLogReaperDelay);
        } else {
            this.mLogReaper.start();
        }
        if (sEventFilterEnable > 0) {
            if (this.mLastConfigVersion == this.mVersionCode) {
                sEventFilter = com.ss.android.common.applog.a.a.a(this.mContext);
            } else {
                this.mUpdateConfigTime = 0;
                sEventFilter = com.ss.android.common.applog.a.a.a(this.mContext, (JSONObject) null);
            }
        }
        MethodCollector.o(6777);
        return true;
    }

    public static void registerHeaderCustomCallback(com.service.middleware.applog.a aVar) {
        sIHeaderCustomTimelyCallback = aVar;
    }

    public static void registerLogRequestCallback(j jVar) {
        sTraceCallback = jVar;
    }

    public static void setAbSDKVersion(String str) {
        sAbSDKVersion = str;
    }

    public static void setAliYunHanlder(g gVar) {
        q.f59327e = gVar;
    }

    public static void setAppId(int i2) {
        DeviceRegisterManager.setAppId(i2);
    }

    private static void setDeviceRegisterURL(String[] strArr) {
        DeviceRegisterManager.setDeviceRegisterURL(strArr);
    }

    public static void setIsNotRequestSender(boolean z) {
        sIsNotRequestSender = z;
    }

    public static void setLogEncryptConfig(g gVar) {
        sLogEncryptCfg = gVar;
    }

    public static void setReleaseBuild(String str) {
        com.ss.android.deviceregister.a.d.f59410f = str;
    }

    public static void setSessionKey(String str) {
        sSessionKey = str;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final b f59162a;

        /* renamed from: b  reason: collision with root package name */
        public Object f59163b;

        /* renamed from: c  reason: collision with root package name */
        public long f59164c;

        /* renamed from: d  reason: collision with root package name */
        public String f59165d;

        /* renamed from: e  reason: collision with root package name */
        public CountDownLatch f59166e;

        static {
            Covode.recordClassIndex(36582);
        }

        public a(b bVar) {
            this.f59162a = bVar;
        }
    }

    public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs(Map map) {
        InitModules.l();
        AppLog__getSSIDs$___twin___(map);
    }

    private void handleConfigUpdate(JSONObject jSONObject) {
        WeakReference<e> weakReference = sConfigUpdateListener;
        if (weakReference != null) {
            weakReference.get();
        }
    }

    public static boolean isBadDeviceId(String str) {
        return q.a(str);
    }

    private void saveAppTrack(String str) {
        DeviceRegisterManager.saveAppTrack(this.mContext, str);
    }

    public static void setAppContext(com.ss.android.common.a aVar) {
        sAppContext = aVar;
        DeviceRegisterManager.setAppContext(aVar);
    }

    public static void setChildModeBeforeInit(boolean z) {
        sChildMode = z;
        DeviceRegisterManager.setChildModeBeforeInit(z);
    }

    public static void activeUser(Context context) {
        sHasManualInvokeActiveUser = true;
        activeUserInvokeInternal(com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context));
    }

    public static void clearWhenSwitchChildMode(boolean z) {
        clearOrResetWhenSwitchChildMode(z, b.CLEAR_WHEN_SWITCH_CHILD_MODE, 0, null);
    }

    public static boolean com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable(Context context) {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public static Context com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    static String formatDate(long j2) {
        return sDateFormat.format(new Date(j2));
    }

    private void notifyRemoteConfigUpdate(boolean z) {
        e eVar;
        WeakReference<e> weakReference = sConfigUpdateListener;
        if (weakReference != null && (eVar = weakReference.get()) != null) {
            try {
                eVar.a();
            } catch (Exception unused) {
            }
        }
    }

    public static void setChannel(String str) {
        if (!sInitGuard) {
            DeviceRegisterManager.setChannel(str);
            return;
        }
        throw new IllegalStateException("please call before init");
    }

    public static void setConfigUpdateListener(e eVar) {
        if (eVar == null) {
            sConfigUpdateListener = null;
        } else {
            sConfigUpdateListener = new WeakReference<>(eVar);
        }
    }

    public static void setStartLogReaperDelay(long j2) {
        if (j2 > 0) {
            sStartLogReaperDelay = j2;
        }
    }

    public static void setUseGoogleAdId(boolean z) {
        if (!sInitGuard) {
            DeviceRegisterManager.setUseGoogleAdId(z);
            return;
        }
        throw new IllegalStateException("please call before init");
    }

    public static void setUserId(long j2) {
        sUserId.set(j2);
        AppLog appLog = sInstance;
        if (appLog != null) {
            appLog.notifyConfigUpdate();
        }
    }

    static void tryReportEventDiscard(final int i2) {
        runOnUIThread(new Runnable() {
            /* class com.ss.android.common.applog.AppLog.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36572);
            }

            public final void run() {
            }
        });
    }

    static void tryReportLogExpired(final List<Long> list) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            runOnUIThread(new Runnable() {
                /* class com.ss.android.common.applog.AppLog.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(36576);
                }

                public final void run() {
                    j jVar = AppLog.sTraceCallback;
                    if (jVar != null) {
                        jVar.onEventExpired(list);
                    }
                }
            });
        }
    }

    static void tryReportTerminateLost(final List<String> list) {
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            runOnUIThread(new Runnable() {
                /* class com.ss.android.common.applog.AppLog.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(36577);
                }

                public final void run() {
                    j jVar = AppLog.sTraceCallback;
                    if (jVar != null) {
                        for (String str : list) {
                            jVar.a("terminate", str, "");
                        }
                    }
                }
            });
        }
    }

    private static void appendParamsToEvent(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.has("ab_sdk_version") && !TextUtils.isEmpty(sAbSDKVersion)) {
            try {
                jSONObject.put("ab_sdk_version", sAbSDKVersion);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_isNetworkAvailable(Context context) {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable = com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable(context);
        com.ss.android.ugc.aweme.lancet.j.f107226e = com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable;
        return com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailable;
    }

    private void initDataFromSp(Context context) {
        loadSSIDs();
        loadGlobalEventIndex();
        boolean z = false;
        if (com.ss.android.ugc.aweme.bf.d.a(this.mContext, com.ss.android.deviceregister.a.a.f59402a, 0).getInt("forbid_report_phone_detail_info", 0) > 0) {
            z = true;
        }
        this.mForbidReportPhoneDetailInfo = z;
    }

    public static void onPause(Context context) {
        if (context instanceof Activity) {
            onPause(context, context.getClass().getName(), context.hashCode());
        }
    }

    public static void onResume(Context context) {
        if (context instanceof Activity) {
            onResume(context, context.getClass().getName(), context.hashCode());
        }
        if (!sHasManualInvokeActiveUser) {
            activeUserInvokeInternal(com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context));
        }
    }

    private static void runOnUIThread(Runnable runnable) {
        if (runnable != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                sHandler.post(runnable);
            }
        }
    }

    static void tryPutEventIndex(JSONObject jSONObject) {
        if (sInstance != null) {
            try {
                jSONObject.put("tea_event_index", sInstance.mGlobalEventIndexMatrix.getAndIncrement());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void updateAppLanguageAndRegion(JSONObject jSONObject) {
        String optString = jSONObject.optString("app_language", null);
        String optString2 = jSONObject.optString("app_region", null);
        if (updateAppLanguage(optString) || updateAppRegion(optString2)) {
            DeviceRegisterManager.updateDeviceInfo();
        }
    }

    /* access modifiers changed from: package-private */
    public void addCustomerHeader(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putAll(bundle);
            a aVar = new a(b.CUSTOMER_HEADER_UPDATE);
            aVar.f59163b = bundle2;
            enqueue(aVar);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void doSaveDnsReportTime(long j2) {
        SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(this.mContext, com.ss.android.deviceregister.a.a.f59402a, 0).edit();
        edit.putLong("dns_report_time", j2);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public void handleImageSample(i iVar) {
        if (this.mSamples.size() >= 5) {
            this.mSamples.removeFirst();
        }
        this.mSamples.add(iVar);
    }

    /* access modifiers changed from: package-private */
    public void onActivityResume(d dVar) {
        if (this.mInitOk && dVar != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.mActivityTime = currentTimeMillis;
            this.mActivityRecord = dVar;
            Logger.debug();
            a aVar = new a(b.PAGE_START);
            aVar.f59164c = currentTimeMillis;
            enqueue(aVar);
        }
    }

    public static void AppLog__getSSIDs$___twin___(Map<String, String> map) {
        AppLog appLog;
        MethodCollector.i(5980);
        synchronized (sLock) {
            try {
                if (!sStopped) {
                    appLog = sInstance;
                } else {
                    appLog = null;
                }
            } finally {
                MethodCollector.o(5980);
            }
        }
        if (appLog == null) {
            MethodCollector.o(5980);
            return;
        }
        DeviceRegisterManager.getSSIDs(map);
        String valueOf = String.valueOf(sUserId.get());
        if (valueOf != null) {
            map.put("user_id", valueOf);
        }
    }

    public static void addSessionHook(h hVar) {
        MethodCollector.i(6038);
        if (hVar == null) {
            MethodCollector.o(6038);
            return;
        }
        List<h> list = sSessionHookList;
        synchronized (list) {
            try {
                if (!list.contains(hVar)) {
                    list.add(hVar);
                    MethodCollector.o(6038);
                }
            } finally {
                MethodCollector.o(6038);
            }
        }
    }

    private void notifySessionStart(long j2) {
        MethodCollector.i(6470);
        List<h> list = sSessionHookList;
        if (list == null) {
            MethodCollector.o(6470);
            return;
        }
        synchronized (list) {
            try {
                for (h hVar : list) {
                    hVar.a(j2);
                }
            } finally {
                MethodCollector.o(6470);
            }
        }
    }

    public static void onActivityCreate(Context context) {
        if (context instanceof Activity) {
            sLastCreateActivityName = context.getClass().getName();
            sLastCreateActivityNameAndTime = sLastCreateActivityName + "(" + String.valueOf(System.currentTimeMillis()) + ")";
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setAppTrack(org.json.JSONObject r5) {
        /*
            r4 = 5915(0x171b, float:8.289E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            com.ss.android.common.applog.AppLog r3 = com.ss.android.common.applog.AppLog.sInstance
            if (r3 == 0) goto L_0x002e
            java.lang.Object r2 = com.ss.android.common.applog.AppLog.sLock
            monitor-enter(r2)
            if (r5 != 0) goto L_0x0013
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0013:
            org.json.JSONObject r1 = r3.mHeader     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "app_track"
            r1.put(r0, r5)     // Catch:{ all -> 0x0023 }
        L_0x001c:
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0023 }
            r3.saveAppTrack(r0)     // Catch:{ all -> 0x0023 }
        L_0x0023:
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0028:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        L_0x002e:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.setAppTrack(org.json.JSONObject):void");
    }

    public static void setCustomerHeader(Bundle bundle) {
        MethodCollector.i(5982);
        if (bundle != null) {
            try {
                if (bundle.size() > 0) {
                    AppLog appLog = sInstance;
                    if (appLog != null) {
                        appLog.addCustomerHeader(bundle);
                    } else {
                        Bundle bundle2 = sCustomBundle;
                        synchronized (bundle2) {
                            try {
                                bundle2.putAll(bundle);
                            } catch (Throwable th) {
                                MethodCollector.o(5982);
                                throw th;
                            }
                        }
                    }
                    DeviceRegisterManager.addCustomerHeaser(bundle);
                    MethodCollector.o(5982);
                    return;
                }
            } catch (Throwable unused) {
                MethodCollector.o(5982);
                return;
            }
        }
        MethodCollector.o(5982);
    }

    public static void setGoogleAId(String str) {
        if (!m.a(str)) {
            if (!m.a(str) && !str.equals(com.ss.android.b.f59121a)) {
                com.ss.android.b.f59121a = str;
            }
            AppLog appLog = sInstance;
            if (appLog != null) {
                a aVar = new a(b.UPDATE_GOOGLE_AID);
                aVar.f59163b = str;
                appLog.enqueue(aVar);
            }
        }
    }

    public static void setWhiteEventFilterForChildMode(List<String> list) {
        com.ss.android.common.applog.a.c cVar;
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                cVar = new com.ss.android.common.applog.a.c(hashSet);
                sChildModeWhiteEventFilter = cVar;
            }
        }
        cVar = null;
        sChildModeWhiteEventFilter = cVar;
    }

    /* access modifiers changed from: package-private */
    public void enqueue(a aVar) {
        MethodCollector.i(6264);
        if (aVar == null) {
            MethodCollector.o(6264);
            return;
        }
        synchronized (this.mQueue) {
            try {
                if (!sStopped) {
                    if (this.mQueue.size() >= 2000) {
                        this.mQueue.poll();
                    }
                    this.mQueue.add(aVar);
                    this.mQueue.notify();
                    MethodCollector.o(6264);
                }
            } finally {
                MethodCollector.o(6264);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateUserAgentString(String str) {
        Context context = this.mContext;
        if (!m.a(str) && !str.equals(com.ss.android.deviceregister.a.d.f59413i)) {
            com.ss.android.deviceregister.a.d.f59413i = str;
            SharedPreferences.Editor edit = com.ss.android.deviceregister.a.a.a(context).edit();
            edit.putString("user_agent", str);
            edit.commit();
        }
    }

    public static void activeUserInvokeInternal(Context context) {
        MethodCollector.i(6782);
        if (!sHasLoadDid) {
            synchronized (AppLog.class) {
                try {
                    if (!sHasLoadDid) {
                        sPendingActiveUser = true;
                        return;
                    }
                } finally {
                    MethodCollector.o(6782);
                }
            }
        }
        sPendingActiveUser = false;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sFetchActiveTime < 900000 || !com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_isNetworkAvailable(context)) {
            MethodCollector.o(6782);
            return;
        }
        sFetchActiveTime = currentTimeMillis;
        new a.C1291a(context, ACTIVE_USER_URL(), sChildMode).start();
        MethodCollector.o(6782);
    }

    private void doClearWhenSwitchChildMode(boolean z) {
        boolean z2;
        DeviceRegisterManager.clearWhenSwitchChildMode(z);
        if (z) {
            this.mHeader.remove("openudid");
            this.mHeader.remove("google_aid");
            this.mHeader.remove("device_id");
            this.mHeader.remove("install_id");
        }
        updateHeader(this.mContext, z);
        d.a(this.mContext).b();
        p pVar = this.mSession;
        if (pVar != null) {
            z2 = pVar.f59320i;
        } else {
            z2 = true;
        }
        this.mSession = null;
        tryExtendSession(System.currentTimeMillis(), z2);
    }

    public static AppLog getInstance(Context context) {
        MethodCollector.i(6209);
        if (sInitGuard || !Logger.debug()) {
            synchronized (sLock) {
                try {
                    if (sStopped) {
                        return null;
                    }
                    if (sInstance == null) {
                        sInstance = new AppLog(context);
                        Logger.debug();
                    }
                    AppLog appLog = sInstance;
                    MethodCollector.o(6209);
                    return appLog;
                } finally {
                    MethodCollector.o(6209);
                }
            }
        } else {
            RuntimeException runtimeException = new RuntimeException("please call after init");
            MethodCollector.o(6209);
            throw runtimeException;
        }
    }

    private boolean updateAppLanguage(String str) {
        if (m.a(str)) {
            return false;
        }
        try {
            if (!str.equals(this.mHeader.optString("app_language", null))) {
                this.mHeader.put("app_language", str);
                if (this.mLogReaper != null) {
                    this.mLogReaper.a(new JSONObject(this.mHeader, c.f59240a));
                }
                com.ss.android.ugc.aweme.bf.d.a(this.mContext, com.ss.android.deviceregister.a.a.f59402a, 0).edit().putString("app_language", str).commit();
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean updateAppRegion(String str) {
        if (m.a(str)) {
            return false;
        }
        try {
            if (!str.equals(this.mHeader.optString("app_region", null))) {
                this.mHeader.put("app_region", str);
                if (this.mLogReaper != null) {
                    this.mLogReaper.a(new JSONObject(this.mHeader, c.f59240a));
                }
                com.ss.android.ugc.aweme.bf.d.a(this.mContext, com.ss.android.deviceregister.a.a.f59402a, 0).edit().putString("app_region", str).commit();
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void updateCustomerHeader(Bundle bundle) {
        if (bundle != null && bundle.size() > 0 && this.mLogReaper != null) {
            try {
                JSONObject optJSONObject = this.mHeader.optJSONObject("custom");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                for (String str : bundle.keySet()) {
                    optJSONObject.put(str, com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str));
                }
                this.mHeader.put("custom", optJSONObject);
                if (this.mLogReaper != null) {
                    this.mLogReaper.a(new JSONObject(this.mHeader, c.f59240a));
                }
                ensureHeaderCopy();
            } catch (Throwable unused) {
            }
        }
    }

    private void updateDid(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean isBadDeviceId = isBadDeviceId(this.mHeader.optString("device_id", null));
            String optString = jSONObject.optString("device_id", null);
            String optString2 = jSONObject.optString("install_id", null);
            if (!m.a(optString)) {
                try {
                    this.mHeader.put("device_id", optString);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            if (!m.a(optString2)) {
                try {
                    this.mHeader.put("install_id", optString2);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
            if (this.mLogReaper != null) {
                try {
                    this.mLogReaper.a(new JSONObject(this.mHeader, c.f59240a));
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
            ensureHeaderCopy();
            tryUpdateConfig(true, true, isBadDeviceId);
        }
    }

    private void updateGoogleAID(String str) {
        if (!m.a(str) && this.mLogReaper != null) {
            try {
                if (!str.equals(this.mHeader.optString("google_aid", null))) {
                    if (!sChildMode) {
                        this.mHeader.put("google_aid", str);
                        if (this.mLogReaper != null) {
                            this.mLogReaper.a(new JSONObject(this.mHeader, c.f59240a));
                        }
                    }
                    com.ss.android.ugc.aweme.bf.d.a(this.mContext, com.ss.android.deviceregister.a.a.f59402a, 0).edit().putString("google_aid", str).commit();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void enqueue(l lVar) {
        MethodCollector.i(6267);
        if (lVar == null) {
            MethodCollector.o(6267);
            return;
        }
        this.mHeartbeatTime = System.currentTimeMillis();
        synchronized (this.mLogQueue) {
            try {
                if (this.mLogQueue.size() >= 2000) {
                    this.mLogQueue.poll();
                }
                this.mLogQueue.add(lVar);
                this.mLogQueue.notify();
            } finally {
                MethodCollector.o(6267);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void handleEvent(h hVar) {
        notifyOnEvent(hVar);
        boolean z = true;
        tryExtendSession(hVar.f59278h, true);
        if (this.mSession == null) {
            tryReportEventDiscard(4);
            return;
        }
        if ("event_v3".equalsIgnoreCase(hVar.f59272b)) {
            hVar.f59283m = this.mGlobalEventIndexMatrix.getAndIncrement();
        } else {
            hVar.f59283m = this.mGlobalEventIndexMatrixV1.getAndIncrement();
        }
        hVar.f59279i = this.mSession.f59312a;
        if (!handleEventTimely(hVar)) {
            long a2 = d.a(this.mContext).a(hVar);
            if (a2 > 0) {
                hVar.f59271a = a2;
                sendHeartbeat();
            }
            if (a2 <= 0) {
                z = false;
            }
            tryReportEventInsertResult(z, hVar.f59283m);
        }
    }

    /* access modifiers changed from: package-private */
    public void onActivityPause(d dVar) {
        if (this.mInitOk && dVar != null) {
            String str = dVar.f59183b;
            long currentTimeMillis = System.currentTimeMillis();
            d dVar2 = this.mActivityRecord;
            if (dVar2 == null || dVar2.f59182a != dVar.f59182a) {
                this.mActivityTime = currentTimeMillis - 1010;
            }
            this.mActivityRecord = null;
            int i2 = (int) ((currentTimeMillis - this.mActivityTime) / 1000);
            if (i2 <= 0) {
                i2 = 1;
            }
            this.mActivityTime = currentTimeMillis;
            Logger.debug();
            j jVar = new j();
            jVar.f59290a = str;
            jVar.f59291b = i2;
            a aVar = new a(b.PAGE_END);
            aVar.f59163b = jVar;
            aVar.f59164c = currentTimeMillis;
            enqueue(aVar);
        }
    }

    private AppLog(Context context) {
        DeviceRegisterManager.setSDKVersion("2.5.6.3");
        Context com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext = com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context);
        this.mContext = com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext;
        DeviceRegisterManager.setContext(com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
        this.mHeader = new JSONObject();
        initDataFromSp(context);
        this.mInitOk = true;
        new c().start();
        this.mNetWorkMonitor = new com.bytedance.common.utility.a(com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext);
    }

    private boolean handleEventTimely(final h hVar) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (hVar != null && !hVar.f59282l) {
                if (currentTimeMillis - this.mStartWaitSendTimely >= 900000) {
                    if ("event_v3".equalsIgnoreCase(hVar.f59272b) && (concurrentHashMap = this.mEventTimely) != null && concurrentHashMap.size() > 0 && !m.a(hVar.f59273c) && this.mEventTimely.containsKey(hVar.f59273c) && !m.a(hVar.f59280j)) {
                        JSONObject jSONObject = new JSONObject(hVar.f59280j);
                        if (jSONObject.optInt("_event_v3", 0) == 1) {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            if (jSONObject.has("nt")) {
                                jSONObject3.put("nt", jSONObject.optInt("nt"));
                            }
                            if (hVar.f59277g > 0) {
                                jSONObject3.put("user_id", hVar.f59277g);
                            }
                            jSONObject.remove("nt");
                            jSONObject.remove("_event_v3");
                            jSONObject3.put("event", hVar.f59273c);
                            jSONObject3.put("params", jSONObject);
                            jSONObject3.put("session_id", hVar.f59279i);
                            jSONObject3.put("datetime", formatDate(hVar.f59278h));
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject3);
                            jSONObject2.put("event_v3", jSONArray);
                            JSONObject jSONObject4 = this.mTimeSync;
                            if (jSONObject4 != null) {
                                jSONObject2.put("time_sync", jSONObject4);
                            }
                            jSONObject2.put("magic_tag", "ss_app_log");
                            jSONObject2.put("header", this.mHeader);
                            jSONObject2.put("_gen_time", System.currentTimeMillis());
                            final String jSONObject5 = jSONObject2.toString();
                            new com.bytedance.common.utility.b.e() {
                                /* class com.ss.android.common.applog.AppLog.AnonymousClass7 */

                                static {
                                    Covode.recordClassIndex(36579);
                                }

                                @Override // com.bytedance.common.utility.b.e
                                public final void run() {
                                    super.run();
                                    try {
                                        if (!AppLog.this.sendTimelyEvent(jSONObject5)) {
                                            h hVar = new h();
                                            hVar.f59272b = hVar.f59272b;
                                            hVar.f59273c = hVar.f59273c;
                                            hVar.f59274d = hVar.f59274d;
                                            hVar.f59275e = hVar.f59275e;
                                            hVar.f59276f = hVar.f59276f;
                                            hVar.f59282l = true;
                                            hVar.f59277g = hVar.f59277g;
                                            hVar.f59280j = hVar.f59280j;
                                            hVar.f59281k = hVar.f59281k;
                                            hVar.f59278h = hVar.f59278h;
                                            a aVar = new a(b.EVENT);
                                            aVar.f59163b = hVar;
                                            AppLog.this.enqueue(aVar);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }.a();
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7 A[Catch:{ Exception -> 0x00e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    void loadStats(com.ss.android.common.applog.p r13) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.loadStats(com.ss.android.common.applog.p):void");
    }

    public boolean sendTimelyEvent(String str) {
        int responseCode;
        String str2;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            if (!(APPLOG_TIMELY_URL() == null || APPLOG_TIMELY_URL().length == 0)) {
                for (String str3 : APPLOG_TIMELY_URL()) {
                    String a2 = q.a(str3, true);
                    byte[] bArr = (byte[]) bytes.clone();
                    if (this.mContext != null && getLogEncryptSwitch()) {
                        try {
                            str2 = q.a(a2, bArr, this.mContext, false, null);
                        } catch (RuntimeException unused) {
                        }
                        if (str2 == null && str2.length() != 0) {
                            JSONObject jSONObject = new JSONObject(str2);
                            if (!"ss_app_log".equals(jSONObject.optString("magic_tag")) || !"success".equals(jSONObject.optString("message"))) {
                                return false;
                            }
                            return true;
                        }
                    }
                    str2 = com.bytedance.common.utility.j.f26946a.a(a2, bytes, true, "application/octet-stream;tt-data=b");
                    if (str2 == null) {
                    }
                }
            }
        } catch (Throwable th) {
            if ((th instanceof com.bytedance.common.utility.b) && (responseCode = th.getResponseCode()) >= 500 && responseCode < 600) {
                this.mStartWaitSendTimely = System.currentTimeMillis();
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void processItem(a aVar) {
        long j2;
        if (this.mInitOk && !sStopped) {
            while (com.ss.android.common.c.b.f59365a) {
                com.ss.android.common.c.b.a();
            }
            String str = "";
            boolean z = true;
            boolean z2 = false;
            switch (AnonymousClass2.f59148a[aVar.f59162a.ordinal()]) {
                case 1:
                    tryExtendSession(aVar.f59164c, false);
                    long j3 = aVar.f59164c;
                    p pVar = this.mSession;
                    if (pVar != null) {
                        str = pVar.f59313b;
                    }
                    t.a().a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0121: INVOKE  
                          (wrap: com.ss.android.common.applog.t : 0x0118: INVOKE  (r1v2 com.ss.android.common.applog.t) =  type: STATIC call: com.ss.android.common.applog.t.a():com.ss.android.common.applog.t)
                          (wrap: com.ss.android.common.applog.b.c$2 : 0x011e: CONSTRUCTOR  (r0v22 com.ss.android.common.applog.b.c$2) = 
                          (wrap: com.ss.android.common.applog.b.c : 0x0114: INVOKE  (r2v7 com.ss.android.common.applog.b.c) = 
                          (wrap: android.content.Context : 0x0112: IGET  (r0v21 android.content.Context) = (r9v0 'this' com.ss.android.common.applog.AppLog A[IMMUTABLE_TYPE, THIS]) com.ss.android.common.applog.AppLog.mContext android.content.Context)
                         type: STATIC call: com.ss.android.common.applog.b.c.a(android.content.Context):com.ss.android.common.applog.b.c)
                          (r3v1 'j3' long)
                          (r5v4 'str' java.lang.String)
                         call: com.ss.android.common.applog.b.c.2.<init>(com.ss.android.common.applog.b.c, long, java.lang.String):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.ss.android.common.applog.t.a(java.lang.Runnable):void in method: com.ss.android.common.applog.AppLog.processItem(com.ss.android.common.applog.AppLog$a):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:274)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x011e: CONSTRUCTOR  (r0v22 com.ss.android.common.applog.b.c$2) = 
                          (wrap: com.ss.android.common.applog.b.c : 0x0114: INVOKE  (r2v7 com.ss.android.common.applog.b.c) = 
                          (wrap: android.content.Context : 0x0112: IGET  (r0v21 android.content.Context) = (r9v0 'this' com.ss.android.common.applog.AppLog A[IMMUTABLE_TYPE, THIS]) com.ss.android.common.applog.AppLog.mContext android.content.Context)
                         type: STATIC call: com.ss.android.common.applog.b.c.a(android.content.Context):com.ss.android.common.applog.b.c)
                          (r3v1 'j3' long)
                          (r5v4 'str' java.lang.String)
                         call: com.ss.android.common.applog.b.c.2.<init>(com.ss.android.common.applog.b.c, long, java.lang.String):void type: CONSTRUCTOR in method: com.ss.android.common.applog.AppLog.processItem(com.ss.android.common.applog.AppLog$a):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 24 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.common.applog.b.c, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 30 more
                        */
                    /*
                    // Method dump skipped, instructions count: 418
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.processItem(com.ss.android.common.applog.AppLog$a):void");
                }

                public static void appendCommonParams(StringBuilder sb, boolean z) {
                    q.a(sb, z);
                }

                public static String addCommonParams(String str, boolean z) {
                    return q.a(str, z);
                }

                public static Object com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
                    try {
                        return bundle.get(str);
                    } catch (Exception | OutOfMemoryError unused) {
                        return null;
                    }
                }

                /* access modifiers changed from: package-private */
                public void tryUpdateConfig(boolean z, boolean z2) {
                    tryUpdateConfig(z, false, z2);
                }

                public static void onEvent(Context context, String str) {
                    onEvent(context, "event_v1", str, null, 0, 0, false, null);
                }

                static void tryReportEventInsertResult(final boolean z, final long j2) {
                    runOnUIThread(new Runnable() {
                        /* class com.ss.android.common.applog.AppLog.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(36575);
                        }

                        public final void run() {
                        }
                    });
                }

                static void tryReportLogRequest(final boolean z, final List<Long> list) {
                    runOnUIThread(new Runnable() {
                        /* class com.ss.android.common.applog.AppLog.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(36578);
                        }

                        public final void run() {
                            j jVar = AppLog.sTraceCallback;
                            if (jVar != null) {
                                jVar.a(list);
                            }
                        }
                    });
                }

                private void updateHeader(Context context, boolean z) {
                    com.ss.android.deviceregister.a.d.a(context, this.mHeader, z);
                    if (this.mLogReaper != null) {
                        try {
                            this.mLogReaper.a(new JSONObject(this.mHeader, c.f59240a));
                        } catch (JSONException unused) {
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public void parseIntSet(HashSet<Integer> hashSet, JSONArray jSONArray) {
                    if (!(hashSet == null || jSONArray == null)) {
                        hashSet.clear();
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            int i3 = jSONArray.getInt(i2);
                            if (i3 > 0) {
                                hashSet.add(Integer.valueOf(i3));
                            }
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public void doRecordMiscLog(String str, JSONObject jSONObject) {
                    long j2;
                    try {
                        p pVar = this.mSession;
                        if (pVar != null) {
                            j2 = pVar.f59312a;
                        } else {
                            j2 = 0;
                        }
                        if (this.mInitOk && j2 > 0 && !m.a(str) && jSONObject != null) {
                            d.a(this.mContext).a(j2, str, jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }

                /* access modifiers changed from: package-private */
                public boolean updateConfig(String str, boolean z) {
                    MethodCollector.i(6735);
                    sIsConfigThread.set(Boolean.TRUE);
                    boolean doUpdateConfig = doUpdateConfig(str, z);
                    Object obj = sLogConfigLock;
                    synchronized (obj) {
                        try {
                            this.mLoadingOnlineConfig = false;
                            try {
                                obj.notifyAll();
                            } catch (Exception unused) {
                            }
                        } finally {
                            MethodCollector.o(6735);
                        }
                    }
                    sIsConfigThread.remove();
                    if (!doUpdateConfig) {
                        notifyRemoteConfigUpdate(false);
                    }
                    return doUpdateConfig;
                }

                private boolean initHeader(JSONObject jSONObject, Context context) {
                    try {
                        JSONArray jSONArray = new JSONArray();
                        if (sMiPushInclude) {
                            jSONArray.put(1);
                        }
                        if (sMyPushInclude) {
                            jSONArray.put(2);
                        }
                        if (sHwPushInclude) {
                            jSONArray.put(7);
                        }
                        if (sMzPushInclude) {
                            jSONArray.put(8);
                        }
                        if (sAliyunPushInclude) {
                            jSONArray.put(9);
                        }
                        jSONObject.put("push_sdk", jSONArray);
                        String userUniqueId = getUserUniqueId();
                        if (!TextUtils.isEmpty(userUniqueId)) {
                            jSONObject.put("user_unique_id", userUniqueId);
                        }
                    } catch (Exception unused) {
                    }
                    return com.ss.android.deviceregister.a.d.a(context, jSONObject, sChildMode);
                }

                /* access modifiers changed from: package-private */
                public void handlePageEnd(j jVar, long j2) {
                    p pVar = this.mSession;
                    if (pVar != null && !pVar.f59320i) {
                        this.mSession.f59322k = false;
                        this.mSession.f59319h = j2;
                        jVar.f59292c = this.mSession.f59312a;
                        d.a(this.mContext).a(jVar, j2);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            int i2 = this.mImageSuccessCount.get();
                            int i3 = this.mImageFailureCount.get();
                            jSONObject.put("session_id", this.mSession.f59313b);
                            jSONObject.put("cnt_success", i2);
                            jSONObject.put("cnt_failure", i3);
                            JSONArray jSONArray = new JSONArray();
                            Iterator<i> it = this.mSamples.iterator();
                            while (it.hasNext()) {
                                i next = it.next();
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("url", next.f59184a);
                                jSONObject2.put("networktype", next.f59185b);
                                jSONObject2.put("time", next.f59186c);
                                jSONObject2.put("timestamp", next.f59187d);
                                jSONArray.put(jSONObject2);
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put("samples", jSONArray);
                            }
                            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(this.mContext, com.ss.android.deviceregister.a.a.f59402a, 0).edit();
                            edit.putString("stats_value", jSONObject.toString());
                            edit.commit();
                        } catch (Exception unused) {
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                public void tryExtendSession(long j2, boolean z) {
                    d a2 = d.a(this.mContext);
                    p pVar = this.mSession;
                    if (pVar != null && (pVar.f59322k || j2 - this.mSession.f59319h < this.mSessionInterval)) {
                        if (this.mSession.f59320i) {
                            if (z) {
                                return;
                            }
                        } else if (!z) {
                            this.mSession.f59322k = true;
                            this.mSession.f59319h = j2;
                            return;
                        } else {
                            return;
                        }
                    }
                    onSessionEnd();
                    p pVar2 = this.mSession;
                    p pVar3 = new p();
                    pVar3.f59313b = genSession();
                    pVar3.f59314c = j2;
                    resetEventIndex();
                    pVar3.f59315d = this.mGlobalEventIndexMatrix.getAndIncrement();
                    pVar3.f59319h = pVar3.f59314c;
                    pVar3.f59316e = 0;
                    pVar3.f59317f = com.ss.android.deviceregister.a.d.f59407c;
                    pVar3.f59318g = com.ss.android.deviceregister.a.d.a();
                    pVar3.f59320i = z;
                    if (!z) {
                        pVar3.f59322k = true;
                    }
                    long a3 = a2.a(pVar3);
                    if (a3 > 0) {
                        pVar3.f59312a = a3;
                        this.mSession = pVar3;
                        notifySessionStart(a3);
                    } else {
                        this.mSession = null;
                    }
                    if (pVar2 != null || this.mSession != null) {
                        n nVar = new n();
                        nVar.f59295a = pVar2;
                        if (mLaunchFrom <= 0) {
                            mLaunchFrom = 6;
                        }
                        p pVar4 = this.mSession;
                        if (pVar4 != null && !pVar4.f59320i) {
                            nVar.f59296b = this.mSession;
                        }
                        enqueue(nVar);
                    }
                }

                /* access modifiers changed from: package-private */
                public boolean doUpdateConfig(String str, boolean z) {
                    boolean z2;
                    int responseCode;
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (sEventFilterEnable > 0) {
                            jSONObject.put("event_filter", sEventFilterEnable);
                        }
                        String[] strArr = null;
                        if (getLogEncryptSwitch() && (strArr = com.ss.android.deviceregister.b.a.a.c.a()) != null) {
                            jSONObject.put("key", strArr[0]);
                            jSONObject.put("iv", strArr[1]);
                        }
                        byte[] bytes = jSONObject.toString().getBytes("UTF-8");
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - mLastGetAppConfigTime < 600000) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        mLastGetAppConfigTime = currentTimeMillis;
                        int i2 = 0;
                        boolean z3 = false;
                        while (true) {
                            byte[] bArr = (byte[]) bytes.clone();
                            String APPLOG_CONFIG_URL = APPLOG_CONFIG_URL();
                            if (z3) {
                                APPLOG_CONFIG_URL = APPLOG_CONFIG_URL_FALLBACK();
                            }
                            String a2 = q.a(APPLOG_CONFIG_URL, true);
                            try {
                                String str2 = "application/octet-stream;tt-data=b";
                                if (this.mContext == null || !getLogEncryptSwitch()) {
                                    if (z2) {
                                        a2 = a2 + "&config_retry=b";
                                    }
                                    str2 = com.bytedance.common.utility.j.f26946a.a(a2, bytes, true, str2);
                                } else {
                                    try {
                                        str2 = q.a(a2, bArr, this.mContext, z2, strArr);
                                    } catch (RuntimeException unused) {
                                        if (z2) {
                                            a2 = a2 + "&config_retry=b";
                                        }
                                        str2 = com.bytedance.common.utility.j.f26946a.a(a2, bytes, true, str2);
                                    }
                                }
                                if (str2 != null && str2.length() != 0) {
                                    JSONObject jSONObject2 = new JSONObject(str2);
                                    if (!"ss_app_log".equals(jSONObject2.optString("magic_tag"))) {
                                        return false;
                                    }
                                    a aVar = new a(b.CONFIG_UPDATE);
                                    aVar.f59163b = jSONObject2;
                                    aVar.f59165d = String.valueOf(z);
                                    enqueue(aVar);
                                    return true;
                                }
                            } catch (Throwable th) {
                                if ((th instanceof com.bytedance.common.utility.b) && (responseCode = th.getResponseCode()) >= 500 && responseCode < 600) {
                                    this.mUpdateConfigTime = System.currentTimeMillis();
                                    this.mLastConfigVersion = this.mVersionCode;
                                    SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(this.mContext, com.ss.android.deviceregister.a.a.f59402a, 0).edit();
                                    edit.putLong("app_log_last_config_time", this.mUpdateConfigTime);
                                    edit.putInt("app_log_last_config_version", this.mLastConfigVersion);
                                    edit.commit();
                                    throw th;
                                } else if (i2 <= 0) {
                                    i2++;
                                    z3 = true;
                                    if (i2 >= 2) {
                                        break;
                                    }
                                } else {
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                    return false;
                }

                /* access modifiers changed from: package-private */
                /* JADX WARNING: Removed duplicated region for block: B:42:0x00ad  */
                /* JADX WARNING: Removed duplicated region for block: B:53:0x00d9  */
                /* JADX WARNING: Removed duplicated region for block: B:56:0x00e6  */
                /* JADX WARNING: Removed duplicated region for block: B:67:0x010a  */
                /* JADX WARNING: Removed duplicated region for block: B:70:0x010f  */
                /* JADX WARNING: Removed duplicated region for block: B:73:0x0116  */
                /* JADX WARNING: Removed duplicated region for block: B:76:0x0133  */
                /* JADX WARNING: Removed duplicated region for block: B:81:0x0147  */
                /* JADX WARNING: Removed duplicated region for block: B:83:0x0165  */
                /* JADX WARNING: Removed duplicated region for block: B:85:0x016c  */
                /* JADX WARNING: Removed duplicated region for block: B:87:0x0175  */
                /* JADX WARNING: Removed duplicated region for block: B:89:0x017e  */
                /* JADX WARNING: Removed duplicated region for block: B:92:0x0194  */
                /* JADX WARNING: Removed duplicated region for block: B:93:0x0197  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void handleConfigUpdate(org.json.JSONObject r18, boolean r19) {
                    /*
                    // Method dump skipped, instructions count: 504
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.handleConfigUpdate(org.json.JSONObject, boolean):void");
                }

                public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_recordMiscLog(Context context, String str, JSONObject jSONObject) {
                    if (!in.d()) {
                        AppLog__recordMiscLog$___twin___(context, str, jSONObject);
                    }
                }

                private void doResetWhenSwitchChildMode(boolean z, long j2, com.ss.android.deviceregister.f fVar) {
                    new a.C1291a(this.mContext, ACTIVE_USER_URL(), z).start();
                    DeviceRegisterManager.resetDidWhenSwitchChildMode(z, j2, fVar);
                    updateHeader(this.mContext, z);
                }

                public static void onEvent(Context context, String str, String str2) {
                    onEvent(context, "event_v1", str, str2, 0, 0, false, null);
                }

                private static boolean optBoolean(JSONObject jSONObject, String str, boolean z) {
                    if (jSONObject == null || jSONObject.isNull(str)) {
                        return z;
                    }
                    int optInt = jSONObject.optInt(str, -1);
                    if (optInt > 0) {
                        return true;
                    }
                    if (optInt == 0) {
                        return false;
                    }
                    return jSONObject.optBoolean(str, z);
                }

                public static void init(Context context, boolean z, v vVar) {
                    if (vVar != null) {
                        urlConfig = vVar;
                        setDeviceRegisterURL(vVar.f59344e);
                        sInitGuard = true;
                        if (context instanceof Activity) {
                            sInitWithActivity = true;
                        }
                        getInstance(context);
                        if (!mHasHandledCache) {
                            mHasHandledCache = true;
                            
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: INVOKE  
                                  (wrap: com.ss.android.common.applog.b$1 : 0x0021: CONSTRUCTOR  (r0v5 com.ss.android.common.applog.b$1) = 
                                  (wrap: com.ss.android.common.applog.b : 0x001b: INVOKE  (r1v1 com.ss.android.common.applog.b) =  type: STATIC call: com.ss.android.common.applog.b.a():com.ss.android.common.applog.b)
                                 call: com.ss.android.common.applog.b.1.<init>(com.ss.android.common.applog.b):void type: CONSTRUCTOR)
                                 type: VIRTUAL call: com.bytedance.common.utility.b.e.a():void in method: com.ss.android.common.applog.AppLog.init(android.content.Context, boolean, com.ss.android.common.applog.v):void, file: classes.dex
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
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: CONSTRUCTOR  (r0v5 com.ss.android.common.applog.b$1) = 
                                  (wrap: com.ss.android.common.applog.b : 0x001b: INVOKE  (r1v1 com.ss.android.common.applog.b) =  type: STATIC call: com.ss.android.common.applog.b.a():com.ss.android.common.applog.b)
                                 call: com.ss.android.common.applog.b.1.<init>(com.ss.android.common.applog.b):void type: CONSTRUCTOR in method: com.ss.android.common.applog.AppLog.init(android.content.Context, boolean, com.ss.android.common.applog.v):void, file: classes.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 26 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.common.applog.b, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 32 more
                                */
                            /*
                                if (r5 == 0) goto L_0x0033
                                com.ss.android.common.applog.AppLog.urlConfig = r5
                                java.lang.String[] r0 = r5.f59344e
                                setDeviceRegisterURL(r0)
                                r2 = 1
                                com.ss.android.common.applog.AppLog.sInitGuard = r2
                                boolean r0 = r3 instanceof android.app.Activity
                                if (r0 == 0) goto L_0x0012
                                com.ss.android.common.applog.AppLog.sInitWithActivity = r2
                            L_0x0012:
                                getInstance(r3)
                                boolean r0 = com.ss.android.common.applog.AppLog.mHasHandledCache
                                if (r0 != 0) goto L_0x0027
                                com.ss.android.common.applog.AppLog.mHasHandledCache = r2
                                com.ss.android.common.applog.b r1 = com.ss.android.common.applog.b.a()
                                com.ss.android.common.applog.b$1 r0 = new com.ss.android.common.applog.b$1
                                r0.<init>()
                                r0.a()
                            L_0x0027:
                                r0 = r4 ^ 1
                                com.ss.android.common.applog.AppLog.sHasManualInvokeActiveUser = r0
                                com.ss.android.common.applog.AppLog.mLaunchFrom = r2
                                com.ss.android.common.applog.ApplogServiceImpl.isServicePrepared = r2
                                com.ss.android.common.applog.ApplogServiceImpl.handleCachedData()
                                return
                            L_0x0033:
                                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                                java.lang.String r0 = "urlConfig must not be null"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.init(android.content.Context, boolean, com.ss.android.common.applog.v):void");
                        }

                        public static void onPause(Context context, String str, int i2) {
                            if (!TextUtils.isEmpty(str)) {
                                d dVar = new d(str, i2);
                                AppLog instance = getInstance(context);
                                if (instance != null) {
                                    instance.onActivityPause(dVar);
                                }
                                DeviceRegisterManager.onPause();
                            }
                        }

                        public static void AppLog__recordMiscLog$___twin___(Context context, String str, JSONObject jSONObject) {
                            AppLog appLog;
                            if (!sStopped && !m.a(str) && jSONObject != null && jSONObject.length() > 0 && (appLog = sInstance) != null) {
                                try {
                                    if (f.a().f59266b) {
                                        jSONObject.put("log_type", str);
                                        JSONArray jSONArray = new JSONArray();
                                        jSONArray.put(jSONObject);
                                        f.a().a("log_data", jSONArray);
                                    }
                                } catch (Exception unused) {
                                }
                                a aVar = new a(b.SAVE_MISC_LOG);
                                aVar.f59165d = str;
                                aVar.f59163b = jSONObject;
                                appLog.enqueue(aVar);
                            }
                        }

                        public static void onResume(Context context, String str, int i2) {
                            if (!TextUtils.isEmpty(str)) {
                                sLastResumeActivityName = str;
                                sLastResumeActivityNameAndTime = sLastResumeActivityName + "(" + String.valueOf(System.currentTimeMillis()) + ")";
                                d dVar = new d(str, i2);
                                AppLog instance = getInstance(context);
                                if (instance != null) {
                                    instance.onActivityResume(dVar);
                                }
                                DeviceRegisterManager.onResume();
                            }
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
                            if (r11 != false) goto L_0x004c;
                         */
                        /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
                        /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
                        /* JADX WARNING: Removed duplicated region for block: B:39:0x0081 A[Catch:{ Exception -> 0x00e1 }, RETURN] */
                        /* JADX WARNING: Removed duplicated region for block: B:40:0x0082 A[Catch:{ Exception -> 0x00e1 }] */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void tryUpdateConfig(boolean r15, boolean r16, final boolean r17) {
                            /*
                            // Method dump skipped, instructions count: 226
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.tryUpdateConfig(boolean, boolean, boolean):void");
                        }

                        public static void resetDidWhenSwitchChildMode(Context context, boolean z, long j2, com.ss.android.deviceregister.f fVar) {
                            clearOrResetWhenSwitchChildMode(z, b.RESET_WHEN_SWITCH_CHILD_MODE, j2, fVar);
                        }

                        /* access modifiers changed from: package-private */
                        public static class i {

                            /* renamed from: a  reason: collision with root package name */
                            public final String f59184a;

                            /* renamed from: b  reason: collision with root package name */
                            public final int f59185b;

                            /* renamed from: c  reason: collision with root package name */
                            public final long f59186c;

                            /* renamed from: d  reason: collision with root package name */
                            public final long f59187d;

                            static {
                                Covode.recordClassIndex(36590);
                            }

                            public i(String str, int i2, long j2, long j3) {
                                this.f59184a = str;
                                this.f59185b = i2;
                                this.f59186c = j2;
                                this.f59187d = j3;
                            }
                        }

                        private static void clearOrResetWhenSwitchChildMode(boolean z, b bVar, long j2, com.ss.android.deviceregister.f fVar) {
                            long j3;
                            sChildMode = z;
                            AppLog appLog = sInstance;
                            if (appLog != null) {
                                CountDownLatch countDownLatch = new CountDownLatch(1);
                                a aVar = new a(bVar);
                                if (z) {
                                    j3 = 1;
                                } else {
                                    j3 = 0;
                                }
                                aVar.f59164c = j3;
                                aVar.f59163b = new Pair(fVar, Long.valueOf(j2));
                                aVar.f59166e = countDownLatch;
                                appLog.enqueue(aVar);
                                try {
                                    countDownLatch.await();
                                } catch (InterruptedException unused) {
                                }
                            }
                        }

                        public static void onEvent(Context context, String str, String str2, String str3, long j2, long j3, JSONObject jSONObject) {
                            onEvent(context, str, str2, str3, j2, j3, false, jSONObject);
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e8, code lost:
                            if (r9 != null) goto L_0x00ea;
                         */
                        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0145, code lost:
                            if (r0 != null) goto L_0x014c;
                         */
                        /* JADX WARNING: Removed duplicated region for block: B:103:0x01a1 A[Catch:{ JSONException -> 0x0200 }] */
                        /* JADX WARNING: Removed duplicated region for block: B:114:0x01d8 A[Catch:{ JSONException -> 0x0200 }] */
                        /* JADX WARNING: Removed duplicated region for block: B:117:0x01e7 A[Catch:{ JSONException -> 0x0200 }] */
                        /* JADX WARNING: Removed duplicated region for block: B:91:0x0154  */
                        /* JADX WARNING: Removed duplicated region for block: B:92:0x015c  */
                        /* JADX WARNING: Removed duplicated region for block: B:96:0x0167 A[Catch:{ JSONException -> 0x0200 }] */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void AppLog__onEvent$___twin___(java.lang.String r27, java.lang.String r28, java.lang.String r29, long r30, long r32, boolean r34, org.json.JSONObject r35) {
                            /*
                            // Method dump skipped, instructions count: 545
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.AppLog.AppLog__onEvent$___twin___(java.lang.String, java.lang.String, java.lang.String, long, long, boolean, org.json.JSONObject):void");
                        }

                        public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_onEvent(AppLog appLog, String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
                            InitModules.l();
                            appLog.AppLog__onEvent$___twin___(str, str2, str3, j2, j3, z, jSONObject);
                        }

                        public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_lancet_AppLogLancet_onEvent(Context context, String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
                            if (!"event_v1".equalsIgnoreCase(str) || str2 == null || !com.ss.android.ugc.aweme.lancet.a.f107163a.contains(str2)) {
                                if ("event_v3".equalsIgnoreCase(str) && jSONObject != null && jSONObject.has("_staging_flag")) {
                                    jSONObject.remove("_staging_flag");
                                }
                                AppLog__onEvent$___twin___(context, str, str2, str3, j2, j3, z, jSONObject);
                            }
                        }

                        public static void com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_net_lancet_AppLogLancet_onEvent(AppLog appLog, String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
                            if (jSONObject == null) {
                                com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_onEvent(appLog, str, str2, str3, j2, j3, z, jSONObject);
                                return;
                            }
                            com.ss.android.ugc.aweme.net.model.e<com.ss.android.ugc.aweme.net.model.a, Boolean> eVar = new com.ss.android.ugc.aweme.net.model.e<>();
                            eVar.f112458a = (Q) new com.ss.android.ugc.aweme.net.model.a(str, str2, str3, jSONObject);
                            n.f112474e.a_(eVar);
                            if (eVar.f112463f != com.ss.android.ugc.aweme.net.model.d.INTERCEPT) {
                                com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_onEvent(appLog, str, str2, str3, j2, j3, z, jSONObject);
                            }
                        }

                        public static void AppLog__onEvent$___twin___(Context context, String str, String str2, String str3, long j2, long j3, boolean z, JSONObject jSONObject) {
                            MethodCollector.i(6068);
                            appendParamsToEvent(jSONObject);
                            AppLog appLog = sInstance;
                            if (appLog == null) {
                                b a2 = b.a();
                                synchronized (a2.f59193a) {
                                    try {
                                        if (a2.f59193a.size() > 200) {
                                            a2.f59193a.poll();
                                            tryReportEventDiscard(1);
                                        }
                                        a2.f59193a.add(new b.a(str, str2, str3, j2, j3, z, jSONObject));
                                    } finally {
                                        MethodCollector.o(6068);
                                    }
                                }
                            } else if (m.a(str) || m.a(str2)) {
                                tryReportEventDiscard(0);
                                MethodCollector.o(6068);
                            } else {
                                appLog.onEvent(str, str2, str3, j2, j3, z, jSONObject);
                                MethodCollector.o(6068);
                            }
                        }
                    }
