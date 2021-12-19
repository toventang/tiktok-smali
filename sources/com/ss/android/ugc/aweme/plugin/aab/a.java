package com.ss.android.ugc.aweme.plugin.aab;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.plugin.a.a;
import com.bytedance.keva.Keva;
import com.bytedance.m.a.d;
import com.bytedance.m.c;
import com.ss.android.ugc.aweme.aabplugin.core.base.o;
import com.ss.android.ugc.aweme.common.r;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class a implements com.bytedance.ies.ugc.aweme.plugin.service.a {
    static {
        Covode.recordClassIndex(74154);
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.a
    public final void b() {
        try {
            ArrayList<String> arrayList = new ArrayList();
            Map<String, com.bytedance.m.b.a> a2 = c.a();
            if (a2 != null) {
                for (com.bytedance.m.b.a aVar : a2.values()) {
                    if (aVar.f41329c == 5) {
                        arrayList.add(d.a().a(aVar.f41327a));
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
            jSONObject.put("name_list", sb.toString());
            r.b("df_installed_modules", jSONObject);
            b.a("df_installed_modules", 0, jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.a
    public final void a() {
        Keva repo;
        if (com.bytedance.ies.ugc.aweme.plugin.b.a.f35118d && Build.VERSION.SDK_INT >= 21 && (repo = Keva.getRepo("dynamic_task_triggered", 0)) != null) {
            for (Map.Entry<String, ?> entry : repo.getAll().entrySet()) {
                String str = (String) entry.getValue();
                if (str != null) {
                    if (TextUtils.equals(str, "com.ss.android.ugc.aweme.dflanguage")) {
                        Locale locale = new Locale(entry.getKey());
                        if (!com.ss.android.ugc.aweme.aabplugin.core.b.a.a(locale)) {
                            a.C0790a aVar = new a.C0790a();
                            aVar.f35065a = false;
                            aVar.f35069e = true;
                            new com.ss.android.ugc.aweme.aabplugin.core.b.a(new com.ss.android.ugc.aweme.aabplugin.core.b.d(locale, true, true, null, aVar.a())).a();
                        }
                    } else if (!o.a(str)) {
                        a.C0790a aVar2 = new a.C0790a();
                        aVar2.f35065a = false;
                        aVar2.f35069e = true;
                        new com.ss.android.ugc.aweme.aabplugin.core.a.a(new com.ss.android.ugc.aweme.aabplugin.core.a.d(str, true, true, null, aVar2.a())).a();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.plugin.service.a
    public final boolean a(Context context) {
        return com.google.android.play.core.d.a.a(context, false);
    }
}
