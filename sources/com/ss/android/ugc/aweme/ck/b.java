package com.ss.android.ugc.aweme.ck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.a.a;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public String f71110a;

    /* renamed from: b  reason: collision with root package name */
    public c f71111b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f71112c;

    /* renamed from: d  reason: collision with root package name */
    private Context f71113d;

    /* renamed from: e  reason: collision with root package name */
    private Class<? extends Activity> f71114e;

    /* renamed from: f  reason: collision with root package name */
    private String f71115f;

    static {
        Covode.recordClassIndex(43770);
    }

    @Override // com.ss.android.ugc.aweme.ck.j
    public final boolean c(String str) {
        return b(null, str);
    }

    private static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                str = "empty url";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("service", "in_app_router_no_matched");
            jSONObject.put("open_url", str);
            com.bytedance.apm.b.a("common_log", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void a(Context context, Intent intent) {
        a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.ck.j
    public final boolean a(Activity activity, String str) {
        return b(activity, str);
    }

    private static void a(Intent intent, String str) {
        HashMap hashMap;
        if (TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
        } else {
            Uri parse = Uri.parse(str);
            hashMap = new HashMap();
            for (String str2 : parse.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(parse.getQueryParameter(str2))) {
                    hashMap.put(str2, str2);
                }
            }
        }
        for (String str3 : hashMap.keySet()) {
            b(intent, str3, v.b(str, (String) hashMap.get(str3)));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r9 != null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.app.Activity r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ck.b.b(android.app.Activity, java.lang.String):boolean");
    }

    public b(Context context, String str, Class<? extends Activity> cls) {
        this.f71113d = context;
        this.f71110a = str;
        this.f71114e = cls;
    }

    private static void a(Intent intent, String str, String str2) {
        List<String> a2 = v.a(str);
        List<String> a3 = v.a(str2);
        int size = a2.size();
        for (int i2 = 1; i2 < size; i2++) {
            if (i2 < size) {
                intent.putExtra(a2.get(i2).substring(1), a3.get(i2));
            }
        }
    }

    private static void b(Intent intent, String str, String str2) {
        r rVar = t.a().f71171c;
        if (rVar != null) {
            if (r.a(rVar.f71154a, str)) {
                intent.putExtra(str, Integer.parseInt(str2));
            } else if (r.a(rVar.f71155b, str)) {
                intent.putExtra(str, Long.parseLong(str2));
            } else if (r.a(rVar.f71156c, str)) {
                intent.putExtra(str, Boolean.parseBoolean(str2));
            } else if (r.a(rVar.f71157d, str)) {
                intent.putExtra(str, Short.parseShort(str2));
            } else if (r.a(rVar.f71158e, str)) {
                intent.putExtra(str, Float.parseFloat(str2));
            } else if (r.a(rVar.f71159f, str)) {
                intent.putExtra(str, Double.parseDouble(str2));
            } else if (r.a(rVar.f71160g, str)) {
                intent.putExtra(str, Byte.parseByte(str2));
            } else if (r.a(rVar.f71161h, str)) {
                intent.putExtra(str, str2.charAt(0));
            } else {
                r.a(rVar.f71162i, str);
                intent.putExtra(str, str2);
            }
        }
    }
}
