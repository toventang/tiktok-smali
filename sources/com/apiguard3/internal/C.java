package com.apiguard3.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import android.widget.ExpandableListView;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class C {
    private static char[] addHeader = {'C', 130, 's', '6', 'm', 'h', 'b', 'B', 'F', 'n', 'i', 'l', 'p', 'h', 'O', '9', 'u', '_', ']', 'q', 'h', 'k', 'n', 'l', 'n', 'T', 'Q', 'k', 'q', 'l', 'k', 'p', 'g', 'f', '_', 'c', 'q', 'X', '\\', 'q', 'Y', 'Y', 'q', 29, 'T', 'n', 'l', 'n', 'k', 'h', 'q', ']', 'S', 'k', '`', ']', 'q', 'c', '_', 'f', 'g', 'p', 'k', 'l', 'q', 'k', 142, 280, 271, 272, 275, 273, 263, 268, 276, 269, 273, 277, 278, 274, '7', 'r', 's', 'i', 'l', 't', 'n', 'm'};
    private static int get;
    private static Object newBuilder$499b8d54;
    private static int post = 1;
    private final long AGRequest;
    private AtomicBoolean AGRequest$Builder = new AtomicBoolean(true);
    private Thread.UncaughtExceptionHandler getBody;
    private final Handler getHeaders;
    private final HandlerThread getMethod;
    private getHeaders getUrl;
    private long method;
    private Object url$6c851a34;

    public interface getHeaders {
        static {
            Covode.recordClassIndex(2509);
        }

        void getUrl(long j2, String str);
    }

    static {
        Covode.recordClassIndex(2504);
    }

    private native int am(long j2, String str, byte[] bArr);

    private native long ce();

    private native void de(long j2);

    private native String rf(long j2, String str, Object[] objArr);

    private native int rm(long j2, String str);

    public final long getHeaders() {
        int i2 = get + 33;
        post = i2 % 128;
        if (i2 % 2 != 0) {
            return this.AGRequest;
        }
        long j2 = this.AGRequest;
        throw new NullPointerException("hashCode");
    }

    public final Handler getMethod() {
        int i2 = get + 121;
        post = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getHeaders;
        }
        return this.getHeaders;
    }

    public static String gc() {
        char c2;
        int i2 = post + 123;
        get = i2 % 128;
        if (i2 % 2 == 0) {
            c2 = 14;
        } else {
            c2 = '\"';
        }
        if (c2 != '\"') {
            try {
                return (String) ((Class) getMethod.AGRequest((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 30, (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 28)).getMethod("getMethod", null).invoke(newBuilder$499b8d54, null);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            try {
                return (String) ((Class) getMethod.AGRequest((char) (-1 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 31, Drawable.resolveOpacity(0, 0) + 29)).getMethod("getMethod", null).invoke(newBuilder$499b8d54, null);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
    }

    public final void getUrl() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.getHeaders.post(new Runnable() {
            /* class com.apiguard3.internal.C.AnonymousClass5 */
            private static int AGRequest;
            private static int getUrl = 1;

            static {
                Covode.recordClassIndex(2507);
            }

            public final void run() {
                int i2 = getUrl + 45;
                AGRequest = i2 % 128;
                int i3 = i2 % 2;
                try {
                    C.getHeaders(C.this);
                    countDownLatch.countDown();
                    int i4 = getUrl + 71;
                    AGRequest = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        });
        try {
            countDownLatch.await(20, TimeUnit.SECONDS);
            int i2 = post + 85;
            get = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Context gt() {
        boolean z;
        Context context;
        int i2 = get + 37;
        post = i2 % 128;
        if (i2 % 2 != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                context = (Context) ((Class) getMethod.AGRequest((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 49, 5814 - TextUtils.lastIndexOf("", '0', 0))).getMethod("getBody", null).invoke(null, null);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            try {
                context = (Context) ((Class) getMethod.AGRequest((char) (KeyEvent.getMaxKeyCode() >> 16), 50 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 5815)).getMethod("getBody", null).invoke(null, null);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        int i3 = post + 5;
        get = i3 % 128;
        int i4 = i3 % 2;
        return context;
    }

    static class getBody implements Thread.UncaughtExceptionHandler {
        private static int getMethod = 1;
        private static int getUrl;
        private WeakReference<C> getBody;

        static {
            Covode.recordClassIndex(2508);
        }

        getBody(C c2) {
            this.getBody = new WeakReference<>(c2);
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            try {
                checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.rm, (String) ((Class) getMethod.AGRequest((char) TextUtils.getCapsMode("", 0, 0), 169 - PhoneNumberUtils.toaFromString(""), 5996 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("getMethod", Throwable.class).invoke(null, th));
                C c2 = this.getBody.get();
                if (c2 != null) {
                    int i2 = getMethod + 47;
                    getUrl = i2 % 128;
                    int i3 = i2 % 2;
                    C.getHeaders(c2);
                }
                int i4 = getUrl + 51;
                getMethod = i4 % 128;
                if (i4 % 2 == 0) {
                    throw new NullPointerException("hashCode");
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
    }

    public final void getHeaders$62cb83c9(final Object obj) {
        this.getHeaders.post(new Runnable() {
            /* class com.apiguard3.internal.C.AnonymousClass2 */
            private static char AGRequest = 4;
            private static int AGRequest$Builder = 1;
            private static char[] getHeaders = {'a', '0', 'i', 'n', 't', 'A', 'p', 's', 'c', 'o', 'l', 'e', 'S', 'g', 'b', 'd'};
            private static int getUrl;

            static {
                Covode.recordClassIndex(2506);
            }

            public final void run() {
                int i2 = getUrl + 31;
                AGRequest$Builder = i2 % 128;
                int i3 = i2 % 2;
                C.getMethod$3dc4f0e6(C.this, obj, getMethod("\u0001\u0002", (byte) (7 - View.MeasureSpec.getSize(0)), (KeyEvent.getMaxKeyCode() >> 16) + 2).intern(), getMethod("\u0003\u0000\u0000\u0006\u0006\u0007\u0007\u0004", (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 104), Color.argb(0, 0, 0, 0) + 8).intern());
                C.this.AGRequest(getMethod("\t\nÒÒ\b\t\b\u0000\u0001\u000e\u0000\u0001\u000b\u0006", (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 101), 13 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), null);
                int i4 = AGRequest$Builder + 37;
                getUrl = i4 % 128;
                int i5 = i4 % 2;
            }

            private static String getMethod(String str, byte b2, int i2) {
                char[] cArr = str;
                if (str != null) {
                    int i3 = getUrl + 121;
                    AGRequest$Builder = i3 % 128;
                    int i4 = i3 % 2;
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                char[] cArr3 = getHeaders;
                char c2 = AGRequest;
                char[] cArr4 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr4[i2] = (char) (cArr2[i2] - b2);
                    int i5 = getUrl + 109;
                    AGRequest$Builder = i5 % 128;
                    int i6 = i5 % 2;
                }
                if (i2 > 1) {
                    for (int i7 = 0; i7 < i2; i7 += 2) {
                        char c3 = cArr2[i7];
                        int i8 = i7 + 1;
                        char c4 = cArr2[i8];
                        if (c3 != c4) {
                            int AGRequest2 = setNextClusterForwardId.AGRequest(c3, c2);
                            int body = setNextClusterForwardId.getBody(c3, c2);
                            int AGRequest3 = setNextClusterForwardId.AGRequest(c4, c2);
                            int body2 = setNextClusterForwardId.getBody(c4, c2);
                            if (body == body2) {
                                int i9 = AGRequest$Builder + 71;
                                getUrl = i9 % 128;
                                int i10 = i9 % 2;
                                int headers = setNextClusterForwardId.getHeaders(AGRequest2, c2);
                                int headers2 = setNextClusterForwardId.getHeaders(AGRequest3, c2);
                                int body3 = setNextClusterForwardId.getBody(headers, body, c2);
                                int body4 = setNextClusterForwardId.getBody(headers2, body2, c2);
                                cArr4[i7] = cArr3[body3];
                                cArr4[i8] = cArr3[body4];
                            } else if (AGRequest2 != AGRequest3) {
                                int body5 = setNextClusterForwardId.getBody(AGRequest2, body2, c2);
                                int body6 = setNextClusterForwardId.getBody(AGRequest3, body, c2);
                                cArr4[i7] = cArr3[body5];
                                cArr4[i8] = cArr3[body6];
                            } else {
                                int headers3 = setNextClusterForwardId.getHeaders(body, c2);
                                int headers4 = setNextClusterForwardId.getHeaders(body2, c2);
                                int body7 = setNextClusterForwardId.getBody(AGRequest2, headers3, c2);
                                int body8 = setNextClusterForwardId.getBody(AGRequest3, headers4, c2);
                                cArr4[i7] = cArr3[body7];
                                cArr4[i8] = cArr3[body8];
                            }
                        } else {
                            cArr4[i7] = (char) (c3 - b2);
                            cArr4[i8] = (char) (c4 - b2);
                        }
                    }
                }
                return new String(cArr4);
            }
        });
        int i2 = get + 123;
        post = i2 % 128;
        int i3 = i2 % 2;
    }

    private static byte[] AGRequest(String str) {
        char c2;
        byte[] bArr;
        int i2 = get + 117;
        post = i2 % 128;
        if (i2 % 2 != 0) {
            c2 = 18;
        } else {
            c2 = '&';
        }
        if (c2 != '&') {
            try {
                try {
                    bArr = (byte[]) ((Class) getMethod.AGRequest((char) (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), 40 - Drawable.resolveOpacity(0, 0), 5997 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("getMethod", byte[].class).invoke(null, Base64.decode(str, 0));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (IOException unused) {
                checkCertificates.getMethod(log.getBody.getHeaders, getState.getHeaders.FraudScore);
                return null;
            }
        } else {
            try {
                bArr = (byte[]) ((Class) getMethod.AGRequest((char) Color.blue(0), Color.red(0) + 40, 5997 - TextUtils.indexOf("", "", 0))).getMethod("getMethod", byte[].class).invoke(null, Base64.decode(str, 1));
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return bArr;
    }

    public final boolean getMethod$313e9912(Object obj) {
        int i2 = post + 73;
        int i3 = i2 % 128;
        get = i3;
        if (i2 % 2 == 0 ? this.url$6c851a34 == null : this.url$6c851a34 == null) {
            return false;
        }
        int i4 = i3 + 65;
        post = i4 % 128;
        if (i4 % 2 != 0) {
            try {
                return ((Boolean) ((Class) getMethod.AGRequest((char) View.resolveSize(0, 0), 39 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 59 - Color.green(0))).getMethod("getUrl", (Class) getMethod.AGRequest((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 36006), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, (Process.myTid() >> 22) + 328)).invoke(this.url$6c851a34, obj)).booleanValue();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            Object obj2 = this.url$6c851a34;
            try {
                ((Boolean) ((Class) getMethod.AGRequest((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) + 40, 59 - KeyEvent.getDeadChar(0, 0))).getMethod("getUrl", (Class) getMethod.AGRequest((char) (36007 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 28, 328 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).invoke(obj2, obj)).booleanValue();
                throw new NullPointerException("hashCode");
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0109, code lost:
        if (r14.AGRequest$Builder.getAndSet(true) != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0133, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(5132);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0136, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void getHeaders(com.apiguard3.internal.C r14) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.C.getHeaders(com.apiguard3.internal.C):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ca, code lost:
        if (r5 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cf, code lost:
        if (r5 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010a, code lost:
        if (((java.lang.Boolean) ((java.lang.Class) com.apiguard3.internal.getMethod.AGRequest((char) (-1 - android.text.TextUtils.lastIndexOf("", '0', 0, 0)), 40 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 59)).getMethod("AGRequest", java.lang.String.class).invoke(r5, r17)).booleanValue() != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010c, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010d, code lost:
        r1 = com.apiguard3.internal.C.get + 73;
        com.apiguard3.internal.C.post = r1 % 128;
        r0 = r1 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0117, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0118, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0119, code lost:
        r0 = r1.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011d, code lost:
        if (r0 != null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0120, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int sc(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.C.sc(java.lang.String):int");
    }

    public final void getHeaders(final String str, final Object[] objArr) {
        this.getHeaders.post(new Runnable() {
            /* class com.apiguard3.internal.C.AnonymousClass1 */
            private static int AGRequest;
            private static int getMethod = 1;

            static {
                Covode.recordClassIndex(2505);
            }

            public final void run() {
                int i2 = AGRequest + 81;
                getMethod = i2 % 128;
                if (i2 % 2 != 0) {
                    C.this.AGRequest(str, objArr);
                } else {
                    C.this.AGRequest(str, objArr);
                }
                int i3 = AGRequest + 49;
                getMethod = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = get + 89;
        post = i2 % 128;
        int i3 = i2 % 2;
    }

    /* access modifiers changed from: package-private */
    public final String AGRequest(String str, Object[] objArr) {
        char c2;
        boolean z;
        char c3;
        MethodCollector.i(4982);
        int i2 = post + 115;
        get = i2 % 128;
        if (i2 % 2 == 0) {
            c2 = ';';
        } else {
            c2 = '<';
        }
        if (c2 == ';' ? !this.AGRequest$Builder.get() : !this.AGRequest$Builder.get()) {
            String rf = rf(this.method, str, objArr);
            if (rf == null) {
                checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.C, new StringBuilder().append(getMethod(new int[]{43, 23, 0, 0}, PhoneNumberUtils.is12Key('0'), "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern()).append(str).toString());
            }
            if (!(this.getUrl == null || rf == null)) {
                int i3 = get + 67;
                post = i3 % 128;
                int i4 = i3 % 2;
                if (!str.equals(getMethod(new int[]{66, 14, 169, 0}, TextUtils.isDigitsOnly(""), "\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000").intern())) {
                    c3 = 'J';
                } else {
                    c3 = '`';
                }
                if (c3 != 'J') {
                    this.getUrl.getUrl(this.AGRequest, rf);
                }
            }
            MethodCollector.o(4982);
            return rf;
        }
        checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.gt, new StringBuilder().append(getMethod(new int[]{43, 23, 0, 0}, URLUtil.isNetworkUrl("http://"), "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern()).append(str).toString());
        int i5 = get + 3;
        post = i5 % 128;
        if (i5 % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                throw new NullPointerException("hashCode");
            } catch (Throwable th) {
                MethodCollector.o(4982);
                throw th;
            }
        } else {
            MethodCollector.o(4982);
            return null;
        }
    }

    public C(long j2, Object obj, getHeaders getheaders) {
        this.AGRequest = j2;
        this.getUrl = getheaders;
        this.url$6c851a34 = obj;
        HandlerThread handlerThread = new HandlerThread(new StringBuilder().append(getMethod(new int[]{0, 3, 58, 0}, true ^ URLUtil.isFileUrl("file://"), "\u0000\u0001\u0000").intern()).append(j2).toString());
        this.getMethod = handlerThread;
        handlerThread.start();
        this.getHeaders = new Handler(handlerThread.getLooper());
        getBody getbody = new getBody(this);
        this.getBody = getbody;
        handlerThread.setUncaughtExceptionHandler(getbody);
    }

    private static String getMethod(int[] iArr, boolean z, String str) {
        boolean z2;
        int i2 = get;
        int i3 = i2 + 103;
        post = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        byte[] bArr = str;
        if (z2) {
            int i5 = i2 + 73;
            post = i5 % 128;
            int i6 = i5 % 2;
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr = new char[i8];
        System.arraycopy(addHeader, i7, cArr, 0, i8);
        if (bArr2 != null) {
            int i11 = post + 113;
            get = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr2 = new char[i8];
            char c2 = 0;
            for (int i13 = 0; i13 < i8; i13++) {
                if (bArr2[i13] == 1) {
                    cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c2);
                } else {
                    cArr2[i13] = (char) ((cArr[i13] << 1) - c2);
                }
                c2 = cArr2[i13];
            }
            cArr = cArr2;
        }
        if (i10 > 0) {
            char[] cArr3 = new char[i8];
            System.arraycopy(cArr, 0, cArr3, 0, i8);
            int i14 = i8 - i10;
            System.arraycopy(cArr3, 0, cArr, i14, i10);
            System.arraycopy(cArr3, i10, cArr, 0, i14);
        }
        if (z) {
            char[] cArr4 = new char[i8];
            for (int i15 = 0; i15 < i8; i15++) {
                cArr4[i15] = cArr[(i8 - i15) - 1];
            }
            cArr = cArr4;
        }
        if (i9 > 0) {
            for (int i16 = 0; i16 < i8; i16++) {
                int i17 = get + 113;
                post = i17 % 128;
                int i18 = i17 % 2;
                cArr[i16] = (char) (cArr[i16] - iArr[2]);
            }
        }
        return new String(cArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (com.apiguard3.BuildConfig.getHeaders.booleanValue() == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void getMethod$3dc4f0e6(com.apiguard3.internal.C r13, java.lang.Object r14, java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 516
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.C.getMethod$3dc4f0e6(com.apiguard3.internal.C, java.lang.Object, java.lang.String, java.lang.String):void");
    }
}
