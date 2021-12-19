package com.apiguard3.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;
import java.util.List;

public final class setFocusable {
    private static int AGRequest;
    private static char getBody = 12656;
    private static char[] getHeaders = {'c', 204, 206, 208, 213, 209, 203, 174, 173, 206, 211, 214, 209, 206, 214, 182, 157, 190, 211, 214, 209, 211, 219, ']', 180, 175, 173, 176, 176, 160, 162, 175, 173, 175, 176, 171, 161, 171, 181, 175, '3', 'f', 'l', 'c', 'f', 'v', 's', 'l', 'i', '`', '\\', 'k', 't', 'o', 'f', 'd', 24, ';', 'M', 23, 'E', '\\', '+', 'D', ';', '8', 'n', 'F', 'F', 'j', 'n', 's', 'J', 'H', 'h', 'b', 'g', 'f', 'd', 'f', 'l', 5, '0', 'f', 'g', 'b', 'h', 'U', 'O', 'f'};
    private static int getMethod = 1;
    private static int getUrl = 0;
    private static int url = 1;

    static {
        Covode.recordClassIndex(2590);
        AGRequest = 0;
        AGRequest = 54;
    }

    private static Object com_apiguard3_internal_setFocusable_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_apiguard3_internal_setFocusable_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_apiguard3_internal_setFocusable_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static int getHeaders(Context context) {
        int i2 = getUrl;
        int i3 = (i2 & 37) + (i2 | 37);
        getMethod = i3 % 128;
        int i4 = i3 % 2;
        int method = getBody(context, 17).getMethod();
        int i5 = AGRequest;
        int i6 = i5 + 21;
        url = i6 % 128;
        int i7 = i6 % 2;
        int i8 = getMethod + 11;
        getUrl = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = i5 + 117;
            url = i9 % 128;
            int i10 = i9 % 2;
        }
        return method;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0092 A[Catch:{ IOException -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized boolean getMethod(java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 465
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFocusable.getMethod(java.lang.String):boolean");
    }

    private static setSaveEnabled getBody(Context context, int i2) {
        Throwable cause;
        int i3 = AGRequest + 63;
        url = i3 % 128;
        int i4 = i3 % 2;
        try {
            Class<?> cls = Class.forName(getBody("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{0, 23, 101, 0}, false));
            int i5 = -(ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1));
            String str = (String) com_apiguard3_internal_setFocusable_java_lang_reflect_Method_invoke(cls.getMethod(getBody("\u0000\u0000\u0000\u0000", (char) ((i5 ^ 60410) + ((i5 & 60410) << 1)), ViewConfiguration.getWindowTouchSlop() >> 8, "㒸ⲻ쉘깡躅앏弭㺞봚ᡮ톸錚㯔", "挖煞易ያ"), null), context, null);
            int i6 = getUrl;
            int i7 = (i6 & 99) + (i6 | 99);
            getMethod = i7 % 128;
            int i8 = i7 % 2;
            try {
                com_apiguard3_internal_setFocusable_java_lang_reflect_Method_invoke(Class.forName(getBody("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{0, 23, 101, 0}, false)).getMethod(getBody("\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{23, 17, 73, 0}, true), null), context, null);
                int i9 = getUrl;
                int i10 = ((i9 | 17) << 1) - (i9 ^ 17);
                getMethod = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Class<?> cls2 = Class.forName(getBody("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{0, 23, 101, 0}, false));
                    int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1));
                    ApplicationInfo applicationInfo = (ApplicationInfo) com_apiguard3_internal_setFocusable_java_lang_reflect_Method_invoke(cls2.getMethod(getBody("\u0000\u0000\u0000\u0000", (char) (((i12 | 5047) << 1) - (i12 ^ 5047)), ViewConfiguration.getDoubleTapTimeout() >> 16, "圏㢗僿럍䥙䔓衿냌쵐傜겆ꌽ풳뗛忙?", "㼥띠"), null), context, null);
                    if (Build.VERSION.SDK_INT > 22) {
                        int i13 = (getUrl + 64) - 1;
                        getMethod = i13 % 128;
                        int i14 = i13 % 2;
                        char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)));
                        int i15 = -Process.getGidForName("");
                        String body = getBody("\u0000\u0000\u0000\u0000", c2, (i15 ^ -1) + ((i15 & -1) << 1), "꽛銊렾", "ࣷ療絠");
                        int i16 = AGRequest + 59;
                        url = i16 % 128;
                        int i17 = i16 % 2;
                        try {
                            ActivityManager activityManager = (ActivityManager) com_apiguard3_internal_setFocusable_java_lang_reflect_Method_invoke(Class.forName(getBody("\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{0, 23, 101, 0}, false)).getMethod(getBody("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000", new int[]{40, 16, 0, 0}, false), String.class), context, new Object[]{body});
                            if (activityManager != null) {
                                int i18 = getMethod;
                                int i19 = (i18 ^ 75) + ((i18 & 75) << 1);
                                getUrl = i19 % 128;
                                int i20 = i19 % 2;
                                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                                if (runningAppProcesses != null) {
                                    int i21 = getUrl;
                                    int i22 = (i21 & 93) + (i21 | 93);
                                    getMethod = i22 % 128;
                                    int i23 = i22 % 2;
                                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                        int i24 = getUrl;
                                        int i25 = (i24 & 87) + (i24 | 87);
                                        getMethod = i25 % 128;
                                        int i26 = i25 % 2;
                                        String str2 = runningAppProcessInfo.processName;
                                        int i27 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                        char c3 = (char) ((i27 ^ 37442) + ((37442 & i27) << 1));
                                        int i28 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                        if (str2.contains(getBody("\u0000\u0000\u0000\u0000", c3, ((i28 | 682493815) << 1) - (682493815 ^ i28), "飵", "眰긇䈨龒"))) {
                                            int i29 = url + 35;
                                            AGRequest = i29 % 128;
                                            int i30 = i29 % 2;
                                        } else {
                                            int i31 = url + 121;
                                            AGRequest = i31 % 128;
                                            if (i31 % 2 == 0) {
                                                continue;
                                                int i32 = getMethod;
                                                int i33 = (i32 ^ 93) + ((i32 & 93) << 1);
                                                getUrl = i33 % 128;
                                                int i34 = i33 % 2;
                                            }
                                        }
                                        if (!runningAppProcessInfo.processName.startsWith(str)) {
                                            getBody("\u0001\u0000\u0001", new int[]{56, 3, 0, 0}, true);
                                            String str3 = runningAppProcessInfo.processName;
                                            setSaveEnabled setsaveenabled = new setSaveEnabled(17, 27);
                                            int i35 = getMethod;
                                            int i36 = (i35 & 105) + (i35 | 105);
                                            getUrl = i36 % 128;
                                            int i37 = i36 % 2;
                                            return setsaveenabled;
                                        }
                                        int i322 = getMethod;
                                        int i332 = (i322 ^ 93) + ((i322 & 93) << 1);
                                        getUrl = i332 % 128;
                                        int i342 = i332 % 2;
                                    }
                                } else {
                                    int i38 = url + 117;
                                    AGRequest = i38 % 128;
                                    int i39 = i38 % 2;
                                }
                            }
                        } catch (Throwable th) {
                            if (cause != null) {
                                int i40 = url + 63;
                                AGRequest = i40 % 128;
                                if (i40 % 2 == 0) {
                                    throw cause;
                                }
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    int indexOf = applicationInfo.dataDir.indexOf(str);
                    if (indexOf > 0) {
                        int i41 = url + 73;
                        AGRequest = i41 % 128;
                        int i42 = i41 % 2;
                        int i43 = getUrl + 61;
                        getMethod = i43 % 128;
                        int i44 = i43 % 2;
                        String substring = applicationInfo.dataDir.substring(0, indexOf);
                        int i45 = -(-TextUtils.lastIndexOf("", '0'));
                        int i46 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                        String[] split = substring.split(getBody("\u0000\u0000\u0000\u0000", (char) (((i45 | 34758) << 1) - (34758 ^ i45)), ((i46 | -679009247) << 1) - (-679009247 ^ i46), "䢔", "↜蜤엗ょ"));
                        int length = split.length;
                        for (int i47 = 0; i47 < length; i47 = (i47 | 1) + (i47 & 1)) {
                            int i48 = getMethod;
                            int i49 = (i48 ^ 75) + ((i48 & 75) << 1);
                            getUrl = i49 % 128;
                            int i50 = i49 % 2;
                            String str4 = split[i47];
                            if (str4.split(getBody("\u0000\u0001\u0000", new int[]{59, 3, 0, 2}, false)).length > 1 && getMethod(str4)) {
                                int i51 = AGRequest + 17;
                                url = i51 % 128;
                                int i52 = i51 % 2;
                                getBody("\u0000\u0000\u0001", new int[]{62, 3, 0, 1}, true);
                                String str5 = applicationInfo.dataDir;
                                setSaveEnabled setsaveenabled2 = new setSaveEnabled(17, 5);
                                int i53 = getMethod + 95;
                                getUrl = i53 % 128;
                                int i54 = i53 % 2;
                                return setsaveenabled2;
                            }
                        }
                    }
                    setSaveEnabled setsaveenabled3 = new setSaveEnabled(17, 17);
                    int i55 = getUrl;
                    int i56 = (i55 ^ 123) + ((i55 & 123) << 1);
                    getMethod = i56 % 128;
                    int i57 = i56 % 2;
                    return setsaveenabled3;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        int i58 = AGRequest + 41;
                        url = i58 % 128;
                        if (i58 % 2 != 0) {
                            throw cause2;
                        }
                        throw new NullPointerException("hashCode");
                    }
                    throw th2;
                }
            } finally {
                cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                int i59 = url + 73;
                AGRequest = i59 % 128;
                if (i59 % 2 == 0) {
                    throw cause3;
                }
                throw new NullPointerException("hashCode");
            }
            throw th3;
        }
    }

    private static String getBody(String str, int[] iArr, boolean z) {
        char c2;
        int i2;
        int i3 = getUrl + 97;
        getMethod = i3 % 128;
        int i4 = i3 % 2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        int i5 = url + 89;
        AGRequest = i5 % 128;
        int i6 = i5 % 2;
        int i7 = getUrl + 61;
        getMethod = i7 % 128;
        int i8 = i7 % 2;
        int i9 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        char[] cArr = new char[i10];
        System.arraycopy(getHeaders, i9, cArr, 0, i10);
        if (bytes != null) {
            int i13 = AGRequest + 43;
            url = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = getUrl % 122;
                getMethod = i14 << 8513;
                int i15 = i14 % 4;
            } else {
                int i16 = getUrl + 51;
                getMethod = i16 % 128;
                int i17 = i16 % 2;
            }
            char[] cArr2 = new char[i10];
            int i18 = 0;
            char c3 = 0;
            while (i18 < i10) {
                if (bytes[i18] == 1) {
                    cArr2[i18] = (char) (((cArr[i18] << 1) + 1) - c3);
                } else {
                    cArr2[i18] = (char) ((cArr[i18] << 1) - c3);
                }
                c3 = cArr2[i18];
                i18++;
                int i19 = url + 39;
                AGRequest = i19 % 128;
                int i20 = i19 % 2;
            }
            int i21 = AGRequest + 31;
            url = i21 % 128;
            int i22 = i21 % 2;
            cArr = cArr2;
        }
        if (i12 > 0) {
            char[] cArr3 = new char[i10];
            System.arraycopy(cArr, 0, cArr3, 0, i10);
            int i23 = i10 - i12;
            System.arraycopy(cArr3, 0, cArr, i23, i12);
            System.arraycopy(cArr3, i12, cArr, 0, i23);
        }
        if (z) {
            c2 = '6';
        } else {
            c2 = 6;
        }
        if (c2 != 6) {
            int i24 = getUrl + 15;
            getMethod = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = url + 51;
                AGRequest = i25 % 128;
                int i26 = i25 % 2;
            } else {
                int i27 = AGRequest + 19;
                url = i27 % 128;
                if (i27 % 2 == 0) {
                }
            }
            char[] cArr4 = new char[i10];
            for (int i28 = 0; i28 < i10; i28++) {
                int i29 = url + 3;
                AGRequest = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = getUrl + 35;
                    getMethod = i30 % 128;
                    int i31 = i30 % 2;
                } else {
                    int i32 = getUrl << 5;
                    getMethod = i32 >>> 16068;
                    int i33 = i32 / 4;
                }
                cArr4[i28] = cArr[(i10 - i28) - 1];
            }
            int i34 = AGRequest + 89;
            url = i34 % 128;
            int i35 = i34 % 2;
            cArr = cArr4;
        }
        if (i11 > 0) {
            int i36 = getUrl + 35;
            getMethod = i36 % 128;
            if (i36 % 2 == 0) {
                int i37 = AGRequest + 13;
                url = i37 % 128;
                int i38 = i37 % 2;
                i2 = 1;
            } else {
                i2 = 0;
            }
            while (i2 < i10) {
                int i39 = getMethod + 105;
                getUrl = i39 % 128;
                if (i39 % 2 != 0) {
                    cArr[i2] = (char) (cArr[i2] * iArr[3]);
                    i2 += 22;
                } else {
                    cArr[i2] = (char) (cArr[i2] - iArr[2]);
                    i2++;
                }
            }
        } else {
            int i40 = url + 107;
            AGRequest = i40 % 128;
            int i41 = i40 % 2;
        }
        return new String(cArr);
    }

