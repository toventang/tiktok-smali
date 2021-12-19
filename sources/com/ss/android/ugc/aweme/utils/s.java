package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f143186a = new s();

    private s() {
    }

    static {
        Covode.recordClassIndex(93723);
    }

    public static List<String> a(JSONArray jSONArray) {
        Integer num;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                num = Integer.valueOf(jSONArray.length());
            } catch (Exception unused) {
            }
        } else {
            num = null;
        }
        int i2 = 0;
        if (num == null) {
            l.b();
        }
        int intValue = num.intValue();
        if (intValue >= 0) {
            while (true) {
                arrayList.add(jSONArray.getString(i2));
                if (i2 == intValue) {
                    break;
                }
                i2++;
            }
        }
        return arrayList;
    }
}
