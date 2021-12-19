package com.ss.android.ugc.aweme.ecommerce.jsb;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f86155a = new a((byte) 0);

    static {
        Covode.recordClassIndex(53910);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53911);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static JSONObject a(JSONObject jSONObject, Context context) {
            String str;
            if (jSONObject != null) {
                str = jSONObject.optString("schema");
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.ecommerce.service.a.a().prefetchSchema(str, context);
            return new JSONObject();
        }
    }
}
