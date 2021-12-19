package com.apiguard3.internal;

import android.os.Message;
import com.apiguard3.BuildConfig;
import com.apiguard3.internal.log;
import com.apiguard3.internal.onInitializationFailure;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class checkCertificates {
    private static int getBody = 0;
    private static int getMethod;
    private static log.getBody getUrl = APIGuard$InitializationCallback.getBody().getHeaders();

    static {
        Covode.recordClassIndex(2537);
        getMethod = 1;
        int i2 = getBody + 15;
        getMethod = i2 % 128;
        int i3 = i2 % 2;
    }

    private static synchronized log.getBody getHeaders() {
        log.getBody getbody;
        synchronized (checkCertificates.class) {
            MethodCollector.i(2725);
            int i2 = getBody;
            int i3 = i2 + 3;
            getMethod = i3 % 128;
            int i4 = i3 % 2;
            getbody = getUrl;
            int i5 = i2 + 61;
            getMethod = i5 % 128;
            if (i5 % 2 != 0) {
                MethodCollector.o(2725);
            } else {
                try {
                    throw new NullPointerException("hashCode");
                } catch (Throwable th) {
                    MethodCollector.o(2725);
                    throw th;
                }
            }
        }
        return getbody;
    }

    public static synchronized void AGRequest(log.getBody getbody) {
        synchronized (checkCertificates.class) {
            MethodCollector.i(2726);
            int i2 = getMethod + 39;
            int i3 = i2 % 128;
            getBody = i3;
            int i4 = i2 % 2;
            if (getbody == null) {
                MethodCollector.o(2726);
                return;
            }
            getUrl = getbody;
            int i5 = i3 + 9;
            getMethod = i5 % 128;
            if (i5 % 2 != 0) {
                MethodCollector.o(2726);
            } else {
                MethodCollector.o(2726);
            }
        }
    }

    public static void getMethod(log.getBody getbody, log.getMethod getmethod) {
        int i2 = getBody + 39;
        getMethod = i2 % 128;
        int i3 = i2 % 2;
        if (getbody.compareTo((Enum) getHeaders()) <= 0) {
            AGRequest(getbody, getmethod, (String) null);
            return;
        }
        int i4 = getBody + 57;
        getMethod = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void AGRequest(log.getBody getbody, String str) {
        int i2 = getMethod + 19;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        if (getbody.compareTo((Enum) getHeaders()) <= 0) {
            AGRequest(getbody, new log.getMethod() {
                /* class com.apiguard3.internal.checkCertificates.AnonymousClass3 */
                private static int getBody = 1;
                private static int getHeaders;

                static {
                    Covode.recordClassIndex(2538);
                }

                @Override // com.apiguard3.internal.log.getMethod
                public final String AGRequest() {
                    int i2 = getBody;
                    int i3 = i2 + 63;
                    getHeaders = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 31;
                    getHeaders = i5 % 128;
                    if (i5 % 2 == 0) {
                        return "";
                    }
                    throw new NullPointerException("hashCode");
                }
            }, str);
            int i4 = getMethod + 73;
            getBody = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static void AGRequest(log.getBody getbody, log.getMethod getmethod, String str) {
        int i2 = getBody + 107;
        getMethod = i2 % 128;
        int i3 = i2 % 2;
        if (getbody.compareTo((Enum) getHeaders()) <= 0) {
            Message message = new Message();
            message.obj = new APIGuard$Callback(getbody, getmethod, str, System.currentTimeMillis());
            updateKernel.getMethod().sendMessage(message);
            int i4 = getBody + 25;
            getMethod = i4 % 128;
            if (i4 % 2 == 0) {
                throw new NullPointerException("hashCode");
            }
        }
    }

    public static void getHeaders(onInitializationFailure.getBody getbody, final String str, String str2) {
        int i2 = getBody + 19;
        getMethod = i2 % 128;
        int i3 = i2 % 2;
        if (BuildConfig.AGRequest.booleanValue()) {
            onInitializationFailure oninitializationfailure = new onInitializationFailure(getbody, str, log.getBody.getMethod, new log.getMethod() {
                /* class com.apiguard3.internal.checkCertificates.AnonymousClass5 */
                private static int getHeaders;
                private static int getMethod = 1;

                static {
                    Covode.recordClassIndex(2539);
                }

                @Override // com.apiguard3.internal.log.getMethod
                public final String AGRequest() {
                    boolean z;
                    int i2 = getMethod;
                    int i3 = i2 + 117;
                    getHeaders = i3 % 128;
                    int i4 = i3 % 2;
                    String str = str;
                    int i5 = i2 + 63;
                    getHeaders = i5 % 128;
                    if (i5 % 2 == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        return str;
                    }
                    throw new NullPointerException("hashCode");
                }
            }, str2, System.currentTimeMillis());
            Message message = new Message();
            message.obj = oninitializationfailure;
            updateKernel.getMethod().sendMessage(message);
        }
        int i4 = getBody + 33;
        getMethod = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void AGRequest(log.getBody getbody, String str, String str2) {
        int i2 = getMethod + 23;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        if (getbody.compareTo((Enum) getHeaders()) <= 0) {
            Message message = new Message();
            message.obj = new APIGuard$Callback(getbody, str, str2, System.currentTimeMillis());
            updateKernel.getMethod().sendMessage(message);
            int i4 = getBody + 91;
            getMethod = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
