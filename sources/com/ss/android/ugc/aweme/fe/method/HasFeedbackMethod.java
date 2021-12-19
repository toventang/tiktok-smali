package com.ss.android.ugc.aweme.fe.method;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feedback.reply.d;
import org.json.JSONObject;

public final class HasFeedbackMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91059a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57283);
    }

    private HasFeedbackMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57284);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ HasFeedbackMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public HasFeedbackMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        Keva a2 = d.a();
        if (a2 != null) {
            a2.storeBoolean("has", true);
        }
    }
}
