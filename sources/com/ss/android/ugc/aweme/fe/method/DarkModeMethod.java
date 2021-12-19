package com.ss.android.ugc.aweme.fe.method;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.hg;
import org.json.JSONObject;

public final class DarkModeMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91033a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57263);
    }

    private DarkModeMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57264);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ DarkModeMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public DarkModeMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("enable");
        } else {
            str = null;
        }
        try {
            Object obj = this.mContextRef.get();
            if (obj != null) {
                CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) obj;
                hg.a(crossPlatformActivity, crossPlatformActivity.getWindow(), TextUtils.equals(str, "true"));
                if (aVar != null) {
                    aVar.a(new o());
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
        } catch (Exception unused) {
            if (aVar != null) {
                aVar.a(0, "");
            }
        }
    }
}
