package com.ss.ttvideoengine;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.ttvideoengine.s.j;

public class JniUtils {

    /* renamed from: a  reason: collision with root package name */
    public static volatile l f152129a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f152130b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile String f152131c = "";

    public static native String getDecodedStr(byte[] bArr, byte[] bArr2);

    public static native String getEncryptionKey(byte[] bArr);

    public static native byte[] getSignature(String str);

    public static native int getSupportedMethod();

    static {
        Covode.recordClassIndex(101438);
    }

    public static synchronized void a() {
        synchronized (JniUtils.class) {
            MethodCollector.i(13167);
            try {
                if (!f152130b) {
                    if (f152129a == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        Librarian.a("videodec");
                        m.a(uptimeMillis, "videodec");
                    }
                    f152130b = true;
                }
                MethodCollector.o(13167);
            } catch (Throwable th) {
                f152131c = th.toString();
                MethodCollector.o(13167);
            }
        }
    }

    public static int b() {
        MethodCollector.i(13322);
        String str = "exception is null";
        if (!f152130b) {
            StringBuilder sb = new StringBuilder("library not load suc exception:");
            if (f152131c != null) {
                str = f152131c;
            }
            Exception exc = new Exception(sb.append(str).toString());
            MethodCollector.o(13322);
            throw exc;
        }
        try {
            int supportedMethod = getSupportedMethod();
            MethodCollector.o(13322);
            return supportedMethod;
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("getDecodedStr exception:");
            if (th.toString() != null) {
                str = th.toString();
            }
            Exception exc2 = new Exception(sb2.append(str).toString());
            MethodCollector.o(13322);
            throw exc2;
        }
    }

    public static String a(byte[] bArr) {
        MethodCollector.i(13248);
        String str = "exception is null";
        if (!f152130b) {
            StringBuilder sb = new StringBuilder("library not load suc exception:");
            if (f152131c != null) {
                str = f152131c;
            }
            Exception exc = new Exception(sb.append(str).toString());
            MethodCollector.o(13248);
            throw exc;
        } else if (bArr == null) {
            j.e("JniUtils", "getEncryptionKeyWithCheck convertedKey is null");
            MethodCollector.o(13248);
            return null;
        } else {
            try {
                String encryptionKey = getEncryptionKey(bArr);
                MethodCollector.o(13248);
                return encryptionKey;
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder("getEncryptionKey exception:");
                if (th.toString() != null) {
                    str = th.toString();
                }
                Exception exc2 = new Exception(sb2.append(str).toString());
                MethodCollector.o(13248);
                throw exc2;
            }
        }
    }

    public static String a(byte[] bArr, byte[] bArr2) {
        MethodCollector.i(13321);
        String str = "exception is null";
        if (!f152130b) {
            StringBuilder sb = new StringBuilder("library not load suc exception:");
            if (f152131c != null) {
                str = f152131c;
            }
            Exception exc = new Exception(sb.append(str).toString());
            MethodCollector.o(13321);
            throw exc;
        }
        try {
            String decodedStr = getDecodedStr(bArr, bArr2);
            MethodCollector.o(13321);
            return decodedStr;
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("getDecodedStr exception:");
            if (th.toString() != null) {
                str = th.toString();
            }
            Exception exc2 = new Exception(sb2.append(str).toString());
            MethodCollector.o(13321);
            throw exc2;
        }
    }
}
