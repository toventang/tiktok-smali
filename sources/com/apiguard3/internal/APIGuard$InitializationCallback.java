package com.apiguard3.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.apiguard3.AGState;
import com.apiguard3.APIGuard;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class APIGuard$InitializationCallback {
    private static int AGRequest$Builder;
    private static int addHeader = 1;
    private static final APIGuard$InitializationCallback getUrl = new APIGuard$InitializationCallback();
    private static long url;
    private Map<String, log> AGRequest = new HashMap();
    private log.getBody getBody;
    private generateHeaders getHeaders;
    private pushMinPayload getMethod;
    private transformRequest method;
    private volatile boolean newBuilder;

    static void getMethod() {
        url = -1626822001641815388L;
    }

    static {
        Covode.recordClassIndex(2502);
        AGRequest$Builder = 0;
        getMethod();
        int i2 = addHeader + 47;
        AGRequest$Builder = i2 % 128;
        int i3 = i2 % 2;
    }

    private APIGuard$InitializationCallback() {
        AGRequest("ﲧ繧箂眶灔涁椫橝柮挜屎姡").intern();
        this.getBody = log.getBody.getHeaders;
        this.newBuilder = false;
    }

    public static APIGuard$InitializationCallback getBody() {
        int i2 = AGRequest$Builder + 19;
        addHeader = i2 % 128;
        if (i2 % 2 != 0) {
            return getUrl;
        }
        APIGuard$InitializationCallback aPIGuard$InitializationCallback = getUrl;
        throw new NullPointerException("hashCode");
    }

    public final synchronized void getUrl() {
        MethodCollector.i(3955);
        generateHeaders generateheaders = this.getHeaders;
        if (generateheaders == null) {
            MethodCollector.o(3955);
            return;
        }
        int i2 = addHeader + 117;
        AGRequest$Builder = i2 % 128;
        int i3 = i2 % 2;
        generateheaders.getBody();
        int i4 = AGRequest$Builder + 11;
        addHeader = i4 % 128;
        if (i4 % 2 != 0) {
            MethodCollector.o(3955);
        } else {
            MethodCollector.o(3955);
        }
    }

    static int AGRequest() {
        int i2 = addHeader + 99;
        AGRequest$Builder = i2 % 128;
        int i3 = i2 % 2;
        String intern = AGRequest("ﲧ繧箂眶灔涁椫橝柮挜屎姡").intern();
        try {
            Object[] objArr = new Object[2];
            objArr[1] = Integer.valueOf(log.getBody.getHeaders.getBody());
            objArr[0] = intern;
            int intValue = ((Integer) ((Class) getMethod.AGRequest((char) (27326 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1))), 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), 2060 - Color.red(0))).getMethod("getBody", String.class, Integer.TYPE).invoke(null, objArr)).intValue();
            int i4 = addHeader + 5;
            AGRequest$Builder = i4 % 128;
            int i5 = i4 % 2;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final synchronized log.getBody getHeaders() {
        MethodCollector.i(2742);
        int i2 = AGRequest$Builder + 97;
        int i3 = i2 % 128;
        addHeader = i3;
        int i4 = i2 % 2;
        log.getBody getbody = this.getBody;
        int i5 = i3 + 37;
        AGRequest$Builder = i5 % 128;
        if (i5 % 2 == 0) {
            MethodCollector.o(2742);
            return getbody;
        }
        MethodCollector.o(2742);
        return getbody;
    }

    static /* synthetic */ generateHeaders AGRequest(APIGuard$InitializationCallback aPIGuard$InitializationCallback) {
        int i2 = addHeader + 75;
        AGRequest$Builder = i2 % 128;
        int i3 = i2 % 2;
        return aPIGuard$InitializationCallback.getHeaders;
    }

    static /* synthetic */ transformRequest getHeaders(APIGuard$InitializationCallback aPIGuard$InitializationCallback) {
        int i2 = AGRequest$Builder + 55;
        int i3 = i2 % 128;
        addHeader = i3;
        int i4 = i2 % 2;
        transformRequest transformrequest = aPIGuard$InitializationCallback.method;
        int i5 = i3 + 65;
        AGRequest$Builder = i5 % 128;
        int i6 = i5 % 2;
        return transformrequest;
    }

    static /* synthetic */ pushMinPayload getBody(APIGuard$InitializationCallback aPIGuard$InitializationCallback) {
        int i2 = addHeader + 55;
        int i3 = i2 % 128;
        AGRequest$Builder = i3;
        int i4 = i2 % 2;
        pushMinPayload pushminpayload = aPIGuard$InitializationCallback.getMethod;
        int i5 = i3 + 89;
        addHeader = i5 % 128;
        int i6 = i5 % 2;
        return pushminpayload;
    }

    public final synchronized log getMethod(String str) {
        MethodCollector.i(2856);
        int i2 = AGRequest$Builder + 93;
        addHeader = i2 % 128;
        if (i2 % 2 == 0) {
            try {
                throw new NullPointerException("hashCode");
            } catch (Throwable th) {
                MethodCollector.o(2856);
                throw th;
            }
        } else if (str != null) {
            log log = this.AGRequest.get(str);
            int i3 = AGRequest$Builder + 25;
            addHeader = i3 % 128;
            if (i3 % 2 != 0) {
                MethodCollector.o(2856);
                return log;
            }
            MethodCollector.o(2856);
            return log;
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AGRequest("㟱딜━崁镽쵫՗㴌疱궡ᶏ嗼跸얛﷚㗄氻ꐢ?ᐒ䱢葦뱟Ⲹ撦鲝풍಺䓢糪뒕✲弴霽켍ݴ㽫睘꽜").intern());
            MethodCollector.o(2856);
            throw illegalArgumentException;
        }
    }

    public final synchronized void getUrl(final APIGuard.Callback callback) {
        MethodCollector.i(2854);
        int i2 = addHeader + 123;
        AGRequest$Builder = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = this.newBuilder;
            try {
                throw new NullPointerException("hashCode");
            } catch (Throwable th) {
                MethodCollector.o(2854);
                throw th;
            }
        } else if (this.newBuilder) {
            MethodCollector.o(2854);
        } else {
            this.newBuilder = true;
            updateKernel.getMethod().post(new Runnable() {
                /* class com.apiguard3.internal.APIGuard$InitializationCallback.AnonymousClass3 */
                private static long AGRequest = -1790202851029041327L;
                private static int AGRequest$Builder = 1;
                private static int addHeader;
                private static int getBody;
                private static char getHeaders = 0;

                static {
                    Covode.recordClassIndex(2503);
                }

                public final void run() {
                    try {
                        APIGuard$InitializationCallback.getMethod(APIGuard$InitializationCallback.this, APIGuard$InitializationCallback.AGRequest());
                        HashMap hashMap = new HashMap();
                        APIGuard$InitializationCallback.getHeaders(APIGuard$InitializationCallback.this, new transformRequest(callback));
                        hashMap.put(getBody("뽑", "芌酟䷛펁ᖋ頛꾍즵", "묝멒䪎欄", (char) TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1).intern(), APIGuard$InitializationCallback.getHeaders(APIGuard$InitializationCallback.this));
                        APIGuard$InitializationCallback.AGRequest(APIGuard$InitializationCallback.this, new pushMinPayload());
                        APIGuard$InitializationCallback.getBody(APIGuard$InitializationCallback.this).getHeaders();
                        hashMap.put(getBody("뽑", "繆ꐌ풃톄企㐎ᥜﻳ", "층Ꜵ杖", (char) TextUtils.indexOf("", ""), 1453798606 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), APIGuard$InitializationCallback.getBody(APIGuard$InitializationCallback.this));
                        APIGuard$InitializationCallback.getMethod(APIGuard$InitializationCallback.this, new generateHeaders());
                        hashMap.put(getBody("뽑", "ᆴ瞞ꪥ︊둜윅痄泧?", "內ꡏ⭐ꘙ", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), Drawable.resolveOpacity(0, 0)).intern(), APIGuard$InitializationCallback.AGRequest(APIGuard$InitializationCallback.this));
                        APIGuard$InitializationCallback.getHeaders(APIGuard$InitializationCallback.this, hashMap);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }

                private static String getBody(String str, String str2, String str3, char c2, int i2) {
                    char[] cArr = str3;
                    if (str3 != null) {
                        int i3 = AGRequest$Builder + 15;
                        addHeader = i3 % 128;
                        int i4 = i3 % 2;
                        cArr = str3.toCharArray();
                    }
                    char[] cArr2 = cArr;
                    char[] cArr3 = str2;
                    if (str2 != null) {
                        char[] charArray = str2.toCharArray();
                        int i5 = addHeader + 41;
                        AGRequest$Builder = i5 % 128;
                        int i6 = i5 % 2;
                        cArr3 = charArray;
                    }
                    char[] cArr4 = cArr3;
                    char[] cArr5 = str;
                    if (str != null) {
                        cArr5 = str.toCharArray();
                    }
                    char[] cArr6 = (char[]) cArr2.clone();
                    char[] cArr7 = (char[]) cArr5.clone();
                    cArr6[0] = (char) (c2 ^ cArr6[0]);
                    cArr7[2] = (char) (cArr7[2] + ((char) i2));
                    int length = cArr4.length;
                    char[] cArr8 = new char[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        setNextFocusUpId.getHeaders(cArr6, cArr7, i7);
                        cArr8[i7] = (char) ((int) (((((long) (cArr4[i7] ^ cArr6[(i7 + 3) % 4])) ^ AGRequest) ^ ((long) getBody)) ^ ((long) getHeaders)));
                    }
                    return new String(cArr8);
                }
            });
            int i3 = addHeader + 49;
            AGRequest$Builder = i3 % 128;
            if (i3 % 2 == 0) {
                MethodCollector.o(2854);
            } else {
                MethodCollector.o(2854);
            }
        }
    }

    private static String AGRequest(String str) {
        char[] cArr = str;
        if (str != null) {
            int i2 = addHeader + 67;
            AGRequest$Builder = i2 % 128;
            int i3 = i2 % 2;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char c2 = cArr2[0];
        char[] cArr3 = new char[(cArr2.length - 1)];
        for (int i4 = 1; i4 < cArr2.length; i4++) {
            int i5 = addHeader + 67;
            AGRequest$Builder = i5 % 128;
            int i6 = i5 % 2;
            cArr3[i4 - 1] = (char) ((int) (((long) (cArr2[i4] ^ (i4 * c2))) ^ url));
        }
        return new String(cArr3);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void getUrl(APIGuard$Callback aPIGuard$Callback) {
        MethodCollector.i(4142);
        for (log log : this.AGRequest.values()) {
            int i2 = AGRequest$Builder + 19;
            addHeader = i2 % 128;
            int i3 = i2 % 2;
            log.getHeaders(aPIGuard$Callback);
            int i4 = addHeader + 23;
            AGRequest$Builder = i4 % 128;
            int i5 = i4 % 2;
        }
        MethodCollector.o(4142);
    }

    private synchronized void AGRequest(Map<String, log> map) {
        MethodCollector.i(2855);
        int i2 = AGRequest$Builder + 77;
        addHeader = i2 % 128;
        int i3 = i2 % 2;
        this.AGRequest.putAll(map);
        int i4 = AGRequest$Builder + 77;
        addHeader = i4 % 128;
        if (i4 % 2 != 0) {
            MethodCollector.o(2855);
        } else {
            MethodCollector.o(2855);
        }
    }

    public final synchronized void getUrl(log.getBody getbody) {
        log next;
        MethodCollector.i(3235);
        if (getbody != null) {
            this.getBody = getbody;
            checkCertificates.AGRequest(getbody);
            int body = getbody.getBody();
            String intern = AGRequest("ﲧ繧箂眶灔涁椫橝柮挜屎姡").intern();
            try {
                Object[] objArr = new Object[2];
                objArr[1] = Integer.valueOf(body);
                objArr[0] = intern;
                ((Class) getMethod.AGRequest((char) (27324 - TextUtils.lastIndexOf("", '0', 0, 0)), 23 - TextUtils.lastIndexOf("", '0', 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 2060)).getMethod("getUrl", String.class, Integer.TYPE).invoke(null, objArr);
                Iterator<log> it = this.AGRequest.values().iterator();
                while (it.hasNext()) {
                    int i2 = addHeader + 91;
                    AGRequest$Builder = i2 % 128;
                    if (i2 % 2 == 0) {
                        next = it.next();
                    } else {
                        next = it.next();
                    }
                    next.getUrl(getbody);
                }
                MethodCollector.o(3235);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    MethodCollector.o(3235);
                    throw cause;
                } else {
                    MethodCollector.o(3235);
                    throw th;
                }
            }
        } else {
            int i3 = AGRequest$Builder + 105;
            addHeader = i3 % 128;
            if (i3 % 2 != 0) {
                MethodCollector.o(3235);
            } else {
                MethodCollector.o(3235);
            }
        }
    }

    public final synchronized void AGRequest(AGState aGState) {
        MethodCollector.i(3681);
        int i2 = AGRequest$Builder + 105;
        addHeader = i2 % 128;
        int i3 = i2 % 2;
        if (aGState.equals(AGState.APIGuardStateReady)) {
            pushMinPayload pushminpayload = this.getMethod;
            if (pushminpayload != null) {
                pushminpayload.getBody();
            }
            generateHeaders generateheaders = this.getHeaders;
            if (generateheaders != null) {
                int i4 = addHeader + 107;
                AGRequest$Builder = i4 % 128;
                int i5 = i4 % 2;
                generateheaders.getUrl();
            }
        }
        int i6 = AGRequest$Builder + 45;
        addHeader = i6 % 128;
        if (i6 % 2 != 0) {
            MethodCollector.o(3681);
        } else {
            MethodCollector.o(3681);
        }
    }

    static /* synthetic */ generateHeaders getMethod(APIGuard$InitializationCallback aPIGuard$InitializationCallback, generateHeaders generateheaders) {
        int i2 = addHeader + 125;
        AGRequest$Builder = i2 % 128;
        int i3 = i2 % 2;
        aPIGuard$InitializationCallback.getHeaders = generateheaders;
        return generateheaders;
    }

    static /* synthetic */ void getMethod(APIGuard$InitializationCallback aPIGuard$InitializationCallback, int i2) {
        int i3 = AGRequest$Builder + 69;
        addHeader = i3 % 128;
        int i4 = i3 % 2;
        aPIGuard$InitializationCallback.getUrl(log.getBody.AGRequest(i2));
        int i5 = addHeader + 67;
        AGRequest$Builder = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ pushMinPayload AGRequest(APIGuard$InitializationCallback aPIGuard$InitializationCallback, pushMinPayload pushminpayload) {
        int i2 = AGRequest$Builder;
        int i3 = i2 + 63;
        addHeader = i3 % 128;
        int i4 = i3 % 2;
        aPIGuard$InitializationCallback.getMethod = pushminpayload;
        int i5 = i2 + 109;
        addHeader = i5 % 128;
        if (i5 % 2 != 0) {
            return pushminpayload;
        }
        throw new NullPointerException("hashCode");
    }

    static /* synthetic */ transformRequest getHeaders(APIGuard$InitializationCallback aPIGuard$InitializationCallback, transformRequest transformrequest) {
        char c2;
        int i2 = AGRequest$Builder + 35;
        addHeader = i2 % 128;
        if (i2 % 2 != 0) {
            c2 = '+';
        } else {
            c2 = 'C';
        }
        aPIGuard$InitializationCallback.method = transformrequest;
        if (c2 != 'C') {
            int i3 = AGRequest$Builder + 91;
            addHeader = i3 % 128;
            int i4 = i3 % 2;
            return transformrequest;
        }
        throw new NullPointerException("hashCode");
    }

    static /* synthetic */ void getHeaders(APIGuard$InitializationCallback aPIGuard$InitializationCallback, Map map) {
        int i2 = AGRequest$Builder + 113;
        addHeader = i2 % 128;
        int i3 = i2 % 2;
        aPIGuard$InitializationCallback.AGRequest(map);
        int i4 = addHeader + 61;
        AGRequest$Builder = i4 % 128;
        if (i4 % 2 != 0) {
            throw new NullPointerException("hashCode");
        }
    }
}
