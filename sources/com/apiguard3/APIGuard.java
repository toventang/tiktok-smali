package com.apiguard3;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.apiguard3.domain.Config;
import com.apiguard3.internal.APIGuard$InitializationCallback;
import com.apiguard3.internal.FU;
import com.apiguard3.internal.NotReadyException$getMethod;
import com.apiguard3.internal.SConfig;
import com.apiguard3.internal.checkCertificates;
import com.apiguard3.internal.getMethod;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.apiguard3.internal.onInitializationFailure;
import com.apiguard3.internal.parseResponseHeaders;
import com.apiguard3.internal.setNextClusterForwardId;
import com.apiguard3.internal.setOnApplyWindowInsetsListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class APIGuard {
    private static char AGResponse = 6745;
    private static int AGResponse$Builder = 1;
    private static int AGState = 0;
    public static final int INIT_PROCEED = 2;
    private static char build = 46680;
    private static char getStatusCode = 50212;
    private static APIGuard getUrl;
    private static char[] head = {'a', 'g', 'k', 'b', 'l', 'o', 'c', '.', 'j', 's', 'n', 'C', '\'', 't', ' ', 'r', 'i', 'z', 'd', 'u', 'e', 'h', ':', 'S', 'A', 'F', 'E', 'N', 'I', 'G', 'Q', 'y', 'H', 'f', 'M', 'x', 'P', 'm', 'p', 'q', 'v', 'w', '{', '|', '}', '~', 127, 128, 129};
    private static char headers = 7;
    private static char headersMultiMap = 13668;
    private String AGRequest$Builder = getHeaders("\u0001\u0002\u0003\u0004\u0005\u0006\u0000\u0003\b\t\f\u0002Ô", View.resolveSize(0, 0) + 13, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 103)).intern();
    private Object AGRequest$efd69f8;
    private volatile Object addHeader$59961fb8;
    private getMethod delete;
    private ExecutorService get = com_apiguard3_APIGuard_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor();
    private Object getBody$1cf25108;
    private volatile AGState getHeaders = AGState.APIGuardStateNotReady;
    private final Object getMethod = new Object();
    private String method;
    private volatile Object newBuilder$7637ec1a;
    private Object post$1cbd8146;
    private InitializationCallback put;
    private volatile Object url$6071f473;

    interface AGRequest {
        static {
            Covode.recordClassIndex(2489);
        }
    }

    public interface Callback {
        static {
            Covode.recordClassIndex(2490);
        }

        void checkCertificates(List<Certificate> list, String str);

        void log(String str);
    }

    public interface InitializationCallback extends Callback {
        static {
            Covode.recordClassIndex(2491);
        }

        void onInitializationFailure(String str);

        void onInitializationSuccess();
    }

    static {
        Covode.recordClassIndex(2482);
    }

    private static Object com_apiguard3_APIGuard_java_lang_reflect_Method_invoke(Method method2, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method2, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_apiguard3_APIGuard_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method2.invoke(obj, objArr);
        a.a(invoke, method2, new Object[]{obj, objArr}, "com_apiguard3_APIGuard_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public synchronized void initialize(Application application, Callback callback, String str, int i2) {
        Throwable cause;
        MethodCollector.i(7365);
        if (!getMethod()) {
            checkCertificates.AGRequest(log.getBody.AGRequest, new StringBuilder().append(getHeaders("\u0007\u0004\u000b\r\u0007\u0014\n\u0007\u0001\u000e\u0007\u0014\u0011\t\u0014\t\u000e\u0002\u0002\u0012\u000e\u0003\t\u0014\u0003\f\u000f\u0013\u0014\u000e\u0014\u0007\u0000\u0013\u0007\u001b\u000e\u000f\u0005\u0014\u0011\r\u0007\u0014\n\u0007\u0006\u0007\u000f\u001b@", Process.getGidForName("") + 54, (byte) (32 - (Process.myTid() >> 22))).intern()).append(this.getHeaders).toString());
            MethodCollector.o(7365);
            return;
        }
        SConfig.getUrl.getMethod();
        AGState aGState = AGState.APIGuardStateInProgress;
        synchronized (this.getMethod) {
            try {
                this.getHeaders = aGState;
                APIGuard$InitializationCallback.getBody().AGRequest(this.getHeaders);
            } catch (Throwable th) {
                MethodCollector.o(7365);
                throw th;
            }
        }
        if (application != null) {
            try {
                try {
                    ((Class) getMethod.AGRequest((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 49, 5816 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)))).getMethod("AGRequest", Context.class).invoke(((Class) getMethod.AGRequest((char) TextUtils.getCapsMode("", 0, 0), (Process.myPid() >> 22) + 49, 5815 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("getHeaders", null).invoke(null, null), application);
                    try {
                        getHeaders(callback);
                        APIGuard$InitializationCallback.getBody().getUrl(callback);
                        getHeaders(application, callback, com_apiguard3_APIGuard_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(application).getResources().getAssets().open(str));
                        MethodCollector.o(7365);
                    } catch (Throwable th2) {
                        getHeaders(th2);
                        MethodCollector.o(7365);
                    }
                } catch (Throwable th3) {
                    if (cause != null) {
                        throw cause;
                    }
                    MethodCollector.o(7365);
                    throw th3;
                }
            } finally {
                cause = th3.getCause();
                if (cause != null) {
                    MethodCollector.o(7365);
                    throw cause;
                } else {
                    MethodCollector.o(7365);
                }
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(getState.getBody.getBody.AGRequest());
            MethodCollector.o(7365);
            throw illegalArgumentException;
        }
    }

    public synchronized void initialize(Application application, Callback callback, String str, int i2, String str2) {
        Throwable cause;
        MethodCollector.i(7535);
        if (!getMethod()) {
            checkCertificates.AGRequest(log.getBody.AGRequest, new StringBuilder().append(getHeaders("\u0007\u0004\u000b\r\u0007\u0014\n\u0007\u0001\u000e\u0007\u0014\u0011\t\u0014\t\u000e\u0002\u0002\u0012\u000e\u0003\t\u0014\u0003\f\u000f\u0013\u0014\u000e\u0014\u0007\u0000\u0013\u0007\u001b\u000e\u000f\u0005\u0014\u0011\r\u0007\u0014\n\u0007\u0006\u0007\u000f\u001b@", 52 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (TextUtils.lastIndexOf("", '0') + 33)).intern()).append(this.getHeaders).toString());
            MethodCollector.o(7535);
            return;
        }
        SConfig.getUrl.getMethod();
        AGState aGState = AGState.APIGuardStateInProgress;
        synchronized (this.getMethod) {
            try {
                this.getHeaders = aGState;
                APIGuard$InitializationCallback.getBody().AGRequest(this.getHeaders);
            } finally {
                MethodCollector.o(7535);
            }
        }
        if (application != null) {
            try {
                try {
                    ((Class) getMethod.AGRequest((char) View.MeasureSpec.getSize(0), 49 - TextUtils.getTrimmedLength(""), 5816 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)))).getMethod("AGRequest", Context.class).invoke(((Class) getMethod.AGRequest((char) (Process.myPid() >> 22), KeyEvent.getDeadChar(0, 0) + 49, 5815 - TextUtils.getOffsetAfter("", 0))).getMethod("getHeaders", null).invoke(null, null), application);
                    try {
                        if (!TextUtils.isEmpty(str2)) {
                            this.method = str2;
                            getHeaders(callback);
                            APIGuard$InitializationCallback.getBody().getUrl(callback);
                            getHeaders(application, callback, com_apiguard3_APIGuard_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(application).getResources().getAssets().open(str));
                            return;
                        }
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AGRequest("Ạ虮左칓ۺ㾁둜ࢮ0칓ۺᅀൟ퐫啊潫괏㴄虮左껓?됍ῃﵫ㖼託").intern());
                        MethodCollector.o(7535);
                        throw illegalArgumentException;
                    } catch (Throwable th) {
                        getHeaders(th);
                        MethodCollector.o(7535);
                    }
                } catch (Throwable th2) {
                    if (cause != null) {
                        throw cause;
                    }
                    MethodCollector.o(7535);
                    throw th2;
                }
            } finally {
                cause = th2.getCause();
                if (cause != null) {
                    MethodCollector.o(7535);
                    throw cause;
                } else {
                    MethodCollector.o(7535);
                }
            }
        } else {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(getState.getBody.getBody.AGRequest());
            MethodCollector.o(7535);
            throw illegalArgumentException2;
        }
    }

    public synchronized void initialize(Application application, Callback callback, int i2, String str) {
        Throwable cause;
        MethodCollector.i(7691);
        if (!getMethod()) {
            checkCertificates.AGRequest(log.getBody.AGRequest, new StringBuilder().append(getHeaders("\u0007\u0004\u000b\r\u0007\u0014\n\u0007\u0001\u000e\u0007\u0014\u0011\t\u0014\t\u000e\u0002\u0002\u0012\u000e\u0003\t\u0014\u0003\f\u000f\u0013\u0014\u000e\u0014\u0007\u0000\u0013\u0007\u001b\u000e\u000f\u0005\u0014\u0011\r\u0007\u0014\n\u0007\u0006\u0007\u000f\u001b@", 53 - TextUtils.indexOf("", "", 0), (byte) (32 - (KeyEvent.getMaxKeyCode() >> 16))).intern()).append(this.getHeaders).toString());
            MethodCollector.o(7691);
            return;
        }
        SConfig.getUrl.getMethod();
        AGState aGState = AGState.APIGuardStateInProgress;
        synchronized (this.getMethod) {
            try {
                this.getHeaders = aGState;
                APIGuard$InitializationCallback.getBody().AGRequest(this.getHeaders);
            } catch (Throwable th) {
                MethodCollector.o(7691);
                throw th;
            }
        }
        if (application != null) {
            try {
                try {
                    ((Class) getMethod.AGRequest((char) (AndroidCharacter.getEastAsianWidth('0') - 4), (ViewConfiguration.getPressedStateDuration() >> 16) + 49, 5814 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("AGRequest", Context.class).invoke(((Class) getMethod.AGRequest((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 49, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5815)).getMethod("getHeaders", null).invoke(null, null), application);
                    try {
                        this.method = str;
                        getHeaders(callback);
                        APIGuard$InitializationCallback.getBody().getUrl(callback);
                        checkCertificates.getHeaders(onInitializationFailure.getBody.getBody, AGRequest("ꙡ?폨剫썰Ḱ잌㋊餠䂦䢵鱺烏׹㮅નꩽ?恫ࠡ嵹뉳쏝?⺤뱫㬻?恫ࠡꃪ㐦붇覮ⴉ쪽폨剫䕈ඐ铼砄?屗칓ۺꩽ?恫祯鐓").intern(), AGRequest("赊릍⿅뚣?⏭").intern());
                        getHeaders(application, callback, com_apiguard3_APIGuard_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(application).getResources().openRawResource(i2));
                        MethodCollector.o(7691);
                    } catch (Throwable th2) {
                        getHeaders(th2);
                        MethodCollector.o(7691);
                    }
                } catch (Throwable th3) {
                    if (cause != null) {
                        throw cause;
                    }
                    MethodCollector.o(7691);
                    throw th3;
                }
            } finally {
                cause = th3.getCause();
                if (cause != null) {
                    MethodCollector.o(7691);
                    throw cause;
                } else {
                    MethodCollector.o(7691);
                }
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(getState.getBody.getBody.AGRequest());
            MethodCollector.o(7691);
            throw illegalArgumentException;
        }
    }

    public static ExecutorService com_apiguard3_APIGuard_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        return g.a(a2.a());
    }

    private APIGuard() {
    }

    static /* synthetic */ AGRequest getHeaders() {
        int i2 = AGResponse$Builder + 123;
        int i3 = i2 % 128;
        AGState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        AGResponse$Builder = i5 % 128;
        if (i5 % 2 != 0 && 0 == 0) {
            return null;
        }
        throw new NullPointerException("hashCode");
    }

    public AGState getState() {
        char c2;
        int i2 = AGResponse$Builder + 45;
        AGState = i2 % 128;
        if (i2 % 2 == 0) {
            c2 = '\t';
        } else {
            c2 = 'a';
        }
        if (c2 != 'a') {
            return this.getHeaders;
        }
        AGState aGState = this.getHeaders;
        throw new NullPointerException("hashCode");
    }

    private boolean getMethod() {
        char c2;
        int i2 = AGState + 43;
        AGResponse$Builder = i2 % 128;
        int i3 = i2 % 2;
        if (this.getHeaders == AGState.APIGuardStateNotReady) {
            c2 = 16;
        } else {
            c2 = 'W';
        }
        if (c2 == 'W' && this.getHeaders != AGState.APIGuardStateFailed) {
            return false;
        }
        int i4 = AGResponse$Builder + 29;
        AGState = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw new NullPointerException("hashCode");
    }

    /* access modifiers changed from: protected */
    public boolean updateKernel() {
        if (this.newBuilder$7637ec1a == null) {
            int i2 = AGResponse$Builder + 89;
            AGState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = AGResponse$Builder + 87;
        AGState = i4 % 128;
        int i5 = i4 % 2;
        try {
            return ((Boolean) ((Class) getMethod.AGRequest((char) (ImageFormat.getBitsPerPixel(0) + 16293), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36, 2521 - View.resolveSize(0, 0))).getMethod("getUrl", null).invoke(this.newBuilder$7637ec1a, null)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: com.apiguard3.APIGuard$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        private static int getBody;
        private static int getMethod;
        static final /* synthetic */ int[] getUrl;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|(1:26)(4:14|15|16|17)) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x00ad */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        static {
            /*
            // Method dump skipped, instructions count: 256
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.APIGuard.AnonymousClass2.<clinit>():void");
        }
    }

    public static synchronized APIGuard getSharedInstance() {
        APIGuard aPIGuard;
        Throwable cause;
        synchronized (APIGuard.class) {
            MethodCollector.i(7268);
            int i2 = AGState + 29;
            AGResponse$Builder = i2 % 128;
            int i3 = i2 % 2;
            if (getUrl == null) {
                try {
                    APIGuard aPIGuard2 = new APIGuard();
                    getUrl = aPIGuard2;
                    try {
                        parseResponseHeaders.AGRequest();
                        try {
                            aPIGuard2.AGRequest$efd69f8 = ((Class) getMethod.AGRequest((char) (TextUtils.getTrimmedLength("") + 33528), 35 - TextUtils.lastIndexOf("", '0', 0), 2948 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)))).getDeclaredConstructor(null).newInstance(null);
                            try {
                                aPIGuard2.getBody$1cf25108 = ((Class) getMethod.AGRequest((char) (8782 - (ViewConfiguration.getPressedStateDuration() >> 16)), 29 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 844)).getMethod("getUrl", null).invoke(null, null);
                                int i4 = AGResponse$Builder + 39;
                                AGState = i4 % 128;
                                int i5 = i4 % 2;
                            } catch (Throwable th) {
                                if (cause != null) {
                                    throw cause;
                                }
                                MethodCollector.o(7268);
                                throw th;
                            }
                        } finally {
                            cause = th.getCause();
                            if (cause != null) {
                                MethodCollector.o(7268);
                                throw cause;
                            }
                            MethodCollector.o(7268);
                        }
                    } catch (Exception unused) {
                        parseResponseHeaders.getBody();
                        aPIGuard2.AGRequest$efd69f8 = null;
                        aPIGuard2.getBody$1cf25108 = null;
                    }
                } catch (Exception unused2) {
                    getUrl = null;
                }
            }
            aPIGuard = getUrl;
            MethodCollector.o(7268);
        }
        return aPIGuard;
    }

    public static Context com_apiguard3_APIGuard_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    static /* synthetic */ InitializationCallback AGRequest(APIGuard aPIGuard) {
        int i2 = AGState;
        int i3 = i2 + 41;
        AGResponse$Builder = i3 % 128;
        int i4 = i3 % 2;
        InitializationCallback initializationCallback = aPIGuard.put;
        int i5 = i2 + 21;
        AGResponse$Builder = i5 % 128;
        int i6 = i5 % 2;
        return initializationCallback;
    }

    static /* synthetic */ Object getBody$316da88c(APIGuard aPIGuard) {
        int i2 = AGResponse$Builder + 5;
        AGState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = aPIGuard.newBuilder$7637ec1a;
        int i4 = AGState + 39;
        AGResponse$Builder = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    static /* synthetic */ Object getHeaders$1b83c9c6(APIGuard aPIGuard) {
        int i2 = AGResponse$Builder + 75;
        AGState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = aPIGuard.addHeader$59961fb8;
        int i4 = AGResponse$Builder + 1;
        AGState = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    static /* synthetic */ Object getUrl$17cc3eff(APIGuard aPIGuard) {
        int i2 = AGResponse$Builder + 73;
        AGState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = aPIGuard.url$6071f473;
        int i4 = AGState + 123;
        AGResponse$Builder = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    static /* synthetic */ void getMethod(APIGuard aPIGuard) {
        int i2 = AGState + 119;
        AGResponse$Builder = i2 % 128;
        int i3 = i2 % 2;
        if (aPIGuard.put != null) {
            try {
                aPIGuard.get.submit(new Callable<Void>() {
                    /* class com.apiguard3.APIGuard.AnonymousClass4 */
                    private static int AGRequest = 40;
                    private static short[] addHeader;
                    private static byte[] getBody = {0, 14, 2, 0, -18, 34, -27, -1, 6, -11, 19, -25, 17, -3, 11, -8, -11, 11, -5, 37, -37, -1, 79, -71, -7, 5, -3, 0, 11, 30, 0};
                    private static int getHeaders = -727232802;
                    private static int getMethod = 1516165778;
                    private static int newBuilder = 1;
                    private static int url;

                    static {
                        Covode.recordClassIndex(2486);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Void call() {
                        int i2 = newBuilder + 85;
                        url = i2 % 128;
                        int i3 = i2 % 2;
                        checkCertificates.AGRequest(log.getBody.AGRequest, getHeaders((short) TextUtils.indexOf("", ""), (byte) TextUtils.indexOf("", ""), (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 1516165712, TextUtils.getTrimmedLength("") + 727232802, -9 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
                        APIGuard.AGRequest(APIGuard.this).onInitializationSuccess();
                        int i4 = url + 19;
                        newBuilder = i4 % 128;
                        int i5 = i4 % 2;
                        return null;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    private static java.lang.String getHeaders(short r7, byte r8, int r9, int r10, int r11) {
                        /*
                        // Method dump skipped, instructions count: 159
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.APIGuard.AnonymousClass4.getHeaders(short, byte, int, int, int):java.lang.String");
                    }
                });
                int i4 = AGState + 113;
                AGResponse$Builder = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                checkCertificates.AGRequest(log.getBody.getMethod, getState.getBody.AGState, th.toString());
            }
        }
    }

    private static String AGRequest(String str) {
        boolean z;
        char c2;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        char[] cArr = str;
        if (!z) {
            int i2 = AGState + 63;
            AGResponse$Builder = i2 % 128;
            if (i2 % 2 != 0) {
                cArr = str.toCharArray();
            } else {
                str.toCharArray();
                throw new NullPointerException("hashCode");
            }
        }
        char[] cArr2 = cArr;
        char[] cArr3 = new char[cArr2.length];
        char[] cArr4 = new char[2];
        int i3 = 0;
        while (true) {
            if (i3 >= cArr2.length) {
                c2 = 1;
            } else {
                c2 = '_';
            }
            if (c2 == 1) {
                return new String(cArr3, 1, (int) cArr3[0]);
            }
            cArr4[0] = cArr2[i3];
            int i4 = i3 + 1;
            cArr4[1] = cArr2[i4];
            setOnApplyWindowInsetsListener.AGRequest(cArr4, AGResponse, headersMultiMap, build, getStatusCode);
            cArr3[i3] = cArr4[0];
            cArr3[i4] = cArr4[1];
            i3 += 2;
            int i5 = AGState + 53;
            AGResponse$Builder = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public synchronized void parseResponse(AGResponse aGResponse) {
        MethodCollector.i(7705);
        if (aGResponse != null) {
            if (this.getHeaders == AGState.APIGuardStateReady) {
                if (this.url$6071f473 != null) {
                    int i2 = AGResponse$Builder + 39;
                    AGState = i2 % 128;
                    if (i2 % 2 == 0) {
                        getUrl(aGResponse.getHeaders());
                        MethodCollector.o(7705);
                        return;
                    }
                    getUrl(aGResponse.getHeaders());
                    MethodCollector.o(7705);
                    return;
                }
            }
            checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.AGResponse$Builder);
            MethodCollector.o(7705);
            return;
        }
        int i3 = AGResponse$Builder + 13;
        AGState = i3 % 128;
        if (i3 % 2 == 0) {
            checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.values);
            MethodCollector.o(7705);
            return;
        }
        checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.values);
        try {
            throw new NullPointerException("hashCode");
        } catch (Throwable th) {
            MethodCollector.o(7705);
            throw th;
        }
    }

    public synchronized void parseResponseHeaders(Map<String, String> map) {
        MethodCollector.i(7384);
        int i2 = AGResponse$Builder + 113;
        AGState = i2 % 128;
        int i3 = i2 % 2;
        if (map != null) {
            if (this.getHeaders == AGState.APIGuardStateReady) {
                if (this.url$6071f473 != null) {
                    int i4 = AGState + 25;
                    AGResponse$Builder = i4 % 128;
                    int i5 = i4 % 2;
                    getUrl(map);
                    MethodCollector.o(7384);
                    return;
                }
            }
            checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.AGResponse$Builder);
            MethodCollector.o(7384);
            return;
        }
        checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.values);
        int i6 = AGResponse$Builder + 57;
        AGState = i6 % 128;
        if (i6 % 2 == 0) {
            MethodCollector.o(7384);
        } else {
            MethodCollector.o(7384);
        }
    }

    public synchronized void transformRequest(AGRequest aGRequest) {
        boolean z;
        getMethod getmethod;
        MethodCollector.i(7702);
        int i2 = AGResponse$Builder + 25;
        int i3 = i2 % 128;
        AGState = i3;
        int i4 = i2 % 2;
        if (aGRequest != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!(this.getHeaders == AGState.APIGuardStateReady || this.getHeaders == AGState.APIGuardStateInProgress) || (getmethod = this.delete) == null) {
                checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.statusCode);
                int i5 = AGResponse$Builder + 9;
                AGState = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            } else {
                z = getmethod.getMethod(aGRequest.getHeaders(), aGRequest.getUrl(), aGRequest.getBody());
            }
            if (aGRequest.getHeaders().isEmpty()) {
                checkCertificates.getMethod(log.getBody.getBody, getState.getUrl.getHeaders);
            } else {
                checkCertificates.getMethod(log.getBody.getBody, getState.getUrl.AGRequest);
            }
            if (z) {
                SConfig.getUrl.getMethod(System.currentTimeMillis() - currentTimeMillis);
                MethodCollector.o(7702);
                return;
            }
            SConfig.getUrl.getUrl(System.currentTimeMillis() - currentTimeMillis);
            MethodCollector.o(7702);
            return;
        }
        int i7 = i3 + 117;
        AGResponse$Builder = i7 % 128;
        int i8 = i7 % 2;
        checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.valueOf);
        MethodCollector.o(7702);
    }

    private void getHeaders(Callback callback) {
        int i2 = AGState;
        int i3 = i2 + 29;
        AGResponse$Builder = i3 % 128;
        if (i3 % 2 == 0 ? callback == null : callback == null) {
            throw new IllegalArgumentException(getState.getBody.getMethod.AGRequest());
        }
        if (callback instanceof InitializationCallback) {
            int i4 = i2 + 41;
            AGResponse$Builder = i4 % 128;
            int i5 = i4 % 2;
            this.put = (InitializationCallback) callback;
        }
        int i6 = AGResponse$Builder + 93;
        AGState = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fa, code lost:
        if (android.text.TextUtils.isEmpty(r6) == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010f, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        com.apiguard3.internal.checkCertificates.getMethod(com.apiguard3.internal.log.getBody.getBody, com.apiguard3.internal.getState.getUrl.getMethod);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0152, code lost:
        if (((com.apiguard3.domain.Config) ((java.lang.Class) com.apiguard3.internal.getMethod.AGRequest((char) android.graphics.Color.argb(0, 0, 0, 0), 40 - android.widget.ExpandableListView.getPackedPositionGroup(0), 2203 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)))).getMethod("getBody", null).invoke(r16.url$6071f473, null)).addHeader(r6) == false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x018c, code lost:
        if (((com.apiguard3.domain.Config) ((java.lang.Class) com.apiguard3.internal.getMethod.AGRequest((char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.os.Process.myPid() >> 22) + 40, (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 2201)).getMethod("getBody", null).invoke(r16.url$6071f473, null)).addHeader(r6) == false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getUrl(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
        // Method dump skipped, instructions count: 451
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.APIGuard.getUrl(java.util.Map):void");
    }

    private void getHeaders(Throwable th) {
        MethodCollector.i(7693);
        AGState aGState = AGState.APIGuardStateFailed;
        synchronized (this.getMethod) {
            try {
                this.getHeaders = aGState;
                APIGuard$InitializationCallback.getBody().AGRequest(this.getHeaders);
            } catch (Throwable th2) {
                MethodCollector.o(7693);
                throw th2;
            }
        }
        final String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = th.toString();
        }
        checkCertificates.AGRequest(log.getBody.getMethod, message);
        if (this.put != null) {
            try {
                this.get.submit(new Callable<Void>() {
                    /* class com.apiguard3.APIGuard.AnonymousClass1 */
                    private static int AGRequest = 1;
                    private static int getBody;

                    static {
                        Covode.recordClassIndex(2483);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Void call() {
                        int i2 = AGRequest + 123;
                        getBody = i2 % 128;
                        if (i2 % 2 != 0 || 0 == 1) {
                            APIGuard.AGRequest(APIGuard.this).onInitializationFailure(message);
                            throw new NullPointerException("hashCode");
                        }
                        APIGuard.AGRequest(APIGuard.this).onInitializationFailure(message);
                        int i3 = AGRequest + 37;
                        getBody = i3 % 128;
                        if (i3 % 2 == 0) {
                            return null;
                        }
                        throw new NullPointerException("hashCode");
                    }
                });
            } catch (Throwable th3) {
                checkCertificates.AGRequest(log.getBody.getMethod, getState.getBody.AGState, th3.toString());
            }
        }
        if (!(th instanceof IllegalArgumentException)) {
            MethodCollector.o(7693);
        } else {
            MethodCollector.o(7693);
            throw th;
        }
    }

    static /* synthetic */ void getUrl(APIGuard aPIGuard, AGState aGState) {
        MethodCollector.i(2704);
        synchronized (aPIGuard.getMethod) {
            try {
                aPIGuard.getHeaders = aGState;
                APIGuard$InitializationCallback.getBody().AGRequest(aPIGuard.getHeaders);
            } finally {
                MethodCollector.o(2704);
            }
        }
    }

    static /* synthetic */ void AGRequest(APIGuard aPIGuard, final String str) {
        if (aPIGuard.put != null) {
            try {
                aPIGuard.get.submit(new Callable<Void>() {
                    /* class com.apiguard3.APIGuard.AnonymousClass1 */
                    private static int AGRequest = 1;
                    private static int getBody;

                    static {
                        Covode.recordClassIndex(2483);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Void call() {
                        int i2 = AGRequest + 123;
                        getBody = i2 % 128;
                        if (i2 % 2 != 0 || 0 == 1) {
                            APIGuard.AGRequest(APIGuard.this).onInitializationFailure(message);
                            throw new NullPointerException("hashCode");
                        }
                        APIGuard.AGRequest(APIGuard.this).onInitializationFailure(message);
                        int i3 = AGRequest + 37;
                        getBody = i3 % 128;
                        if (i3 % 2 == 0) {
                            return null;
                        }
                        throw new NullPointerException("hashCode");
                    }
                });
                int i2 = AGResponse$Builder + 85;
                AGState = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new NullPointerException("hashCode");
                }
                return;
            } catch (Throwable th) {
                checkCertificates.AGRequest(log.getBody.getMethod, getState.getBody.AGState, th.toString());
            }
        }
        int i3 = AGResponse$Builder + 69;
        AGState = i3 % 128;
        int i4 = i3 % 2;
    }

    static /* synthetic */ Object getMethod$66c52472(APIGuard aPIGuard, Object obj) {
        char c2;
        int i2 = AGResponse$Builder + 75;
        AGState = i2 % 128;
        if (i2 % 2 == 0) {
            c2 = 11;
        } else {
            c2 = 3;
        }
        aPIGuard.newBuilder$7637ec1a = obj;
        if (c2 != 11) {
            throw new NullPointerException("hashCode");
        }
        int i3 = AGResponse$Builder + 101;
        AGState = i3 % 128;
        int i4 = i3 % 2;
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.Map<java.lang.String, java.lang.String> getRequestHeaders(java.lang.String r10, byte[] r11) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.APIGuard.getRequestHeaders(java.lang.String, byte[]):java.util.Map");
    }

    public synchronized void initialize(Application application, int i2) {
        Throwable cause;
        MethodCollector.i(7275);
        if (!getMethod()) {
            checkCertificates.AGRequest(log.getBody.AGRequest, new StringBuilder().append(getHeaders("\u0007\u0004\u000b\r\u0007\u0014\n\u0007\u0001\u000e\u0007\u0014\u0011\t\u0014\t\u000e\u0002\u0002\u0012\u000e\u0003\t\u0014\u0003\f\u000f\u0013\u0014\u000e\u0014\u0007\u0000\u0013\u0007\u001b\u000e\u000f\u0005\u0014\u0011\r\u0007\u0014\n\u0007\u0006\u0007\u000f\u001b@", TextUtils.lastIndexOf("", '0', 0) + 54, (byte) (32 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern()).append(this.getHeaders).toString());
            MethodCollector.o(7275);
            return;
        }
        SConfig.getUrl.getMethod();
        AGState aGState = AGState.APIGuardStateInProgress;
        synchronized (this.getMethod) {
            try {
                this.getHeaders = aGState;
                APIGuard$InitializationCallback.getBody().AGRequest(this.getHeaders);
            } finally {
                MethodCollector.o(7275);
            }
        }
        if (application != null) {
            try {
                try {
                    ((Class) getMethod.AGRequest((char) (ViewConfiguration.getWindowTouchSlop() >> 8), AndroidCharacter.getMirror('0') + 1, (ViewConfiguration.getScrollBarSize() >> 8) + 5815)).getMethod("AGRequest", Context.class).invoke(((Class) getMethod.AGRequest((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 48 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 5816 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)))).getMethod("getHeaders", null).invoke(null, null), application);
                    try {
                        if (application instanceof Callback) {
                            Callback callback = (Callback) application;
                            getHeaders(callback);
                            APIGuard$InitializationCallback.getBody().getUrl(callback);
                            getHeaders(application, callback, com_apiguard3_APIGuard_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(application).getResources().getAssets().open(this.AGRequest$Builder));
                            return;
                        }
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(getState.getBody.getMethod.AGRequest());
                        MethodCollector.o(7275);
                        throw illegalArgumentException;
                    } catch (Throwable th) {
                        getHeaders(th);
                        MethodCollector.o(7275);
                    }
                } catch (Throwable th2) {
                    if (cause != null) {
                        throw cause;
                    }
                    MethodCollector.o(7275);
                    throw th2;
                }
            } finally {
                cause = th2.getCause();
                if (cause != null) {
                    MethodCollector.o(7275);
                    throw cause;
                } else {
                    MethodCollector.o(7275);
                }
            }
        } else {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(getState.getBody.getBody.AGRequest());
            MethodCollector.o(7275);
            throw illegalArgumentException2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0226, code lost:
        if (((java.lang.Boolean) ((java.lang.Class) com.apiguard3.internal.getMethod.AGRequest((char) android.view.KeyEvent.getDeadChar(0, 0), 40 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 5997)).getMethod("getUrl", (java.lang.Class) com.apiguard3.internal.getMethod.AGRequest((char) android.text.TextUtils.getCapsMode("", 0, 0), 31 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1106), byte[].class, java.lang.String.class).invoke(null, r4)).booleanValue() == false) goto L_0x0228;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void AGRequest$2ea0c6bc(com.apiguard3.domain.Config r18, java.lang.Object r19) {
        /*
        // Method dump skipped, instructions count: 739
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.APIGuard.AGRequest$2ea0c6bc(com.apiguard3.domain.Config, java.lang.Object):void");
    }

    private void getHeaders(final Application application, final Callback callback, final InputStream inputStream) {
        try {
            parseResponseHeaders.AGRequest(AGRequest("曀꺁ଡ櫆焱瓥紀䕈ඐ놿댶").intern(), new Runnable() {
                /* class com.apiguard3.APIGuard.AnonymousClass3 */
                private static int AGRequest;
                private static int url = 1;

                static {
                    Covode.recordClassIndex(2485);
                }

                public final void run() {
                    int i2 = url + 53;
                    AGRequest = i2 % 128;
                    int i3 = i2 % 2;
                    try {
                        APIGuard.AGRequest(APIGuard.this, application, inputStream, callback);
                        int i4 = AGRequest + 57;
                        url = i4 % 128;
                        int i5 = i4 % 2;
                    } catch (Throwable th) {
                        checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.APIGuard);
                        checkCertificates.AGRequest(log.getBody.getHeaders, Arrays.toString(th.getStackTrace()));
                    }
                }
            });
            int i2 = AGResponse$Builder + 67;
            AGState = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            checkCertificates.AGRequest(log.getBody.getHeaders, getState.getBody.APIGuard, th.toString());
            throw new IllegalThreadStateException(getState.getBody.APIGuard.AGRequest());
        }
    }

    private static String getHeaders(String str, int i2, byte b2) {
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = head;
        char c2 = headers;
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i3 = AGState + 93;
            AGResponse$Builder = i3 % 128;
            int i4 = i3 % 2;
            i2--;
            cArr4[i2] = (char) (cArr2[i2] - b2);
        }
        if (i2 > 1) {
            for (int i5 = 0; i5 < i2; i5 += 2) {
                int i6 = AGState + 117;
                AGResponse$Builder = i6 % 128;
                int i7 = i6 % 2;
                char c3 = cArr2[i5];
                int i8 = i5 + 1;
                char c4 = cArr2[i8];
                if (c3 != c4) {
                    int AGRequest2 = setNextClusterForwardId.AGRequest(c3, c2);
                    int body = setNextClusterForwardId.getBody(c3, c2);
                    int AGRequest3 = setNextClusterForwardId.AGRequest(c4, c2);
                    int body2 = setNextClusterForwardId.getBody(c4, c2);
                    if (body == body2) {
                        int headers2 = setNextClusterForwardId.getHeaders(AGRequest2, c2);
                        int headers3 = setNextClusterForwardId.getHeaders(AGRequest3, c2);
                        int body3 = setNextClusterForwardId.getBody(headers2, body, c2);
                        int body4 = setNextClusterForwardId.getBody(headers3, body2, c2);
                        cArr4[i5] = cArr3[body3];
                        cArr4[i8] = cArr3[body4];
                    } else if (AGRequest2 == AGRequest3) {
                        int headers4 = setNextClusterForwardId.getHeaders(body, c2);
                        int headers5 = setNextClusterForwardId.getHeaders(body2, c2);
                        int body5 = setNextClusterForwardId.getBody(AGRequest2, headers4, c2);
                        int body6 = setNextClusterForwardId.getBody(AGRequest3, headers5, c2);
                        cArr4[i5] = cArr3[body5];
                        cArr4[i8] = cArr3[body6];
                    } else {
                        int body7 = setNextClusterForwardId.getBody(AGRequest2, body2, c2);
                        int body8 = setNextClusterForwardId.getBody(AGRequest3, body, c2);
                        cArr4[i5] = cArr3[body7];
                        cArr4[i8] = cArr3[body8];
                    }
                } else {
                    cArr4[i5] = (char) (c3 - b2);
                    cArr4[i8] = (char) (c4 - b2);
                }
            }
        }
        return new String(cArr4);
    }

    public synchronized void analyzeResponse(String str, Map<String, List<String>> map, byte[] bArr, int i2) {
        Throwable cause;
        MethodCollector.i(7463);
        int i3 = AGState + 17;
        AGResponse$Builder = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.AGRequest$efd69f8;
        try {
            Object[] objArr = new Object[4];
            objArr[3] = Integer.valueOf(i2);
            objArr[2] = bArr;
            objArr[1] = map;
            objArr[0] = str;
            ((Class) getMethod.AGRequest((char) (ViewConfiguration.getScrollBarSize() >> 8), 34 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 2914)).getMethod("getBody", String.class, Map.class, byte[].class, Integer.TYPE).invoke(obj, objArr);
            try {
                parseResponseHeaders((Map) ((Class) getMethod.AGRequest((char) (Process.getGidForName("") + 1), 'e' - AndroidCharacter.getMirror('0'), 5943 - ExpandableListView.getPackedPositionChild(0))).getMethod("AGRequest", Map.class).invoke(null, map));
                int i5 = AGResponse$Builder + 97;
                AGState = i5 % 128;
                if (i5 % 2 == 0) {
                    MethodCollector.o(7463);
                } else {
                    try {
                        throw new NullPointerException("hashCode");
                    } catch (Throwable th) {
                        MethodCollector.o(7463);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                if (cause != null) {
                    throw cause;
                }
                MethodCollector.o(7463);
                throw th2;
            }
        } finally {
            cause = th2.getCause();
            if (cause != null) {
                MethodCollector.o(7463);
                throw cause;
            } else {
                MethodCollector.o(7463);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.Map<java.lang.String, java.lang.String> generateHeaders(java.lang.String r14, java.lang.String r15, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r16, byte[] r17) {
        /*
        // Method dump skipped, instructions count: 372
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.APIGuard.generateHeaders(java.lang.String, java.lang.String, java.util.Map, byte[]):java.util.Map");
    }

    static /* synthetic */ void AGRequest(APIGuard aPIGuard, final Application application, InputStream inputStream, final Callback callback) {
        char c2;
        Throwable cause;
        if (inputStream != null) {
            c2 = '6';
        } else {
            c2 = 'T';
        }
        if (c2 != '6') {
            int i2 = AGResponse$Builder + 75;
            AGState = i2 % 128;
            int i3 = i2 % 2;
            checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.AGRequest.AGRequest());
        }
        try {
            final Context context = (Context) ((Class) getMethod.AGRequest((char) TextUtils.indexOf("", ""), 49 - TextUtils.indexOf("", "", 0), 5815 - View.getDefaultSize(0, 0))).getMethod("getBody", null).invoke(null, null);
            if (context != null) {
                try {
                    ((Class) getMethod.AGRequest((char) (8783 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 29 - View.resolveSize(0, 0), 845 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).getMethod("getHeaders", null).invoke(aPIGuard.getBody$1cf25108, null);
                    Object obj = aPIGuard.getBody$1cf25108;
                    try {
                        com_apiguard3_APIGuard_java_lang_reflect_Method_invoke(((Class) getMethod.AGRequest((char) (TextUtils.indexOf("", "") + 8782), (Process.myTid() >> 22) + 29, TextUtils.indexOf((CharSequence) "", '0') + 845)).getMethod("getMethod", (Class) getMethod.AGRequest((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 39, 997 - (ViewConfiguration.getDoubleTapTimeout() >> 16))), obj, new Object[]{aPIGuard.AGRequest$efd69f8});
                        try {
                            Object[] objArr = new Object[2];
                            objArr[1] = aPIGuard.method;
                            objArr[0] = context;
                            aPIGuard.url$6071f473 = ((Class) getMethod.AGRequest((char) KeyEvent.getDeadChar(0, 0), 40 - Color.argb(0, 0, 0, 0), ImageFormat.getBitsPerPixel(0) + 2203)).getDeclaredConstructor(Context.class, String.class).newInstance(objArr);
                            Object obj2 = aPIGuard.url$6071f473;
                            try {
                                Object[] objArr2 = new Object[2];
                                objArr2[1] = context;
                                objArr2[0] = obj2;
                                aPIGuard.addHeader$59961fb8 = ((Class) getMethod.AGRequest((char) (ViewConfiguration.getPressedStateDuration() >> 16), ExpandableListView.getPackedPositionGroup(0) + 37, 2484 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getDeclaredConstructor((Class) getMethod.AGRequest((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 40, 2202 - ExpandableListView.getPackedPositionType(0)), Context.class).newInstance(objArr2);
                                Object obj3 = aPIGuard.addHeader$59961fb8;
                                try {
                                    Object[] objArr3 = new Object[2];
                                    objArr3[1] = aPIGuard.url$6071f473;
                                    objArr3[0] = obj3;
                                    aPIGuard.post$1cbd8146 = ((Class) getMethod.AGRequest((char) (-1 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 44 - (Process.myPid() >> 22), (Process.myTid() >> 22) + 4152)).getDeclaredConstructor((Class) getMethod.AGRequest((char) (1921 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (Process.myTid() >> 22) + 46, Color.rgb(0, 0, 0) + 16779584), (Class) getMethod.AGRequest((char) (-1 - TextUtils.lastIndexOf("", '0', 0, 0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, ImageFormat.getBitsPerPixel(0) + 2203)).newInstance(objArr3);
                                    aPIGuard.delete = new getMethod(aPIGuard.addHeader$59961fb8, aPIGuard.url$6071f473, aPIGuard.post$1cbd8146);
                                    try {
                                        Object invoke = ((Class) getMethod.AGRequest((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 15137), (ViewConfiguration.getWindowTouchSlop() >> 8) + 58, ImageFormat.getBitsPerPixel(0) + 5077)).getMethod("getUrl", null).invoke(null, null);
                                        try {
                                            ((Class) getMethod.AGRequest((char) (15137 - TextUtils.indexOf("", "")), 58 - ExpandableListView.getPackedPositionType(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 5077)).getMethod("getUrl", (Class) getMethod.AGRequest((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, (ViewConfiguration.getPressedStateDuration() >> 16) + 2202)).invoke(invoke, aPIGuard.url$6071f473);
                                            checkCertificates.getHeaders(onInitializationFailure.getBody.getBody, AGRequest("⤀㠒됍ῃ仢㍻退쾱뚣?⏭").intern(), getHeaders("\f\u0004\f\u001f\u000f\u0002\u0015#\t\u0011Á", 11 - KeyEvent.getDeadChar(0, 0), (byte) (-16777139 - Color.rgb(0, 0, 0))).intern());
                                            Object obj4 = aPIGuard.url$6071f473;
                                            try {
                                                Object[] objArr4 = new Object[2];
                                                objArr4[1] = new NotReadyException$getMethod() {
                                                    /* class com.apiguard3.APIGuard.AnonymousClass5 */
                                                    private static int AGRequest$Builder = 222;
                                                    private static boolean addHeader = true;
                                                    private static char[] getHeaders = {289, 333, 332, 324, 327, 325, 295, 338, 254, 305, 339, 321, 323, 337, 330, 287, 293, 267, 298, 301, 280, 319, 322, 343, 300, 340, 294, 336, 302, 342, 292};
                                                    private static int method;
                                                    private static boolean newBuilder = true;
                                                    private static int url = 1;

                                                    static {
                                                        Covode.recordClassIndex(2487);
                                                    }

                                                    @Override // com.apiguard3.internal.NotReadyException$getMethod
                                                    public final void AGRequest() {
                                                        Throwable cause;
                                                        Throwable cause2;
                                                        checkCertificates.getHeaders(onInitializationFailure.getBody.AGRequest, AGRequest(null, null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), "").intern(), AGRequest(null, null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "").intern());
                                                        callback.log(new StringBuilder().append(AGRequest(null, null, (ViewConfiguration.getFadingEdgeLength() >> 16) + 127, "").intern()).append(getState.getMethod.getMethod.AGRequest()).toString());
                                                        try {
                                                            Config config = (Config) ((Class) getMethod.AGRequest((char) TextUtils.getCapsMode("", 0, 0), 40 - (ViewConfiguration.getLongPressTimeout() >> 16), (Process.myPid() >> 22) + 2202)).getMethod("getBody", null).invoke(APIGuard.getUrl$17cc3eff(APIGuard.this), null);
                                                            checkCertificates.AGRequest(log.getBody.AGRequest, new StringBuilder().append(AGRequest(null, null, PhoneNumberUtils.toaFromString("") - 2, "").intern()).append(config.AGRequest$Builder()).toString());
                                                            checkCertificates.AGRequest(log.getBody.AGRequest, new StringBuilder().append(AGRequest(null, null, TextUtils.indexOf("", "", 0, 0) + 127, "").intern()).append(config.headers()).toString());
                                                            APIGuard.AGRequest$2ea0c6bc(config, APIGuard.getHeaders$1b83c9c6(APIGuard.this));
                                                            APIGuard.getUrl(APIGuard.this, AGState.APIGuardStateReady);
                                                            APIGuard.getMethod(APIGuard.this);
                                                            try {
                                                                try {
                                                                    ((Class) getMethod.AGRequest((char) (Process.getGidForName("") + 41089), 31 - TextUtils.getOffsetBefore("", 0), TextUtils.getOffsetAfter("", 0) + 1582)).getMethod("getBody", Config.class).invoke(((Class) getMethod.AGRequest((char) (41088 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, 1581 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).getMethod("AGRequest", null).invoke(null, null), config);
                                                                    Context context = context;
                                                                    Callback callback = callback;
                                                                    long longValue = config.head().longValue();
                                                                    try {
                                                                        Object[] objArr = new Object[4];
                                                                        objArr[3] = TimeUnit.MILLISECONDS;
                                                                        objArr[2] = Long.valueOf(longValue);
                                                                        objArr[1] = callback;
                                                                        objArr[0] = context;
                                                                        Object newInstance = ((Class) getMethod.AGRequest((char) (ViewConfiguration.getLongPressTimeout() >> 16), 31 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -16774361 - Color.rgb(0, 0, 0))).getDeclaredConstructor(Context.class, Callback.class, Long.TYPE, TimeUnit.class).newInstance(objArr);
                                                                        if (APIGuard.getBody$316da88c(APIGuard.this) == null) {
                                                                            APIGuard aPIGuard = APIGuard.this;
                                                                            Object url$17cc3eff = APIGuard.getUrl$17cc3eff(aPIGuard);
                                                                            Object headers$1b83c9c6 = APIGuard.getHeaders$1b83c9c6(APIGuard.this);
                                                                            Callback callback2 = callback;
                                                                            try {
                                                                                try {
                                                                                    Object[] objArr2 = new Object[5];
                                                                                    objArr2[4] = ((Class) getMethod.AGRequest((char) (ViewConfiguration.getTapTimeout() >> 16), 39 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 5997 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("getBody", null).invoke(null, null);
                                                                                    objArr2[3] = callback2;
                                                                                    objArr2[2] = newInstance;
                                                                                    objArr2[1] = headers$1b83c9c6;
                                                                                    objArr2[0] = url$17cc3eff;
                                                                                    APIGuard.getMethod$66c52472(aPIGuard, ((Class) getMethod.AGRequest((char) (ExpandableListView.getPackedPositionChild(0) + 16293), AndroidCharacter.getEastAsianWidth('0') + 32, 2521 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getDeclaredConstructor((Class) getMethod.AGRequest((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 40, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2202), (Class) getMethod.AGRequest((char) (1921 - Drawable.resolveOpacity(0, 0)), 46 - View.MeasureSpec.makeMeasureSpec(0, 0), 2368 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (Class) getMethod.AGRequest((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 30 - TextUtils.indexOf((CharSequence) "", '0'), View.resolveSize(0, 0) + 2855), Callback.class, LocalBroadcastManager.class).newInstance(objArr2));
                                                                                    int i2 = url + 71;
                                                                                    method = i2 % 128;
                                                                                    int i3 = i2 % 2;
                                                                                } catch (Throwable th) {
                                                                                    if (cause2 != null) {
                                                                                        throw cause2;
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } finally {
                                                                                cause2 = th.getCause();
                                                                                if (cause2 != null) {
                                                                                    throw cause2;
                                                                                }
                                                                            }
                                                                        }
                                                                        try {
                                                                            application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) ((Class) getMethod.AGRequest((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 17874), 40 - (ViewConfiguration.getTapTimeout() >> 16), Color.alpha(0) + 2084)).getDeclaredConstructor((Class) getMethod.AGRequest((char) (16292 - (Process.myPid() >> 22)), 35 - ImageFormat.getBitsPerPixel(0), TextUtils.indexOf("", "", 0) + 2521)).newInstance(APIGuard.getBody$316da88c(APIGuard.this)));
                                                                            Object url$17cc3eff2 = APIGuard.getUrl$17cc3eff(APIGuard.this);
                                                                            try {
                                                                                ((Class) getMethod.AGRequest((char) (ViewConfiguration.getTouchSlop() >> 8), 41 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), 2202 - ((Process.getThreadPriority(0) + 20) >> 6))).getMethod("getUrl", Callable.class).invoke(url$17cc3eff2, APIGuard.getHeaders$1b83c9c6(APIGuard.this));
                                                                                try {
                                                                                    FU.AGRequest((Future) ((Class) getMethod.AGRequest((char) ((Process.myTid() >> 22) + 1921), TextUtils.indexOf("", "") + 46, Color.red(0) + 2368)).getMethod("getBody", null).invoke(APIGuard.getHeaders$1b83c9c6(APIGuard.this), null), new FU.getHeaders<Object>() {
                                                                                        /* class com.apiguard3.APIGuard.AnonymousClass5.AnonymousClass2 */
                                                                                        private static int AGRequest;
                                                                                        private static int getBody = 1;

                                                                                        static {
                                                                                            Covode.recordClassIndex(2488);
                                                                                        }

                                                                                        @Override // com.apiguard3.internal.FU.getHeaders
                                                                                        public final void getMethod() {
                                                                                            int i2 = AGRequest + 113;
                                                                                            getBody = i2 % 128;
                                                                                            int i3 = i2 % 2;
                                                                                            checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.delete);
                                                                                            APIGuard.getHeaders();
                                                                                            int i4 = AGRequest + 125;
                                                                                            getBody = i4 % 128;
                                                                                            int i5 = i4 % 2;
                                                                                        }

                                                                                        private boolean getHeaders() {
                                                                                            int i2 = AGRequest + 29;
                                                                                            getBody = i2 % 128;
                                                                                            int i3 = i2 % 2;
                                                                                            try {
                                                                                                boolean booleanValue = ((Boolean) ((Class) getMethod.AGRequest((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 40, (ViewConfiguration.getLongPressTimeout() >> 16) + 2202)).getMethod("getHeaders", null).invoke(APIGuard.getUrl$17cc3eff(APIGuard.this), null)).booleanValue();
                                                                                                int i4 = AGRequest + 85;
                                                                                                getBody = i4 % 128;
                                                                                                int i5 = i4 % 2;
                                                                                                return booleanValue;
                                                                                            } catch (Throwable th) {
                                                                                                Throwable cause = th.getCause();
                                                                                                if (cause != null) {
                                                                                                    throw cause;
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        }

                                                                                        /* JADX WARNING: Code restructure failed: missing block: B:3:0x004b, code lost:
                                                                                            if (r1 != 3) goto L_0x004d;
                                                                                         */
                                                                                        @Override // com.apiguard3.internal.FU.getHeaders
                                                                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                                                                        public final /* synthetic */ void getHeaders(java.lang.Object r12) {
                                                                                            /*
                                                                                            // Method dump skipped, instructions count: 244
                                                                                            */
                                                                                            throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.APIGuard.AnonymousClass5.AnonymousClass2.getHeaders(java.lang.Object):void");
                                                                                        }
                                                                                    });
                                                                                    int i4 = method + 45;
                                                                                    url = i4 % 128;
                                                                                    int i5 = i4 % 2;
                                                                                } catch (Throwable th2) {
                                                                                    if (cause != null) {
                                                                                        throw cause;
                                                                                    }
                                                                                    throw th2;
                                                                                }
                                                                            } finally {
                                                                                cause = th2.getCause();
                                                                                if (cause != null) {
                                                                                    throw cause;
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            Throwable cause3 = th.getCause();
                                                                            if (cause3 != null) {
                                                                                throw cause3;
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        Throwable cause4 = th.getCause();
                                                                        if (cause4 != null) {
                                                                            throw cause4;
                                                                        }
                                                                    }
                                                                } finally {
                                                                    Throwable cause5 = th.getCause();
                                                                    if (cause5 != null) {
                                                                        throw cause5;
                                                                    }
                                                                }
                                                            } finally {
                                                                Throwable cause6 = th.getCause();
                                                                if (cause6 != null) {
                                                                    throw cause6;
                                                                }
                                                            }
                                                        } finally {
                                                            Throwable cause7 = th.getCause();
                                                            if (cause7 != null) {
                                                                throw cause7;
                                                            }
                                                        }
                                                    }

                                                    @Override // com.apiguard3.internal.NotReadyException$getMethod
                                                    public final void getUrl(String str) {
                                                        int i2 = method + 13;
                                                        url = i2 % 128;
                                                        int i3 = i2 % 2;
                                                        checkCertificates.getHeaders(onInitializationFailure.getBody.AGRequest, AGRequest(null, null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, "").intern(), AGRequest(null, null, KeyEvent.getDeadChar(0, 0) + 127, "").intern());
                                                        APIGuard.getUrl(APIGuard.this, AGState.APIGuardStateFailed);
                                                        APIGuard.AGRequest(APIGuard.this, str);
                                                        checkCertificates.AGRequest(log.getBody.getHeaders, str);
                                                        int i4 = method + 53;
                                                        url = i4 % 128;
                                                        int i5 = i4 % 2;
                                                    }

                                                    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
                                                    /* JADX WARN: Type inference failed for: r10v1 */
                                                    /* JADX WARN: Type inference failed for: r10v3, types: [byte[]] */
                                                    private static String AGRequest(int[] iArr, String str, int i2, String str2) {
                                                        int length;
                                                        char[] cArr;
                                                        if (str2 != 0) {
                                                            str2 = str2.getBytes("ISO-8859-1");
                                                        }
                                                        byte[] bArr = (byte[]) str2;
                                                        char[] cArr2 = str;
                                                        if (str != null) {
                                                            int i3 = url + 77;
                                                            method = i3 % 128;
                                                            int i4 = i3 % 2;
                                                            cArr2 = str.toCharArray();
                                                        }
                                                        char[] cArr3 = cArr2;
                                                        char[] cArr4 = getHeaders;
                                                        int i5 = AGRequest$Builder;
                                                        int i6 = 0;
                                                        if (addHeader) {
                                                            int length2 = bArr.length;
                                                            char[] cArr5 = new char[length2];
                                                            while (i6 < length2) {
                                                                cArr5[i6] = (char) (cArr4[bArr[(length2 - 1) - i6] + i2] - i5);
                                                                i6++;
                                                            }
                                                            String str3 = new String(cArr5);
                                                            int i7 = method + 11;
                                                            url = i7 % 128;
                                                            int i8 = i7 % 2;
                                                            return str3;
                                                        } else if (!newBuilder) {
                                                            int length3 = iArr.length;
                                                            char[] cArr6 = new char[length3];
                                                            while (i6 < length3) {
                                                                cArr6[i6] = (char) (cArr4[iArr[(length3 - 1) - i6] - i2] - i5);
                                                                i6++;
                                                            }
                                                            return new String(cArr6);
                                                        } else {
                                                            int i9 = method + 25;
                                                            int i10 = i9 % 128;
                                                            url = i10;
                                                            if (i9 % 2 == 0) {
                                                                length = cArr3.length;
                                                                cArr = new char[length];
                                                                i6 = 1;
                                                            } else {
                                                                length = cArr3.length;
                                                                cArr = new char[length];
                                                            }
                                                            int i11 = i10 + 125;
                                                            method = i11 % 128;
                                                            int i12 = i11 % 2;
                                                            while (i6 < length) {
                                                                cArr[i6] = (char) (cArr4[cArr3[(length - 1) - i6] - i2] - i5);
                                                                i6++;
                                                            }
                                                            return new String(cArr);
                                                        }
                                                    }
                                                };
                                                objArr4[0] = inputStream;
                                                ((Class) getMethod.AGRequest((char) Color.green(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 40, ((Process.getThreadPriority(0) + 20) >> 6) + 2202)).getMethod("getHeaders", InputStream.class, NotReadyException$getMethod.class).invoke(obj4, objArr4);
                                            } catch (Throwable th) {
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th;
                                            }
                                        } finally {
                                            cause = th.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                        }
                                    } finally {
                                        Throwable cause2 = th.getCause();
                                        if (cause2 != null) {
                                            throw cause2;
                                        }
                                    }
                                } finally {
                                    Throwable cause3 = th.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                }
                            } finally {
                                Throwable cause4 = th.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                            }
                        } finally {
                            Throwable cause5 = th.getCause();
                            if (cause5 != null) {
                                throw cause5;
                            }
                        }
                    } finally {
                        Throwable cause6 = th.getCause();
                        if (cause6 != null) {
                            throw cause6;
                        }
                    }
                } finally {
                    Throwable cause7 = th.getCause();
                    if (cause7 != null) {
                        throw cause7;
                    }
                }
            } else {
                checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.getBody);
                int i4 = AGState + 77;
                AGResponse$Builder = i4 % 128;
                int i5 = i4 % 2;
            }
        } finally {
            Throwable cause8 = th.getCause();
            if (cause8 != null) {
                throw cause8;
            }
        }
    }

    public synchronized void initialize(Application application, Callback callback, int i2, int i3) {
        Throwable cause;
        MethodCollector.i(7640);
        if (!getMethod()) {
            checkCertificates.AGRequest(log.getBody.AGRequest, new StringBuilder().append(getHeaders("\u0007\u0004\u000b\r\u0007\u0014\n\u0007\u0001\u000e\u0007\u0014\u0011\t\u0014\t\u000e\u0002\u0002\u0012\u000e\u0003\t\u0014\u0003\f\u000f\u0013\u0014\u000e\u0014\u0007\u0000\u0013\u0007\u001b\u000e\u000f\u0005\u0014\u0011\r\u0007\u0014\n\u0007\u0006\u0007\u000f\u001b@", View.getDefaultSize(0, 0) + 53, (byte) (31 - TextUtils.indexOf((CharSequence) "", '0'))).intern()).append(this.getHeaders).toString());
            MethodCollector.o(7640);
            return;
        }
        SConfig.getUrl.getMethod();
        AGState aGState = AGState.APIGuardStateInProgress;
        synchronized (this.getMethod) {
            try {
                this.getHeaders = aGState;
                APIGuard$InitializationCallback.getBody().AGRequest(this.getHeaders);
            } catch (Throwable th) {
                MethodCollector.o(7640);
                throw th;
            }
        }
        if (application != null) {
            try {
                try {
                    ((Class) getMethod.AGRequest((char) (-1 - Process.getGidForName("")), 53 - AndroidCharacter.getEastAsianWidth('0'), 5815 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("AGRequest", Context.class).invoke(((Class) getMethod.AGRequest((char) TextUtils.getOffsetAfter("", 0), 50 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)), (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 5814)).getMethod("getHeaders", null).invoke(null, null), application);
                    try {
                        getHeaders(callback);
                        APIGuard$InitializationCallback.getBody().getUrl(callback);
                        getHeaders(application, callback, com_apiguard3_APIGuard_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(application).getResources().openRawResource(i2));
                        MethodCollector.o(7640);
                    } catch (Throwable th2) {
                        getHeaders(th2);
                        MethodCollector.o(7640);
                    }
                } catch (Throwable th3) {
                    if (cause != null) {
                        throw cause;
                    }
                    MethodCollector.o(7640);
                    throw th3;
                }
            } finally {
                cause = th3.getCause();
                if (cause != null) {
                    MethodCollector.o(7640);
                    throw cause;
                } else {
                    MethodCollector.o(7640);
                }
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(getState.getBody.getBody.AGRequest());
            MethodCollector.o(7640);
            throw illegalArgumentException;
        }
    }

    public synchronized void initialize(Application application, Callback callback, int i2, int i3, String str) {
        Throwable cause;
        MethodCollector.i(7673);
        if (!getMethod()) {
            checkCertificates.AGRequest(log.getBody.AGRequest, new StringBuilder().append(getHeaders("\u0007\u0004\u000b\r\u0007\u0014\n\u0007\u0001\u000e\u0007\u0014\u0011\t\u0014\t\u000e\u0002\u0002\u0012\u000e\u0003\t\u0014\u0003\f\u000f\u0013\u0014\u000e\u0014\u0007\u0000\u0013\u0007\u001b\u000e\u000f\u0005\u0014\u0011\r\u0007\u0014\n\u0007\u0006\u0007\u000f\u001b@", 52 - ExpandableListView.getPackedPositionChild(0), (byte) (32 - TextUtils.getOffsetAfter("", 0))).intern()).append(this.getHeaders).toString());
            MethodCollector.o(7673);
            return;
        }
        SConfig.getUrl.getMethod();
        AGState aGState = AGState.APIGuardStateInProgress;
        synchronized (this.getMethod) {
            try {
                this.getHeaders = aGState;
                APIGuard$InitializationCallback.getBody().AGRequest(this.getHeaders);
            } finally {
                MethodCollector.o(7673);
            }
        }
        if (application != null) {
            try {
                try {
                    ((Class) getMethod.AGRequest((char) ExpandableListView.getPackedPositionGroup(0), 49 - TextUtils.getOffsetAfter("", 0), 5815 - TextUtils.getCapsMode("", 0, 0))).getMethod("AGRequest", Context.class).invoke(((Class) getMethod.AGRequest((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getEdgeSlop() >> 16) + 49, 5815 - (ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("getHeaders", null).invoke(null, null), application);
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            this.method = str;
                            getHeaders(callback);
                            APIGuard$InitializationCallback.getBody().getUrl(callback);
                            getHeaders(application, callback, com_apiguard3_APIGuard_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(application).getResources().openRawResource(i2));
                            return;
                        }
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AGRequest("Ạ虮左칓ۺ㾁둜ࢮ0칓ۺᅀൟ퐫啊潫괏㴄虮左껓?됍ῃﵫ㖼託").intern());
                        MethodCollector.o(7673);
                        throw illegalArgumentException;
                    } catch (Throwable th) {
                        getHeaders(th);
                        MethodCollector.o(7673);
                    }
                } catch (Throwable th2) {
                    if (cause != null) {
                        throw cause;
                    }
                    MethodCollector.o(7673);
                    throw th2;
                }
            } finally {
                cause = th2.getCause();
                if (cause != null) {
                    MethodCollector.o(7673);
                    throw cause;
                } else {
                    MethodCollector.o(7673);
                }
            }
        } else {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(getState.getBody.getBody.AGRequest());
            MethodCollector.o(7673);
            throw illegalArgumentException2;
        }
    }
}
