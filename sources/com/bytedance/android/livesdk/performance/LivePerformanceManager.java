package com.bytedance.android.livesdk.performance;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.d.a;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.cx;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGpuEnableSettings;
import com.bytedance.android.livesdk.livesetting.performance.LivePerformanceSettingSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveThorEnableSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePerformanceMonitorSetting;
import com.bytedance.android.livesdk.model.at;
import com.bytedance.android.livesdk.performance.d;
import com.bytedance.android.livesdk.performance.o;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.a.ag;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class LivePerformanceManager implements a {
    private static volatile LivePerformanceManager instance;
    private long anchorId;
    private Map<String, String> extraParams;
    public com.bytedance.android.livesdkapi.host.a fpsMonitorCallback = new com.bytedance.android.livesdkapi.host.a() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.AnonymousClass4 */

        static {
            Covode.recordClassIndex(11915);
        }

        @Override // com.bytedance.android.livesdkapi.host.a
        public final void a(double d2, JSONObject jSONObject) {
            if (d2 > 0.0d && jSONObject != null) {
                f fVar = LivePerformanceManager.this.mDegradeStrategyManager;
                if (f.a()) {
                    boolean a2 = fVar.f20225a.a(d2);
                    if (fVar.f20226b.a(d2)) {
                        f.a(2);
                        fVar.f20226b.a();
                        fVar.f20225a.a();
                    } else if (a2) {
                        f.a(1);
                        fVar.f20225a.a();
                    }
                }
                LivePerformanceManager.this.reportFps(d2, jSONObject);
            }
            LivePerformanceManager.this.isFPSMonitoring = false;
            LivePerformanceManager.this.updateLastMonitorTime();
        }
    };
    private Runnable fpsRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.AnonymousClass5 */

        static {
            Covode.recordClassIndex(11916);
        }

        public final void run() {
            if (LivePerformanceManager.this.mPerformanceMonitor != null) {
                LivePerformanceManager.this.mPerformanceMonitor.a(LivePerformanceManager.this.fpsMonitorCallback);
            }
        }
    };
    private boolean isAnchor;
    public boolean isCollect;
    public volatile boolean isFPSMonitoring;
    public volatile boolean isPerformanceMonitoring;
    public boolean isReport;
    private boolean isTimerMonitoring;
    public String mBatteryInfo;
    public Runnable mCheckBatteryValue = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.AnonymousClass9 */

        static {
            Covode.recordClassIndex(11920);
        }

        public final void run() {
            if (d.a.f20222a.f20209b) {
                LivePerformanceManager livePerformanceManager = LivePerformanceManager.this;
                livePerformanceManager.mEnterBatteryInfo = livePerformanceManager.getCurrentBatteryValue();
                return;
            }
            LivePerformanceManager.this.mMainHandler.postDelayed(LivePerformanceManager.this.mCheckBatteryValue, 1000);
        }
    };
    private int[] mCollectionDuration;
    public String mCpuInfo;
    private long mDefaultMinMonitorInterval = 8000;
    private long mDefaultMonitorDelay = 1000;
    private long mDefaultMonitorInterval = 15000;
    public f mDegradeStrategyManager = new f();
    public String mEnterBatteryInfo;
    public Map<String, String> mExtras;
    private long mFpsDefaultDuration = 3000;
    public long mLastCollectTimestamp;
    private long mLastMonitorTimestamp;
    public long mLastReportTimestamp;
    public Handler mMainHandler;
    public String mMemInfo;
    private o mModulesManager = new o();
    public h mPerformanceMonitor;
    private float mPreviewFps = -1.0f;
    private int[] mReportDuration;
    private String mScene;
    private at mSetting;
    private int mStartBatterLevel = -1;
    private long mStartMonitorTime;
    private double mStreamFps = -1.0d;
    public String mStreamInfo;
    private i mStreamType;
    public String mTemperature;
    private float mVideoCaptureFps = -1.0f;
    public Handler mWorkHandler;
    private HandlerThread mWorkThread;
    private Map<String, Double> nonLiveCpu;
    private Map<String, Long> nonLiveMem;
    private float nonLiveTemperature = -1.0f;
    public final h performanceCache = new h();
    private Runnable performanceCollectRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.AnonymousClass2 */

        static {
            Covode.recordClassIndex(11913);
        }

        public final void run() {
            if (LivePerformanceManager.this.mPerformanceMonitor != null) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    Map<String, Double> a2 = LivePerformanceManager.this.mPerformanceMonitor.a();
                    LivePerformanceManager livePerformanceManager = LivePerformanceManager.this;
                    livePerformanceManager.mCpuInfo = livePerformanceManager.getCpuInfo(a2, System.currentTimeMillis() - currentTimeMillis);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    Map<String, Long> b2 = LivePerformanceManager.this.mPerformanceMonitor.b();
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                    LivePerformanceManager livePerformanceManager2 = LivePerformanceManager.this;
                    livePerformanceManager2.mMemInfo = livePerformanceManager2.getMemInfo(b2, currentTimeMillis3);
                    float f2 = d.a.f20222a.f20210c;
                    LivePerformanceManager.this.mDegradeStrategyManager.a(f2);
                    LivePerformanceManager livePerformanceManager3 = LivePerformanceManager.this;
                    livePerformanceManager3.mTemperature = livePerformanceManager3.getTemperatureInfo(f2);
                    LivePerformanceManager livePerformanceManager4 = LivePerformanceManager.this;
                    livePerformanceManager4.mStreamInfo = livePerformanceManager4.getStreamInfo();
                    LivePerformanceManager livePerformanceManager5 = LivePerformanceManager.this;
                    livePerformanceManager5.mBatteryInfo = livePerformanceManager5.getBatteryInfo();
                    LivePerformanceManager.this.performanceCache.a(a2);
                    LivePerformanceManager.this.performanceCache.b(b2);
                    LivePerformanceManager.this.mExtras = new HashMap(8);
                    if (LiveThorEnableSettings.INSTANCE.isEnable()) {
                        LivePerformanceManager.this.mExtras = ((h) com.bytedance.android.live.t.a.a(h.class)).a(y.e());
                    }
                    LivePerformanceManager.this.mExtras.putAll(LivePerformanceManager.this.getGupInfo());
                } catch (Throwable th) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("error_msg", th.getMessage());
                    c.a("ttlive_live_performace_report_error", 1, 0, hashMap);
                }
            }
            LivePerformanceManager.this.isCollect = false;
            LivePerformanceManager.this.mLastCollectTimestamp = System.currentTimeMillis();
        }
    };
    private Runnable performanceReportRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.AnonymousClass3 */

        static {
            Covode.recordClassIndex(11914);
        }

        public final void run() {
            try {
                LivePerformanceManager livePerformanceManager = LivePerformanceManager.this;
                livePerformanceManager.reportPerformance(livePerformanceManager.mCpuInfo, LivePerformanceManager.this.mMemInfo, LivePerformanceManager.this.mTemperature, LivePerformanceManager.this.mStreamInfo, LivePerformanceManager.this.mBatteryInfo, LivePerformanceManager.this.mExtras);
            } catch (Throwable th) {
                HashMap hashMap = new HashMap();
                hashMap.put("error_msg", th.getMessage());
                c.a("ttlive_live_performace_report_error", 1, 0, hashMap);
            }
            LivePerformanceManager.this.isReport = false;
            LivePerformanceManager.this.mLastReportTimestamp = System.currentTimeMillis();
        }
    };
    private Runnable performanceRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(11912);
        }

        public final void run() {
            if (LivePerformanceManager.this.mPerformanceMonitor != null) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    Map<String, Double> a2 = LivePerformanceManager.this.mPerformanceMonitor.a();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    long currentTimeMillis3 = System.currentTimeMillis();
                    Map<String, Long> b2 = LivePerformanceManager.this.mPerformanceMonitor.b();
                    long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                    float f2 = d.a.f20222a.f20210c;
                    LivePerformanceManager.this.mDegradeStrategyManager.a(f2);
                    String streamInfo = LivePerformanceManager.this.getStreamInfo();
                    String batteryInfo = LivePerformanceManager.this.getBatteryInfo();
                    Map<String, String> hashMap = new HashMap<>(8);
                    if (LiveThorEnableSettings.INSTANCE.isEnable()) {
                        hashMap = ((h) com.bytedance.android.live.t.a.a(h.class)).a(y.e());
                    }
                    hashMap.putAll(LivePerformanceManager.this.getGupInfo());
                    LivePerformanceManager livePerformanceManager = LivePerformanceManager.this;
                    livePerformanceManager.reportPerformance(livePerformanceManager.getCpuInfo(a2, currentTimeMillis2), LivePerformanceManager.this.getMemInfo(b2, currentTimeMillis4), LivePerformanceManager.this.getTemperatureInfo(f2), streamInfo, batteryInfo, hashMap);
                    LivePerformanceManager.this.performanceCache.a(a2);
                    LivePerformanceManager.this.performanceCache.b(b2);
                } catch (Throwable th) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("error_msg", th.getMessage());
                    c.a("ttlive_live_performace_report_error", 1, 0, hashMap2);
                }
            }
            LivePerformanceManager.this.isPerformanceMonitoring = false;
            LivePerformanceManager.this.updateLastMonitorTime();
        }
    };
    private long roomId;
    public Runnable timerCollectMonitorRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.AnonymousClass7 */

        static {
            Covode.recordClassIndex(11918);
        }

        public final void run() {
            LivePerformanceManager.this.monitorPerformance("resident", 3);
            long collectDuration = LivePerformanceManager.this.getCollectDuration();
            if (collectDuration > 0) {
                LivePerformanceManager.this.mWorkHandler.postDelayed(LivePerformanceManager.this.timerCollectMonitorRunnable, collectDuration);
            }
        }
    };
    public Runnable timerMonitorRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.AnonymousClass6 */

        static {
            Covode.recordClassIndex(11917);
        }

        public final void run() {
            if (!LivePerformanceMonitorSetting.INSTANCE.isOpen()) {
                LivePerformanceManager.this.monitorPerformance("resident", 1);
                LivePerformanceManager.this.mWorkHandler.postDelayed(LivePerformanceManager.this.timerMonitorRunnable, LivePerformanceManager.this.getDuration(1));
                return;
            }
            LivePerformanceManager.this.mWorkHandler.post(LivePerformanceManager.this.timerCollectMonitorRunnable);
            LivePerformanceManager.this.mWorkHandler.post(LivePerformanceManager.this.timerReportMonitorRunnable);
        }
    };
    public Runnable timerReportMonitorRunnable = new Runnable() {
        /* class com.bytedance.android.livesdk.performance.LivePerformanceManager.AnonymousClass8 */

        static {
            Covode.recordClassIndex(11919);
        }

        public final void run() {
            LivePerformanceManager.this.monitorPerformance("resident", 4);
            long reportDuration = LivePerformanceManager.this.getReportDuration();
            if (reportDuration > 0) {
                LivePerformanceManager.this.mWorkHandler.postDelayed(LivePerformanceManager.this.timerReportMonitorRunnable, reportDuration);
            }
        }
    };

    static {
        Covode.recordClassIndex(11911);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    public void resetInitValue() {
        release();
    }

    private boolean isGupOpen() {
        return LiveGpuEnableSettings.INSTANCE.isEnable();
    }

    public void initStartValue() {
        initStartValue(0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$check$3$LivePerformanceManager() {
        h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            hVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$startTimerMonitor$0$LivePerformanceManager() {
        h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            hVar.e();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$stopTimerMonitor$2$LivePerformanceManager() {
        h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            hVar.g();
        }
    }

    public Map<String, Double> getCpuRates() {
        h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            return hVar.a();
        }
        return new HashMap(1);
    }

    public Map<String, Long> getMemory() {
        h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            return hVar.b();
        }
        return Collections.emptyMap();
    }

    public boolean hasInitValue() {
        if (this.nonLiveCpu == null || this.nonLiveMem == null) {
            return false;
        }
        return true;
    }

    public void updateLastMonitorTime() {
        if (!this.isPerformanceMonitoring && !this.isFPSMonitoring) {
            this.mLastMonitorTimestamp = System.currentTimeMillis();
        }
    }

    private boolean checkMinCollectInterval() {
        if (System.currentTimeMillis() - this.mLastCollectTimestamp > getDuration(2)) {
            return true;
        }
        return false;
    }

    private boolean checkMinInterval() {
        if (System.currentTimeMillis() - this.mLastMonitorTimestamp > getDuration(2)) {
            return true;
        }
        return false;
    }

    private boolean checkMinReportInterval() {
        if (System.currentTimeMillis() - this.mLastReportTimestamp > getDuration(2)) {
            return true;
        }
        return false;
    }

    public long getCollectDuration() {
        int value = LivePerformanceMonitorSetting.INSTANCE.getValue();
        if (this.mCollectionDuration == null) {
            initExpDuration();
        }
        int[] iArr = this.mCollectionDuration;
        if (iArr == null || value >= iArr.length) {
            return 0;
        }
        return (long) (iArr[value] * 1000);
    }

    public Map<String, Double> getCpuRateEnableCache() {
        Map<String, Double> map = this.performanceCache.f20266a;
        if (!map.isEmpty()) {
            return map;
        }
        h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            return hVar.a();
        }
        return Collections.emptyMap();
    }

    public long getDalvikPss() {
        h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            return hVar.b().get("mem_pss_dalvik").longValue();
        }
        return -1;
    }

    public Map<String, Long> getMemoryEnableCache() {
        Map<String, Long> map = this.performanceCache.f20267b;
        if (!map.isEmpty()) {
            return map;
        }
        h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            return hVar.b();
        }
        return Collections.emptyMap();
    }

    public long getReportDuration() {
        int value = LivePerformanceMonitorSetting.INSTANCE.getValue();
        if (this.mReportDuration == null) {
            initExpDuration();
        }
        int[] iArr = this.mReportDuration;
        if (iArr == null || value >= iArr.length) {
            return 0;
        }
        return (long) (iArr[value] * 1000);
    }

    public void onEnterRoom() {
        if (check()) {
            if (d.a.f20222a.f20209b) {
                this.mEnterBatteryInfo = getCurrentBatteryValue();
            } else {
                this.mMainHandler.postDelayed(this.mCheckBatteryValue, 1000);
            }
        }
    }

    public void onExitRoom() {
        if (check()) {
            if (this.mEnterBatteryInfo != null) {
                reportBatteryInfo();
            }
            this.mEnterBatteryInfo = null;
        }
    }

    public static LivePerformanceManager getInstance() {
        MethodCollector.i(11213);
        if (instance == null) {
            synchronized (LivePerformanceManager.class) {
                try {
                    if (instance == null) {
                        instance = new LivePerformanceManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11213);
                    throw th;
                }
            }
        }
        LivePerformanceManager livePerformanceManager = instance;
        MethodCollector.o(11213);
        return livePerformanceManager;
    }

    private String getModuleInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (T t : this.mModulesManager.f20282a.values()) {
                jSONObject.put(t.f20283a, t.a());
            }
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    private void initExpDuration() {
        this.mCollectionDuration = new int[]{15, 10, 20, 30, 15, 15, 15};
        this.mReportDuration = new int[]{15, 15, 15, 15, 10, 20, 30};
    }

    private void monitorFps() {
        if (check() && !this.isFPSMonitoring) {
            this.isFPSMonitoring = true;
            this.mPerformanceMonitor.c();
            this.mMainHandler.removeCallbacks(this.fpsRunnable);
            this.mMainHandler.postDelayed(this.fpsRunnable, getDuration(4));
        }
    }

    public String getCurrentBatteryValue() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("battery_level", d.a.f20222a.f20211d);
            jSONObject.put("temperature", (double) d.a.f20222a.f20210c);
            jSONObject.put("voltage", d.a.f20222a.f20216i);
            jSONObject.put("battery_energy", a.b(y.e()));
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public Map<String, String> getGupInfo() {
        HashMap hashMap = new HashMap(2);
        if (isGupOpen() && this.mPerformanceMonitor != null) {
            long currentTimeMillis = System.currentTimeMillis();
            double f2 = this.mPerformanceMonitor.f();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (f2 > 0.0d) {
                hashMap.put("gpu_cost", String.valueOf(currentTimeMillis2));
                hashMap.put("gpu", String.valueOf(f2));
            }
        }
        return hashMap;
    }

    public void init() {
        at value = LivePerformanceSettingSetting.INSTANCE.getValue();
        this.mSetting = value;
        if (value.f18993a) {
            HandlerThread handlerThread = new HandlerThread("LivePerformanceManagerThread", 0);
            this.mWorkThread = handlerThread;
            handlerThread.start();
            this.mWorkHandler = new Handler(this.mWorkThread.getLooper());
            this.mMainHandler = new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initStartValue$1$LivePerformanceManager() {
        h hVar = this.mPerformanceMonitor;
        if (hVar != null) {
            if (this.nonLiveCpu == null) {
                this.nonLiveCpu = hVar.a();
            }
            if (this.nonLiveMem == null) {
                this.nonLiveMem = this.mPerformanceMonitor.b();
            }
        }
        if (this.nonLiveTemperature <= 0.0f) {
            this.nonLiveTemperature = d.a.f20222a.f20210c;
        }
        if (this.mStartBatterLevel <= 0) {
            this.mStartBatterLevel = d.a.f20222a.f20211d;
            this.mStartMonitorTime = System.currentTimeMillis();
        }
    }

    public void release() {
        d.a.f20222a.b();
        Handler handler = this.mWorkHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.isPerformanceMonitoring = false;
        }
        Handler handler2 = this.mMainHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.isFPSMonitoring = false;
        }
        h hVar = this.performanceCache;
        hVar.f20266a = ag.a();
        hVar.f20267b = ag.a();
        this.nonLiveCpu = null;
        this.nonLiveMem = null;
        this.nonLiveTemperature = -1.0f;
        this.mStartBatterLevel = -1;
        this.mStartMonitorTime = 0;
    }

    public void startTimerMonitor() {
        if (check() && !this.isTimerMonitoring) {
            this.isTimerMonitoring = true;
            if (isGupOpen()) {
                this.mWorkHandler.post(new i(this));
            }
            this.mWorkHandler.removeCallbacks(this.timerMonitorRunnable);
            this.mWorkHandler.post(this.timerMonitorRunnable);
        }
    }

    public void stopTimerMonitor() {
        if (check() && this.isTimerMonitoring) {
            this.isTimerMonitoring = false;
            this.mWorkHandler.removeCallbacks(this.timerMonitorRunnable);
            if (isGupOpen()) {
                this.mWorkHandler.post(new k(this));
            }
        }
    }

    private LivePerformanceManager() {
        init();
    }

    private boolean check() {
        if (!this.mSetting.f18993a) {
            return false;
        }
        if (this.mWorkHandler == null || this.mMainHandler == null || this.mWorkThread == null) {
            init();
        }
        if (this.mPerformanceMonitor == null) {
            this.mPerformanceMonitor = (h) com.bytedance.android.live.t.a.a(h.class);
            if (isGupOpen()) {
                this.mWorkHandler.post(new l(this));
            }
        }
        if (!d.a.f20222a.f20208a) {
            d.a.f20222a.a();
        }
        if (this.mWorkHandler == null || this.mMainHandler == null || this.mWorkThread == null || this.mPerformanceMonitor == null) {
            return false;
        }
        return true;
    }

    private void reportBatteryInfo() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_info", this.mEnterBatteryInfo);
        hashMap.put("exit_info", getCurrentBatteryValue());
        hashMap.put("battery_scale", String.valueOf(d.a.f20222a.f20212e));
        String str3 = "1";
        if (d.a.f20222a.f20215h) {
            str = str3;
        } else {
            str = "0";
        }
        hashMap.put("present", str);
        hashMap.put("health", String.valueOf(d.a.f20222a.f20214g));
        if (d.a.f20222a.f20218k) {
            str2 = str3;
        } else {
            str2 = "0";
        }
        hashMap.put("has_charged", str2);
        if (!this.isAnchor) {
            str3 = "0";
        }
        hashMap.put("is_anchor", str3);
        JSONObject convertMapToJson = convertMapToJson(hashMap);
        b.a.a("livesdk_room_info").a((Map<String, String>) hashMap).b();
        if (this.isAnchor) {
            c.a("ttlive_room_info_anchor_all", 0, convertMapToJson);
        } else {
            c.a("ttlive_room_info_audience_all", 0, convertMapToJson);
        }
    }

    public String getStreamInfo() {
        JSONObject e2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.isAnchor) {
                com.bytedance.android.livesdk.ab.d.b bVar = (com.bytedance.android.livesdk.ab.d.b) DataChannelGlobal.f34575d.b(cx.class);
                if (!(bVar == null || (e2 = bVar.e()) == null)) {
                    jSONObject.put("preview_fps", e2.optDouble("render_fps:", -1.0d));
                    jSONObject.put("real_fps", e2.optDouble("push_client_fps:", -1.0d));
                    jSONObject.put("pull_cdn_ip", e2.optString("cdn_ip:", ""));
                    jSONObject.put("pull_play_url", e2.optString("url:", ""));
                    jSONObject.put("pull_download_speed", e2.optLong("download_Speed:", -1));
                }
            } else {
                jSONObject.put("preview_fps", (double) this.mPreviewFps);
                jSONObject.put("in_cap_fps", (double) this.mVideoCaptureFps);
                jSONObject.put("real_fps", this.mStreamFps);
            }
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public String getBatteryInfo() {
        float f2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("battery_level", d.a.f20222a.f20211d);
            jSONObject.put("temperature", (double) d.a.f20222a.f20210c);
            jSONObject.put("voltage", d.a.f20222a.f20216i);
            jSONObject.put("battery_scale", d.a.f20222a.f20212e);
            jSONObject.put("health", d.a.f20222a.f20214g);
            jSONObject.put("present", d.a.f20222a.f20215h);
            jSONObject.put("charge_status", d.a.f20222a.f20213f);
            Context e2 = y.e();
            float f3 = -1.0f;
            if (!a.c(e2)) {
                f2 = -1.0f;
            } else {
                f2 = ((float) a.a(e2).getLongProperty(2)) / 1000.0f;
            }
            jSONObject.put("battery_current", (double) f2);
            Context e3 = y.e();
            if (a.c(e3)) {
                f3 = ((float) a.a(e3).getLongProperty(3)) / 1000.0f;
            }
            jSONObject.put("battery_average", (double) f3);
            jSONObject.put("battery_energy", a.b(y.e()));
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public void reportBatteryDrainage() {
        String str;
        if (this.mSetting.f18993a) {
            int i2 = d.a.f20222a.f20211d;
            int i3 = this.mStartBatterLevel;
            int i4 = i3 - i2;
            if (i3 > 0 && i2 > 0 && i4 >= 0 && i4 < 100) {
                long currentTimeMillis = System.currentTimeMillis() - this.mStartMonitorTime;
                if (currentTimeMillis >= 10000) {
                    double d2 = (double) (i4 * 1000 * 100);
                    Double.isNaN(d2);
                    double d3 = (double) currentTimeMillis;
                    Double.isNaN(d3);
                    double d4 = (d2 * 1.0d) / d3;
                    HashMap hashMap = new HashMap();
                    hashMap.put("room_type", getRoomType(this.mStreamType));
                    if (this.isAnchor) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    hashMap.put("is_anchor", str);
                    hashMap.put("non_live_powder", new StringBuilder().append(this.mStartBatterLevel).toString());
                    hashMap.put("live_powder", String.valueOf(i2));
                    hashMap.put("live_duration", String.valueOf(currentTimeMillis));
                    b.a.a("livesdk_performance_monitor_battery_drainage").a((Map<String, String>) hashMap).a("battery_drainage_rate", Double.valueOf(d4)).a().b();
                }
            }
        }
    }

    public void setExtraParams(Map<String, String> map) {
        this.extraParams = map;
    }

    public void setIsAnchor(boolean z) {
        this.isAnchor = z;
    }

    public void setPreviewFps(float f2) {
        this.mPreviewFps = f2;
    }

    public void setStreamFps(double d2) {
        this.mStreamFps = d2;
    }

    public void setStreamType(i iVar) {
        this.mStreamType = iVar;
    }

    public void setVideoCaptureFps(float f2) {
        this.mVideoCaptureFps = f2;
    }

    public void onModuleStop(String str) {
        o oVar = this.mModulesManager;
        if (!TextUtils.isEmpty(str)) {
            oVar.f20282a.remove(str);
        }
    }

    public String getRoomType(i iVar) {
        if (iVar == i.OFFICIAL_ACTIVITY) {
            return "official";
        }
        if (iVar == i.SCREEN_RECORD) {
            return "game";
        }
        if (iVar == i.AUDIO) {
            return DataType.AUDIO;
        }
        if (iVar == i.THIRD_PARTY) {
            return "third_party";
        }
        return "video";
    }

    public String getTemperatureInfo(float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("value", (double) f2);
            float f3 = this.nonLiveTemperature;
            if (f3 > 0.0f) {
                jSONObject.put("non_live_value", (double) f3);
            }
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public void initStartValue(long j2) {
        if (check()) {
            this.mWorkHandler.postDelayed(new j(this), j2);
        }
    }

    public void monitorPerformance(String str) {
        if (!LivePerformanceMonitorSetting.INSTANCE.isOpen()) {
            monitorPerformance(str, 1);
        } else {
            monitorPerformance(str, 2);
        }
    }

    private JSONObject convertMapToJson(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    public long getDuration(int i2) {
        if (this.mSetting == null) {
            this.mSetting = LivePerformanceSettingSetting.INSTANCE.getValue();
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return 0;
                    }
                    if (this.mSetting.f18997e > 0) {
                        return this.mSetting.f18997e;
                    }
                    return this.mFpsDefaultDuration;
                } else if (this.mSetting.f18996d > 0) {
                    return this.mSetting.f18996d;
                } else {
                    return this.mDefaultMonitorDelay;
                }
            } else if (this.mSetting.f18995c > 0) {
                return this.mSetting.f18995c;
            } else {
                return this.mDefaultMinMonitorInterval;
            }
        } else if (this.mSetting.f18994b > 0) {
            return this.mSetting.f18994b;
        } else {
            return this.mDefaultMonitorInterval;
        }
    }

    public void reportPreviewFeedFirstFps(Double d2) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(this.anchorId));
        hashMap.put("room_type", getRoomType(this.mStreamType));
        if (this.isAnchor) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("is_anchor", str);
        hashMap.put("scene", "preview");
        hashMap.put("avg_fps", String.valueOf(d2));
        hashMap.put("room_id", String.valueOf(this.roomId));
        b.a.a("livesdk_performance_monitor_fps").a((Map<String, String>) hashMap).b();
    }

    private void addExtraParams(Map<String, String> map) {
        String str;
        String str2;
        Room room;
        if (map != null) {
            map.putAll(b.a.a("").d());
            if (!map.containsKey("room_id") && (room = (Room) DataChannelGlobal.f34575d.b(ac.class)) != null) {
                map.put("room_id", String.valueOf(room.getId()));
            }
            if (!map.containsKey("anchor_id")) {
                com.bytedance.android.live.base.model.user.b a2 = u.a().b().a();
                if (a2 instanceof User) {
                    map.put("anchor_id", ((User) a2).getIdStr());
                }
            }
            map.put("scene", this.mScene);
            map.put("room_type", getRoomType(this.mStreamType));
            String str3 = "1";
            if (this.isAnchor) {
                str = str3;
            } else {
                str = "0";
            }
            map.put("is_anchor", str);
            map.put("modules", getModuleInfo());
            if (d.a.f20222a.f20218k) {
                str2 = str3;
            } else {
                str2 = "0";
            }
            map.put("is_charging", str2);
            if (!((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).isAppForeground()) {
                str3 = "0";
            }
            map.put("is_foreground", str3);
        }
    }

    public void setExtraParams(long j2, long j3) {
        this.roomId = j2;
        this.anchorId = j3;
    }

    public void onModuleStart(String str, Map<String, String> map) {
        o oVar = this.mModulesManager;
        if (!TextUtils.isEmpty(str)) {
            oVar.f20282a.put(str, new o.a(str, map));
        }
    }

    public void reportFps(double d2, JSONObject jSONObject) {
        Handler handler;
        if ((d2 > 0.0d || jSONObject != null) && (handler = this.mMainHandler) != null) {
            handler.post(new n(this, d2, jSONObject));
        }
    }

    public String getCpuInfo(Map<String, Double> map, long j2) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    jSONObject.put("cpu_speed", map.get("cpu_speed"));
                    Map<String, Double> map2 = this.nonLiveCpu;
                    if (map2 != null) {
                        jSONObject.put("non_live_cpu_speed", map2.get("cpu_speed"));
                    }
                } else {
                    jSONObject.put("cpu_rate", map.get("cpu_rate"));
                    if (this.nonLiveCpu != null) {
                        jSONObject.put("non_live_cpu_rate", map.get("cpu_rate"));
                    }
                }
            } catch (Exception unused) {
            }
        }
        jSONObject.put("cost", j2);
        return jSONObject.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$reportFps$5$LivePerformanceManager(double d2, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        addExtraParams(hashMap);
        hashMap.put("avg_fps", String.valueOf(d2));
        if (jSONObject != null) {
            hashMap.put("frame_drop_info", jSONObject.toString());
        }
        b.a.a("livesdk_performance_monitor_fps").a((Map<String, String>) hashMap).b();
        if (this.isAnchor) {
            Map<String, String> map = this.extraParams;
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.putAll(b.a.a("").d());
            hashMap.put("device_score", String.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
            c.a("ttlive_broadcast_performance_all", 0, convertMapToJson(hashMap));
        }
    }

    public String getMemInfo(Map<String, Long> map, long j2) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                jSONObject.put("java_total", map.get("mem_java_total"));
                jSONObject.put("java_free", map.get("mem_java_free"));
                jSONObject.put("java_used", map.get("mem_java_used"));
                jSONObject.put("pss_dalvik", map.get("mem_pss_dalvik"));
                jSONObject.put("pss_native", map.get("mem_pss_native"));
                jSONObject.put("pss_total", map.get("mem_pss_total"));
                jSONObject.put("graphics", map.get("mem_graphics"));
                jSONObject.put("vmsize", map.get("mem_vmsize"));
            } catch (Exception unused) {
            }
        }
        Map<String, Long> map2 = this.nonLiveMem;
        if (map2 != null) {
            jSONObject.put("non_live_java_total", map2.get("mem_java_total"));
            jSONObject.put("non_live_java_free", this.nonLiveMem.get("mem_java_free"));
            jSONObject.put("non_live_java_used", this.nonLiveMem.get("mem_java_used"));
            jSONObject.put("non_live_pss_dalvik", this.nonLiveMem.get("mem_pss_dalvik"));
            jSONObject.put("non_live_pss_native", this.nonLiveMem.get("mem_pss_native"));
            jSONObject.put("non_live_pss_total", this.nonLiveMem.get("mem_pss_total"));
            jSONObject.put("non_live_graphics", this.nonLiveMem.get("mem_graphics"));
            jSONObject.put("non_live_vmsize", this.nonLiveMem.get("mem_vmsize"));
        }
        jSONObject.put("cost", j2);
        return jSONObject.toString();
    }

    public void monitorPerformance(String str, int i2) {
        if (check() && !this.isFPSMonitoring) {
            this.mScene = str;
            if (i2 == 1) {
                if (!this.isPerformanceMonitoring && checkMinInterval()) {
                    this.isPerformanceMonitoring = true;
                    this.mWorkHandler.removeCallbacks(this.performanceRunnable);
                    this.mWorkHandler.postDelayed(this.performanceRunnable, getDuration(3));
                } else {
                    return;
                }
            } else if (i2 == 2) {
                if (!this.isCollect && !this.isReport && checkMinCollectInterval() && checkMinReportInterval()) {
                    this.isCollect = true;
                    this.isReport = true;
                    this.mWorkHandler.removeCallbacks(this.performanceCollectRunnable);
                    this.mWorkHandler.postDelayed(this.performanceCollectRunnable, getDuration(3));
                    this.mWorkHandler.removeCallbacks(this.performanceReportRunnable);
                    this.mWorkHandler.postDelayed(this.performanceReportRunnable, getDuration(3));
                } else {
                    return;
                }
            } else if (i2 == 3) {
                if (!this.isCollect && checkMinCollectInterval()) {
                    this.isCollect = true;
                    this.mWorkHandler.removeCallbacks(this.performanceCollectRunnable);
                    this.mWorkHandler.postDelayed(this.performanceCollectRunnable, getDuration(3));
                    return;
                }
                return;
            } else if (i2 == 4) {
                if (!this.isReport && checkMinReportInterval()) {
                    this.isReport = true;
                    this.mWorkHandler.removeCallbacks(this.performanceReportRunnable);
                    this.mWorkHandler.postDelayed(this.performanceReportRunnable, getDuration(3));
                } else {
                    return;
                }
            }
            monitorFps();
            if (!"resident".equals(str) && this.isTimerMonitoring) {
                this.mWorkHandler.removeCallbacks(this.timerMonitorRunnable);
                this.mWorkHandler.postDelayed(this.timerMonitorRunnable, getDuration(1));
            }
        }
    }

    public void reportPerformance(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        Handler handler = this.mMainHandler;
        if (handler != null) {
            handler.post(new m(this, map, str, str2, str3, str4, str5));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$reportPerformance$4$LivePerformanceManager(Map map, String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        addExtraParams(hashMap);
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("cpu", str);
        hashMap.put("pss", str2);
        hashMap.put("thermal", str3);
        hashMap.put("stream", str4);
        hashMap.put("battery", str5);
        b.a.a("livesdk_performance_monitor_base").a((Map<String, String>) hashMap).b();
        if (this.isAnchor) {
            Map<String, String> map2 = this.extraParams;
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            hashMap.putAll(b.a.a("").d());
            hashMap.put("device_score", String.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
            c.a("ttlive_broadcast_performance_all", 0, convertMapToJson(hashMap));
        }
    }
}
