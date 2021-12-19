package com.ss.android.ugc.aweme.fe.method;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class SendLogV3Method extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91168a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57375);
    }

    private SendLogV3Method(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57376);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ SendLogV3Method() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public SendLogV3Method(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                HashMap hashMap = new HashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString2 = optJSONObject.optString(next);
                    keys.remove();
                    l.b(next, "");
                    l.b(optString2, "");
                    hashMap.put(next, optString2);
                }
                q.a(optString, hashMap);
                if (aVar != null) {
                    aVar.a(new o());
                }
            } else if (aVar != null) {
                aVar.a(0, "");
            }
        } else if (aVar != null) {
            aVar.a(0, "");
        }
    }
}
