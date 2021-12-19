package com.apiguard3;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.apiguard3.domain.Config;
import com.apiguard3.internal.checkCertificates;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.apiguard3.internal.onInitializationFailure;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.Callable;

public final class getMethod implements Callable {
    private static char[] AGRequest = {12877, 'N', 49047, 32664, 16267, 65454, 49067, 32663, 16339, 65495, 49096, 32765, 16382, 65531, 48938, 32541, 16135, 65285, 'N', 49047, 32664, 16267, 65454, 49067, 32663, 16339, 65495, 49096, 32765, 16382, 65531, 48990, 32565, 16142, 65284, 48898, 32547, 16144, 65373, 48991, 32593, 16255, 65379, 49010, 38480, 10633, 59782, 43413, 27056, 10677, 59785, 43469, 27081, 10710, 59875, 43488, 27109, 10560, 59691, 43280, 26906, 10524, 59709, 43278, 26947, 10561, 59727, 43361, 27005, 10604, 59586, 43199, 26755, 10403, 59561, 43185, 26797, 10459, 59604, 43209, 26858};
    private static long AGRequest$Builder = 9222674115231793142L;
    private static int newBuilder;
    private static int url = 1;
    private String getBody;
    private final Object getHeaders$6071f473;
    private Object getMethod$59961fb8;
    private final Object getUrl$1cbd8146;

    static {
        Covode.recordClassIndex(2500);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        char c2;
        Config config;
        int i2 = url + 25;
        newBuilder = i2 % 128;
        if (i2 % 2 == 0) {
            c2 = '<';
        } else {
            c2 = '5';
        }
        if (c2 != '<') {
            try {
                config = (Config) ((Class) com.apiguard3.internal.getMethod.AGRequest((char) (-1 - Process.getGidForName("")), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, 2201 - TextUtils.lastIndexOf("", '0'))).getMethod("getBody", null).invoke(this.getHeaders$6071f473, null);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            try {
                config = (Config) ((Class) com.apiguard3.internal.getMethod.AGRequest((char) Color.blue(0), (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) + 39, TextUtils.indexOf("", "", 0, 0) + 2202)).getMethod("getBody", null).invoke(this.getHeaders$6071f473, null);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        this.getBody = config.headers();
        int i3 = newBuilder + 11;
        url = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static String getBody(char c2, int i2, int i3) {
        int i4 = newBuilder + 67;
        url = i4 % 128;
        int i5 = i4 % 2;
        char[] cArr = new char[i2];
        int i6 = 0;
        while (i6 < i2) {
            cArr[i6] = (char) ((int) ((((long) AGRequest[i3 + i6]) ^ (((long) i6) * AGRequest$Builder)) ^ ((long) c2)));
            i6++;
            int i7 = url + 91;
            newBuilder = i7 % 128;
            int i8 = i7 % 2;
        }
        return new String(cArr);
    }

    public getMethod(Object obj, Object obj2, Object obj3) {
        Throwable cause;
        this.getMethod$59961fb8 = obj;
        this.getHeaders$6071f473 = obj2;
        this.getUrl$1cbd8146 = obj3;
        try {
            ((Class) com.apiguard3.internal.getMethod.AGRequest((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 39 - TextUtils.lastIndexOf("", '0', 0), 2202 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("getUrl", Callable.class).invoke(obj2, this);
            try {
                this.getBody = ((Config) ((Class) com.apiguard3.internal.getMethod.AGRequest((char) View.getDefaultSize(0, 0), 'X' - AndroidCharacter.getMirror('0'), AndroidCharacter.getEastAsianWidth('0') + 2198)).getMethod("getBody", null).invoke(obj2, null)).headers();
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
    }

    public final boolean getMethod(Map<String, String> map, String str, byte[] bArr) {
        Throwable cause;
        try {
            boolean booleanValue = ((Boolean) ((Class) com.apiguard3.internal.getMethod.AGRequest((char) View.MeasureSpec.getMode(0), TextUtils.getTrimmedLength("") + 40, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2202)).getMethod("getMethod", String.class).invoke(this.getHeaders$6071f473, str)).booleanValue();
            if (!booleanValue) {
                checkCertificates.getMethod(log.getBody.getBody, getState.getUrl.getUrl);
            } else {
                int i2 = url + 69;
                newBuilder = i2 % 128;
                if (i2 % 2 == 0 ? this.getMethod$59961fb8 != null : this.getMethod$59961fb8 != null) {
                    Object obj = this.getMethod$59961fb8;
                    try {
                        Object[] objArr = new Object[3];
                        objArr[2] = bArr;
                        objArr[1] = str;
                        objArr[0] = map;
                        ((Class) com.apiguard3.internal.getMethod.AGRequest((char) (1921 - ExpandableListView.getPackedPositionType(0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 47, 2367 - Process.getGidForName(""))).getMethod("getHeaders", Map.class, String.class, byte[].class).invoke(obj, objArr);
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th;
                    }
                }
                try {
                    try {
                        String str2 = (String) ((Class) com.apiguard3.internal.getMethod.AGRequest((char) (41088 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 31, Drawable.resolveOpacity(0, 0) + 1582)).getMethod("getMethod", null).invoke(((Class) com.apiguard3.internal.getMethod.AGRequest((char) (41088 - (KeyEvent.getMaxKeyCode() >> 16)), 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1582 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("AGRequest", null).invoke(null, null), null);
                        if (str2 != null) {
                            if (!str2.isEmpty()) {
                                map.put(new StringBuilder().append(this.getBody).append(getBody((char) (12842 - ((Process.getThreadPriority(0) + 20) >> 6)), -TextUtils.lastIndexOf("", '0', 0, 0), 1 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1))).intern()).toString(), str2);
                                int i3 = url + 23;
                                newBuilder = i3 % 128;
                                int i4 = i3 % 2;
                            }
                        }
                        try {
                            checkCertificates.getHeaders(onInitializationFailure.getBody.getBody, getBody((char) ((SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0, 0) + 18, 1 - TextUtils.getOffsetAfter("", 0)).intern(), getBody((char) TextUtils.indexOf("", "", 0), 26 - View.resolveSize(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 18).intern());
                            Object obj2 = this.getUrl$1cbd8146;
                            try {
                                Object[] objArr2 = new Object[2];
                                objArr2[1] = bArr;
                                objArr2[0] = map;
                                ((Class) com.apiguard3.internal.getMethod.AGRequest((char) (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), 44 - Color.red(0), 4156 - AndroidCharacter.getEastAsianWidth('0'))).getMethod("getHeaders", Map.class, byte[].class).invoke(obj2, objArr2);
                                checkCertificates.getHeaders(onInitializationFailure.getBody.AGRequest, getBody((char) TextUtils.indexOf("", "", 0, 0), 21 - AndroidCharacter.getEastAsianWidth('0'), '1' - AndroidCharacter.getMirror('0')).intern(), getBody((char) (((Process.getThreadPriority(0) + 20) >> 6) + 38430), View.MeasureSpec.getSize(0) + 37, 44 - TextUtils.getCapsMode("", 0, 0)).intern());
                            } catch (Throwable th2) {
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th2;
                            }
                        } catch (Throwable unused) {
                            checkCertificates.getMethod(log.getBody.getMethod, getState.getBody.build);
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
            }
            return booleanValue;
        } finally {
            Throwable cause4 = th.getCause();
            if (cause4 != null) {
                throw cause4;
            }
        }
    }
}
