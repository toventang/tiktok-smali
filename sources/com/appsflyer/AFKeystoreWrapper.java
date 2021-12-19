package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

class AFKeystoreWrapper {

    /* renamed from: ı  reason: contains not printable characters */
    final Object f31 = new Object();

    /* renamed from: ǃ  reason: contains not printable characters */
    private Context f32;

    /* renamed from: ɩ  reason: contains not printable characters */
    int f33;

    /* renamed from: Ι  reason: contains not printable characters */
    KeyStore f34;

    /* renamed from: ι  reason: contains not printable characters */
    String f35;

    static {
        Covode.recordClassIndex(2650);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final String m11() {
        String str;
        MethodCollector.i(5055);
        synchronized (this.f31) {
            try {
                str = this.f35;
            } finally {
                MethodCollector.o(5055);
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final int m15() {
        int i2;
        MethodCollector.i(5130);
        synchronized (this.f31) {
            try {
                i2 = this.f33;
            } finally {
                MethodCollector.o(5130);
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m13() {
        MethodCollector.i(4886);
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.f31) {
            try {
                sb.append("KSAppsFlyerId=").append(this.f35).append(",");
                sb.append("KSAppsFlyerRICounter=").append(this.f33);
            } catch (Throwable th) {
                MethodCollector.o(4886);
                throw th;
            }
        }
        String obj = sb.toString();
        MethodCollector.o(4886);
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r5 = r2.split(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r5.length != 3) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(java.lang.String.valueOf(r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4 = r5[1].trim().split("=");
        r1 = r5[2].trim().split("=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r4.length != 2) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (r1.length != 2) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r8.f35 = r4[1].trim();
        r8.f33 = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        r2 = th;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m12() {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.m12():boolean");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean m10(String str) {
        return str.startsWith("com.appsflyer");
    }

    public AFKeystoreWrapper(Context context) {
        this.f32 = context;
        this.f35 = "";
        this.f33 = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.f34 = instance;
            instance.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14(String str) {
        MethodCollector.i(4623);
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.f31) {
                try {
                    if (!this.f34.containsAlias(str)) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                        } else {
                            int i2 = Build.VERSION.SDK_INT;
                            if (!AndroidUtils.m32()) {
                                algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.f32).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                            }
                        }
                        KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        instance3.initialize(algorithmParameterSpec);
                        instance3.generateKeyPair();
                    } else {
                        AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                    }
                } finally {
                    MethodCollector.o(4623);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(new StringBuilder("Exception ").append(th.getMessage()).append(" occurred").toString(), th);
            MethodCollector.o(4623);
        }
    }
}
