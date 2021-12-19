package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.ss.android.ugc.aweme.notification.view.template.c;
import com.ss.android.ugc.aweme.utils.SchemaPageHelperImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import org.json.JSONObject;

public final class d implements c {
    static {
        Covode.recordClassIndex(72864);
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.c
    public final void a(com.ss.android.ugc.aweme.notification.view.template.d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.c
    public final boolean a(com.ss.android.ugc.aweme.notification.view.template.f fVar) {
        String valueOf;
        String valueOf2;
        String str = "";
        l.d(fVar, str);
        if (fVar.f114032b == null) {
            return true;
        }
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = a();
        }
        if (!j.f107229h) {
            new b(fVar.f114032b).e(R.string.de8).b();
            return true;
        }
        int id = fVar.f114032b.getId();
        try {
            JSONObject jSONObject = new JSONObject(fVar.f114031a.f112851i);
            String optString = jSONObject.optString("content_schema");
            String optString2 = jSONObject.optString("schema");
            String optString3 = jSONObject.optString("web_url");
            if (id == R.id.dnj) {
                if (!t.a(t.a(), optString2)) {
                    Long l2 = fVar.f114031a.f112843a;
                    if (!(l2 == null || (valueOf2 = String.valueOf(l2.longValue())) == null)) {
                        str = valueOf2;
                    }
                    a(str, optString3);
                }
            } else if (!t.a(t.a(), optString)) {
                Long l3 = fVar.f114031a.f112843a;
                if (!(l3 == null || (valueOf = String.valueOf(l3.longValue())) == null)) {
                    str = valueOf;
                }
                if (!a(str, optString3)) {
                    t.a(t.a(), optString2);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return true;
    }

    private static boolean a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("notice_id", str);
        hashMap.put("aid", String.valueOf(a.C2881a.f112646a));
        hashMap.put("channel", SchemaPageHelperImpl.b().a());
        SchemaPageHelper b2 = SchemaPageHelperImpl.b();
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.ci7);
        if (string == null) {
            string = "";
        }
        l.b(string, "");
        return b2.a(a2, str2, string, hashMap);
    }
}
