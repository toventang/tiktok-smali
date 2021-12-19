package com.ttnet.org.chromium.net;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ttnet.org.chromium.base.a.a;
import com.ttnet.org.chromium.base.c;
import com.ttnet.org.chromium.base.h;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

public class NetworkChangeNotifier {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f155377a = true;

    /* renamed from: g  reason: collision with root package name */
    private static NetworkChangeNotifier f155378g;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<Long> f155379b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final h<Object> f155380c = new h<>();

    /* renamed from: d  reason: collision with root package name */
    private final ConnectivityManager f155381d = ((ConnectivityManager) a(c.f155223a, "connectivity"));

    /* renamed from: e  reason: collision with root package name */
    private NetworkChangeNotifierAutoDetect f155382e;

    /* renamed from: f  reason: collision with root package name */
    private int f155383f;

    private native void nativeNotifyConnectionTypeChanged(long j2, int i2, long j3);

    private native void nativeNotifyMaxBandwidthChanged(long j2, int i2);

    private native void nativeNotifyOfNetworkConnect(long j2, long j3, int i2);

    private native void nativeNotifyOfNetworkDisconnect(long j2, long j3);

    private native void nativeNotifyOfNetworkSoonToDisconnect(long j2, long j3);

    private native void nativeNotifyPurgeActiveNetworkList(long j2, long[] jArr);

    public int getCurrentConnectionType() {
        return this.f155383f;
    }

    static {
        Covode.recordClassIndex(103379);
    }

    private static void b() {
        a().a(false, (NetworkChangeNotifierAutoDetect.f) new s());
    }

