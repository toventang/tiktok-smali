package com.bytedance.ugc.glue;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;

public class UGCTools {
    public static final Handler mainHandler = new Handler(Looper.getMainLooper());

    public static float getPxFByDp(float f2) {
        return f2 * 2.0f;
    }

    public static float getPxFBySp(float f2) {
        return f2 * 2.0f;
    }

    public static boolean isTest() {
        return false;
    }

    public static int round(double d2) {
        return (int) (d2 + 0.5d);
    }

    static {
        Covode.recordClassIndex(27934);
    }

    public static Bundle com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getColor(int i2) {
        return getColor(null, i2);
    }

    public static Drawable getDrawable(int i2) {
        return getDrawable(null, i2);
    }

    public static float getPixelByDp(float f2) {
        return getPxFByDp(f2);
    }

    public static float getPixelBySp(float f2) {
        return getPxFBySp(f2);
    }

    public static double parseDouble(String str) {
        return parseDouble(str, 0.0d);
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(String str) {
        return parseLong(str, 0);
    }

    public static byte[] getBytes(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (Throwable unused) {
            }
        }
        return new byte[0];
    }

    public static int getPixelByDp(int i2) {
        return (int) (getPixelByDp((float) i2) + 0.5f);
    }

    public static int getPixelBySp(int i2) {
        return (int) (getPixelBySp((float) i2) + 0.5f);
    }

    public static int getPxByDp(float f2) {
        return round((double) getPxFByDp(f2));
    }

    public static int getPxBySp(float f2) {
        return round((double) getPxFBySp(f2));
    }

    public static boolean isEmpty(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static int mergeFlag(int... iArr) {
        if (iArr == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 : iArr) {
            i2 |= i3;
        }
        return i2;
    }

    public static boolean notEmpty(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0) {
            return false;
        }
        return true;
    }

    public static String firstNotEmptyString(String... strArr) {
        for (String str : strArr) {
            if (notEmpty(str)) {
                return str;
            }
        }
        return null;
    }

    public static boolean parseBoolean(String str) {
        if ("1".equals(str) || "true".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static <T> T getDefaultValue(Class<T> cls) {
        if (cls == null || cls.isAssignableFrom(String.class)) {
            return "";
        }
        return (cls.isAssignableFrom(Integer.class) || cls.isAssignableFrom(Integer.TYPE) || cls.isAssignableFrom(Short.class) || cls.isAssignableFrom(Short.TYPE)) ? (T) 0 : (cls.isAssignableFrom(Long.class) || cls.isAssignableFrom(Long.TYPE)) ? (T) 0L : (cls.isAssignableFrom(Float.class) || cls.isAssignableFrom(Float.TYPE)) ? (T) Float.valueOf(0.0f) : (cls.isAssignableFrom(Double.class) || cls.isAssignableFrom(Double.TYPE)) ? (T) Double.valueOf(0.0d) : cls.isAssignableFrom(Boolean.class) ? (T) false : "";
    }

    public static Object com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static String getString(int i2, Object... objArr) {
        return getString(null, i2, objArr);
    }

    public static int getColor(Context context, int i2) {
        if (context != null) {
            return context.getResources().getColor(i2);
        }
        return 0;
    }

    public static Drawable getDrawable(Context context, int i2) {
        if (context != null) {
            return context.getResources().getDrawable(i2);
        }
        return null;
    }

    public static double parseDouble(String str, double d2) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            return d2;
        }
    }

    public static int parseInt(String str, int i2) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return round(parseDouble(str, (double) i2));
        }
    }

    public static long parseLong(String str, long j2) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return (long) round(parseDouble(str, (double) j2));
        }
    }

    public static boolean equal(CharSequence charSequence, CharSequence charSequence2) {
        if (isEmpty(charSequence) && isEmpty(charSequence2)) {
            return true;
        }
        if (charSequence == null || !charSequence.equals(charSequence2)) {
            return false;
        }
        return true;
    }

    public static <T> T get(Activity activity, String str, Class<T> cls) {
        return (T) get(activity, str, getDefaultValue(cls));
    }

    public static String getString(Context context, int i2, Object... objArr) {
        if (context != null) {
            return context.getString(i2, objArr);
        }
        return "";
    }

    public static <T> T get(Activity activity, String str, T t) {
        return activity == null ? t : (T) get(activity.getIntent(), str, (Object) t);
    }

    public static <T> T get(Intent intent, String str, Class<T> cls) {
        return (T) get(intent, str, getDefaultValue(cls));
    }

    public static <T> T get(Intent intent, String str, T t) {
        return intent == null ? t : (T) get(com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent), str, (Object) t);
    }

    public static <T> T get(Bundle bundle, String str, Class<T> cls) {
        return (T) get(bundle, str, getDefaultValue(cls));
    }

    public static <T> T get(Bundle bundle, String str, T t) {
        Object com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        if (bundle == null || (com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_get = com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str)) == null) {
            return t;
        }
        T t2 = (T) String.valueOf(com_bytedance_ugc_glue_UGCTools_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
        if (!(t instanceof String)) {
            return t instanceof Integer ? (T) Integer.valueOf(parseInt(t2, t.intValue())) : t instanceof Short ? (T) Integer.valueOf(parseInt(t2, t.shortValue())) : t instanceof Long ? (T) Long.valueOf(parseLong(t2, t.longValue())) : t instanceof Double ? (T) Double.valueOf(parseDouble(t2, t.doubleValue())) : t instanceof Float ? (T) Double.valueOf(parseDouble(t2, (double) t.floatValue())) : t2;
        }
        return t2;
    }
}
