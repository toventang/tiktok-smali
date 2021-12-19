package com.apiguard3.internal;

import android.graphics.PointF;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class parseResponseHeaders extends HandlerThread {
    private static ReentrantReadWriteLock AGRequest;
    private static int AGRequest$Builder;
    private static int addHeader = 0;
    private static ReentrantReadWriteLock.WriteLock getBody = AGRequest.writeLock();
    private static char[] getHeaders;
    private static ReentrantReadWriteLock.ReadLock getMethod;
    private static parseResponseHeaders getUrl;
    private static int method;
    private static boolean newBuilder;
    private static boolean url;

    static void getUrl() {
        method = 262;
        newBuilder = true;
        url = true;
        getHeaders = new char[]{327, 342, 335, 333, 379, 359, 376, 362, 313, 328, 361, 369, 365, 373, 372, 346, 366, 363, 320, 294, 344, 378, 367, 377, 340, 347, 338, 295, 329, 301, 370, 360};
    }

    static {
        Covode.recordClassIndex(2561);
        AGRequest$Builder = 1;
        getUrl();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        AGRequest = reentrantReadWriteLock;
        getMethod = reentrantReadWriteLock.readLock();
        int i2 = addHeader + 15;
        AGRequest$Builder = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: finally extract failed */
    private static parseResponseHeaders getMethod() {
        int i2 = AGRequest$Builder + 43;
        addHeader = i2 % 128;
        int i3 = i2 % 2;
        try {
            getMethod.lock();
            parseResponseHeaders parseresponseheaders = getUrl;
            getMethod.unlock();
            int i4 = addHeader + 7;
            AGRequest$Builder = i4 % 128;
            int i5 = i4 % 2;
            return parseresponseheaders;
        } catch (Throwable th) {
            getMethod.unlock();
            throw th;
        }
    }

    public static void AGRequest() {
        int i2 = addHeader + 105;
        AGRequest$Builder = i2 % 128;
        int i3 = i2 % 2;
        try {
            getBody.lock();
            if (getUrl == null) {
                parseResponseHeaders parseresponseheaders = new parseResponseHeaders(getBody(127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, null, "").intern());
                getUrl = parseresponseheaders;
                parseresponseheaders.start();
                int i4 = AGRequest$Builder + 71;
                addHeader = i4 % 128;
                int i5 = i4 % 2;
            }
        } finally {
            getBody.unlock();
        }
    }

    public static void getBody() {
        MethodCollector.i(2096);
        int i2 = addHeader + 101;
        AGRequest$Builder = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                getBody.lock();
                if (getUrl == null) {
                    getBody.unlock();
                    MethodCollector.o(2096);
                }
            } catch (Throwable th) {
                getBody.unlock();
                MethodCollector.o(2096);
                throw th;
            }
        } else {
            getBody.lock();
            if (getUrl == null) {
                getBody.unlock();
                MethodCollector.o(2096);
            }
        }
        int i3 = AGRequest$Builder + 21;
        addHeader = i3 % 128;
        int i4 = i3 % 2;
        int i5 = Build.VERSION.SDK_INT;
        getUrl.quitSafely();
        int i6 = addHeader + 15;
        AGRequest$Builder = i6 % 128;
        int i7 = i6 % 2;
        try {
            getUrl.join();
            getUrl = null;
        } catch (InterruptedException unused) {
        }
        getBody.unlock();
        MethodCollector.o(2096);
    }

    private parseResponseHeaders(String str) {
        super(str);
    }

    static class getBody extends Handler {
        private static int AGRequest;
        private static int AGRequest$Builder = 1;
        private static int getBody;
        private static long getHeaders = 0;
        private static char getMethod = 42660;
        private final String getUrl;

        static {
            Covode.recordClassIndex(2562);
        }

        public final void dispatchMessage(Message message) {
            int i2 = AGRequest$Builder + 109;
            getBody = i2 % 128;
            int i3 = i2 % 2;
            try {
                super.dispatchMessage(message);
                int i4 = getBody + 85;
                AGRequest$Builder = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e2) {
                checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.UriFilter$UrlTest, new StringBuilder().append(getBody("\u0000\u0000\u0000\u0000", "럜献᧥씥篭", "笞᧝臞겛", (char) (39809 - View.resolveSize(0, 0)), (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) - 1).intern()).append(this.getUrl).append(getBody("\u0000\u0000\u0000\u0000", "鄆", "⌖屓虦벖", (char) (38535 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1))), TextUtils.getTrimmedLength("") + 1717326627).intern()).append((String) ((Class) getMethod.AGRequest((char) (ViewConfiguration.getScrollBarSize() >> 8), 39 - Process.getGidForName(""), (ViewConfiguration.getTapTimeout() >> 16) + 5997)).getMethod("getMethod", Throwable.class).invoke(null, e2)).toString());
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        getBody(Looper looper, String str) {
            super(looper);
            this.getUrl = str;
        }

        private static String getBody(String str, String str2, String str3, char c2, int i2) {
            int i3 = getBody + 93;
            AGRequest$Builder = i3 % 128;
            int i4 = i3 % 2;
            char[] cArr = str3;
            if (str3 != null) {
                cArr = str3.toCharArray();
            }
            char[] cArr2 = cArr;
            char[] cArr3 = str2;
            if (str2 != null) {
                int i5 = AGRequest$Builder + 41;
                getBody = i5 % 128;
                int i6 = i5 % 2;
                cArr3 = str2.toCharArray();
            }
            char[] cArr4 = cArr3;
            char[] cArr5 = str;
            if (str != null) {
                int i7 = getBody + 43;
                AGRequest$Builder = i7 % 128;
                int i8 = i7 % 2;
                char[] charArray = str.toCharArray();
                int i9 = getBody + 37;
                AGRequest$Builder = i9 % 128;
                int i10 = i9 % 2;
                cArr5 = charArray;
            }
            char[] cArr6 = (char[]) cArr2.clone();
            char[] cArr7 = (char[]) cArr5.clone();
            cArr6[0] = (char) (c2 ^ cArr6[0]);
            cArr7[2] = (char) (cArr7[2] + ((char) i2));
            int length = cArr4.length;
            char[] cArr8 = new char[length];
            for (int i11 = 0; i11 < length; i11++) {
                setNextFocusUpId.getHeaders(cArr6, cArr7, i11);
                cArr8[i11] = (char) ((int) (((((long) (cArr4[i11] ^ cArr6[(i11 + 3) % 4])) ^ getHeaders) ^ ((long) AGRequest)) ^ ((long) getMethod)));
            }
            return new String(cArr8);
        }
    }

    /* JADX INFO: finally extract failed */
    public static boolean AGRequest(String str, Runnable runnable) {
        int i2 = addHeader + 73;
        AGRequest$Builder = i2 % 128;
        boolean z = false;
        if (i2 % 2 != 0 ? !getMethod.tryLock() : !getMethod.tryLock()) {
            checkCertificates.AGRequest(log.getBody.getMethod, new StringBuilder().append(getBody((ViewConfiguration.getFadingEdgeLength() >> 16) + 127, null, null, " ").intern()).append(str).toString());
            int i3 = AGRequest$Builder + 75;
            addHeader = i3 % 128;
            int i4 = i3 % 2;
        } else {
            try {
                if (getUrl != null) {
                    z = new getBody(getMethod().getLooper(), str).post(runnable);
                } else {
                    checkCertificates.AGRequest(log.getBody.getMethod, new StringBuilder().append(str).append(getBody(127 - (ViewConfiguration.getFadingEdgeLength() >> 16), null, null, "").intern()).toString());
                }
                getMethod.unlock();
                int i5 = addHeader + 27;
                AGRequest$Builder = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                getMethod.unlock();
                throw th;
            }
        }
        return z;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v2 */
    private static String getBody(int i2, String str, int[] iArr, String str2) {
        if (str2 != 0) {
            int i3 = AGRequest$Builder + 9;
            addHeader = i3 % 128;
            int i4 = i3 % 2;
            str2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str2;
        char[] cArr = str;
        if (str != null) {
            int i5 = addHeader + 93;
            AGRequest$Builder = i5 % 128;
            int i6 = i5 % 2;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = getHeaders;
        int i7 = method;
        int i8 = 0;
        if (url) {
            int i9 = AGRequest$Builder + 11;
            addHeader = i9 % 128;
            int i10 = i9 % 2;
            int length = bArr.length;
            char[] cArr4 = new char[length];
            for (int i11 = 0; i11 < length; i11++) {
                cArr4[i11] = (char) (cArr3[bArr[(length - 1) - i11] + i2] - i7);
            }
            return new String(cArr4);
        } else if (newBuilder) {
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            while (i8 < length2) {
                cArr5[i8] = (char) (cArr3[cArr2[(length2 - 1) - i8] - i2] - i7);
                i8++;
                int i12 = AGRequest$Builder + 119;
                addHeader = i12 % 128;
                int i13 = i12 % 2;
            }
            return new String(cArr5);
        } else {
            int length3 = iArr.length;
            char[] cArr6 = new char[length3];
            while (i8 < length3) {
                int i14 = addHeader + 123;
                AGRequest$Builder = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr6[i8] = (char) (cArr3[iArr[(length3 >>> 1) % i8] >>> i2] >>> i7);
                    i8 += 41;
                } else {
                    cArr6[i8] = (char) (cArr3[iArr[(length3 - 1) - i8] - i2] - i7);
                    i8++;
                }
            }
            return new String(cArr6);
        }
    }
}
