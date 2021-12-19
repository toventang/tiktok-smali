package com.ss.android.ugc.aweme.bullet.bridge.ad;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.b.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AdThirdTrackMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68859b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68860c = "sendThirdTrack";

    static {
        Covode.recordClassIndex(42426);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42427);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68860c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdThirdTrackMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        JSONArray optJSONArray = jSONObject.optJSONArray("track_url_list");
        String optString = jSONObject.optString("track_label");
        String optString2 = jSONObject.optString("creative_id");
        String optString3 = jSONObject.optString("log_extra");
        String optString4 = jSONObject.optString("ad_id");
        String optString5 = jSONObject.optString("group_id");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            aVar.a(-1, "empty track_url_list");
        } else if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            aVar.a(-1, "empty trackLabel or creativeId");
        } else {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString6 = optJSONArray.optString(i2);
                l.b(optString6, "");
                arrayList.add(optString6);
            }
            l.b(b.a.f65586a, "");
            c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
            if (a2 != null) {
                l.b(optString, "");
                l.b(optString2, "");
                a2.a(optString, arrayList, p.g(optString2), optString3, optString5, optString4);
            }
            aVar.a((Object) null);
        }
    }
}
