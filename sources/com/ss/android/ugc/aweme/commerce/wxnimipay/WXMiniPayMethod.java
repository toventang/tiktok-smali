package com.ss.android.ugc.aweme.commerce.wxnimipay;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public final class WXMiniPayMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f73509a = new a((byte) 0);

    static {
        Covode.recordClassIndex(45242);
    }

    private WXMiniPayMethod(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45243);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ WXMiniPayMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public WXMiniPayMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }
}
