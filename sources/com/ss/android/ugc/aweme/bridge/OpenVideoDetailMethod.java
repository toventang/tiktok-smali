package com.ss.android.ugc.aweme.bridge;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class OpenVideoDetailMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68782b = "openVideoDetail";

    static {
        Covode.recordClassIndex(42360);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68782b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenVideoDetailMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.c.c.a.k
    public final void a(JSONObject jSONObject, k.b bVar) {
        ArrayList arrayList;
        l.d(jSONObject, "");
        l.d(bVar, "");
        String optString = jSONObject.optString("question_id");
        String optString2 = jSONObject.optString("question_text");
        JSONArray optJSONArray = jSONObject.optJSONArray("aweme_id_list");
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(optJSONArray.optString(i2));
            }
        } else {
            arrayList = null;
        }
        int optInt = jSONObject.optInt("index");
        jSONObject.optLong("offset");
        jSONObject.optInt("has_more");
        SmartRoute withParam = SmartRouter.buildRoute(e(), "aweme://aweme/detail/").withParam("id", arrayList != null ? (String) n.b((List) arrayList, optInt) : null).withParam("ids", arrayList != null ? n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62) : null);
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        SmartRoute withParam2 = withParam.withParam("userid", g2.getCurUserId());
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        SmartRoute withParam3 = withParam2.withParam("sec_userid", g3.getCurSecUserId()).withParam("enter_from", "eoy_hub").withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "question").withParam("video_from", "from_question").withParam("video_type", 28);
        if (!(optString2 == null || optString2.length() == 0)) {
            withParam3.withParam("question_content", optString2);
            withParam3.withParam("show_answer_question_button", 1);
        }
        withParam3.withParam("question_id", optString).open();
        a.a(bVar, (JSONObject) null);
    }
}
