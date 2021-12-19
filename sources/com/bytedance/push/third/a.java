package com.bytedance.push.third;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.k.e;
import com.ss.android.pushmanager.setting.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;

public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    protected static final Set<Integer> f42352b = new CopyOnWriteArraySet();

    /* renamed from: a  reason: collision with root package name */
    protected Map<Integer, e<c>> f42353a = new HashMap();

    /* access modifiers changed from: protected */
    public abstract void a();

    static {
        Covode.recordClassIndex(25872);
    }

    public a() {
        a();
    }

    public Set<Integer> b() {
        Map<Integer, e<c>> map = this.f42353a;
        if (map == null) {
            return null;
        }
        return map.keySet();
    }

    public JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (Integer num : this.f42353a.keySet()) {
                if (b(num.intValue())) {
                    jSONArray.put(num);
                }
            }
        } catch (Throwable unused) {
            for (Integer num2 : this.f42353a.keySet()) {
                if (num2 instanceof Integer) {
                    Integer num3 = num2;
                    if (b(num3.intValue())) {
                        jSONArray.put(num3);
                    }
                }
            }
        }
        return jSONArray;
    }

    public static boolean c(int i2) {
        Logger.debug();
        Set<Integer> set = f42352b;
        if (set.isEmpty()) {
            b.b();
            a(b.d(), false);
        }
        return set.contains(Integer.valueOf(i2));
    }

    public b a(int i2) {
        c f2 = this.f42353a.get(Integer.valueOf(i2)).f();
        if (f2 == null) {
            return null;
        }
        return f2.b();
    }

    public boolean b(int i2) {
        c f2 = this.f42353a.get(Integer.valueOf(i2)).f();
        if (f2 == null) {
            return false;
        }
        return f2.a();
    }

    public String d(int i2) {
        if (this.f42353a.get(Integer.valueOf(i2)) == null) {
            return "unknown";
        }
        return this.f42353a.get(Integer.valueOf(i2)).f().d();
    }

    public int a(String str) {
        if (this.f42353a == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        for (Integer num : this.f42353a.keySet()) {
            if (str.equals(this.f42353a.get(num).f().c())) {
                return num.intValue();
            }
        }
        return -1;
    }

    public boolean b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!"[]".equals(str)) {
                    JSONArray jSONArray = new JSONArray(str);
                    if (jSONArray.length() > 0) {
                        if (jSONArray.optInt(0) == -9307) {
                            return true;
                        }
                        String jSONArray2 = c().toString();
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            if (jSONArray2.contains(String.valueOf(jSONArray.optInt(i2)))) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void a(String str, boolean z) {
        if (z) {
            b.b();
            b.g().b(str);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                Logger.debug();
                f42352b.clear();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    int optInt = jSONArray.optInt(i2);
                    if (optInt > 0) {
                        f42352b.add(Integer.valueOf(optInt));
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
