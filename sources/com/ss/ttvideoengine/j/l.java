package com.ss.ttvideoengine.j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public String f152936a;

    /* renamed from: b  reason: collision with root package name */
    public int f152937b;

    /* renamed from: c  reason: collision with root package name */
    public int f152938c;

    /* renamed from: d  reason: collision with root package name */
    public int f152939d;

    /* renamed from: e  reason: collision with root package name */
    public long f152940e;

    /* renamed from: f  reason: collision with root package name */
    public String f152941f;

    /* renamed from: g  reason: collision with root package name */
    public List<String> f152942g;

    /* renamed from: h  reason: collision with root package name */
    public List<String> f152943h;

    /* renamed from: i  reason: collision with root package name */
    public List<String> f152944i;

    static {
        Covode.recordClassIndex(101674);
    }

    public static List<String> a(Object obj, String[] strArr) {
        JSONArray jSONArray;
        int length;
        strArr[0] = null;
        if (obj == null) {
            return null;
        }
        try {
            if (!(obj instanceof JSONArray) || (length = (jSONArray = (JSONArray) obj).length()) == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jSONArray.getString(i2);
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            strArr[0] = jSONArray.toString();
            return arrayList;
        } catch (Exception unused) {
        }
        return null;
    }
}
