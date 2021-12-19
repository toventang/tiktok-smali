package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.fg;
import org.json.JSONObject;

public class NoticePermissionMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57313);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public NoticePermissionMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        Activity activity;
        Context context = null;
        if (this.mContextRef != null) {
            context = (Context) this.mContextRef.get();
        }
        if ((context instanceof Activity) && (activity = (Activity) context) != null && com.ss.android.ugc.aweme.activity.a.a(activity, true)) {
            Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("toOpen"));
            boolean a2 = fg.a(context);
            if (!a2 && valueOf.booleanValue()) {
                try {
                    fg.c(context);
                } catch (Exception unused) {
                    Intent intent = new Intent("android.settings.SETTINGS");
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                    context.startActivity(intent);
                }
            }
            if (a2) {
                aVar.a("");
            } else {
                aVar.a(0, "");
            }
        }
    }
}
