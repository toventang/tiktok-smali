package com.apiguard3.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.apiguard3.internal.setAutofillHints;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Method;

public final class setFitsSystemWindows {
    private static long AGRequest = 1899116760244099636L;
    private static int AGRequest$Builder;
    private static int getBody = 5;
    private static int getHeaders = 0;
    private static int getMethod = 0;
    private static int getUrl;
    private static int newBuilder = 1;

    private static Object com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(2589);
        AGRequest$Builder = 0;
        getUrl = 1;
        getUrl = 5;
        AGRequest$Builder = 12;
    }

    public static int getUrl() {
        int i2 = newBuilder + 25;
        AGRequest$Builder = i2 % 128;
        int i3 = i2 % 2;
        int i4 = getHeaders;
        int i5 = (i4 & 49) + (i4 | 49);
        getUrl = i5 % 128;
        int i6 = i5 % 2;
        int method = getHeaders(17).getMethod();
        int i7 = (getUrl + 60) - 1;
        getHeaders = i7 % 128;
        if (i7 % 2 != 0) {
            throw new NullPointerException("hashCode");
        }
        int i8 = AGRequest$Builder + 19;
        int i9 = i8 % 128;
        newBuilder = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 91;
        AGRequest$Builder = i11 % 128;
        int i12 = i11 % 2;
        return method;
    }

    public static int getMethod(Context context) {
        int i2 = (getHeaders + 42) - 1;
        getUrl = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = AGRequest$Builder + 9;
            newBuilder = i3 % 128;
            int i4 = i3 % 2;
        }
        int method = getHeaders(context, 17).getMethod();
        int i5 = getUrl;
        int i6 = (i5 & 29) + (i5 | 29);
        getHeaders = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = AGRequest$Builder + 21;
            int i8 = i7 % 128;
            newBuilder = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 75;
            AGRequest$Builder = i10 % 128;
            int i11 = i10 % 2;
        }
        return method;
    }

    private static String getBody(String str) {
        int i2 = getHeaders + 111;
        getUrl = i2 % 128;
        int i3 = i2 % 2;
        char[] charArray = str.toCharArray();
        int i4 = getHeaders + 41;
        getUrl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = AGRequest$Builder + 19;
            newBuilder = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = newBuilder + 31;
            AGRequest$Builder = i7 % 128;
            int i8 = i7 % 2;
        }
        char[] body = setSystemGestureExclusionRects.getBody(AGRequest, charArray);
        int i9 = 4;
        while (i9 < body.length) {
            int i10 = getUrl + 41;
            int i11 = i10 % 128;
            getHeaders = i11;
            int i12 = i10 % 2;
            body[i9] = (char) ((int) (((long) (body[i9] ^ body[i9 % 4])) ^ (((long) (i9 - 4)) * AGRequest)));
            i9++;
            int i13 = AGRequest$Builder + 61;
            int i14 = i13 % 128;
            newBuilder = i14;
            int i15 = i13 % 2;
            int i16 = i11 + 71;
            getUrl = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = i14 + 25;
                AGRequest$Builder = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        int i19 = AGRequest$Builder + 87;
        newBuilder = i19 % 128;
        int i20 = i19 % 2;
        return new String(body, 4, body.length - 4);
    }

    public static int getUrl(Context context) {
        char c2;
        int i2 = newBuilder;
        int i3 = i2 + 27;
        int i4 = i3 % 128;
        AGRequest$Builder = i4;
        int i5 = i3 % 2;
        int i6 = getUrl;
        int i7 = (i6 & 115) + (i6 | 115);
        getHeaders = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = i4 + 77;
            newBuilder = i8 % 128;
            int i9 = i8 % 2;
            c2 = '1';
        } else {
            int i10 = i2 + 123;
            AGRequest$Builder = i10 % 128;
            if (i10 % 2 == 0) {
                c2 = '.';
            } else {
                c2 = '%';
            }
        }
        if (c2 == '.') {
            return getBody(context, 17).getMethod();
        }
        getBody(context, 17).getMethod();
        throw new NullPointerException("hashCode");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0109, code lost:
        if (r4 == null) goto L_0x010b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.apiguard3.internal.setWillNotDraw getHeaders(int r10) {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFitsSystemWindows.getHeaders(int):com.apiguard3.internal.setWillNotDraw");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007f, code lost:
        if (r6.canRead() == false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getUrl(com.apiguard3.internal.setAutofillHints.getBody r10) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFitsSystemWindows.getUrl(com.apiguard3.internal.setAutofillHints$getBody):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ce, code lost:
        if (r6 != null) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean AGRequest(com.apiguard3.internal.setAutofillHints.getBody r14) {
        /*
        // Method dump skipped, instructions count: 388
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFitsSystemWindows.AGRequest(com.apiguard3.internal.setAutofillHints$getBody):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getBody(com.apiguard3.internal.setAutofillHints.getBody r16) {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFitsSystemWindows.getBody(com.apiguard3.internal.setAutofillHints$getBody):java.lang.String");
    }

    private static boolean getHeaders(setAutofillHints.getBody getbody) {
        char c2;
        char c3;
        MethodCollector.i(2250);
        int i2 = getHeaders + 99;
        getUrl = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = AGRequest$Builder + 63;
            newBuilder = i3 % 128;
            int i4 = i3 % 2;
        }
        try {
            int scrollDefaultDelay = 4 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i5 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int i6 = ((i5 | 103) << 1) - (i5 ^ 103);
            int defaultSize = View.getDefaultSize(0, 0);
            File file = (File) setAutofillHints.AGRequest(File.class, new Class[]{String.class}, new Object[]{AGRequest(scrollDefaultDelay, "\u0000\n\u0003\u0002ￍ\u000e\u0010\r\u0001ￍ\u0011\u0017\u0011ￍ\t\u0003\u0010\f\u0003\nￍ\u0004\u0012\u0010￿\u0001\u0003�\u0003\f￿", i6, ((defaultSize | 31) << 1) - (defaultSize ^ 31), false)}, getbody);
            if (!file.canRead()) {
                c2 = 24;
            } else {
                c2 = 'X';
            }
            if (c2 != 24) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String readLine = bufferedReader.readLine();
                    int i7 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                    int i8 = (i7 ^ 15) + ((i7 & 15) << 1);
                    int i9 = -TextUtils.indexOf("", "");
                    int i10 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1));
                    AGRequest(i8, "ￅ\t\n\u0011\u0007\u0006\u0013\n\u0004\n\b\u0006\u0017\u0019\u000bￅ￟", (i9 & 96) + (i9 | 96), (i10 & 16) + (i10 | 16), true);
                    if (readLine.equals(getBody("笄笵环콺ᓢ"))) {
                        int i11 = getHeaders + 63;
                        getUrl = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i12 = newBuilder + 15;
                            AGRequest$Builder = i12 % 128;
                            int i13 = i12 % 2;
                            return true;
                        }
                        bufferedReader.close();
                        MethodCollector.o(2250);
                        return true;
                    }
                    bufferedReader.close();
                    int i14 = AGRequest$Builder;
                    int i15 = i14 + 9;
                    newBuilder = i15 % 128;
                    int i16 = i15 % 2;
                    int i17 = getHeaders;
                    int i18 = (i17 & 1) + (i17 | 1);
                    getUrl = i18 % 128;
                    if (i18 % 2 == 0) {
                        try {
                            throw new NullPointerException("hashCode");
                        } catch (Throwable th) {
                            MethodCollector.o(2250);
                            throw th;
                        }
                    } else {
                        int i19 = i14 + 29;
                        newBuilder = i19 % 128;
                        int i20 = i19 % 2;
                        MethodCollector.o(2250);
                        return false;
                    }
                } finally {
                    bufferedReader.close();
                    MethodCollector.o(2250);
                }
            } else {
                int i21 = (getHeaders + 24) - 1;
                getUrl = i21 % 128;
                if (i21 % 2 == 0) {
                    c3 = '8';
                } else {
                    c3 = 'K';
                }
                if (c3 != '8') {
                    int i22 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int i23 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                    AGRequest((i22 ^ 1) + ((i22 & 1) << 1), "ￆ￬\u000f\u0012\u000bￆ\u0014\u0015\u001aￆ\u0018\u000b\u0007\n\u0007\b\u0012\u000b", (94 - ((-TextUtils.lastIndexOf("", '0')) ^ -1)) - 1, ((i23 | 18) << 1) - (i23 ^ 18), false);
                } else {
                    AGRequest(0 >>> (PointF.length(1.0f, 1.0f) > 2.0f ? 1 : (PointF.length(1.0f, 1.0f) == 2.0f ? 0 : -1)), "ￆ￬\u000f\u0012\u000bￆ\u0014\u0015\u001aￆ\u0018\u000b\u0007\n\u0007\b\u0012\u000b", 48 << TextUtils.lastIndexOf("", 'E'), (ViewConfiguration.getLongPressTimeout() / 116) * 103, false);
                }
                file.getAbsolutePath();
                int i24 = getHeaders;
                int i25 = (i24 & 67) + (i24 | 67);
                getUrl = i25 % 128;
                if (i25 % 2 == 0) {
                    int i26 = newBuilder + 21;
                    AGRequest$Builder = i26 % 128;
                    if (i26 % 2 == 0) {
                        try {
                            throw new NullPointerException("hashCode");
                        } catch (Throwable th2) {
                            MethodCollector.o(2250);
                            throw th2;
                        }
                    }
                }
                MethodCollector.o(2250);
                return false;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r1 >>> 4) == 0) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if ((r1 % 2) != 0) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r1 = 29;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean AGRequest(android.content.Context r6, com.apiguard3.internal.setAutofillHints.getBody r7) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFitsSystemWindows.AGRequest(android.content.Context, com.apiguard3.internal.setAutofillHints$getBody):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fc, code lost:
        if ((r1 % 2) != 0) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.apiguard3.internal.setWillNotDraw getBody(android.content.Context r13, int r14) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFitsSystemWindows.getBody(android.content.Context, int):com.apiguard3.internal.setWillNotDraw");
    }

    private static setWillNotDraw getHeaders(Context context, int i2) {
        Throwable cause;
        int i3;
        MethodCollector.i(2617);
        try {
            Object[] objArr = new Object[2];
            int i4 = -View.getDefaultSize(0, 0);
            int i5 = (i4 ^ 12) + ((i4 & 12) << 1);
            int i6 = -(SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1));
            int i7 = ((i6 | 91) << 1) - (i6 ^ 91);
            int i8 = -TextUtils.getTrimmedLength("");
            try {
                Object[] objArr2 = {AGRequest(i5, "￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮￨\u0000￾￮￹￨￬\u0019\u000f\u001d\u001a\u0014\u000fￋ￯\u0010\r \u0012ￗ￺￨", i7, ((i8 | 31) << 1) - (i8 ^ 31), false)};
                int i9 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i10 = 16;
                objArr[0] = Class.forName(AGRequest((30 - (Drawable.resolveOpacity(0, 0) ^ -1)) - 1, "\b\u001a\u0017\u000e\u0019\u001eￓ\u0006\u001a\u0019\rￓ\u001dￚￕￕￓ�ￚￕￕ￵\u0017\u000e\u0013\b\u000e\u0015\u0006\u0011\u000f\u0006\u001b\u0006\u001dￓ\u0018\n", ((i9 | 96) << 1) - (i9 ^ 96), (38 - ((-(ViewConfiguration.getMaximumFlingVelocity() >> 16)) ^ -1)) - 1, false)).getDeclaredConstructor(String.class).newInstance(objArr2);
                int i11 = -(SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1));
                try {
                    Object[] objArr3 = {AGRequest((i11 ^ 12) + ((i11 & 12) << 1), "\u000f\u001d\u001a\u0014\u000fￋ￯\u0010\r \u0012￮￨\u0000￾ￗ￺￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮￹￨￬\u0019", View.resolveSize(0, 0) + 90, (32 - (TextUtils.indexOf((CharSequence) "", '0') ^ -1)) - 1, false)};
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 30;
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                    objArr[1] = Class.forName(AGRequest(pressedStateDuration, "\b\u001a\u0017\u000e\u0019\u001eￓ\u0006\u001a\u0019\rￓ\u001dￚￕￕￓ�ￚￕￕ￵\u0017\u000e\u0013\b\u000e\u0015\u0006\u0011\u000f\u0006\u001b\u0006\u001dￓ\u0018\n", (bitsPerPixel & 97) + (bitsPerPixel | 97), (39 - ((-(SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1))) ^ -1)) - 1, false)).getDeclaredConstructor(String.class).newInstance(objArr3);
                    try {
                        int i12 = (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1));
                        int i13 = (i12 ^ 11) + ((i12 & 11) << 1);
                        int i14 = -TextUtils.getCapsMode("", 0, 0);
                        int i15 = (i14 ^ 106) + ((i14 & 106) << 1);
                        int i16 = -Process.getGidForName("");
                        Class<?> cls = Class.forName(AGRequest(i13, "\u000f\t\n￾￉￿\u0004\n\r￿\t￼\u000f\u0013\u0000\u000f\t\n￞￉\u000f\t\u0000", i15, (i16 & 22) + (i16 | 22), true));
                        int i17 = -TextUtils.indexOf("", "", 0, 0);
                        int i18 = (i17 ^ 9) + ((i17 & 9) << 1);
                        int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                        Object com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke = com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke(cls.getMethod(AGRequest(i18, "\u0003\u0001￩�\n�\u0003\u0001\u000e\u0003\u0001\u0010￬�￿\u0007�", (fadingEdgeLength & 105) + (fadingEdgeLength | 105), AndroidCharacter.getMirror('0') - 31, false), null), context, null);
                        try {
                            int i19 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            Object com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke2 = com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke(Class.forName(AGRequest((13 - (ImageFormat.getBitsPerPixel(0) ^ -1)) - 1, "\u000f\t\n￾￉￿\u0004\n\r￿\t￼\u000f\u0013\u0000\u000f\t\n￞￉\u000f\t\u0000", (106 - ((-(ViewConfiguration.getWindowTouchSlop() >> 8)) ^ -1)) - 1, ((i19 | 23) << 1) - (i19 ^ 23), true)).getMethod(AGRequest((12 - (Color.argb(0, 0, 0, 0) ^ -1)) - 1, "￾￫\u0002\u0004￾\b\u0000￾￭\u0011\u0002\u0004\u0002\n", View.getDefaultSize(0, 0) + 104, (15 - (TextUtils.indexOf((CharSequence) "", '0') ^ -1)) - 1, true), null), context, null);
                            try {
                                Object[] objArr4 = new Object[2];
                                objArr4[1] = 64;
                                objArr4[0] = com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke2;
                                Object[] objArr5 = (Object[]) Class.forName(getBody("榚ぉ槻挈⨓圄釦ń꥾?쩘桊렸솨兢｀叮给㦨嘪쫋霊肂⺄斊ఴ᜗藅ᵼꕢ︅ᰚ됭?")).getField(getBody("こٛ〠秋ᰆ䷄?墑齶雯킉⇱")).get(com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke(Class.forName(getBody("噿녰嘞㚉ꬪʅᴿ㺡⡇发鿙蟝䂑ӣ玙氋￠氩?ᘳ픃ꉝ婯贍䊖ज⊙⑛ꮀ郌诀岯ჺ翸წ")).getMethod(getBody("燨퀮熏绋쩿䫗祴᤾䤘㞸힄肵ꁈ⇎䲖៪䮙麴"), String.class, Integer.TYPE), com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke, objArr4));
                                int length = objArr5.length;
                                int i20 = 0;
                                while (i20 < length) {
                                    Object obj = objArr5[i20];
                                    try {
                                        Object com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke3 = com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke(Class.forName(getBody("ꏶරꎜ俩៮篷?쭢钙逢✭牉ﱈ綖끪馕䍤ᕌ᥋®ꫮ걱憽꿩㇘㯻쫧휚颓틜匿繘榩및眮ŰՌವ")).getMethod(getBody("៭짣ដ펲?䵺缴僅ί䊯뒢완㠅?"), String.class), null, new Object[]{getBody("씰쪝앨碾킇䳣㥡궁矍")});
                                        try {
                                            try {
                                                Object com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke4 = com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke(Class.forName(getBody("ꏶරꎜ俩៮篷?쭢钙逢✭牉ﱈ綖끪馕䍤ᕌ᥋®ꫮ걱憽꿩㇘㯻쫧휚颓틜匿繘榩및眮ŰՌವ")).getMethod(getBody("蜣蝄潣孥ℾ漌濇옩?嚧ߘ崟侏뵝뢫㗔⑥兩貨"), InputStream.class), com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke3, new Object[]{new ByteArrayInputStream((byte[]) com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke(Class.forName(getBody("꽔軷꼵ǁ钭㗍⇶잊ៀ漘ꢑ?绶编㎫佐锠쁧孡అ⦴麗ꍌ늎痛㗕?ᯌ鳷각")).getMethod(getBody("弃쇐彷좝?ﲷ㟓壪ꅧ懎ᙹ躥〾陼"), null), obj, null))});
                                                int i21 = 0;
                                                do {
                                                    Object obj2 = objArr[i21];
                                                    try {
                                                        int i22 = -(-TextUtils.lastIndexOf("", '0', 0, 0));
                                                        if (obj2.equals(com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke(Class.forName(AGRequest((21 - ((-(ViewConfiguration.getMinimumFlingVelocity() >> i10)) ^ -1)) - 1, "ￏ\u0004\u0006\u0013\u0015ￏ￹ￖ￑ￚ￤\u0006\u0013\u0015\n\u0007\n\u0004\u0002\u0015\u0006\u000b\u0002\u0017\u0002ￏ\u0014\u0006\u0004\u0016\u0013\n\u0015\u001a", ((i22 | 101) << 1) - (i22 ^ 101), 34 - (ViewConfiguration.getTouchSlop() >> 8), false)).getMethod(getBody("軗￳躰㍃ݟꠚ曄騍凜彳ขď웜듰넶槗澫⶙墸킔ᝠ苐쎇䝋"), null), com_apiguard3_internal_setFitsSystemWindows_java_lang_reflect_Method_invoke4, null))) {
                                                            setWillNotDraw setwillnotdraw = new setWillNotDraw(17, 16);
                                                            MethodCollector.o(2617);
                                                            return setwillnotdraw;
                                                        }
                                                        i21 = (i21 | 1) + (i21 & 1);
                                                        i10 = 16;
                                                    } catch (Throwable th) {
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        MethodCollector.o(i3);
                                                        throw th;
                                                    }
                                                } while (i21 < 2);
                                                int i23 = (i20 ^ 51) + ((i20 & 51) << 1);
                                                i20 = ((i23 | -50) << 1) - (i23 ^ -50);
                                                i10 = 16;
                                            } finally {
                                                cause = th.getCause();
                                                i3 = 2617;
                                                if (cause != null) {
                                                    MethodCollector.o(i3);
                                                    throw cause;
                                                }
                                                MethodCollector.o(i3);
                                            }
                                        } finally {
                                            Throwable cause2 = th.getCause();
                                            int i24 = 2617;
                                            if (cause2 != null) {
                                                MethodCollector.o(i24);
                                                throw cause2;
                                            }
                                            MethodCollector.o(i24);
                                        }
                                    } finally {
                                        Throwable cause3 = th.getCause();
                                        int i25 = 2617;
                                        if (cause3 != null) {
                                            MethodCollector.o(i25);
                                            throw cause3;
                                        }
                                        MethodCollector.o(i25);
                                    }
                                }
                                setWillNotDraw setwillnotdraw2 = new setWillNotDraw(17, 17);
                                MethodCollector.o(2617);
                                return setwillnotdraw2;
                            } finally {
                                Throwable cause4 = th.getCause();
                                int i26 = 2617;
                                if (cause4 != null) {
                                    MethodCollector.o(i26);
                                    throw cause4;
                                }
                                MethodCollector.o(i26);
                            }
                        } finally {
                            Throwable cause5 = th.getCause();
                            int i27 = 2617;
                            if (cause5 != null) {
                                MethodCollector.o(i27);
                                throw cause5;
                            }
                            MethodCollector.o(i27);
                        }
                    } finally {
                        Throwable cause6 = th.getCause();
                        int i28 = 2617;
                        if (cause6 != null) {
                            MethodCollector.o(i28);
                            throw cause6;
                        }
                        MethodCollector.o(i28);
                    }
                } finally {
                    Throwable cause7 = th.getCause();
                    int i29 = 2617;
                    if (cause7 != null) {
                        MethodCollector.o(i29);
                        throw cause7;
                    }
                    MethodCollector.o(i29);
                }
            } finally {
                Throwable cause8 = th.getCause();
                int i30 = 2617;
                if (cause8 != null) {
                    MethodCollector.o(i30);
                    throw cause8;
                }
                MethodCollector.o(i30);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AGRequest(int r9, java.lang.String r10, int r11, int r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.setFitsSystemWindows.AGRequest(int, java.lang.String, int, int, boolean):java.lang.String");
    }
}
