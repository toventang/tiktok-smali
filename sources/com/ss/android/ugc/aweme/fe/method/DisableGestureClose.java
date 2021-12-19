package com.ss.android.ugc.aweme.fe.method;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public final class DisableGestureClose extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91034a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57265);
    }

    private DisableGestureClose(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57266);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ DisableGestureClose() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public DisableGestureClose(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("args")) != null) {
            optJSONObject.optInt("disable_gesture");
        }
    }
}
