package com.ttnet.org.chromium.net;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.ttnet.org.chromium.base.metrics.RecordHistogram;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* access modifiers changed from: package-private */
public class AndroidNetworkLibrary {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f155356a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f155357b;

    /* renamed from: c  reason: collision with root package name */
    private static final Set<InetAddress> f155358c;

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f155359d;

    public static String getWifiSSID() {
        return "";
    }

    public static native void nativeOnCellularAlwaysUp(boolean z);

    AndroidNetworkLibrary() {
    }

    static class c extends Socket {
        static {
            Covode.recordClassIndex(103368);
        }

        static class a extends SocketImpl {
            static {
                Covode.recordClassIndex(103369);
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void close() {
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void create(boolean z) {
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final int available() {
                throw new RuntimeException("accept not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final InputStream getInputStream() {
                throw new RuntimeException("getInputStream not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final OutputStream getOutputStream() {
                throw new RuntimeException("getOutputStream not implemented");
            }

            a(FileDescriptor fileDescriptor) {
                this.fd = fileDescriptor;
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void accept(SocketImpl socketImpl) {
                throw new RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketOptions
            public final Object getOption(int i2) {
                throw new RuntimeException("getOption not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void listen(int i2) {
                throw new RuntimeException("listen not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void sendUrgentData(int i2) {
                throw new RuntimeException("sendUrgentData not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void bind(InetAddress inetAddress, int i2) {
                throw new RuntimeException("accept not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void connect(String str, int i2) {
                throw new RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketOptions
            public final void setOption(int i2, Object obj) {
                throw new RuntimeException("setOption not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void connect(InetAddress inetAddress, int i2) {
                throw new RuntimeException("connect not implemented");
            }

            /* access modifiers changed from: protected */
            @Override // java.net.SocketImpl
            public final void connect(SocketAddress socketAddress, int i2) {
                throw new RuntimeException("connect not implemented");
            }
        }

        c(FileDescriptor fileDescriptor) {
            super(new a(fileDescriptor));
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static a f155361a = new a();

        static {
            Covode.recordClassIndex(103366);
        }

        public static boolean a() {
            if (Build.VERSION.SDK_INT < 23) {
                return true;
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void clearTestRootCertificates() {
        /*
            r3 = 13299(0x33f3, float:1.8636E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            com.ttnet.org.chromium.net.X509Util.a()
            java.lang.Object r2 = com.ttnet.org.chromium.net.X509Util.f155455b
            monitor-enter(r2)
            java.security.KeyStore r1 = com.ttnet.org.chromium.net.X509Util.f155454a     // Catch:{ IOException -> 0x0014 }
            r0 = 0
            r1.load(r0)     // Catch:{ IOException -> 0x0014 }
            com.ttnet.org.chromium.net.X509Util.b()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.AndroidNetworkLibrary.clearTestRootCertificates():void");
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final Method f155362a;

        static {
            Covode.recordClassIndex(103367);
            try {
                f155362a = FileDescriptor.class.getMethod("setInt$", Integer.TYPE);
            } catch (NoSuchMethodException | SecurityException e2) {
                throw new RuntimeException("Unable to get FileDescriptor.setInt$", e2);
            }
        }

        public static FileDescriptor a(int i2) {
            try {
                FileDescriptor fileDescriptor = new FileDescriptor();
                Method method = f155362a;
                Object[] objArr = {Integer.valueOf(i2)};
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{fileDescriptor, objArr}, 110000, "java.lang.Object", true, "com_ttnet_org_chromium_net_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    Object obj = a2.second;
                } else {
                    com.bytedance.helios.sdk.a.a(method.invoke(fileDescriptor, objArr), method, new Object[]{fileDescriptor, objArr}, "com_ttnet_org_chromium_net_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
                return fileDescriptor;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2 = (android.net.ConnectivityManager) a(com.ttnet.org.chromium.base.c.f155223a, "connectivity");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean alwayUpCellular() {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r0 = 21
            if (r1 >= r0) goto L_0x0008
            return r3
        L_0x0008:
            android.content.Context r1 = com.ttnet.org.chromium.base.c.f155223a
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = a(r1, r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 != 0) goto L_0x0015
            return r3
        L_0x0015:
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r0 = 12
            android.net.NetworkRequest$Builder r0 = r1.addCapability(r0)
            android.net.NetworkRequest$Builder r0 = r0.addTransportType(r3)
            android.net.NetworkRequest r1 = r0.build()
            com.ttnet.org.chromium.net.AndroidNetworkLibrary$1 r0 = new com.ttnet.org.chromium.net.AndroidNetworkLibrary$1     // Catch:{ Exception -> 0x0032 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0032 }
            r2.requestNetwork(r1, r0)     // Catch:{ Exception -> 0x0032 }
            r0 = 1
            return r0
        L_0x0032:
            r0 = move-exception
            r0.printStackTrace()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.AndroidNetworkLibrary.alwayUpCellular():boolean");
    }

    private static boolean checkIsVpnOn() {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < 21 || (connectivityManager = (ConnectivityManager) a(com.ttnet.org.chromium.base.c.f155223a, "connectivity")) == null) {
            return false;
        }
        Network[] allNetworks = connectivityManager.getAllNetworks();
        for (int i2 = 0; i2 < allNetworks.length; i2++) {
            if (a(connectivityManager, allNetworks[i2]).isConnected() && connectivityManager.getNetworkCapabilities(allNetworks[i2]).hasTransport(4)) {
                return true;
            }
        }
        return false;
    }

    private static boolean getIsCaptivePortal() {
        ConnectivityManager connectivityManager;
        Network b2;
        NetworkCapabilities networkCapabilities;
        if (Build.VERSION.SDK_INT < 23 || (connectivityManager = (ConnectivityManager) a(com.ttnet.org.chromium.base.c.f155223a, "connectivity")) == null || (b2 = com.ttnet.org.chromium.base.a.a.b(connectivityManager)) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(b2)) == null || !networkCapabilities.hasCapability(17)) {
            return false;
        }
        return true;
    }

    public static int[] getRouteInfo() {
        DhcpInfo dhcpInfo;
        try {
            WifiManager wifiManager = (WifiManager) a(com.ttnet.org.chromium.base.c.f155223a, "wifi");
            if (!(wifiManager == null || (dhcpInfo = wifiManager.getDhcpInfo()) == null)) {
                return new int[]{dhcpInfo.ipAddress, dhcpInfo.netmask};
            }
        } catch (Throwable unused) {
        }
        return new int[0];
    }

    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(103364);
        HashSet hashSet = new HashSet();
        f155358c = hashSet;
        HashSet hashSet2 = new HashSet();
        f155359d = hashSet2;
        try {
            hashSet.add(InetAddress.getByName("8.8.8.8"));
            hashSet.add(InetAddress.getByName("8.8.4.4"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8888"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8844"));
            hashSet.add(InetAddress.getByName("1.1.1.1"));
            hashSet.add(InetAddress.getByName("1.0.0.1"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1111"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1001"));
            hashSet.add(InetAddress.getByName("9.9.9.9"));
            hashSet.add(InetAddress.getByName("149.112.112.112"));
            hashSet.add(InetAddress.getByName("2620:fe::fe"));
            hashSet.add(InetAddress.getByName("2620:fe::9"));
            hashSet2.add("dns.google");
            hashSet2.add("1dot1dot1dot1.cloudflare-dns.com");
            hashSet2.add("cloudflare-dns.com");
            hashSet2.add("dns.quad9.net");
        } catch (UnknownHostException e2) {
            throw new RuntimeException("Failed to parse IP addresses", e2);
        }
    }

    private static byte[][] getDnsServers() {
        boolean z;
        String b2;
        boolean z2;
        boolean z3 = true;
        if (f155356a == null) {
            if (com.ttnet.org.chromium.base.a.a(com.ttnet.org.chromium.base.c.f155223a, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            f155356a = Boolean.valueOf(z2);
        }
        if (!f155356a.booleanValue()) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) a(com.ttnet.org.chromium.base.c.f155223a, "connectivity");
        if (connectivityManager == null) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        Network b3 = com.ttnet.org.chromium.base.a.a.b(connectivityManager);
        if (b3 == null) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(b3);
        if (linkProperties == null) {
            return (byte[][]) Array.newInstance(byte.class, 0, 0);
        }
        List<InetAddress> dnsServers = linkProperties.getDnsServers();
        Iterator<InetAddress> it = dnsServers.iterator();
        while (true) {
            if (it.hasNext()) {
                if (f155358c.contains(it.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (a(linkProperties)) {
            if (Build.VERSION.SDK_INT < 28 || (b2 = com.ttnet.org.chromium.base.a.b.b(linkProperties)) == null) {
                z3 = false;
            } else {
                z = f155359d.contains(b2.toLowerCase(Locale.US));
            }
            RecordHistogram.a("Net.DNS.Android.DotExplicit", z3);
            RecordHistogram.a("Net.DNS.Android.AutoDohPrivate", z);
            return (byte[][]) Array.newInstance(byte.class, 1, 1);
        }
        RecordHistogram.a("Net.DNS.Android.AutoDohPublic", z);
        byte[][] bArr = new byte[dnsServers.size()][];
        for (int i2 = 0; i2 < dnsServers.size(); i2++) {
            bArr[i2] = dnsServers.get(i2).getAddress();
        }
        return bArr;
    }

    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo.".concat(String.valueOf(str)));
    }

    private static boolean isCleartextPermitted(String str) {
        try {
            if (Build.VERSION.SDK_INT < 24) {
                return a.a();
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return a.a();
        }
    }

    static boolean a(LinkProperties linkProperties) {
        if (Build.VERSION.SDK_INT < 28 || linkProperties == null) {
            return false;
        }
        return com.ttnet.org.chromium.base.a.b.a(linkProperties);
    }

    public static void addTestRootCertificate(byte[] bArr) {
        MethodCollector.i(13298);
        X509Util.a();
        X509Certificate a2 = X509Util.a(bArr);
        synchronized (X509Util.f155455b) {
            try {
                X509Util.f155454a.setCertificateEntry("root_cert_" + Integer.toString(X509Util.f155454a.size()), a2);
                X509Util.b();
            } finally {
                MethodCollector.o(13298);
            }
        }
    }

    public static int getWifiSignalLevel(int i2) {
        int i3;
        int calculateSignalLevel;
        boolean z;
        try {
            if (com.ttnet.org.chromium.base.c.f155223a == null || com.ttnet.org.chromium.base.c.f155223a.getContentResolver() == null) {
                return -1;
            }
            if (f155357b == null) {
                if (com.ttnet.org.chromium.base.a.a(com.ttnet.org.chromium.base.c.f155223a, "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                f155357b = Boolean.valueOf(z);
            }
            if (f155357b.booleanValue()) {
                WifiInfo connectionInfo = ((WifiManager) a(com.ttnet.org.chromium.base.c.f155223a, "wifi")).getConnectionInfo();
                if (connectionInfo == null) {
                    return -1;
                }
                i3 = connectionInfo.getRssi();
            } else {
                try {
                    Intent b2 = b(com.ttnet.org.chromium.base.c.f155223a, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                    if (b2 == null) {
                        return -1;
                    }
                    i3 = b2.getIntExtra("newRssi", Integer.MIN_VALUE);
                } catch (IllegalArgumentException unused) {
                }
            }
            if (i3 != Integer.MIN_VALUE && (calculateSignalLevel = WifiManager.calculateSignalLevel(i3, i2)) >= 0 && calculateSignalLevel < i2) {
                return calculateSignalLevel;
            }
            return -1;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager, Network network) {
        try {
            return connectivityManager.getNetworkInfo(network);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    private static Intent a(Context context, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(null, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    private static Intent b(Context context, IntentFilter intentFilter) {
        SecurityException securityException;
        com.ss.android.ugc.aweme.lancet.receiver.a.a(g.a());
        try {
            return a(context, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e2) {
                securityException = e2;
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e3) {
                String message = e3.getMessage();
                securityException = e3;
                if (message != null) {
                    boolean contains = e3.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e3;
                    if (contains) {
                        throw e3;
                    }
                }
                com.bytedance.c.a.a.a.b.a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13373);
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
                    MethodCollector.o(13373);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.a(bArr, str, str2);
        } catch (KeyStoreException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (IllegalArgumentException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }

    private static void tagSocket(int i2, int i3, int i4) {
        ParcelFileDescriptor adoptFd;
        FileDescriptor fileDescriptor;
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i4 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i4);
        }
        if (i3 != -1) {
            y.a(i3);
        }
        if (Build.VERSION.SDK_INT < 23) {
            adoptFd = null;
            fileDescriptor = b.a(i2);
        } else {
            adoptFd = ParcelFileDescriptor.adoptFd(i2);
            fileDescriptor = adoptFd.getFileDescriptor();
        }
        c cVar = new c(fileDescriptor);
        TrafficStats.tagSocket(cVar);
        cVar.close();
        if (adoptFd != null) {
            adoptFd.detachFd();
        }
        if (i4 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i3 != -1) {
            y.a();
        }
    }
}
