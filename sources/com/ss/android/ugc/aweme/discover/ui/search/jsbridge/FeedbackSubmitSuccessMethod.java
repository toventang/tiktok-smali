package com.ss.android.ugc.aweme.discover.ui.search.jsbridge;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class FeedbackSubmitSuccessMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    private static final a f82644a = new a((byte) 0);

    static {
        Covode.recordClassIndex(51467);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class a {
        static {
            Covode.recordClassIndex(51468);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedbackSubmitSuccessMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        c.a(new b());
    }
}
