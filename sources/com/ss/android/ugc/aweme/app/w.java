package com.ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import h.f.b.l;

public final class w implements a {
    static {
        Covode.recordClassIndex(41206);
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(Exception exc) {
        l.d(exc, "");
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.a
    public final void a(f fVar) {
        l.d(fVar, "");
        if (fVar.aa != null) {
            int size = fVar.aa.size();
            String str = "";
            for (int i2 = 0; i2 < size; i2++) {
                StringBuilder append = new StringBuilder().append(str);
                com.ss.android.ugc.aweme.setting.serverpush.a.a aVar = fVar.aa.get(i2);
                l.b(aVar, "");
                str = append.append(aVar.getLanguageCode()).append(",").toString();
            }
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            aj<String> userAddLanguages = inst.getUserAddLanguages();
            l.b(userAddLanguages, "");
            userAddLanguages.b(str);
            r.a("user_language_set_by_push_setting", new d().a("content_language", str).f66730a);
        }
    }
}
