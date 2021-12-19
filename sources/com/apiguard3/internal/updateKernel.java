package com.apiguard3.internal;

import android.graphics.Color;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class updateKernel extends HandlerThread {
    private static updateKernel AGRequest;
    private static int addHeader;
    private static Object getBody = new Object();
    private static long getHeaders;
    private static analyzeResponse getMethod;
    private static char[] getUrl;
    private static int newBuilder = 0;

    static void getBody() {
        getUrl = new char[]{'a', 6239, 12316, 18652, 24787};
        getHeaders = -6179361322012370888L;
    }

    static {
        Covode.recordClassIndex(2622);
        addHeader = 1;
        getBody();
        int i2 = newBuilder + 25;
        addHeader = i2 % 128;
        int i3 = i2 % 2;
    }

    public static Handler getMethod() {
        analyzeResponse analyzeresponse;
        MethodCollector.i(1614);
        synchronized (getBody) {
            try {
                if (getMethod == null) {
                    getMethod = new analyzeResponse(AGRequest().getLooper());
                }
                analyzeresponse = getMethod;
            } finally {
                MethodCollector.o(1614);
            }
        }
        return analyzeresponse;
    }

    private static synchronized updateKernel AGRequest() {
        synchronized (updateKernel.class) {
            MethodCollector.i(1613);
            int i2 = newBuilder + 93;
            int i3 = i2 % 128;
            addHeader = i3;
            int i4 = i2 % 2;
            updateKernel updatekernel = AGRequest;
            if (updatekernel == null) {
                updateKernel updatekernel2 = new updateKernel(getHeaders(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, 5 - Color.alpha(0), (char) TextUtils.getOffsetBefore("", 0)).intern());
                AGRequest = updatekernel2;
                updatekernel2.start();
                updateKernel updatekernel3 = AGRequest;
                MethodCollector.o(1613);
                return updatekernel3;
            }
            int i5 = i3 + 109;
            newBuilder = i5 % 128;
            int i6 = i5 % 2;
            MethodCollector.o(1613);
            return updatekernel;
        }
    }

    private updateKernel(String str) {
        super(str);
    }

    private static String getHeaders(int i2, int i3, char c2) {
        int i4 = addHeader + 21;
        int i5 = i4 % 128;
        newBuilder = i5;
        int i6 = i4 % 2;
        char[] cArr = new char[i3];
        int i7 = i5 + 37;
        addHeader = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (i9 < i3) {
            int i10 = addHeader + 31;
            newBuilder = i10 % 128;
            if (i10 % 2 == 0) {
                cArr[i9] = (char) ((int) ((((long) getUrl[i2 + i9]) ^ (((long) i9) * getHeaders)) ^ ((long) c2)));
                i9++;
            } else {
                cArr[i9] = (char) ((int) ((((long) getUrl[i2 >>> i9]) ^ (((long) i9) ^ getHeaders)) * ((long) c2)));
                i9 += 119;
            }
        }
        return new String(cArr);
    }
}
