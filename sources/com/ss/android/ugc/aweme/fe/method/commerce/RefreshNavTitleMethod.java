package com.ss.android.ugc.aweme.fe.method.commerce;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.web.f;
import h.f.b.l;
import org.json.JSONObject;

public final class RefreshNavTitleMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91253a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final f f91254b;

    static {
        Covode.recordClassIndex(57434);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57435);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public RefreshNavTitleMethod(f fVar) {
        l.d(fVar, "");
        this.f91254b = fVar;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String optString;
        if (jSONObject != null && (optString = jSONObject.optString("title")) != null) {
            this.f91254b.c(optString);
        }
    }
}