    private static String getBody(String str, char c2, int i2, String str2, String str3) {
        int i3 = getMethod + 77;
        getUrl = i3 % 128;
        int i4 = i3 % 2;
        char[] charArray = str3.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int i5 = url + 31;
        AGRequest = i5 % 128;
        int i6 = i5 % 2;
        char[] charArray3 = str.toCharArray();
        char[] cArr = (char[]) charArray.clone();
        char[] cArr2 = (char[]) charArray3.clone();
        cArr[0] = (char) (c2 ^ cArr[0]);
        cArr2[2] = (char) (cArr2[2] + ((char) i2));
        int length = charArray2.length;
        char[] cArr3 = new char[length];
        int i7 = 0;
        while (i7 < length) {
            int i8 = getUrl + 47;
            getMethod = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = url + 35;
                AGRequest = i9 % 128;
                int i10 = i9 % 2;
                setSystemGestureExclusionRects.AGRequest(cArr, cArr2, i7);
                cArr3[i7] = (char) ((int) ((((long) (charArray2[i7] | cArr[(i7 << 3) >>> 5])) / 0) * ((long) getBody)));
                i7 += 16;
            } else {
                setSystemGestureExclusionRects.AGRequest(cArr, cArr2, i7);
                cArr3[i7] = (char) ((int) (((long) (charArray2[i7] ^ cArr[(i7 + 3) % 4])) ^ ((long) getBody)));
                i7++;
            }
        }
        int i11 = AGRequest + 49;
        url = i11 % 128;
        int i12 = i11 % 2;
        return new String(cArr3);
    }
}
