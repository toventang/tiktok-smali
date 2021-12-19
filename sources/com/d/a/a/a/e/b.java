package com.d.a.a.a.e;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static WindowManager f46397a;

    /* renamed from: b  reason: collision with root package name */
    public static float f46398b = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: c  reason: collision with root package name */
    private static String[] f46399c = {"x", "y", "width", "height"};

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final float f46400a;

        /* renamed from: b  reason: collision with root package name */
        final float f46401b;

        static {
            Covode.recordClassIndex(28327);
        }

        a(float f2, float f3) {
            this.f46400a = f2;
            this.f46401b = f3;
        }
    }

    static {
        Covode.recordClassIndex(28326);
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException unused) {
            c.b("Error with setting ad session id");
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            c.b("JSONException during JSONObject.put for name [" + str + "]");
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(5955);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(5955);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static JSONObject a(int i2, int i3, int i4, int i5) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) (((float) i2) / f46398b));
            jSONObject.put("y", (double) (((float) i3) / f46398b));
            jSONObject.put("width", (double) (((float) i4) / f46398b));
            jSONObject.put("height", (double) (((float) i5) / f46398b));
        } catch (JSONException unused) {
            c.b("Error with creating viewStateObject");
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject) {
        float f2;
        int i2 = Build.VERSION.SDK_INT;
        float f3 = 0.0f;
        if (f46397a != null) {
            Point point = new Point(0, 0);
            f46397a.getDefaultDisplay().getRealSize(point);
            f3 = ((float) point.x) / f46398b;
            f2 = ((float) point.y) / f46398b;
        } else {
            f2 = 0.0f;
        }
        a aVar = new a(f3, f2);
        try {
            jSONObject.put("width", (double) aVar.f46400a);
            jSONObject.put("height", (double) aVar.f46401b);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f46399c;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    String str = strArr[i2];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i2++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (a(optJSONArray, optJSONArray2)) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= optJSONArray.length()) {
                                    break;
                                } else if (!optJSONArray.optString(i3, "").equals(optJSONArray2.optString(i3, ""))) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (!(optJSONArray3 == null && optJSONArray4 == null)) {
                        if (a(optJSONArray3, optJSONArray4)) {
                            for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                                if (b(optJSONArray3.optJSONObject(i4), optJSONArray4.optJSONObject(i4))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
