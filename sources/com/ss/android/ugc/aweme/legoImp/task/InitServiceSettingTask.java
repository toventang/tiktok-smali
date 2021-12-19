package com.ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.aq.a.a;
import com.ss.android.ugc.aweme.y.c;
import h.f.b.l;
import org.json.JSONObject;

public final class InitServiceSettingTask extends BaseInitServiceSettingTask {
    static {
        Covode.recordClassIndex(69019);
    }

    @Override // com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask, com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return "InitServiceSettingTask";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.legoImp.task.BaseInitServiceSettingTask
    public final void a(JSONObject jSONObject) {
        super.a(jSONObject);
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("aweme_activity_setting");
            if (optJSONObject != null) {
                try {
                    c cVar = (c) new f().a(optJSONObject.toString(), c.class);
                    if (cVar != null) {
                        a.f66967d = cVar;
                    }
                } catch (Exception unused) {
                }
                s sVar = s.a.f66880a;
                l.b(sVar, "");
                sVar.u().b(optJSONObject.toString());
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.aq.b.a());
                return;
            }
            s sVar2 = s.a.f66880a;
            l.b(sVar2, "");
            sVar2.u().b("");
        }
    }
}
