package com.apiguard3.domain;

import android.content.res.Configuration;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.apiguard3.internal.getMethod;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;

public class getUrl extends Exception {
    private static int AGRequest = 1;
    private static int getBody;
    private static int getHeaders = 40;
    final log.getMethod code;

    static {
        Covode.recordClassIndex(2499);
    }

    public getUrl(String str) {
        super(str);
        this.code = getState.getBody.post;
    }

    public getUrl(log.getMethod getmethod) {
        super(getmethod.AGRequest());
        try {
            Object[] objArr = new Object[2];
            objArr[1] = getUrl(!Configuration.needNewResources(0, 0), "\u0005\u0010\u0004￁\u0013\u0006\b\b\u0010￭\u0006", (Process.myPid() >> 22) + 135, (ViewConfiguration.getPressedStateDuration() >> 16) + 11, 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
            objArr[0] = getmethod;
            ((Class) getMethod.AGRequest((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 41, (ViewConfiguration.getPressedStateDuration() >> 16) + 6037)).getMethod("getMethod", Object.class, String.class).invoke(null, objArr);
            this.code = getmethod;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [char[]] */
    /* JADX WARN: Type inference failed for: r6v2 */
    private static String getUrl(boolean z, String str, int i2, int i3, int i4) {
        if (str != 0) {
            int i5 = AGRequest + 47;
            getBody = i5 % 128;
            int i6 = i5 % 2;
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        char[] cArr2 = new char[i3];
        int i7 = 0;
        while (i7 < i3) {
            cArr2[i7] = (char) (cArr[i7] + i2);
            cArr2[i7] = (char) (cArr2[i7] - getHeaders);
            i7++;
            int i8 = AGRequest + 81;
            getBody = i8 % 128;
            int i9 = i8 % 2;
        }
        if (i4 > 0) {
            int i10 = AGRequest + 5;
            getBody = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            int i12 = i3 - i4;
            System.arraycopy(cArr3, 0, cArr2, i12, i4);
            System.arraycopy(cArr3, i4, cArr2, 0, i12);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            int i13 = AGRequest + 65;
            getBody = i13 % 128;
            int i14 = i13 % 2;
            for (int i15 = 0; i15 < i3; i15++) {
                cArr4[i15] = cArr2[(i3 - i15) - 1];
            }
            cArr2 = cArr4;
        }
        return new String(cArr2);
    }
}
