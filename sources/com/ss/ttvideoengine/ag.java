package com.ss.ttvideoengine;

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
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.ttvideoengine.s.j;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class ag extends BroadcastReceiver {

    /* renamed from: g  reason: collision with root package name */
    public static volatile int f152173g = 10;

    /* renamed from: i  reason: collision with root package name */
    public static int[] f152174i;

    /* renamed from: j  reason: collision with root package name */
    public static String[] f152175j;

    /* renamed from: k  reason: collision with root package name */
    public static int f152176k;

    /* renamed from: l  reason: collision with root package name */
    public static int f152177l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f152178m;
    public static boolean n;
    private static ag p;

    /* renamed from: a  reason: collision with root package name */
    public int f152179a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public int f152180b = 10;

    /* renamed from: c  reason: collision with root package name */
    public Lock f152181c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<WeakReference<ah>> f152182d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    int f152183e = 0;

    /* renamed from: f  reason: collision with root package name */
    c f152184f = null;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.ttvideoengine.g.a f152185h = null;
    private Thread o;
    private Timer q = null;
    private TimerTask r = null;

    static int c(int i2) {
        if (i2 == 20) {
            return 4;
        }
        switch (i2) {
            case 1:
            case 2:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case 16:
                return 2;
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
            case 17:
                return 3;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return 1;
            default:
                return 6;
        }
    }

    public final void a(WeakReference<ah> weakReference) {
        if (weakReference != null) {
            this.f152181c.lock();
            this.f152182d.add(weakReference);
            this.f152181c.unlock();
        }
    }

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        private static final ReentrantLock f152186d = new ReentrantLock();

        /* renamed from: e  reason: collision with root package name */
        private static a f152187e;

        /* renamed from: a  reason: collision with root package name */
        private Map<String, Double> f152188a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, Double> f152189b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, Integer> f152190c;

        /* renamed from: f  reason: collision with root package name */
        private int f152191f = -1;

        /* renamed from: g  reason: collision with root package name */
        private boolean f152192g = true;

        static {
            Covode.recordClassIndex(101450);
        }

        public final int c() {
            if (this.f152192g) {
                b();
                this.f152192g = false;
            }
            return this.f152191f;
        }

        public static a a() {
            if (f152187e == null) {
                ReentrantLock reentrantLock = f152186d;
                reentrantLock.lock();
                if (f152187e == null) {
                    f152187e = new a();
                }
                reentrantLock.unlock();
            }
            return f152187e;
        }

        private a() {
            HashMap hashMap = new HashMap();
            this.f152188a = hashMap;
            hashMap.put("-1", Double.valueOf(1.8d));
            this.f152188a.put("2", Double.valueOf(93.0d));
            this.f152188a.put("3", Double.valueOf(70.0d));
            this.f152188a.put("4", Double.valueOf(26.0d));
            this.f152188a.put("5", Double.valueOf(12.0d));
            this.f152188a.put("6", Double.valueOf(7.0d));
            this.f152188a.put("7", Double.valueOf(2.0d));
            Map<String, Double> map = this.f152188a;
            Double valueOf = Double.valueOf(1.0d);
            map.put("8", valueOf);
            HashMap hashMap2 = new HashMap();
            this.f152189b = hashMap2;
            hashMap2.put("excellent", valueOf);
            this.f152189b.put("good", Double.valueOf(2.4d));
            this.f152189b.put("unknown", Double.valueOf(5.4d));
            this.f152189b.put("medium", Double.valueOf(7.6d));
            this.f152189b.put("weak", Double.valueOf(20.6d));
            this.f152189b.put("unavailable", Double.valueOf(36.0d));
            HashMap hashMap3 = new HashMap();
            this.f152190c = hashMap3;
            hashMap3.put("1_1", 0);
            this.f152190c.put("1_2", 1);
            this.f152190c.put("1_3", 2);
            this.f152190c.put("2_1", 3);
            this.f152190c.put("2_2", 4);
            this.f152190c.put("1_4", 5);
            this.f152190c.put("2_3", 6);
            this.f152190c.put("3_1", 7);
            this.f152190c.put("3_2", 8);
            this.f152190c.put("3_3", 9);
            this.f152190c.put("2_4", 10);
            this.f152190c.put("3_4", 11);
            this.f152190c.put("4_1", 12);
            this.f152190c.put("4_2", 13);
            this.f152190c.put("4_3", 14);
            this.f152190c.put("4_4", 15);
        }

        public final void b() {
            double d2;
            double d3;
            if (!(this.f152188a == null || this.f152189b == null || this.f152190c == null)) {
                if (!ag.f152178m && ag.f152176k == 0) {
                    return;
                }
                if (ag.n || ag.f152177l != 0) {
                    int i2 = ag.f152176k;
                    if (ag.f152178m) {
                        i2 = ag.f152173g;
                    }
                    double d4 = 0.0d;
                    for (int i3 = 0; i3 < i2; i3++) {
                        try {
                            String valueOf = String.valueOf(ag.f152174i[i3]);
                            if (this.f152188a.containsKey(valueOf)) {
                                d3 = this.f152188a.get(valueOf).doubleValue();
                            } else {
                                d3 = 0.0d;
                            }
                            d4 += d3;
                        } catch (Exception e2) {
                            j.e("TTNetWorkListener", e2.toString());
                        }
                    }
                    double d5 = (double) i2;
                    Double.isNaN(d5);
                    d4 /= d5;
                    if (d4 >= 1.0d) {
                        int i4 = ag.f152177l;
                        if (ag.n) {
                            i4 = ag.f152173g;
                        }
                        double d6 = 0.0d;
                        for (int i5 = 0; i5 < i4; i5++) {
                            try {
                                String str = ag.f152175j[i5];
                                if (str != null) {
                                    if (this.f152189b.containsKey(str)) {
                                        d2 = this.f152189b.get(str).doubleValue();
                                    } else {
                                        d2 = 0.0d;
                                    }
                                    d6 += d2;
                                }
                            } catch (Exception e3) {
                                j.e("TTNetWorkListener", e3.toString());
                            }
                        }
                        double d7 = (double) i4;
                        Double.isNaN(d7);
                        d6 /= d7;
                        if (d6 >= 1.0d) {
                            StringBuilder sb = new StringBuilder();
                            if (d4 <= 2.0d) {
                                sb.append('1');
                            } else if (d4 <= 11.0d) {
                                sb.append('2');
                            } else if (d4 <= 26.0d) {
                                sb.append('3');
                            } else {
                                sb.append('4');
                            }
                            sb.append('_');
                            if (d6 == 1.0d) {
                                sb.append('1');
                            } else if (d6 <= 3.0d) {
                                sb.append('2');
                            } else if (d6 <= 7.0d) {
                                sb.append('3');
                            } else {
                                sb.append('4');
                            }
                            String sb2 = sb.toString();
                            int i6 = -1;
                            if (this.f152190c.containsKey(sb2)) {
                                i6 = this.f152190c.get(sb2).intValue();
                            }
                            this.f152191f = i6;
                            j.b("TTNetWorkListener", "rtt score:" + d4 + " sig score:" + d6 + " level:" + sb2);
                        }
                    }
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(101449);
    }

    private ag() {
        f152174i = new int[f152173g];
        f152175j = new String[f152173g];
    }

    /* access modifiers changed from: package-private */
    public static class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Context> f152193a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<ag> f152194b;

        static {
            Covode.recordClassIndex(101451);
        }

        public final void run() {
            Context context;
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            ag a2 = ag.a();
            Context context2 = this.f152193a.get();
            try {
                j.b("TTNetWorkListener", "enter start listen");
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
                Intent a3 = ag.a(context2, a2, intentFilter);
                a2.f152179a = ag.b(context2);
                if (a2.f152179a == 0) {
                    a2.f152180b = ag.a(context2, a3);
                }
                a2.f152184f = new c(context2, a2);
                c cVar = a2.f152184f;
                if (cVar.f152195a != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        try {
                            j.b("TTNetWorkListener", "start listen signal strength");
                            cVar.f152195a.listen(cVar, 256);
                        } catch (Exception unused) {
                            j.e("TTNetWorkListener", "listen signal strength failed");
                        }
                    }
                    cVar.f152195a.listen(cVar, 64);
                }
                a2.f152183e = 1;
            } catch (Exception unused2) {
                j.b("TTNetWorkListener", "start listen network state failed");
            }
            Looper.loop();
            ag agVar = this.f152194b.get();
            if (agVar != null && (context = this.f152193a.get()) != null && agVar.f152184f != null) {
                try {
                    context.unregisterReceiver(agVar);
                    c cVar2 = agVar.f152184f;
                    if (cVar2.f152195a != null) {
                        cVar2.f152195a.listen(cVar2, 0);
                    }
                } catch (Exception unused3) {
                    j.e("TTNetWorkListener", "Receiver has been unregistered!");
                }
            }
        }

        public b(Context context, ag agVar) {
            this.f152193a = new WeakReference<>(context);
            this.f152194b = new WeakReference<>(agVar);
        }
    }

    public static synchronized ag a() {
        ag agVar;
        synchronized (ag.class) {
            MethodCollector.i(13293);
            if (p == null) {
                p = new ag();
            }
            agVar = p;
            MethodCollector.o(13293);
        }
        return agVar;
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    static class c extends PhoneStateListener {

        /* renamed from: a  reason: collision with root package name */
        TelephonyManager f152195a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<ag> f152196b;

        static {
            Covode.recordClassIndex(101452);
        }

        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            if (signalStrength != null && Build.VERSION.SDK_INT >= 23) {
                ag agVar = null;
                WeakReference<ag> weakReference = this.f152196b;
                if (weakReference == null || (agVar = weakReference.get()) == null || agVar.f152179a != 0) {
                    int i2 = -1;
                    try {
                        i2 = signalStrength.getLevel();
                        if (i2 == 0) {
                            i2 = 1;
                        }
                    } catch (Exception unused) {
                        j.e("TTNetWorkListener", "failed to get signalStrength");
                    }
                    if (agVar != null) {
                        agVar.a(i2);
                    }
                }
            }
        }

        public c(Context context, ag agVar) {
            this.f152196b = new WeakReference<>(agVar);
            try {
                TelephonyManager telephonyManager = (TelephonyManager) a(context, "phone");
                if (telephonyManager != null) {
                    this.f152195a = telephonyManager;
                }
            } catch (Exception unused) {
                j.e("TTNetWorkListener", "create telephonyManager failed");
                this.f152195a = null;
            }
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(13154);
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
                        MethodCollector.o(13154);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        public final void onDataConnectionStateChanged(int i2, int i3) {
            WeakReference<ag> weakReference;
            ag agVar;
            super.onDataConnectionStateChanged(i2, i3);
            j.b("TTNetWorkListener", "data connection state changed, state: " + i2 + ", networkType: " + i3);
            if (i2 == 2 && (weakReference = this.f152196b) != null && (agVar = weakReference.get()) != null && agVar.f152179a != 0) {
                int c2 = ag.c(i3);
                j.b("TTNetWorkListener", "network change to: ".concat(String.valueOf(c2)));
                agVar.b(c2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (i2 != this.f152179a) {
            this.f152181c.lock();
            int i3 = this.f152179a;
            this.f152179a = i2;
            j.b("TTNetWorkListener", "access changed, from: " + i3 + " to: " + this.f152179a + " callback list size: " + this.f152182d.size());
            Iterator<WeakReference<ah>> it = this.f152182d.iterator();
            while (it.hasNext()) {
                ah ahVar = it.next().get();
                if (ahVar == null) {
                    it.remove();
                } else {
                    ahVar.a(0, i3, this.f152179a);
                }
            }
            this.f152181c.unlock();
        }
    }

    static int b(Context context) {
        NetworkInfo.State state;
        if (context == null) {
            return 1000;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) a(context, "connectivity");
        if (connectivityManager == null) {
            j.b("TTNetWorkListener", "disconnect");
            return -1;
        }
        NetworkInfo a2 = a(connectivityManager);
        if (a2 == null || !a2.isAvailable()) {
            j.b("TTNetWorkListener", "disconnect 1");
            return -1;
        }
        NetworkInfo a3 = a(connectivityManager, 1);
        if (a3 == null || (state = a3.getState()) == null || !(state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            try {
                NetworkInfo a4 = a(connectivityManager, 0);
                if (a4 != null) {
                    NetworkInfo.State state2 = a4.getState();
                    int subtype = a2.getSubtype();
                    j.b("TTNetWorkListener", "state: " + state2 + ", subtype: " + subtype);
                    if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                        return c(subtype);
                    }
                }
                return 1000;
            } catch (Exception e2) {
                j.e("TTNetWorkListener", e2.toString());
                return 1000;
            }
        } else {
            j.b("TTNetWorkListener", "wifi");
            return 0;
        }
    }

    public final void a(int i2) {
        if (i2 != this.f152180b) {
            this.f152181c.lock();
            int i3 = this.f152180b;
            this.f152180b = i2;
            j.a("TTNetWorkListener", "strength changed, from: " + i3 + " to: " + this.f152180b + " callback list size: " + this.f152182d.size());
            Iterator<WeakReference<ah>> it = this.f152182d.iterator();
            while (it.hasNext()) {
                ah ahVar = it.next().get();
                if (ahVar == null) {
                    it.remove();
                } else {
                    ahVar.a(1, i3, this.f152180b);
                }
            }
            this.f152181c.unlock();
        }
    }

    public final synchronized void a(Context context) {
        MethodCollector.i(13294);
        if (this.f152183e != 0) {
            MethodCollector.o(13294);
            return;
        }
        this.f152183e = 1;
        b bVar = new b(context, this);
        this.o = bVar;
        bVar.start();
        MethodCollector.o(13294);
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager, int i2) {
        try {
            return connectivityManager.getNetworkInfo(i2);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    static int a(Context context, Intent intent) {
        NetworkInfo a2;
        if (context == null) {
            return 10;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) a(context, "connectivity");
            if (connectivityManager == null || (a2 = a(connectivityManager, 1)) == null || !a2.isConnected() || context.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", context.getPackageName()) != 0) {
                return 10;
            }
            int i2 = -1;
            if (intent == null) {
                WifiInfo connectionInfo = ((WifiManager) a(context, "wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    i2 = connectionInfo.getRssi();
                }
            } else {
                i2 = intent.getIntExtra("newRssi", -70);
            }
            int calculateSignalLevel = WifiManager.calculateSignalLevel(i2, 4);
            j.b("TTNetWorkListener", "wifi dbm:" + i2 + ", level:" + calculateSignalLevel);
            return calculateSignalLevel + 1;
        } catch (Exception e2) {
            j.e("TTNetWorkListener", e2.toString());
            return 10;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast() && intent != null) {
            if ("android.net.wifi.RSSI_CHANGED".equals(intent.getAction()) && this.f152179a == 0) {
                a(a(context, intent));
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                j.b("TTNetWorkListener", "network broadcast:" + intent.getAction());
                b(b(context));
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13592);
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
                    MethodCollector.o(13592);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    public static android.content.Intent a(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = b(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.ag.a(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
