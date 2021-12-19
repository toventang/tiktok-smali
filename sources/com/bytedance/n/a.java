package com.bytedance.n;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.playerkit.model.v;
import java.lang.reflect.Field;

public final class a {
    private static final Object p = new Object();
    private static a t;

    /* renamed from: a  reason: collision with root package name */
    public int f41577a = -2;

    /* renamed from: b  reason: collision with root package name */
    public Context f41578b;

    /* renamed from: c  reason: collision with root package name */
    public String f41579c = "NOT_REGISTERED";

    /* renamed from: d  reason: collision with root package name */
    public String f41580d = "NOT_REGISTERED";

    /* renamed from: e  reason: collision with root package name */
    public int f41581e = -2;

    /* renamed from: f  reason: collision with root package name */
    public int f41582f = -2;

    /* renamed from: g  reason: collision with root package name */
    public int f41583g = -2;

    /* renamed from: h  reason: collision with root package name */
    public boolean f41584h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f41585i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final Object f41586j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public final Object f41587k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public final Object f41588l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public ConnectivityManager f41589m = null;
    public b n = null;
    public C1015a o = null;
    private final Object q = new Object();
    private TelephonyManager r = null;
    private WifiManager s = null;
    private int u = -2;
    private Handler v = null;

    static {
        Covode.recordClassIndex(25433);
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        try {
            int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
            if (this.u == defaultDataSubscriptionId) {
                return true;
            }
            TelephonyManager createForSubscriptionId = this.r.createForSubscriptionId(defaultDataSubscriptionId);
            this.r = createForSubscriptionId;
            createForSubscriptionId.listen(this.n, 321);
            this.u = defaultDataSubscriptionId;
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final synchronized int b() {
        int i2;
        MethodCollector.i(9601);
        if ("WIFI".equals(this.f41580d) && this.f41583g == -2) {
            try {
                WifiInfo connectionInfo = this.s.getConnectionInfo();
                if (connectionInfo != null && Build.VERSION.SDK_INT >= 21) {
                    this.f41583g = connectionInfo.getFrequency();
                }
            } catch (Throwable unused) {
                int i3 = this.f41583g;
                MethodCollector.o(9601);
                return i3;
            }
        }
        i2 = this.f41583g;
        MethodCollector.o(9601);
        return i2;
    }

    public final String c() {
        String str;
        MethodCollector.i(9765);
        if (Build.VERSION.SDK_INT < 24) {
            MethodCollector.o(9765);
            return "NOT_SUPPORTED";
        }
        synchronized (this.f41585i) {
            try {
                str = this.f41579c;
            } finally {
                MethodCollector.o(9765);
            }
        }
        return str;
    }

    public final String d() {
        String str;
        MethodCollector.i(9932);
        if (Build.VERSION.SDK_INT < 24) {
            MethodCollector.o(9932);
            return "NOT_SUPPORTED";
        }
        synchronized (this.f41587k) {
            try {
                str = this.f41580d;
            } finally {
                MethodCollector.o(9932);
            }
        }
        return str;
    }

    public final String toString() {
        return "NetworkQualityCollect{mGSMType='" + this.f41579c + '\'' + ", mNetworkType='" + this.f41580d + '\'' + ", mDataLevel=" + this.f41581e + ", mWifiLevel=" + this.f41582f + ", lastDataSim=" + this.u + '}';
    }

    /* renamed from: com.bytedance.n.a$a  reason: collision with other inner class name */
    class C1015a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(25435);
        }

        C1015a() {
        }

        private static NetworkInfo a(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                return com.ss.android.ugc.aweme.net.e.a.a();
            }
        }

