package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

public class X509Util {

    /* renamed from: a  reason: collision with root package name */
    static KeyStore f155454a;

    /* renamed from: b  reason: collision with root package name */
    static final Object f155455b = new Object();

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ boolean f155456c = true;

    /* renamed from: d  reason: collision with root package name */
    private static CertificateFactory f155457d;

    /* renamed from: e  reason: collision with root package name */
    private static c f155458e;

    /* renamed from: f  reason: collision with root package name */
    private static a f155459f;

    /* renamed from: g  reason: collision with root package name */
    private static c f155460g;

    /* renamed from: h  reason: collision with root package name */
    private static KeyStore f155461h;

    /* renamed from: i  reason: collision with root package name */
    private static File f155462i;

    /* renamed from: j  reason: collision with root package name */
    private static Set<Pair<X500Principal, PublicKey>> f155463j;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f155464k;

    /* renamed from: l  reason: collision with root package name */
    private static final char[] f155465l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* access modifiers changed from: package-private */
    public interface c {
        static {
            Covode.recordClassIndex(103406);
        }

        List<X509Certificate> a(X509Certificate[] x509CertificateArr, String str, String str2);
    }

    private static native void nativeNotifyKeyChainChanged();

    /* access modifiers changed from: package-private */
    public static final class a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(103404);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (!"android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) && !"android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) && (!"android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) || intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false))) {
                    return;
                }
            } else if (!"android.security.STORAGE_CHANGED".equals(intent.getAction())) {
                return;
            }
            try {
                X509Util.c();
            } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            }
        }
    }

    static void b() {
        if (f155456c || Thread.holdsLock(f155455b)) {
            f155460g = a(f155454a);
            return;
        }
        throw new AssertionError();
    }

    public static void c() {
        MethodCollector.i(14070);
        synchronized (f155455b) {
            try {
                f155458e = null;
                f155463j = null;
                d();
            } catch (Throwable th) {
                MethodCollector.o(14070);
                throw th;
            }
        }
        nativeNotifyKeyChainChanged();
        MethodCollector.o(14070);
    }

    static {
        Covode.recordClassIndex(103403);
    }

    private static void d() {
        if (f155456c || Thread.holdsLock(f155455b)) {
            if (f155457d == null) {
                f155457d = CertificateFactory.getInstance("X.509");
            }
            if (f155458e == null) {
                f155458e = a((KeyStore) null);
            }
            if (!f155464k) {
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidCAStore");
                    f155461h = instance;
                    try {
                        instance.load(null);
                    } catch (IOException unused) {
                    }
                    f155462i = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
                } catch (KeyStoreException unused2) {
                }
                f155464k = true;
            }
            if (f155463j == null) {
                f155463j = new HashSet();
            }
            if (f155454a == null) {
                KeyStore instance2 = KeyStore.getInstance(KeyStore.getDefaultType());
                f155454a = instance2;
                try {
                    instance2.load(null);
                } catch (IOException unused3) {
                }
            }
            if (f155460g == null) {
                f155460g = a(f155454a);
            }
            if (f155459f == null) {
                f155459f = new a((byte) 0);
                IntentFilter intentFilter = new IntentFilter();
                if (Build.VERSION.SDK_INT >= 26) {
                    intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                    intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                    intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
                } else {
                    intentFilter.addAction("android.security.STORAGE_CHANGED");
                }
                b(com.ttnet.org.chromium.base.c.f155223a, f155459f, intentFilter);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    static void a() {
        MethodCollector.i(14067);
        synchronized (f155455b) {
            try {
                d();
            } finally {
                MethodCollector.o(14067);
            }
        }
    }

    static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f155466a;

        static {
            Covode.recordClassIndex(103405);
        }

        public b(X509TrustManager x509TrustManager) {
            this.f155466a = x509TrustManager;
        }

        @Override // com.ttnet.org.chromium.net.X509Util.c
        public final List<X509Certificate> a(X509Certificate[] x509CertificateArr, String str, String str2) {
            this.f155466a.checkServerTrusted(x509CertificateArr, str);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManagerExtensions f155467a;

        static {
            Covode.recordClassIndex(103407);
        }

        public d(X509TrustManager x509TrustManager) {
            this.f155467a = new X509TrustManagerExtensions(x509TrustManager);
        }

        @Override // com.ttnet.org.chromium.net.X509Util.c
        public final List<X509Certificate> a(X509Certificate[] x509CertificateArr, String str, String str2) {
            return this.f155467a.checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    private static c a(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    return new d((X509TrustManager) trustManager);
                } catch (IllegalArgumentException unused) {
                    trustManager.getClass().getName();
                }
            }
        }
        return null;
    }

    private static String a(X500Principal x500Principal) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        int i2 = 0;
        do {
            int i3 = i2 * 2;
            char[] cArr2 = f155465l;
            int i4 = 3 - i2;
            cArr[i3] = cArr2[(digest[i4] >> 4) & 15];
            cArr[i3 + 1] = cArr2[digest[i4] & 15];
            i2++;
        } while (i2 < 4);
        return new String(cArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(java.security.cert.X509Certificate r5) {
        /*
            r4 = 0
            java.util.List r0 = r5.getExtendedKeyUsage()     // Catch:{ NullPointerException -> 0x003a }
            r3 = 1
            if (r0 != 0) goto L_0x0009
            return r3
        L_0x0009:
            java.util.Iterator r2 = r0.iterator()
        L_0x000d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003a
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "1.3.6.1.5.5.7.3.1"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "2.5.29.37.0"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "2.16.840.1.113730.4.1"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "1.3.6.1.4.1.311.10.3.3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
        L_0x0039:
            return r3
        L_0x003a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.X509Util.b(java.security.cert.X509Certificate):boolean");
    }

    public static X509Certificate a(byte[] bArr) {
        MethodCollector.i(14109);
        a();
        X509Certificate x509Certificate = (X509Certificate) f155457d.generateCertificate(new ByteArrayInputStream(bArr));
        MethodCollector.o(14109);
        return x509Certificate;
    }

    private static boolean a(X509Certificate x509Certificate) {
        if (!f155456c && !Thread.holdsLock(f155455b)) {
            throw new AssertionError();
        } else if (f155461h == null) {
            return false;
        } else {
            Pair<X500Principal, PublicKey> pair = new Pair<>(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
            if (f155463j.contains(pair)) {
                return true;
            }
            String a2 = a(x509Certificate.getSubjectX500Principal());
            int i2 = 0;
            while (true) {
                String str = a2 + '.' + i2;
                if (!new File(f155462i, str).exists()) {
                    return false;
                }
                Certificate certificate = f155461h.getCertificate("system:".concat(String.valueOf(str)));
                if (certificate != null) {
                    if (!(certificate instanceof X509Certificate)) {
                        certificate.getClass().getName();
                    } else {
                        X509Certificate x509Certificate2 = (X509Certificate) certificate;
                        if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                            f155463j.add(pair);
                            return true;
                        }
                    }
                }
                i2++;
            }
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
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.X509Util.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public static AndroidCertVerifyResult a(byte[][] bArr, String str, String str2) {
        List<X509Certificate> list;
        MethodCollector.i(14144);
        if (!(bArr == null || bArr.length == 0)) {
            boolean z = false;
            if (bArr[0] != null) {
                try {
                    a();
                    ArrayList arrayList = new ArrayList();
                    try {
                        arrayList.add(a(bArr[0]));
                        for (int i2 = 1; i2 < bArr.length; i2++) {
                            try {
                                arrayList.add(a(bArr[i2]));
                            } catch (CertificateException unused) {
                            }
                        }
                        X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                        try {
                            x509CertificateArr[0].checkValidity();
                            if (!b(x509CertificateArr[0])) {
                                AndroidCertVerifyResult androidCertVerifyResult = new AndroidCertVerifyResult(-6);
                                MethodCollector.o(14144);
                                return androidCertVerifyResult;
                            }
                            synchronized (f155455b) {
                                try {
                                    c cVar = f155458e;
                                    if (cVar == null) {
                                        return new AndroidCertVerifyResult(-1);
                                    }
                                    try {
                                        list = cVar.a(x509CertificateArr, str, str2);
                                    } catch (CertificateException e2) {
                                        try {
                                            list = f155460g.a(x509CertificateArr, str, str2);
                                        } catch (CertificateException unused2) {
                                            e2.getMessage();
                                            AndroidCertVerifyResult androidCertVerifyResult2 = new AndroidCertVerifyResult(-2);
                                            MethodCollector.o(14144);
                                            return androidCertVerifyResult2;
                                        }
                                    }
                                    if (list.size() > 0) {
                                        z = a(list.get(list.size() - 1));
                                    }
                                    AndroidCertVerifyResult androidCertVerifyResult3 = new AndroidCertVerifyResult(z, list);
                                    MethodCollector.o(14144);
                                    return androidCertVerifyResult3;
                                } finally {
                                    MethodCollector.o(14144);
                                }
                            }
                        } catch (CertificateExpiredException unused3) {
                            AndroidCertVerifyResult androidCertVerifyResult4 = new AndroidCertVerifyResult(-3);
                            MethodCollector.o(14144);
                            return androidCertVerifyResult4;
                        } catch (CertificateNotYetValidException unused4) {
                            AndroidCertVerifyResult androidCertVerifyResult5 = new AndroidCertVerifyResult(-4);
                            MethodCollector.o(14144);
                            return androidCertVerifyResult5;
                        } catch (CertificateException unused5) {
                            AndroidCertVerifyResult androidCertVerifyResult6 = new AndroidCertVerifyResult(-1);
                            MethodCollector.o(14144);
                            return androidCertVerifyResult6;
                        }
                    } catch (CertificateException unused6) {
                        AndroidCertVerifyResult androidCertVerifyResult7 = new AndroidCertVerifyResult(-5);
                        MethodCollector.o(14144);
                        return androidCertVerifyResult7;
                    }
                } catch (CertificateException unused7) {
                    AndroidCertVerifyResult androidCertVerifyResult8 = new AndroidCertVerifyResult(-1);
                    MethodCollector.o(14144);
                    return androidCertVerifyResult8;
                }
            }
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=" + Arrays.deepToString(bArr));
        MethodCollector.o(14144);
        throw illegalArgumentException;
    }
}