    private void c() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f155382e;
        if (networkChangeNotifierAutoDetect != null) {
            networkChangeNotifierAutoDetect.a();
            this.f155382e = null;
        }
    }

    public static NetworkChangeNotifier init() {
        if (f155378g == null) {
            f155378g = new NetworkChangeNotifier();
        }
        return f155378g;
    }

    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f155382e;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.f155392g;
    }

    protected NetworkChangeNotifier() {
    }

    public static NetworkChangeNotifier a() {
        if (f155377a || f155378g != null) {
            return f155378g;
        }
        throw new AssertionError();
    }

    public int getCurrentConnectionSubtype() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f155382e;
        if (networkChangeNotifierAutoDetect == null) {
            return 0;
        }
        return networkChangeNotifierAutoDetect.f155388c.a().b();
    }

    public long getCurrentDefaultNetId() {
        Network c2;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f155382e;
        if (networkChangeNotifierAutoDetect == null || Build.VERSION.SDK_INT < 21 || (c2 = networkChangeNotifierAutoDetect.f155388c.c()) == null) {
            return -1;
        }
        return NetworkChangeNotifierAutoDetect.a(c2);
    }

    public static boolean isProcessBoundToNetwork() {
        NetworkChangeNotifier a2 = a();
        if (Build.VERSION.SDK_INT >= 21) {
            if (Build.VERSION.SDK_INT < 23) {
                if (ConnectivityManager.getProcessDefaultNetwork() != null) {
                    return true;
                }
                return false;
            } else if (a.a(a2.f155381d) != null) {
                return true;
            }
        }
        return false;
    }

    public long[] getCurrentNetworksAndTypes() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f155382e;
        if (networkChangeNotifierAutoDetect == null) {
            return new long[0];
        }
        if (Build.VERSION.SDK_INT < 21) {
            return new long[0];
        }
        Network[] a2 = NetworkChangeNotifierAutoDetect.a(networkChangeNotifierAutoDetect.f155388c, (Network) null);
        long[] jArr = new long[(a2.length * 2)];
        int i2 = 0;
        for (Network network : a2) {
            int i3 = i2 + 1;
            jArr[i2] = NetworkChangeNotifierAutoDetect.a(network);
            i2 = i3 + 1;
            jArr[i3] = (long) networkChangeNotifierAutoDetect.f155388c.a(network);
        }
        return jArr;
    }

    private void c(int i2) {
        a(i2, getCurrentDefaultNetId());
    }

    public final void a(int i2) {
        this.f155383f = i2;
        c(i2);
    }

    public static void fakeConnectionSubtypeChanged(int i2) {
        b();
        a().b(i2);
    }

    public static void fakeNetworkDisconnected(long j2) {
        b();
        a().b(j2);
    }

    public static void fakeNetworkSoonToBeDisconnected(long j2) {
        b();
        a().a(j2);
    }

    public static void fakePurgeActiveNetworkList(long[] jArr) {
        b();
        a().a(jArr);
    }

    public void addNativeObserver(long j2) {
        this.f155379b.add(Long.valueOf(j2));
    }

    public void removeNativeObserver(long j2) {
        this.f155379b.remove(Long.valueOf(j2));
    }

    public static void forceConnectivityState(boolean z) {
        boolean z2;
        b();
        NetworkChangeNotifier a2 = a();
        int i2 = 0;
        if (a2.f155383f != 6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i2 = 6;
            }
            a2.a(i2);
            a2.b(!z);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        MethodCollector.i(10511);
        Iterator<Long> it = this.f155379b.iterator();
        while (it.hasNext()) {
            nativeNotifyMaxBandwidthChanged(it.next().longValue(), i2);
        }
        MethodCollector.o(10511);
    }

    /* access modifiers changed from: package-private */
    public final void b(long j2) {
        MethodCollector.i(10816);
        Iterator<Long> it = this.f155379b.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkDisconnect(it.next().longValue(), j2);
        }
        MethodCollector.o(10816);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        MethodCollector.i(10662);
        Iterator<Long> it = this.f155379b.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkSoonToDisconnect(it.next().longValue(), j2);
        }
        MethodCollector.o(10662);
    }

    /* access modifiers changed from: package-private */
    public final void a(long[] jArr) {
        MethodCollector.i(10982);
        Iterator<Long> it = this.f155379b.iterator();
        while (it.hasNext()) {
            nativeNotifyPurgeActiveNetworkList(it.next().longValue(), jArr);
        }
        MethodCollector.o(10982);
    }

    public static void fakeDefaultNetwork(long j2, int i2) {
        b();
        a().a(i2, j2);
    }

    public static void fakeNetworkConnected(long j2, int i2) {
        b();
        a().a(j2, i2);
    }

    private void a(int i2, long j2) {
        MethodCollector.i(10509);
        Iterator<Long> it = this.f155379b.iterator();
        while (it.hasNext()) {
            nativeNotifyConnectionTypeChanged(it.next().longValue(), i2, j2);
        }
        Iterator<Object> it2 = this.f155380c.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        MethodCollector.o(10509);
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(10345);
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
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(10345);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, int i2) {
        MethodCollector.i(10661);
        Iterator<Long> it = this.f155379b.iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkConnect(it.next().longValue(), j2, i2);
        }
        MethodCollector.o(10661);
    }

    public final void a(boolean z, NetworkChangeNotifierAutoDetect.f fVar) {
        if (!z) {
            c();
        } else if (this.f155382e == null) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = new NetworkChangeNotifierAutoDetect(new NetworkChangeNotifierAutoDetect.e() {
                /* class com.ttnet.org.chromium.net.NetworkChangeNotifier.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(103380);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.e
                public final void a(int i2) {
                    NetworkChangeNotifier.this.a(i2);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.e
                public final void b(int i2) {
                    NetworkChangeNotifier.this.b(i2);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.e
                public final void a(long j2) {
                    NetworkChangeNotifier.this.a(j2);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.e
                public final void b(long j2) {
                    NetworkChangeNotifier.this.b(j2);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.e
                public final void a(long[] jArr) {
                    NetworkChangeNotifier.this.a(jArr);
                }

                @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.e
                public final void a(long j2, int i2) {
                    NetworkChangeNotifier.this.a(j2, i2);
                }
            }, fVar);
            this.f155382e = networkChangeNotifierAutoDetect;
            NetworkChangeNotifierAutoDetect.d a2 = networkChangeNotifierAutoDetect.f155388c.a();
            a(a2.a());
            b(a2.b());
        }
    }
}