        public final void onReceive(Context context, Intent intent) {
            MethodCollector.i(7540);
            try {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    NetworkInfo a2 = a(a.this.f41589m);
                    synchronized (a.this.f41587k) {
                        if (a2 == null) {
                            a.this.f41580d = "DISCONNECTED";
                            a.this.f41580d = "DISCONNECTED";
                        } else {
                            try {
                                if (a2.isConnected()) {
                                    a.this.a();
                                    a.this.f41580d = a2.getTypeName();
                                }
                                a.this.f41580d = "DISCONNECTED";
                            } catch (Throwable th) {
                                MethodCollector.o(7540);
                                throw th;
                            }
                        }
                    }
                    if ("DISCONNECTED".equals(a.this.f41580d)) {
                        synchronized (a.this.f41588l) {
                            try {
                                a.this.f41582f = -2;
                                a.this.f41583g = -2;
                            } finally {
                                MethodCollector.o(7540);
                            }
                        }
                        return;
                    }
                    MethodCollector.o(7540);
                } else if ("android.net.wifi.RSSI_CHANGED".equals(intent.getAction())) {
                    synchronized (a.this.f41588l) {
                        try {
                            int intExtra = intent.getIntExtra("newRssi", -70);
                            a aVar = a.this;
                            int i2 = 4;
                            if (intExtra <= -88) {
                                i2 = 0;
                            } else if (intExtra < -55) {
                                i2 = ((intExtra - -88) * 4) / 33;
                            }
                            aVar.f41582f = i2;
                        } finally {
                            MethodCollector.o(7540);
                        }
                    }
                } else {
                    MethodCollector.o(7540);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                MethodCollector.o(7540);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends PhoneStateListener {
        static {
            Covode.recordClassIndex(25436);
        }

        b() {
        }

        public final void onServiceStateChanged(ServiceState serviceState) {
            super.onServiceStateChanged(serviceState);
            try {
                a.this.a(serviceState.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            MethodCollector.i(8835);
            super.onSignalStrengthsChanged(signalStrength);
            synchronized (a.this.f41586j) {
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        try {
                            a.this.f41581e = signalStrength.getLevel();
                        } catch (Throwable unused) {
                        }
                    }
                } finally {
                    MethodCollector.o(8835);
                }
            }
        }

        public final void onDataConnectionStateChanged(int i2, int i3) {
            String str;
            MethodCollector.i(8524);
            super.onDataConnectionStateChanged(i2, i3);
            synchronized (a.this.f41585i) {
                try {
                    a.this.f41577a = i3;
                    a aVar = a.this;
                    switch (i3) {
                        case 1:
                            str = "GPRS";
                            break;
                        case 2:
                            str = "EDGE";
                            break;
                        case 3:
                            str = "UMTS";
                            break;
                        case 4:
                            str = "CDMA";
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            str = "CDMA - EvDo rev. 0";
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            str = "CDMA - EvDo rev. A";
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            str = "CDMA - 1xRTT";
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            str = "HSDPA";
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            str = "HSUPA";
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                            str = "HSPA";
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                            str = "iDEN";
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                            str = "CDMA - EvDo rev. B";
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                            str = "LTE";
                            break;
                        case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                            str = "CDMA - eHRPD";
                            break;
                        case 15:
                            str = "HSPA+";
                            break;
                        case 16:
                            str = "GSM";
                            break;
                        case 17:
                            str = "TD_SCDMA";
                            break;
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            str = "IWLAN";
                            break;
                        case 19:
                            str = "LTE_CA";
                            break;
                        case v.U /*{ENCODED_INT: 20}*/:
                            str = "NR";
                            break;
                        default:
                            str = "UNKNOWN";
                            break;
                    }
                    aVar.f41579c = str;
                } catch (Exception e2) {
                    e2.printStackTrace();
                } catch (Throwable th) {
                    MethodCollector.o(8524);
                    throw th;
                }
            }
            MethodCollector.o(8524);
        }
    }

    public static a a(Context context) {
        MethodCollector.i(9447);
        synchronized (p) {
            try {
                if (t == null) {
                    t = new a(context);
                }
            } catch (Throwable th) {
                MethodCollector.o(9447);
                throw th;
            }
        }
        a aVar = t;
        MethodCollector.o(9447);
        return aVar;
    }

    private a(Context context) {
        try {
            this.f41578b = context;
            this.r = (TelephonyManager) a(context, "phone");
            this.f41589m = (ConnectivityManager) a(this.f41578b, "connectivity");
            Context applicationContext = this.f41578b.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            this.s = (WifiManager) a(applicationContext, "wifi");
            HandlerThread handlerThread = new HandlerThread("listener_thread");
            handlerThread.start();
            AnonymousClass1 r1 = new Handler(handlerThread.getLooper()) {
                /* class com.bytedance.n.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(25434);
                }

                public final void handleMessage(Message message) {
                    if (message != null) {
                        super.handleMessage(message);
                        a.this.n = new b();
                        a.this.o = new C1015a();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        b(a.this.f41578b, a.this.o, intentFilter);
                        a.this.a();
                    }
                }

                private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
                private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
                    /*
                        android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
                        com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
                        android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.n.a.AnonymousClass1.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
                }
            };
            this.v = r1;
            r1.sendEmptyMessage(0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final boolean a(String str) {
        MethodCollector.i(9446);
        if (str == null) {
            MethodCollector.o(9446);
            return false;
        }
        synchronized (this.q) {
            try {
                this.f41584h = false;
                if (!TextUtils.isEmpty(str) && (str.contains("nrState=NOT_RESTRICTED") || str.contains("nrState=CONNECTED"))) {
                    this.f41584h = true;
                }
            } catch (Throwable th) {
                MethodCollector.o(9446);
                throw th;
            }
        }
        boolean z = this.f41584h;
        MethodCollector.o(9446);
        return z;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(9263);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(9263);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
