package com.apiguard3.internal;

import android.view.ViewConfiguration;
import com.a;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public class MT<TaskResult> implements Callable<TaskResult> {
    private static int AGRequest = 1;
    private static int[] getBody = {-1611909256, 761413808, 1003858065, -512113401, -1420750656, -241784680, -1451023263, 943985194, 2018440695, 2028134577, -1568225806, 1868138321, 569550249, 979115931, -345910730, 242678113, 1735965568, -699199921};
    private static int getMethod;
    private String getHeaders;
    private Callable<TaskResult> getUrl;

    static {
        Covode.recordClassIndex(2525);
    }

    public final String getMethod() {
        int i2 = AGRequest;
        int i3 = i2 + 117;
        getMethod = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getHeaders;
        int i5 = i2 + 25;
        getMethod = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // java.util.concurrent.Callable
    public TaskResult call() {
        int i2 = AGRequest + 97;
        getMethod = i2 % 128;
        int i3 = i2 % 2;
        if (APIGuard$InitializationCallback.getBody().getHeaders().compareTo((Enum) log.getBody.getBody) < 0) {
            return this.getUrl.call();
        }
        int i4 = getMethod + 87;
        AGRequest = i4 % 128;
        int i5 = i4 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        TaskResult call = this.getUrl.call();
        long currentTimeMillis2 = System.currentTimeMillis();
        checkCertificates.AGRequest(log.getBody.getBody, getState.getUrl.put, a.a(getUrl(new int[]{-2137464948, -987900132, -1753382050, 1510326168}, 5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new Object[]{this.getHeaders, Long.valueOf(currentTimeMillis2 - currentTimeMillis)}));
        return call;
    }

    public MT(Callable<TaskResult> callable, String str) {
        this.getUrl = callable;
        this.getHeaders = str;
    }

    private static String getUrl(int[] iArr, int i2) {
        int i3 = getMethod + 57;
        AGRequest = i3 % 128;
        int i4 = i3 % 2;
        char[] cArr = new char[4];
        char[] cArr2 = new char[(iArr.length << 1)];
        int[] iArr2 = (int[]) getBody.clone();
        int i5 = getMethod + 35;
        AGRequest = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 0; i7 < iArr.length; i7 += 2) {
            cArr[0] = (char) (iArr[i7] >> 16);
            cArr[1] = (char) iArr[i7];
            int i8 = i7 + 1;
            cArr[2] = (char) (iArr[i8] >> 16);
            cArr[3] = (char) iArr[i8];
            setNextFocusForwardId.getHeaders(cArr, iArr2, false);
            int i9 = i7 << 1;
            cArr2[i9] = cArr[0];
            cArr2[i9 + 1] = cArr[1];
            cArr2[i9 + 2] = cArr[2];
            cArr2[i9 + 3] = cArr[3];
        }
        return new String(cArr2, 0, i2);
    }
}
