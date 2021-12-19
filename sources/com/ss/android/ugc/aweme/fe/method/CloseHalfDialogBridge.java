package com.ss.android.ugc.aweme.fe.method;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;
import org.json.JSONObject;

public final class CloseHalfDialogBridge extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57254);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f91028a;

        static {
            Covode.recordClassIndex(57255);
        }

        a(JSONObject jSONObject) {
            this.f91028a = jSONObject;
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        c.a(new a(jSONObject));
    }
}
