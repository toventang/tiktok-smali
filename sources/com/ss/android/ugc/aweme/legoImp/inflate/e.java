package com.ss.android.ugc.aweme.legoImp.inflate;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.framework.a.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(68893);
    }

    private static void a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        b.a(str, jSONObject);
    }

    public static View a(String str, View view, Context context, int i2) {
        MethodCollector.i(2819);
        StringBuilder sb = new StringBuilder();
        sb.append(str + "type=" + view.getClass().getName() + "\n").append(str + "id=" + view.getId() + "\n").append(str + "childCount=" + ((ViewGroup) view).getChildCount()).append(str + "isX2COpen=" + f.f107691b);
        a.a(sb.toString());
        a("x2c_error", "", new c().a("x2c_error", sb.toString()).a());
        if (i2 != 0) {
            View inflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) null);
            MethodCollector.o(2819);
            return inflate;
        }
        MethodCollector.o(2819);
        return null;
    }
}
