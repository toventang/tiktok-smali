package com.ss.videoarch.strategy;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.platform.godzilla.b.b.b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.videoarch.strategy.a.a.a;
import com.ss.videoarch.strategy.b.c;
import com.ss.videoarch.strategy.b.e;
import com.ss.videoarch.strategy.inferenceEngine.a.a;
import com.ss.videoarch.strategy.utils.a;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveStrategyManager extends NativeObject {
    public static com.ss.videoarch.strategy.inferenceEngine.a.a mDnsOptimizer;
    private static List<String> mLibraryList;
    public static com.ss.videoarch.strategy.a.a.a mLiveIOEngine;
    private static boolean mLoadSoSuccess;
    public static com.ss.videoarch.strategy.inferenceEngine.b.a mStaticConfigStrategy;
    private static volatile LiveStrategyManager sInstance;
    private final long DEFAULT_START_UP_DELAY;
    private final int DEFAULT_TIME_OUT = 5000;
    private a mAppInfoBundle;
    private Context mContext;
    public int mCount;
    public long mDelayTime;
    public int mEnableDnsOptimizer = -1;
    private int mEnableDomainType = 2;
    private int mEnableHttpDns = -1;
    private int mEnableIPV6Probe = -1;
    private int mEnableListenerThread = -1;
    private int mEnableLiveIO = -1;
    private int mEnableOpenPreconnect = -1;
    public int mEnablePerformanceOptimization = -1;
    private int mEnableRefresh = -1;
    private int mEnableStaticConfigDecison = -1;
    private int mEnableThreadTimeOut = -1;
    private int mEnableUseIpv6 = -1;
    private b mEngine = null;
    public Handler mHandler = new Handler(Looper.getMainLooper()) {
        /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass3 */

        static {
            Covode.recordClassIndex(102905);
        }

        public final void handleMessage(Message message) {
            if (message != null && message.what == 1024) {
                if (LiveStrategyManager.this.mEnableDnsOptimizer != 1 || LiveStrategyManager.mDnsOptimizer == null) {
                    c.a().f154423c.a(null);
                } else {
                    LiveStrategyManager.mDnsOptimizer.a(LiveStrategyManager.this.mOnParseDnsCompletionListener, (String) null);
                }
            }
        }
    };
    private boolean mIsRunning;
    public long mLastSessionTime;
    private long mLocalDnsTimeOut = 1;
    private a.c mOnDoPreconnectListener = new a.c() {
        /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass2 */

        static {
            Covode.recordClassIndex(102904);
        }

        @Override // com.ss.videoarch.strategy.inferenceEngine.a.a.c
        public final void a(String str, String str2) {
            JSONObject jSONObject;
            a.C4108a aVar;
            if (!(LiveStrategyManager.mLiveIOEngine == null || !LiveStrategyManager.this.mStartLiveIOPreconnect || LiveStrategyManager.mLiveIOEngine == null)) {
                com.ss.videoarch.strategy.a.a.a aVar2 = LiveStrategyManager.mLiveIOEngine;
                if (!(aVar2.f154392a.isEmpty() || aVar2.f154395d.isEmpty() || !aVar2.f154392a.contains(str))) {
                    if (!(aVar2.f154397f == null || !aVar2.f154397f.containsKey(str2) || (aVar = aVar2.f154397f.get(str2)) == null)) {
                        long j2 = aVar.f154402b;
                        if (j2 > 0 && System.currentTimeMillis() - j2 < aVar2.f154398g) {
                            return;
                        }
                    }
                    for (String str3 : aVar2.f154395d.keySet()) {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            int intValue = aVar2.f154395d.get(str3).intValue();
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("given_ips", str2);
                            jSONObject3.put("host", str);
                            jSONObject3.put("port", intValue);
                            jSONObject3.put("suggest_protocol", str3);
                            jSONObject2.put("url_info", jSONObject3.toString());
                            if (aVar2.f154396e.containsKey(str3) && (jSONObject = aVar2.f154396e.get(str3)) != null) {
                                jSONObject2.put("preconn_params", jSONObject.toString());
                            }
                            if (aVar2.f154393b != null) {
                                String.valueOf(jSONObject2.toString());
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        }
    };
    public a.d mOnParseDnsCompletionListener = new a.d() {
        /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(102902);
        }

        @Override // com.ss.videoarch.strategy.inferenceEngine.a.a.d
        public final void a(final String str) {
            if (LiveStrategyManager.this.mEnablePerformanceOptimization == 1) {
                LiveStrategyManager.this.mHandler.post(new Runnable() {
                    /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(102903);
                    }

                    public final void run() {
                        c.a().f154423c.a(str, LiveStrategyManager.this.mHandler);
                    }
                });
            } else {
                c.a().f154423c.a(str);
            }
        }
    };
    private Boolean mRetryFlag = false;
    private int mSendHttpDnsByLocalDnsTimeout = -1;
    private e.a mSettingsListener;
    public boolean mStartLiveIOPreconnect = false;
    public long mStartUpDelay;
    private Boolean mStaticConfigInitFlag = false;
    private com.ss.videoarch.strategy.b.a.a mStaticConfigSettings = null;
    public long mTTLMs = 300000;
    private ThreadPoolExecutor mThreadPool;
    private final BroadcastReceiver networkReceiver = new BroadcastReceiver() {
        /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass4 */

        static {
            Covode.recordClassIndex(102906);
        }

        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                return;
            }
            if (LiveStrategyManager.isNetworkAvailable(context)) {
                if (LiveStrategyManager.mDnsOptimizer != null) {
                    LiveStrategyManager.this.mHandler.removeMessages(1024);
                    LiveStrategyManager.this.mHandler.post(new Runnable() {
                        /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass4.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(102908);
                        }

                        public final void run() {
                            LiveStrategyManager.mDnsOptimizer.a();
                            LiveStrategyManager.mDnsOptimizer.y = false;
                            LiveStrategyManager.mDnsOptimizer.z = -1;
                            LiveStrategyManager.mDnsOptimizer.a(LiveStrategyManager.this.mOnParseDnsCompletionListener, (String) null);
                        }
                    });
                }
                if (LiveStrategyManager.mLiveIOEngine != null) {
                    com.ss.videoarch.strategy.a.a.a aVar = LiveStrategyManager.mLiveIOEngine;
                    if (aVar.f154397f != null && !aVar.f154397f.isEmpty()) {
                        aVar.f154397f.clear();
                    }
                }
            } else if (LiveStrategyManager.mDnsOptimizer != null) {
                LiveStrategyManager.this.mHandler.removeMessages(1024);
                LiveStrategyManager.this.mHandler.post(new Runnable() {
                    /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass4.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(102907);
                    }

                    public final void run() {
                        LiveStrategyManager.mDnsOptimizer.a();
                    }
                });
            }
        }
    };

    public static int com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    private native void nativeCreate();

    private native String nativeGetConfigAndStrategyBundle(int i2, String str);

    private native double nativeGetDoubleConfigAndStrategyByKey(int i2, double d2, String str);

    private native float nativeGetFloatConfigAndStrategyByKey(int i2, float f2, String str);

    private native int nativeGetIntConfigAndStrategyByKey(int i2, int i3, String str);

    private native Object nativeGetJObjectConfigAndStrategyByKey(int i2, JSONObject jSONObject, String str);

    private native long nativeGetLongConfigAndStrategyByKey(int i2, long j2, String str);

    private native String nativeGetStringConfigAndStrategyByKey(int i2, String str, String str2);

    private native void nativeSetStreamInfo(String str);

    private native void nativeStart();

    private native void nativeStop();

    private native void nativeStopSession(JSONObject jSONObject);

    public <T> T getInfo(String str, T t) {
        return null;
    }

    public void createHandleForChildThread() {
        this.mHandler = new Handler(Looper.myLooper()) {
            /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass7 */

            static {
                Covode.recordClassIndex(102911);
            }

            public final void handleMessage(Message message) {
                com.ss.videoarch.strategy.inferenceEngine.b.a.a aVar;
                if (message != null && message.what == 1024) {
                    if (LiveStrategyManager.this.mEnablePerformanceOptimization == 1) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!(LiveStrategyManager.mStaticConfigStrategy == null || LiveStrategyManager.mStaticConfigStrategy.f154510l == null || (aVar = LiveStrategyManager.mStaticConfigStrategy.f154511m.get(LiveStrategyManager.mStaticConfigStrategy.f154510l)) == null)) {
                            LiveStrategyManager.this.mLastSessionTime = aVar.f154515d;
                        }
                        if ((currentTimeMillis - LiveStrategyManager.this.mLastSessionTime) - (LiveStrategyManager.this.mTTLMs + LiveStrategyManager.this.mDelayTime) > 0) {
                            LiveStrategyManager.this.mCount++;
                        } else {
                            LiveStrategyManager liveStrategyManager = LiveStrategyManager.this;
                            int i2 = liveStrategyManager.mCount - 1;
                            liveStrategyManager.mCount = i2;
                            liveStrategyManager.mCount = Math.max(i2, 0);
                        }
                        LiveStrategyManager liveStrategyManager2 = LiveStrategyManager.this;
                        liveStrategyManager2.mDelayTime = (long) (Math.min(liveStrategyManager2.mCount * LiveStrategyManager.this.mCount, 10) * 60 * 1000);
                        LiveStrategyManager.this.mHandler.postDelayed(new Runnable() {
                            /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass7.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(102912);
                            }

                            public final void run() {
                                if (LiveStrategyManager.this.mEnableDnsOptimizer != 1 || LiveStrategyManager.mDnsOptimizer == null) {
                                    c.a().f154423c.a(null, LiveStrategyManager.this.mHandler);
                                } else {
                                    LiveStrategyManager.mDnsOptimizer.a(LiveStrategyManager.this.mOnParseDnsCompletionListener, (String) null);
                                }
                            }
                        }, LiveStrategyManager.this.mDelayTime);
                    } else if (LiveStrategyManager.this.mEnableDnsOptimizer != 1 || LiveStrategyManager.mDnsOptimizer == null) {
                        c.a().f154423c.a(null);
                    } else {
                        LiveStrategyManager.mDnsOptimizer.a(LiveStrategyManager.this.mOnParseDnsCompletionListener, (String) null);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadGroup f154389a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicInteger f154390b;

        /* renamed from: c  reason: collision with root package name */
        private final String f154391c;

        static {
            Covode.recordClassIndex(102914);
        }

        private a() {
            ThreadGroup threadGroup;
            this.f154390b = new AtomicInteger(1);
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f154389a = threadGroup;
            this.f154391c = "live-stream-strategy-";
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            MethodCollector.i(6202);
            Thread thread = new Thread(this.f154389a, runnable, this.f154391c + this.f154390b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 1) {
                thread.setPriority(1);
            }
            MethodCollector.o(6202);
            return thread;
        }
    }

    static {
        Covode.recordClassIndex(102901);
        List asList = Arrays.asList("livestrategy");
        ArrayList arrayList = new ArrayList();
        mLibraryList = arrayList;
        arrayList.addAll(asList);
        for (String str : mLibraryList) {
            mLoadSoSuccess = loadLibrary(str);
        }
    }

    public static LiveStrategyManager inst() {
        MethodCollector.i(7082);
        if (sInstance == null) {
            synchronized (LiveStrategyManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LiveStrategyManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7082);
                    throw th;
                }
            }
        }
        LiveStrategyManager liveStrategyManager = sInstance;
        MethodCollector.o(7082);
        return liveStrategyManager;
    }

    public void stop() {
        MethodCollector.i(7539);
        if (!this.mIsRunning) {
            MethodCollector.o(7539);
            return;
        }
        this.mIsRunning = false;
        this.mStaticConfigInitFlag = false;
        this.mHandler.removeMessages(1024);
        this.mContext.unregisterReceiver(this.networkReceiver);
        if (mDnsOptimizer != null) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(102913);
                }

                public final void run() {
                    com.ss.videoarch.strategy.inferenceEngine.a.a aVar = LiveStrategyManager.mDnsOptimizer;
                    if (aVar.f154463h) {
                        aVar.f154462f.clear();
                        com.ss.videoarch.strategy.inferenceEngine.a.a.f154456e.clear();
                        aVar.f154463h = false;
                    }
                }
            });
        }
        if (this.mSettingsListener != null) {
            e eVar = c.a().f154423c;
            eVar.f154433a.remove(this.mSettingsListener);
            this.mSettingsListener = null;
        }
        if (mLoadSoSuccess) {
            nativeStop();
        }
        MethodCollector.o(7539);
    }

    private void updateStaticConfigStrategy() {
        JSONObject optJSONObject;
        com.ss.videoarch.strategy.b.a.a aVar = this.mStaticConfigSettings;
        if (aVar != null) {
            JSONObject b2 = aVar.b("2");
            com.ss.videoarch.strategy.inferenceEngine.b.a aVar2 = mStaticConfigStrategy;
            if (!(b2 == null || !b2.has("AutoStartPlayBufferParam") || (optJSONObject = b2.optJSONObject("AutoStartPlayBufferParam")) == null)) {
                aVar2.f154504f = optJSONObject.optInt("MinStartPlayBuffer");
                aVar2.f154505g = optJSONObject.optInt("MaxStartPlayBuffer");
                aVar2.f154506h = optJSONObject.optDouble("AttenuationCoefficient");
                aVar2.f154507i = optJSONObject.optInt("AttenuationTimeOffset");
            }
            double d2 = 0.0d;
            double d3 = 0.0d;
            for (int i2 = 0; i2 < aVar2.f154508j.length; i2++) {
                d3 += Math.cbrt((double) (8 - aVar2.f154508j[i2]));
            }
            int i3 = aVar2.f154505g - aVar2.f154504f;
            int i4 = aVar2.f154504f;
            int i5 = 1;
            while (i5 < aVar2.f154508j.length) {
                d2 += Math.cbrt((double) (8 - aVar2.f154508j[i5]));
                double d4 = (double) aVar2.f154504f;
                double d5 = (double) i3;
                Double.isNaN(d5);
                Double.isNaN(d4);
                int i6 = (int) (d4 + ((d2 / d3) * d5));
                aVar2.f154509k.put(Integer.valueOf(aVar2.f154508j[i5 - 1]), new Pair(Integer.valueOf(i4), Integer.valueOf(i6)));
                i5++;
                i4 = i6;
            }
            if (i5 == aVar2.f154508j.length) {
                aVar2.f154509k.put(Integer.valueOf(aVar2.f154508j[i5 - 1]), new Pair(Integer.valueOf(i4), Integer.valueOf(aVar2.f154505g)));
            }
            this.mStaticConfigInitFlag = true;
        }
    }

    public void start() {
        MethodCollector.i(7487);
        if (this.mIsRunning) {
            com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_w("LiveStrategyManager", "livestrategy is already running");
            MethodCollector.o(7487);
            return;
        }
        this.mIsRunning = true;
        com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_w("LiveStrategyManager", "start livestrategy");
        com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(this.mContext, this.networkReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        initBySettingsBuddle();
        if (this.mEnableDnsOptimizer == 1) {
            com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_w("LiveStrategyManager", "enable dns optimizer");
            com.ss.videoarch.strategy.inferenceEngine.a.a aVar = new com.ss.videoarch.strategy.inferenceEngine.a.a(this.mOnParseDnsCompletionListener, this.mEnableThreadTimeOut);
            mDnsOptimizer = aVar;
            aVar.n = this.mEnableHttpDns;
            mDnsOptimizer.q = this.mSendHttpDnsByLocalDnsTimeout;
            mDnsOptimizer.f154468m = this.mEnableUseIpv6;
            mDnsOptimizer.r = this.mEnableDomainType;
            mDnsOptimizer.s = this.mLocalDnsTimeOut;
            mDnsOptimizer.v = this.mEnableOpenPreconnect;
            mDnsOptimizer.t = this.mEnablePerformanceOptimization;
            mDnsOptimizer.w = this.mEnableListenerThread;
            mDnsOptimizer.x = this.mEnableRefresh;
            if (this.mEnableOpenPreconnect == 1 && this.mEnableLiveIO == 1) {
                mDnsOptimizer.f154459b = this.mOnDoPreconnectListener;
                com.ss.videoarch.strategy.a.a.a aVar2 = new com.ss.videoarch.strategy.a.a.a(this.mEngine);
                mLiveIOEngine = aVar2;
                aVar2.f154394c = this.mAppInfoBundle;
                mLiveIOEngine.a(com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(this.mContext).getAbsolutePath() + "/pullstream.scfg");
            }
            mDnsOptimizer.o = this.mEnableIPV6Probe;
        }
        mStaticConfigStrategy = new com.ss.videoarch.strategy.inferenceEngine.b.a();
        com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_w("LiveStrategyManager", "enable static config strategy");
        if (this.mEnablePerformanceOptimization == 1) {
            this.mThreadPool.execute(new Runnable() {
                /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(102910);
                }

                public final void run() {
                    MethodCollector.i(6213);
                    Looper.prepare();
                    LiveStrategyManager.this.createHandleForChildThread();
                    LiveStrategyManager.mDnsOptimizer.f154461d = LiveStrategyManager.this.mHandler;
                    if (LiveStrategyManager.this.mStartUpDelay != 0) {
                        try {
                            Thread.sleep(LiveStrategyManager.this.mStartUpDelay);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                    c.a().f154423c.a(null, LiveStrategyManager.this.mHandler);
                    Looper.loop();
                    MethodCollector.o(6213);
                }
            });
        } else {
            c.a().f154423c.a(null);
        }
        if (mLoadSoSuccess) {
            nativeStart();
        }
        MethodCollector.o(7487);
    }

    public void initBySettingsBuddle() {
        a aVar = this.mAppInfoBundle;
        if (aVar != null) {
            this.mEnableDnsOptimizer = ((Integer) aVar.a("live_stream_open_optimizer_enable", 0)).intValue();
            this.mEnableUseIpv6 = ((Integer) this.mAppInfoBundle.a("live_stream_strategy_enable_ipv6", 0)).intValue();
            this.mEnableHttpDns = ((Integer) this.mAppInfoBundle.a("live_stream_strategy_enable_httpdns", 0)).intValue();
            this.mSendHttpDnsByLocalDnsTimeout = ((Integer) this.mAppInfoBundle.a("live_stream_strategy_send_httpdns_by_localdns_timeout", 0)).intValue();
            this.mEnableDomainType = ((Integer) this.mAppInfoBundle.a("live_stream_strategy_enable_domain_type", 2)).intValue();
            this.mLocalDnsTimeOut = ((Long) this.mAppInfoBundle.a("live_stream_strategy_localdns_timeout", 5000L)).longValue();
            this.mEnableStaticConfigDecison = ((Integer) this.mAppInfoBundle.a("live_stream_strategy_enable_flv_strategy", 0)).intValue();
            this.mEnablePerformanceOptimization = ((Integer) this.mAppInfoBundle.a("live_stream_strategy_enable_performance_optimization", 0)).intValue();
            this.mStartUpDelay = ((Long) this.mAppInfoBundle.a("live_stream_strategy_start_up_delay", 0L)).longValue();
            this.mEnableOpenPreconnect = ((Integer) this.mAppInfoBundle.a("live_stream_strategy_enable_open_preonnect", 1)).intValue();
            this.mEnableLiveIO = ((Integer) this.mAppInfoBundle.a("live_sdk_enable_liveio", 1)).intValue();
            this.mEnableIPV6Probe = ((Integer) this.mAppInfoBundle.a("live_stream_strategy_enable_ipv6_probe", 0)).intValue();
            this.mEnableListenerThread = ((Integer) this.mAppInfoBundle.a("live_stream_strategy_enable_listener", 1)).intValue();
            this.mEnableRefresh = ((Integer) this.mAppInfoBundle.a("live_stream_strategy_enable_refresh", 1)).intValue();
            this.mEnableThreadTimeOut = ((Integer) this.mAppInfoBundle.a("live_stream_strategy_enable_thread_timeout", 1)).intValue();
        }
    }

    public void setAppInfoBundle(a aVar) {
        this.mAppInfoBundle = aVar;
    }

    public static NetworkInfo com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static File com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "connectivity");
            if (connectivityManager == null || (com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo = com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo(connectivityManager)) == null || !com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_net_lancet_ConnecttivityManagerLancet_getActiveNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void setIFunctionCalledByStrategyEngine(b bVar) {
        com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveStrategyManager", "setIFunctionCalledByStrategyEngine, engine: ".concat(String.valueOf(bVar)));
        this.mEngine = bVar;
        if (mLiveIOEngine != null) {
            com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_w("LiveStrategyManager", "set liveio engine");
            mLiveIOEngine.f154393b = bVar;
        }
    }

    private static boolean loadLibrary(String str) {
        try {
            a.AbstractC4110a aVar = com.ss.videoarch.strategy.utils.a.f154522a;
            if (!TextUtils.isEmpty(str)) {
                if (aVar == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Librarian.a(str);
                    m.a(uptimeMillis, str);
                }
                com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_d("LiveStrategyManager", "load library: " + str + ".so success");
                return true;
            }
            throw new Exception("Invalid library name.");
        } catch (Throwable th) {
            com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_LogLancet_e("LiveStrategyManager", "load library: " + str + ".so fail! " + th.getMessage());
            return false;
        }
    }

    public void init(Context context) {
        MethodCollector.i(7376);
        this.mContext = context;
        if (mLoadSoSuccess) {
            nativeCreate();
        }
        if (this.mSettingsListener == null) {
            this.mSettingsListener = new e.a() {
                /* class com.ss.videoarch.strategy.LiveStrategyManager.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(102909);
                }

                @Override // com.ss.videoarch.strategy.b.e.a
                public final void a(com.ss.videoarch.strategy.b.a.a aVar, String str) {
                    if (str == null) {
                        LiveStrategyManager.this.updateGlobalSettings(aVar);
                    } else if (LiveStrategyManager.this.mEnableDnsOptimizer == 1 && LiveStrategyManager.mDnsOptimizer != null) {
                        LiveStrategyManager.mDnsOptimizer.a(aVar, str);
                    }
                }
            };
            e eVar = c.a().f154423c;
            eVar.f154433a.add(this.mSettingsListener);
        }
        ThreadPoolExecutor threadPoolExecutor = c.a().f154424d;
        if (threadPoolExecutor == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a((byte) 0));
            this.mThreadPool = threadPoolExecutor2;
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            MethodCollector.o(7376);
            return;
        }
        this.mThreadPool = threadPoolExecutor;
        MethodCollector.o(7376);
    }

    public void stopSession(JSONObject jSONObject) {
        MethodCollector.i(7910);
        com.ss.videoarch.strategy.inferenceEngine.b.a aVar = mStaticConfigStrategy;
        if (aVar != null) {
            com.ss.videoarch.strategy.inferenceEngine.b.a.a aVar2 = new com.ss.videoarch.strategy.inferenceEngine.b.a.a();
            if (jSONObject != null) {
                aVar2.f154512a = jSONObject.optString("sessionId");
                aVar2.f154513b = jSONObject.optInt("stallTotalCount");
                aVar2.f154514c = jSONObject.optInt("retryTotalCount");
                aVar2.f154515d = System.currentTimeMillis();
                aVar.f154510l = jSONObject.optString("sessionId");
                aVar.f154511m.put(aVar.f154510l, aVar2);
            }
        }
        if (mLoadSoSuccess) {
            nativeStopSession(jSONObject);
        }
        MethodCollector.o(7910);
    }

    public void updateGlobalSettings(com.ss.videoarch.strategy.b.a.a aVar) {
        com.ss.videoarch.strategy.inferenceEngine.a.a aVar2;
        this.mStaticConfigSettings = aVar;
        if (this.mEnableStaticConfigDecison == 1 && mStaticConfigStrategy != null && !this.mStaticConfigInitFlag.booleanValue()) {
            updateStaticConfigStrategy();
        }
        long j2 = 300000;
        if (((long) (aVar.f154409c * 1000)) >= 300000) {
            j2 = (long) (aVar.f154409c * 1000);
        }
        this.mTTLMs = j2;
        if (this.mEnableDnsOptimizer == 1 && (aVar2 = mDnsOptimizer) != null) {
            aVar2.a(this.mStaticConfigSettings, (String) null);
        }
        this.mHandler.removeMessages(1024);
        this.mHandler.sendEmptyMessageDelayed(1024, this.mTTLMs);
    }

    public <T> T getAppInfoForKey(String str, T t) {
        a aVar = this.mAppInfoBundle;
        return (aVar == null || str == null) ? t : (T) aVar.a(str, t);
    }

    public long getInt64Value(String str, long j2) {
        return ((Long) getAppInfoForKey(str, Long.valueOf(j2))).longValue();
    }

    public String getConfigAndStrategyBundle(int i2, String str) {
        String str2;
        JSONObject b2;
        if (!this.mIsRunning) {
            return null;
        }
        if (i2 == 0) {
            str2 = "2";
            com.ss.videoarch.strategy.b.a.a aVar = this.mStaticConfigSettings;
            return b2.toString();
        } else if (i2 == 1) {
            str2 = "1";
            com.ss.videoarch.strategy.b.a.a aVar2 = this.mStaticConfigSettings;
            if (!(aVar2 == null || (b2 = aVar2.b(str2)) == null)) {
                return b2.toString();
            }
        }
        return null;
    }

    public float getFloatValue(int i2, float f2) {
        String str;
        if (i2 != 12) {
            str = null;
        } else {
            str = "attenuation_coefficient";
        }
        return ((Float) getAppInfoForKey(str, Float.valueOf(f2))).floatValue();
    }

    public int getIntValue(int i2, int i3) {
        String str;
        switch (i2) {
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                str = "min_start_play_buffer";
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                str = "max_start_play_buffer";
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                str = "attenuation_time_offset";
                break;
            default:
                str = null;
                break;
        }
        return ((Integer) getAppInfoForKey(str, Integer.valueOf(i3))).intValue();
    }

    public static Object com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(7305);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(7305);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public void setStreamInfo(String str, String str2, String str3) {
        MethodCollector.i(7853);
        if (mLoadSoSuccess) {
            nativeSetStreamInfo(str3);
        }
        MethodCollector.o(7853);
    }

    public static Intent com_ss_videoarch_strategy_LiveStrategyManager_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = com_ss_videoarch_strategy_LiveStrategyManager_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.LiveStrategyManager.com_ss_videoarch_strategy_LiveStrategyManager_com_ss_android_ugc_aweme_lancet_receiver_ReceiverRegisterLancet_registerReceiver(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public void notifyInfo(int i2, int i3, String str) {
        com.ss.videoarch.strategy.a.a.a aVar;
        if (i2 == 2 && i3 == 0 && (aVar = mLiveIOEngine) != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String str2 = "";
                if (jSONObject.has("ip")) {
                    str2 = jSONObject.optString("ip");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                }
                if (aVar.f154397f != null) {
                    aVar.f154397f.size();
                    if (aVar.f154397f.size() >= aVar.f154399h) {
                        aVar.a();
                    }
                    aVar.f154397f.put(str2, new a.C4108a(jSONObject, System.currentTimeMillis()));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public <T> T getConfigAndStrategyByKeyStr(int i2, String str, T t, String str2) {
        String str3;
        com.ss.videoarch.strategy.b.a.a aVar;
        T t2;
        if (!this.mIsRunning) {
            return t;
        }
        if (i2 == 0) {
            str3 = "2";
            aVar = this.mStaticConfigSettings;
            if (aVar != null) {
                return t;
            }
        } else if (i2 == 1) {
            str3 = "1";
            aVar = this.mStaticConfigSettings;
            if (aVar != null || (t2 = (T) aVar.a(str3, str)) == null) {
                return t;
            }
            return JSONObject.class.equals(t2.getClass()) ? (T) t2.toString() : t2;
        }
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getConfigAndStrategyByKeyInt(int r7, int r8, T r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.videoarch.strategy.LiveStrategyManager.getConfigAndStrategyByKeyInt(int, int, java.lang.Object, java.lang.String):java.lang.Object");
    }
}
