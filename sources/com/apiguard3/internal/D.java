package com.apiguard3.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class D {
    private static int AGRequest$Builder = 1;
    private static initialize<Boolean> getBody;
    private static boolean getMethod = false;
    private static D getUrl;
    private static long method;
    private static int url;
    private final NTE AGRequest = new NTE();
    private Context getHeaders;

    static void AGRequest() {
        method = -5335109962443312812L;
    }

    /* access modifiers changed from: package-private */
    public native String cs(String str, String str2, String str3);

    /* access modifiers changed from: package-private */
    public native int dpi();

    /* access modifiers changed from: package-private */
    public native String[] gt(String str, String str2);

    /* access modifiers changed from: package-private */
    public native int ipi(String str);

    /* access modifiers changed from: package-private */
    public native int sdf(long j2, long j3);

    /* access modifiers changed from: package-private */
    public native int spi(String str);

    D() {
    }

    static {
        Covode.recordClassIndex(2511);
        url = 0;
        AGRequest();
        int i2 = AGRequest$Builder + 73;
        url = i2 % 128;
        int i3 = i2 % 2;
    }

    public final int getUrl() {
        int i2;
        int i3;
        Number number = (Number) this.AGRequest.AGRequest(new getUrl(new getBody(this, (byte) 0), getBody("涓殎混媪诟巬").intern()));
        if (number != null) {
            i2 = number.intValue();
            i3 = AGRequest$Builder + 17;
            url = i3 % 128;
        } else {
            i2 = -1;
            i3 = url + 119;
            AGRequest$Builder = i3 % 128;
        }
        int i4 = i3 % 2;
        return i2;
    }

    static class AGRequest implements Callable<String[]> {
        private static int AGRequest = 1;
        private static int getHeaders;
        private final String getBody;
        private WeakReference<D> getMethod;
        private final String getUrl;

        static {
            Covode.recordClassIndex(2512);
        }

        static class Builder implements Callable<Boolean> {
            private static int AGRequest = 1;
            private static int getBody;
            private long getHeaders;
            private WeakReference<D> getMethod;
            private long getUrl;

            static {
                Covode.recordClassIndex(2513);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Boolean call() {
                D d2;
                MethodCollector.i(2197);
                int i2 = AGRequest + 25;
                getBody = i2 % 128;
                boolean z = false;
                if (i2 % 2 != 0 ? (d2 = this.getMethod.get()) != null : (d2 = this.getMethod.get()) != null) {
                    int i3 = getBody + 85;
                    AGRequest = i3 % 128;
                    if (i3 % 2 != 0 ? d2.sdf(this.getUrl, this.getHeaders) == 0 : d2.sdf(this.getUrl, this.getHeaders) == 0) {
                        z = true;
                    }
                }
                Boolean valueOf = Boolean.valueOf(z);
                MethodCollector.o(2197);
                return valueOf;
            }

            private Builder(D d2, long j2, long j3) {
                this.getMethod = new WeakReference<>(d2);
                this.getUrl = j2;
                this.getHeaders = j3;
            }

            /* synthetic */ Builder(D d2, long j2, long j3, byte b2) {
                this(d2, j2, j3);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ String[] call() {
            char c2;
            char c3;
            boolean z;
            MethodCollector.i(2741);
            int i2 = getHeaders + 57;
            AGRequest = i2 % 128;
            int i3 = i2 % 2;
            D d2 = this.getMethod.get();
            if (d2 != null) {
                c2 = '\"';
            } else {
                c2 = 0;
            }
            if (c2 != 0) {
                String[] gt = d2.gt(this.getBody, this.getUrl);
                if (gt == null) {
                    c3 = '-';
                } else {
                    c3 = '@';
                }
                if (c3 != '-') {
                    if (gt.length != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        MethodCollector.o(2741);
                        return gt;
                    }
                }
                checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.NotReadyException);
                String[] strArr = new String[0];
                MethodCollector.o(2741);
                return strArr;
            }
            int i4 = AGRequest + 71;
            getHeaders = i4 % 128;
            if (i4 % 2 == 0) {
                MethodCollector.o(2741);
                return null;
            }
            try {
                throw new NullPointerException("hashCode");
            } catch (Throwable th) {
                MethodCollector.o(2741);
                throw th;
            }
        }

        private AGRequest(D d2, String str, String str2) {
            this.getMethod = new WeakReference<>(d2);
            this.getBody = str;
            this.getUrl = str2;
        }

        /* synthetic */ AGRequest(D d2, String str, String str2, byte b2) {
            this(d2, str, str2);
        }
    }

    static class getBody implements Callable<Integer> {
        private static int AGRequest = 1;
        private static long getHeaders = 3646301437250124237L;
        private static int getUrl;
        private WeakReference<D> getMethod;

        static {
            Covode.recordClassIndex(2514);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Integer call() {
            MethodCollector.i(2767);
            D d2 = this.getMethod.get();
            if (d2 != null) {
                int dpi = d2.dpi();
                if (dpi != 0) {
                    checkCertificates.AGRequest(log.getBody.getHeaders, new StringBuilder().append(getUrl("?辝ꢌ嗦绪ᮋ쓍訠뜏偖絥♠썊").intern()).append(dpi).toString());
                }
                Integer valueOf = Integer.valueOf(dpi);
                MethodCollector.o(2767);
                return valueOf;
            }
            int i2 = getUrl;
            int i3 = i2 + 67;
            AGRequest = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 13;
            AGRequest = i5 % 128;
            int i6 = i5 % 2;
            MethodCollector.o(2767);
            return null;
        }

        private getBody(D d2) {
            this.getMethod = new WeakReference<>(d2);
        }

        private static String getUrl(String str) {
            int i2 = getUrl;
            int i3 = i2 + 19;
            AGRequest = i3 % 128;
            int i4 = i3 % 2;
            char[] cArr = str;
            if (str != null) {
                int i5 = i2 + 105;
                AGRequest = i5 % 128;
                int i6 = i5 % 2;
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            char c2 = cArr2[0];
            char[] cArr3 = new char[(cArr2.length - 1)];
            for (int i7 = 1; i7 < cArr2.length; i7++) {
                cArr3[i7 - 1] = (char) ((int) (((long) (cArr2[i7] ^ (i7 * c2))) ^ getHeaders));
            }
            return new String(cArr3);
        }

        /* synthetic */ getBody(D d2, byte b2) {
            this(d2);
        }
    }

    static class getMethod implements Callable<Integer> {
        private static int AGRequest = 60;
        private static int addHeader;
        private static boolean getBody = true;
        private static char[] getHeaders = {129, 174, 171, '\\', 179, 165, 176, 164, 172, 'v'};
        private static boolean getUrl = true;
        private static int method = 1;
        private WeakReference<D> getMethod;

        static {
            Covode.recordClassIndex(2516);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Integer call() {
            D d2;
            MethodCollector.i(2222);
            int i2 = addHeader + 61;
            method = i2 % 128;
            if (i2 % 2 != 0 ? (d2 = this.getMethod.get()) == null : (d2 = this.getMethod.get()) == null) {
                MethodCollector.o(2222);
                return null;
            }
            int ipi = d2.ipi(com_apiguard3_internal_D$getMethod_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(D.getHeaders(d2)).getAbsolutePath());
            if (ipi != 0) {
                checkCertificates.AGRequest(log.getBody.getHeaders, new StringBuilder().append(getHeaders(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, null, "").intern()).append(ipi).toString());
            }
            Integer valueOf = Integer.valueOf(ipi);
            int i3 = addHeader + 29;
            method = i3 % 128;
            int i4 = i3 % 2;
            MethodCollector.o(2222);
            return valueOf;
        }

        private getMethod(D d2) {
            this.getMethod = new WeakReference<>(d2);
        }

        public static File com_apiguard3_internal_D$getMethod_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
            if (d.f107195c != null && d.f107197e) {
                return d.f107195c;
            }
            File filesDir = context.getFilesDir();
            d.f107195c = filesDir;
            return filesDir;
        }

        /* synthetic */ getMethod(D d2, byte b2) {
            this(d2);
        }

        private static String getHeaders(int i2, String str, int[] iArr, String str2) {
            int i3;
            char[] cArr;
            int i4 = addHeader + 75;
            method = i4 % 128;
            byte[] bArr = str2;
            bArr = str2;
            if (i4 % 2 != 0 ? str2 != null : str2 != null) {
                bArr = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            char[] cArr2 = str;
            if (str != null) {
                int i5 = addHeader + 61;
                method = i5 % 128;
                int i6 = i5 % 2;
                cArr2 = str.toCharArray();
            }
            char[] cArr3 = cArr2;
            char[] cArr4 = getHeaders;
            int i7 = AGRequest;
            int i8 = 0;
            if (getUrl) {
                int i9 = method + 27;
                addHeader = i9 % 128;
                int i10 = i9 % 2;
                int length = bArr2.length;
                char[] cArr5 = new char[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = addHeader + 111;
                    method = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr5[i11] = (char) (cArr4[bArr2[(length - 1) - i11] + i2] - i7);
                        i11++;
                    } else {
                        cArr5[i11] = (char) (cArr4[bArr2[(length * 1) + i11] >>> i2] / i7);
                        i11 += 3;
                    }
                }
                String str3 = new String(cArr5);
                int i13 = addHeader + 91;
                method = i13 % 128;
                int i14 = i13 % 2;
                return str3;
            } else if (!getBody) {
                int length2 = iArr.length;
                char[] cArr6 = new char[length2];
                for (int i15 = 0; i15 < length2; i15++) {
                    cArr6[i15] = (char) (cArr4[iArr[(length2 - 1) - i15] - i2] - i7);
                }
                return new String(cArr6);
            } else {
                int i16 = method + 45;
                addHeader = i16 % 128;
                if (i16 % 2 != 0) {
                    i3 = cArr3.length;
                    cArr = new char[i3];
                    i8 = 1;
                } else {
                    i3 = cArr3.length;
                    cArr = new char[i3];
                }
                while (i8 < i3) {
                    cArr[i8] = (char) (cArr4[cArr3[(i3 - 1) - i8] - i2] - i7);
                    i8++;
                }
                return new String(cArr);
            }
        }
    }

    static class getUrl<TaskResult> extends MT<TaskResult> {
        private static int getHeaders = 1;
        private static int getMethod;

        static {
            Covode.recordClassIndex(2517);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
            if (com.apiguard3.internal.D.getHeaders() != false) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
            if (r0 != 'E') goto L_0x0030;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            r1 = com.apiguard3.internal.D.getUrl.getHeaders + 27;
            com.apiguard3.internal.D.getUrl.getMethod = r1 % 128;
            r0 = r1 % 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
            com.apiguard3.internal.checkCertificates.getMethod(com.apiguard3.internal.log.getBody.getHeaders, com.apiguard3.internal.getState.getHeaders.initialize);
            r1 = com.apiguard3.internal.D.getUrl.getMethod + 101;
            com.apiguard3.internal.D.getUrl.getHeaders = r1 % 128;
            r0 = r1 % 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
            return null;
         */
        @Override // com.apiguard3.internal.MT, java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final TaskResult call() {
            /*
                r4 = this;
                int r0 = com.apiguard3.internal.D.getUrl.getHeaders
                int r1 = r0 + 89
                int r0 = r1 % 128
                com.apiguard3.internal.D.getUrl.getMethod = r0
                int r0 = r1 % 2
                r1 = 88
                if (r0 != 0) goto L_0x0013
                r0 = 88
            L_0x0010:
                if (r0 == r1) goto L_0x0021
                goto L_0x0016
            L_0x0013:
                r0 = 70
                goto L_0x0010
            L_0x0016:
                boolean r0 = com.apiguard3.internal.D.getHeaders()     // Catch:{ all -> 0x004f }
                r1 = 69
                if (r0 == 0) goto L_0x002c
                r0 = 69
                goto L_0x002e
            L_0x0021:
                boolean r0 = com.apiguard3.internal.D.getHeaders()     // Catch:{ all -> 0x004f }
                if (r0 == 0) goto L_0x0030
            L_0x0027:
                java.lang.Object r0 = super.call()     // Catch:{ all -> 0x004f }
                goto L_0x003b
            L_0x002c:
                r0 = 59
            L_0x002e:
                if (r0 == r1) goto L_0x0027
            L_0x0030:
                int r0 = com.apiguard3.internal.D.getUrl.getHeaders
                int r1 = r0 + 27
                int r0 = r1 % 128
                com.apiguard3.internal.D.getUrl.getMethod = r0
                int r0 = r1 % 2
                goto L_0x003c
            L_0x003b:
                return r0
            L_0x003c:
                com.apiguard3.internal.log$getBody r1 = com.apiguard3.internal.log.getBody.getHeaders
                com.apiguard3.internal.getState$getHeaders r0 = com.apiguard3.internal.getState.getHeaders.initialize
                com.apiguard3.internal.checkCertificates.getMethod(r1, r0)
                r2 = 0
                int r0 = com.apiguard3.internal.D.getUrl.getMethod
                int r1 = r0 + 101
                int r0 = r1 % 128
                com.apiguard3.internal.D.getUrl.getHeaders = r0
                int r0 = r1 % 2
                return r2
            L_0x004f:
                r3 = move-exception
                com.apiguard3.internal.log$getBody r2 = com.apiguard3.internal.log.getBody.getHeaders
                com.apiguard3.internal.getState$getHeaders r1 = com.apiguard3.internal.getState.getHeaders.send
                java.lang.String r0 = r3.toString()
                com.apiguard3.internal.checkCertificates.AGRequest(r2, r1, r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.D.getUrl.call():java.lang.Object");
        }

        getUrl(Callable<TaskResult> callable, String str) {
            super(callable, str);
        }
    }

    static synchronized boolean getHeaders() {
        boolean z;
        synchronized (D.class) {
            MethodCollector.i(2233);
            int i2 = url + 55;
            AGRequest$Builder = i2 % 128;
            if (i2 % 2 != 0) {
                if (!getMethod) {
                    int i3 = AGRequest$Builder + 9;
                    url = i3 % 128;
                    int i4 = i3 % 2;
                    try {
                        getMethod = getBody.get(3, TimeUnit.SECONDS).booleanValue();
                    } catch (InterruptedException | TimeoutException e2) {
                        checkCertificates.AGRequest(log.getBody.getHeaders, getState.getBody.get, e2.toString());
                    }
                }
                z = getMethod;
                MethodCollector.o(2233);
            } else {
                boolean z2 = getMethod;
                try {
                    throw new NullPointerException("hashCode");
                } catch (Throwable th) {
                    MethodCollector.o(2233);
                    throw th;
                }
            }
        }
        return z;
    }

    public final int getMethod() {
        Number number = (Number) this.AGRequest.AGRequest(new getUrl(new getMethod(this, (byte) 0), getBody("쫇뜒쪮໓蘶氒昀").intern()));
        if (number != null) {
            return number.intValue();
        }
        int i2 = url + 23;
        AGRequest$Builder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = AGRequest$Builder + 31;
            url = i3 % 128;
            int i4 = i3 % 2;
            return -1;
        }
        throw new NullPointerException("hashCode");
    }

    static class getHeaders implements Callable<String> {
        private static long addHeader = -120180165693414488L;
        private static char[] method = {'[', 58250, 65312, 7302, 14448, '\"', 58357};
        private static int newBuilder;
        private static int url = 1;
        private final String AGRequest;
        private final String getBody;
        private WeakReference<D> getHeaders;
        private final String getMethod;
        private final String getUrl;

        static {
            Covode.recordClassIndex(2515);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ String call() {
            boolean z;
            MethodCollector.i(2772);
            int i2 = newBuilder + 75;
            url = i2 % 128;
            int i3 = i2 % 2;
            D d2 = this.getHeaders.get();
            if (d2 != null) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                String cs = d2.cs(this.getUrl, this.getMethod, this.getBody);
                if (cs != null) {
                    String obj = new StringBuilder().append(AGRequest(ExpandableListView.getPackedPositionChild(0) + 1, (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 1, (char) TextUtils.indexOf("", "", 0, 0)).intern()).append(cs).append(AGRequest(1 - Process.getGidForName(""), 4 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65282)).intern()).append(this.getBody).append(AGRequest(View.MeasureSpec.getSize(0) + 2, 2 - TextUtils.lastIndexOf("", '0', 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 65282)).intern()).append(this.AGRequest).append(AGRequest((ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 4, (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 3, (char) TextUtils.indexOf("", "", 0)).intern()).toString();
                    MethodCollector.o(2772);
                    return obj;
                }
                checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.AGRequest$Builder);
                MethodCollector.o(2772);
                return null;
            }
            int i4 = newBuilder + 9;
            int i5 = i4 % 128;
            url = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 19;
            newBuilder = i7 % 128;
            int i8 = i7 % 2;
            MethodCollector.o(2772);
            return null;
        }

        private static String AGRequest(int i2, int i3, char c2) {
            char[] cArr = new char[i3];
            int i4 = url + 83;
            newBuilder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 < i3) {
                cArr[i6] = (char) ((int) ((((long) method[i2 + i6]) ^ (((long) i6) * addHeader)) ^ ((long) c2)));
                i6++;
                int i7 = newBuilder + 43;
                url = i7 % 128;
                int i8 = i7 % 2;
            }
            return new String(cArr);
        }

        private getHeaders(D d2, String str, String str2, String str3, String str4) {
            this.getHeaders = new WeakReference<>(d2);
            this.getUrl = str;
            this.getMethod = str2;
            this.getBody = str3;
            this.AGRequest = str4;
        }

        /* synthetic */ getHeaders(D d2, String str, String str2, String str3, String str4, byte b2) {
            this(d2, str, str2, str3, str4);
        }
    }

    static class url implements Callable<Integer> {
        private static int AGRequest = -1853951308;
        private static byte[] addHeader = {39, 79, 83, -87, 14, 74, 97, 72, -83, 4, 89, 83, 86, -125, 0};
        private static int getMethod = 81;
        private static int getUrl = -1956000097;
        private static short[] method;
        private static int newBuilder;
        private static int url = 1;
        private final String getBody;
        private WeakReference<D> getHeaders;

        static {
            Covode.recordClassIndex(2518);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Integer call() {
            MethodCollector.i(2778);
            D d2 = this.getHeaders.get();
            if (d2 != null) {
                int spi = d2.spi(this.getBody);
                if (spi != 0) {
                    checkCertificates.AGRequest(log.getBody.getHeaders, new StringBuilder().append(getHeaders(1853951376 - TextUtils.lastIndexOf("", '0'), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1956000096, TextUtils.lastIndexOf("", '0') - 65, (short) (-86 - Drawable.resolveOpacity(0, 0)), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern()).append(spi).toString());
                }
                Integer valueOf = Integer.valueOf(spi);
                MethodCollector.o(2778);
                return valueOf;
            }
            int i2 = url;
            int i3 = i2 + 5;
            newBuilder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 71;
            newBuilder = i5 % 128;
            int i6 = i5 % 2;
            MethodCollector.o(2778);
            return null;
        }

        private url(D d2, String str) {
            this.getHeaders = new WeakReference<>(d2);
            this.getBody = str;
        }

        /* synthetic */ url(D d2, String str, byte b2) {
            this(d2, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
            if (r4 == false) goto L_0x002b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
            if (r4 != false) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
            r5 = 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String getHeaders(int r7, int r8, int r9, short r10, byte r11) {
            /*
            // Method dump skipped, instructions count: 173
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.D.url.getHeaders(int, int, int, short, byte):java.lang.String");
        }
    }

    public static synchronized D getBody() {
        synchronized (D.class) {
            MethodCollector.i(2227);
            int i2 = url + 63;
            AGRequest$Builder = i2 % 128;
            if (i2 % 2 == 0) {
                D d2 = getUrl;
                try {
                    throw new NullPointerException("hashCode");
                } catch (Throwable th) {
                    MethodCollector.o(2227);
                    throw th;
                }
            } else if (getUrl == null) {
                getUrl = new D();
                try {
                    Context context = (Context) ((Class) getMethod.AGRequest((char) (1 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1))), 49 - (ViewConfiguration.getTapTimeout() >> 16), -16771401 - Color.rgb(0, 0, 0))).getMethod("getBody", null).invoke(null, null);
                    getUrl.getHeaders = context;
                    getBody = send.getMethod(context, "ag3");
                    D d3 = getUrl;
                    int i3 = AGRequest$Builder + 53;
                    url = i3 % 128;
                    if (i3 % 2 == 0) {
                        MethodCollector.o(2227);
                        return d3;
                    }
                    try {
                        throw new NullPointerException("hashCode");
                    } catch (Throwable th2) {
                        MethodCollector.o(2227);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        MethodCollector.o(2227);
                        throw cause;
                    }
                    MethodCollector.o(2227);
                    throw th3;
                }
            } else {
                int i4 = AGRequest$Builder + 3;
                url = i4 % 128;
                if (i4 % 2 == 0) {
                    D d4 = getUrl;
                    MethodCollector.o(2227);
                    return d4;
                }
                D d5 = getUrl;
                try {
                    throw new NullPointerException("hashCode");
                } catch (Throwable th4) {
                    MethodCollector.o(2227);
                    throw th4;
                }
            }
        }
    }

    static /* synthetic */ Context getHeaders(D d2) {
        int i2 = url;
        int i3 = i2 + 91;
        AGRequest$Builder = i3 % 128;
        int i4 = i3 % 2;
        Context context = d2.getHeaders;
        int i5 = i2 + 31;
        AGRequest$Builder = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (r8 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        if (r8 != null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getBody(java.lang.String r8) {
        /*
            int r0 = com.apiguard3.internal.D.AGRequest$Builder
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.apiguard3.internal.D.url = r0
            int r1 = r1 % 2
            r0 = 0
            r0 = 1
            if (r1 != 0) goto L_0x0053
            if (r8 == 0) goto L_0x0014
        L_0x0010:
            char[] r8 = r8.toCharArray()
        L_0x0014:
            char[] r8 = (char[]) r8
            long r0 = com.apiguard3.internal.D.method
            char[] r8 = com.apiguard3.internal.setNextFocusRightId.AGRequest(r0, r8)
            int r0 = com.apiguard3.internal.D.AGRequest$Builder
            int r1 = r0 + 111
            int r0 = r1 % 128
            com.apiguard3.internal.D.url = r0
            int r0 = r1 % 2
            r7 = 4
            r6 = 4
        L_0x0028:
            int r0 = r8.length
            if (r6 < r0) goto L_0x0033
            java.lang.String r1 = new java.lang.String
            int r0 = r8.length
            int r0 = r0 - r7
            r1.<init>(r8, r7, r0)
            return r1
        L_0x0033:
            int r2 = r6 + -4
            char r1 = r8[r6]
            int r0 = r6 % 4
            char r0 = r8[r0]
            r1 = r1 ^ r0
            long r4 = (long) r1
            long r2 = (long) r2
            long r0 = com.apiguard3.internal.D.method
            long r2 = r2 * r0
            long r4 = r4 ^ r2
            int r0 = (int) r4
            char r0 = (char) r0
            r8[r6] = r0
            int r6 = r6 + 1
            int r0 = com.apiguard3.internal.D.url
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.apiguard3.internal.D.AGRequest$Builder = r0
            int r0 = r1 % 2
            goto L_0x0028
        L_0x0053:
            r0 = 88
            if (r8 != 0) goto L_0x0010
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.D.getBody(java.lang.String):java.lang.String");
    }

    public final int getUrl(String str) {
        Number number = (Number) this.AGRequest.AGRequest(new getUrl(new url(this, str, (byte) 0), getBody("ⷻ긌ⶈ䙃鼨⒂騋").intern()));
        if (number != null) {
            int intValue = number.intValue();
            int i2 = url + 5;
            AGRequest$Builder = i2 % 128;
            if (i2 % 2 != 0) {
                return intValue;
            }
            throw new NullPointerException("hashCode");
        }
        int i3 = AGRequest$Builder + 29;
        url = i3 % 128;
        int i4 = i3 % 2;
        return -1;
    }

    public final void getHeaders(long j2, long j3) {
        this.AGRequest.AGRequest(new getUrl(new AGRequest.Builder(this, j2, j3, (byte) 0), getBody("ႶꞜჅᐿ隬盱ԧ").intern()));
        int i2 = AGRequest$Builder + 63;
        url = i2 % 128;
        int i3 = i2 % 2;
    }

    public final String[] getMethod(String str, String str2) {
        String[] strArr = (String[]) this.AGRequest.AGRequest(new getUrl(new AGRequest(this, str, str2, (byte) 0), getBody("䥎ﺋ䤩쾫䤩ᥚ").intern()));
        if (strArr != null) {
            int i2 = AGRequest$Builder + 55;
            url = i2 % 128;
            if (i2 % 2 == 0 ? strArr.length != 0 : strArr.length != 0) {
                return strArr;
            }
        }
        checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.getRequestHeaders);
        String[] strArr2 = new String[0];
        int i3 = AGRequest$Builder + 19;
        url = i3 % 128;
        int i4 = i3 % 2;
        return strArr2;
    }

    public final String AGRequest(String str, String str2, String str3, String str4) {
        String str5 = (String) this.AGRequest.AGRequest(new getUrl(new getHeaders(this, str, str2, str3, str4, (byte) 0), getBody("沐齣泳깄什悗").intern()));
        if (str5 == null) {
            int i2 = url + 67;
            AGRequest$Builder = i2 % 128;
            int i3 = i2 % 2;
            str5 = getBody("ݹ̀ܢ㉉轉").intern();
        }
        int i4 = url + 21;
        AGRequest$Builder = i4 % 128;
        int i5 = i4 % 2;
        return str5;
    }
}
