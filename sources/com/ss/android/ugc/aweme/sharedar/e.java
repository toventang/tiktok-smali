package com.ss.android.ugc.aweme.sharedar;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.tools.utils.q;
import com.ss.ugc.effectplatform.model.Effect;
import h.a.af;
import h.a.n;
import h.f.b.l;
import h.j.g;
import h.j.h;
import h.u;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f124495a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(81756);
    }

    public static boolean b(Effect effect) {
        l.d(effect, "");
        return c.a(effect.getSdk_extra(), "share_ar");
    }

    public static String a(Context context) {
        l.d(context, "");
        try {
            Object a2 = a(context, "phone");
            if (a2 != null) {
                String simOperatorName = ((TelephonyManager) a2).getSimOperatorName();
                l.b(simOperatorName, "");
                return simOperatorName;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(Context context) {
        l.d(context, "");
        try {
            Object a2 = a(context, "phone");
            if (a2 != null) {
                String simOperator = ((TelephonyManager) a2).getSimOperator();
                l.b(simOperator, "");
                return simOperator;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String[] a(Effect effect) {
        l.d(effect, "");
        try {
            JSONArray optJSONArray = new JSONObject(effect.getSdk_extra()).optJSONArray("operator");
            if (optJSONArray == null) {
                return new String[0];
            }
            g a2 = h.a(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList(n.a(a2, 10));
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getString(((af) it).a()));
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                StringBuilder sb = new StringBuilder("effect mcc codes: ");
                String arrays = Arrays.toString((String[]) array);
                l.b(arrays, "");
                q.a("SharedAR", sb.append(arrays).toString());
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Exception e2) {
            q.a("SharedAR", e2);
            return new String[0];
        }
    }

    public static u<String, String, String> a(Effect effect, String str) {
        String str2 = "";
        l.d(effect, str2);
        l.d(str, str2);
        try {
            JSONArray optJSONArray = new JSONObject(effect.getSdk_extra()).optJSONArray("operator_info");
            if (optJSONArray == null) {
                return null;
            }
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("code");
                    if (optJSONArray2 != null) {
                        int length2 = optJSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            if (l.a((Object) optJSONArray2.optString(i3), (Object) str)) {
                                String optString = optJSONObject.optString("title");
                                if (optString == null) {
                                    optString = str2;
                                }
                                String optString2 = optJSONObject.optString("desc");
                                if (optString2 == null) {
                                    optString2 = str2;
                                }
                                String optString3 = optJSONObject.optString("icon");
                                if (optString3 != null) {
                                    str2 = optString3;
                                }
                                return new u<>(optString, optString2, str2);
                            }
                        }
                        continue;
                    }
                }
            }
            return null;
        } catch (Exception e2) {
            q.a("SharedAR", e2);
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(10967);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
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
                    MethodCollector.o(10967);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
