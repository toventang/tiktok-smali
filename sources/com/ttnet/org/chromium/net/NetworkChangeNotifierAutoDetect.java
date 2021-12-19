package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.lancet.i;
import com.ttnet.org.chromium.base.ApplicationStatus;
import java.lang.reflect.Field;
import java.util.Arrays;

public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {

    /* renamed from: h  reason: collision with root package name */
    private static final String f155385h = NetworkChangeNotifierAutoDetect.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final e f155386a;

    /* renamed from: b  reason: collision with root package name */
    public final f f155387b;

    /* renamed from: c  reason: collision with root package name */
    public a f155388c = new a(com.ttnet.org.chromium.base.c.f155223a);

    /* renamed from: d  reason: collision with root package name */
    public g f155389d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f155390e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f155391f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f155392g;

    /* renamed from: i  reason: collision with root package name */
    private final Looper f155393i;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f155394j;

    /* renamed from: k  reason: collision with root package name */
    private final NetworkConnectivityIntentFilter f155395k;

    /* renamed from: l  reason: collision with root package name */
    private b f155396l;

    /* renamed from: m  reason: collision with root package name */
    private c f155397m;
    private NetworkRequest n;
    private d o;
    private boolean p;

    public interface e {
        static {
            Covode.recordClassIndex(103393);
        }

        void a(int i2);

        void a(long j2);

        void a(long j2, int i2);

        void a(long[] jArr);

        void b(int i2);

        void b(long j2);
    }

    public static int a(int i2, int i3) {
        int i4 = 5;
        if (i2 == 0) {
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return 3;
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                case ABRConfig.ABR_SELECT_SCENE:
                case 15:
                    return 4;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return 5;
                default:
                    return 0;
            }
        } else if (i2 == 1) {
            return 2;
        } else {
            if (i2 != 6) {
                i4 = 7;
                if (i2 != 7) {
                    return i2 != 9 ? 0 : 1;
                }
            }
            return i4;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ boolean f155399b = true;

        /* renamed from: a  reason: collision with root package name */
        final ConnectivityManager f155400a;

        a() {
        }

        static {
            Covode.recordClassIndex(103384);
        }

        /* access modifiers changed from: protected */
        public final Network[] b() {
            Network[] networkArr;
            try {
                networkArr = this.f155400a.getAllNetworks();
            } catch (Throwable unused) {
                networkArr = null;
            }
            if (networkArr == null) {
                return new Network[0];
            }
            return networkArr;
        }

        /* access modifiers changed from: package-private */
        public final Network c() {
            Network network;
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    network = com.ttnet.org.chromium.base.a.a.b(this.f155400a);
                } catch (Throwable unused) {
                    network = null;
                }
                if (network != null) {
                    return network;
                }
            } else {
                network = null;
            }
            try {
                NetworkInfo a2 = a(this.f155400a);
                if (a2 == null) {
                    return null;
                }
                Network[] a3 = NetworkChangeNotifierAutoDetect.a(this, (Network) null);
                for (Network network2 : a3) {
                    NetworkInfo d2 = d(network2);
                    if (d2 != null && (d2.getType() == a2.getType() || d2.getType() == 17)) {
                        if (f155399b || network == null) {
                            network = network2;
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
                return network;
            } catch (Throwable unused2) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public final d a() {
            NetworkInfo networkInfo;
            Network network;
            boolean z;
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    network = c();
                    networkInfo = com.ttnet.org.chromium.base.a.a.a(this.f155400a, network);
                } else {
                    networkInfo = a(this.f155400a);
                    network = null;
                }
                if (networkInfo != null && (networkInfo.isConnected() || (Build.VERSION.SDK_INT >= 21 && networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED && ApplicationStatus.getStateForApplication() == 1))) {
                    if (network != null) {
                        try {
                            int type = networkInfo.getType();
                            int subtype = networkInfo.getSubtype();
                            String valueOf = String.valueOf(NetworkChangeNotifierAutoDetect.a(network));
                            if (Build.VERSION.SDK_INT < 28 || !AndroidNetworkLibrary.a(this.f155400a.getLinkProperties(network))) {
                                z = false;
                            } else {
                                z = true;
                            }
                            return new d(true, type, subtype, valueOf, z);
                        } catch (Throwable unused) {
                            return new d(false, -1, -1, null, false);
                        }
                    } else if (!f155399b && Build.VERSION.SDK_INT >= 23) {
                        throw new AssertionError();
                    } else if (networkInfo.getType() != 1) {
                        return new d(true, networkInfo.getType(), networkInfo.getSubtype(), null, false);
                    } else {
                        if (networkInfo.getExtraInfo() == null || "".equals(networkInfo.getExtraInfo())) {
                            return new d(true, networkInfo.getType(), networkInfo.getSubtype(), "", false);
                        }
                        return new d(true, networkInfo.getType(), networkInfo.getSubtype(), networkInfo.getExtraInfo(), false);
                    }
                }
            } catch (Throwable unused2) {
            }
            return new d(false, -1, -1, null, false);
        }

        /* access modifiers changed from: package-private */
        public final void a(ConnectivityManager.NetworkCallback networkCallback) {
            try {
                this.f155400a.unregisterNetworkCallback(networkCallback);
            } catch (Throwable unused) {
            }
        }

        a(Context context) {
            this.f155400a = (ConnectivityManager) a(context, "connectivity");
        }

        private static NetworkInfo a(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                return com.ss.android.ugc.aweme.net.e.a.a();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
            return a(r1.f155400a, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            return null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.net.NetworkInfo d(android.net.Network r2) {
            /*
                r1 = this;
                android.net.ConnectivityManager r0 = r1.f155400a     // Catch:{ all -> 0x0007 }
                android.net.NetworkInfo r0 = a(r0, r2)     // Catch:{ all -> 0x0007 }
                return r0
            L_0x0007:
                android.net.ConnectivityManager r0 = r1.f155400a     // Catch:{ all -> 0x000e }
                android.net.NetworkInfo r0 = a(r0, r2)     // Catch:{ all -> 0x000e }
                return r0
            L_0x000e:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.a.d(android.net.Network):android.net.NetworkInfo");
        }

        /* access modifiers changed from: protected */
        public final NetworkCapabilities c(Network network) {
            try {
                return this.f155400a.getNetworkCapabilities(network);
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
            r2.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            throw r1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x002f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected static boolean b(android.net.Network r4) {
            /*
                java.net.Socket r3 = new java.net.Socket
                r3.<init>()
                android.os.StrictMode$VmPolicy r1 = android.os.StrictMode.getVmPolicy()     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                android.os.StrictMode$VmPolicy r0 = android.os.StrictMode.VmPolicy.LAX     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                android.os.StrictMode.setVmPolicy(r0)     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                com.ttnet.org.chromium.base.m r0 = new com.ttnet.org.chromium.base.m     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                r0.<init>(r1)     // Catch:{ IOException -> 0x002f, all -> 0x002a }
                r4.bindSocket(r3)     // Catch:{ all -> 0x001e }
                r0.close()
                r3.close()     // Catch:{ IOException -> 0x001c }
            L_0x001c:
                r0 = 1
                return r0
            L_0x001e:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x0020 }
            L_0x0020:
                r1 = move-exception
                r0.close()     // Catch:{ all -> 0x0025 }
                goto L_0x0029
            L_0x0025:
                r0 = move-exception
                r2.addSuppressed(r0)
            L_0x0029:
                throw r1
            L_0x002a:
                r0 = move-exception
                r3.close()     // Catch:{ IOException -> 0x002e }
            L_0x002e:
                throw r0
            L_0x002f:
                r3.close()     // Catch:{ IOException -> 0x0032 }
            L_0x0032:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.a.b(android.net.Network):boolean");
        }

        /* access modifiers changed from: package-private */
        public final int a(Network network) {
            NetworkInfo d2 = d(network);
            if (d2 == null) {
                return 6;
            }
            if (d2.getType() == 17) {
                try {
                    d2 = a(this.f155400a);
                    if (d2 == null) {
                        return 6;
                    }
                } catch (Throwable unused) {
                    return 6;
                }
            }
            if (d2.isConnected()) {
                return NetworkChangeNotifierAutoDetect.a(d2.getType(), d2.getSubtype());
            }
            return 6;
        }

        private static NetworkInfo a(ConnectivityManager connectivityManager, Network network) {
            try {
                return connectivityManager.getNetworkInfo(network);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                return com.ss.android.ugc.aweme.net.e.a.a();
            }
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(12760);
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
                                com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(12760);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    public static class NetworkConnectivityIntentFilter extends IntentFilter {
        static {
            Covode.recordClassIndex(103383);
        }

        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ boolean f155402a = true;

        /* renamed from: c  reason: collision with root package name */
        private Network f155404c;

        static {
            Covode.recordClassIndex(103386);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            NetworkCapabilities c2;
            Network[] a2 = NetworkChangeNotifierAutoDetect.a(NetworkChangeNotifierAutoDetect.this.f155388c, (Network) null);
            this.f155404c = null;
            if (a2.length == 1 && (c2 = NetworkChangeNotifierAutoDetect.this.f155388c.c(a2[0])) != null && c2.hasTransport(4)) {
                this.f155404c = a2[0];
            }
        }

        private c() {
        }

        private boolean a(Network network) {
            Network network2 = this.f155404c;
            if (network2 == null || network2.equals(network)) {
                return false;
            }
            return true;
        }

        public final void onAvailable(Network network) {
            try {
                NetworkCapabilities c2 = NetworkChangeNotifierAutoDetect.this.f155388c.c(network);
                if (!a(network, c2)) {
                    final boolean hasTransport = c2.hasTransport(4);
                    if (hasTransport) {
                        this.f155404c = network;
                    }
                    final long a2 = NetworkChangeNotifierAutoDetect.a(network);
                    final int a3 = NetworkChangeNotifierAutoDetect.this.f155388c.a(network);
                    NetworkChangeNotifierAutoDetect.this.a(new Runnable() {
                        /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.c.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(103387);
                        }

                        public final void run() {
                            NetworkChangeNotifierAutoDetect.this.f155386a.a(a2, a3);
                            if (hasTransport) {
                                NetworkChangeNotifierAutoDetect.this.f155386a.a(a3);
                                NetworkChangeNotifierAutoDetect.this.f155386a.a(new long[]{a2});
                            }
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        }

        public final void onLost(final Network network) {
            if (!a(network)) {
                NetworkChangeNotifierAutoDetect.this.a(new Runnable() {
                    /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.c.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(103390);
                    }

                    public final void run() {
                        NetworkChangeNotifierAutoDetect.this.f155386a.b(NetworkChangeNotifierAutoDetect.a(network));
                    }
                });
                Network network2 = this.f155404c;
                if (network2 == null) {
                    return;
                }
                if (f155402a || network.equals(network2)) {
                    this.f155404c = null;
                    for (Network network3 : NetworkChangeNotifierAutoDetect.a(NetworkChangeNotifierAutoDetect.this.f155388c, network)) {
                        onAvailable(network3);
                    }
                    final int a2 = NetworkChangeNotifierAutoDetect.this.f155388c.a().a();
                    NetworkChangeNotifierAutoDetect.this.a(new Runnable() {
                        /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.c.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(103391);
                        }

                        public final void run() {
                            NetworkChangeNotifierAutoDetect.this.f155386a.a(a2);
                        }
                    });
                    return;
                }
                throw new AssertionError();
            }
        }

        /* synthetic */ c(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, byte b2) {
            this();
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            try {
                if (!a(network, networkCapabilities)) {
                    final long a2 = NetworkChangeNotifierAutoDetect.a(network);
                    final int a3 = NetworkChangeNotifierAutoDetect.this.f155388c.a(network);
                    NetworkChangeNotifierAutoDetect.this.a(new Runnable() {
                        /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.c.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(103388);
                        }

                        public final void run() {
                            NetworkChangeNotifierAutoDetect.this.f155386a.a(a2, a3);
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        }

        public final void onLosing(Network network, int i2) {
            if (!a(network, null)) {
                final long a2 = NetworkChangeNotifierAutoDetect.a(network);
                NetworkChangeNotifierAutoDetect.this.a(new Runnable() {
                    /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.c.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(103389);
                    }

                    public final void run() {
                        NetworkChangeNotifierAutoDetect.this.f155386a.a(a2);
                    }
                });
            }
        }

        private boolean a(Network network, NetworkCapabilities networkCapabilities) {
            if (!a(network)) {
                if (networkCapabilities == null) {
                    networkCapabilities = NetworkChangeNotifierAutoDetect.this.f155388c.c(network);
                }
                if (networkCapabilities == null || (networkCapabilities.hasTransport(4) && !a.b(network))) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f155418a;

        /* renamed from: b  reason: collision with root package name */
        public final int f155419b;

        /* renamed from: c  reason: collision with root package name */
        public final int f155420c;

        /* renamed from: d  reason: collision with root package name */
        public final String f155421d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f155422e;

        static {
            Covode.recordClassIndex(103392);
        }

        public final int a() {
            if (!this.f155418a) {
                return 6;
            }
            return NetworkChangeNotifierAutoDetect.a(this.f155419b, this.f155420c);
        }

        public final int b() {
            if (!this.f155418a) {
                return 1;
            }
            if (this.f155419b != 0) {
                return 0;
            }
            switch (this.f155420c) {
                case 1:
                    return 7;
                case 2:
                    return 8;
                case 3:
                    return 9;
                case 4:
                    return 5;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return 10;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return 11;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return 6;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return 14;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return 15;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return 12;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return 4;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    return 13;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return 18;
                case ABRConfig.ABR_SELECT_SCENE:
                    return 16;
                case 15:
                    return 17;
                default:
                    return 0;
            }
        }

        public d(boolean z, int i2, int i3, String str, boolean z2) {
            this.f155418a = z;
            this.f155419b = i2;
            this.f155420c = i3;
            this.f155421d = str == null ? "" : str;
            this.f155422e = z2;
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ boolean f155423a = true;

        /* renamed from: b  reason: collision with root package name */
        private NetworkChangeNotifierAutoDetect f155424b;

        /* access modifiers changed from: protected */
        public abstract void c();

        static {
            Covode.recordClassIndex(103394);
        }

        /* access modifiers changed from: protected */
        public final void a() {
            if (f155423a || this.f155424b != null) {
                this.f155424b.b();
                return;
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public final void b() {
            if (f155423a || this.f155424b != null) {
                this.f155424b.c();
                return;
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public void a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.f155424b = networkChangeNotifierAutoDetect;
        }
    }

    static class g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ boolean f155425a = true;

        /* renamed from: b  reason: collision with root package name */
        private final Context f155426b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f155427c;

        static {
            Covode.recordClassIndex(103395);
        }

        g() {
            this.f155427c = new Object();
            this.f155426b = null;
        }

        g(Context context) {
            this.f155427c = new Object();
            if (f155425a || Build.VERSION.SDK_INT < 23) {
                this.f155426b = context;
                return;
            }
            throw new AssertionError();
        }
    }

    static {
        Covode.recordClassIndex(103381);
    }

    private boolean e() {
        if (this.f155393i == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    public final void a() {
        f();
        this.f155387b.c();
        c();
    }

    private void f() {
        if (com.ttnet.org.chromium.base.b.f155218a && !e()) {
            throw new IllegalStateException("Must be called on NetworkChangeNotifierAutoDetect thread.");
        }
    }

    public final void c() {
        f();
        if (this.f155390e) {
            this.f155390e = false;
            c cVar = this.f155397m;
            if (cVar != null) {
                this.f155388c.a(cVar);
            }
            b bVar = this.f155396l;
            if (bVar != null) {
                this.f155388c.a(bVar);
            } else {
                com.ttnet.org.chromium.base.c.f155223a.unregisterReceiver(this);
            }
        }
    }

    public final void d() {
        d a2 = this.f155388c.a();
        if (!(a2.a() == this.o.a() && a2.f155421d.equals(this.o.f155421d) && a2.f155422e == this.o.f155422e)) {
            this.f155386a.a(a2.a());
        }
        if (!(a2.a() == this.o.a() && a2.b() == this.o.b())) {
            this.f155386a.b(a2.b());
        }
        this.o = a2;
    }

    public final void b() {
        boolean z;
        f();
        if (!this.f155390e) {
            if (this.p) {
                d();
            }
            b bVar = this.f155396l;
            if (bVar != null) {
                try {
                    a aVar = this.f155388c;
                    try {
                        aVar.f155400a.registerDefaultNetworkCallback(bVar, this.f155394j);
                    } catch (Throwable unused) {
                    }
                } catch (RuntimeException unused2) {
                    this.f155396l = null;
                }
            }
            if (this.f155396l == null) {
                try {
                    if (b(com.ttnet.org.chromium.base.c.f155223a, this, this.f155395k) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f155391f = z;
                } catch (RuntimeException unused3) {
                    this.f155391f = false;
                }
            }
            this.f155390e = true;
            c cVar = this.f155397m;
            if (cVar != null) {
                cVar.a();
                try {
                    a aVar2 = this.f155388c;
                    NetworkRequest networkRequest = this.n;
                    c cVar2 = this.f155397m;
                    Handler handler = this.f155394j;
                    try {
                        if (Build.VERSION.SDK_INT >= 26) {
                            aVar2.f155400a.registerNetworkCallback(networkRequest, cVar2, handler);
                        } else {
                            aVar2.f155400a.registerNetworkCallback(networkRequest, cVar2);
                        }
                    } catch (Throwable unused4) {
                    }
                } catch (RuntimeException unused5) {
                    this.f155392g = true;
                    this.f155397m = null;
                }
                if (!this.f155392g && this.p) {
                    Network[] a2 = a(this.f155388c, (Network) null);
                    long[] jArr = new long[a2.length];
                    for (int i2 = 0; i2 < a2.length; i2++) {
                        jArr[i2] = a(a2[i2]);
                    }
                    this.f155386a.a(jArr);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends ConnectivityManager.NetworkCallback {
        static {
            Covode.recordClassIndex(103385);
        }

        private b() {
        }

        public final void onLost(Network network) {
            onAvailable(null);
        }

        public final void onAvailable(Network network) {
            if (NetworkChangeNotifierAutoDetect.this.f155390e) {
                NetworkChangeNotifierAutoDetect.this.d();
            }
        }

        /* synthetic */ b(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, byte b2) {
            this();
        }

        public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            onAvailable(null);
        }
    }

    static long a(Network network) {
        if (Build.VERSION.SDK_INT >= 23) {
            return com.ttnet.org.chromium.base.a.a.a(network);
        }
        return (long) Integer.parseInt(network.toString());
    }

    public final void a(Runnable runnable) {
        if (e()) {
            runnable.run();
        } else {
            this.f155394j.post(runnable);
        }
    }

    public void onReceive(Context context, Intent intent) {
        a(new Runnable() {
            /* class com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.AnonymousClass1 */

            static {
                Covode.recordClassIndex(103382);
            }

            public final void run() {
                if (NetworkChangeNotifierAutoDetect.this.f155390e) {
                    if (NetworkChangeNotifierAutoDetect.this.f155391f) {
                        NetworkChangeNotifierAutoDetect.this.f155391f = false;
                    } else {
                        NetworkChangeNotifierAutoDetect.this.d();
                    }
                }
            }
        });
    }

    public NetworkChangeNotifierAutoDetect(e eVar, f fVar) {
        Looper myLooper = Looper.myLooper();
        this.f155393i = myLooper;
        this.f155394j = new Handler(myLooper);
        this.f155386a = eVar;
        if (Build.VERSION.SDK_INT < 23) {
            this.f155389d = new g(com.ttnet.org.chromium.base.c.f155223a);
        }
        b bVar = null;
        if (Build.VERSION.SDK_INT >= 21) {
            this.f155397m = new c(this, (byte) 0);
            this.n = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        } else {
            this.f155397m = null;
            this.n = null;
        }
        this.f155396l = Build.VERSION.SDK_INT >= 28 ? new b(this, (byte) 0) : bVar;
        this.o = this.f155388c.a();
        this.f155395k = new NetworkConnectivityIntentFilter();
        this.f155391f = false;
        this.p = false;
        this.f155387b = fVar;
        fVar.a(this);
        this.p = true;
    }

    public static Network[] a(a aVar, Network network) {
        NetworkCapabilities c2;
        Network[] b2 = aVar.b();
        int i2 = 0;
        for (Network network2 : b2) {
            if (!network2.equals(network) && (c2 = aVar.c(network2)) != null && c2.hasCapability(12)) {
                if (!c2.hasTransport(4)) {
                    b2[i2] = network2;
                    i2++;
                } else if (a.b(network2)) {
                    return new Network[]{network2};
                }
            }
        }
        return (Network[]) Arrays.copyOf(b2, i2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
