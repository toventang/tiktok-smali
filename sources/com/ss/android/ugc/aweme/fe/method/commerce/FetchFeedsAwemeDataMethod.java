package com.ss.android.ugc.aweme.fe.method.commerce;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.dg;
import org.json.JSONObject;

public final class FetchFeedsAwemeDataMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91250a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57428);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57429);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        if (jSONObject != null) {
            try {
                str = jSONObject.optString("item_id");
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) && aVar != null) {
            aVar.a((Object) new JSONObject().put("aweme", dg.a().b(com.ss.android.ugc.aweme.commerce.service.a.a().getAwemeById(str))));
        }
    }
}
