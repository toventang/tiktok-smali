package com.bytedance.bdturing.f;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.bdturing.e;
import com.bytedance.bdturing.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import h.f.b.l;
import h.m.p;
import h.w;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(15570);
    }

    public static final int a(Activity activity) {
        if (activity == null) {
            return 0;
        }
        WindowManager windowManager = activity.getWindowManager();
        l.a((Object) windowManager, "");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        l.a((Object) defaultDisplay, "");
        int rotation = defaultDisplay.getRotation();
        g.a("rotation current ".concat(String.valueOf(rotation)));
        int i2 = 2;
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        return 0;
                    }
                }
            }
            i2 = 1;
        }
        e.a(i2);
        return i2;
    }

    public static final String b(Activity activity) {
        if (activity == null) {
            return null;
        }
        Resources resources = activity.getResources();
        l.a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        return new StringBuilder().append(i2).append('*').append(displayMetrics.heightPixels).toString();
    }

    public static final float a(Context context) {
        l.c(context, "");
        try {
            Method declaredMethod = DisplayMetrics.class.getDeclaredMethod("getDeviceDensity", null);
            l.a((Object) declaredMethod, "");
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke != null) {
                return ((float) ((Integer) invoke).intValue()) / 160.0f;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            Context applicationContext = context.getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            l.a((Object) applicationContext, "");
            Resources resources = applicationContext.getResources();
            l.a((Object) resources, "");
            return resources.getDisplayMetrics().density;
        }
    }

    public static final StringBuilder a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str = null;
            try {
                str = jSONObject.getString(next);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            arrayList.add(new Pair(next, str));
        }
        sb.append(com.bytedance.common.utility.l.a(arrayList, "UTF-8"));
        return sb;
    }

    public static final StringBuilder a(String str, JSONObject jSONObject) {
        l.c(str, "");
        l.c(jSONObject, "");
        StringBuilder sb = new StringBuilder(str);
        if (p.a((CharSequence) str, '?', 0, false, 6) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            try {
                str2 = jSONObject.getString(next);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            arrayList.add(new Pair(next, str2));
        }
        sb.append(com.bytedance.common.utility.l.a(arrayList, "UTF-8"));
        return sb;
    }

    public static final StringBuilder a(StringBuilder sb, String str, int i2) {
        l.c(sb, "");
        l.c(str, "");
        return a(sb, str, String.valueOf(i2));
    }

    public static final StringBuilder b(StringBuilder sb, String str, String str2) {
        l.c(sb, "");
        l.c(str, "");
        if (str2 == null) {
            return sb;
        }
        try {
            sb.append(str).append("=").append(URLEncoder.encode(str2, "utf-8"));
        } catch (UnsupportedEncodingException e2) {
            g.a(e2);
        }
        return sb;
    }

    public static final StringBuilder a(StringBuilder sb, String str, String str2) {
        l.c(sb, "");
        l.c(str, "");
        if (str2 == null) {
            return sb;
        }
        try {
            sb.append("&").append(str).append("=").append(URLEncoder.encode(str2, "utf-8"));
        } catch (UnsupportedEncodingException e2) {
            g.a(e2);
        }
        return sb;
    }
}
