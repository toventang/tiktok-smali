package com.bytedance.push.i;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.c.i;
import com.bytedance.push.f.a;
import com.kakao.usermgmt.StringSet;
import com.ss.android.pushmanager.setting.b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final i f42200a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f42201b;

    /* renamed from: c  reason: collision with root package name */
    private volatile AtomicBoolean f42202c = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(25788);
    }

    public f(i iVar) {
        this.f42200a = iVar;
    }

    private void a(Context context) {
        if (this.f42202c.compareAndSet(false, true)) {
            b.b();
            a(context, b.d(), false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(boolean r17) {
        /*
        // Method dump skipped, instructions count: 510
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.i.f.a(boolean):void");
    }

    private static void a(Application application, JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String optString = jSONObject.optString("id");
                    String optString2 = jSONObject.optString(StringSet.name);
                    if (!TextUtils.isEmpty(optString)) {
                        if (!TextUtils.isEmpty(optString2)) {
                            arrayList.add(new a(jSONObject));
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            com.bytedance.push.f.f42099a.f().a(application, arrayList);
        }
    }

    private void a(Context context, int i2, String str) {
        com.bytedance.push.f.d().a(i2, str);
        a(context);
    }

    private void a(Context context, String str, boolean z) {
        boolean b2 = com.bytedance.push.third.f.a(context).b(str);
        boolean z2 = false;
        if (z) {
            if (!b2) {
                b.b();
                str = b.d();
                if (!com.bytedance.push.third.f.a(context).b(str)) {
                    com.bytedance.push.f.d().a(false, str);
                    return;
                }
            } else {
                z2 = true;
            }
        }
        com.bytedance.push.third.f.a(str, z2);
        com.bytedance.push.f.d().a(this.f42200a.a(context), str);
    }
}
