package com.ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AdThirdTrackMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f144920a = new a((byte) 0);

    static {
        Covode.recordClassIndex(94756);
    }

    private AdThirdTrackMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94757);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ AdThirdTrackMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public AdThirdTrackMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    static final class b extends h.f.b.m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ String $adId;
        final /* synthetic */ String $groupId;

        static {
            Covode.recordClassIndex(94758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, String str2) {
            super(2);
            this.$groupId = str;
            this.$adId = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                bVar2.f74807d = this.$groupId;
                return bVar2;
            }
            String str = this.$adId;
            l.b(str, "");
            return bVar2.c(p.g(str));
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("track_url_list");
            String optString = jSONObject.optString("track_label");
            String optString2 = jSONObject.optString("creative_id");
            String optString3 = jSONObject.optString("log_extra");
            String optString4 = jSONObject.optString("ad_id");
            String optString5 = jSONObject.optString("group_id");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                if (aVar != null) {
                    aVar.a(-1, "empty track_url_list");
                }
            } else if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String optString6 = optJSONArray.optString(i2);
                    l.b(optString6, "");
                    arrayList.add(optString6);
                }
                l.b(optString, "");
                l.b(optString2, "");
                aj.a(optString, arrayList, p.g(optString2), optString3, new b(optString5, optString4));
                if (aVar != null) {
                    aVar.a((Object) null);
                }
            } else if (aVar != null) {
                aVar.a(-1, "empty trackLabel or creativeId");
            }
        }
    }
}
