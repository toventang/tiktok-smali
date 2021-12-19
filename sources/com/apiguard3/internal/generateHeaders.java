package com.apiguard3.internal;

import android.graphics.Color;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class generateHeaders implements log {
    private static int addHeader;
    private static int get;
    private static final Map<log.getBody, Integer> getBody = Collections.unmodifiableMap(new HashMap<log.getBody, Integer>() {
        /* class com.apiguard3.internal.generateHeaders.AnonymousClass5 */

        static {
            Covode.recordClassIndex(2545);
        }

        {
            put(log.getBody.getMethod, 20);
            put(log.getBody.getHeaders, 20);
            put(log.getBody.getUrl, 30);
            put(log.getBody.getBody, 40);
            put(log.getBody.AGRequest, 40);
            put(log.getBody.addHeader, 50);
        }
    });
    private static int getHeaders = 5000;
    private static int head = 0;
    private static long method;
    private static char post;
    volatile RB<SLE> AGRequest;
    private File AGRequest$Builder;
    Handler getMethod;
    final Runnable getUrl;
    private volatile boolean newBuilder;
    private log.getBody url;

    static void AGRequest() {
        post = 0;
        method = -6385778326712172879L;
        addHeader = 0;
    }

    static /* synthetic */ int getMethod() {
        int i2 = get + 115;
        head = i2 % 128;
        if (i2 % 2 == 0) {
            return getHeaders;
        }
        return getHeaders;
    }

    static {
        Covode.recordClassIndex(2542);
        get = 1;
        AGRequest();
        int i2 = head + 115;
        get = i2 % 128;
        int i3 = i2 % 2;
    }

    public generateHeaders() {
        this(AGRequest("뺱⡱ꝡ", "닗鲆薺㊟쳊뛦펃゠᧜鷮㙓壙剋", "뾾⤼殍", (char) (36137 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.getOffsetAfter("", 0) + 1019199204).intern());
    }

    /* access modifiers changed from: package-private */
    public final synchronized void getBody() {
        MethodCollector.i(2753);
        int i2 = get + 109;
        head = i2 % 128;
        int i3 = i2 % 2;
        getHeaders();
        int i4 = head + 117;
        get = i4 % 128;
        if (i4 % 2 != 0) {
            MethodCollector.o(2753);
        } else {
            MethodCollector.o(2753);
        }
    }

    public final synchronized void getUrl() {
        MethodCollector.i(2758);
        int i2 = head + 103;
        get = i2 % 128;
        int i3 = i2 % 2;
        if (this.newBuilder) {
            MethodCollector.o(2758);
            return;
        }
        if (!this.AGRequest.getHeaders()) {
            int i4 = head + 23;
            get = i4 % 128;
            int i5 = i4 % 2;
            getHeaders();
        }
        this.getMethod.removeCallbacks(this.getUrl);
        this.newBuilder = true;
        int i6 = head + 95;
        get = i6 % 128;
        if (i6 % 2 != 0) {
            MethodCollector.o(2758);
        } else {
            MethodCollector.o(2758);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097 A[LOOP:0: B:25:0x0089->B:28:0x0097, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getHeaders() {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.generateHeaders.getHeaders():void");
    }

    static /* synthetic */ boolean getUrl(generateHeaders generateheaders) {
        int i2 = head + 123;
        get = i2 % 128;
        int i3 = i2 % 2;
        boolean z = generateheaders.newBuilder;
        int i4 = head + 53;
        get = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private synchronized void AGRequest(int i2) {
        MethodCollector.i(2763);
        int i3 = head + 45;
        get = i3 % 128;
        int i4 = i3 % 2;
        this.AGRequest.AGRequest(i2);
        int i5 = get + 105;
        head = i5 % 128;
        if (i5 % 2 == 0) {
            MethodCollector.o(2763);
        } else {
            MethodCollector.o(2763);
        }
    }

    private generateHeaders(String str) {
        this.url = log.getBody.getHeaders;
        AnonymousClass3 r4 = new Runnable() {
            /* class com.apiguard3.internal.generateHeaders.AnonymousClass3 */

            static {
                Covode.recordClassIndex(2544);
            }

            public final void run() {
                MethodCollector.i(2686);
                synchronized (generateHeaders.this) {
                    try {
                        generateHeaders.this.getHeaders();
                        if (!generateHeaders.getUrl(generateHeaders.this)) {
                            generateHeaders.this.getMethod.postDelayed(generateHeaders.this.getUrl, (long) generateHeaders.getMethod());
                        }
                    } finally {
                        MethodCollector.o(2686);
                    }
                }
            }
        };
        this.getUrl = r4;
        this.AGRequest = new RB<>(20);
        Handler method2 = updateKernel.getMethod();
        this.getMethod = method2;
        method2.postDelayed(r4, (long) getHeaders);
        try {
            this.AGRequest$Builder = (File) ((Class) getMethod.AGRequest((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 26, TextUtils.indexOf("", "", 0, 0) + 1958)).getMethod("AGRequest", String.class).invoke(null, str);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static List<Pair<String, Number>> getHeaders(RB<SLE> rb) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (SLE sle : rb.getUrl()) {
            arrayList.add(new Pair(sle.id, sle.timeStamp));
        }
        int i2 = get + 31;
        head = i2 % 128;
        if (i2 % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return arrayList;
        }
        throw new NullPointerException("hashCode");
    }

    @Override // com.apiguard3.internal.log
    public final void getUrl(log.getBody getbody) {
        if (getbody != null) {
            int i2 = get + 125;
            head = i2 % 128;
            int i3 = i2 % 2;
            if (!getbody.equals(this.url)) {
                int i4 = get + 37;
                head = i4 % 128;
                int i5 = i4 % 2;
                AGRequest(getBody.get(getbody).intValue());
                this.url = getbody;
            }
        }
        int i6 = head + 25;
        get = i6 % 128;
        if (i6 % 2 == 0) {
            throw new NullPointerException("hashCode");
        }
    }

    @Override // com.apiguard3.internal.log
    public final void getHeaders(final APIGuard$Callback aPIGuard$Callback) {
        int i2 = head + 11;
        get = i2 % 128;
        if (i2 % 2 == 0 ? !this.newBuilder : !this.newBuilder) {
            if (aPIGuard$Callback.getMethod.compareTo((Enum) this.url) <= 0) {
                this.getMethod.post(new Runnable() {
                    /* class com.apiguard3.internal.generateHeaders.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(2543);
                    }

                    public final void run() {
                        MethodCollector.i(2713);
                        String str = aPIGuard$Callback.getBody;
                        if (TextUtils.isEmpty(str)) {
                            MethodCollector.o(2713);
                            return;
                        }
                        synchronized (this) {
                            try {
                                generateHeaders.this.AGRequest.getHeaders(new SLE(str, aPIGuard$Callback.getUrl));
                                if (generateHeaders.this.AGRequest.getMethod() >= 3) {
                                    generateHeaders.this.getHeaders();
                                }
                            } finally {
                                MethodCollector.o(2713);
                            }
                        }
                    }
                });
                return;
            }
        }
        int i3 = head + 25;
        get = i3 % 128;
        if (i3 % 2 == 0) {
            throw new NullPointerException("hashCode");
        }
    }

    public final synchronized List<Pair<String, Number>> getUrl(boolean z) {
        boolean z2;
        Throwable cause;
        char c2;
        char c3;
        MethodCollector.i(2752);
        ArrayList arrayList = new ArrayList();
        if (!this.AGRequest.getHeaders()) {
            arrayList.addAll(getHeaders(this.AGRequest));
            this.AGRequest.getBody();
            int i2 = head + 21;
            get = i2 % 128;
            int i3 = i2 % 2;
        }
        if (this.AGRequest$Builder.exists()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int i4 = get + 29;
            head = i4 % 128;
            if (i4 % 2 == 0) {
                MethodCollector.o(2752);
                return arrayList;
            }
            MethodCollector.o(2752);
            return arrayList;
        }
        try {
            try {
                RB rb = (RB) ((Class) getMethod.AGRequest((char) (Process.myPid() >> 22), TextUtils.indexOf("", "", 0) + 26, 1958 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)))).getMethod("getMethod", File.class).invoke(null, this.AGRequest$Builder);
                if (rb == null) {
                    c2 = 'P';
                } else {
                    c2 = 15;
                }
                if (c2 == 15) {
                    if (!rb.getHeaders()) {
                        c3 = '!';
                    } else {
                        c3 = '&';
                    }
                    if (c3 == '!') {
                        arrayList.addAll(getHeaders(rb));
                        try {
                            ((Boolean) ((Class) getMethod.AGRequest((char) (1 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1))), Color.rgb(0, 0, 0) + 16777242, -16775258 - Color.rgb(0, 0, 0))).getMethod("AGRequest", File.class).invoke(null, this.AGRequest$Builder)).booleanValue();
                            MethodCollector.o(2752);
                            return arrayList;
                        } catch (Throwable th) {
                            if (cause != null) {
                                throw cause;
                            }
                            MethodCollector.o(2752);
                            throw th;
                        }
                    }
                }
                MethodCollector.o(2752);
                return arrayList;
            } finally {
                cause = th.getCause();
                if (cause != null) {
                    MethodCollector.o(2752);
                    throw cause;
                }
                MethodCollector.o(2752);
            }
        } catch (Throwable th2) {
            checkCertificates.AGRequest(log.getBody.getHeaders, getState.getHeaders.analyzeResponse, th2.toString());
        }
    }

    private static String AGRequest(String str, String str2, String str3, char c2, int i2) {
        char c3;
        char c4;
        int i3 = get + 93;
        head = i3 % 128;
        char[] cArr = str3;
        if (i3 % 2 == 0) {
            if (str3 != null) {
                int i4 = get + 17;
                head = i4 % 128;
                int i5 = i4 % 2;
                cArr = str3.toCharArray();
            }
            char[] cArr2 = cArr;
            char[] cArr3 = str2;
            if (str2 != null) {
                cArr3 = str2.toCharArray();
            }
            char[] cArr4 = cArr3;
            char[] cArr5 = str;
            if (str != null) {
                int i6 = head + 45;
                get = i6 % 128;
                if (i6 % 2 != 0) {
                    c3 = 'R';
                } else {
                    c3 = 17;
                }
                if (c3 != 17) {
                    cArr5 = str.toCharArray();
                } else {
                    cArr5 = str.toCharArray();
                }
            }
            char[] cArr6 = (char[]) cArr2.clone();
            char[] cArr7 = (char[]) cArr5.clone();
            int i7 = 0;
            cArr6[0] = (char) (c2 ^ cArr6[0]);
            cArr7[2] = (char) (cArr7[2] + ((char) i2));
            int length = cArr4.length;
            char[] cArr8 = new char[length];
            while (true) {
                if (i7 >= length) {
                    c4 = 19;
                } else {
                    c4 = '/';
                }
                if (c4 != '/') {
                    return new String(cArr8);
                }
                setNextFocusUpId.getHeaders(cArr6, cArr7, i7);
                cArr8[i7] = (char) ((int) (((((long) (cArr4[i7] ^ cArr6[(i7 + 3) % 4])) ^ method) ^ ((long) addHeader)) ^ ((long) post)));
                i7++;
            }
        } else {
            throw new NullPointerException("hashCode");
        }
    }
}
