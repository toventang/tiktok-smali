package com.ss.android.ugc.aweme.account.p.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.cj;
import h.f.b.l;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final a f65267a;

    static {
        Covode.recordClassIndex(40136);
    }

    public e(a aVar) {
        l.d(aVar, "");
        this.f65267a = aVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        int i2;
        String str;
        String str2;
        String str3;
        String secUid;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        if (hVar == null || (jSONObject2 = hVar.f35533d) == null) {
            i2 = 3;
        } else {
            i2 = jSONObject2.optInt("limit");
        }
        List<BaseLoginMethod> a2 = q.a(cj.f71084b.e().allUidList());
        JSONArray jSONArray = new JSONArray();
        for (BaseLoginMethod baseLoginMethod : a2) {
            JSONObject jSONObject4 = new JSONObject();
            CommonUserInfo commonUserInfo = baseLoginMethod.getCommonUserInfo();
            String str4 = "";
            if (commonUserInfo == null || (str2 = commonUserInfo.getAvatarUrl()) == null) {
                str2 = str4;
            }
            jSONObject4.put("avatar", str2);
            CommonUserInfo commonUserInfo2 = baseLoginMethod.getCommonUserInfo();
            if (commonUserInfo2 == null || (str3 = commonUserInfo2.getUserName()) == null) {
                str3 = str4;
            }
            jSONObject4.put("nickname", str3);
            CommonUserInfo commonUserInfo3 = baseLoginMethod.getCommonUserInfo();
            if (!(commonUserInfo3 == null || (secUid = commonUserInfo3.getSecUid()) == null)) {
                str4 = secUid;
            }
            jSONObject4.put("sec_uid", str4);
            jSONObject4.put("uid", baseLoginMethod.getUid());
            jSONArray.put(jSONObject4);
            if (jSONArray.length() >= i2) {
                break;
            }
        }
        jSONObject3.put("data", jSONArray);
        a aVar = this.f65267a;
        if (hVar != null) {
            str = hVar.f35531b;
        } else {
            str = null;
        }
        aVar.a(str, jSONObject3);
    }
}
