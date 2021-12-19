package com.apiguard3.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.PhoneNumberUtils;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.apiguard3.APIGuard;
import com.apiguard3.BuildConfig;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;

public final class transformRequest implements log {
    private static int AGRequest;
    private static int getMethod = 97;
    private static int newBuilder = 1;
    private log.getBody getBody = log.getBody.getMethod;
    private volatile boolean getHeaders;
    private APIGuard.Callback getUrl;

    static {
        Covode.recordClassIndex(2621);
    }

    @Override // com.apiguard3.internal.log
    public final void getUrl(log.getBody getbody) {
        int i2 = newBuilder + 35;
        AGRequest = i2 % 128;
        int i3 = i2 % 2;
    }

    public transformRequest(APIGuard.Callback callback) {
        this.getUrl = callback;
    }

    @Override // com.apiguard3.internal.log
    public final void getHeaders(APIGuard$Callback aPIGuard$Callback) {
        int i2 = newBuilder + 59;
        AGRequest = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.getUrl == null) {
                return;
            }
        } else if (this.getUrl == null) {
            return;
        }
        if (aPIGuard$Callback.getMethod.compareTo((Enum) this.getBody) <= 0) {
            if (BuildConfig.AGRequest.booleanValue()) {
                int i3 = newBuilder + 3;
                AGRequest = i3 % 128;
                if (i3 % 2 == 0 ? (aPIGuard$Callback instanceof onInitializationFailure) : (aPIGuard$Callback instanceof onInitializationFailure)) {
                    this.getUrl.log(aPIGuard$Callback.toString());
                    return;
                }
            }
            StringBuilder sb = new StringBuilder(getHeaders(TextUtils.isDigitsOnly(""), "\u000e￯\t\u0003￢￼\t\u0011", 159 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (Process.myPid() >> 22) + 8, 4 - Color.alpha(0)).intern());
            String str = aPIGuard$Callback.getBody;
            String str2 = aPIGuard$Callback.AGRequest;
            if (!TextUtils.isEmpty(str)) {
                sb.append(str).append(getHeaders(PhoneNumberUtils.isWellFormedSmsAddress(""), "\u0000", TextUtils.indexOf("", "", 0, 0) + 129, 5 - AndroidCharacter.getEastAsianWidth('0'), 1 - Drawable.resolveOpacity(0, 0)).intern());
            }
            if (!TextUtils.isEmpty(str2) && aPIGuard$Callback.getMethod.compareTo((Enum) log.getBody.getMethod) == 0) {
                sb.append(str2);
            }
            this.getUrl.log(sb.toString());
        }
    }

    private static String getHeaders(boolean z, String str, int i2, int i3, int i4) {
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = new char[i3];
        int i5 = 0;
        while (i5 < i3) {
            cArr3[i5] = (char) (cArr2[i5] + i2);
            cArr3[i5] = (char) (cArr3[i5] - getMethod);
            i5++;
            int i6 = newBuilder + 7;
            AGRequest = i6 % 128;
            int i7 = i6 % 2;
        }
        if (i4 > 0) {
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, 0, cArr4, 0, i3);
            int i8 = i3 - i4;
            System.arraycopy(cArr4, 0, cArr3, i8, i4);
            System.arraycopy(cArr4, i4, cArr3, 0, i8);
        }
        if (z) {
            char[] cArr5 = new char[i3];
            int i9 = 0;
            while (i9 < i3) {
                int i10 = newBuilder + 97;
                AGRequest = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr5[i9] = cArr3[(i3 - i9) - 1];
                    i9++;
                } else {
                    cArr5[i9] = cArr3[(i3 >> i9) + 0];
                    i9 += 124;
                }
            }
            int i11 = newBuilder + 73;
            AGRequest = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr5;
        }
        return new String(cArr3);
    }
}
