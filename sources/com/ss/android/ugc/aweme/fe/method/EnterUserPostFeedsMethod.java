package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public class EnterUserPostFeedsMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57273);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public EnterUserPostFeedsMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        Activity activity;
        String str;
        Context context = null;
        if (this.mContextRef != null) {
            context = (Context) this.mContextRef.get();
        }
        if ((context instanceof Activity) && (activity = (Activity) context) != null && com.ss.android.ugc.aweme.activity.a.a(activity, true)) {
            String optString = jSONObject.optString("user_id");
            int optInt = jSONObject.optInt("task");
            t a2 = t.a();
            u a3 = u.a("aweme://aweme/detail/0");
            if (TextUtils.equals(b.g().getCurUserId(), optString)) {
                str = "from_profile_self";
            } else {
                str = "from_profile_other";
            }
            t.a(a2, activity, a3.a("video_from", str).a("video_type", 0).a("userid", optString).a("task_type", optInt).f71178a.a());
        }
    }
}
