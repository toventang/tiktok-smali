package com.facebook.a.g;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.a.c;
import com.facebook.a.g.c;
import com.facebook.internal.a.b.a;
import com.facebook.internal.q;
import com.facebook.internal.r;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* access modifiers changed from: package-private */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46802a = c.class.getSimpleName();

    b() {
    }

    static {
        Covode.recordClassIndex(28509);
    }

    private static boolean a(String str) {
        if (a.a(b.class)) {
            return false;
        }
        try {
            q a2 = r.a(str, false);
            if (a2 != null) {
                return a2.f48640a;
            }
            return false;
        } catch (Throwable th) {
            a.a(th, b.class);
            return false;
        }
    }

    private static JSONArray a(List<c> list, String str) {
        if (a.a(b.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            com.facebook.a.c.a.a(list);
            boolean a2 = a(str);
            for (c cVar : list) {
                if (cVar.isChecksumValid() && ((!cVar.getIsImplicit()) || (cVar.getIsImplicit() && a2))) {
                    jSONArray.put(cVar.getJSONObject());
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            a.a(th, b.class);
            return null;
        }
    }

    static Bundle a(c.a aVar, String str, List<com.facebook.a.c> list) {
        if (a.a(b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(list);
            Bundle bundle = new Bundle();
            bundle.putString("event", aVar.toString());
            bundle.putString("app_id", str);
            if (c.a.CUSTOM_APP_EVENTS == aVar) {
                JSONArray a2 = a(arrayList, str);
                if (a2.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", a2.toString());
            }
            return bundle;
        } catch (Throwable th) {
            a.a(th, b.class);
            return null;
        }
    }
}
